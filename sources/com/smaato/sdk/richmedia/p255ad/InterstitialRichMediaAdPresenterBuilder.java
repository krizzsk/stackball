package com.smaato.sdk.richmedia.p255ad;

import com.smaato.sdk.core.analytics.WebViewViewabilityTracker;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p248ad.InterstitialAdPresenter;
import com.smaato.sdk.core.util.notifier.Timer;
import com.smaato.sdk.richmedia.mraid.MraidConfigurator;
import com.smaato.sdk.richmedia.p255ad.tracker.RichMediaVisibilityTrackerCreator;

/* renamed from: com.smaato.sdk.richmedia.ad.InterstitialRichMediaAdPresenterBuilder */
final class InterstitialRichMediaAdPresenterBuilder extends RichMediaAdPresenterBuilder<InterstitialAdPresenter> {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    InterstitialRichMediaAdPresenterBuilder(com.smaato.sdk.core.log.Logger r9, com.smaato.sdk.richmedia.p255ad.RichMediaAdResponseParser r10, com.smaato.sdk.richmedia.p255ad.tracker.RichMediaVisibilityTrackerCreator r11, com.smaato.sdk.core.util.notifier.Timer r12, com.smaato.sdk.core.appbgdetection.AppBackgroundDetector r13, com.smaato.sdk.richmedia.mraid.MraidConfigurator r14, com.smaato.sdk.core.util.p251fi.Function<com.smaato.sdk.richmedia.p255ad.RichMediaAdObject, com.smaato.sdk.richmedia.p255ad.RichMediaAdInteractor> r15, com.smaato.sdk.core.analytics.WebViewViewabilityTracker r16, com.smaato.sdk.richmedia.p255ad.WebViewRenderer r17, com.smaato.sdk.richmedia.p255ad.LoadedWebViewCache r18) {
        /*
            r8 = this;
            com.smaato.sdk.richmedia.ad.-$$Lambda$InterstitialRichMediaAdPresenterBuilder$xb_qXydAsuep8GhobTIWclNOltY r7 = new com.smaato.sdk.richmedia.ad.-$$Lambda$InterstitialRichMediaAdPresenterBuilder$xb_qXydAsuep8GhobTIWclNOltY
            r0 = r7
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r8
            r2 = r10
            r3 = r15
            r4 = r7
            r5 = r17
            r6 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.richmedia.p255ad.InterstitialRichMediaAdPresenterBuilder.<init>(com.smaato.sdk.core.log.Logger, com.smaato.sdk.richmedia.ad.RichMediaAdResponseParser, com.smaato.sdk.richmedia.ad.tracker.RichMediaVisibilityTrackerCreator, com.smaato.sdk.core.util.notifier.Timer, com.smaato.sdk.core.appbgdetection.AppBackgroundDetector, com.smaato.sdk.richmedia.mraid.MraidConfigurator, com.smaato.sdk.core.util.fi.Function, com.smaato.sdk.core.analytics.WebViewViewabilityTracker, com.smaato.sdk.richmedia.ad.WebViewRenderer, com.smaato.sdk.richmedia.ad.LoadedWebViewCache):void");
    }

    static /* synthetic */ InterstitialAdPresenter lambda$new$0(Logger logger, RichMediaVisibilityTrackerCreator richMediaVisibilityTrackerCreator, Timer timer, AppBackgroundDetector appBackgroundDetector, MraidConfigurator mraidConfigurator, WebViewViewabilityTracker webViewViewabilityTracker, RichMediaAdInteractor richMediaAdInteractor) {
        return new InterstitialRichMediaAdPresenter(logger, richMediaAdInteractor, richMediaVisibilityTrackerCreator, timer, appBackgroundDetector, mraidConfigurator, webViewViewabilityTracker);
    }
}
