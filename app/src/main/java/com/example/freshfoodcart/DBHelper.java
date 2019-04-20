package com.example.freshfoodcart;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class DBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "EMPLOYEE_DB";
    private static final String TABLE_NAME = "Employee_table";
    private static final String COL_1 = "ID";
    private static final String COL_2 = "NAME";
    private static final String COL_3 = "PASSWORD";
    private static final String COL_4 = "EMAIL";

    DBHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "" + "(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT, PASSWORD TEXT, EMAIL TEXT)");

    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    boolean insetData(String name, String password, String email) {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,password);
        contentValues.put(COL_4,email);
        long result=db.insert(TABLE_NAME,null,contentValues);
        return result != -1;
    }
    int Authenticate(String email, String password){

        int id=-1;
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery("SELECT ID " +
                "FROM Employee_table WHERE EMAIL=? AND PASSWORD=?",new String[]{email,password});
        if(cursor.getCount()>0) {
            cursor.moveToFirst();
            id=cursor.getInt(0);
            cursor.close();
        }
        return id;

    }

}