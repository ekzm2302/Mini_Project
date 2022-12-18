package com.example.mini_project.search;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.mini_project.MainActivity;
import com.example.mini_project.R;
import com.example.mini_project.location.LocationFragment;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {
    RecyclerView recv_search;
    ArrayList<SearchDTO> slist;
    TextView tv_back;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.out_left2, R.anim.out_right2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        getSupportActionBar().hide();

        recv_search = findViewById(R.id.recv_search);
        slist = new ArrayList<>();
        slist.add(new SearchDTO("애플워치"));
        slist.add(new SearchDTO("당근알바"));
        slist.add(new SearchDTO("버버리"));
        slist.add(new SearchDTO("네일무료"));
        slist.add(new SearchDTO("의자"));
        slist.add(new SearchDTO("쌀"));
        slist.add(new SearchDTO("식탁"));
        slist.add(new SearchDTO("붕어빵"));
        slist.add(new SearchDTO("가방"));
        slist.add(new SearchDTO("텐트"));
        slist.add(new SearchDTO("강아지"));

        SearchCardAdapter searchCardAdapter = new SearchCardAdapter(getLayoutInflater(), slist);
        recv_search.setAdapter(searchCardAdapter);
        recv_search.setLayoutManager(new LinearLayoutManager(SearchActivity.this, RecyclerView.HORIZONTAL, false));

        tv_back = (TextView) findViewById(R.id.tv_back);

        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               SearchActivity.this.onBackPressed();


            }
        });
    }
}