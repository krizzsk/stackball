package com.yandex.mobile.ads.impl;

import android.webkit.WebView;

class ut1 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ WebView f41062b;

    /* renamed from: c */
    final /* synthetic */ String f41063c;

    ut1(vt1 vt1, WebView webView, String str) {
        this.f41062b = webView;
        this.f41063c = str;
    }

    public void run() {
        this.f41062b.loadUrl(this.f41063c);
    }
}
