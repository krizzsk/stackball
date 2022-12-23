package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.C15511m0;
import java.util.ArrayList;
import java.util.List;

public class ds0 {

    /* renamed from: a */
    private final ir0 f32758a = new ir0();

    /* renamed from: c */
    private List<pq0> m35428c(AdResponse<as0> adResponse) {
        as0 z = adResponse.mo64447z();
        List<pq0> c = z != null ? z.mo65856c() : null;
        return c != null ? c : new ArrayList();
    }

    /* renamed from: a */
    public List<String> mo66665a(AdResponse<as0> adResponse) {
        List<pq0> c = m35428c(adResponse);
        ArrayList arrayList = new ArrayList();
        for (pq0 a : c) {
            arrayList.addAll(this.f32758a.mo67885a(a));
        }
        return arrayList;
    }

    /* renamed from: b */
    public List<String> mo66666b(AdResponse<as0> adResponse) {
        List<pq0> c = m35428c(adResponse);
        ArrayList arrayList = new ArrayList();
        for (pq0 a : c) {
            String a2 = a.mo69399a();
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public List<String> mo66667d(AdResponse<as0> adResponse) {
        List<pq0> c = m35428c(adResponse);
        ArrayList arrayList = new ArrayList();
        for (pq0 g : c) {
            C15511m0 g2 = g.mo69419g();
            if (g2 != null) {
                arrayList.add(g2.mo71709a());
            }
        }
        return arrayList;
    }
}
