package com.yandex.mobile.ads.impl;

import android.webkit.WebView;

public class xs1 extends C14560s4 {
    public xs1(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo69857a(webView);
    }
}
