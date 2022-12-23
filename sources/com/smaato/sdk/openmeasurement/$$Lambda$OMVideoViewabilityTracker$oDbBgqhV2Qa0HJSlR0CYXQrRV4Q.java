package com.smaato.sdk.openmeasurement;

import com.iab.omid.library.smaato.adsession.video.InteractionType;
import com.iab.omid.library.smaato.adsession.video.VideoEvents;
import com.smaato.sdk.core.util.p251fi.Consumer;

/* renamed from: com.smaato.sdk.openmeasurement.-$$Lambda$OMVideoViewabilityTracker$oDbBgqhV2Qa0HJSlR0CYXQrRV4Q  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$OMVideoViewabilityTracker$oDbBgqhV2Qa0HJSlR0CYXQrRV4Q implements Consumer {
    public static final /* synthetic */ $$Lambda$OMVideoViewabilityTracker$oDbBgqhV2Qa0HJSlR0CYXQrRV4Q INSTANCE = new $$Lambda$OMVideoViewabilityTracker$oDbBgqhV2Qa0HJSlR0CYXQrRV4Q();

    private /* synthetic */ $$Lambda$OMVideoViewabilityTracker$oDbBgqhV2Qa0HJSlR0CYXQrRV4Q() {
    }

    public final void accept(Object obj) {
        ((VideoEvents) obj).adUserInteraction(InteractionType.CLICK);
    }
}
