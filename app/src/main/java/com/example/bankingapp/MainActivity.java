package com.example.bankingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.txt);
    }

    public void ohYeah(View view)
    {
        textView.setText("Oh Yeah");
        textView.setTextSize(100);
        textView.setTextColor(getResources().getColor(R.color.red));
    }
}