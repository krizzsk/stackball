package com.iab.omid.library.ironsrc.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.ironsrc.publisher.a */
public class C4734a extends AdSessionStatePublisher {
    public C4734a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo39169a(webView);
    }
}
