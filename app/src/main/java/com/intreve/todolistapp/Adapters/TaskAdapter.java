package com.intreve.todolistapp.Adapters;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.intreve.todolistapp.Models.TaskModel;
import com.intreve.todolistapp.R;

import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.viewHolder> {

    ArrayList<TaskModel> list;
    Context context;

    public TaskAdapter(ArrayList<TaskModel> list, Context context){
        this.list=list;
        this.context=context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.sample_recyclerview,parent,false);
       return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        TaskModel model=list.get(position);
        holder.textView.setText(model.getTaskText());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        CheckBox checkBox;
        TextView textView;
        ImageView btnDelete;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            checkBox=itemView.findViewById(R.id.checkBox);
            textView=itemView.findViewById(R.id.textView);
            btnDelete=itemView.findViewById(R.id.btnDelete);
        }
    }

}
