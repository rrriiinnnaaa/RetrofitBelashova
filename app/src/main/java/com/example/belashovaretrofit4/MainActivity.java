package com.example.belashovaretrofit4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.spisok_layout);


    }
    public void To1(View view) {
        Intent intent1 = new Intent(MainActivity.this, First.class);
        startActivity(intent1);
    }

    public void To2(View view) {
        Intent intent2 = new Intent(MainActivity.this, Second.class);
        startActivity(intent2);
    }

    public void To3(View view) {
        Intent intent3 = new Intent(MainActivity.this, Third.class);
        startActivity(intent3);
    }


    public void To4(View view) {
        Intent intent4 = new Intent(MainActivity.this, Fourth.class);
        startActivity(intent4);
    }



    }
