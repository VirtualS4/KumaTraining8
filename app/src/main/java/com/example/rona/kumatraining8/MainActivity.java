package com.example.rona.kumatraining8;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment( new Bearment());
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment bearfrag = null;
        switch (menuItem.getItemId()) {
            case R.id.navigation_home:
                bearfrag = new Bearment();
                break;
            case R.id.navigation_dashboard:
                bearfrag = new Bearment2();
                break;
            case R.id.navigation_notifications:
                bearfrag = new Bearment3();
                break;
        }
        return loadFragment(bearfrag);
    }

    public boolean loadFragment(Fragment bearfrag){
        if (bearfrag !=  null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,bearfrag).commit();
            return true;
        }
        return false;
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        mTextMessage = (TextView) findViewById(R.id.message);
//        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
//        navigation.setOnNavigationItemSelectedListener(OnNavigationItemSelectedListener);
//    }


}
