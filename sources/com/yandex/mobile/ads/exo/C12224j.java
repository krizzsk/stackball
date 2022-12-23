package com.yandex.mobile.ads.exo;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.exo.source.C12287f;
import com.yandex.mobile.ads.impl.ih1;

/* renamed from: com.yandex.mobile.ads.exo.j */
final class C12224j {

    /* renamed from: a */
    public final C12287f.C12288a f29827a;

    /* renamed from: b */
    public final long f29828b;

    /* renamed from: c */
    public final long f29829c;

    /* renamed from: d */
    public final long f29830d;

    /* renamed from: e */
    public final long f29831e;

    /* renamed from: f */
    public final boolean f29832f;

    /* renamed from: g */
    public final boolean f29833g;

    C12224j(C12287f.C12288a aVar, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.f29827a = aVar;
        this.f29828b = j;
        this.f29829c = j2;
        this.f29830d = j3;
        this.f29831e = j4;
        this.f29832f = z;
        this.f29833g = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12224j.class != obj.getClass()) {
            return false;
        }
        C12224j jVar = (C12224j) obj;
        if (this.f29828b == jVar.f29828b && this.f29829c == jVar.f29829c && this.f29830d == jVar.f29830d && this.f29831e == jVar.f29831e && this.f29832f == jVar.f29832f && this.f29833g == jVar.f29833g && ih1.m37382a((Object) this.f29827a, (Object) jVar.f29827a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((this.f29827a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.f29828b)) * 31) + ((int) this.f29829c)) * 31) + ((int) this.f29830d)) * 31) + ((int) this.f29831e)) * 31) + (this.f29832f ? 1 : 0)) * 31) + (this.f29833g ? 1 : 0);
    }
}
