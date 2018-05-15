package com.example.windows10.jogja_heritage_place;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Taman_Sari extends AppCompatActivity  implements View.OnClickListener{
   private Button tombol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taman__sari);

        tombol = (Button)findViewById(R.id.tombol);
        tombol.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tombol:
                Intent moveIntent = new Intent(Taman_Sari.this, Main4Activity.class);
                        startActivity(moveIntent);
                        break;
        }
    }
}

