package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

public final class o91 implements ce0 {

    /* renamed from: a */
    private final ge0 f38126a;

    /* renamed from: b */
    private float f38127b;

    /* renamed from: c */
    private final RectF f38128c = new RectF();

    /* renamed from: d */
    private final float f38129d;

    public o91(ge0 ge0) {
        Intrinsics.checkNotNullParameter(ge0, "style");
        this.f38126a = ge0;
        this.f38129d = ge0.mo67269n();
    }

    /* renamed from: a */
    public int mo66270a(int i) {
        return this.f38126a.mo67255b();
    }

    /* renamed from: b */
    public float mo66273b(int i) {
        return this.f38126a.mo67261g();
    }

    /* renamed from: c */
    public float mo66274c(int i) {
        return this.f38126a.mo67262h();
    }

    /* renamed from: d */
    public void mo66275d(int i) {
    }

    /* renamed from: e */
    public float mo66276e(int i) {
        return this.f38126a.mo67256c();
    }

    public void onPageSelected(int i) {
    }

    /* renamed from: a */
    public void mo66272a(int i, float f) {
        this.f38127b = f;
    }

    /* renamed from: a */
    public RectF mo66271a(float f, float f2) {
        this.f38128c.left = (RangesKt.coerceAtLeast(this.f38129d * this.f38127b, 0.0f) + f) - (this.f38126a.mo67267l() / 2.0f);
        this.f38128c.top = f2 - (this.f38126a.mo67266k() / 2.0f);
        RectF rectF = this.f38128c;
        float f3 = this.f38129d;
        rectF.right = f + RangesKt.coerceAtMost(this.f38127b * f3, f3) + (this.f38126a.mo67267l() / 2.0f);
        this.f38128c.bottom = f2 + (this.f38126a.mo67266k() / 2.0f);
        return this.f38128c;
    }
}
