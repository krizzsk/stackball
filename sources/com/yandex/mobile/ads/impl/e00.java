package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.PopupWindow;
import com.appsflyer.share.Constants;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class e00 extends Lambda implements Function3<View, Integer, Integer, PopupWindow> {

    /* renamed from: b */
    public static final e00 f32870b = new e00();

    e00() {
        super(3);
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(view, Constants.URL_CAMPAIGN);
        return new l00(view, intValue, intValue2, false);
    }
}
