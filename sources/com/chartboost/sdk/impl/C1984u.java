package com.chartboost.sdk.impl;

import java.lang.ref.WeakReference;

/* renamed from: com.chartboost.sdk.impl.u */
public class C1984u extends C1994w {

    /* renamed from: e */
    private WeakReference<C1980t> f5098e;

    public C1984u(WeakReference<C1980t> weakReference, double d) {
        super(d);
        this.f5098e = weakReference;
    }

    /* renamed from: a */
    public void mo14787a() {
        C1980t tVar;
        WeakReference<C1980t> weakReference = this.f5098e;
        if (weakReference != null && (tVar = (C1980t) weakReference.get()) != null) {
            tVar.mo14151b();
        }
    }

    /* renamed from: i */
    public void mo14788i() {
        WeakReference<C1980t> weakReference = this.f5098e;
        if (weakReference != null) {
            weakReference.clear();
            this.f5098e = null;
        }
        super.mo14788i();
    }
}
