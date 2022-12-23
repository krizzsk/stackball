package com.fyber.inneractive.sdk.player.p059c.p063d.p069f;

import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.p060a.C3214g;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3278n;
import com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3396v;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.f.f */
public final class C3371f implements C3373h {

    /* renamed from: a */
    private final C3548k f8969a;

    /* renamed from: b */
    private final String f8970b;

    /* renamed from: c */
    private String f8971c;

    /* renamed from: d */
    private C3278n f8972d;

    /* renamed from: e */
    private int f8973e = 0;

    /* renamed from: f */
    private int f8974f;

    /* renamed from: g */
    private int f8975g;

    /* renamed from: h */
    private long f8976h;

    /* renamed from: i */
    private C3290h f8977i;

    /* renamed from: j */
    private int f8978j;

    /* renamed from: k */
    private long f8979k;

    /* renamed from: b */
    public final void mo19160b() {
    }

    public C3371f(String str) {
        C3548k kVar = new C3548k(new byte[15]);
        this.f8969a = kVar;
        kVar.f9625a[0] = Byte.MAX_VALUE;
        this.f8969a.f9625a[1] = -2;
        this.f8969a.f9625a[2] = Byte.MIN_VALUE;
        this.f8969a.f9625a[3] = 1;
        this.f8970b = str;
    }

    /* renamed from: a */
    public final void mo19156a() {
        this.f8973e = 0;
        this.f8974f = 0;
        this.f8975g = 0;
    }

    /* renamed from: a */
    public final void mo19158a(C3270h hVar, C3396v.C3400d dVar) {
        dVar.mo19181a();
        this.f8971c = dVar.mo19183c();
        this.f8972d = hVar.mo19056a(dVar.mo19182b());
    }

    /* renamed from: a */
    public final void mo19157a(long j, boolean z) {
        this.f8979k = j;
    }

    /* renamed from: a */
    public final void mo19159a(C3548k kVar) {
        while (kVar.mo19383b() > 0) {
            int i = this.f8973e;
            boolean z = true;
            boolean z2 = false;
            if (i == 0) {
                while (true) {
                    if (kVar.mo19383b() <= 0) {
                        break;
                    }
                    int i2 = this.f8975g << 8;
                    this.f8975g = i2;
                    int d = i2 | kVar.mo19387d();
                    this.f8975g = d;
                    if (d == 2147385345) {
                        this.f8975g = 0;
                        z2 = true;
                        break;
                    }
                }
                if (z2) {
                    this.f8974f = 4;
                    this.f8973e = 1;
                }
            } else if (i == 1) {
                byte[] bArr = this.f8969a.f9625a;
                int min = Math.min(kVar.mo19383b(), 15 - this.f8974f);
                kVar.mo19382a(bArr, this.f8974f, min);
                int i3 = this.f8974f + min;
                this.f8974f = i3;
                if (i3 != 15) {
                    z = false;
                }
                if (z) {
                    byte[] bArr2 = this.f8969a.f9625a;
                    if (this.f8977i == null) {
                        C3290h a = C3214g.m7785a(bArr2, this.f8971c, this.f8970b);
                        this.f8977i = a;
                        this.f8972d.mo19040a(a);
                    }
                    this.f8978j = C3214g.m7786b(bArr2);
                    this.f8976h = (long) ((int) ((((long) C3214g.m7784a(bArr2)) * 1000000) / ((long) this.f8977i.f8506s)));
                    this.f8969a.mo19386c(0);
                    this.f8972d.mo19041a(this.f8969a, 15);
                    this.f8973e = 2;
                }
            } else if (i == 2) {
                int min2 = Math.min(kVar.mo19383b(), this.f8978j - this.f8974f);
                this.f8972d.mo19041a(kVar, min2);
                int i4 = this.f8974f + min2;
                this.f8974f = i4;
                int i5 = this.f8978j;
                if (i4 == i5) {
                    this.f8972d.mo19038a(this.f8979k, 1, i5, 0, (byte[]) null);
                    this.f8979k += this.f8976h;
                    this.f8973e = 0;
                }
            }
        }
    }
}
