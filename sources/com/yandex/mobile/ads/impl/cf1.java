package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.Intrinsics;

public final class cf1 {
    /* renamed from: a */
    public static final boolean m34707a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (!(view instanceof bf1)) {
            return false;
        }
        if (((bf1) view).mo65872c()) {
            return true;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return false;
        }
        return m34707a(viewGroup);
    }
}
