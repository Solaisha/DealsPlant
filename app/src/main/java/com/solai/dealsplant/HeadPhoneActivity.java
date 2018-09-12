package com.solai.dealsplant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HeadPhoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head_phone);

        WebView wvHeadPhone = (WebView) findViewById(R.id.wvHeadPhone);
        WebSettings settings = wvHeadPhone.getSettings();
        settings.setJavaScriptEnabled(true);
        wvHeadPhone.setWebViewClient(new WebViewClient());
        wvHeadPhone.loadUrl("https://dealsplant.com/t/audio-home-entertainment");
    }
}
