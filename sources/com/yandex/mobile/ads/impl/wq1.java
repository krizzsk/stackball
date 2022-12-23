package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Collections;
import java.util.List;

public class wq1 {

    /* renamed from: a */
    private final ql1 f42199a = new ql1();

    /* renamed from: b */
    private final br1 f42200b;

    /* renamed from: c */
    private final rq1 f42201c;

    public wq1(Context context, lj1 lj1) {
        this.f42200b = new br1(lj1);
        this.f42201c = new rq1(context, lj1);
    }

    /* renamed from: a */
    public List<lj1> mo70740a(List<lj1> list) {
        zq1 a = this.f42200b.mo66110a();
        if (a == null) {
            return list;
        }
        if (!a.mo71276b()) {
            list = this.f42199a.mo69621a(list).mo69384a();
        }
        if (!a.mo71275a() && !list.isEmpty()) {
            list = Collections.singletonList(list.get(0));
        }
        return this.f42201c.mo69806a(list);
    }
}
