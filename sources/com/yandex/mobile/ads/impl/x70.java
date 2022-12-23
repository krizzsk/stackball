package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;

public class x70 implements ax0 {

    /* renamed from: a */
    private WeakReference<C14384qh> f42466a;

    /* renamed from: b */
    private ch1 f42467b;

    /* renamed from: a */
    public void mo70842a(C14384qh qhVar) {
        this.f42466a = new WeakReference<>(qhVar);
    }

    /* renamed from: b */
    public void mo65921b() {
        WeakReference<C14384qh> weakReference = this.f42466a;
        C14384qh qhVar = weakReference != null ? (C14384qh) weakReference.get() : null;
        if (qhVar != null) {
            qhVar.mo67136g();
        }
    }

    /* renamed from: a */
    public void mo70841a(ch1 ch1) {
        this.f42467b = ch1;
    }

    /* renamed from: a */
    public void mo65920a(boolean z) {
        ch1 ch1 = this.f42467b;
        if (ch1 != null) {
            ch1.mo66019a(z);
        }
    }
}
