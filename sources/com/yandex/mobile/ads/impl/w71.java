package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.tf1;
import java.util.List;

public final class w71 {

    /* renamed from: a */
    private final List<Format> f41888a;

    /* renamed from: b */
    private final ke1[] f41889b;

    public w71(List<Format> list) {
        this.f41888a = list;
        this.f41889b = new ke1[list.size()];
    }

    /* renamed from: a */
    public void mo70658a(x50 x50, tf1.C14678d dVar) {
        for (int i = 0; i < this.f41889b.length; i++) {
            dVar.mo70177a();
            ke1 a = x50.mo65304a(dVar.mo70179c(), 3);
            Format format = this.f41888a.get(i);
            String str = format.f29530j;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            C13479j9.m37706a(z, "Invalid closed caption mime type provided: " + str);
            String str2 = format.f29522b;
            if (str2 == null) {
                str2 = dVar.mo70178b();
            }
            a.mo65339a(Format.m31684a(str2, str, (String) null, -1, format.f29524d, format.f29518B, format.f29519C, (DrmInitData) null, Long.MAX_VALUE, format.f29532l));
            this.f41889b[i] = a;
        }
    }

    /* renamed from: a */
    public void mo70657a(long j, fy0 fy0) {
        C14457re.m41571a(j, fy0, this.f41889b);
    }
}
