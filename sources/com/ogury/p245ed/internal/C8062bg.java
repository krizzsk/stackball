package com.ogury.p245ed.internal;

import android.graphics.Rect;

/* renamed from: com.ogury.ed.internal.bg */
public final class C8062bg implements C8066bk {
    /* renamed from: a */
    private static float m22452a(int i, int i2) {
        return ((float) i) / ((float) i2);
    }

    /* renamed from: a */
    public final void mo53208a(Rect rect, Rect rect2) {
        C8467mq.m23881b(rect, "adLayoutRect");
        C8467mq.m23881b(rect2, "containerRect");
        m22453b(rect, rect2);
        m22454c(rect, rect2);
    }

    /* renamed from: b */
    private static void m22453b(Rect rect, Rect rect2) {
        if (rect.width() > rect2.width()) {
            C8051ay.m22423a(rect, m22452a(rect.width(), rect2.width()));
        }
    }

    /* renamed from: c */
    private static void m22454c(Rect rect, Rect rect2) {
        if (rect.height() > rect2.height()) {
            C8051ay.m22423a(rect, m22452a(rect.height(), rect2.height()));
        }
    }
}
