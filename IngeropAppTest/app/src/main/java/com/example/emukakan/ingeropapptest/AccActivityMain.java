package com.example.emukakan.ingeropapptest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Header;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestHandle;
import com.loopj.android.http.RequestParams;

import org.json.JSONArray;
import org.json.JSONObject;

public class AccActivityMain extends Activity {

    private EditText ed_User;
    private EditText ed_pwd;
    private Button but_Log;
    private ImageView img_Logo;
    private TextView txt_pwdO;
    String u,p;
    RequestParams params;
    AsyncHttpClient client;
    String myURL = "http://10.22.6.206:8080/AndroidLogin/Register";

    //connecter phone with web en javaee

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView(R.layout.activity_main);

        ed_User = findViewById ( R.id. edUser);
        ed_pwd = findViewById ( R.id.edpwd );
        but_Log = findViewById ( R.id.butsubmit );
        img_Logo = findViewById ( R.id.imgLogo);
        txt_pwdO=  findViewById ( R.id.txtvpwdO );

        but_Log.setOnClickListener (new View.OnClickListener (){

            @Override
            public void onClick(View v) {
                u = ed_User.getText ().toString ();
                p = ed_pwd.getText ().toString ();
                params= new RequestParams ();
                params.put("k1",u);
                params.put("k2",p);

                client = new AsyncHttpClient ();
                client.post ( "myURL", params, new JsonHttpResponseHandler () {

                    @Override
                    public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, JSONObject response) {
                        super.onSuccess ( statusCode, headers, response );
                            Toast.makeText ( AccActivityMain.this,"Info validé"+response, Toast.LENGTH_SHORT ).show ();
                    }

                    @Override
                    public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, Throwable throwable, JSONObject errorResponse) {
                        super.onFailure ( statusCode, headers, throwable, errorResponse );

                        Toast.makeText ( AccActivityMain.this,"Utilisateur ou mot de passe erroné !", Toast.LENGTH_SHORT ).show ();
                    }
                } );

            }
        });

       //connecter à la base de données mysql avec javaee

    }
}
