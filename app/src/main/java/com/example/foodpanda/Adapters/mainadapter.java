package com.example.foodpanda.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.foodpanda.Models.mainmodel;
import com.example.foodpanda.R;

import java.util.ArrayList;
import java.util.List;

public class mainadapter extends ArrayAdapter {
    private Context context;
    private int layout;
    private ArrayList<mainmodel> data;
    public mainadapter(@NonNull Context context, int resource, @NonNull ArrayList<mainmodel> objects) {
        super(context, resource, objects);
        this.context=context;
        layout=resource;
        data=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ImageView dish;
        TextView name, price, discription;
        View view;
        LayoutInflater inflater= LayoutInflater.from(context);
        view=inflater.inflate(layout,parent,false);
        dish=view.findViewById(R.id.imageView);
        name=view.findViewById(R.id.name);
        price=view.findViewById(R.id.price);
        discription=view.findViewById(R.id.description);
        mainmodel w=data.get(position);
        dish.setImageResource(w.getImage());
        price.setText(w.price);
        name.setText(w.name);
        discription.setText(w.discription);
        return view;
    }
}

