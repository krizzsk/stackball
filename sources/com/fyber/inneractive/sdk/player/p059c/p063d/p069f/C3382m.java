package com.fyber.inneractive.sdk.player.p059c.p063d.p069f;

import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.p062c.C3227a;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3274k;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3278n;
import com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3396v;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.f.m */
public final class C3382m implements C3373h {

    /* renamed from: a */
    private final C3548k f9085a;

    /* renamed from: b */
    private final C3274k f9086b;

    /* renamed from: c */
    private final String f9087c;

    /* renamed from: d */
    private String f9088d;

    /* renamed from: e */
    private C3278n f9089e;

    /* renamed from: f */
    private int f9090f;

    /* renamed from: g */
    private int f9091g;

    /* renamed from: h */
    private boolean f9092h;

    /* renamed from: i */
    private boolean f9093i;

    /* renamed from: j */
    private long f9094j;

    /* renamed from: k */
    private int f9095k;

    /* renamed from: l */
    private long f9096l;

    /* renamed from: b */
    public final void mo19160b() {
    }

    public C3382m() {
        this((String) null);
    }

    public C3382m(String str) {
        this.f9090f = 0;
        C3548k kVar = new C3548k(4);
        this.f9085a = kVar;
        kVar.f9625a[0] = -1;
        this.f9086b = new C3274k();
        this.f9087c = str;
    }

    /* renamed from: a */
    public final void mo19156a() {
        this.f9090f = 0;
        this.f9091g = 0;
        this.f9093i = false;
    }

    /* renamed from: a */
    public final void mo19158a(C3270h hVar, C3396v.C3400d dVar) {
        dVar.mo19181a();
        this.f9088d = dVar.mo19183c();
        this.f9089e = hVar.mo19056a(dVar.mo19182b());
    }

    /* renamed from: a */
    public final void mo19157a(long j, boolean z) {
        this.f9096l = j;
    }

    /* renamed from: a */
    public final void mo19159a(C3548k kVar) {
        C3548k kVar2 = kVar;
        while (kVar.mo19383b() > 0) {
            int i = this.f9090f;
            if (i == 0) {
                byte[] bArr = kVar2.f9625a;
                int i2 = kVar2.f9626b;
                int i3 = kVar2.f9627c;
                while (true) {
                    if (i2 >= i3) {
                        kVar2.mo19386c(i3);
                        break;
                    }
                    boolean z = (bArr[i2] & 255) == 255;
                    boolean z2 = this.f9093i && (bArr[i2] & 224) == 224;
                    this.f9093i = z;
                    if (z2) {
                        kVar2.mo19386c(i2 + 1);
                        this.f9093i = false;
                        this.f9085a.f9625a[1] = bArr[i2];
                        this.f9091g = 2;
                        this.f9090f = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int min = Math.min(kVar.mo19383b(), 4 - this.f9091g);
                kVar2.mo19382a(this.f9085a.f9625a, this.f9091g, min);
                int i4 = this.f9091g + min;
                this.f9091g = i4;
                if (i4 >= 4) {
                    this.f9085a.mo19386c(0);
                    if (!C3274k.m8038a(this.f9085a.mo19396j(), this.f9086b)) {
                        this.f9091g = 0;
                        this.f9090f = 1;
                    } else {
                        this.f9095k = this.f9086b.f8391c;
                        if (!this.f9092h) {
                            this.f9094j = (((long) this.f9086b.f8395g) * 1000000) / ((long) this.f9086b.f8392d);
                            this.f9089e.mo19040a(C3290h.m8115a(this.f9088d, this.f9086b.f8390b, -1, 4096, this.f9086b.f8393e, this.f9086b.f8392d, (List<byte[]>) null, (C3227a) null, this.f9087c));
                            this.f9092h = true;
                        }
                        this.f9085a.mo19386c(0);
                        this.f9089e.mo19041a(this.f9085a, 4);
                        this.f9090f = 2;
                    }
                }
            } else if (i == 2) {
                int min2 = Math.min(kVar.mo19383b(), this.f9095k - this.f9091g);
                this.f9089e.mo19041a(kVar2, min2);
                int i5 = this.f9091g + min2;
                this.f9091g = i5;
                int i6 = this.f9095k;
                if (i5 >= i6) {
                    this.f9089e.mo19038a(this.f9096l, 1, i6, 0, (byte[]) null);
                    this.f9096l += this.f9094j;
                    this.f9091g = 0;
                    this.f9090f = 0;
                }
            }
        }
    }
}
