package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.yandex.mobile.ads.impl.lo1;

/* renamed from: com.yandex.mobile.ads.banner.j */
final class C12083j implements C12081h {
    C12083j() {
    }

    /* renamed from: a */
    public void mo64399a(int i) {
    }

    /* renamed from: a */
    public void mo64400a(Context context) {
    }

    /* renamed from: a */
    public void mo64401a(Context context, View view) {
        view.setVisibility(0);
        int i = lo1.f36769b;
        view.setMinimumHeight(Math.round(TypedValue.applyDimension(1, 50.0f, context.getResources().getDisplayMetrics())));
    }

    /* renamed from: b */
    public void mo64402b(Context context) {
    }
}
