package com.smaato.sdk.openmeasurement;

import com.smaato.sdk.core.analytics.ViewabilityTracker;
import com.smaato.sdk.core.util.p251fi.Consumer;

/* renamed from: com.smaato.sdk.openmeasurement.-$$Lambda$OpOKEwdnWj6hOzcgmxWrQbiIROc  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$OpOKEwdnWj6hOzcgmxWrQbiIROc implements Consumer {
    public static final /* synthetic */ $$Lambda$OpOKEwdnWj6hOzcgmxWrQbiIROc INSTANCE = new $$Lambda$OpOKEwdnWj6hOzcgmxWrQbiIROc();

    private /* synthetic */ $$Lambda$OpOKEwdnWj6hOzcgmxWrQbiIROc() {
    }

    public final void accept(Object obj) {
        ((ViewabilityTracker) obj).startTracking();
    }
}
