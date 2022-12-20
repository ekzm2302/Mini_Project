package com.example.mini_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.mini_project.chat.ChatFragment;
import com.example.mini_project.home.homeFragment;
import com.example.mini_project.life.LifeFragment;
import com.example.mini_project.location.LocationFragment;
import com.example.mini_project.mycarrot.MycarrotFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView btm_nav;

    private final long FINISH_INTERVAL_TIME = 2000;
    private long backPressedTime = 0;
    SwipeRefreshLayout swipeRefreshLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();



        btm_nav = findViewById(R.id.btm_nav);
        changeFragment(new homeFragment());


        btm_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override

            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if( item.getItemId() == R.id.btm_item1 )       {

                changeFragment(new homeFragment());
                } else if ( item.getItemId() == R.id.btm_item2 )       {
                changeFragment(new LifeFragment());

                } else if (item.getItemId() == R.id.btm_item3 )  {
                changeFragment(new LocationFragment());

                } else if (item.getItemId() == R.id.btm_item4 )       {
                    changeFragment(new ChatFragment());
                    
                } else if (item.getItemId() == R.id.btm_item5 )
                 changeFragment(new MycarrotFragment());{
                }
                return true;
            }
        });




    }

    @Override
    public void onBackPressed() {
        long tempTime = System.currentTimeMillis();
        long intervalTime = tempTime - backPressedTime;

        if(0 <= intervalTime && FINISH_INTERVAL_TIME >= intervalTime) {

        super.onBackPressed();
        }
        else
        {
            backPressedTime = tempTime;
            Toast.makeText(this, "한번 더 뒤로가기 누르면 종료됩니다", Toast.LENGTH_SHORT).show();

        }
    }


    public void changeFragment(Fragment fragment) {


        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();

    }
}