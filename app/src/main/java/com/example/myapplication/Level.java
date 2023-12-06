package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Level extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        Intent i = getIntent();
        int num = i.getIntExtra("LevelNumber", 0);

        TextView LvlNumber = findViewById(R.id.LevelNumber);
        LvlNumber.append(Integer.toString(num));
    }

    public void youWon(View v) {
        Toast.makeText(this, "You won!", Toast.LENGTH_LONG).show();
    }
}