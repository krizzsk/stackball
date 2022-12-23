package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.Format;

public final class ie1 {

    /* renamed from: a */
    public final int f34833a;

    /* renamed from: b */
    public final int f34834b;

    /* renamed from: c */
    public final long f34835c;

    /* renamed from: d */
    public final long f34836d;

    /* renamed from: e */
    public final long f34837e;

    /* renamed from: f */
    public final Format f34838f;

    /* renamed from: g */
    public final int f34839g;

    /* renamed from: h */
    public final long[] f34840h;

    /* renamed from: i */
    public final long[] f34841i;

    /* renamed from: j */
    public final int f34842j;

    /* renamed from: k */
    private final je1[] f34843k;

    public ie1(int i, int i2, long j, long j2, long j3, Format format, int i3, je1[] je1Arr, int i4, long[] jArr, long[] jArr2) {
        this.f34833a = i;
        this.f34834b = i2;
        this.f34835c = j;
        this.f34836d = j2;
        this.f34837e = j3;
        this.f34838f = format;
        this.f34839g = i3;
        this.f34843k = je1Arr;
        this.f34842j = i4;
        this.f34840h = jArr;
        this.f34841i = jArr2;
    }

    /* renamed from: a */
    public je1 mo67778a(int i) {
        je1[] je1Arr = this.f34843k;
        if (je1Arr == null) {
            return null;
        }
        return je1Arr[i];
    }
}
