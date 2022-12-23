package com.smaato.sdk.openmeasurement;

import android.webkit.WebView;
import com.smaato.sdk.core.analytics.WebViewViewabilityTracker;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.p251fi.Consumer;

public final class OMWebViewViewabilityTrackerDecorator extends BaseOMViewabilityTracker<OMWebViewViewabilityTracker> implements WebViewViewabilityTracker {
    OMWebViewViewabilityTrackerDecorator(Logger logger, OMWebViewViewabilityTracker oMWebViewViewabilityTracker) {
        super(logger, oMWebViewViewabilityTracker);
    }

    public final void registerAdView(WebView webView) {
        performActionSafely(new Consumer(webView) {
            public final /* synthetic */ WebView f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((OMWebViewViewabilityTracker) obj).registerAdView(this.f$0);
            }
        });
    }

    public final void updateAdView(WebView webView) {
        performActionSafely(new Consumer(webView) {
            public final /* synthetic */ WebView f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((OMWebViewViewabilityTracker) obj).updateAdView(this.f$0);
            }
        });
    }
}
