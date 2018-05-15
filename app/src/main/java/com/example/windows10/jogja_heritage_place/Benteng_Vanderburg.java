package com.example.windows10.jogja_heritage_place;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Benteng_Vanderburg extends AppCompatActivity implements View.OnClickListener {
    private Button ven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benteng__vanderburg);
        ven = (Button) findViewById(R.id.ven);
        ven.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ven:
                Intent moveIntent = new Intent(Benteng_Vanderburg.this, Main3Activity.class);
                startActivity(moveIntent);
                break;

        }
    }
}
