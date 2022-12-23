package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public class th1 {

    /* renamed from: a */
    private final Map<String, sh1> f40334a;

    /* renamed from: b */
    private List<th1> f40335b = new ArrayList();

    public th1(Map<String, ? extends sh1> map) {
        Intrinsics.checkNotNullParameter(map, "variables");
        this.f40334a = map;
    }

    /* renamed from: a */
    public void mo70186a(th1 th1) {
        Intrinsics.checkNotNullParameter(th1, "v");
        this.f40335b.add(th1);
    }

    /* renamed from: a */
    public sh1 mo70185a(String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        sh1 sh1 = this.f40334a.get(str);
        if (sh1 != null) {
            return sh1;
        }
        for (th1 a : this.f40335b) {
            sh1 a2 = a.mo70185a(str);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }
}
