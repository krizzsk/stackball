package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;

public class ho1 {
    /* renamed from: a */
    public Rect mo67584a(View view) {
        int left = view.getLeft();
        int top = view.getTop();
        int right = view.getRight();
        int bottom = view.getBottom();
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            View view2 = (View) parent;
            int left2 = view2.getLeft();
            int top2 = view2.getTop();
            left += left2;
            right += left2;
            top += top2;
            bottom += top2;
        }
        return new Rect(left, top, right, bottom);
    }
}
