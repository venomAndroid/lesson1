package com.lucky.game.catkitty;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    public Button mCrowsCounterButton;
    private int mCount = 0;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        mCrowsCounterButton = findViewById(R.id.button_counter);
        mCrowsCounterButton.setOnClickListener(view -> textView.setText("Я насчитал " + ++mCount + " ворон"));
    }

    @SuppressLint("SetTextI18n")
    public void onClick(View view) {
        textView.setText("Hello Kitty!");
    }
}