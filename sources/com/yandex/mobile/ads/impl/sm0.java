package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.mediation.base.C15434a;
import java.util.List;

public class sm0<T extends C15434a> {

    /* renamed from: a */
    private final List<hn0> f40062a;

    /* renamed from: b */
    private final ym0 f40063b;

    /* renamed from: c */
    private final um0<T> f40064c;

    /* renamed from: d */
    private int f40065d;

    public sm0(List<hn0> list, ym0 ym0, wm0 wm0) {
        this.f40062a = list;
        this.f40063b = ym0;
        this.f40064c = new um0<>(wm0);
    }

    /* renamed from: a */
    public nm0<T> mo70026a(Context context, Class<T> cls) {
        nm0<T> nm0 = null;
        while (nm0 == null && this.f40065d < this.f40062a.size()) {
            List<hn0> list = this.f40062a;
            int i = this.f40065d;
            this.f40065d = i + 1;
            hn0 hn0 = list.get(i);
            T a = this.f40064c.mo70374a(context, hn0, cls);
            if (a != null) {
                nm0 = new nm0<>(a, hn0, this.f40063b);
            }
        }
        return nm0;
    }
}
