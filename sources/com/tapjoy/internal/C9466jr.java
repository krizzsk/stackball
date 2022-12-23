package com.tapjoy.internal;

import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.jr */
public final class C9466jr {
    /* renamed from: a */
    private static void m25451a(@Nullable Throwable th, Class cls) {
        if (th != null && cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    /* renamed from: a */
    public static RuntimeException m25450a(Throwable th) {
        Throwable th2 = (Throwable) C9464jp.m25446a(th);
        m25451a(th2, Error.class);
        m25451a(th2, RuntimeException.class);
        throw new RuntimeException(th);
    }
}
