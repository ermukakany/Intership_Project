package com.example.emukakan.ingeropapptest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONObject;

public class MainActivity extends Activity {
    private EditText usernameField,passwordField;
    private TextView status,role,method,mdpoubl;
    JSONObject jsonobject;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameField = (EditText)findViewById(R.id.editText4);
        passwordField = (EditText)findViewById(R.id.editText5);
        //jsonobject = JSONfunctions.getJSONfromURL("http://http://ingerop.com");
       /* status = (TextView)findViewById(R.id.textView6);
        role = (TextView)findViewById(R.id.textView7);
        method = (TextView)findViewById(R.id.textView9);*/
        mdpoubl = (TextView)findViewById(R.id.textView3);
    }
}
