package com.iab.omid.library.vungle.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.vungle.publisher.a */
public class C4883a extends AdSessionStatePublisher {
    public C4883a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo39739a(webView);
    }
}
