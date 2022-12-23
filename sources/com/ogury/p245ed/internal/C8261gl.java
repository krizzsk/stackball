package com.ogury.p245ed.internal;

import android.os.Looper;
import com.ogury.core.internal.network.OguryNetworkException;

/* renamed from: com.ogury.ed.internal.gl */
public final class C8261gl {
    /* renamed from: a */
    public static final void m23201a(Throwable th) {
        C8467mq.m23881b(th, "<this>");
    }

    /* renamed from: b */
    public static final boolean m23202b(Throwable th) {
        C8467mq.m23881b(th, "<this>");
        return (th instanceof OguryNetworkException) || (th instanceof C8201eq);
    }

    /* renamed from: a */
    public static final void m23200a(String str) {
        C8467mq.m23881b(str, "methodName");
        if (C8467mq.m23880a((Object) Looper.myLooper(), (Object) Looper.getMainLooper())) {
            m23201a((Throwable) new IllegalStateException(C8467mq.m23873a(str, (Object) " cannot be called from the main thread")));
        }
    }
}
