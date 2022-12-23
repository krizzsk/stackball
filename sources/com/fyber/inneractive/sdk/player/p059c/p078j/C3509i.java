package com.fyber.inneractive.sdk.player.p059c.p078j;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.c.j.i */
public final class C3509i {

    /* renamed from: a */
    public final Uri f9498a;

    /* renamed from: b */
    public final byte[] f9499b;

    /* renamed from: c */
    public final long f9500c;

    /* renamed from: d */
    public final long f9501d;

    /* renamed from: e */
    public final long f9502e;

    /* renamed from: f */
    public final String f9503f;

    /* renamed from: g */
    public final int f9504g;

    public C3509i(Uri uri, long j, String str) {
        this(uri, j, j, -1, str, 0);
    }

    public C3509i(Uri uri, long j, long j2, String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    public C3509i(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, j, j2, j3, str, i, (byte) 0);
    }

    private C3509i(Uri uri, long j, long j2, long j3, String str, int i, byte b) {
        boolean z = true;
        C3535a.m8782a(j >= 0);
        C3535a.m8782a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        C3535a.m8782a(z);
        this.f9498a = uri;
        this.f9499b = null;
        this.f9500c = j;
        this.f9501d = j2;
        this.f9502e = j3;
        this.f9503f = str;
        this.f9504g = i;
    }

    /* renamed from: a */
    public final boolean mo19345a(int i) {
        return (this.f9504g & i) == i;
    }

    public final String toString() {
        return "DataSpec[" + this.f9498a + ", " + Arrays.toString(this.f9499b) + ", " + this.f9500c + ", " + this.f9501d + ", " + this.f9502e + ", " + this.f9503f + ", " + this.f9504g + "]";
    }
}
