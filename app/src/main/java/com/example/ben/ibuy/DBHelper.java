package com.example.ben.ibuy;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Ben on 11/15/2017.
 */

public class DBHelper extends SQLiteOpenHelper {

    public static final String db_name = "iBuy.db";
    public static final String Table_name = "list";
    public static final String user_table = "users";


    public DBHelper(Context context){
        super(context, db_name, null, 1);
        Log.d("DBHelper","DBHelper Called Success...\n");

    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        Log.d("DBHelper","SQL database create table executing...\n");
        db.execSQL("create table " + Table_name + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, ITEM)");
        db.execSQL("CREATE TABLE " + user_table + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, USERNAME, EMAIL, PASSWORD)");
        Log.d("DBHelper","SQL database create table executed...\n");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int j) {
        db.execSQL("DROP TABLE IF EXISTS " + Table_name);
        onCreate(db);
    }
}
