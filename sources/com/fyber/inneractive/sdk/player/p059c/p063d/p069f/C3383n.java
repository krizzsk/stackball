package com.fyber.inneractive.sdk.player.p059c.p063d.p069f;

import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.f.n */
final class C3383n {

    /* renamed from: a */
    boolean f9097a;

    /* renamed from: b */
    public byte[] f9098b;

    /* renamed from: c */
    public int f9099c;

    /* renamed from: d */
    private final int f9100d;

    /* renamed from: e */
    private boolean f9101e;

    public C3383n(int i) {
        this.f9100d = i;
        byte[] bArr = new byte[131];
        this.f9098b = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public final void mo19170a() {
        this.f9101e = false;
        this.f9097a = false;
    }

    /* renamed from: a */
    public final void mo19171a(int i) {
        boolean z = true;
        C3535a.m8784b(!this.f9101e);
        if (i != this.f9100d) {
            z = false;
        }
        this.f9101e = z;
        if (z) {
            this.f9099c = 3;
            this.f9097a = false;
        }
    }

    /* renamed from: a */
    public final void mo19172a(byte[] bArr, int i, int i2) {
        if (this.f9101e) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f9098b;
            int length = bArr2.length;
            int i4 = this.f9099c;
            if (length < i4 + i3) {
                this.f9098b = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f9098b, this.f9099c, i3);
            this.f9099c += i3;
        }
    }

    /* renamed from: b */
    public final boolean mo19173b(int i) {
        if (!this.f9101e) {
            return false;
        }
        this.f9099c -= i;
        this.f9101e = false;
        this.f9097a = true;
        return true;
    }
}
