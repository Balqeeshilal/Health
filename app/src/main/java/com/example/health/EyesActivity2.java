package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EyesActivity2 extends AppCompatActivity {

    Button back77;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eyes2);

        back77=findViewById(R.id.back77);
        back77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(EyesActivity2.this,IllnessActivity2.class);
                startActivity(intent);
            }
        });
    }
}