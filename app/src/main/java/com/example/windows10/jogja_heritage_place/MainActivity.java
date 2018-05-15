package com.example.windows10.jogja_heritage_place;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
   private Button detail1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    detail1 = (Button)findViewById(R.id.detail1);
    detail1.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case  R.id.detail1:
                Intent moveIntent   = new Intent(MainActivity.this, Tugu_Jogjakarta.class);
                startActivity(moveIntent);
                break;


                    }
            }
        }



