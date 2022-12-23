package com.tapjoy.internal;

import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.jq */
public final class C9465jq {
    /* renamed from: a */
    public static String m25447a(@Nullable String str) {
        return str == null ? "" : str;
    }

    @Nullable
    /* renamed from: b */
    public static String m25448b(@Nullable String str) {
        if (m25449c(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    public static boolean m25449c(@Nullable String str) {
        return str == null || str.length() == 0;
    }
}
