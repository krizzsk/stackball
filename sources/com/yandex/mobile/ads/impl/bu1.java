package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import com.yandex.mobile.ads.impl.dt1;

public class bu1 implements pt1, dt1.C12921a {

    /* renamed from: f */
    private static bu1 f31588f;

    /* renamed from: a */
    private float f31589a = 0.0f;

    /* renamed from: b */
    private final yt1 f31590b;

    /* renamed from: c */
    private final ct1 f31591c;

    /* renamed from: d */
    private tt1 f31592d;

    /* renamed from: e */
    private us1 f31593e;

    public bu1(yt1 yt1, ct1 ct1) {
        this.f31590b = yt1;
        this.f31591c = ct1;
    }

    /* renamed from: a */
    public static bu1 m34401a() {
        if (f31588f == null) {
            f31588f = new bu1(new yt1(), new ct1());
        }
        return f31588f;
    }

    /* renamed from: a */
    public void mo66122a(float f) {
        this.f31589a = f;
        if (this.f31593e == null) {
            this.f31593e = us1.m42837a();
        }
        for (ts1 i : this.f31593e.mo70402c()) {
            vt1.m43343a().mo70582a(i.mo70228i().mo69867e(), f);
        }
    }

    /* renamed from: b */
    public void mo66124b() {
        dt1.m35446a().mo66671a((dt1.C12921a) this);
        dt1.m35446a().mo66672b();
        gf1.m36600g().mo67294a();
        this.f31592d.mo70234a();
    }

    /* renamed from: c */
    public void mo66125c() {
        gf1.m36600g().mo67296b();
        dt1.m35446a().mo66673c();
        this.f31592d.mo70235b();
    }

    /* renamed from: d */
    public float mo66126d() {
        return this.f31589a;
    }

    /* renamed from: a */
    public void mo66123a(Context context) {
        this.f31591c.getClass();
        ss1 ss1 = new ss1();
        yt1 yt1 = this.f31590b;
        Handler handler = new Handler();
        yt1.getClass();
        this.f31592d = new tt1(handler, context, ss1, this);
    }
}
