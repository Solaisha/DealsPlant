package com.solai.dealsplant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class PendriveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendrive);

        WebView wvPendrive = (WebView) findViewById(R.id.wvPendrive);
        WebSettings settings = wvPendrive.getSettings();
        settings.setJavaScriptEnabled(true);
        wvPendrive.setWebViewClient(new WebViewClient());
        wvPendrive.loadUrl("https://dealsplant.com/t/usb-pen-drives");
    }
}
