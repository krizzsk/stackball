package com.ogury.p245ed.internal;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.ogury.ed.internal.bd */
public final class C8057bd {
    /* renamed from: a */
    public static final boolean m22441a(View view, Rect rect) {
        C8467mq.m23881b(view, "<this>");
        C8467mq.m23881b(rect, "containerRect");
        return ((float) rect.height()) <= ((float) view.getRootView().getHeight()) * 0.4f;
    }
}
