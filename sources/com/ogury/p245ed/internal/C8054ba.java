package com.ogury.p245ed.internal;

import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: com.ogury.ed.internal.ba */
public final class C8054ba {

    /* renamed from: a */
    private final ViewGroup f20927a;

    public C8054ba(ViewGroup viewGroup) {
        C8467mq.m23881b(viewGroup, "adLayout");
        this.f20927a = viewGroup;
    }

    /* renamed from: a */
    public final void mo53204a(C8278gy gyVar) {
        C8467mq.m23881b(gyVar, "adExposure");
        ViewParent parent = this.f20927a.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null && viewGroup.getVisibility() != 0) {
            gyVar.mo53629a(0.0f);
        }
    }
}
