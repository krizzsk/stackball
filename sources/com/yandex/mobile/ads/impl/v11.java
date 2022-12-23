package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedTextView;

public class v11<V extends ViewGroup> implements C12982el<V> {

    /* renamed from: a */
    private final tq0 f41174a = new tq0();

    /* renamed from: a */
    public void mo65684a(V v) {
        TextView b = this.f41174a.mo65902b(v);
        if (b instanceof ExtendedTextView) {
            ExtendedTextView extendedTextView = (ExtendedTextView) b;
            b70 b70 = new b70(v.getContext(), 0.1f);
            extendedTextView.setAutoSizeTextType(1);
            extendedTextView.setMeasureSpecProvider(b70);
        }
    }

    /* renamed from: c */
    public void mo65685c() {
    }
}
