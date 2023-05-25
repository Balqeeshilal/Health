package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GastroActivity2 extends AppCompatActivity {

    Button back110;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastro2);

        back110=findViewById(R.id.back110);
        back110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GastroActivity2.this,IllnessActivity2.class);
                startActivity(intent);
            }
        });
    }
}