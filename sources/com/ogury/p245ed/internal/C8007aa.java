package com.ogury.p245ed.internal;

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: com.ogury.ed.internal.aa */
public final class C8007aa implements C8036am {
    /* renamed from: a */
    public final void mo53117a(C8248g gVar, C8020aj ajVar) {
        C8467mq.m23881b(gVar, "adLayout");
        C8467mq.m23881b(ajVar, "adController");
        ViewGroup.LayoutParams layoutParams = gVar.getLayoutParams();
        if (layoutParams != null) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 0;
            gVar.setLeft(0);
            gVar.setTop(0);
            gVar.mo53574c();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }
}
