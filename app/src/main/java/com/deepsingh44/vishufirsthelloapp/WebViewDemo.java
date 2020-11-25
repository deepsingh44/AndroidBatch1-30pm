package com.deepsingh44.vishufirsthelloapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class WebViewDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_demo);
        //you need to get object of recycler view
        RecyclerView recyclerView = findViewById(R.id.myrecyclerview);
        //you need to define layout Linear or Grid
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        //recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        //call dummy data
        dummyData();

        //create a custom adapter to compose data in particular textView
        StudentAdapter studentAdapter = new StudentAdapter(students);
        recyclerView.setAdapter(studentAdapter);
    }

    List<Student> students = new ArrayList<>();

    private void dummyData() {
        Student s1 = new Student("Abhishek Singh", "a@gmail.com");
        Student s2 = new Student("Sonu Singh", "b@gmail.com");
        Student s3 = new Student("Monu Singh", "c@gmail.com");
        Student s4 = new Student("Shyam Singh", "d@gmail.com");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s4);
        students.add(s4);
        students.add(s4);
    }

}