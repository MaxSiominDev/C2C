package dev.maxsiomin.c2c;

import android.annotation.TargetApi;
import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class MyWebViewClient extends WebViewClient {

    @TargetApi(Build.VERSION_CODES.N)
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        view.loadUrl(request.getUrl().toString());
        return true;
    }

    // For old devices
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
