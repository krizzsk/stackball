package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public class fk1<T> {

    /* renamed from: a */
    private final ol1 f33382a = new ol1();

    /* renamed from: b */
    private final ri1 f33383b;

    /* renamed from: c */
    private final dk1<T> f33384c;

    public fk1(Context context, pk1<T> pk1) {
        this.f33383b = new ri1(context);
        this.f33384c = new dk1<>(pk1);
    }

    /* renamed from: a */
    public List<ck1<T>> mo67025a(List<lj1> list) {
        ArrayList arrayList = (ArrayList) this.f33383b.mo69772a(this.f33382a.mo69205b(list));
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(this.f33384c.mo66613a((qi1) arrayList.get(i), size, i));
        }
        return arrayList2;
    }
}
