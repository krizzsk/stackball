package com.p243my.tracker.plugins;

import com.p243my.tracker.obfuscated.C7828m;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.my.tracker.plugins.PluginEventTracker */
public final class PluginEventTracker {

    /* renamed from: b */
    private static final Executor f20209b = Executors.newSingleThreadExecutor();

    /* renamed from: a */
    private final C7828m f20210a;

    private PluginEventTracker(C7828m mVar) {
        this.f20210a = mVar;
    }

    public static PluginEventTracker newTracker(C7828m mVar) {
        return new PluginEventTracker(mVar);
    }

    public static void onBackground(Runnable runnable) {
        f20209b.execute(runnable);
    }

    public void trackPluginEvent(int i, byte[] bArr, boolean z, boolean z2, Runnable runnable) {
        this.f20210a.mo52352a(i, bArr, z, z2, runnable);
    }
}
