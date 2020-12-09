package com.deepsingh44.vishufirsthelloapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.MyViewHolder> {
    private List<Student> students;

    public StudentAdapter(List<Student> students) {
        this.students = students;
    }

    //attach your item view here
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MyViewHolder(view);
    }

    //bind data in view here
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Student student = students.get(position);
        holder.tname.setText(student.getName());
        //holder.temail.setText(student.getEmail());
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    //this class contains your Item View objects
    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tname, temail;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tname = itemView.findViewById(R.id.name);
            temail = itemView.findViewById(R.id.email);
        }
    }
}
