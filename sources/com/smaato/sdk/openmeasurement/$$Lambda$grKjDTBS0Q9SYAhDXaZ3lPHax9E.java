package com.smaato.sdk.openmeasurement;

import com.iab.omid.library.smaato.adsession.AdEvents;
import com.smaato.sdk.core.util.p251fi.Consumer;

/* renamed from: com.smaato.sdk.openmeasurement.-$$Lambda$grKjDTBS0Q9SYAhDXaZ3lPHax9E  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$grKjDTBS0Q9SYAhDXaZ3lPHax9E implements Consumer {
    public static final /* synthetic */ $$Lambda$grKjDTBS0Q9SYAhDXaZ3lPHax9E INSTANCE = new $$Lambda$grKjDTBS0Q9SYAhDXaZ3lPHax9E();

    private /* synthetic */ $$Lambda$grKjDTBS0Q9SYAhDXaZ3lPHax9E() {
    }

    public final void accept(Object obj) {
        ((AdEvents) obj).impressionOccurred();
    }
}
