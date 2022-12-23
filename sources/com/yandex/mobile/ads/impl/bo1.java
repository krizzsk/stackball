package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import android.view.View;

public class bo1 {

    /* renamed from: a */
    private final ho1 f31381a = new ho1();

    /* renamed from: a */
    public boolean mo66102a(View view, View view2) {
        Rect a = this.f31381a.mo67584a(view);
        Rect a2 = this.f31381a.mo67584a(view2);
        boolean z = a.left <= a2.left && a2.right <= a.right;
        boolean z2 = a.top <= a2.top && a2.bottom <= a.bottom;
        if (!z || !z2) {
            return false;
        }
        return true;
    }
}
