package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BoneActivity2 extends AppCompatActivity {

    Button back66;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bone2);
        back66=findViewById(R.id.back66);
        back66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BoneActivity2.this,IllnessActivity2.class);
                startActivity(intent);
            }
        });
    }
}