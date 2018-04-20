package com.example.emukakan.ingeropapptest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class AccActivityMain extends Activity {

    private Button createcpt, files,signin;
    private ImageView logoIng;
    private TextView account_exists;
   RequestQueue queue;

    String InsertQueries = "http://10.22.6.206/IngeropAndroidBdd/InsertQueries.php";
    String SelectQueries  =  "http://10.22.6.206/IngeropAndroidBdd/SelectQueries.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView(R.layout.acc_activity_main);

        createcpt = findViewById ( R.id.createcpt );
        files = findViewById ( R.id.files );
        signin = findViewById ( R.id.signin );
        account_exists = findViewById ( R.id.account_exists );
        logoIng =  findViewById ( R.id.logoIng );

        queue = Volley.newRequestQueue(this);

        /*signin.setOnClickListener(new View.OnClickListener (){
            @Override
            public void onClick(View v) {
                JsonObjectRequest jsonreq = new JsonObjectRequest ( Request.Method.POST, SelectQueries, new Response.Listener<JSONObject>(){

                    @Override
                    public void onResponse(JSONObject response) {
                            try {
                                JSONArray users = response.getJSONArray ( "utilisateur" );
                                for (int i = 0; i< users.length(); i++){

                                    JSONObject user = users.getJSONObject(i);

                                    String lastname = user.getString ("nom");
                                    String firstname = user.getString ("prenom");
                                    String pseudo = user.getString ("pseudo");
                                    String email = user.getString ("email");
                                    String mdp = user.getString ("mdp");
                                    String fonction = user.getString ("fonction");

                                    account_exists.append ( lastname+" "+firstname+" "+pseudo+" "+email+" "+mdp+" "+fonction+"\n" );
                                }
                                account_exists.append ("===\n" );
                            } catch (JSONException e) {
                                e.printStackTrace ();
                            }

                     }
                },new Response.ErrorListener (){

                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });
            }
        });*/
    }
}
