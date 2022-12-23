package com.yandex.mobile.ads.impl;

import androidx.core.view.MotionEventCompat;

public final class ey0 {

    /* renamed from: a */
    public byte[] f33187a;

    /* renamed from: b */
    private int f33188b;

    /* renamed from: c */
    private int f33189c;

    /* renamed from: d */
    private int f33190d;

    public ey0() {
        this.f33187a = ih1.f34863f;
    }

    /* renamed from: a */
    public void mo66888a(byte[] bArr) {
        int length = bArr.length;
        this.f33187a = bArr;
        this.f33188b = 0;
        this.f33189c = 0;
        this.f33190d = length;
    }

    /* renamed from: b */
    public int mo66891b() {
        return ((this.f33190d - this.f33188b) * 8) - this.f33189c;
    }

    /* renamed from: c */
    public void mo66895c(int i) {
        int i2 = i / 8;
        this.f33188b = i2;
        this.f33189c = i - (i2 * 8);
        m35837a();
    }

    /* renamed from: d */
    public int mo66896d() {
        C13479j9.m37708b(this.f33189c == 0);
        return this.f33188b;
    }

    /* renamed from: e */
    public int mo66898e() {
        return (this.f33188b * 8) + this.f33189c;
    }

    /* renamed from: f */
    public boolean mo66900f() {
        boolean z = (this.f33187a[this.f33188b] & (128 >> this.f33189c)) != 0;
        mo66901g();
        return z;
    }

    /* renamed from: g */
    public void mo66901g() {
        int i = this.f33189c + 1;
        this.f33189c = i;
        if (i == 8) {
            this.f33189c = 0;
            this.f33188b++;
        }
        m35837a();
    }

    /* renamed from: b */
    public long mo66892b(int i) {
        if (i <= 32) {
            return ih1.m37398e(mo66886a(i));
        }
        int a = mo66886a(i - 32);
        return ih1.m37398e(mo66886a(32)) | (ih1.m37398e(a) << 32);
    }

    /* renamed from: e */
    public void mo66899e(int i) {
        C13479j9.m37708b(this.f33189c == 0);
        this.f33188b += i;
        m35837a();
    }

    public ey0(byte[] bArr) {
        this(bArr, bArr.length);
    }

    /* renamed from: d */
    public void mo66897d(int i) {
        int i2 = i / 8;
        int i3 = this.f33188b + i2;
        this.f33188b = i3;
        int i4 = this.f33189c + (i - (i2 * 8));
        this.f33189c = i4;
        if (i4 > 7) {
            this.f33188b = i3 + 1;
            this.f33189c = i4 - 8;
        }
        m35837a();
    }

    public ey0(byte[] bArr, int i) {
        this.f33187a = bArr;
        this.f33190d = i;
    }

    /* renamed from: c */
    public void mo66894c() {
        if (this.f33189c != 0) {
            this.f33189c = 0;
            this.f33188b++;
            m35837a();
        }
    }

    /* renamed from: a */
    public void mo66889a(byte[] bArr, int i) {
        this.f33187a = bArr;
        this.f33188b = 0;
        this.f33189c = 0;
        this.f33190d = i;
    }

    /* renamed from: b */
    public void mo66893b(byte[] bArr, int i, int i2) {
        C13479j9.m37708b(this.f33189c == 0);
        System.arraycopy(this.f33187a, this.f33188b, bArr, i, i2);
        this.f33188b += i2;
        m35837a();
    }

    /* renamed from: a */
    public int mo66886a(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f33189c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f33189c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f33189c = i4;
            byte[] bArr = this.f33187a;
            int i5 = this.f33188b;
            this.f33188b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f33187a;
        int i6 = this.f33188b;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f33189c = 0;
            this.f33188b = i6 + 1;
        }
        m35837a();
        return i7;
    }

    /* renamed from: a */
    public void mo66890a(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f33187a;
            int i4 = this.f33188b;
            int i5 = i4 + 1;
            this.f33188b = i5;
            byte b = bArr2[i4];
            int i6 = this.f33189c;
            bArr[i] = (byte) (b << i6);
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | bArr[i]);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 != 0) {
            bArr[i3] = (byte) (bArr[i3] & (255 >> i7));
            int i8 = this.f33189c;
            if (i8 + i7 > 8) {
                byte b2 = bArr[i3];
                byte[] bArr3 = this.f33187a;
                int i9 = this.f33188b;
                this.f33188b = i9 + 1;
                bArr[i3] = (byte) (b2 | ((bArr3[i9] & 255) << i8));
                this.f33189c = i8 - 8;
            }
            int i10 = this.f33189c + i7;
            this.f33189c = i10;
            byte[] bArr4 = this.f33187a;
            int i11 = this.f33188b;
            bArr[i3] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i3]);
            if (i10 == 8) {
                this.f33189c = 0;
                this.f33188b = i11 + 1;
            }
            m35837a();
        }
    }

    /* renamed from: a */
    public void mo66887a(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int min = Math.min(8 - this.f33189c, i2);
        int i3 = this.f33189c;
        int i4 = (8 - i3) - min;
        byte b = (MotionEventCompat.ACTION_POINTER_INDEX_MASK >> i3) | ((1 << i4) - 1);
        byte[] bArr = this.f33187a;
        int i5 = this.f33188b;
        bArr[i5] = (byte) (b & bArr[i5]);
        int i6 = i2 - min;
        bArr[i5] = (byte) (((i >>> i6) << i4) | bArr[i5]);
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.f33187a[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.f33187a;
        bArr2[i7] = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i8) | bArr2[i7]);
        mo66897d(i2);
        m35837a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f33190d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m35837a() {
        /*
            r2 = this;
            int r0 = r2.f33188b
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f33190d
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f33189c
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
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ey0.m35837a():void");
    }
}
