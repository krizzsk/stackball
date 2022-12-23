package com.smaato.sdk.openmeasurement;

import android.content.Context;
import com.iab.omid.library.smaato.Omid;
import com.iab.omid.library.smaato.adsession.Partner;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.core.analytics.VideoViewabilityTracker;
import com.smaato.sdk.core.analytics.ViewabilityPlugin;
import com.smaato.sdk.core.analytics.WebViewViewabilityTracker;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p251fi.Consumer;

public final class OMViewabilityPlugin implements ViewabilityPlugin {
    public final String getName() {
        return CampaignEx.KEY_OMID;
    }

    public final void init(Context context) {
        Threads.runOnUi(new Runnable(context) {
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                Omid.activateWithOmidApiVersion(Omid.getVersion(), this.f$0);
            }
        });
    }

    public final DiRegistry diRegistry() {
        return DiRegistry.m24065of(new Consumer() {
            public final void accept(Object obj) {
                OMViewabilityPlugin.this.lambda$diRegistry$8$OMViewabilityPlugin((DiRegistry) obj);
            }
        });
    }

    public /* synthetic */ void lambda$diRegistry$8$OMViewabilityPlugin(DiRegistry diRegistry) {
        diRegistry.registerSingletonFactory(Partner.class, $$Lambda$OMViewabilityPlugin$otFq48AL7baLYJ2wbllvgsEg5rg.INSTANCE);
        diRegistry.registerFactory(getName(), WebViewViewabilityTracker.class, $$Lambda$OMViewabilityPlugin$QgpBv3feojqZCwd0QeJS7MEsp4s.INSTANCE);
        diRegistry.registerFactory(OMWebViewViewabilityTracker.class, $$Lambda$OMViewabilityPlugin$WwRC91eiF_4QjC35DjC8aDT4FY.INSTANCE);
        diRegistry.registerFactory(getName(), VideoViewabilityTracker.class, $$Lambda$OMViewabilityPlugin$nGmHjzJPMt5BJnVOs7qbysg6W2I.INSTANCE);
        diRegistry.registerFactory(OMVideoViewabilityTracker.class, $$Lambda$OMViewabilityPlugin$uodqBmNtgWeKZS9h0FVLnn0pJQ.INSTANCE);
        diRegistry.registerFactory(OMVideoResourceMapper.class, $$Lambda$OMViewabilityPlugin$28FDvw4d31qwOrG0F1NYxayEQg.INSTANCE);
        diRegistry.registerSingletonFactory("OMID_JS", String.class, $$Lambda$OMViewabilityPlugin$JGBp7UnNU9rZMBHz8lVpjlIrCnA.INSTANCE);
    }

    static /* synthetic */ WebViewViewabilityTracker lambda$null$2(DiConstructor diConstructor) {
        return new OMWebViewViewabilityTrackerDecorator(DiLogLayer.getLoggerFrom(diConstructor), (OMWebViewViewabilityTracker) diConstructor.get(OMWebViewViewabilityTracker.class));
    }

    static /* synthetic */ OMWebViewViewabilityTracker lambda$null$3(DiConstructor diConstructor) {
        return new OMWebViewViewabilityTracker((Partner) diConstructor.get(Partner.class));
    }

    static /* synthetic */ VideoViewabilityTracker lambda$null$4(DiConstructor diConstructor) {
        return new OMVideoViewabilityTrackerDecorator(DiLogLayer.getLoggerFrom(diConstructor), (OMVideoViewabilityTracker) diConstructor.get(OMVideoViewabilityTracker.class));
    }

    static /* synthetic */ OMVideoViewabilityTracker lambda$null$5(DiConstructor diConstructor) {
        return new OMVideoViewabilityTracker((Partner) diConstructor.get(Partner.class), (String) diConstructor.get("OMID_JS", String.class), "", (OMVideoResourceMapper) diConstructor.get(OMVideoResourceMapper.class));
    }

    static /* synthetic */ OMVideoResourceMapper lambda$null$6(DiConstructor diConstructor) {
        return new OMVideoResourceMapper(CampaignEx.KEY_OMID);
    }
}
