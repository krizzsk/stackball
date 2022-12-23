package com.fyber.inneractive.sdk.player.p059c.p074g;

import com.fyber.inneractive.sdk.player.p059c.C3300q;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;

/* renamed from: com.fyber.inneractive.sdk.player.c.g.g */
public final class C3459g extends C3300q {

    /* renamed from: b */
    private static final Object f9352b = new Object();

    /* renamed from: c */
    private final long f9353c;

    /* renamed from: d */
    private final long f9354d;

    /* renamed from: e */
    private final long f9355e;

    /* renamed from: f */
    private final long f9356f;

    /* renamed from: g */
    private final boolean f9357g;

    /* renamed from: h */
    private final boolean f9358h;

    /* renamed from: b */
    public final int mo19107b() {
        return 1;
    }

    /* renamed from: c */
    public final int mo19108c() {
        return 1;
    }

    public C3459g(long j, boolean z) {
        this(j, j, z);
    }

    private C3459g(long j, long j2, boolean z) {
        this.f9353c = j;
        this.f9354d = j2;
        this.f9355e = 0;
        this.f9356f = 0;
        this.f9357g = z;
        this.f9358h = false;
    }

    /* renamed from: a */
    public final C3300q.C3303b mo19105a(int i, C3300q.C3303b bVar, long j) {
        C3535a.m8780a(i, 1);
        long j2 = this.f9356f;
        if (this.f9358h) {
            j2 += j;
            if (j2 > this.f9354d) {
                j2 = -9223372036854775807L;
            }
        }
        boolean z = this.f9357g;
        boolean z2 = this.f9358h;
        long j3 = this.f9354d;
        long j4 = this.f9355e;
        bVar.f8531a = null;
        bVar.f8532b = -9223372036854775807L;
        bVar.f8533c = -9223372036854775807L;
        bVar.f8534d = z;
        bVar.f8535e = z2;
        bVar.f8538h = j2;
        bVar.f8539i = j3;
        bVar.f8536f = 0;
        bVar.f8537g = 0;
        bVar.f8540j = j4;
        return bVar;
    }

    /* renamed from: a */
    public final C3300q.C3302a mo19104a(int i, C3300q.C3302a aVar, boolean z) {
        C3535a.m8780a(i, 1);
        Object obj = z ? f9352b : null;
        long j = this.f9353c;
        aVar.f8525a = obj;
        aVar.f8526b = obj;
        aVar.f8527c = 0;
        aVar.f8528d = j;
        aVar.f8530f = -this.f9355e;
        aVar.f8529e = false;
        return aVar;
    }

    /* renamed from: a */
    public final int mo19103a(Object obj) {
        return f9352b.equals(obj) ? 0 : -1;
    }
}
