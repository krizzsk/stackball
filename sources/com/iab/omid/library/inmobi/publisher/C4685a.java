package com.iab.omid.library.inmobi.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.inmobi.publisher.a */
public class C4685a extends AdSessionStatePublisher {
    public C4685a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo38989a(webView);
    }
}
