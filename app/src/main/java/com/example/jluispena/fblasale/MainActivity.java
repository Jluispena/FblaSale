package com.example.jluispena.fblasale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {
        private static Button button;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    public void OpenBuyActivity(View v){

        setContentView(R.layout.activity_buy);
    }
    public void OpenSellActivity(View v){

        setContentView(R.layout.activity_sell);
    }
    public void OpenDonateActivity(View v){
        setContentView(R.layout.activity_donate);
    }
    public void OpenMainActivity(View v){
        setContentView(R.layout.activity_main);
    }
}