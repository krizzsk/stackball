package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import java.util.concurrent.TimeUnit;

class dt0 implements y70 {

    /* renamed from: d */
    private static final long f32763d = TimeUnit.SECONDS.toMillis(5);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final r11 f32764a;

    /* renamed from: b */
    private final wy0 f32765b = new wy0(false);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final long f32766c;

    /* renamed from: com.yandex.mobile.ads.impl.dt0$b */
    private class C12920b implements xy0, zd1 {
        private C12920b() {
        }

        /* renamed from: a */
        public void mo65511a() {
            dt0.this.f32764a.mo68508a();
        }

        /* renamed from: a */
        public void mo66670a(long j) {
            dt0.this.f32764a.mo68509a(dt0.this.f32766c, dt0.this.f32766c - j);
        }
    }

    public dt0(AdResponse<?> adResponse, r11 r11) {
        this.f32764a = r11;
        this.f32766c = m35440a(adResponse);
    }

    public void invalidate() {
        this.f32765b.mo70770a();
    }

    public void pause() {
        this.f32765b.mo70773b();
    }

    public void resume() {
        this.f32765b.mo70774d();
    }

    /* renamed from: a */
    public void mo65894a() {
        C12920b bVar = new C12920b();
        this.f32765b.mo70771a(this.f32766c, bVar);
        this.f32765b.mo70772a((zd1) bVar);
    }

    /* renamed from: a */
    private long m35440a(AdResponse<?> adResponse) {
        Long B = adResponse.mo64411B();
        if (B == null) {
            B = Long.valueOf(f32763d);
        }
        return B.longValue();
    }
}
