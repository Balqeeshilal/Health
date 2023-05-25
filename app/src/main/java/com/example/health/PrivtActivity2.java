package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class PrivtActivity2 extends AppCompatActivity {
    public WebView webView;
    Button click12;
    Button back12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privt2);

        back12=findViewById(R.id.back12);
        back12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PrivtActivity2.this,HospitActivity2.class);
                startActivity(intent);
            }
        });

        click12=findViewById(R.id.click12);
        click12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView=(WebView) findViewById(R.id.wv_click12);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://www.moh.gov.om/documents/18824/0/ACCREDITED++PRIVATE+HOSPITAL++IN+OMAN/ebeaae9a-36c0-fb20-94d6-4a44caa64fa6");
            }
        });
    }
}