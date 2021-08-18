package com.px.track.projectx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class searchresults extends AppCompatActivity {

    private ArrayList<String> namelist = new ArrayList<>();
    private ArrayList<String> pricelist = new ArrayList<>();
    private ArrayList<String> dislist = new ArrayList<>();
    private ArrayList<String> urllsit = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchresults);

        namelist.clear();
        pricelist.clear();
        dislist.clear();
        urllsit.clear();

        namelist.add("one");
        pricelist.add("one");
        dislist.add("one");
        urllsit.add("one");

        namelist.add("two");
        pricelist.add("two");
        dislist.add("two");
        urllsit.add("two");

        namelist.add("three");
        pricelist.add("three");
        dislist.add("three");
        urllsit.add("three");

        RecyclerView recyclerView = findViewById(R.id.searchrecycler);
        searchadapter adapter = new searchadapter(namelist,pricelist,dislist,urllsit,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

    }

}