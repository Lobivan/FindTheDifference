package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LevelSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_select);
    }


    public void launchLevel(View v) {
        Button b = (Button)v;
        int LevelNumber = Integer.parseInt(b.getText().toString());

        Intent i = new Intent(this, Level.class);
        i.putExtra("LevelNumber", LevelNumber);
        startActivity(i);
    }
}