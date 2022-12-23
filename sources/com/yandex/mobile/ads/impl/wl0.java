package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.models.p268ad.C15566b;

public class wl0 {

    /* renamed from: a */
    private final ul0 f42028a;

    /* renamed from: b */
    private final C14178oc f42029b;

    public wl0(Context context) {
        ul0 a = new g31(context).mo67180a();
        this.f42028a = a;
        this.f42029b = new C14178oc(a);
    }

    /* renamed from: a */
    public C15566b mo70712a(C13413ii iiVar) {
        double d;
        double d2 = -1.0d;
        C15566b bVar = null;
        for (C15566b next : iiVar.mo67789f()) {
            double d3 = "video/mp4".equals(next.mo71984c()) ? 1.5d : 1.0d;
            int a = this.f42029b.mo69133a(next);
            int a2 = this.f42028a.mo70368a();
            int max = Math.max(0, a);
            if (max < 100) {
                d = 10.0d;
            } else {
                d = ((double) Math.abs(a2 - max)) / ((double) a2);
            }
            double d4 = d3 / (d + 1.0d);
            if (d4 > d2) {
                bVar = next;
                d2 = d4;
            }
        }
        return bVar;
    }
}
