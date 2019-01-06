package com.example.hansel_christopher.icoachphone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridLayout;

public class HomeActivity extends AppCompatActivity {
    GridLayout mainGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent i = getIntent();
        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

    }
    public void onClick(View v) {
        Intent intent = new Intent(HomeActivity.this, Athlete1Activity.class);
        startActivity(intent);
    }

}
