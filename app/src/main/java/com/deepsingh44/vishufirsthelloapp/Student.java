package com.deepsingh44.vishufirsthelloapp;

public class Student {
    private int roll;
    private String name;
    private float marks;
    private String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Student(){

    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
