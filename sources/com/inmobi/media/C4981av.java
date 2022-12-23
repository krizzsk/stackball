package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.av */
/* compiled from: Click */
public final class C4981av {

    /* renamed from: a */
    int f11292a;

    /* renamed from: b */
    public String f11293b;

    /* renamed from: c */
    public Map<String, String> f11294c;

    /* renamed from: d */
    long f11295d;

    /* renamed from: e */
    long f11296e;

    /* renamed from: f */
    int f11297f;

    /* renamed from: g */
    AtomicBoolean f11298g;

    /* renamed from: h */
    boolean f11299h;

    /* renamed from: i */
    boolean f11300i;

    C4981av(String str, boolean z, boolean z2, int i) {
        this(new Random().nextInt() & Integer.MAX_VALUE, str, new HashMap(), z, z2, i, System.currentTimeMillis(), System.currentTimeMillis());
    }

    C4981av(String str, Map<String, String> map, boolean z, int i) {
        this(new Random().nextInt() & Integer.MAX_VALUE, str, map, z, false, i, System.currentTimeMillis(), System.currentTimeMillis());
    }

    C4981av(int i, String str, Map<String, String> map, boolean z, boolean z2, int i2, long j, long j2) {
        this.f11292a = i;
        this.f11293b = str;
        this.f11294c = map;
        this.f11295d = j;
        this.f11296e = j2;
        this.f11297f = i2;
        this.f11298g = new AtomicBoolean(false);
        this.f11300i = z;
        this.f11299h = z2;
    }

    /* renamed from: a */
    public final boolean mo40131a(long j) {
        return System.currentTimeMillis() - this.f11296e > j * 1000;
    }
}
