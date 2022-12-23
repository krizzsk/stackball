package com.ogury.core.internal.network;

import com.ogury.core.internal.C7921ai;
import java.io.Closeable;

/* compiled from: CloseableUtil.kt */
public final class CloseableUtilKt {
    public static final void closeSafely(Closeable closeable) {
        C7921ai.m22144b(closeable, "$this$closeSafely");
        try {
            closeable.close();
        } catch (Throwable unused) {
        }
    }
}
