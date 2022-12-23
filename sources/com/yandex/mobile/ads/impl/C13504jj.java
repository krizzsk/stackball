package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.ironsource.mediationsdk.config.VersionInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.jj */
public final class C13504jj {

    /* renamed from: a */
    public final Uri f35322a;

    /* renamed from: b */
    public final int f35323b;

    /* renamed from: c */
    public final byte[] f35324c;

    /* renamed from: d */
    public final Map<String, String> f35325d;

    /* renamed from: e */
    public final long f35326e;

    /* renamed from: f */
    public final long f35327f;

    /* renamed from: g */
    public final long f35328g;

    /* renamed from: h */
    public final String f35329h;

    /* renamed from: i */
    public final int f35330i;

    public C13504jj(Uri uri, int i) {
        this(uri, 0, -1, (String) null, i);
    }

    /* renamed from: a */
    private static int m37844a(byte[] bArr) {
        return bArr != null ? 2 : 1;
    }

    /* renamed from: b */
    public boolean mo68007b(int i) {
        return (this.f35330i & i) == i;
    }

    public String toString() {
        return "DataSpec[" + m37845a(this.f35323b) + " " + this.f35322a + ", " + Arrays.toString(this.f35324c) + ", " + this.f35326e + ", " + this.f35327f + ", " + this.f35328g + ", " + this.f35329h + ", " + this.f35330i + "]";
    }

    public C13504jj(Uri uri, long j, long j2, String str, int i) {
        this(uri, j, j, j2, (String) null, i);
    }

    public C13504jj(Uri uri, long j, long j2, String str, int i, Map<String, String> map) {
        this(uri, m37844a((byte[]) null), (byte[]) null, j, j, j2, str, i, map);
    }

    /* renamed from: a */
    public static String m37845a(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return VersionInfo.GIT_BRANCH;
        }
        throw new AssertionError(i);
    }

    public C13504jj(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, (byte[]) null, j, j2, j3, str, i);
    }

    public C13504jj(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        this(uri, m37844a((byte[]) null), (byte[]) null, j, j2, j3, str, i);
    }

    /* renamed from: a */
    public C13504jj mo68006a(long j, long j2) {
        if (j == 0 && this.f35328g == j2) {
            return this;
        }
        return new C13504jj(this.f35322a, this.f35323b, this.f35324c, this.f35326e + j, this.f35327f + j, j2, this.f35329h, this.f35330i, this.f35325d);
    }

    public C13504jj(Uri uri, int i, byte[] bArr, long j, long j2, long j3, String str, int i2) {
        this(uri, i, bArr, j, j2, j3, str, i2, Collections.emptyMap());
    }

    public C13504jj(Uri uri, int i, byte[] bArr, long j, long j2, long j3, String str, int i2, Map<String, String> map) {
        byte[] bArr2 = bArr;
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        boolean z = true;
        C13479j9.m37705a(j4 >= 0);
        C13479j9.m37705a(j5 >= 0);
        if (j6 <= 0 && j6 != -1) {
            z = false;
        }
        C13479j9.m37705a(z);
        this.f35322a = uri;
        this.f35323b = i;
        this.f35324c = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f35326e = j4;
        this.f35327f = j5;
        this.f35328g = j6;
        this.f35329h = str;
        this.f35330i = i2;
        this.f35325d = Collections.unmodifiableMap(new HashMap(map));
    }
}
