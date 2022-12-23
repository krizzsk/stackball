package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.ke1;
import com.yandex.mobile.ads.impl.tf1;
import java.util.Collections;
import java.util.List;

public final class r20 implements a30 {

    /* renamed from: a */
    private final List<tf1.C14675a> f39347a;

    /* renamed from: b */
    private final ke1[] f39348b;

    /* renamed from: c */
    private boolean f39349c;

    /* renamed from: d */
    private int f39350d;

    /* renamed from: e */
    private int f39351e;

    /* renamed from: f */
    private long f39352f;

    public r20(List<tf1.C14675a> list) {
        this.f39347a = list;
        this.f39348b = new ke1[list.size()];
    }

    /* renamed from: a */
    public void mo65661a() {
        this.f39349c = false;
    }

    /* renamed from: b */
    public void mo65665b() {
        if (this.f39349c) {
            for (ke1 a : this.f39348b) {
                a.mo65337a(this.f39352f, 1, this.f39351e, 0, (ke1.C13702a) null);
            }
            this.f39349c = false;
        }
    }

    /* renamed from: a */
    public void mo65664a(x50 x50, tf1.C14678d dVar) {
        for (int i = 0; i < this.f39348b.length; i++) {
            tf1.C14675a aVar = this.f39347a.get(i);
            dVar.mo70177a();
            ke1 a = x50.mo65304a(dVar.mo70179c(), 3);
            a.mo65339a(Format.m31685a(dVar.mo70178b(), "application/dvbsubs", (String) null, -1, 0, Collections.singletonList(aVar.f40308b), aVar.f40307a, (DrmInitData) null));
            this.f39348b[i] = a;
        }
    }

    /* renamed from: a */
    public void mo65662a(long j, int i) {
        if ((i & 4) != 0) {
            this.f39349c = true;
            this.f39352f = j;
            this.f39351e = 0;
            this.f39350d = 2;
        }
    }

    /* renamed from: a */
    public void mo65663a(fy0 fy0) {
        if (!this.f39349c) {
            return;
        }
        if (this.f39350d != 2 || m41468a(fy0, 32)) {
            if (this.f39350d != 1 || m41468a(fy0, 0)) {
                int b = fy0.mo67105b();
                int a = fy0.mo67098a();
                for (ke1 a2 : this.f39348b) {
                    fy0.mo67112e(b);
                    a2.mo65341a(fy0, a);
                }
                this.f39351e += a;
            }
        }
    }

    /* renamed from: a */
    private boolean m41468a(fy0 fy0, int i) {
        if (fy0.mo67098a() == 0) {
            return false;
        }
        if (fy0.mo67126r() != i) {
            this.f39349c = false;
        }
        this.f39350d--;
        return this.f39349c;
    }
}
