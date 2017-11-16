package com.example.ben.ibuy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.lang.Object;

/**
 * Created by Ben on 11/15/2017.
 */

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        Button button = (Button) findViewById(R.id.confirm_button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                EditText password1 = (EditText) findViewById(R.id.pass1_field);
                EditText password2 = (EditText) findViewById(R.id.pass2_field);
                EditText username = (EditText) findViewById(R.id.username_field);
                EditText email = (EditText) findViewById(R.id.email_field);
                String pass1 = String.valueOf(password1.getText());
                Log.d("pass1", pass1);
                String pass2 = String.valueOf(password2.getText());
                Log.d("pass2", pass2);
                String user = String.valueOf(username.getText());
                String email1 = String.valueOf(email.getText());
                if(pass1.equals(pass2) && pass1 != null && user != null && email1 != null) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }
                else{username.setText(R.string.Error_Signup);}
            }
        });

    }
}
