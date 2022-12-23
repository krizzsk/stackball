package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.fullscreen.template.design.binder.DesignComponentBinder;

/* renamed from: com.yandex.mobile.ads.impl.qg */
public class C14383qg<V extends ViewGroup> implements C12982el<V> {

    /* renamed from: a */
    private final DesignComponentBinder<V>[] f39108a;

    @SafeVarargs
    public C14383qg(DesignComponentBinder<V>... designComponentBinderArr) {
        this.f39108a = designComponentBinderArr;
    }

    /* renamed from: a */
    public void mo65684a(V v) {
        for (C12982el a : this.f39108a) {
            a.mo65684a(v);
        }
    }

    /* renamed from: c */
    public void mo65685c() {
        for (C12982el c : this.f39108a) {
            c.mo65685c();
        }
    }
}
