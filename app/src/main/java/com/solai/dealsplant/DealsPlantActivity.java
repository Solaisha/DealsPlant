package com.solai.dealsplant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DealsPlantActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deals_plant);

        WebView wvdealsplant = (WebView) findViewById(R.id.wvdealsplant);
        WebSettings settings = wvdealsplant.getSettings();
        settings.setJavaScriptEnabled(true);
        wvdealsplant.setWebViewClient(new WebViewClient());
        wvdealsplant.loadUrl("https://dealsplant.com");

    }
}
