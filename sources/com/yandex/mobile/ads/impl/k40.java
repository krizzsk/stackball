package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import com.yandex.mobile.ads.exo.Format;
import java.io.IOException;

public final class k40 extends Exception {

    /* renamed from: b */
    public final int f35952b;

    /* renamed from: c */
    public final int f35953c;

    /* renamed from: d */
    public final Format f35954d;

    /* renamed from: e */
    public final int f35955e;

    private k40(int i, Throwable th) {
        this(i, th, -1, (Format) null, 4);
    }

    /* renamed from: a */
    public static k40 m38182a(IOException iOException) {
        return new k40(0, (Throwable) iOException);
    }

    private k40(int i, Throwable th, int i2, Format format, int i3) {
        super(th);
        this.f35952b = i;
        this.f35953c = i2;
        this.f35954d = format;
        this.f35955e = i3;
        SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public static k40 m38183a(Exception exc, int i, Format format, int i2) {
        return new k40(1, exc, i, format, format == null ? 4 : i2);
    }

    /* renamed from: a */
    public static k40 m38185a(RuntimeException runtimeException) {
        return new k40(2, (Throwable) runtimeException);
    }

    private k40(int i, String str) {
        super(str);
        this.f35952b = i;
        this.f35953c = -1;
        this.f35954d = null;
        this.f35955e = 0;
        SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public static k40 m38186a(String str) {
        return new k40(3, str);
    }

    /* renamed from: a */
    public static k40 m38184a(OutOfMemoryError outOfMemoryError) {
        return new k40(4, (Throwable) outOfMemoryError);
    }
}
