package com.deepsingh44.vishufirsthelloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

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

        /*String roll = troll.getText().toString();
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
        }*/

        //fetch all student
        /*List<Student> students = database.getAllStudents();
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            Log.e("error", s.getRoll() + "\t" + s.getName() + "\t" + s.getMarks());
        }*/

        //fetch single data
        /*Student s=database.getStudent(4);
        Log.e("error", s.getRoll() + "\t" + s.getName() + "\t" + s.getMarks());*/

        //delete data
       /* long t=database.delete(4);
        if(t>0){
            Toast.makeText(this, "Successfully deleted", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "deleted failed", Toast.LENGTH_SHORT).show();
        }*/

       /* Student st = database.getStudent(2);
        st.setName("Monu");
        database.update(st);*/

        List<Student> students = database.getAllStudents();
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            Log.e("error", s.getRoll() + "\t" + s.getName() + "\t" + s.getMarks());
        }
    }
}