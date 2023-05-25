package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PheartActivity2 extends AppCompatActivity {

    Button hback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pheart2);

        hback=findViewById(R.id.hback);
        hback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PheartActivity2.this,PharmaceuticalActivity2.class);
                startActivity(intent);
            }
        });
    }
}