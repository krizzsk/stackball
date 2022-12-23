package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.inmobi.media.fv */
/* compiled from: EventSubmitter */
public class C5286fv {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f12093a = C5286fv.class.getSimpleName();

    /* renamed from: b */
    private static ScheduledExecutorService f12094b;

    /* renamed from: com.inmobi.media.fv$a */
    /* compiled from: EventSubmitter */
    static class C5288a {

        /* renamed from: a */
        static final C5286fv f12105a = new C5286fv((byte) 0);
    }

    /* synthetic */ C5286fv(byte b) {
        this();
    }

    /* renamed from: a */
    public static C5286fv m12104a() {
        return C5288a.f12105a;
    }

    private C5286fv() {
        f12094b = Executors.newSingleThreadScheduledExecutor();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40609a(C5283ft ftVar, String str, int i, int i2, long j, C5361hu huVar, C5289fw fwVar, boolean z) {
        C5283ft ftVar2 = ftVar;
        int i3 = i;
        int i4 = i2;
        if (!C5328gx.m12274a() || !C5314go.m12217j()) {
            fwVar.mo40606a(ftVar2, false);
            return;
        }
        final C5299gc gcVar = new C5299gc("POST", str, huVar);
        HashMap hashMap = new HashMap();
        hashMap.put("payload", ftVar2.f12079b);
        gcVar.mo40618c(hashMap);
        int i5 = i3 - i4;
        if (i5 > 0) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("X-im-retry-count", String.valueOf(i5));
            gcVar.mo40614a((Map<String, String>) hashMap2);
        }
        gcVar.f12142u = false;
        gcVar.f12136o = false;
        long j2 = 0;
        if (z) {
            if (i4 != i3) {
                j2 = ((long) Math.pow(2.0d, (double) i5)) * j;
            }
        } else if (i4 != i3) {
            j2 = j;
        }
        long j3 = j2;
        final int i6 = i2;
        final C5283ft ftVar3 = ftVar;
        final String str2 = str;
        final int i7 = i;
        final long j4 = j;
        final C5361hu huVar2 = huVar;
        final C5289fw fwVar2 = fwVar;
        final boolean z2 = z;
        f12094b.schedule(new Runnable() {
            public final void run() {
                C5300gd a = new C5301ge(gcVar).mo40629a();
                if (!a.mo40624a()) {
                    fwVar2.mo40605a(ftVar3);
                } else if (i6 > 1) {
                    String unused = C5286fv.f12093a;
                    a.mo40625b();
                    C5286fv.this.mo40609a(ftVar3, str2, i7, i6 - 1, j4, huVar2, fwVar2, z2);
                } else {
                    fwVar2.mo40606a(ftVar3, true);
                }
            }
        }, j3, TimeUnit.SECONDS);
    }
}
