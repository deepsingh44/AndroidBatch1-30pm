package com.deepsingh44.vishufirsthelloapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Database extends SQLiteOpenHelper {

    //1.Android provide a database for storing your data into
    // local machine in tabular format.
    //2.It is an open source database and you dont need to setup
    //this database.
    //3.you need to create a custom class that must extends a class
    //that name is SQLiteOpenHelper.
    //4.SQLiteOpenHelper class provide two methods onCreate() and onUpgrade()
    //using that we can create a table or upgrade a table.
    //5.SQLiteOpenHelper constructor is parameterized so you need to use super constructor
    //to pass that arguments that is context,"database name",null,1.
    //6.Create table from onCreate() method because it provide SQLiteDatabase
    // object that have all the methods using that we can store or fetch information from SQLiteDatabase.

    private static final String DATABASE_NAME = "college";
    private static final String TABLE_NAME = "student";
    private static final String ROll = "roll";
    private static final String NAME = "name";
    private static final String MARKS = "marks";

    private static final String CREATE_QUERY = "create table " + TABLE_NAME + " (" + ROll + " int primary key," + NAME + " varchar(30)," + MARKS + " float);";


    private static final int VERSION = 1;

    public Database(@Nullable Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_QUERY);
       /* db.execSQL(CREATE_QUERY);
        db.execSQL(CREATE_QUERY);
        db.execSQL(CREATE_QUERY);
        db.execSQL(CREATE_QUERY);*/
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + TABLE_NAME + "");
        onCreate(db);
    }

   /* getWritableDatabase();
    getReadableDatabase();*/

    //insert data
    public long insert(Student student) {
        ContentValues cv = new ContentValues();
        cv.put(ROll, student.getRoll());
        cv.put(NAME, student.getName());
        cv.put(MARKS, student.getMarks());
        return getWritableDatabase().insert(TABLE_NAME, null, cv);
    }

    //fetch data
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        Cursor cursor = getReadableDatabase().query(TABLE_NAME, null, null, null, null, null, null);
        while (cursor.moveToNext()) {
            Student student = new Student();
            student.setRoll(cursor.getInt(0));
            student.setName(cursor.getString(1));
            student.setMarks(cursor.getFloat(2));
            students.add(student);
        }
        return students;
    }

}
