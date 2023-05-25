package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PkidneysActivity2 extends AppCompatActivity {

    Button kback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pkidneys2);

        kback=findViewById(R.id.kback);
        kback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PkidneysActivity2.this,PharmaceuticalActivity2.class);
                startActivity(intent);
            }
        });
    }
}