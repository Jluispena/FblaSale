package com.example.jluispena.fblasale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        private static Button button;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }
    public void OpenBuyActivity(View v){
        Intent intent = new Intent(this, BuyActivity.class);
        startActivity(intent);
    }
    public void OpenSellActivity(View v){
        Intent intent = new Intent(this, SellActivity.class);
        startActivity(intent);
    }
    public void OpenDonateActivity(View v){
        Intent intent = new Intent(this, DonateActivity.class);
        startActivity(intent);
    }
    //public void BuyActivity(View v){
       //setContentView(R.layout.activity_buy);

    //}
    public void OpenScrollingActivity(View v) {
        Intent intent = new Intent(this, ScrollingActivity.class);
        startActivity(intent);
    }
}