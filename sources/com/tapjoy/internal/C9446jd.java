package com.tapjoy.internal;

import java.io.InterruptedIOException;

/* renamed from: com.tapjoy.internal.jd */
public class C9446jd {

    /* renamed from: a */
    public static final C9446jd f23475a = new C9446jd() {
        /* renamed from: a */
        public final void mo58427a() {
        }
    };

    /* renamed from: b */
    private boolean f23476b;

    /* renamed from: c */
    private long f23477c;

    /* renamed from: a */
    public void mo58427a() {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        } else if (this.f23476b && this.f23477c - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
