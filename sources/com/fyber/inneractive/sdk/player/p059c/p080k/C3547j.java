package com.fyber.inneractive.sdk.player.p059c.p080k;

/* renamed from: com.fyber.inneractive.sdk.player.c.k.j */
public final class C3547j {

    /* renamed from: a */
    public byte[] f9621a;

    /* renamed from: b */
    public int f9622b;

    /* renamed from: c */
    public int f9623c;

    /* renamed from: d */
    private int f9624d;

    public C3547j() {
    }

    public C3547j(byte[] bArr) {
        this(bArr, bArr.length);
    }

    private C3547j(byte[] bArr, int i) {
        this.f9621a = bArr;
        this.f9624d = i;
    }

    /* renamed from: a */
    public final void mo19374a(int i) {
        int i2 = i / 8;
        this.f9622b = i2;
        this.f9623c = i - (i2 * 8);
        m8812b();
    }

    /* renamed from: b */
    public final void mo19376b(int i) {
        int i2 = i / 8;
        int i3 = this.f9622b + i2;
        this.f9622b = i3;
        int i4 = this.f9623c + (i - (i2 * 8));
        this.f9623c = i4;
        if (i4 > 7) {
            this.f9622b = i3 + 1;
            this.f9623c = i4 - 8;
        }
        m8812b();
    }

    /* renamed from: a */
    public final boolean mo19375a() {
        boolean z = (this.f9621a[this.f9622b] & (128 >> this.f9623c)) != 0;
        int i = this.f9623c + 1;
        this.f9623c = i;
        if (i == 8) {
            this.f9623c = 0;
            this.f9622b++;
        }
        m8812b();
        return z;
    }

    /* renamed from: c */
    public final int mo19377c(int i) {
        int i2;
        this.f9623c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f9623c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f9623c = i4;
            byte[] bArr = this.f9621a;
            int i5 = this.f9622b;
            this.f9622b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f9621a;
        int i6 = this.f9622b;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f9623c = 0;
            this.f9622b = i6 + 1;
        }
        m8812b();
        return i7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f9624d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8812b() {
        /*
            r2 = this;
            int r0 = r2.f9622b
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f9624d
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f9623c
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
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p080k.C3547j.m8812b():void");
    }
}
