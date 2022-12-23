package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.yandex.mobile.ads.impl.f4 */
public final class C13027f4 {
    /* renamed from: a */
    public static View m35890a(Context context) {
        C12953e4 e4Var = new C12953e4(context);
        FrameLayout frameLayout = new FrameLayout(context);
        int i = lo1.f36769b;
        int round = Math.round(TypedValue.applyDimension(1, 25.0f, context.getResources().getDisplayMetrics()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(round, round);
        layoutParams.gravity = 17;
        int round2 = Math.round(TypedValue.applyDimension(1, 19.5f, context.getResources().getDisplayMetrics()));
        layoutParams.setMargins(round2, round2, round2, round2);
        frameLayout.addView(e4Var, layoutParams);
        e4Var.setTag("yma_" + "close_button");
        e4Var.f32902h = 1.0f;
        e4Var.invalidate();
        return frameLayout;
    }
}
