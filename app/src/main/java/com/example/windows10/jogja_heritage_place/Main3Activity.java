package com.example.windows10.jogja_heritage_place;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{
    private Button detail3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        detail3 = (Button)findViewById(R.id.detail3);
        detail3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.detail3:
                Intent moveIntent = new Intent(Main3Activity.this, Taman_Sari.class);
                startActivity(moveIntent);
                break;
        }
    }
}
