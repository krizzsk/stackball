package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.C12227m;
import java.util.concurrent.TimeUnit;

class q40 {

    /* renamed from: c */
    private static final long f38991c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a */
    private final wy0 f38992a = new wy0(false);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C12227m.C12228a f38993b;

    /* renamed from: com.yandex.mobile.ads.impl.q40$b */
    private class C14355b implements xy0 {
        private C14355b() {
        }

        /* renamed from: a */
        public void mo65511a() {
            q40.this.f38993b.mo64986a(k40.m38186a("Video load error occurred"));
        }
    }

    public q40(C12227m.C12228a aVar) {
        this.f38993b = aVar;
    }

    /* renamed from: b */
    public void mo69486b() {
        this.f38992a.mo70770a();
    }

    /* renamed from: a */
    public void mo69485a() {
        this.f38992a.mo70771a(f38991c, new C14355b());
    }
}
