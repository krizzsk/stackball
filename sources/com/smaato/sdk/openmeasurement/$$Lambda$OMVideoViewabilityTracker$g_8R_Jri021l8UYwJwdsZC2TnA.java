package com.smaato.sdk.openmeasurement;

import com.iab.omid.library.smaato.adsession.video.PlayerState;
import com.iab.omid.library.smaato.adsession.video.VideoEvents;
import com.smaato.sdk.core.util.p251fi.Consumer;

/* renamed from: com.smaato.sdk.openmeasurement.-$$Lambda$OMVideoViewabilityTracker$g_8R_Jri021l8UYwJwdsZC2T-nA  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$OMVideoViewabilityTracker$g_8R_Jri021l8UYwJwdsZC2TnA implements Consumer {
    public static final /* synthetic */ $$Lambda$OMVideoViewabilityTracker$g_8R_Jri021l8UYwJwdsZC2TnA INSTANCE = new $$Lambda$OMVideoViewabilityTracker$g_8R_Jri021l8UYwJwdsZC2TnA();

    private /* synthetic */ $$Lambda$OMVideoViewabilityTracker$g_8R_Jri021l8UYwJwdsZC2TnA() {
    }

    public final void accept(Object obj) {
        ((VideoEvents) obj).playerStateChange(PlayerState.FULLSCREEN);
    }
}
