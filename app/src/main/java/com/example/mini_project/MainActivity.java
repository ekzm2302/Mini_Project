package com.example.mini_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.mini_project.home.homeFragment;
import com.example.mini_project.life.LifeFragment;
import com.example.mini_project.mycarrot.MycarrotFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView btm_nav;

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

                } else if (item.getItemId() == R.id.btm_item3 )       {


                } else if (item.getItemId() == R.id.btm_item4 )       {

                    
                } else if (item.getItemId() == R.id.btm_item5 )
                 changeFragment(new MycarrotFragment());{
                }
                return true;
            }
        });
    }




    public void changeFragment(Fragment fragment) {


        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();

    }
}