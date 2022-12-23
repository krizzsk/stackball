package com.fyber.inneractive.sdk.player.p059c.p063d.p068e;

import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3269g;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3275l;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3276m;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3278n;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.e.h */
abstract class C3353h {

    /* renamed from: a */
    private C3349d f8874a;

    /* renamed from: b */
    long f8875b;

    /* renamed from: c */
    int f8876c;

    /* renamed from: d */
    private C3278n f8877d;

    /* renamed from: e */
    private C3270h f8878e;

    /* renamed from: f */
    private C3351f f8879f;

    /* renamed from: g */
    private long f8880g;

    /* renamed from: h */
    private long f8881h;

    /* renamed from: i */
    private int f8882i;

    /* renamed from: j */
    private C3354a f8883j;

    /* renamed from: k */
    private long f8884k;

    /* renamed from: l */
    private boolean f8885l;

    /* renamed from: m */
    private boolean f8886m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo19140a(C3548k kVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo19142a(C3548k kVar, long j, C3354a aVar) throws IOException, InterruptedException;

    C3353h() {
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.e.h$a */
    static class C3354a {

        /* renamed from: a */
        C3290h f8887a;

        /* renamed from: b */
        C3351f f8888b;

        C3354a() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo19150a(C3270h hVar, C3278n nVar) {
        this.f8878e = hVar;
        this.f8877d = nVar;
        this.f8874a = new C3349d();
        mo19141a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19141a(boolean z) {
        if (z) {
            this.f8883j = new C3354a();
            this.f8875b = 0;
            this.f8876c = 0;
        } else {
            this.f8876c = 1;
        }
        this.f8880g = -1;
        this.f8881h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo19149a(long j, long j2) {
        C3349d dVar = this.f8874a;
        dVar.f8854a.mo19144a();
        dVar.f8855b.mo19378a();
        dVar.f8856c = -1;
        dVar.f8857d = false;
        if (j == 0) {
            mo19141a(!this.f8885l);
        } else if (this.f8876c != 0) {
            this.f8880g = this.f8879f.mo19139a_(j2);
            this.f8876c = 2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo19146a(C3269g gVar) throws IOException, InterruptedException {
        boolean z = true;
        while (z) {
            if (!this.f8874a.mo19143a(gVar)) {
                this.f8876c = 3;
                return -1;
            }
            this.f8884k = gVar.mo19012c() - this.f8875b;
            z = mo19142a(this.f8874a.f8855b, this.f8875b, this.f8883j);
            if (z) {
                this.f8875b = gVar.mo19012c();
            }
        }
        this.f8882i = this.f8883j.f8887a.f8506s;
        if (!this.f8886m) {
            this.f8877d.mo19040a(this.f8883j.f8887a);
            this.f8886m = true;
        }
        if (this.f8883j.f8888b != null) {
            this.f8879f = this.f8883j.f8888b;
        } else if (gVar.mo19015d() == -1) {
            this.f8879f = new C3355b((byte) 0);
        } else {
            C3350e eVar = this.f8874a.f8854a;
            this.f8879f = new C3343a(this.f8875b, gVar.mo19015d(), this, eVar.f8867h + eVar.f8868i, eVar.f8862c);
        }
        this.f8883j = null;
        this.f8876c = 2;
        C3349d dVar = this.f8874a;
        if (dVar.f8855b.f9625a.length != 65025) {
            dVar.f8855b.f9625a = Arrays.copyOf(dVar.f8855b.f9625a, Math.max(65025, dVar.f8855b.f9627c));
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo19147a(C3269g gVar, C3275l lVar) throws IOException, InterruptedException {
        C3269g gVar2 = gVar;
        long a = this.f8879f.mo19137a(gVar2);
        if (a >= 0) {
            lVar.f8396a = a;
            return 1;
        }
        if (a < -1) {
            mo19152c(-(a + 2));
        }
        if (!this.f8885l) {
            this.f8878e.mo19057a(this.f8879f.mo19138a());
            this.f8885l = true;
        }
        if (this.f8884k > 0 || this.f8874a.mo19143a(gVar2)) {
            this.f8884k = 0;
            C3548k kVar = this.f8874a.f8855b;
            long a2 = mo19140a(kVar);
            if (a2 >= 0) {
                long j = this.f8881h;
                if (j + a2 >= this.f8880g) {
                    long a3 = mo19148a(j);
                    this.f8877d.mo19041a(kVar, kVar.f9627c);
                    this.f8877d.mo19038a(a3, 1, kVar.f9627c, 0, (byte[]) null);
                    this.f8880g = -1;
                }
            }
            this.f8881h += a2;
            return 0;
        }
        this.f8876c = 3;
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo19148a(long j) {
        return (j * 1000000) / ((long) this.f8882i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo19151b(long j) {
        return (((long) this.f8882i) * j) / 1000000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo19152c(long j) {
        this.f8881h = j;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.e.h$b */
    private static final class C3355b implements C3351f {
        /* renamed from: a */
        public final long mo19137a(C3269g gVar) throws IOException, InterruptedException {
            return -1;
        }

        /* renamed from: a_ */
        public final long mo19139a_(long j) {
            return 0;
        }

        private C3355b() {
        }

        /* synthetic */ C3355b(byte b) {
            this();
        }

        /* renamed from: a */
        public final C3276m mo19138a() {
            return new C3276m.C3277a(-9223372036854775807L);
        }
    }
}
