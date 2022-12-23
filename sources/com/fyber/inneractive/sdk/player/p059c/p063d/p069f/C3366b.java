package com.fyber.inneractive.sdk.player.p059c.p063d.p069f;

import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.p060a.C3189a;
import com.fyber.inneractive.sdk.player.p059c.p062c.C3227a;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3278n;
import com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3396v;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3547j;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.google.common.base.Ascii;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.f.b */
public final class C3366b implements C3373h {

    /* renamed from: a */
    long f8931a;

    /* renamed from: b */
    private final C3547j f8932b;

    /* renamed from: c */
    private final C3548k f8933c;

    /* renamed from: d */
    private final String f8934d;

    /* renamed from: e */
    private String f8935e;

    /* renamed from: f */
    private C3278n f8936f;

    /* renamed from: g */
    private int f8937g;

    /* renamed from: h */
    private int f8938h;

    /* renamed from: i */
    private boolean f8939i;

    /* renamed from: j */
    private long f8940j;

    /* renamed from: k */
    private C3290h f8941k;

    /* renamed from: l */
    private int f8942l;

    /* renamed from: b */
    public final void mo19160b() {
    }

    public C3366b() {
        this((String) null);
    }

    public C3366b(String str) {
        C3547j jVar = new C3547j(new byte[8]);
        this.f8932b = jVar;
        this.f8933c = new C3548k(jVar.f9621a);
        this.f8937g = 0;
        this.f8934d = str;
    }

    /* renamed from: a */
    public final void mo19156a() {
        this.f8937g = 0;
        this.f8938h = 0;
        this.f8939i = false;
    }

    /* renamed from: a */
    public final void mo19158a(C3270h hVar, C3396v.C3400d dVar) {
        dVar.mo19181a();
        this.f8935e = dVar.mo19183c();
        this.f8936f = hVar.mo19056a(dVar.mo19182b());
    }

    /* renamed from: a */
    public final void mo19157a(long j, boolean z) {
        this.f8931a = j;
    }

    /* renamed from: a */
    public final void mo19159a(C3548k kVar) {
        boolean z;
        C3548k kVar2 = kVar;
        while (kVar.mo19383b() > 0) {
            int i = this.f8937g;
            boolean z2 = true;
            if (i == 0) {
                while (true) {
                    if (kVar.mo19383b() <= 0) {
                        z = false;
                        break;
                    } else if (!this.f8939i) {
                        this.f8939i = kVar.mo19387d() == 11;
                    } else {
                        int d = kVar.mo19387d();
                        if (d == 119) {
                            this.f8939i = false;
                            z = true;
                            break;
                        }
                        this.f8939i = d == 11;
                    }
                }
                if (z) {
                    this.f8937g = 1;
                    this.f8933c.f9625a[0] = Ascii.f10113VT;
                    this.f8933c.f9625a[1] = 119;
                    this.f8938h = 2;
                }
            } else if (i == 1) {
                byte[] bArr = this.f8933c.f9625a;
                int min = Math.min(kVar.mo19383b(), 8 - this.f8938h);
                kVar2.mo19382a(bArr, this.f8938h, min);
                int i2 = this.f8938h + min;
                this.f8938h = i2;
                if (i2 != 8) {
                    z2 = false;
                }
                if (z2) {
                    this.f8932b.mo19374a(0);
                    C3189a.C3190a a = C3189a.m7722a(this.f8932b);
                    if (!(this.f8941k != null && a.f7936c == this.f8941k.f8505r && a.f7935b == this.f8941k.f8506s && a.f7934a == this.f8941k.f8493f)) {
                        C3290h a2 = C3290h.m8115a(this.f8935e, a.f7934a, -1, -1, a.f7936c, a.f7935b, (List<byte[]>) null, (C3227a) null, this.f8934d);
                        this.f8941k = a2;
                        this.f8936f.mo19040a(a2);
                    }
                    this.f8942l = a.f7937d;
                    this.f8940j = (((long) a.f7938e) * 1000000) / ((long) this.f8941k.f8506s);
                    this.f8933c.mo19386c(0);
                    this.f8936f.mo19041a(this.f8933c, 8);
                    this.f8937g = 2;
                }
            } else if (i == 2) {
                int min2 = Math.min(kVar.mo19383b(), this.f8942l - this.f8938h);
                this.f8936f.mo19041a(kVar2, min2);
                int i3 = this.f8938h + min2;
                this.f8938h = i3;
                int i4 = this.f8942l;
                if (i3 == i4) {
                    this.f8936f.mo19038a(this.f8931a, 1, i4, 0, (byte[]) null);
                    this.f8931a += this.f8940j;
                    this.f8937g = 0;
                }
            }
        }
    }
}
