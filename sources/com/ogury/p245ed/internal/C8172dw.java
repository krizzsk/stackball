package com.ogury.p245ed.internal;

import android.content.Context;
import com.ogury.core.internal.network.OguryNetworkClient;
import com.ogury.p245ed.internal.C8167ds;

/* renamed from: com.ogury.ed.internal.dw */
public final class C8172dw {

    /* renamed from: a */
    public static final C8172dw f21148a = new C8172dw();

    /* renamed from: b */
    private static C8171dv f21149b;

    private C8172dw() {
    }

    /* renamed from: a */
    public static C8171dv m22770a(Context context) {
        int i;
        C8467mq.m23881b(context, "context");
        if (f21149b == null) {
            Context applicationContext = context.getApplicationContext();
            C8167ds.C8168a aVar = C8167ds.f21142a;
            C8467mq.m23878a((Object) applicationContext, "appContext");
            C8167ds a = C8167ds.C8168a.m22760a(applicationContext, new C8165dq(applicationContext));
            C8233fn fnVar = C8233fn.f21330a;
            C8232fm a2 = C8233fn.m23113a(context);
            Integer valueOf = a2 == null ? null : Integer.valueOf(a2.mo53553l());
            if (valueOf == null) {
                i = C8235fp.m23125a(3);
            } else {
                i = valueOf.intValue();
            }
            f21149b = new C8173dx(a, new C8216fa(applicationContext), new C8212ez(applicationContext), C8132dc.f21070a, new OguryNetworkClient(i, i * 5), new C8244fx(applicationContext));
        }
        C8171dv dvVar = f21149b;
        C8467mq.m23877a((Object) dvVar);
        return dvVar;
    }
}
