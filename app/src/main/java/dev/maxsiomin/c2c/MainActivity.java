package dev.maxsiomin.c2c;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webview);

        setupWebView();
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void setupWebView() {
        webView.setWebViewClient(new MyWebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(C2C_URL);
    }

    final private static String C2C_URL = "https://tinkoff.ru/cardtocard/";
}
