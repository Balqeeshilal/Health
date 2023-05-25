package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SummaryActivity2 extends AppCompatActivity {

    Button bbbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary2);

        bbbutton=findViewById(R.id.bbbutton);
        bbbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SummaryActivity2.this,HomeActivity2.class);
                startActivity(intent);
            }
        });
    }
}