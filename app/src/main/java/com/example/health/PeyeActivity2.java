package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PeyeActivity2 extends AppCompatActivity {

    Button eback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peye2);

        eback=findViewById(R.id.eback);
        eback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PeyeActivity2.this,PharmaceuticalActivity2.class);
                startActivity(intent);
            }
        });
    }
}