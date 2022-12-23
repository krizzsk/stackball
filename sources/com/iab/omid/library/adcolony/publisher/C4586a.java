package com.iab.omid.library.adcolony.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.adcolony.publisher.a */
public class C4586a extends AdSessionStatePublisher {
    public C4586a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo38623a(webView);
    }
}
