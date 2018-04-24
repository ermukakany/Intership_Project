package com.example.emukakan.ingeropapptest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.loopj.android.http.RequestParams;

import org.json.JSONObject;

public class MainActivity extends Activity {

    private ImageView a_logoIng;
    private Button a_btnfiles, a_btncpt,a_btnsignin;
    private TextView a_exists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acc_activity_main);


       a_logoIng = findViewById ( R.id.logoIng );
       a_btnfiles = findViewById ( R.id.btnfiles );
       a_btncpt = findViewById ( R.id.btncpt );
       a_btnsignin = findViewById ( R.id.btnsignin );
       a_exists = findViewById(R.id.account_exists);

       //connecter sur la page  seconnecter

        a_btnsignin.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                if(v.getId() == R.id.btnsignin)
                {
                    Intent acceuilInt = new Intent(MainActivity.this, AccActivityMain.class);
                    MainActivity.this.startActivity(acceuilInt);
                }
            }
        } );
    }
}
