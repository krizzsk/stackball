package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;

public class z61 {
    /* renamed from: a */
    public void mo71160a(View view) {
        Context context = view.getContext();
        int e = lo1.m38875e(context);
        int i = context.getResources().getDisplayMetrics().heightPixels;
        view.measure(View.MeasureSpec.makeMeasureSpec(e, 1073741824), View.MeasureSpec.makeMeasureSpec(i, 1073741824));
        view.layout(0, 0, e, i);
    }
}
