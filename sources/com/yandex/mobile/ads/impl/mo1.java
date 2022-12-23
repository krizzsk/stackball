package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public class mo1 {

    /* renamed from: a */
    private final Rect f37453a = new Rect();

    /* renamed from: a */
    public int mo68844a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (!view.isShown() || !view.getGlobalVisibleRect(this.f37453a)) {
            return 0;
        }
        return ((this.f37453a.width() * this.f37453a.height()) * 100) / (view.getWidth() * view.getHeight());
    }
}
