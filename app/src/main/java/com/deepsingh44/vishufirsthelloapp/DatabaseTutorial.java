package com.deepsingh44.vishufirsthelloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DatabaseTutorial extends AppCompatActivity {
    private EditText tname, troll, tmarks;
    private Database database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_tutorial);
        database = new Database(this);
        troll = findViewById(R.id.roll);
        tname = findViewById(R.id.name);
        tmarks = findViewById(R.id.marks);
    }

    public void addStudent(View view) {

        String roll = troll.getText().toString();
        String name = tname.getText().toString();
        String marks = tmarks.getText().toString();

        Student student = new Student();
        student.setRoll(Integer.parseInt(roll));
        student.setName(name);
        student.setMarks(Float.parseFloat(marks));

        long t=database.insert(student);
        if(t>0){
            Toast.makeText(this, "Successfully add", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "added failed", Toast.LENGTH_SHORT).show();
        }

    }
}