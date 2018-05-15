package com.example.windows10.jogja_heritage_place;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tugu_Jogjakarta extends AppCompatActivity implements View.OnClickListener {
    private Button mu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugu__jogjakarta);
        mu = (Button)findViewById(R.id.mu);
        mu.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.mu:
                Intent moveIntent = new Intent(Tugu_Jogjakarta.this, Main2Activity.class);
                startActivity(moveIntent);
                break;
        }
    }
}
