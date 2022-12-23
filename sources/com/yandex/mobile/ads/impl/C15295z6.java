package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yandex.mobile.ads.impl.z6 */
public class C15295z6 {

    /* renamed from: a */
    private final Object f43025a = new Object();

    /* renamed from: b */
    private final List<C12958e7> f43026b = new CopyOnWriteArrayList();

    /* renamed from: a */
    public void mo71158a(Context context, C12958e7 e7Var) {
        synchronized (this.f43025a) {
            this.f43026b.add(e7Var);
            C15235y6.m44212a(context).mo71001b(e7Var);
        }
    }

    /* renamed from: a */
    public void mo71157a(Context context) {
        synchronized (this.f43025a) {
            C15235y6 a = C15235y6.m44212a(context);
            for (C12958e7 a2 : this.f43026b) {
                a.mo70999a(a2);
            }
            this.f43026b.clear();
        }
    }
}
