package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.CBLogging;
import java.lang.ref.WeakReference;

/* renamed from: com.chartboost.sdk.impl.s */
public class C1977s extends C1994w {

    /* renamed from: e */
    private WeakReference<C1974r> f5083e;

    public C1977s(WeakReference<C1974r> weakReference, double d) {
        super(d);
        this.f5083e = weakReference;
    }

    /* renamed from: a */
    public void mo14787a() {
        WeakReference<C1974r> weakReference = this.f5083e;
        if (weakReference != null) {
            C1974r rVar = (C1974r) weakReference.get();
            if (rVar != null) {
                rVar.mo14145a();
            } else {
                CBLogging.m3991a("BannerRefreshTimer", "Refresh callback is disposed");
            }
        }
    }

    /* renamed from: i */
    public void mo14788i() {
        WeakReference<C1974r> weakReference = this.f5083e;
        if (weakReference != null) {
            weakReference.clear();
            this.f5083e = null;
        }
        super.mo14788i();
    }
}
