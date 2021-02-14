package com.example.foodpanda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.foodpanda.Adapters.mainadapter;
import com.example.foodpanda.Adapters.orderadapter;
import com.example.foodpanda.Models.mainmodel;
import com.example.foodpanda.Models.ordermodel;
import com.example.foodpanda.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class orders extends AppCompatActivity {
    private ArrayList<ordermodel> listt;
    ListView listView;
    Intent intent;
    ordermodel mydata = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        listView = findViewById(R.id.orderlistview);
        TextView textView= findViewById(R.id.orderquantity);
        String qun=intent.getStringExtra("quantity");
        textView.setText(qun);

       //  Intent intent = getIntent();
        //String position = intent.getStringExtra("Position");

        listt= new ArrayList<>();
        listt.add(new ordermodel(R.drawable.bamboo,"bamboo","10","5267"));
        listt.add(new ordermodel(R.drawable.bamboo,"bamboo","10","5267"));
        orderadapter myadapter= new orderadapter(getApplicationContext(),R.layout.order_sample,listt);
        listView.setAdapter(myadapter);


    }
}