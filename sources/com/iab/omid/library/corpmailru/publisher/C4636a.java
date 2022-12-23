package com.iab.omid.library.corpmailru.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.corpmailru.publisher.a */
public class C4636a extends AdSessionStatePublisher {
    public C4636a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo38817a(webView);
    }
}
