package com.example.windows10.jogja_heritage_place;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener  {
    private Button tmbl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        tmbl = (Button)findViewById(R.id.tmbl);
        tmbl.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.tmbl:
                Intent moveIntent = new Intent(Main4Activity.this, goapindul.class);
                startActivity(moveIntent);
                break;
        }
    }
}
