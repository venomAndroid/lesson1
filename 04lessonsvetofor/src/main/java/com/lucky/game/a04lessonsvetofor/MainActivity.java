package com.lucky.game.a04lessonsvetofor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
//import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout mConstraintLayout;
    private TextView mInfoTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mConstraintLayout = findViewById(R.id.root_layout);
        mInfoTextView = findViewById(R.id.textView);
    }

    public void onRedButtonClick(View view) {
        mInfoTextView.setText(R.string.btmred);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.redColor));
    }

    public void onYellowButtonClick(View view) {
        mInfoTextView.setText(R.string.btmyellow);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowColor));
    }

    public void onGreenButtonClick(View view) {
        mInfoTextView.setText(R.string.btmgreen);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.greenColor));
    }
}