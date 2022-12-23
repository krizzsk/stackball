package com.fyber.inneractive.sdk.player.p059c.p080k;

/* renamed from: com.fyber.inneractive.sdk.player.c.k.l */
public final class C3549l {

    /* renamed from: a */
    private byte[] f9628a;

    /* renamed from: b */
    private int f9629b;

    /* renamed from: c */
    private int f9630c;

    /* renamed from: d */
    private int f9631d;

    public C3549l(byte[] bArr, int i, int i2) {
        mo19406a(bArr, i, i2);
    }

    /* renamed from: a */
    public final void mo19406a(byte[] bArr, int i, int i2) {
        this.f9628a = bArr;
        this.f9630c = i;
        this.f9629b = i2;
        this.f9631d = 0;
        m8844f();
    }

    /* renamed from: a */
    public final void mo19404a() {
        int i = 1;
        int i2 = this.f9631d + 1;
        this.f9631d = i2;
        if (i2 == 8) {
            this.f9631d = 0;
            int i3 = this.f9630c;
            if (m8843d(i3 + 1)) {
                i = 2;
            }
            this.f9630c = i3 + i;
        }
        m8844f();
    }

    /* renamed from: a */
    public final void mo19405a(int i) {
        int i2 = this.f9630c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f9630c = i4;
        int i5 = this.f9631d + (i - (i3 * 8));
        this.f9631d = i5;
        if (i5 > 7) {
            this.f9630c = i4 + 1;
            this.f9631d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f9630c) {
                m8844f();
                return;
            } else if (m8843d(i2)) {
                this.f9630c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo19408b(int i) {
        int i2 = this.f9630c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f9631d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f9629b) {
                int i6 = this.f9629b;
            } else if (m8843d(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i62 = this.f9629b;
        if (i4 < i62) {
            return true;
        }
        if (i4 == i62 && i5 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo19407b() {
        boolean z = (this.f9628a[this.f9630c] & (128 >> this.f9631d)) != 0;
        mo19404a();
        return z;
    }

    /* renamed from: c */
    public final int mo19409c(int i) {
        int i2;
        int i3;
        this.f9631d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f9631d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f9631d = i5;
            byte[] bArr = this.f9628a;
            int i6 = this.f9630c;
            i4 |= (bArr[i6] & 255) << i5;
            if (!m8843d(i6 + 1)) {
                i3 = 1;
            }
            this.f9630c = i6 + i3;
        }
        byte[] bArr2 = this.f9628a;
        int i7 = this.f9630c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f9631d = 0;
            if (!m8843d(i7 + 1)) {
                i3 = 1;
            }
            this.f9630c = i7 + i3;
        }
        m8844f();
        return i8;
    }

    /* renamed from: c */
    public final boolean mo19410c() {
        int i = this.f9630c;
        int i2 = this.f9631d;
        int i3 = 0;
        while (this.f9630c < this.f9629b && !mo19407b()) {
            i3++;
        }
        boolean z = this.f9630c == this.f9629b;
        this.f9630c = i;
        this.f9631d = i2;
        if (z || !mo19408b((i3 * 2) + 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final int mo19411d() {
        int e = mo19412e();
        return (e % 2 == 0 ? -1 : 1) * ((e + 1) / 2);
    }

    /* renamed from: e */
    public final int mo19412e() {
        int i = 0;
        int i2 = 0;
        while (!mo19407b()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo19409c(i2);
        }
        return i3 + i;
    }

    /* renamed from: d */
    private boolean m8843d(int i) {
        if (2 > i || i >= this.f9629b) {
            return false;
        }
        byte[] bArr = this.f9628a;
        return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i - 1] == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f9629b;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8844f() {
        /*
            r2 = this;
            int r0 = r2.f9630c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f9629b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f9631d
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            com.fyber.inneractive.sdk.player.p059c.p080k.C3535a.m8784b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p080k.C3549l.m8844f():void");
    }
}
