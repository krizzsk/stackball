package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class mf1 {

    /* renamed from: a */
    private final lf1 f37367a = new lf1();

    /* renamed from: a */
    public List<View> mo68681a(List<View> list) {
        ArrayList arrayList = new ArrayList();
        for (View next : list) {
            if (this.f37367a.mo68418a(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
