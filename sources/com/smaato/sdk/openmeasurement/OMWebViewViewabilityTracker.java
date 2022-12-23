package com.smaato.sdk.openmeasurement;

import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.smaato.adsession.AdEvents;
import com.iab.omid.library.smaato.adsession.AdSession;
import com.iab.omid.library.smaato.adsession.AdSessionConfiguration;
import com.iab.omid.library.smaato.adsession.AdSessionContext;
import com.iab.omid.library.smaato.adsession.Owner;
import com.iab.omid.library.smaato.adsession.Partner;
import com.smaato.sdk.core.analytics.WebViewViewabilityTracker;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;

public final class OMWebViewViewabilityTracker implements WebViewViewabilityTracker {
    private AdEvents adEvents;
    private AdSession adSession;
    private final Partner partner;

    OMWebViewViewabilityTracker(Partner partner2) {
        this.partner = (Partner) Objects.requireNonNull(partner2);
    }

    public final void registerAdView(WebView webView) {
        AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(Owner.NATIVE, (Owner) null, false), AdSessionContext.createHtmlAdSessionContext(this.partner, webView, ""));
        this.adSession = createAdSession;
        createAdSession.registerAdView(webView);
        this.adEvents = AdEvents.createAdEvents(this.adSession);
    }

    public final void updateAdView(WebView webView) {
        Objects.onNotNull(this.adSession, new Consumer(webView) {
            public final /* synthetic */ WebView f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((AdSession) obj).registerAdView(this.f$0);
            }
        });
    }

    public final void startTracking() {
        Objects.onNotNull(this.adSession, $$Lambda$UeW1rIvgKn_eYOVfT2yqI1ACPM.INSTANCE);
    }

    public final void stopTracking() {
        Objects.onNotNull(this.adSession, new Consumer() {
            public final void accept(Object obj) {
                OMWebViewViewabilityTracker.this.lambda$stopTracking$1$OMWebViewViewabilityTracker((AdSession) obj);
            }
        });
    }

    public /* synthetic */ void lambda$stopTracking$1$OMWebViewViewabilityTracker(AdSession adSession2) {
        adSession2.finish();
        this.adSession = null;
        this.adEvents = null;
    }

    public final void trackImpression() {
        Objects.onNotNull(this.adEvents, $$Lambda$grKjDTBS0Q9SYAhDXaZ3lPHax9E.INSTANCE);
    }

    public final void registerFriendlyObstruction(View view) {
        Objects.onNotNull(this.adSession, new Consumer(view) {
            public final /* synthetic */ View f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((AdSession) obj).addFriendlyObstruction(this.f$0);
            }
        });
    }

    public final void removeFriendlyObstruction(View view) {
        Objects.onNotNull(this.adSession, new Consumer(view) {
            public final /* synthetic */ View f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((AdSession) obj).removeFriendlyObstruction(this.f$0);
            }
        });
    }
}
