package com.example.michaeljosephdescalzo.fragmentrestoretest5;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by michaeljosephdescalzo on 9/18/16.
 */
public class DBClass extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "viewStorage.db";
    public static final String VIEW_STORAGE_TABLE_NAME = "view_storage";
    public static final String VIEW_STORAGE_COLUMN_ID = "id";
    public static final String VIEW_STORAGE_COLUMN_VIEW_ID = "view_id";
    public static final String VIEW_STORAGE_COLUMN_TYPE = "type";
    public static final String VIEW_STORAGE_COLUMN_TEXT = "text";

    public DBClass(Context context){
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase){
        sqLiteDatabase.execSQL(
                "create table " +
                VIEW_STORAGE_TABLE_NAME +
                " (" + VIEW_STORAGE_COLUMN_ID + " integer primary key, " +
                VIEW_STORAGE_COLUMN_VIEW_ID + " integer, " +
                VIEW_STORAGE_COLUMN_TYPE + " text, " +
                VIEW_STORAGE_COLUMN_TEXT + " text)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion){
        sqLiteDatabase.execSQL(
                "DROP IF TABLE EXISTS " + VIEW_STORAGE_TABLE_NAME
        );
    }

    public void insertView(int viewId, String type, String text){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(VIEW_STORAGE_COLUMN_VIEW_ID, viewId);
        contentValues.put(VIEW_STORAGE_COLUMN_TYPE, type);
        contentValues.put(VIEW_STORAGE_COLUMN_TEXT, text);
        sqLiteDatabase.insert(VIEW_STORAGE_TABLE_NAME, null, contentValues);
    }

    public Integer countAll(){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        Cursor res = sqLiteDatabase.rawQuery("select count(*) from view_storage", null);
        res.moveToFirst();
        return res.getInt(0);
    }

    public void deleteAll(){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        sqLiteDatabase.execSQL(
                "DELETE FROM " + VIEW_STORAGE_TABLE_NAME
        );
    }

    public Cursor getAllData(){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        Cursor res = sqLiteDatabase.rawQuery(
                "select * from " + VIEW_STORAGE_TABLE_NAME, null
        );
        return res;
    }

}
