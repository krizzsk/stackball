package com.fyber.inneractive.sdk.player.p059c.p063d.p064a;

import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.C3295l;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3278n;
import com.fyber.inneractive.sdk.player.p059c.p063d.p064a.C3242d;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3544i;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.fyber.inneractive.sdk.player.p059c.p081l.C3562a;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.a.e */
final class C3244e extends C3242d {

    /* renamed from: a */
    private final C3548k f8179a = new C3548k(C3544i.f9604a);

    /* renamed from: c */
    private final C3548k f8180c = new C3548k(4);

    /* renamed from: d */
    private int f8181d;

    /* renamed from: e */
    private boolean f8182e;

    /* renamed from: f */
    private int f8183f;

    public C3244e(C3278n nVar) {
        super(nVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo18997a(C3548k kVar) throws C3242d.C3243a {
        int d = kVar.mo19387d();
        int i = (d >> 4) & 15;
        int i2 = d & 15;
        if (i2 == 7) {
            this.f8183f = i;
            return i != 5;
        }
        throw new C3242d.C3243a("Video format not supported: " + i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18996a(C3548k kVar, long j) throws C3295l {
        int d = kVar.mo19387d();
        long g = j + (((long) kVar.mo19393g()) * 1000);
        if (d == 0 && !this.f8182e) {
            C3548k kVar2 = new C3548k(new byte[kVar.mo19383b()]);
            kVar.mo19382a(kVar2.f9625a, 0, kVar.mo19383b());
            C3562a a = C3562a.m8897a(kVar2);
            this.f8181d = a.f9666b;
            this.f8178b.mo19040a(C3290h.m8117a((String) null, "video/avc", a.f9667c, a.f9668d, a.f9665a, a.f9669e));
            this.f8182e = true;
        } else if (d == 1 && this.f8182e) {
            byte[] bArr = this.f8180c.f9625a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i = 4 - this.f8181d;
            int i2 = 0;
            while (kVar.mo19383b() > 0) {
                kVar.mo19382a(this.f8180c.f9625a, i, this.f8181d);
                this.f8180c.mo19386c(0);
                int n = this.f8180c.mo19400n();
                this.f8179a.mo19386c(0);
                this.f8178b.mo19041a(this.f8179a, 4);
                this.f8178b.mo19041a(kVar, n);
                i2 = i2 + 4 + n;
            }
            this.f8178b.mo19038a(g, this.f8183f == 1 ? 1 : 0, i2, 0, (byte[]) null);
        }
    }
}
