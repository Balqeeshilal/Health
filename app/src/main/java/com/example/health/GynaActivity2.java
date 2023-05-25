package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class GynaActivity2 extends AppCompatActivity {
    public WebView webView;
    Button click6;
    Button back6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gyna2);

        back6=findViewById(R.id.back6);
        back6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GynaActivity2.this,DrsActivity2.class);
                startActivity(intent);
            }
        });
        click6=findViewById(R.id.click6);
        click6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView=(WebView) findViewById(R.id.wv_click6);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://www.burjeelhospitaloman.com/bh-oman/team-that-cares/gynecology-obstetrics/");
            }
        });
    }
}