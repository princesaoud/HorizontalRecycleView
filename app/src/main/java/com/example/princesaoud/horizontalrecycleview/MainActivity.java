package com.example.princesaoud.horizontalrecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mName = new ArrayList<>();
    private ArrayList<String> mImagePath = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImage();
    }

    private void initImage(){

        mImagePath.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mName.add("Havasu Falls");

            mImagePath.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mName.add("Trondhein");

        mImagePath.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mName.add("Portugal");


        mImagePath.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mName.add("Havasu Falls");

        mImagePath.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mName.add("Trondhein");

        mImagePath.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mName.add("Portugal");


        mImagePath.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mName.add("Havasu Falls");

        mImagePath.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mName.add("Trondhein");

        mImagePath.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mName.add("Portugal");

        initRecyclerView();
    }

    private void initRecyclerView(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mName,mImagePath,this);
        recyclerView.setAdapter(adapter);
    }
}
