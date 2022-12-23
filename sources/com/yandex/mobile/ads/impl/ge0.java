package com.yandex.mobile.ads.impl;

import com.tapjoy.TJAdUnitConstants;
import kotlin.jvm.internal.Intrinsics;

public final class ge0 {

    /* renamed from: a */
    private int f33960a;

    /* renamed from: b */
    private int f33961b;

    /* renamed from: c */
    private float f33962c;

    /* renamed from: d */
    private float f33963d;

    /* renamed from: e */
    private float f33964e;

    /* renamed from: f */
    private float f33965f;

    /* renamed from: g */
    private float f33966g;

    /* renamed from: h */
    private float f33967h;

    /* renamed from: i */
    private float f33968i;

    /* renamed from: j */
    private float f33969j;

    /* renamed from: k */
    private float f33970k;

    /* renamed from: l */
    private float f33971l;

    /* renamed from: m */
    private ee0 f33972m;

    /* renamed from: n */
    private fe0 f33973n;

    public ge0(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, ee0 ee0, fe0 fe0) {
        Intrinsics.checkNotNullParameter(ee0, TJAdUnitConstants.String.SPLIT_VIEW_ANIMATION);
        Intrinsics.checkNotNullParameter(fe0, "shape");
        this.f33960a = i;
        this.f33961b = i2;
        this.f33962c = f;
        this.f33963d = f2;
        this.f33964e = f3;
        this.f33965f = f4;
        this.f33966g = f5;
        this.f33967h = f6;
        this.f33968i = f7;
        this.f33969j = f8;
        this.f33970k = f9;
        this.f33971l = f10;
        this.f33972m = ee0;
        this.f33973n = fe0;
    }

    /* renamed from: a */
    public final ee0 mo67254a() {
        return this.f33972m;
    }

    /* renamed from: b */
    public final int mo67255b() {
        return this.f33960a;
    }

    /* renamed from: c */
    public final float mo67256c() {
        return this.f33968i;
    }

    /* renamed from: d */
    public final float mo67257d() {
        return this.f33970k;
    }

    /* renamed from: e */
    public final float mo67258e() {
        return this.f33967h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge0)) {
            return false;
        }
        ge0 ge0 = (ge0) obj;
        return this.f33960a == ge0.f33960a && this.f33961b == ge0.f33961b && Intrinsics.areEqual((Object) Float.valueOf(this.f33962c), (Object) Float.valueOf(ge0.f33962c)) && Intrinsics.areEqual((Object) Float.valueOf(this.f33963d), (Object) Float.valueOf(ge0.f33963d)) && Intrinsics.areEqual((Object) Float.valueOf(this.f33964e), (Object) Float.valueOf(ge0.f33964e)) && Intrinsics.areEqual((Object) Float.valueOf(this.f33965f), (Object) Float.valueOf(ge0.f33965f)) && Intrinsics.areEqual((Object) Float.valueOf(this.f33966g), (Object) Float.valueOf(ge0.f33966g)) && Intrinsics.areEqual((Object) Float.valueOf(this.f33967h), (Object) Float.valueOf(ge0.f33967h)) && Intrinsics.areEqual((Object) Float.valueOf(this.f33968i), (Object) Float.valueOf(ge0.f33968i)) && Intrinsics.areEqual((Object) Float.valueOf(this.f33969j), (Object) Float.valueOf(ge0.f33969j)) && Intrinsics.areEqual((Object) Float.valueOf(this.f33970k), (Object) Float.valueOf(ge0.f33970k)) && Intrinsics.areEqual((Object) Float.valueOf(this.f33971l), (Object) Float.valueOf(ge0.f33971l)) && this.f33972m == ge0.f33972m && this.f33973n == ge0.f33973n;
    }

    /* renamed from: f */
    public final float mo67260f() {
        return this.f33964e;
    }

    /* renamed from: g */
    public final float mo67261g() {
        return this.f33965f;
    }

    /* renamed from: h */
    public final float mo67262h() {
        return this.f33962c;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.f33960a * 31) + this.f33961b) * 31) + Float.floatToIntBits(this.f33962c)) * 31) + Float.floatToIntBits(this.f33963d)) * 31) + Float.floatToIntBits(this.f33964e)) * 31) + Float.floatToIntBits(this.f33965f)) * 31) + Float.floatToIntBits(this.f33966g)) * 31) + Float.floatToIntBits(this.f33967h)) * 31) + Float.floatToIntBits(this.f33968i)) * 31) + Float.floatToIntBits(this.f33969j)) * 31) + Float.floatToIntBits(this.f33970k)) * 31) + Float.floatToIntBits(this.f33971l)) * 31) + this.f33972m.hashCode()) * 31) + this.f33973n.hashCode();
    }

    /* renamed from: i */
    public final int mo67264i() {
        return this.f33961b;
    }

    /* renamed from: j */
    public final float mo67265j() {
        return this.f33969j;
    }

    /* renamed from: k */
    public final float mo67266k() {
        return this.f33966g;
    }

    /* renamed from: l */
    public final float mo67267l() {
        return this.f33963d;
    }

    /* renamed from: m */
    public final fe0 mo67268m() {
        return this.f33973n;
    }

    /* renamed from: n */
    public final float mo67269n() {
        return this.f33971l;
    }

    public String toString() {
        return "Style(color=" + this.f33960a + ", selectedColor=" + this.f33961b + ", normalWidth=" + this.f33962c + ", selectedWidth=" + this.f33963d + ", minimumWidth=" + this.f33964e + ", normalHeight=" + this.f33965f + ", selectedHeight=" + this.f33966g + ", minimumHeight=" + this.f33967h + ", cornerRadius=" + this.f33968i + ", selectedCornerRadius=" + this.f33969j + ", minimumCornerRadius=" + this.f33970k + ", spaceBetweenCenters=" + this.f33971l + ", animation=" + this.f33972m + ", shape=" + this.f33973n + ')';
    }
}
