package com.iab.omid.library.smaato.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.smaato.publisher.a */
public class C4834a extends AdSessionStatePublisher {
    public C4834a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo39554a(webView);
    }
}
