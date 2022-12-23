package com.yandex.mobile.ads.impl;

public final class eb1 implements ml0 {

    /* renamed from: b */
    private final C13493jf f32944b;

    /* renamed from: c */
    private boolean f32945c;

    /* renamed from: d */
    private long f32946d;

    /* renamed from: e */
    private long f32947e;

    /* renamed from: f */
    private sz0 f32948f = sz0.f40189e;

    public eb1(C13493jf jfVar) {
        this.f32944b = jfVar;
    }

    /* renamed from: a */
    public void mo66794a() {
        if (!this.f32945c) {
            this.f32947e = this.f32944b.mo67515b();
            this.f32945c = true;
        }
    }

    /* renamed from: b */
    public void mo66796b() {
        if (this.f32945c) {
            mo66795a(mo64870r());
            this.f32945c = false;
        }
    }

    /* renamed from: m */
    public sz0 mo64869m() {
        return this.f32948f;
    }

    /* renamed from: r */
    public long mo64870r() {
        long j;
        long j2 = this.f32946d;
        if (!this.f32945c) {
            return j2;
        }
        long b = this.f32944b.mo67515b() - this.f32947e;
        sz0 sz0 = this.f32948f;
        if (sz0.f40190a == 1.0f) {
            j = C12874dd.m35212a(b);
        } else {
            j = sz0.mo70075a(b);
        }
        return j2 + j;
    }

    /* renamed from: a */
    public void mo66795a(long j) {
        this.f32946d = j;
        if (this.f32945c) {
            this.f32947e = this.f32944b.mo67515b();
        }
    }

    /* renamed from: a */
    public void mo64866a(sz0 sz0) {
        if (this.f32945c) {
            mo66795a(mo64870r());
        }
        this.f32948f = sz0;
    }
}
