package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CancersActivity2 extends AppCompatActivity {

    Button back120;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancers2);

        back120=findViewById(R.id.back120);
        back120.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CancersActivity2.this,IllnessActivity2.class);
                startActivity(intent);
            }
        });
    }
}