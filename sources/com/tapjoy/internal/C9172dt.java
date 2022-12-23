package com.tapjoy.internal;

import android.webkit.WebView;

/* renamed from: com.tapjoy.internal.dt */
public final class C9172dt extends C9170ds {
    public C9172dt(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo57961a(webView);
    }
}
