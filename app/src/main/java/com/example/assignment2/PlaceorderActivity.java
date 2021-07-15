package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PlaceorderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placeorder);

        TextView finalamount;

        finalamount=findViewById(R.id.Amount);

        finalamount.setText("$"+(int) MainActivity.final_price);

    }
}