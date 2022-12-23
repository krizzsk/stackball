package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;

public class si0<V extends ViewGroup> {

    /* renamed from: a */
    private C12982el<V> f40006a;

    /* renamed from: a */
    public void mo69999a(ViewGroup viewGroup) {
        viewGroup.removeAllViews();
        C12982el<V> elVar = this.f40006a;
        if (elVar != null) {
            elVar.mo65685c();
        }
    }

    /* renamed from: a */
    public void mo70000a(ViewGroup viewGroup, V v, ri0<V> ri0) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        viewGroup.removeAllViews();
        viewGroup.addView(v, layoutParams);
        C12982el<V> a = ri0.mo69768a();
        this.f40006a = a;
        a.mo65684a(v);
    }
}
