package com.example.foodpanda;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class orderdetails extends AppCompatActivity {
public int count;
public String cnt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderdetails);

        Intent intent = getIntent();
        String position = intent.getStringExtra("Position");
        String name = intent.getStringExtra("Name");
        String disc = intent.getStringExtra("Disc");
        Integer image = intent.getIntExtra("Image",0);


        ImageView imageView = findViewById(R.id.detail_image);
        imageView.setImageResource(image);

        TextView textView= findViewById(R.id.detailimagename);
        textView.setText(name);

        TextView textView2= findViewById(R.id.orderdetaildiscription);
        textView2.setText(disc);
       ImageView increment= findViewById(R.id.add);
       increment.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               TextView add= findViewById(R.id.quantity);
              // String s=add.getText().toString();
             //  count= savedInstanceState.getInt("count");
               count++;
               add.setText(String.valueOf(count));
              // int val,val1;
             // val = Integer.valueOf(s);
             // val++;
             //  Toast.makeText(orderdetails.this,val, Toast.LENGTH_SHORT).show();
              //add.setText(val+1);

           }
       });

        ImageView decrement= findViewById(R.id.subtract);
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView aadd= findViewById(R.id.quantity);
                // String s=add.getText().toString();
                //  count= savedInstanceState.getInt("count");
                count--;
                aadd.setText(String.valueOf(count));
                // int val,val1;
                // val = Integer.valueOf(s);
                // val++;
                //  Toast.makeText(orderdetails.this,val, Toast.LENGTH_SHORT).show();
                //add.setText(val+1);

            }
        });

        Toast.makeText(this,position, Toast.LENGTH_SHORT).show();
        Button button= (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                   openactivity2();

            }});
        }

   public void openactivity2(){
        cnt=String.valueOf(count);
       Toast.makeText(this,cnt, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, orders.class);
       // Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
        intent.putExtra("quantity",cnt);
        startActivity(intent);

    }}