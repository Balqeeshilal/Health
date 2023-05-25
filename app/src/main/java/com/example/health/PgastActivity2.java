package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PgastActivity2 extends AppCompatActivity {

    Button gback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pgast2);

        gback=findViewById(R.id.gback);
        gback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PgastActivity2.this,PharmaceuticalActivity2.class);
                startActivity(intent);
            }
        });
    }
}