package com.yandex.mobile.ads.impl;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class gb0 extends WebViewClient {

    /* renamed from: a */
    private final hb0 f33926a;

    public gb0(hb0 hb0) {
        this.f33926a = hb0;
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f33926a.mo65845b();
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f33926a.mo65843a(i);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f33926a.mo65844a(webView.getContext(), str);
        return true;
    }
}
