package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.PopupWindow;
import kotlin.jvm.internal.Intrinsics;

public final class l00 extends PopupWindow {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l00(View view, int i, int i2, boolean z) {
        super(view, i, i2, z);
        Intrinsics.checkNotNullParameter(view, "contentView");
    }

    public void dismiss() {
        try {
            super.dismiss();
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
    }
}
