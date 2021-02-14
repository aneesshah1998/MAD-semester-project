package com.example.foodpanda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.foodpanda.Adapters.mainadapter;
import com.example.foodpanda.Models.mainmodel;
import com.example.foodpanda.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<mainmodel> list;
    ListView listView;
    mainmodel mydata = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // buttonburgur=findViewById(R.id.imageview);
        list= new ArrayList<>();
        list.add(new mainmodel(R.drawable.burgur, "burgur", "5", "Zinger burgur with cold drink"));
        list.add(new mainmodel(R.drawable.bamboo, "bamboo", "10", "bone less bambo"));
        list.add(new mainmodel(R.drawable.pizza, "pizza", "8", "yummy pizza with extra cheeze"));
        list.add(new mainmodel(R.drawable.salad, "salad", "2", "chinese salad"));
        list.add(new mainmodel(R.drawable.broast, "broast", "5", "stem broast"));
        list.add(new mainmodel(R.drawable.br, "biryani", "10", "double piece pishawari biryani / / / / / / / / / / / / / / / / / / / / / / / / / /"));
        list.add(new mainmodel(R.drawable.chn, "chinese", "15", "chinese food"));
        listView=findViewById(R.id.listview);
        mainadapter myadapter= new mainadapter(getApplicationContext(),R.layout.mainfooditem,list);
        listView.setAdapter(myadapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Intent intent=new Intent(MainActivity.this,orderdetails.class);
                String pos = ""+position;
                //Toast.makeText(MainActivity.this, pos, Toast.LENGTH_SHORT).show();
                intent.putExtra("Position",pos);
                intent.putExtra("Disc",list.get(position).getDiscription());
                intent.putExtra("Name",list.get(position).getName());
                intent.putExtra("Image",list.get(position).getImage());
                startActivity(intent);
            }
        });

    }
}