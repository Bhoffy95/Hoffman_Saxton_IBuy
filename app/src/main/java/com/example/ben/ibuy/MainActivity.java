package com.example.ben.ibuy;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.ben.ibuy.DBHelper;

import java.util.ArrayList;

/**
 * Created by Ben on 11/15/2017.
 */

public class MainActivity extends AppCompatActivity {
    //SQLiteDatabase myDb;
    private String username;
    private String password;
    private Button login_button;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //myDb = new DBHelper(this).getWritableDatabase();
        Button button = (Button) findViewById(R.id.login_button);
        button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view){
                     Intent intent = new Intent(getApplicationContext(), ListPage.class);
                    //myDb.close();
                    startActivity(intent);
                }
        });

        Button signup = (Button) findViewById(R.id.signup_button);
        signup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent s_intent = new Intent(getApplicationContext(), signup.class);
                startActivity(s_intent);
            }

        });
    }
}

