package com.fyber.inneractive.sdk.player.p059c.p080k;

/* renamed from: com.fyber.inneractive.sdk.player.c.k.r */
public final class C3558r {

    /* renamed from: a */
    public long f9652a;

    /* renamed from: b */
    public volatile long f9653b = -9223372036854775807L;

    /* renamed from: c */
    private long f9654c;

    public C3558r(long j) {
        m8863c(j);
    }

    /* renamed from: c */
    private synchronized void m8863c(long j) {
        C3535a.m8784b(this.f9653b == -9223372036854775807L);
        this.f9652a = j;
    }

    /* renamed from: a */
    public final long mo19421a() {
        if (this.f9652a == Long.MAX_VALUE) {
            return 0;
        }
        if (this.f9653b == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f9654c;
    }

    /* renamed from: a */
    public final long mo19422a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f9653b != -9223372036854775807L) {
            long j2 = (this.f9653b * 90000) / 1000000;
            long j3 = (4294967296L + j2) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - j2) < Math.abs(j - j2)) {
                j = j4;
            }
        }
        return mo19423b((j * 1000000) / 90000);
    }

    /* renamed from: b */
    public final long mo19423b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f9653b != -9223372036854775807L) {
            this.f9653b = j;
        } else {
            long j2 = this.f9652a;
            if (j2 != Long.MAX_VALUE) {
                this.f9654c = j2 - j;
            }
            synchronized (this) {
                this.f9653b = j;
                notifyAll();
            }
        }
        return j + this.f9654c;
    }
}
