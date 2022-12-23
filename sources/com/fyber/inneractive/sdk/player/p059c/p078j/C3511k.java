package com.fyber.inneractive.sdk.player.p059c.p078j;

import android.os.Handler;
import android.os.SystemClock;
import android.support.p003v4.media.session.PlaybackStateCompat;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3500d;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3553p;
import java.util.Collections;

/* renamed from: com.fyber.inneractive.sdk.player.c.j.k */
public final class C3511k implements C3500d, C3534u<Object> {

    /* renamed from: a */
    private final Handler f9513a;

    /* renamed from: b */
    private final C3500d.C3501a f9514b;

    /* renamed from: c */
    private final C3553p f9515c;

    /* renamed from: d */
    private int f9516d;

    /* renamed from: e */
    private long f9517e;

    /* renamed from: f */
    private long f9518f;

    /* renamed from: g */
    private long f9519g;

    /* renamed from: h */
    private long f9520h;

    /* renamed from: i */
    private long f9521i;

    public C3511k() {
        this((byte) 0);
    }

    private C3511k(byte b) {
        this(0);
    }

    private C3511k(char c) {
        this.f9513a = null;
        this.f9514b = null;
        this.f9515c = new C3553p();
        this.f9521i = -1;
    }

    /* renamed from: a */
    public final synchronized void mo19350a() {
        if (this.f9516d == 0) {
            this.f9517e = SystemClock.elapsedRealtime();
        }
        this.f9516d++;
    }

    /* renamed from: a */
    public final synchronized void mo19351a(int i) {
        this.f9518f += (long) i;
    }

    /* renamed from: b */
    public final synchronized void mo19352b() {
        C3553p.C3556a aVar;
        float f;
        int i = 0;
        C3535a.m8784b(this.f9516d > 0);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        final int i2 = (int) (elapsedRealtime - this.f9517e);
        long j = (long) i2;
        this.f9519g += j;
        this.f9520h += this.f9518f;
        if (i2 > 0) {
            float f2 = (float) ((this.f9518f * 8000) / j);
            C3553p pVar = this.f9515c;
            int sqrt = (int) Math.sqrt((double) this.f9518f);
            if (pVar.f9641f != 1) {
                Collections.sort(pVar.f9639d, C3553p.f9636a);
                pVar.f9641f = 1;
            }
            if (pVar.f9644i > 0) {
                C3553p.C3556a[] aVarArr = pVar.f9640e;
                int i3 = pVar.f9644i - 1;
                pVar.f9644i = i3;
                aVar = aVarArr[i3];
            } else {
                aVar = new C3553p.C3556a((byte) 0);
            }
            int i4 = pVar.f9642g;
            pVar.f9642g = i4 + 1;
            aVar.f9645a = i4;
            aVar.f9646b = sqrt;
            aVar.f9647c = f2;
            pVar.f9639d.add(aVar);
            pVar.f9643h += sqrt;
            while (pVar.f9643h > pVar.f9638c) {
                int i5 = pVar.f9643h - pVar.f9638c;
                C3553p.C3556a aVar2 = pVar.f9639d.get(0);
                if (aVar2.f9646b <= i5) {
                    pVar.f9643h -= aVar2.f9646b;
                    pVar.f9639d.remove(0);
                    if (pVar.f9644i < 5) {
                        C3553p.C3556a[] aVarArr2 = pVar.f9640e;
                        int i6 = pVar.f9644i;
                        pVar.f9644i = i6 + 1;
                        aVarArr2[i6] = aVar2;
                    }
                } else {
                    aVar2.f9646b -= i5;
                    pVar.f9643h -= i5;
                }
            }
            if (this.f9519g >= 2000 || this.f9520h >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                C3553p pVar2 = this.f9515c;
                if (pVar2.f9641f != 0) {
                    Collections.sort(pVar2.f9639d, C3553p.f9637b);
                    pVar2.f9641f = 0;
                }
                float f3 = ((float) pVar2.f9643h) * 0.5f;
                int i7 = 0;
                while (true) {
                    if (i < pVar2.f9639d.size()) {
                        C3553p.C3556a aVar3 = pVar2.f9639d.get(i);
                        i7 += aVar3.f9646b;
                        if (((float) i7) >= f3) {
                            f = aVar3.f9647c;
                            break;
                        }
                        i++;
                    } else {
                        f = pVar2.f9639d.isEmpty() ? Float.NaN : pVar2.f9639d.get(pVar2.f9639d.size() - 1).f9647c;
                    }
                }
                this.f9521i = Float.isNaN(f) ? -1 : (long) f;
            }
        }
        final long j2 = this.f9518f;
        final long j3 = this.f9521i;
        if (!(this.f9513a == null || this.f9514b == null)) {
            this.f9513a.post(new Runnable() {
                public final void run() {
                }
            });
        }
        int i8 = this.f9516d - 1;
        this.f9516d = i8;
        if (i8 > 0) {
            this.f9517e = elapsedRealtime;
        }
        this.f9518f = 0;
    }
}
