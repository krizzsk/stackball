package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;

public class ui0<V extends ViewGroup> {

    /* renamed from: a */
    private final List<ri0<V>> f40652a;

    public ui0(List<ri0<V>> list) {
        this.f40652a = list;
    }

    /* renamed from: a */
    public ri0<V> mo70350a(Context context) {
        for (ri0<V> next : this.f40652a) {
            if (next.mo69769b().mo67026a(context)) {
                return next;
            }
        }
        return null;
    }
}
