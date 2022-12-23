package com.smaato.sdk.openmeasurement;

import com.iab.omid.library.smaato.adsession.video.VideoEvents;
import com.smaato.sdk.core.util.p251fi.Consumer;

/* renamed from: com.smaato.sdk.openmeasurement.-$$Lambda$iJzM379Wq_J2A8snUC3ROUoCSTk  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$iJzM379Wq_J2A8snUC3ROUoCSTk implements Consumer {
    public static final /* synthetic */ $$Lambda$iJzM379Wq_J2A8snUC3ROUoCSTk INSTANCE = new $$Lambda$iJzM379Wq_J2A8snUC3ROUoCSTk();

    private /* synthetic */ $$Lambda$iJzM379Wq_J2A8snUC3ROUoCSTk() {
    }

    public final void accept(Object obj) {
        ((VideoEvents) obj).firstQuartile();
    }
}
