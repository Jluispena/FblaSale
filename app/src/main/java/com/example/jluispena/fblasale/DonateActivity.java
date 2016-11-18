package com.example.jluispena.fblasale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DonateActivity extends AppCompatActivity {

    //protected Button myButton;
    //String myString = "Thank You for the donation";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);

        //myButton = (Button) findViewById(R.id.buttonID);
        //myButton.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), myString, Toast.LENGTH_LONG).show();
            //}
        //});
    }
    public void OpenScrollingActivity(View v){
        Intent intent = new Intent(this, ScrollingActivity.class);
        startActivity(intent);
    }
}