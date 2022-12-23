package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C14160o1;
import com.yandex.mobile.ads.instream.InstreamAd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class nk0 {

    /* renamed from: a */
    private final C14050n1 f37820a = new C14050n1();

    /* renamed from: b */
    private final C14160o1 f37821b = new C14160o1();

    /* renamed from: c */
    private final ng0 f37822c;

    /* renamed from: d */
    private final ik0 f37823d;

    public nk0(Context context, InstreamAd instreamAd) {
        ng0 a = new ug0().mo70349a(instreamAd);
        this.f37822c = a;
        this.f37823d = new ik0(context, a);
    }

    /* renamed from: a */
    public List<hk0> mo69041a(String str) {
        List<og0> a = this.f37820a.mo68879a(str, this.f37822c.getAdBreaks());
        this.f37821b.getClass();
        ArrayList arrayList = new ArrayList(a);
        Collections.sort(arrayList, new C14160o1.C14162b());
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(this.f37823d.mo67814a((og0) it.next()));
        }
        return arrayList3;
    }
}
