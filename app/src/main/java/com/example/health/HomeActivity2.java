package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity2 extends AppCompatActivity {
    Button button10;
    Button drbutton1;
    Button drbutton2;
    Button drbutton3;
    Button drbutton4;

    Button drbutton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        button10=findViewById(R.id.button10);
        drbutton1=findViewById(R.id.drbutton1);
        drbutton2=findViewById(R.id.drbutton2);
        drbutton3=findViewById(R.id.drbutton3);
        drbutton4=findViewById(R.id.drbutton4);
        drbutton5=findViewById(R.id.drbutton5);

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
        drbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity2.this,DrsActivity2.class);
                startActivity(intent);
            }
        });
        drbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity2.this,HospitActivity2.class);
                startActivity(intent);
            }
        });
        drbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity2.this,IllnessActivity2.class);
                startActivity(intent);
            }
        });

        drbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity2.this,PharmaceuticalActivity2.class);
                startActivity(intent);
            }
        });

        drbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity2.this,SummaryActivity2.class);
                startActivity(intent);
            }
        });
    }
}