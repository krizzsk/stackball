package com.ogury.p245ed.internal;

import android.content.Context;

/* renamed from: com.ogury.ed.internal.gh */
public final class C8257gh {
    /* renamed from: a */
    public static final boolean m23192a(Context context, String str) {
        C8467mq.m23881b(context, "<this>");
        C8467mq.m23881b(str, "permission");
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}
