package com.ogury.p245ed.internal;

import android.graphics.Rect;

/* renamed from: com.ogury.ed.internal.ja */
public final class C8353ja {
    /* renamed from: a */
    public static final C8350iz m23669a(C8350iz izVar, Rect rect) {
        if (izVar == null) {
            return null;
        }
        if (rect == null) {
            return C8350iz.m23639a(izVar, false, 0, 0, 0, 0, 31);
        }
        return C8350iz.m23639a(izVar, false, 0, 0, rect.left, rect.top, 7);
    }
}
