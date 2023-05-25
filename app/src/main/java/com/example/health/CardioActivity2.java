package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class CardioActivity2 extends AppCompatActivity {

    public WebView webView;
    Button click2;
    Button back2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio2);

        back2=findViewById(R.id.back2);

        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CardioActivity2.this,DrsActivity2.class);
                startActivity(intent);
            }
        });

        click2=findViewById(R.id.click2);

        click2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView=(WebView) findViewById(R.id.wv_click2);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://www.fuh.care/updates/fuh-heart-institute?gclid=Cj0KCQjwyLGjBhDKARIsAFRNgW81suddKKuuzEDcHQ45kDfLqoSedx0eKPMSZp27frg-NIUKyqZiloMaAj9bEALw_wcB");
            }
        });
    }
}