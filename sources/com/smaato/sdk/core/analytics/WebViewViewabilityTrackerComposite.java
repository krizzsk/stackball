package com.smaato.sdk.core.analytics;

import android.webkit.WebView;
import com.smaato.sdk.core.util.p251fi.Consumer;
import java.util.List;

final class WebViewViewabilityTrackerComposite extends BaseViewabilityTrackerComposite<WebViewViewabilityTracker> implements WebViewViewabilityTracker {
    WebViewViewabilityTrackerComposite(List<WebViewViewabilityTracker> list) {
        super(list);
    }

    public final void registerAdView(WebView webView) {
        performActionOnMainThread(new Consumer(webView) {
            public final /* synthetic */ WebView f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((WebViewViewabilityTracker) obj).registerAdView(this.f$0);
            }
        });
    }

    public final void updateAdView(WebView webView) {
        performActionOnMainThread(new Consumer(webView) {
            public final /* synthetic */ WebView f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((WebViewViewabilityTracker) obj).updateAdView(this.f$0);
            }
        });
    }
}
