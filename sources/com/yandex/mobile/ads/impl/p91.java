package com.yandex.mobile.ads.impl;

import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;

public final class p91 {

    /* renamed from: a */
    private final float f38563a;

    /* renamed from: b */
    private final Typeface f38564b;

    /* renamed from: c */
    private final float f38565c;

    /* renamed from: d */
    private final float f38566d;

    /* renamed from: e */
    private final int f38567e;

    public p91(float f, Typeface typeface, float f2, float f3, int i) {
        Intrinsics.checkNotNullParameter(typeface, "fontWeight");
        this.f38563a = f;
        this.f38564b = typeface;
        this.f38565c = f2;
        this.f38566d = f3;
        this.f38567e = i;
    }

    /* renamed from: a */
    public final float mo69336a() {
        return this.f38563a;
    }

    /* renamed from: b */
    public final Typeface mo69337b() {
        return this.f38564b;
    }

    /* renamed from: c */
    public final float mo69338c() {
        return this.f38565c;
    }

    /* renamed from: d */
    public final float mo69339d() {
        return this.f38566d;
    }

    /* renamed from: e */
    public final int mo69340e() {
        return this.f38567e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p91)) {
            return false;
        }
        p91 p91 = (p91) obj;
        return Intrinsics.areEqual((Object) Float.valueOf(this.f38563a), (Object) Float.valueOf(p91.f38563a)) && Intrinsics.areEqual((Object) this.f38564b, (Object) p91.f38564b) && Intrinsics.areEqual((Object) Float.valueOf(this.f38565c), (Object) Float.valueOf(p91.f38565c)) && Intrinsics.areEqual((Object) Float.valueOf(this.f38566d), (Object) Float.valueOf(p91.f38566d)) && this.f38567e == p91.f38567e;
    }

    public int hashCode() {
        return (((((((Float.floatToIntBits(this.f38563a) * 31) + this.f38564b.hashCode()) * 31) + Float.floatToIntBits(this.f38565c)) * 31) + Float.floatToIntBits(this.f38566d)) * 31) + this.f38567e;
    }

    public String toString() {
        return "SliderTextStyle(fontSize=" + this.f38563a + ", fontWeight=" + this.f38564b + ", offsetX=" + this.f38565c + ", offsetY=" + this.f38566d + ", textColor=" + this.f38567e + ')';
    }
}
