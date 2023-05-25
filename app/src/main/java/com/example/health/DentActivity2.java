package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class DentActivity2 extends AppCompatActivity {
    public WebView webView;
    Button click4;
    Button back4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dent2);

        back4=findViewById(R.id.back4);
        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DentActivity2.this,DrsActivity2.class);
                startActivity(intent);
            }
        });
        click4=findViewById(R.id.click4);
        click4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView=(WebView) findViewById(R.id.wv_click4);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://www.wassandental.com/?gclid=Cj0KCQjwyLGjBhDKARIsAFRNgW91fih4hNA9zYRuuSyzHjucmos4OxS53DOF3jxRuR9SnDNBYcCQ13waAtpSEALw_wcB");
            }
        });
    }
}