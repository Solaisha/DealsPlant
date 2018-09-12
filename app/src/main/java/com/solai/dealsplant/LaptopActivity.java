package com.solai.dealsplant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LaptopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop);

        WebView wvLaptop = (WebView) findViewById(R.id.wvLaptop);
        WebSettings settings = wvLaptop.getSettings();
        settings.setJavaScriptEnabled(true);
        wvLaptop.setWebViewClient(new WebViewClient());
        wvLaptop.loadUrl("https://dealsplant.com/t/earphones");
    }
}
