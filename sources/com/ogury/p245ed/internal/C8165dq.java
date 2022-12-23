package com.ogury.p245ed.internal;

import android.content.Context;

/* renamed from: com.ogury.ed.internal.dq */
public final class C8165dq {

    /* renamed from: a */
    private final Context f21136a;

    /* renamed from: b */
    private final C8233fn f21137b;

    /* renamed from: c */
    private final C8132dc f21138c;

    private C8165dq(Context context, C8233fn fnVar, C8132dc dcVar) {
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(fnVar, "profigGateway");
        C8467mq.m23881b(dcVar, "extraAdConfiguration");
        this.f21136a = context;
        this.f21137b = fnVar;
        this.f21138c = dcVar;
    }

    public /* synthetic */ C8165dq(Context context) {
        this(context, C8233fn.f21330a, C8132dc.f21070a);
    }

    /* renamed from: a */
    public final boolean mo53312a() {
        C8232fm a = C8233fn.m23113a(this.f21136a);
        return m22750a(a == null ? null : Integer.valueOf(a.mo53558q()));
    }

    /* renamed from: b */
    public final boolean mo53313b() {
        C8232fm a = C8233fn.m23113a(this.f21136a);
        return m22750a(a == null ? null : Integer.valueOf(a.mo53559r()));
    }

    /* renamed from: a */
    private final boolean m22750a(Integer num) {
        int intValue = (num == null ? 0 : num.intValue()) & 1;
        if (C8132dc.m22657a()) {
            C8232fm a = C8233fn.m23113a(this.f21136a);
            intValue &= a == null ? 0 : a.mo53560s();
        }
        return intValue == 1;
    }
}
