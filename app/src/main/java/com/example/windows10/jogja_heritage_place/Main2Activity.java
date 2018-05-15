package com.example.windows10.jogja_heritage_place;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private Button detail2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        detail2 = (Button)findViewById(R.id.detail2);
        detail2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.detail2:
                Intent moveIntent = new Intent(Main2Activity.this, Benteng_Vanderburg.class);
                startActivity(moveIntent);
                break;
        }
    }
}


