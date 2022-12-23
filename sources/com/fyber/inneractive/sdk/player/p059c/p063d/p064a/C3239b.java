package com.fyber.inneractive.sdk.player.p059c.p063d.p064a;

import com.fyber.inneractive.sdk.player.p059c.p063d.C3268f;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3269g;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3271i;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3275l;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3276m;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.a.b */
public final class C3239b implements C3268f, C3276m {

    /* renamed from: a */
    public static final C3271i f8162a = new C3271i() {
        /* renamed from: a */
        public final C3268f[] mo19002a() {
            return new C3268f[]{new C3239b()};
        }
    };

    /* renamed from: e */
    private static final int f8163e = C3560t.m8893e("FLV");

    /* renamed from: b */
    public int f8164b;

    /* renamed from: c */
    public int f8165c;

    /* renamed from: d */
    public long f8166d;

    /* renamed from: f */
    private final C3548k f8167f = new C3548k(4);

    /* renamed from: g */
    private final C3548k f8168g = new C3548k(9);

    /* renamed from: h */
    private final C3548k f8169h = new C3548k(11);

    /* renamed from: i */
    private final C3548k f8170i = new C3548k();

    /* renamed from: j */
    private C3270h f8171j;

    /* renamed from: k */
    private int f8172k = 1;

    /* renamed from: l */
    private int f8173l;

    /* renamed from: m */
    private C3238a f8174m;

    /* renamed from: n */
    private C3244e f8175n;

    /* renamed from: o */
    private C3241c f8176o;

    /* renamed from: a */
    public final long mo18993a(long j) {
        return 0;
    }

    /* renamed from: b_ */
    public final boolean mo18995b_() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo19001a(C3269g gVar) throws IOException, InterruptedException {
        gVar.mo19014c(this.f8167f.f9625a, 0, 3);
        this.f8167f.mo19386c(0);
        if (this.f8167f.mo19393g() != f8163e) {
            return false;
        }
        gVar.mo19014c(this.f8167f.f9625a, 0, 2);
        this.f8167f.mo19386c(0);
        if ((this.f8167f.mo19389e() & 250) != 0) {
            return false;
        }
        gVar.mo19014c(this.f8167f.f9625a, 0, 4);
        this.f8167f.mo19386c(0);
        int j = this.f8167f.mo19396j();
        gVar.mo19006a();
        gVar.mo19013c(j);
        gVar.mo19014c(this.f8167f.f9625a, 0, 4);
        this.f8167f.mo19386c(0);
        if (this.f8167f.mo19396j() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo19000a(C3270h hVar) {
        this.f8171j = hVar;
    }

    /* renamed from: a */
    public final void mo18999a(long j, long j2) {
        this.f8172k = 1;
        this.f8173l = 0;
    }

    /* renamed from: a */
    public final int mo18998a(C3269g gVar, C3275l lVar) throws IOException, InterruptedException {
        C3241c cVar;
        C3244e eVar;
        C3238a aVar;
        while (true) {
            int i = this.f8172k;
            boolean z = true;
            boolean z2 = false;
            if (i == 1) {
                if (!gVar.mo19007a(this.f8168g.f9625a, 0, 9, true)) {
                    z = false;
                } else {
                    this.f8168g.mo19386c(0);
                    this.f8168g.mo19388d(4);
                    int d = this.f8168g.mo19387d();
                    boolean z3 = (d & 4) != 0;
                    if ((d & 1) != 0) {
                        z2 = true;
                    }
                    if (z3 && this.f8174m == null) {
                        this.f8174m = new C3238a(this.f8171j.mo19056a(8));
                    }
                    if (z2 && this.f8175n == null) {
                        this.f8175n = new C3244e(this.f8171j.mo19056a(9));
                    }
                    if (this.f8176o == null) {
                        this.f8176o = new C3241c();
                    }
                    this.f8171j.mo19058b();
                    this.f8171j.mo19057a((C3276m) this);
                    this.f8173l = (this.f8168g.mo19396j() - 9) + 4;
                    this.f8172k = 2;
                }
                if (!z) {
                    return -1;
                }
            } else if (i == 2) {
                gVar.mo19009b(this.f8173l);
                this.f8173l = 0;
                this.f8172k = 3;
            } else if (i == 3) {
                if (!gVar.mo19007a(this.f8169h.f9625a, 0, 11, true)) {
                    z = false;
                } else {
                    this.f8169h.mo19386c(0);
                    this.f8164b = this.f8169h.mo19387d();
                    this.f8165c = this.f8169h.mo19393g();
                    this.f8166d = (long) this.f8169h.mo19393g();
                    this.f8166d = (((long) (this.f8169h.mo19387d() << 24)) | this.f8166d) * 1000;
                    this.f8169h.mo19388d(3);
                    this.f8172k = 4;
                }
                if (!z) {
                    return -1;
                }
            } else if (i == 4) {
                if (this.f8164b == 8 && (aVar = this.f8174m) != null) {
                    aVar.mo19003b(m7876b(gVar), this.f8166d);
                } else if (this.f8164b == 9 && (eVar = this.f8175n) != null) {
                    eVar.mo19003b(m7876b(gVar), this.f8166d);
                } else if (this.f8164b != 18 || (cVar = this.f8176o) == null) {
                    gVar.mo19009b(this.f8165c);
                    z = false;
                } else {
                    cVar.mo19003b(m7876b(gVar), this.f8166d);
                }
                this.f8173l = 4;
                this.f8172k = 2;
                if (z) {
                    return 0;
                }
            } else {
                continue;
            }
        }
    }

    /* renamed from: b */
    private C3548k m7876b(C3269g gVar) throws IOException, InterruptedException {
        if (this.f8165c > this.f8170i.mo19385c()) {
            C3548k kVar = this.f8170i;
            kVar.mo19381a(new byte[Math.max(kVar.mo19385c() * 2, this.f8165c)], 0);
        } else {
            this.f8170i.mo19386c(0);
        }
        this.f8170i.mo19384b(this.f8165c);
        gVar.mo19010b(this.f8170i.f9625a, 0, this.f8165c);
        return this.f8170i;
    }

    /* renamed from: b */
    public final long mo18994b() {
        return this.f8176o.f8177a;
    }
}
