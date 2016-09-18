package com.example.michaeljosephdescalzo.fragmentrestoretest3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by michaeljosephdescalzo on 9/15/16.
 */
public class DBClass extends SQLiteOpenHelper{

    public static final String DATABASE_NAME = "viewStorage.db";
    public static final String VIEW_STORAGE_TABLE_NAME = "view_storage";
    public static final String VIEW_STORAGE_COLUMN_ID = "id";
    public static final String VIEW_STORAGE_COLUMN_TEXT = "text";

    public DBClass(Context context){
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(
                "create table view_storage" +
                "(id integer primary key, text text)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(
                "DROP IF TABLE EXISTS view_storage"
        );
    }

    public boolean insertView(String text){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("text", text);
        sqLiteDatabase.insert("view_storage", null, contentValues);
        return true;
    }

    public Integer countAll(){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        Cursor res = sqLiteDatabase.rawQuery("select count(*) from view_storage", null);
        res.moveToFirst();
        return res.getInt(0);
    }
	
	public void deleteAll(){

		SQLiteDatabase sqliteDatabase = this.getWritableDatabase();
		sqliteDatabase.execSQL(
			"DELETE FROM view_storage"
		);
		return;
	}
}
