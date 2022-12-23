package com.yandex.metrica.impl.p265ob;

import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Ei */
public class C10226Ei {

    /* renamed from: a */
    public final long f24593a;

    /* renamed from: b */
    public final String f24594b;

    /* renamed from: c */
    public final List<Integer> f24595c;

    /* renamed from: d */
    public final List<Integer> f24596d;

    /* renamed from: e */
    public final long f24597e;

    /* renamed from: f */
    public final int f24598f;

    /* renamed from: g */
    public final long f24599g;

    /* renamed from: h */
    public final long f24600h;

    /* renamed from: i */
    public final long f24601i;

    /* renamed from: j */
    public final long f24602j;

    public C10226Ei(long j, String str, List<Integer> list, List<Integer> list2, long j2, int i, long j3, long j4, long j5, long j6) {
        this.f24593a = j;
        this.f24594b = str;
        this.f24595c = Collections.unmodifiableList(list);
        this.f24596d = Collections.unmodifiableList(list2);
        this.f24597e = j2;
        this.f24598f = i;
        this.f24599g = j3;
        this.f24600h = j4;
        this.f24601i = j5;
        this.f24602j = j6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10226Ei.class != obj.getClass()) {
            return false;
        }
        C10226Ei ei = (C10226Ei) obj;
        if (this.f24593a == ei.f24593a && this.f24597e == ei.f24597e && this.f24598f == ei.f24598f && this.f24599g == ei.f24599g && this.f24600h == ei.f24600h && this.f24601i == ei.f24601i && this.f24602j == ei.f24602j && this.f24594b.equals(ei.f24594b) && this.f24595c.equals(ei.f24595c)) {
            return this.f24596d.equals(ei.f24596d);
        }
        return false;
    }

    public int hashCode() {
        long j = this.f24593a;
        long j2 = this.f24597e;
        long j3 = this.f24599g;
        long j4 = this.f24600h;
        long j5 = this.f24601i;
        long j6 = this.f24602j;
        return (((((((((((((((((((int) (j ^ (j >>> 32))) * 31) + this.f24594b.hashCode()) * 31) + this.f24595c.hashCode()) * 31) + this.f24596d.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f24598f) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }

    public String toString() {
        return "SocketConfig{secondsToLive=" + this.f24593a + ", token='" + this.f24594b + '\'' + ", ports=" + this.f24595c + ", portsHttp=" + this.f24596d + ", firstDelaySeconds=" + this.f24597e + ", launchDelaySeconds=" + this.f24598f + ", openEventIntervalSeconds=" + this.f24599g + ", minFailedRequestIntervalSeconds=" + this.f24600h + ", minSuccessfulRequestIntervalSeconds=" + this.f24601i + ", openRetryIntervalSeconds=" + this.f24602j + '}';
    }
}
