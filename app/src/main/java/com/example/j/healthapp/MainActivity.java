package com.example.j.healthapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int healthLevel = 0 ;
    String massage ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void display (String massage1){
        TextView textRe = (TextView)findViewById(R.id.TextResult);
        textRe.setText(massage1);


    }



    public void clickOk(View view) {

        healthLevel = healthLevel + 1;
        massage = "Your ansawer is yes ,current health level is" + healthLevel;
        display(massage);
    }

    public void clickSome(View view) {
        healthLevel = healthLevel ;
        massage = "Your ansawer is Somtimes ,current health level is" + healthLevel;
        display(massage);

    }

    public void clickNo(View view) {
        healthLevel = healthLevel - 1;
        massage = "Your ansawer is No ,current health level is" + healthLevel;
        display(massage);
    }
}
