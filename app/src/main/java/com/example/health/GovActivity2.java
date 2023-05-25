package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class GovActivity2 extends AppCompatActivity {
    public WebView webView;
    Button click11;
    Button back11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gov2);
        back11=findViewById(R.id.back11);

        back11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GovActivity2.this,HospitActivity2.class);
                startActivity(intent);
            }
        });
        click11=findViewById(R.id.click11);
        click11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView=(WebView) findViewById(R.id.wv_click11);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://www.oman.om/wps/portal/emobile/!ut/p/a0/04_Sj9CPykssy0xPLMnMz0vMAfGjzOKNDdwNDPwtPX1NwixdDYz8QgO9_ZyCDAyMzPSDU_P0C7IdFQEuR4p9/?WCM_PORTLET=PC_Z7_UOKBSI420863D02NR2HJPT10S3000000_WCM&WCM_GLOBAL_CONTEXT=/wps/wcm/connect/EN/mobsite/mobcrb/health/govh/");
            }
        });
    }
}