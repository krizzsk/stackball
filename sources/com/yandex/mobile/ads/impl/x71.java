package com.yandex.mobile.ads.impl;

import android.view.View;

public class x71 implements View.OnClickListener {

    /* renamed from: a */
    private final View f42468a;

    public x71(View view) {
        this.f42468a = view;
    }

    public void onClick(View view) {
        View view2 = this.f42468a;
        if (view2 != null) {
            view2.setSelected(!view2.isSelected());
        }
    }
}
