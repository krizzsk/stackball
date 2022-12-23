package com.ogury.p245ed.internal;

import android.content.Context;

/* renamed from: com.ogury.ed.internal.ab */
public final class C8008ab {

    /* renamed from: a */
    private C8248g f20806a;

    /* renamed from: b */
    private final Context f20807b;

    /* renamed from: c */
    private final C8212ez f20808c;

    public /* synthetic */ C8008ab(C8248g gVar, Context context) {
        this(gVar, context, new C8212ez(context));
    }

    private C8008ab(C8248g gVar, Context context, C8212ez ezVar) {
        C8467mq.m23881b(gVar, "adLayout");
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(ezVar, "androidDevice");
        this.f20806a = gVar;
        this.f20807b = context;
        this.f20808c = ezVar;
    }

    /* renamed from: a */
    public final void mo53119a(C8248g gVar) {
        C8467mq.m23881b(gVar, "<set-?>");
        this.f20806a = gVar;
    }

    /* renamed from: a */
    private final int m22258a(int i, boolean z) {
        if (!z) {
            return i;
        }
        if (this.f20808c.mo53463p()) {
            return -1;
        }
        return this.f20808c.mo53459l();
    }

    /* renamed from: a */
    public final void mo53118a(C8109cn cnVar, boolean z, boolean z2) {
        C8467mq.m23881b(cnVar, "adSize");
        C8350iz izVar = new C8350iz(false, m22258a(cnVar.mo53276a(), z), cnVar.mo53277b(), 0, 0);
        izVar.mo53789e(17);
        if (z2) {
            this.f20806a.setLeft(0);
            this.f20806a.setTop(0);
            this.f20806a.setInitialSize(izVar);
            return;
        }
        this.f20806a.setInitialSizeWithoutResizing(izVar);
    }
}
