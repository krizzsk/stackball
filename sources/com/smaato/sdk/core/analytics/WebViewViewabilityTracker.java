package com.smaato.sdk.core.analytics;

import android.webkit.WebView;

public interface WebViewViewabilityTracker extends ViewabilityTracker {
    void registerAdView(WebView webView);

    void updateAdView(WebView webView);
}
