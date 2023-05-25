package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class DermatActivity2 extends AppCompatActivity {
    public WebView webView;
    Button click3;
    Button back3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dermat2);

        back3=findViewById(R.id.back3);
        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DermatActivity2.this,DrsActivity2.class);
                startActivity(intent);
            }
        });
        click3=findViewById(R.id.click3);
        click3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView=(WebView) findViewById(R.id.wv_click3);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://www.aesmc.com/departments/dermatology-clinic-in-abu-dhabi?gclid=Cj0KCQjwyLGjBhDKARIsAFRNgW_sMJwvMo6oaO1OccNtWTNY5-gOdJ_RdnWPsVCwekIzad95QnKuRssaAlAwEALw_wcB");
            }
        });
    }
}