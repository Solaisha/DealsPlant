package com.solai.dealsplant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class EarPhoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earphone);

        WebView wvAudio = (WebView) findViewById(R.id.wvAudio);
        WebSettings settings = wvAudio.getSettings();
        settings.setJavaScriptEnabled(true);
        wvAudio.setWebViewClient(new WebViewClient());
        wvAudio.loadUrl("https://dealsplant.com/t/earphones");

    }
}
