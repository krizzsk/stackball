package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.el0;

public class b70 implements el0 {

    /* renamed from: a */
    private final Context f31259a;

    /* renamed from: b */
    private final el0.C12983a f31260b = new el0.C12983a();

    /* renamed from: c */
    private final float f31261c;

    public b70(Context context, float f) {
        this.f31259a = context.getApplicationContext();
        this.f31261c = f;
    }

    /* renamed from: a */
    public el0.C12983a mo65798a(int i, int i2) {
        int round = Math.round(((float) lo1.m38871c(this.f31259a)) * this.f31261c);
        el0.C12983a aVar = this.f31260b;
        aVar.f33000a = i;
        aVar.f33001b = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
        return this.f31260b;
    }
}
