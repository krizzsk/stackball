package com.yandex.mobile.ads.impl;

import java.util.List;

public abstract class dc1 extends kx0 implements yb1 {

    /* renamed from: d */
    private yb1 f32533d;

    /* renamed from: e */
    private long f32534e;

    /* renamed from: a */
    public void mo66556a(long j, yb1 yb1, long j2) {
        this.f36447c = j;
        this.f32533d = yb1;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f32534e = j;
    }

    /* renamed from: b */
    public List<C14683ti> mo66069b(long j) {
        yb1 yb1 = this.f32533d;
        yb1.getClass();
        return yb1.mo66069b(j - this.f32534e);
    }

    /* renamed from: b */
    public void mo66557b() {
        super.mo66557b();
        this.f32533d = null;
    }

    /* renamed from: a */
    public int mo66066a() {
        yb1 yb1 = this.f32533d;
        yb1.getClass();
        return yb1.mo66066a();
    }

    /* renamed from: a */
    public long mo66068a(int i) {
        yb1 yb1 = this.f32533d;
        yb1.getClass();
        return yb1.mo66068a(i) + this.f32534e;
    }

    /* renamed from: a */
    public int mo66067a(long j) {
        yb1 yb1 = this.f32533d;
        yb1.getClass();
        return yb1.mo66067a(j - this.f32534e);
    }
}
