package com.patsud.info.kontodemo.sql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class KontoSqlHelper extends SQLiteOpenHelper {

	public static final String KEY_ROWID = "_id";
	public static final String KUNDENNUMMER_ID = "kundennummer";
	public static final String KUNDENNAME_ID = "name";
	public static final String KONTOTYP_ID = "kontotyp";
	public static final String KONTOSTAND_ID = "kontostand";
	public static final String DATABASE_TABLE = "kontosTable";

	private static final String DATABASE_NAME = "kontos";
	private static final int DATABASE_VERSION = 1;

	// Database creation sql statement
	private static final String DATABASE_CREATE = "CREATE TABLE "
			+ DATABASE_TABLE + " (" + KEY_ROWID
			+ " INTEGER PRIMARY KEY AUTOINCREMENT, " + KUNDENNUMMER_ID
			+ " INTEGER, " + KUNDENNAME_ID + " TEXT NOT NULL, " + KONTOTYP_ID
			+ " TEXT NOT NULL, " + KONTOSTAND_ID + " INTEGER" + ";";

	public KontoSqlHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase database) {
		database.execSQL(DATABASE_CREATE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		Log.w(KontoSqlHelper.class.getName(),
				"Upgrading database from version " + oldVersion + " to "
						+ newVersion + ", which will destroy all old data");
		db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE);
		onCreate(db);
	}

}