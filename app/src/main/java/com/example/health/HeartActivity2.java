package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.time.Instant;

public class HeartActivity2 extends AppCompatActivity {
    Button back55;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart2);

        back55=findViewById(R.id.back55);

        back55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HeartActivity2.this,IllnessActivity2.class);
                startActivity(intent);
            }
        });
    }
}