package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;

public class n70 implements o70 {

    /* renamed from: a */
    private WeakReference<o70> f37659a;

    /* renamed from: a */
    public void mo68929a(o70 o70) {
        this.f37659a = new WeakReference<>(o70);
    }

    /* renamed from: b */
    public void mo68930b() {
        o70 o70;
        WeakReference<o70> weakReference = this.f37659a;
        if (weakReference != null && (o70 = (o70) weakReference.get()) != null) {
            o70.mo68930b();
        }
    }
}
