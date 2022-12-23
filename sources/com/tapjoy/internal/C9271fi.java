package com.tapjoy.internal;

import android.os.SystemClock;

/* renamed from: com.tapjoy.internal.fi */
public final class C9271fi {

    /* renamed from: a */
    public static final C9271fi f22929a = new C9271fi(-1);

    /* renamed from: b */
    public final long f22930b;

    /* renamed from: c */
    public long f22931c;

    public C9271fi(long j) {
        this.f22930b = j;
        this.f22931c = SystemClock.elapsedRealtime();
    }

    public C9271fi() {
        this.f22930b = 3600000;
        try {
            this.f22931c = SystemClock.elapsedRealtime() - 3600000;
        } catch (NullPointerException unused) {
            this.f22931c = -1;
        }
    }

    /* renamed from: a */
    public final boolean mo58125a() {
        try {
            return SystemClock.elapsedRealtime() - this.f22931c > this.f22930b;
        } catch (NullPointerException unused) {
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo58126a(long j) {
        try {
            return (SystemClock.elapsedRealtime() - this.f22931c) + j > this.f22930b;
        } catch (NullPointerException unused) {
            return true;
        }
    }
}
