package com.fyber.inneractive.sdk.player.p059c;

import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.c.d */
public final class C3236d extends Exception {

    /* renamed from: a */
    public final int f8150a;

    /* renamed from: b */
    public final int f8151b;

    /* renamed from: a */
    public static C3236d m7869a(Exception exc, int i) {
        return new C3236d(1, exc, i);
    }

    /* renamed from: a */
    public static C3236d m7868a(IOException iOException) {
        return new C3236d(0, iOException, -1);
    }

    /* renamed from: a */
    static C3236d m7870a(RuntimeException runtimeException) {
        return new C3236d(2, runtimeException, -1);
    }

    private C3236d(int i, Throwable th, int i2) {
        super((String) null, th);
        this.f8150a = i;
        this.f8151b = i2;
    }
}
