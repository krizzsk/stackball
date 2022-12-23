package com.fyber.inneractive.sdk.player.p059c.p080k;

/* renamed from: com.fyber.inneractive.sdk.player.c.k.a */
public final class C3535a {
    /* renamed from: a */
    public static void m8782a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static void m8783a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static int m8780a(int i, int i2) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: b */
    public static void m8784b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public static void m8785b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static <T> T m8781a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }
}
