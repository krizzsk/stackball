package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.el0;

public class al0 implements el0 {

    /* renamed from: a */
    private final Context f30593a;

    /* renamed from: b */
    private final View f30594b;

    /* renamed from: c */
    private final el0.C12983a f30595c = new el0.C12983a();

    /* renamed from: d */
    private final float f30596d;

    public al0(View view, float f) {
        this.f30593a = view.getContext().getApplicationContext();
        this.f30594b = view;
        this.f30596d = f;
    }

    /* renamed from: a */
    public el0.C12983a mo65798a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int round = Math.round(((float) lo1.m38871c(this.f30593a)) * this.f30596d);
        ViewGroup.LayoutParams layoutParams = this.f30594b.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            round = (round - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
        }
        int max = Math.max(Math.min(size, round), 0);
        el0.C12983a aVar = this.f30595c;
        aVar.f33000a = i;
        aVar.f33001b = View.MeasureSpec.makeMeasureSpec(max, mode);
        return this.f30595c;
    }
}
