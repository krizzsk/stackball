package com.fyber.inneractive.sdk.player.p059c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.fyber.inneractive.sdk.player.p059c.C3279e;
import com.fyber.inneractive.sdk.player.p059c.C3285g;
import com.fyber.inneractive.sdk.player.p059c.C3300q;
import com.fyber.inneractive.sdk.player.p059c.p074g.C3454d;
import com.fyber.inneractive.sdk.player.p059c.p074g.C3461i;
import com.fyber.inneractive.sdk.player.p059c.p077i.C3473e;
import com.fyber.inneractive.sdk.player.p059c.p077i.C3475f;
import com.fyber.inneractive.sdk.player.p059c.p077i.C3476g;
import com.fyber.inneractive.sdk.player.p059c.p077i.C3478h;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.fyber.inneractive.sdk.player.c.f */
public final class C3283f implements C3279e {

    /* renamed from: a */
    final C3476g f8401a;

    /* renamed from: b */
    final CopyOnWriteArraySet<C3279e.C3280a> f8402b;

    /* renamed from: c */
    boolean f8403c;

    /* renamed from: d */
    boolean f8404d;

    /* renamed from: e */
    int f8405e;

    /* renamed from: f */
    int f8406f;

    /* renamed from: g */
    int f8407g;

    /* renamed from: h */
    boolean f8408h;

    /* renamed from: i */
    C3300q f8409i;

    /* renamed from: j */
    Object f8410j;

    /* renamed from: k */
    C3461i f8411k;

    /* renamed from: l */
    C3475f f8412l;

    /* renamed from: m */
    C3296m f8413m;

    /* renamed from: n */
    C3285g.C3287b f8414n;

    /* renamed from: o */
    private final C3297n[] f8415o;

    /* renamed from: p */
    private final C3475f f8416p;

    /* renamed from: q */
    private final Handler f8417q;

    /* renamed from: r */
    private final C3285g f8418r;

    /* renamed from: s */
    private final C3300q.C3303b f8419s;

    /* renamed from: t */
    private final C3300q.C3302a f8420t;

    /* renamed from: u */
    private int f8421u;

    /* renamed from: v */
    private int f8422v;

    /* renamed from: w */
    private long f8423w;

    public C3283f(C3297n[] nVarArr, C3476g gVar, C3294k kVar) {
        Log.i("ExoPlayerImpl", "Init ExoPlayerLib/2.4.4 [" + C3560t.f9659e + "]");
        C3535a.m8784b(nVarArr.length > 0);
        this.f8415o = (C3297n[]) C3535a.m8781a(nVarArr);
        this.f8401a = (C3476g) C3535a.m8781a(gVar);
        this.f8404d = false;
        this.f8405e = 1;
        this.f8402b = new CopyOnWriteArraySet<>();
        this.f8416p = new C3475f(new C3473e[nVarArr.length]);
        this.f8409i = C3300q.f8524a;
        this.f8419s = new C3300q.C3303b();
        this.f8420t = new C3300q.C3302a();
        this.f8411k = C3461i.f9362a;
        this.f8412l = this.f8416p;
        this.f8413m = C3296m.f8518a;
        this.f8417q = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()) {
            public final void handleMessage(Message message) {
                C3283f fVar = C3283f.this;
                boolean z = true;
                switch (message.what) {
                    case 0:
                        fVar.f8407g--;
                        return;
                    case 1:
                        fVar.f8405e = message.arg1;
                        Iterator<C3279e.C3280a> it = fVar.f8402b.iterator();
                        while (it.hasNext()) {
                            it.next().mo18806a(fVar.f8404d, fVar.f8405e);
                        }
                        return;
                    case 2:
                        if (message.arg1 == 0) {
                            z = false;
                        }
                        fVar.f8408h = z;
                        Iterator<C3279e.C3280a> it2 = fVar.f8402b.iterator();
                        while (it2.hasNext()) {
                            it2.next();
                        }
                        return;
                    case 3:
                        if (fVar.f8407g == 0) {
                            C3478h hVar = (C3478h) message.obj;
                            fVar.f8403c = true;
                            fVar.f8411k = hVar.f9408a;
                            fVar.f8412l = hVar.f9409b;
                            fVar.f8401a.mo19303a(hVar.f9410c);
                            Iterator<C3279e.C3280a> it3 = fVar.f8402b.iterator();
                            while (it3.hasNext()) {
                                it3.next();
                            }
                            return;
                        }
                        return;
                    case 4:
                        int i = fVar.f8406f - 1;
                        fVar.f8406f = i;
                        if (i == 0) {
                            fVar.f8414n = (C3285g.C3287b) message.obj;
                            if (message.arg1 != 0) {
                                Iterator<C3279e.C3280a> it4 = fVar.f8402b.iterator();
                                while (it4.hasNext()) {
                                    it4.next();
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        if (fVar.f8406f == 0) {
                            fVar.f8414n = (C3285g.C3287b) message.obj;
                            Iterator<C3279e.C3280a> it5 = fVar.f8402b.iterator();
                            while (it5.hasNext()) {
                                it5.next();
                            }
                            return;
                        }
                        return;
                    case 6:
                        C3285g.C3289d dVar = (C3285g.C3289d) message.obj;
                        fVar.f8406f -= dVar.f8486d;
                        if (fVar.f8407g == 0) {
                            fVar.f8409i = dVar.f8483a;
                            fVar.f8410j = dVar.f8484b;
                            fVar.f8414n = dVar.f8485c;
                            Iterator<C3279e.C3280a> it6 = fVar.f8402b.iterator();
                            while (it6.hasNext()) {
                                it6.next();
                            }
                            return;
                        }
                        return;
                    case 7:
                        C3296m mVar = (C3296m) message.obj;
                        if (!fVar.f8413m.equals(mVar)) {
                            fVar.f8413m = mVar;
                            Iterator<C3279e.C3280a> it7 = fVar.f8402b.iterator();
                            while (it7.hasNext()) {
                                it7.next();
                            }
                            return;
                        }
                        return;
                    case 8:
                        C3236d dVar2 = (C3236d) message.obj;
                        Iterator<C3279e.C3280a> it8 = fVar.f8402b.iterator();
                        while (it8.hasNext()) {
                            it8.next().mo18804a(dVar2);
                        }
                        return;
                    default:
                        throw new IllegalStateException();
                }
            }
        };
        C3285g.C3287b bVar = new C3285g.C3287b(0, 0);
        this.f8414n = bVar;
        this.f8418r = new C3285g(nVarArr, gVar, kVar, this.f8404d, this.f8417q, bVar, this);
    }

    /* renamed from: a */
    public final void mo19064a(C3279e.C3280a aVar) {
        this.f8402b.add(aVar);
    }

    /* renamed from: a */
    public final void mo19066a(boolean z) {
        if (this.f8404d != z) {
            this.f8404d = z;
            this.f8418r.f8431a.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            Iterator<C3279e.C3280a> it = this.f8402b.iterator();
            while (it.hasNext()) {
                it.next().mo18806a(z, this.f8405e);
            }
        }
    }

    /* renamed from: a */
    public final void mo19062a() {
        m8063a(m8064g(), -9223372036854775807L);
    }

    /* renamed from: a */
    public final void mo19063a(long j) {
        m8063a(m8064g(), j);
    }

    /* renamed from: a */
    private void m8063a(int i, long j) {
        long j2;
        if (i < 0 || (!this.f8409i.mo19106a() && i >= this.f8409i.mo19107b())) {
            throw new C3293j(this.f8409i, i, j);
        }
        this.f8406f++;
        this.f8421u = i;
        if (this.f8409i.mo19106a()) {
            this.f8422v = 0;
        } else {
            this.f8409i.mo19105a(i, this.f8419s, 0);
            if (j == -9223372036854775807L) {
                j2 = this.f8419s.f8538h;
            } else {
                j2 = j;
            }
            int i2 = this.f8419s.f8536f;
            long b = this.f8419s.f8540j + C3220b.m7844b(j2);
            long j3 = this.f8409i.mo19104a(i2, this.f8420t, false).f8528d;
            while (j3 != -9223372036854775807L && b >= j3 && i2 < this.f8419s.f8537g) {
                b -= j3;
                i2++;
                j3 = this.f8409i.mo19104a(i2, this.f8420t, false).f8528d;
            }
            this.f8422v = i2;
        }
        if (j == -9223372036854775807L) {
            this.f8423w = 0;
            this.f8418r.mo19078a(this.f8409i, i, -9223372036854775807L);
            return;
        }
        this.f8423w = j;
        this.f8418r.mo19078a(this.f8409i, i, C3220b.m7844b(j));
        Iterator<C3279e.C3280a> it = this.f8402b.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: b */
    public final void mo19068b() {
        this.f8418r.f8431a.sendEmptyMessage(5);
    }

    /* renamed from: c */
    public final void mo19069c() {
        this.f8418r.mo19074a();
        this.f8417q.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: a */
    public final void mo19067a(C3279e.C3282c... cVarArr) {
        C3285g gVar = this.f8418r;
        if (gVar.f8432b) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        gVar.f8433c++;
        gVar.f8431a.obtainMessage(11, cVarArr).sendToTarget();
    }

    /* renamed from: g */
    private int m8064g() {
        if (this.f8409i.mo19106a() || this.f8406f > 0) {
            return this.f8421u;
        }
        return this.f8409i.mo19104a(this.f8414n.f8476a, this.f8420t, false).f8527c;
    }

    /* renamed from: e */
    public final long mo19071e() {
        if (this.f8409i.mo19106a()) {
            return -9223372036854775807L;
        }
        return C3220b.m7843a(this.f8409i.mo19105a(m8064g(), this.f8419s, 0).f8539i);
    }

    /* renamed from: f */
    public final long mo19072f() {
        if (this.f8409i.mo19106a() || this.f8406f > 0) {
            return this.f8423w;
        }
        this.f8409i.mo19104a(this.f8414n.f8476a, this.f8420t, false);
        return C3220b.m7843a(this.f8420t.f8530f) + C3220b.m7843a(this.f8414n.f8478c);
    }

    /* renamed from: d */
    public final C3475f mo19070d() {
        return this.f8412l;
    }

    /* renamed from: a */
    public final void mo19065a(C3454d dVar) {
        if (!this.f8409i.mo19106a() || this.f8410j != null) {
            this.f8409i = C3300q.f8524a;
            this.f8410j = null;
            Iterator<C3279e.C3280a> it = this.f8402b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        if (this.f8403c) {
            this.f8403c = false;
            this.f8411k = C3461i.f9362a;
            this.f8412l = this.f8416p;
            this.f8401a.mo19303a((Object) null);
            Iterator<C3279e.C3280a> it2 = this.f8402b.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        this.f8407g++;
        this.f8418r.f8431a.obtainMessage(0, 1, 0, dVar).sendToTarget();
    }
}
