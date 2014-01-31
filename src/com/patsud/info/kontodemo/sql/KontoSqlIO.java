package com.patsud.info.kontodemo.sql;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Comment;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public  class KontoSqlIO {
	// Database fields
	  private SQLiteDatabase database;
	  private KontoSqlHelper dbHelper;
	  private String[] allColumns = { KontoSqlHelper.KEY_ROWID,
			  KontoSqlHelper.KUNDENNUMMER_ID,
			  KontoSqlHelper.KUNDENNAME_ID,
			  KontoSqlHelper.KONTOTYP_ID,
			  KontoSqlHelper.KONTOSTAND_ID,
			  };

	  public KontoSqlIO(Context context) {
	    dbHelper = new KontoSqlHelper(context);
	  }

	  public void open() throws SQLException {
	    database = dbHelper.getWritableDatabase();
	  }

	  public void close() {
	    dbHelper.close();
	  }
	  
	  public void createKonto(String name, int nummer, String typ, double stand){
		  ContentValues values = new ContentValues();
		  values.put(KontoSqlHelper.KUNDENNAME_ID, name);
		  values.put(KontoSqlHelper.KUNDENNUMMER_ID, nummer);
		  values.put(KontoSqlHelper.KONTOTYP_ID, typ);
		  values.put(KontoSqlHelper.KONTOSTAND_ID, stand);
		  
		  long instertId;
		  instertId = database.insert(KontoSqlHelper.DATABASE_TABLE, null, values);
		  
		  Cursor cursor;
		  cursor = database.query(KontoSqlHelper.DATABASE_TABLE, allColumns, KontoSqlHelper.KEY_ROWID + " = "+instertId, null, null, null, null);
		  cursor.moveToFirst();
//		  KontoSqlHandler handler = setn
				   
	  }
}

//	  public Comment createComment(String comment) {
//	    ContentValues values = new ContentValues();
//	    values.put(KontoSqlHelper.COLUMN_COMMENT, comment);
//	    long insertId = database.insert(MySQLiteHelper.TABLE_COMMENTS, null,
//	        values);
//	    Cursor cursor = database.query(MySQLiteHelper.TABLE_COMMENTS,
//	        allColumns, MySQLiteHelper.COLUMN_ID + " = " + insertId, null,
//	        null, null, null);
//	    cursor.moveToFirst();
//	    Comment newComment = cursorToComment(cursor);
//	    cursor.close();
//	    return newComment;
//	  }

//	  public void deleteComment(Comment comment) {
//	    long id = comment.getId();
//	    System.out.println("Comment deleted with id: " + id);
//	    database.delete(MySQLiteHelper.TABLE_COMMENTS, MySQLiteHelper.COLUMN_ID
//	        + " = " + id, null);
//	  }
//
//	  public List<Comment> getAllComments() {
//	    List<Comment> comments = new ArrayList<Comment>();
//
//	    Cursor cursor = database.query(MySQLiteHelper.TABLE_COMMENTS,
//	        allColumns, null, null, null, null, null);
//
//	    cursor.moveToFirst();
//	    while (!cursor.isAfterLast()) {
//	      Comment comment = cursorToComment(cursor);
//	      comments.add(comment);
//	      cursor.moveToNext();
//	    }
//	    // make sure to close the cursor
//	    cursor.close();
//	    return comments;
//	  }
//
//	  private Comment cursorToComment(Cursor cursor) {
//	    Comment comment = new Comment();
//	    comment.setId(cursor.getLong(0));
//	    comment.setComment(cursor.getString(1));
//	    return comment;
//	  }
//	} 