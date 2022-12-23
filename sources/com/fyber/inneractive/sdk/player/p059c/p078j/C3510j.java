package com.fyber.inneractive.sdk.player.p059c.p078j;

import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.c.j.j */
public final class C3510j implements C3497b {

    /* renamed from: a */
    private final boolean f9505a;

    /* renamed from: b */
    private final int f9506b;

    /* renamed from: c */
    private final byte[] f9507c;

    /* renamed from: d */
    private final C3479a[] f9508d;

    /* renamed from: e */
    private int f9509e;

    /* renamed from: f */
    private int f9510f;

    /* renamed from: g */
    private int f9511g;

    /* renamed from: h */
    private C3479a[] f9512h;

    public C3510j() {
        this((byte) 0);
    }

    private C3510j(byte b) {
        C3535a.m8782a(true);
        C3535a.m8782a(true);
        this.f9505a = true;
        this.f9506b = 65536;
        this.f9511g = 0;
        this.f9512h = new C3479a[100];
        this.f9507c = null;
        this.f9508d = new C3479a[1];
    }

    /* renamed from: d */
    public final synchronized void mo19348d() {
        if (this.f9505a) {
            mo19347a(0);
        }
    }

    /* renamed from: a */
    public final synchronized void mo19347a(int i) {
        boolean z = i < this.f9509e;
        this.f9509e = i;
        if (z) {
            mo19343b();
        }
    }

    /* renamed from: a */
    public final synchronized C3479a mo19340a() {
        C3479a aVar;
        this.f9510f++;
        if (this.f9511g > 0) {
            C3479a[] aVarArr = this.f9512h;
            int i = this.f9511g - 1;
            this.f9511g = i;
            aVar = aVarArr[i];
            this.f9512h[i] = null;
        } else {
            aVar = new C3479a(new byte[this.f9506b]);
        }
        return aVar;
    }

    /* renamed from: a */
    public final synchronized void mo19341a(C3479a aVar) {
        this.f9508d[0] = aVar;
        mo19342a(this.f9508d);
    }

    /* renamed from: a */
    public final synchronized void mo19342a(C3479a[] aVarArr) {
        boolean z;
        if (this.f9511g + aVarArr.length >= this.f9512h.length) {
            this.f9512h = (C3479a[]) Arrays.copyOf(this.f9512h, Math.max(this.f9512h.length * 2, this.f9511g + aVarArr.length));
        }
        for (C3479a aVar : aVarArr) {
            if (aVar.f9412a != this.f9507c) {
                if (aVar.f9412a.length != this.f9506b) {
                    z = false;
                    C3535a.m8782a(z);
                    C3479a[] aVarArr2 = this.f9512h;
                    int i = this.f9511g;
                    this.f9511g = i + 1;
                    aVarArr2[i] = aVar;
                }
            }
            z = true;
            C3535a.m8782a(z);
            C3479a[] aVarArr22 = this.f9512h;
            int i2 = this.f9511g;
            this.f9511g = i2 + 1;
            aVarArr22[i2] = aVar;
        }
        this.f9510f -= aVarArr.length;
        notifyAll();
    }

    /* renamed from: b */
    public final synchronized void mo19343b() {
        int i = 0;
        int max = Math.max(0, C3560t.m8871a(this.f9509e, this.f9506b) - this.f9510f);
        if (max < this.f9511g) {
            if (this.f9507c != null) {
                int i2 = this.f9511g - 1;
                while (i <= i2) {
                    C3479a aVar = this.f9512h[i];
                    if (aVar.f9412a == this.f9507c) {
                        i++;
                    } else {
                        C3479a aVar2 = this.f9512h[i2];
                        if (aVar2.f9412a != this.f9507c) {
                            i2--;
                        } else {
                            this.f9512h[i] = aVar2;
                            this.f9512h[i2] = aVar;
                            i2--;
                            i++;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.f9511g) {
                    return;
                }
            }
            Arrays.fill(this.f9512h, max, this.f9511g, (Object) null);
            this.f9511g = max;
        }
    }

    /* renamed from: e */
    public final synchronized int mo19349e() {
        return this.f9510f * this.f9506b;
    }

    /* renamed from: c */
    public final int mo19344c() {
        return this.f9506b;
    }
}
