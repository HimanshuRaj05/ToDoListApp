package com.intreve.todolistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.intreve.todolistapp.Adapters.TaskAdapter;
import com.intreve.todolistapp.Models.TaskModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    ImageView btnAdd;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
        btnAdd=findViewById(R.id.btnAdd);
        recyclerView=findViewById(R.id.recyclerView);


        ArrayList<TaskModel> list= new ArrayList<>();


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String taskName=editText.getText().toString();

                list.add(new TaskModel(taskName));
                TaskAdapter adapter= new TaskAdapter(list,MainActivity.this);
                recyclerView.setAdapter(adapter);
            }



        });

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);







    }
}