package com.ogury.p245ed.internal;

import android.graphics.Rect;

/* renamed from: com.ogury.ed.internal.bi */
public final class C8064bi implements C8066bk {

    /* renamed from: a */
    private final float f20938a;

    public C8064bi(float f) {
        this.f20938a = f;
    }

    /* renamed from: a */
    public final void mo53208a(Rect rect, Rect rect2) {
        C8467mq.m23881b(rect, "adLayoutRect");
        C8467mq.m23881b(rect2, "containerRect");
        new C8063bh(rect, rect2, this.f20938a).mo53208a(rect, rect2);
    }

    /* renamed from: b */
    public final C8063bh mo53211b(Rect rect, Rect rect2) {
        C8467mq.m23881b(rect, "adLayoutRect");
        C8467mq.m23881b(rect2, "containerRect");
        return new C8063bh(rect, rect2, this.f20938a);
    }
}
