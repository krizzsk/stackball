package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.el0;

public class bl0 implements el0 {

    /* renamed from: a */
    private final Context f31363a;

    /* renamed from: b */
    private final el0.C12983a f31364b = new el0.C12983a();

    /* renamed from: c */
    private final View f31365c;

    /* renamed from: d */
    private final float f31366d;

    public bl0(View view, float f) {
        this.f31363a = view.getContext().getApplicationContext();
        this.f31365c = view;
        this.f31366d = f;
    }

    /* renamed from: a */
    public el0.C12983a mo65798a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int round = Math.round(((float) lo1.m38875e(this.f31363a)) * this.f31366d);
        ViewGroup.LayoutParams layoutParams = this.f31365c.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            round = (round - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        }
        this.f31364b.f33000a = View.MeasureSpec.makeMeasureSpec(Math.max(Math.min(size, round), 0), mode);
        el0.C12983a aVar = this.f31364b;
        aVar.f33001b = i2;
        return aVar;
    }
}
