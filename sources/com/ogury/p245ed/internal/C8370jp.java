package com.ogury.p245ed.internal;

import android.content.Context;
import com.iab.omid.library.oguryco.Omid;

/* renamed from: com.ogury.ed.internal.jp */
public final class C8370jp {

    /* renamed from: a */
    public static final C8370jp f21621a = new C8370jp();

    private C8370jp() {
    }

    /* renamed from: a */
    public static void m23725a(Context context) {
        C8467mq.m23881b(context, "context");
        try {
            Omid.activate(context.getApplicationContext());
        } catch (IllegalArgumentException e) {
            C8369jo joVar = C8369jo.f21619a;
            C8369jo.m23724a(e);
        }
    }

    /* renamed from: a */
    public static boolean m23726a() {
        return Omid.isActive();
    }

    /* renamed from: b */
    public static C8371jq m23727b() {
        return new C8371jq();
    }
}
