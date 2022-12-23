package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import android.view.View;

public class cp1 {

    /* renamed from: a */
    private final px0 f32015a = new px0();

    /* renamed from: b */
    private final dp1 f32016b = new dp1();

    /* renamed from: a */
    public int mo66343a(View view) {
        boolean d = lo1.m38874d(view);
        Rect a = this.f32016b.mo66658a(view);
        if (d || a == null) {
            return 0;
        }
        return (a.width() * a.height()) - this.f32015a.mo69452a(view, a);
    }
}
