package com.ironsource.mediationsdk;

import com.ironsource.lifecycle.C5541e;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.mediationsdk.v */
public final class C5807v {

    /* renamed from: a */
    private Runnable f14122a;

    /* renamed from: b */
    private int f14123b;

    /* renamed from: c */
    private C5812y f14124c;

    /* renamed from: d */
    private C5541e f14125d;

    /* renamed from: com.ironsource.mediationsdk.v$a */
    static class C5809a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static volatile C5807v f14128a = new C5807v((byte) 0);
    }

    private C5807v() {
        this.f14123b = 0;
    }

    /* synthetic */ C5807v(byte b) {
        this();
    }

    /* renamed from: b */
    private boolean m14369b() {
        return this.f14123b != -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo42138a() {
        if (m14369b() && this.f14125d != null) {
            IronLog.INTERNAL.info("canceling expiration timer");
            this.f14125d.mo41278c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo42139a(long j) {
        if (m14369b()) {
            long millis = TimeUnit.MINUTES.toMillis((long) this.f14123b) - Math.max(j, 0);
            if (millis > 0) {
                mo42138a();
                this.f14125d = new C5541e(millis, this.f14122a, true);
                Calendar instance = Calendar.getInstance();
                instance.add(14, (int) millis);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.info("loaded ads will expire on: " + instance.getTime() + " in " + String.format("%.2f", new Object[]{Double.valueOf((((double) millis) / 1000.0d) / 60.0d)}) + " mins");
                return;
            }
            IronLog.INTERNAL.info("loaded ads are loaded immediately");
            this.f14124c.mo41415d_();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo42140a(final C5812y yVar, int i) {
        this.f14124c = yVar;
        if (i > 0) {
            this.f14123b = i;
            this.f14122a = new Runnable() {
                public final void run() {
                    IronLog.INTERNAL.info("loaded ads are expired");
                    C5812y yVar = yVar;
                    if (yVar != null) {
                        yVar.mo41415d_();
                    }
                }
            };
        } else {
            this.f14123b = -1;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("initializing with expiredDurationInMinutes=" + this.f14123b);
    }
}
