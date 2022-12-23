package com.flurry.sdk;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.flurry.sdk.dj */
public class C2540dj {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f5959a = C2540dj.class.getSimpleName();

    /* renamed from: b */
    private Timer f5960b;

    /* renamed from: c */
    private C2541a f5961c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2542dk f5962d;

    public C2540dj(C2542dk dkVar) {
        this.f5962d = dkVar;
    }

    /* renamed from: a */
    public final synchronized void mo17755a() {
        if (this.f5960b != null) {
            this.f5960b.cancel();
            this.f5960b = null;
            C2530db.m5474a(3, f5959a, "HttpRequestTimeoutTimer stopped.");
        }
        this.f5961c = null;
    }

    /* renamed from: com.flurry.sdk.dj$a */
    class C2541a extends TimerTask {
        private C2541a() {
        }

        /* synthetic */ C2541a(C2540dj djVar, byte b) {
            this();
        }

        public final void run() {
            C2530db.m5474a(3, C2540dj.f5959a, "HttpRequest timed out. Cancelling.");
            C2542dk a = C2540dj.this.f5962d;
            long currentTimeMillis = System.currentTimeMillis() - a.f5977n;
            String str = C2542dk.f5964e;
            C2530db.m5474a(3, str, "Timeout (" + currentTimeMillis + "MS) for url: " + a.f5970g);
            a.f5980q = 629;
            a.f5983t = true;
            a.mo17763e();
            a.mo17764f();
        }
    }

    /* renamed from: a */
    public final synchronized void mo17756a(long j) {
        if (this.f5960b != null) {
            mo17755a();
        }
        this.f5960b = new Timer("HttpRequestTimeoutTimer");
        C2541a aVar = new C2541a(this, (byte) 0);
        this.f5961c = aVar;
        this.f5960b.schedule(aVar, j);
        String str = f5959a;
        C2530db.m5474a(3, str, "HttpRequestTimeoutTimer started: " + j + "MS");
    }
}
