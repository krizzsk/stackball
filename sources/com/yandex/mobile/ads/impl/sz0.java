package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;

public final class sz0 {

    /* renamed from: e */
    public static final sz0 f40189e = new sz0(1.0f, 1.0f, false);

    /* renamed from: a */
    public final float f40190a;

    /* renamed from: b */
    public final float f40191b;

    /* renamed from: c */
    public final boolean f40192c;

    /* renamed from: d */
    private final int f40193d;

    public sz0(float f, float f2, boolean z) {
        boolean z2 = true;
        C13479j9.m37705a(f > 0.0f);
        C13479j9.m37705a(f2 <= 0.0f ? false : z2);
        this.f40190a = f;
        this.f40191b = f2;
        this.f40192c = z;
        this.f40193d = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public long mo70075a(long j) {
        return j * ((long) this.f40193d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sz0.class != obj.getClass()) {
            return false;
        }
        sz0 sz0 = (sz0) obj;
        if (this.f40190a == sz0.f40190a && this.f40191b == sz0.f40191b && this.f40192c == sz0.f40192c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((Float.floatToRawIntBits(this.f40190a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.floatToRawIntBits(this.f40191b)) * 31) + (this.f40192c ? 1 : 0);
    }
}
