package com.example.health;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PharmaceuticalActivity2 extends AppCompatActivity {

    Button home55;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmaceutical2);

        home55=findViewById(R.id.home55);
        home55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PharmaceuticalActivity2.this,HomeActivity2.class);
                startActivity(intent);
            }
        });
        CardView card1111 =findViewById(R.id.card1111);
        card1111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PharmaceuticalActivity2.this,PheartActivity2.class));
            }
        });
        CardView card2222 =findViewById(R.id.card2222);
        card2222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PharmaceuticalActivity2.this,PboneActivity2.class));
            }
        });
        CardView card4444 =findViewById(R.id.card4444);
        card4444.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PharmaceuticalActivity2.this,PeyeActivity2.class));
            }
        });

        CardView card3333 =findViewById(R.id.card3333);
        card3333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PharmaceuticalActivity2.this,PskinActivity2.class));
            }
        });
        CardView card5555 =findViewById(R.id.card5555);
        card5555.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PharmaceuticalActivity2.this,PdiabetnActivity2.class));
            }
        });
        CardView card6666 =findViewById(R.id.card6666);
        card6666.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PharmaceuticalActivity2.this,PgastActivity2.class));
            }
        });

        CardView card7777 =findViewById(R.id.card7777);
        card7777.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PharmaceuticalActivity2.this,PcancerActivity2.class));
            }
        });

        CardView card8888 =findViewById(R.id.card8888);
        card8888.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PharmaceuticalActivity2.this,PkidneysActivity2.class));
            }
        });
    }
}