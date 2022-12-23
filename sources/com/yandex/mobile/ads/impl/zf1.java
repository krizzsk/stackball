package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class zf1 implements yb1 {

    /* renamed from: b */
    private final wf1 f43107b;

    /* renamed from: c */
    private final long[] f43108c;

    /* renamed from: d */
    private final Map<String, yf1> f43109d;

    /* renamed from: e */
    private final Map<String, xf1> f43110e;

    /* renamed from: f */
    private final Map<String, String> f43111f;

    public zf1(wf1 wf1, Map<String, yf1> map, Map<String, xf1> map2, Map<String, String> map3) {
        this.f43107b = wf1;
        this.f43110e = map2;
        this.f43111f = map3;
        this.f43109d = Collections.unmodifiableMap(map);
        this.f43108c = wf1.mo70701b();
    }

    /* renamed from: a */
    public int mo66067a(long j) {
        int a = ih1.m37368a(this.f43108c, j, false, false);
        if (a < this.f43108c.length) {
            return a;
        }
        return -1;
    }

    /* renamed from: b */
    public List<C14683ti> mo66069b(long j) {
        return this.f43107b.mo70698a(j, this.f43109d, this.f43110e, this.f43111f);
    }

    /* renamed from: a */
    public int mo66066a() {
        return this.f43108c.length;
    }

    /* renamed from: a */
    public long mo66068a(int i) {
        return this.f43108c[i];
    }
}
