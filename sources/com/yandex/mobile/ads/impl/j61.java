package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

public final class j61 {

    /* renamed from: a */
    private final float f35132a;

    /* renamed from: b */
    private final float f35133b;

    /* renamed from: c */
    private final int f35134c;

    /* renamed from: d */
    private final float f35135d;

    /* renamed from: e */
    private final Integer f35136e;

    /* renamed from: f */
    private final Float f35137f;

    public j61(float f, float f2, int i, float f3, Integer num, Float f4) {
        this.f35132a = f;
        this.f35133b = f2;
        this.f35134c = i;
        this.f35135d = f3;
        this.f35136e = num;
        this.f35137f = f4;
    }

    /* renamed from: a */
    public final int mo67933a() {
        return this.f35134c;
    }

    /* renamed from: b */
    public final float mo67934b() {
        return this.f35133b;
    }

    /* renamed from: c */
    public final float mo67935c() {
        return this.f35135d;
    }

    /* renamed from: d */
    public final Integer mo67936d() {
        return this.f35136e;
    }

    /* renamed from: e */
    public final Float mo67937e() {
        return this.f35137f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j61)) {
            return false;
        }
        j61 j61 = (j61) obj;
        return Intrinsics.areEqual((Object) Float.valueOf(this.f35132a), (Object) Float.valueOf(j61.f35132a)) && Intrinsics.areEqual((Object) Float.valueOf(this.f35133b), (Object) Float.valueOf(j61.f35133b)) && this.f35134c == j61.f35134c && Intrinsics.areEqual((Object) Float.valueOf(this.f35135d), (Object) Float.valueOf(j61.f35135d)) && Intrinsics.areEqual((Object) this.f35136e, (Object) j61.f35136e) && Intrinsics.areEqual((Object) this.f35137f, (Object) j61.f35137f);
    }

    /* renamed from: f */
    public final float mo67939f() {
        return this.f35132a;
    }

    public int hashCode() {
        int floatToIntBits = ((((((Float.floatToIntBits(this.f35132a) * 31) + Float.floatToIntBits(this.f35133b)) * 31) + this.f35134c) * 31) + Float.floatToIntBits(this.f35135d)) * 31;
        Integer num = this.f35136e;
        int i = 0;
        int hashCode = (floatToIntBits + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.f35137f;
        if (f != null) {
            i = f.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "RoundedRectParams(width=" + this.f35132a + ", height=" + this.f35133b + ", color=" + this.f35134c + ", radius=" + this.f35135d + ", strokeColor=" + this.f35136e + ", strokeWidth=" + this.f35137f + ')';
    }
}
