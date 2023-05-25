package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KindeysActivity2 extends AppCompatActivity {
    Button back130;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kindeys2);

        back130=findViewById(R.id.back130);
        back130.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(KindeysActivity2.this,IllnessActivity2.class);
                startActivity(intent);
            }
        });


    }
}