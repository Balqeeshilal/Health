package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class OrthActivity2 extends AppCompatActivity {
    public WebView webView;
    Button click1;
    Button back1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orth2);


        back1=findViewById(R.id.back1);

        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OrthActivity2.this,DrsActivity2.class);
                startActivity(intent);
            }
        });
          click1=findViewById(R.id.click1);
        click1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView=(WebView) findViewById(R.id.wv_click1);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://cmcdubai.ae/services/orthopedic-surgery/?gclid=Cj0KCQjwyLGjBhDKARIsAFRNgW828Lwaqu134ybPrpxM1tzqmvul5-qJZqs6qsvBiE7USJ0zt8e3D9UaAvHxEALw_wcB");
            }
        });
    }
}