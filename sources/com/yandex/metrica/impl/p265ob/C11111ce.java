package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import kotlin.jvm.JvmStatic;

/* renamed from: com.yandex.metrica.impl.ob.ce */
public final class C11111ce {
    @JvmStatic
    /* renamed from: a */
    public static final boolean m28639a(Context context, String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
        }
    }
}
