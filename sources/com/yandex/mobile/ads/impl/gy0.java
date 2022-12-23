package com.yandex.mobile.ads.impl;

public final class gy0 {

    /* renamed from: a */
    private byte[] f34173a;

    /* renamed from: b */
    private int f34174b;

    /* renamed from: c */
    private int f34175c;

    /* renamed from: d */
    private int f34176d;

    public gy0(byte[] bArr, int i, int i2) {
        mo67365a(bArr, i, i2);
    }

    /* renamed from: a */
    public void mo67365a(byte[] bArr, int i, int i2) {
        this.f34173a = bArr;
        this.f34175c = i;
        this.f34174b = i2;
        this.f34176d = 0;
        m36723a();
    }

    /* renamed from: b */
    public int mo67367b(int i) {
        int i2;
        int i3;
        this.f34176d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f34176d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f34176d = i5;
            byte[] bArr = this.f34173a;
            int i6 = this.f34175c;
            i4 |= (bArr[i6] & 255) << i5;
            if (!m36724c(i6 + 1)) {
                i3 = 1;
            }
            this.f34175c = i6 + i3;
        }
        byte[] bArr2 = this.f34173a;
        int i7 = this.f34175c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f34176d = 0;
            if (!m36724c(i7 + 1)) {
                i3 = 1;
            }
            this.f34175c = i7 + i3;
        }
        m36723a();
        return i8;
    }

    /* renamed from: c */
    public boolean mo67369c() {
        boolean z = (this.f34173a[this.f34175c] & (128 >> this.f34176d)) != 0;
        mo67373g();
        return z;
    }

    /* renamed from: d */
    public void mo67370d(int i) {
        int i2 = this.f34175c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f34175c = i4;
        int i5 = this.f34176d + (i - (i3 * 8));
        this.f34176d = i5;
        if (i5 > 7) {
            this.f34175c = i4 + 1;
            this.f34176d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f34175c) {
                m36723a();
                return;
            } else if (m36724c(i2)) {
                this.f34175c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: e */
    public int mo67371e() {
        int d = m36725d();
        return (d % 2 == 0 ? -1 : 1) * ((d + 1) / 2);
    }

    /* renamed from: f */
    public int mo67372f() {
        return m36725d();
    }

    /* renamed from: g */
    public void mo67373g() {
        int i = 1;
        int i2 = this.f34176d + 1;
        this.f34176d = i2;
        if (i2 == 8) {
            this.f34176d = 0;
            int i3 = this.f34175c;
            if (m36724c(i3 + 1)) {
                i = 2;
            }
            this.f34175c = i3 + i;
        }
        m36723a();
    }

    /* renamed from: c */
    private boolean m36724c(int i) {
        if (2 <= i && i < this.f34174b) {
            byte[] bArr = this.f34173a;
            return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i - 1] == 0;
        }
    }

    /* renamed from: a */
    public boolean mo67366a(int i) {
        int i2 = this.f34175c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f34176d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f34174b) {
                int i6 = this.f34174b;
            } else if (m36724c(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i62 = this.f34174b;
        if (i4 < i62) {
            return true;
        }
        if (i4 == i62 && i5 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo67368b() {
        int i = this.f34175c;
        int i2 = this.f34176d;
        int i3 = 0;
        while (this.f34175c < this.f34174b && !mo67369c()) {
            i3++;
        }
        boolean z = this.f34175c == this.f34174b;
        this.f34175c = i;
        this.f34176d = i2;
        if (z || !mo67366a((i3 * 2) + 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private int m36725d() {
        int i = 0;
        int i2 = 0;
        while (!mo67369c()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo67367b(i2);
        }
        return i3 + i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f34174b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m36723a() {
        /*
            r2 = this;
            int r0 = r2.f34175c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f34174b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f34176d
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            com.yandex.mobile.ads.impl.C13479j9.m37708b((boolean) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gy0.m36723a():void");
    }
}
