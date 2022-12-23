package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

public class dp1 {

    /* renamed from: a */
    private final nq1 f32737a = new nq1();

    /* renamed from: b */
    private final l71 f32738b = l71.m38631c();

    /* renamed from: a */
    public Rect mo66658a(View view) {
        Rect rect = new Rect();
        Context context = view.getContext();
        if (view.getGlobalVisibleRect(rect)) {
            d71 a = this.f32738b.mo68362a(context);
            if (!(a != null && a.mo66443H())) {
                return rect;
            }
            this.f32737a.getClass();
            Rect rect2 = new Rect();
            view.getWindowVisibleDisplayFrame(rect2);
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            iArr[0] = -iArr[0];
            iArr[1] = -iArr[1];
            rect2.offset(iArr[0], iArr[1]);
            Rect rect3 = new Rect(rect);
            if (rect3.intersect(rect2)) {
                return rect3;
            }
        }
        return null;
    }
}
