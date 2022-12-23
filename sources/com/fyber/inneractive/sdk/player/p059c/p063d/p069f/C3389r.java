package com.fyber.inneractive.sdk.player.p059c.p063d.p069f;

import androidx.core.view.InputDeviceCompat;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3396v;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3558r;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.f.r */
public final class C3389r implements C3396v {

    /* renamed from: a */
    private final C3388q f9130a;

    /* renamed from: b */
    private final C3548k f9131b = new C3548k(32);

    /* renamed from: c */
    private int f9132c;

    /* renamed from: d */
    private int f9133d;

    /* renamed from: e */
    private boolean f9134e;

    /* renamed from: f */
    private boolean f9135f;

    public C3389r(C3388q qVar) {
        this.f9130a = qVar;
    }

    /* renamed from: a */
    public final void mo19176a(C3558r rVar, C3270h hVar, C3396v.C3400d dVar) {
        this.f9130a.mo19178a(rVar, hVar, dVar);
        this.f9135f = true;
    }

    /* renamed from: a */
    public final void mo19174a() {
        this.f9135f = true;
    }

    /* renamed from: a */
    public final void mo19175a(C3548k kVar, boolean z) {
        int i;
        if (z) {
            i = kVar.f9626b + kVar.mo19387d();
        } else {
            i = -1;
        }
        if (this.f9135f) {
            if (z) {
                this.f9135f = false;
                kVar.mo19386c(i);
                this.f9133d = 0;
            } else {
                return;
            }
        }
        while (kVar.mo19383b() > 0) {
            int i2 = this.f9133d;
            boolean z2 = true;
            if (i2 < 3) {
                if (i2 == 0) {
                    int d = kVar.mo19387d();
                    kVar.mo19386c(kVar.f9626b - 1);
                    if (d == 255) {
                        this.f9135f = true;
                        return;
                    }
                }
                int min = Math.min(kVar.mo19383b(), 3 - this.f9133d);
                kVar.mo19382a(this.f9131b.f9625a, this.f9133d, min);
                int i3 = this.f9133d + min;
                this.f9133d = i3;
                if (i3 == 3) {
                    this.f9131b.mo19379a(3);
                    this.f9131b.mo19388d(1);
                    int d2 = this.f9131b.mo19387d();
                    int d3 = this.f9131b.mo19387d();
                    if ((d2 & 128) == 0) {
                        z2 = false;
                    }
                    this.f9134e = z2;
                    this.f9132c = (((d2 & 15) << 8) | d3) + 3;
                    if (this.f9131b.mo19385c() < this.f9132c) {
                        byte[] bArr = this.f9131b.f9625a;
                        this.f9131b.mo19379a(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(this.f9132c, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.f9131b.f9625a, 0, 3);
                    }
                }
            } else {
                int min2 = Math.min(kVar.mo19383b(), this.f9132c - this.f9133d);
                kVar.mo19382a(this.f9131b.f9625a, this.f9133d, min2);
                int i4 = this.f9133d + min2;
                this.f9133d = i4;
                int i5 = this.f9132c;
                if (i4 != i5) {
                    continue;
                } else {
                    if (!this.f9134e) {
                        this.f9131b.mo19379a(i5);
                    } else if (C3560t.m8873a(this.f9131b.f9625a, this.f9132c, -1) != 0) {
                        this.f9135f = true;
                        return;
                    } else {
                        this.f9131b.mo19379a(this.f9132c - 4);
                    }
                    this.f9130a.mo19177a(this.f9131b);
                    this.f9133d = 0;
                }
            }
        }
    }
}
