package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

public class ql1 {
    /* renamed from: a */
    public pl1 mo69621a(List<lj1> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (lj1 next : list) {
            if (next.mo68469n()) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        return new pl1(arrayList, arrayList2);
    }
}
