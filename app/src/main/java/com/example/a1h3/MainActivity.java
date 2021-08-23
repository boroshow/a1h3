package com.example.a1h3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<country> countryList ;
    private RecyclerView recyclerView;
    private UserAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createList();
        initRv();

    }

    private void createList() {
        countryList = new ArrayList<>();
        countryList.add(new country("France","Paris",R.drawable.francia));
        countryList.add(new country("Kyrgyzstan","Bishkek",R.drawable.bishkek));
        countryList.add(new country("China","Pekin",R.drawable.china));
        countryList.add(new country("Russian Federation","Moscow",R.drawable.russia));
        countryList.add(new country("Ukraine","Kyiv ",R.drawable.ukraine));
        countryList.add(new country("Spain","Madrid",R.drawable.spain));
        countryList.add(new country("Germany","Berlin",R.drawable.cerman));
        countryList.add(new country("Argentina","Buenos Aires",R.drawable.argentina));
        countryList.add(new country("Belarus","Minsk",R.drawable.cxc));
        countryList.add(new country("USA","Washington",R.drawable.usa));
        countryList.add(new country("Japan ","Tokyo ",R.drawable.japan));
        countryList.add(new country("Egypt","Cairo",R.drawable.egypt));
        countryList.add(new country("Mongolia","Ulan Bator",R.drawable.mongolia));
        countryList.add(new country("Iran","Tehran",R.drawable.iran));
        countryList.add(new country("Kazakhstan","Astana",R.drawable.kazakhstan));

    }

    private void initRv(){
        recyclerView = findViewById(R.id.mini_recyler);
        adapter = new UserAdapter();
        adapter.setListName(countryList);
        recyclerView.setAdapter(adapter);
    }
}
