package com.iab.omid.library.oguryco.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.oguryco.publisher.a */
public class C4785a extends AdSessionStatePublisher {
    public C4785a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo39383a(webView);
    }
}
