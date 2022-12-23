package com.inmobi.media;

import java.io.Serializable;

/* renamed from: com.inmobi.media.ik */
/* compiled from: TimeoutConfigurations */
public final class C5394ik implements Serializable {
    public static final int DEFAULT_BITMAP_TIMEOUT = 5000;
    public static final int DEFAULT_RENDER_VIEW_TIMEOUT = 15000;
    public static final int DEFAULT_REQUEST_TIMEOUT = 6300;
    public static final int DEFAULT_TIMEOUT = 15000;
    private int bitmap = 5000;
    private int renderTimeout = 15000;
    private int request = DEFAULT_REQUEST_TIMEOUT;
    private int step1a = 15000;
    private int step1b = 15000;
    private int step2u = 15000;
    private int step3r = 15000;
    private int step4s = 15000;

    /* renamed from: a */
    public static C5394ik m12488a() {
        C5394ik ikVar = new C5394ik();
        ikVar.mo40766j();
        return ikVar;
    }

    /* renamed from: a */
    public final void mo40756a(int i) {
        this.bitmap = i;
    }

    /* renamed from: b */
    public final int mo40757b() {
        return this.bitmap;
    }

    /* renamed from: c */
    public final int mo40759c() {
        return this.step1a;
    }

    /* renamed from: d */
    public final int mo40760d() {
        return this.step1b;
    }

    /* renamed from: e */
    public final int mo40761e() {
        return this.step2u;
    }

    /* renamed from: f */
    public final int mo40762f() {
        return this.step3r;
    }

    /* renamed from: g */
    public final int mo40763g() {
        return this.step4s;
    }

    /* renamed from: b */
    public final void mo40758b(int i) {
        this.request = i;
    }

    /* renamed from: h */
    public final int mo40764h() {
        return this.request;
    }

    /* renamed from: i */
    public final int mo40765i() {
        return this.renderTimeout;
    }

    /* renamed from: j */
    public final void mo40766j() {
        int i = this.bitmap;
        if (i <= 0) {
            i = 5000;
        }
        this.bitmap = i;
        int i2 = this.step1a;
        int i3 = 15000;
        if (i2 <= 0) {
            i2 = 15000;
        }
        this.step1a = i2;
        int i4 = this.step1b;
        if (i4 <= 0) {
            i4 = 15000;
        }
        this.step1b = i4;
        int i5 = this.step2u;
        if (i5 <= 0) {
            i5 = 15000;
        }
        this.step2u = i5;
        int i6 = this.step3r;
        if (i6 <= 0) {
            i6 = 15000;
        }
        this.step3r = i6;
        int i7 = this.step4s;
        if (i7 <= 0) {
            i7 = 15000;
        }
        this.step4s = i7;
        int i8 = this.request;
        if (i8 <= 0) {
            i8 = DEFAULT_REQUEST_TIMEOUT;
        }
        this.request = i8;
        int i9 = this.renderTimeout;
        if (i9 > 0) {
            i3 = i9;
        }
        this.renderTimeout = i3;
    }
}
