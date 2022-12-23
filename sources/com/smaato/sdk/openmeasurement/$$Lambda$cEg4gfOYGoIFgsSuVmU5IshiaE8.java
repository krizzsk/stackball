package com.smaato.sdk.openmeasurement;

import com.smaato.sdk.core.util.p251fi.Consumer;

/* renamed from: com.smaato.sdk.openmeasurement.-$$Lambda$cEg4gfOYGoIFgsSuVmU5IshiaE8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$cEg4gfOYGoIFgsSuVmU5IshiaE8 implements Consumer {
    public static final /* synthetic */ $$Lambda$cEg4gfOYGoIFgsSuVmU5IshiaE8 INSTANCE = new $$Lambda$cEg4gfOYGoIFgsSuVmU5IshiaE8();

    private /* synthetic */ $$Lambda$cEg4gfOYGoIFgsSuVmU5IshiaE8() {
    }

    public final void accept(Object obj) {
        ((OMVideoViewabilityTracker) obj).trackFirstQuartile();
    }
}
