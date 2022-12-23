package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;

/* renamed from: com.yandex.mobile.ads.impl.d4 */
public final class C12850d4 {
    /* renamed from: a */
    public static RelativeLayout.LayoutParams m34987a(Context context, SizeInfo sizeInfo) {
        RelativeLayout.LayoutParams layoutParams;
        if (sizeInfo != null) {
            layoutParams = m34984a(context, sizeInfo.mo64491c(context), sizeInfo.mo64488a(context));
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.addRule(13);
        return layoutParams;
    }

    /* renamed from: a */
    public static RelativeLayout.LayoutParams m34986a(Context context, AdResponse adResponse) {
        RelativeLayout.LayoutParams layoutParams;
        if (adResponse != null) {
            layoutParams = m34984a(context, adResponse.mo64436p(), adResponse.mo64422c());
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.addRule(13);
        return layoutParams;
    }

    /* renamed from: a */
    public static RelativeLayout.LayoutParams m34985a(Context context, View view) {
        int i = lo1.f36769b;
        boolean z = true;
        int round = Math.round(TypedValue.applyDimension(1, 25.0f, context.getResources().getDisplayMetrics()));
        int round2 = Math.round(TypedValue.applyDimension(1, 64.0f, context.getResources().getDisplayMetrics()));
        int i2 = round2 >> 1;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(round2, round2);
        layoutParams.addRule(7, view.getId());
        layoutParams.addRule(6, view.getId());
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int i3 = layoutParams2.width;
        boolean z2 = i3 == -1 || i3 + round >= context.getResources().getDisplayMetrics().widthPixels;
        int i4 = layoutParams2.height;
        if (i4 != -1 && i4 + round < context.getResources().getDisplayMetrics().heightPixels) {
            z = false;
        }
        int i5 = (round >> 1) - ((round2 - round) / 2);
        if (!z2 && !z) {
            i5 = -i2;
        }
        layoutParams.setMargins(0, i5, i5, 0);
        return layoutParams;
    }

    /* renamed from: a */
    static RelativeLayout.LayoutParams m34984a(Context context, int i, int i2) {
        int i3 = lo1.f36769b;
        return new RelativeLayout.LayoutParams(Math.round(TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics())), Math.round(TypedValue.applyDimension(1, (float) i2, context.getResources().getDisplayMetrics())));
    }
}
