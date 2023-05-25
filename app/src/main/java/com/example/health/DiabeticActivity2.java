package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DiabeticActivity2 extends AppCompatActivity {

    Button back99;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diabetic2);

        back99=findViewById(R.id.back99);
        back99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DiabeticActivity2.this,IllnessActivity2.class);
                startActivity(intent);
            }
        });
    }
}