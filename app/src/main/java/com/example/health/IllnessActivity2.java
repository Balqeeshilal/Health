package com.example.health;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IllnessActivity2 extends AppCompatActivity {
    Button home5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_illness2);
        home5=findViewById(R.id.home5);
        home5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IllnessActivity2.this,HomeActivity2.class);
                startActivity(intent);
            }
        });
        CardView card111 =findViewById(R.id.card111);
        card111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IllnessActivity2.this,HeartActivity2.class));
            }
        });
        CardView card222 =findViewById(R.id.card222);
        card222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IllnessActivity2.this,BoneActivity2.class));
            }
        });
        CardView card444 =findViewById(R.id.card444);
        card444.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IllnessActivity2.this,EyesActivity2.class));
            }
        });

        CardView card333 =findViewById(R.id.card333);
        card333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IllnessActivity2.this,SkinActivity2.class));
            }
        });

        CardView card555 =findViewById(R.id.card555);
        card555.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IllnessActivity2.this,DiabeticActivity2.class));
            }
        });
        CardView card666 =findViewById(R.id.card666);
        card666.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IllnessActivity2.this,GastroActivity2.class));
            }
        });
        CardView card777=findViewById(R.id.card777);
        card777.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IllnessActivity2.this,CancersActivity2.class));
            }
        });
        CardView card888 =findViewById(R.id.card888);
        card888.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IllnessActivity2.this,KindeysActivity2.class));
            }
        });

    }
}