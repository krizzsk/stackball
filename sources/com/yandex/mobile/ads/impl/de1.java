package com.yandex.mobile.ads.impl;

public final class de1 {

    /* renamed from: a */
    private long f32553a;

    /* renamed from: b */
    private long f32554b;

    /* renamed from: c */
    private volatile long f32555c = -9223372036854775807L;

    public de1(long j) {
        mo66568c(j);
    }

    /* renamed from: a */
    public long mo66563a() {
        return this.f32553a;
    }

    /* renamed from: b */
    public long mo66565b() {
        if (this.f32555c != -9223372036854775807L) {
            return this.f32554b + this.f32555c;
        }
        long j = this.f32553a;
        if (j != Long.MAX_VALUE) {
            return j;
        }
        return -9223372036854775807L;
    }

    /* renamed from: c */
    public synchronized void mo66568c(long j) {
        C13479j9.m37708b(this.f32555c == -9223372036854775807L);
        this.f32553a = j;
    }

    /* renamed from: d */
    public void mo66569d() {
        this.f32555c = -9223372036854775807L;
    }

    /* renamed from: a */
    public long mo66564a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f32555c != -9223372036854775807L) {
            this.f32555c = j;
        } else {
            long j2 = this.f32553a;
            if (j2 != Long.MAX_VALUE) {
                this.f32554b = j2 - j;
            }
            synchronized (this) {
                this.f32555c = j;
                notifyAll();
            }
        }
        return j + this.f32554b;
    }

    /* renamed from: c */
    public long mo66567c() {
        if (this.f32553a == Long.MAX_VALUE) {
            return 0;
        }
        if (this.f32555c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f32554b;
    }

    /* renamed from: b */
    public long mo66566b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f32555c != -9223372036854775807L) {
            long j2 = (this.f32555c * 90000) / 1000000;
            long j3 = (4294967296L + j2) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - j2) < Math.abs(j - j2)) {
                j = j4;
            }
        }
        return mo66564a((j * 1000000) / 90000);
    }
}
