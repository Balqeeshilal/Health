package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SkinActivity2 extends AppCompatActivity {

    Button back88;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin2);

        back88=findViewById(R.id.back88);
        back88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SkinActivity2.this,IllnessActivity2.class);
                startActivity(intent);
            }
        });
    }
}