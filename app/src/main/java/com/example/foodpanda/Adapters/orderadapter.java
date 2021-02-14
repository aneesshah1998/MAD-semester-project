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


import com.example.foodpanda.Models.ordermodel;
import com.example.foodpanda.R;

import java.util.ArrayList;

public class orderadapter extends ArrayAdapter {
    private Context context;
    private int layout;
    private ArrayList<ordermodel> dataa;
    public orderadapter(@NonNull Context context, int resource, @NonNull ArrayList<ordermodel> objects) {
        super(context, resource, objects);
        this.context=context;
        layout=resource;
        dataa=objects;
    }

    public orderadapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ImageView dish;
        TextView name, price, discription;
        View view;
        LayoutInflater inflater= LayoutInflater.from(context);
        view=inflater.inflate(layout,parent,false);
        dish=view.findViewById(R.id.orderdish);
        name=view.findViewById(R.id.order_item);
        price=view.findViewById(R.id.orderquantity);
        ordermodel m=dataa.get(position);
        dish.setImageResource(m.getOrderimage());
        price.setText(m.orderprice);
        name.setText(m.ordername);
        return view;
    }
}

