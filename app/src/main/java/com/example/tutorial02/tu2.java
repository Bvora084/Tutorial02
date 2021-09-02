package com.example.tutorial02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tu2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tu2);
    }

    public void fun2(View view) {

        Intent a2 = new Intent(this,MainActivity.class);
        startActivity(a2);
        finish();
    }
}