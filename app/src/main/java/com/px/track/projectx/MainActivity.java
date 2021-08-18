package com.px.track.projectx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton home,trending,account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home = findViewById(R.id.homeicon);
        trending = findViewById(R.id.trendicon);
        account = findViewById(R.id.accounticon);

        Fragment selectedFragment = new homefrag();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentcont,selectedFragment).commit();

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment selectedFragment = new homefrag();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentcont,selectedFragment).commit();
            }
        });
        trending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment selectedFragment = new trendfrag();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentcont,selectedFragment).commit();
            }
        });
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment selectedFragment = new accntfrag();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentcont,selectedFragment).commit();
            }
        });
    }
}