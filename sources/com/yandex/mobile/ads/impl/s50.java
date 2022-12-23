package com.yandex.mobile.ads.impl;

import java.util.List;

public class s50 {

    /* renamed from: a */
    private final List<r50> f39857a;

    public s50(yj1 yj1) {
        this.f39857a = yj1.mo71091a();
    }

    /* renamed from: a */
    public boolean mo69887a(String str, String str2) {
        for (r50 next : this.f39857a) {
            if (next.mo69693a().equals(str) && next.mo69694b().equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
