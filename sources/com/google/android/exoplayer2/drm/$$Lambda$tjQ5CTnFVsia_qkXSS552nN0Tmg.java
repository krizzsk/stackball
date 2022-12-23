package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.util.Consumer;

/* renamed from: com.google.android.exoplayer2.drm.-$$Lambda$tjQ5CTnFVsia_qkXSS552nN0Tmg  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$tjQ5CTnFVsia_qkXSS552nN0Tmg implements Consumer {
    public static final /* synthetic */ $$Lambda$tjQ5CTnFVsia_qkXSS552nN0Tmg INSTANCE = new $$Lambda$tjQ5CTnFVsia_qkXSS552nN0Tmg();

    private /* synthetic */ $$Lambda$tjQ5CTnFVsia_qkXSS552nN0Tmg() {
    }

    public final void accept(Object obj) {
        ((DrmSessionEventListener.EventDispatcher) obj).drmSessionReleased();
    }
}
