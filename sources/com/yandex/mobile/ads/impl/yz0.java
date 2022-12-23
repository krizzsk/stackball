package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

public class yz0 {

    /* renamed from: a */
    private final C15146x4 f42987a;

    /* renamed from: b */
    private final C14557s1 f42988b;

    /* renamed from: c */
    private final bm1 f42989c;

    /* renamed from: d */
    private final C13472j3 f42990d;

    /* renamed from: e */
    private boolean f42991e = false;

    public yz0(C15146x4 x4Var, C14557s1 s1Var, bm1 bm1, C13472j3 j3Var) {
        this.f42987a = x4Var;
        this.f42988b = s1Var;
        this.f42989c = bm1;
        this.f42990d = j3Var;
    }

    /* renamed from: a */
    public void mo71137a(boolean z, int i) {
        e01 b = this.f42987a.mo70826b();
        if (b != null) {
            VideoAd b2 = b.mo66726b();
            C14436r2 a = b.mo66725a();
            if (qf0.NONE.equals(this.f42987a.mo70822a(b2))) {
                if (z && i == 2) {
                    this.f42989c.mo66099c();
                }
            } else if (i == 2) {
                this.f42991e = true;
                this.f42990d.onAdBufferingStarted(b2);
            } else if (i == 3 && this.f42991e) {
                this.f42991e = false;
                this.f42990d.onAdBufferingFinished(b2);
            } else if (i == 4) {
                this.f42988b.mo69849a(b2, a);
            }
        }
    }
}
