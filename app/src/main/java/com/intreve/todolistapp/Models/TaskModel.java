package com.intreve.todolistapp.Models;

public class TaskModel {
    String taskText;

    public TaskModel(String taskText){
        this.taskText=taskText;
    }

    public String getTaskText() {
        return taskText;
    }

    public void setTaskText(String taskText) {
        this.taskText = taskText;
    }
}
