package com.yandex.mobile.ads.impl;

public final class t71 {

    /* renamed from: c */
    public static final t71 f40257c;

    /* renamed from: d */
    public static final t71 f40258d;

    /* renamed from: a */
    public final long f40259a;

    /* renamed from: b */
    public final long f40260b;

    static {
        t71 t71 = new t71(0, 0);
        f40257c = t71;
        new t71(Long.MAX_VALUE, Long.MAX_VALUE);
        new t71(Long.MAX_VALUE, 0);
        new t71(0, Long.MAX_VALUE);
        f40258d = t71;
    }

    public t71(long j, long j2) {
        boolean z = true;
        C13479j9.m37705a(j >= 0);
        C13479j9.m37705a(j2 < 0 ? false : z);
        this.f40259a = j;
        this.f40260b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t71.class != obj.getClass()) {
            return false;
        }
        t71 t71 = (t71) obj;
        if (this.f40259a == t71.f40259a && this.f40260b == t71.f40260b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f40259a) * 31) + ((int) this.f40260b);
    }
}
