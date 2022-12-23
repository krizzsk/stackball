package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;

public final class po1 {
    /* renamed from: a */
    public static final ViewGroup.LayoutParams m40889a(ViewGroup.LayoutParams layoutParams, ViewGroup.LayoutParams layoutParams2) {
        if (layoutParams2 != null) {
            layoutParams.width = layoutParams2.width;
            layoutParams.height = layoutParams2.height;
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams.leftMargin = marginLayoutParams2.leftMargin;
                marginLayoutParams.topMargin = marginLayoutParams2.topMargin;
                marginLayoutParams.rightMargin = marginLayoutParams2.rightMargin;
                marginLayoutParams.bottomMargin = marginLayoutParams2.bottomMargin;
                if (marginLayoutParams2.isMarginRelative()) {
                    marginLayoutParams.setMarginStart(marginLayoutParams2.getMarginStart());
                    marginLayoutParams.setMarginEnd(marginLayoutParams2.getMarginEnd());
                }
            }
        }
        return layoutParams;
    }
}
