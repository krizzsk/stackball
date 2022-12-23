package com.applovin.impl.sdk.p026c;

/* renamed from: com.applovin.impl.sdk.c.e */
public final class C1383e {

    /* renamed from: a */
    private long f3235a;

    /* renamed from: b */
    private long f3236b;

    /* renamed from: c */
    private boolean f3237c;

    /* renamed from: d */
    private long f3238d;

    /* renamed from: e */
    private long f3239e;

    /* renamed from: a */
    public void mo12909a() {
        this.f3237c = true;
    }

    /* renamed from: a */
    public void mo12910a(long j) {
        this.f3235a += j;
    }

    /* renamed from: b */
    public void mo12911b(long j) {
        this.f3236b += j;
    }

    /* renamed from: b */
    public boolean mo12912b() {
        return this.f3237c;
    }

    /* renamed from: c */
    public long mo12913c() {
        return this.f3235a;
    }

    /* renamed from: d */
    public long mo12914d() {
        return this.f3236b;
    }

    /* renamed from: e */
    public void mo12915e() {
        this.f3238d++;
    }

    /* renamed from: f */
    public void mo12916f() {
        this.f3239e++;
    }

    /* renamed from: g */
    public long mo12917g() {
        return this.f3238d;
    }

    /* renamed from: h */
    public long mo12918h() {
        return this.f3239e;
    }

    public String toString() {
        return "CacheStatsTracker{totalDownloadedBytes=" + this.f3235a + ", totalCachedBytes=" + this.f3236b + ", isHTMLCachingCancelled=" + this.f3237c + ", htmlResourceCacheSuccessCount=" + this.f3238d + ", htmlResourceCacheFailureCount=" + this.f3239e + '}';
    }
}
