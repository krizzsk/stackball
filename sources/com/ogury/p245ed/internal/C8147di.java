package com.ogury.p245ed.internal;

import android.content.Context;
import com.ogury.p245ed.internal.C8148dj;

/* renamed from: com.ogury.ed.internal.di */
public final class C8147di {

    /* renamed from: a */
    public static final C8147di f21106a = new C8147di();

    /* renamed from: b */
    private static C8148dj f21107b;

    private C8147di() {
    }

    /* renamed from: a */
    public static void m22715a(Context context) {
        C8467mq.m23881b(context, "context");
        if (f21107b == null) {
            C8148dj.C8149a aVar = C8148dj.f21108a;
            f21107b = C8148dj.C8149a.m22725a(context);
        }
    }

    /* renamed from: a */
    public static void m22716a(C8146dh dhVar) {
        C8467mq.m23881b(dhVar, "event");
        C8148dj djVar = f21107b;
        if (djVar != null) {
            djVar.mo53305a(dhVar);
        }
    }
}
