package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PcancerActivity2 extends AppCompatActivity {

    Button cback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcancer2);

        cback=findViewById(R.id.cback);
        cback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PcancerActivity2.this,PharmaceuticalActivity2.class);
                startActivity(intent);
            }
        });
    }
}