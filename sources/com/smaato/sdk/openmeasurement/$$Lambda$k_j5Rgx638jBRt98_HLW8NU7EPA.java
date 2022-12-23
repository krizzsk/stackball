package com.smaato.sdk.openmeasurement;

import com.iab.omid.library.smaato.adsession.video.VideoEvents;
import com.smaato.sdk.core.util.p251fi.Consumer;

/* renamed from: com.smaato.sdk.openmeasurement.-$$Lambda$k_j5Rgx638jBRt98_HLW8NU7EPA  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$k_j5Rgx638jBRt98_HLW8NU7EPA implements Consumer {
    public static final /* synthetic */ $$Lambda$k_j5Rgx638jBRt98_HLW8NU7EPA INSTANCE = new $$Lambda$k_j5Rgx638jBRt98_HLW8NU7EPA();

    private /* synthetic */ $$Lambda$k_j5Rgx638jBRt98_HLW8NU7EPA() {
    }

    public final void accept(Object obj) {
        ((VideoEvents) obj).bufferFinish();
    }
}
