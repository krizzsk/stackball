package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

public class wy0 {

    /* renamed from: a */
    private final Handler f42326a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private C15124c f42327b = C15124c.INVALIDATED;

    /* renamed from: c */
    private xy0 f42328c;

    /* renamed from: d */
    private zd1 f42329d;

    /* renamed from: e */
    private long f42330e;

    /* renamed from: f */
    private long f42331f;

    /* renamed from: g */
    private final boolean f42332g;

    /* renamed from: com.yandex.mobile.ads.impl.wy0$b */
    private class C15123b implements Runnable {
        private C15123b() {
        }

        public void run() {
            wy0.this.m43893e();
            wy0.this.m43892c();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.wy0$c */
    private enum C15124c {
        INVALIDATED,
        ACTIVE,
        PAUSED
    }

    public wy0(boolean z) {
        this.f42332g = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m43892c() {
        this.f42327b = C15124c.ACTIVE;
        this.f42331f = SystemClock.elapsedRealtime();
        long min = Math.min(200, this.f42330e);
        if (min > 0) {
            this.f42326a.postDelayed(new C15123b(), min);
            return;
        }
        xy0 xy0 = this.f42328c;
        if (xy0 != null) {
            xy0.mo65511a();
        }
        mo70770a();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m43893e() {
        zd1 zd1;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.f42331f;
        this.f42331f = elapsedRealtime;
        long j2 = this.f42330e - j;
        this.f42330e = j2;
        if (j2 > 0 && (zd1 = this.f42329d) != null) {
            zd1.mo66670a(j2);
        }
    }

    /* renamed from: d */
    public void mo70774d() {
        if (C15124c.PAUSED.equals(this.f42327b)) {
            m43892c();
        }
    }

    /* renamed from: a */
    public void mo70771a(long j, xy0 xy0) {
        mo70770a();
        this.f42328c = xy0;
        this.f42330e = j;
        if (this.f42332g) {
            this.f42326a.post(new Runnable() {
                public final void run() {
                    wy0.this.m43892c();
                }
            });
        } else {
            m43892c();
        }
    }

    /* renamed from: b */
    public void mo70773b() {
        if (C15124c.ACTIVE.equals(this.f42327b)) {
            this.f42327b = C15124c.PAUSED;
            this.f42326a.removeCallbacksAndMessages((Object) null);
            m43893e();
        }
    }

    /* renamed from: a */
    public void mo70770a() {
        C15124c cVar = C15124c.INVALIDATED;
        if (!cVar.equals(this.f42327b)) {
            this.f42327b = cVar;
            this.f42328c = null;
            this.f42326a.removeCallbacksAndMessages((Object) null);
        }
    }

    /* renamed from: a */
    public void mo70772a(zd1 zd1) {
        this.f42329d = zd1;
    }
}
