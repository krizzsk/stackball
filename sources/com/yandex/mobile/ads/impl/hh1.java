package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.tf1;
import java.util.List;

final class hh1 {

    /* renamed from: a */
    private final List<Format> f34422a;

    /* renamed from: b */
    private final ke1[] f34423b;

    public hh1(List<Format> list) {
        this.f34422a = list;
        this.f34423b = new ke1[list.size()];
    }

    /* renamed from: a */
    public void mo67557a(x50 x50, tf1.C14678d dVar) {
        for (int i = 0; i < this.f34423b.length; i++) {
            dVar.mo70177a();
            ke1 a = x50.mo65304a(dVar.mo70179c(), 3);
            Format format = this.f34422a.get(i);
            String str = format.f29530j;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            C13479j9.m37706a(z, "Invalid closed caption mime type provided: " + str);
            a.mo65339a(Format.m31684a(dVar.mo70178b(), str, (String) null, -1, format.f29524d, format.f29518B, format.f29519C, (DrmInitData) null, Long.MAX_VALUE, format.f29532l));
            this.f34423b[i] = a;
        }
    }

    /* renamed from: a */
    public void mo67556a(long j, fy0 fy0) {
        if (fy0.mo67098a() >= 9) {
            int f = fy0.mo67113f();
            int f2 = fy0.mo67113f();
            int r = fy0.mo67126r();
            if (f == 434 && f2 == 1195456820 && r == 3) {
                C14457re.m41572b(j, fy0, this.f34423b);
            }
        }
    }
}
