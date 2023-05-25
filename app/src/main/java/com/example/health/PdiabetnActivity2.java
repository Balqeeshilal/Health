package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PdiabetnActivity2 extends AppCompatActivity {

    Button dback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdiabetn2);

        dback=findViewById(R.id.dback);
        dback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PdiabetnActivity2.this,PharmaceuticalActivity2.class);
                startActivity(intent);
            }
        });
    }
}