package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.ke1;
import com.yandex.mobile.ads.impl.tf1;

public final class ya1 implements q71 {

    /* renamed from: a */
    private de1 f42798a;

    /* renamed from: b */
    private ke1 f42799b;

    /* renamed from: c */
    private boolean f42800c;

    /* renamed from: a */
    public void mo69504a(de1 de1, x50 x50, tf1.C14678d dVar) {
        this.f42798a = de1;
        dVar.mo70177a();
        ke1 a = x50.mo65304a(dVar.mo70179c(), 4);
        this.f42799b = a;
        a.mo65339a(Format.m31686a(dVar.mo70178b(), "application/x-scte35", (String) null, -1, (DrmInitData) null));
    }

    /* renamed from: a */
    public void mo69505a(fy0 fy0) {
        if (!this.f42800c) {
            if (this.f42798a.mo66567c() != -9223372036854775807L) {
                this.f42799b.mo65339a(Format.m31679a((String) null, "application/x-scte35", this.f42798a.mo66567c()));
                this.f42800c = true;
            } else {
                return;
            }
        }
        int a = fy0.mo67098a();
        this.f42799b.mo65341a(fy0, a);
        this.f42799b.mo65337a(this.f42798a.mo66565b(), 1, a, 0, (ke1.C13702a) null);
    }
}
