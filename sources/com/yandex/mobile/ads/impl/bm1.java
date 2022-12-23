package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;

public class bm1 {

    /* renamed from: a */
    private final C12952e3 f31369a;

    /* renamed from: b */
    private final am1 f31370b;

    /* renamed from: c */
    private final rm1 f31371c;

    /* renamed from: d */
    private boolean f31372d;

    public bm1(C12952e3 e3Var, cm1 cm1, u01 u01, rm1 rm1) {
        this.f31369a = e3Var;
        this.f31371c = rm1;
        this.f31370b = new am1(cm1, u01);
    }

    /* renamed from: a */
    public void mo66097a() {
        if (!this.f31372d) {
            this.f31372d = true;
            AdPlaybackState a = this.f31369a.mo66746a();
            for (int i = 0; i < a.adGroupCount; i++) {
                if (a.adGroupTimesUs[i] != Long.MIN_VALUE) {
                    if (a.adGroups[i].count < 0) {
                        a = a.withAdCount(i, 1);
                    }
                    a = a.withSkippedAdGroup(i);
                    this.f31369a.mo66747a(a);
                }
            }
            this.f31371c.onVideoCompleted();
        }
    }

    /* renamed from: b */
    public boolean mo66098b() {
        return this.f31372d;
    }

    /* renamed from: c */
    public void mo66099c() {
        if (this.f31370b.mo65823a()) {
            mo66097a();
        }
    }
}
