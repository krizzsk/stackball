package com.flurry.sdk;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.flurry.sdk.ee */
final class C2608ee {

    /* renamed from: a */
    private Timer f6118a;

    /* renamed from: b */
    private C2609a f6119b;

    C2608ee() {
    }

    /* renamed from: a */
    public final synchronized void mo17815a(long j) {
        if (mo17816a()) {
            mo17817b();
        }
        this.f6118a = new Timer("FlurrySessionTimer");
        C2609a aVar = new C2609a();
        this.f6119b = aVar;
        this.f6118a.schedule(aVar, j);
    }

    /* renamed from: a */
    public final boolean mo17816a() {
        return this.f6118a != null;
    }

    /* renamed from: b */
    public final synchronized void mo17817b() {
        if (this.f6118a != null) {
            this.f6118a.cancel();
            this.f6118a = null;
        }
        this.f6119b = null;
    }

    /* renamed from: com.flurry.sdk.ee$a */
    class C2609a extends TimerTask {
        C2609a() {
        }

        public final void run() {
            C2608ee.this.mo17817b();
            C2511cw.m5419a().mo17721a((C2509cu) new C2610ef());
        }
    }
}
