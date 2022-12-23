package com.fyber.inneractive.sdk.player.p059c.p080k;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.p059c.C3220b;
import com.fyber.inneractive.sdk.player.p059c.C3296m;

/* renamed from: com.fyber.inneractive.sdk.player.c.k.q */
public final class C3557q implements C3542g {

    /* renamed from: a */
    public boolean f9648a;

    /* renamed from: b */
    public long f9649b;

    /* renamed from: c */
    private long f9650c;

    /* renamed from: d */
    private C3296m f9651d = C3296m.f8518a;

    /* renamed from: a */
    public final void mo19418a() {
        if (this.f9648a) {
            mo19419a(mo18955v());
            this.f9648a = false;
        }
    }

    /* renamed from: a */
    public final void mo19419a(long j) {
        this.f9650c = j;
        if (this.f9648a) {
            this.f9649b = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: a */
    public final void mo19420a(C3542g gVar) {
        mo19419a(gVar.mo18955v());
        this.f9651d = gVar.mo18956w();
    }

    /* renamed from: v */
    public final long mo18955v() {
        long j;
        long j2 = this.f9650c;
        if (!this.f9648a) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f9649b;
        if (this.f9651d.f8519b == 1.0f) {
            j = C3220b.m7844b(elapsedRealtime);
        } else {
            j = elapsedRealtime * ((long) this.f9651d.f8521d);
        }
        return j2 + j;
    }

    /* renamed from: a */
    public final C3296m mo18947a(C3296m mVar) {
        if (this.f9648a) {
            mo19419a(mo18955v());
        }
        this.f9651d = mVar;
        return mVar;
    }

    /* renamed from: w */
    public final C3296m mo18956w() {
        return this.f9651d;
    }
}
