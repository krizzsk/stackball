package com.yandex.metrica.impl.p265ob;

import android.location.Location;
import com.yandex.metrica.impl.p265ob.C10474M;
import com.yandex.metrica.impl.p265ob.C10883Wc;

/* renamed from: com.yandex.metrica.impl.ob.pd */
public class C11630pd {

    /* renamed from: a */
    public final C10883Wc.C10884a f27913a;

    /* renamed from: b */
    private Long f27914b;

    /* renamed from: c */
    private long f27915c;

    /* renamed from: d */
    private long f27916d;

    /* renamed from: e */
    private Location f27917e;

    /* renamed from: f */
    private C10474M.C10476b.C10477a f27918f;

    public C11630pd(C10883Wc.C10884a aVar, long j, long j2, Location location, C10474M.C10476b.C10477a aVar2, Long l) {
        this.f27913a = aVar;
        this.f27914b = l;
        this.f27915c = j;
        this.f27916d = j2;
        this.f27917e = location;
        this.f27918f = aVar2;
    }

    /* renamed from: a */
    public C10474M.C10476b.C10477a mo63478a() {
        return this.f27918f;
    }

    /* renamed from: b */
    public Long mo63479b() {
        return this.f27914b;
    }

    /* renamed from: c */
    public Location mo63480c() {
        return this.f27917e;
    }

    /* renamed from: d */
    public long mo63481d() {
        return this.f27916d;
    }

    /* renamed from: e */
    public long mo63482e() {
        return this.f27915c;
    }

    public String toString() {
        return "LocationWrapper{collectionMode=" + this.f27913a + ", mIncrementalId=" + this.f27914b + ", mReceiveTimestamp=" + this.f27915c + ", mReceiveElapsedRealtime=" + this.f27916d + ", mLocation=" + this.f27917e + ", mChargeType=" + this.f27918f + '}';
    }
}
