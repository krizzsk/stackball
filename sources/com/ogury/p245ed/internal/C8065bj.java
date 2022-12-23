package com.ogury.p245ed.internal;

import android.graphics.Rect;

/* renamed from: com.ogury.ed.internal.bj */
public final class C8065bj implements C8066bk {

    /* renamed from: a */
    private int f20939a;

    /* renamed from: a */
    public final void mo53208a(Rect rect, Rect rect2) {
        C8467mq.m23881b(rect, "adLayoutRect");
        C8467mq.m23881b(rect2, "containerRect");
        int i = rect2.top - this.f20939a;
        if (i != 0) {
            this.f20939a = rect2.top;
            rect.top -= i;
            rect.bottom -= i;
        }
    }
}
