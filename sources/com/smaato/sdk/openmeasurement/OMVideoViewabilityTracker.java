package com.smaato.sdk.openmeasurement;

import android.view.View;
import com.iab.omid.library.smaato.adsession.AdEvents;
import com.iab.omid.library.smaato.adsession.AdSession;
import com.iab.omid.library.smaato.adsession.AdSessionConfiguration;
import com.iab.omid.library.smaato.adsession.AdSessionContext;
import com.iab.omid.library.smaato.adsession.Owner;
import com.iab.omid.library.smaato.adsession.Partner;
import com.iab.omid.library.smaato.adsession.video.Position;
import com.iab.omid.library.smaato.adsession.video.VastProperties;
import com.iab.omid.library.smaato.adsession.video.VideoEvents;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.core.analytics.VideoViewabilityTracker;
import com.smaato.sdk.core.analytics.ViewabilityVerificationResource;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class OMVideoViewabilityTracker implements VideoViewabilityTracker {
    private AdEvents adEvents;
    private AdSession adSession;
    private final String customReferenceData;
    private final String omidJsServiceContent;
    private final Partner partner;
    private final OMVideoResourceMapper resourceMapper;
    private VideoEvents videoEvents;

    OMVideoViewabilityTracker(Partner partner2, String str, String str2, OMVideoResourceMapper oMVideoResourceMapper) {
        this.partner = (Partner) Objects.requireNonNull(partner2);
        this.omidJsServiceContent = (String) Objects.requireNonNull(str);
        this.customReferenceData = (String) Objects.requireNonNull(str2);
        this.resourceMapper = (OMVideoResourceMapper) Objects.requireNonNull(oMVideoResourceMapper);
    }

    public final void registerAdView(View view, Map<String, List<ViewabilityVerificationResource>> map) {
        Owner owner = Owner.NATIVE;
        AdSessionConfiguration createAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(owner, owner, false);
        List list = map.get(CampaignEx.KEY_OMID);
        Partner partner2 = this.partner;
        String str = this.omidJsServiceContent;
        OMVideoResourceMapper oMVideoResourceMapper = this.resourceMapper;
        if (list == null) {
            list = Collections.emptyList();
        }
        AdSession createAdSession = AdSession.createAdSession(createAdSessionConfiguration, AdSessionContext.createNativeAdSessionContext(partner2, str, oMVideoResourceMapper.apply((List<ViewabilityVerificationResource>) list), this.customReferenceData));
        this.adSession = createAdSession;
        createAdSession.registerAdView(view);
        this.adEvents = AdEvents.createAdEvents(this.adSession);
        this.videoEvents = VideoEvents.createVideoEvents(this.adSession);
    }

    public final void trackPlayerStateChange() {
        Objects.onNotNull(this.videoEvents, $$Lambda$OMVideoViewabilityTracker$g_8R_Jri021l8UYwJwdsZC2TnA.INSTANCE);
    }

    public final void trackVideoClicked() {
        Objects.onNotNull(this.videoEvents, $$Lambda$OMVideoViewabilityTracker$oDbBgqhV2Qa0HJSlR0CYXQrRV4Q.INSTANCE);
    }

    public final void startTracking() {
        Objects.onNotNull(this.adSession, $$Lambda$UeW1rIvgKn_eYOVfT2yqI1ACPM.INSTANCE);
    }

    public final void trackLoaded(VideoViewabilityTracker.VideoProps videoProps) {
        Objects.onNotNull(this.videoEvents, new Consumer() {
            public final void accept(Object obj) {
                OMVideoViewabilityTracker.lambda$trackLoaded$2(VideoViewabilityTracker.VideoProps.this, (VideoEvents) obj);
            }
        });
    }

    static /* synthetic */ void lambda$trackLoaded$2(VideoViewabilityTracker.VideoProps videoProps, VideoEvents videoEvents2) {
        VastProperties vastProperties;
        if (videoProps.isSkippable) {
            float f = videoProps.skipOffset;
            videoProps.getClass();
            vastProperties = VastProperties.createVastPropertiesForSkippableVideo(f, true, Position.STANDALONE);
        } else {
            videoProps.getClass();
            vastProperties = VastProperties.createVastPropertiesForNonSkippableVideo(true, Position.STANDALONE);
        }
        videoEvents2.loaded(vastProperties);
    }

    public final void trackImpression() {
        Objects.onNotNull(this.adEvents, $$Lambda$grKjDTBS0Q9SYAhDXaZ3lPHax9E.INSTANCE);
    }

    public final void stopTracking() {
        Objects.onNotNull(this.adSession, new Consumer() {
            public final void accept(Object obj) {
                OMVideoViewabilityTracker.this.lambda$stopTracking$3$OMVideoViewabilityTracker((AdSession) obj);
            }
        });
    }

    public /* synthetic */ void lambda$stopTracking$3$OMVideoViewabilityTracker(AdSession adSession2) {
        adSession2.finish();
        this.adSession = null;
        this.adEvents = null;
    }

    public final void trackStarted(float f, float f2) {
        Objects.onNotNull(this.videoEvents, new Consumer(f, f2) {
            public final /* synthetic */ float f$0;
            public final /* synthetic */ float f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                ((VideoEvents) obj).start(this.f$0, this.f$1);
            }
        });
    }

    public final void trackFirstQuartile() {
        Objects.onNotNull(this.videoEvents, $$Lambda$iJzM379Wq_J2A8snUC3ROUoCSTk.INSTANCE);
    }

    public final void trackMidPoint() {
        Objects.onNotNull(this.videoEvents, $$Lambda$ZaNzf5LOL_cv0VW1KiNMKAUSjjA.INSTANCE);
    }

    public final void trackThirdQuartile() {
        Objects.onNotNull(this.videoEvents, $$Lambda$hDzJ1kZap6NlLAo2Oo_X_nVdmZg.INSTANCE);
    }

    public final void trackCompleted() {
        Objects.onNotNull(this.videoEvents, $$Lambda$fOSXaWdxoL8vll06wRbS5UyuV50.INSTANCE);
    }

    public final void trackPaused() {
        Objects.onNotNull(this.videoEvents, $$Lambda$oxEwTzdNdgb0gvpJNvJGhnFzCuQ.INSTANCE);
    }

    public final void trackResumed() {
        Objects.onNotNull(this.videoEvents, $$Lambda$9OCyTWa1GGhPQwoWo0_ATgzpsqo.INSTANCE);
    }

    public final void trackBufferStart() {
        Objects.onNotNull(this.videoEvents, $$Lambda$pA4Tibpn1Wupy1RNrnV6F0x7xyo.INSTANCE);
    }

    public final void trackBufferFinish() {
        Objects.onNotNull(this.videoEvents, $$Lambda$k_j5Rgx638jBRt98_HLW8NU7EPA.INSTANCE);
    }

    public final void trackPlayerVolumeChanged(float f) {
        Objects.onNotNull(this.videoEvents, new Consumer(f) {
            public final /* synthetic */ float f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((VideoEvents) obj).volumeChange(this.f$0);
            }
        });
    }

    public final void trackSkipped() {
        Objects.onNotNull(this.videoEvents, $$Lambda$O3bbCF9uGmtUAf5UGshhLudtbQA.INSTANCE);
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
