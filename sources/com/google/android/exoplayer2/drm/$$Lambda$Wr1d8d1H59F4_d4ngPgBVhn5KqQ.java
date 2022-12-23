package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.util.Consumer;

/* renamed from: com.google.android.exoplayer2.drm.-$$Lambda$Wr1d8d1H59F4_d4ngPgBVhn5KqQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$Wr1d8d1H59F4_d4ngPgBVhn5KqQ implements Consumer {
    public static final /* synthetic */ $$Lambda$Wr1d8d1H59F4_d4ngPgBVhn5KqQ INSTANCE = new $$Lambda$Wr1d8d1H59F4_d4ngPgBVhn5KqQ();

    private /* synthetic */ $$Lambda$Wr1d8d1H59F4_d4ngPgBVhn5KqQ() {
    }

    public final void accept(Object obj) {
        ((DrmSessionEventListener.EventDispatcher) obj).drmSessionAcquired();
    }
}
