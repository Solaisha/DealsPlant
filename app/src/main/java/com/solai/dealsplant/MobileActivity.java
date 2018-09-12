package com.solai.dealsplant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MobileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile);

        WebView wvMobile = (WebView) findViewById(R.id.wvMobile);
        WebSettings settings = wvMobile.getSettings();
        settings.setJavaScriptEnabled(true);
        wvMobile.setWebViewClient(new WebViewClient());
        wvMobile.loadUrl("https://dealsplant.com/t/mobile-phones");
    }
}
