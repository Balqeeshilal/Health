package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class OphthActivity2 extends AppCompatActivity {
    public WebView webView;
    Button back5;
    Button click5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ophth2);

        back5=findViewById(R.id.back5);
        back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OphthActivity2.this,DrsActivity2.class);
                startActivity(intent);
            }
        });
        click5=findViewById(R.id.click5);
        click5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView=(WebView) findViewById(R.id.wv_click5);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://www.orbit-eyecenter.com/?gclid=Cj0KCQjwyLGjBhDKARIsAFRNgW97MjRaFHK_fv2pt_R1zKlp4xvhcRe79Yz9HLgXZnvGL6qv14L4DJ4aAlghEALw_wcB");
            }
        });
    }
}