package com.smaato.sdk.openmeasurement;

import com.smaato.sdk.core.analytics.ViewabilityTracker;
import com.smaato.sdk.core.util.p251fi.Consumer;

/* renamed from: com.smaato.sdk.openmeasurement.-$$Lambda$nkzhK3hMMJQO1nw8z4bB3V1PKfw  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$nkzhK3hMMJQO1nw8z4bB3V1PKfw implements Consumer {
    public static final /* synthetic */ $$Lambda$nkzhK3hMMJQO1nw8z4bB3V1PKfw INSTANCE = new $$Lambda$nkzhK3hMMJQO1nw8z4bB3V1PKfw();

    private /* synthetic */ $$Lambda$nkzhK3hMMJQO1nw8z4bB3V1PKfw() {
    }

    public final void accept(Object obj) {
        ((ViewabilityTracker) obj).trackImpression();
    }
}
