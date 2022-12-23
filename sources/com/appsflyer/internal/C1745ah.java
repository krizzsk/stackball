package com.appsflyer.internal;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.appsflyer.internal.ah */
public class C1745ah extends FilterInputStream {

    /* renamed from: ι */
    private static final short f4142 = ((short) ((int) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d))));

    /* renamed from: ı */
    private int f4143 = 8;

    /* renamed from: Ɩ */
    private int f4144 = 8;

    /* renamed from: ǃ */
    private byte[] f4145 = new byte[8];

    /* renamed from: ɨ */
    private int f4146;

    /* renamed from: ɩ */
    private byte[] f4147 = new byte[8];

    /* renamed from: ɪ */
    private int f4148;

    /* renamed from: ɹ */
    private int f4149;

    /* renamed from: Ι */
    private byte[] f4150 = new byte[8];

    /* renamed from: І */
    private int f4151;

    /* renamed from: і */
    private int f4152;

    /* renamed from: Ӏ */
    private int f4153 = Integer.MAX_VALUE;

    /* renamed from: ӏ */
    private int f4154;

    public boolean markSupported() {
        return false;
    }

    public C1745ah(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) throws IOException {
        super(inputStream);
        this.f4151 = Math.min(Math.max(i2, 5), 16);
        this.f4152 = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.f4150, 0, 8);
        }
        long j = ((((long) iArr[0]) & 4294967295L) << 32) | (4294967295L & ((long) iArr[1]));
        if (i == 0) {
            this.f4149 = (int) j;
            long j2 = j >> 3;
            short s = f4142;
            this.f4148 = (int) ((((long) s) * j2) >> 32);
            this.f4146 = (int) (j >> 32);
            this.f4154 = (int) (j2 + ((long) s));
            return;
        }
        int i4 = (int) j;
        this.f4149 = i4;
        this.f4148 = i4 * i;
        this.f4146 = i4 ^ i;
        this.f4154 = (int) (j >> 32);
    }

    public int read() throws IOException {
        m3855();
        int i = this.f4143;
        if (i >= this.f4144) {
            return -1;
        }
        byte[] bArr = this.f4145;
        this.f4143 = i + 1;
        return bArr[i] & 255;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            m3855();
            int i5 = this.f4143;
            if (i5 < this.f4144) {
                byte[] bArr2 = this.f4145;
                this.f4143 = i5 + 1;
                bArr[i4] = bArr2[i5];
                i4++;
            } else if (i4 == i) {
                return -1;
            } else {
                return i2 - (i3 - i4);
            }
        }
        return i2;
    }

    public long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    public int available() throws IOException {
        m3855();
        return this.f4144 - this.f4143;
    }

    /* renamed from: Ι */
    private void m3854() {
        if (this.f4152 == 3) {
            byte[] bArr = this.f4145;
            System.arraycopy(bArr, 0, this.f4147, 0, bArr.length);
        }
        byte[] bArr2 = this.f4145;
        int i = ((bArr2[0] << Ascii.CAN) & ViewCompat.MEASURED_STATE_MASK) + ((bArr2[1] << Ascii.DLE) & 16711680) + ((bArr2[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & 255);
        int i2 = (-16777216 & (bArr2[4] << Ascii.CAN)) + (16711680 & (bArr2[5] << Ascii.DLE)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = 0;
        while (true) {
            int i4 = this.f4151;
            if (i3 >= i4) {
                break;
            }
            short s = f4142;
            i2 -= ((((i4 - i3) * s) + i) ^ ((i << 4) + this.f4146)) ^ ((i >>> 5) + this.f4154);
            i -= (((i2 << 4) + this.f4149) ^ ((s * (i4 - i3)) + i2)) ^ ((i2 >>> 5) + this.f4148);
            i3++;
        }
        byte[] bArr3 = this.f4145;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.f4152 == 3) {
            for (int i5 = 0; i5 < 8; i5++) {
                byte[] bArr4 = this.f4145;
                bArr4[i5] = (byte) (bArr4[i5] ^ this.f4150[i5]);
            }
            byte[] bArr5 = this.f4147;
            System.arraycopy(bArr5, 0, this.f4150, 0, bArr5.length);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* renamed from: ι */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m3855() throws java.io.IOException {
        /*
            r7 = this;
            int r0 = r7.f4153
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L_0x000f
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r7.f4153 = r0
        L_0x000f:
            int r0 = r7.f4143
            r1 = 8
            if (r0 != r1) goto L_0x0059
            byte[] r0 = r7.f4145
            int r2 = r7.f4153
            byte r3 = (byte) r2
            r4 = 0
            r0[r4] = r3
            java.lang.String r0 = "unexpected block size"
            if (r2 < 0) goto L_0x0053
            r2 = 1
        L_0x0022:
            java.io.InputStream r3 = r7.in
            byte[] r5 = r7.f4145
            int r6 = 8 - r2
            int r3 = r3.read(r5, r2, r6)
            if (r3 <= 0) goto L_0x0031
            int r2 = r2 + r3
            if (r2 < r1) goto L_0x0022
        L_0x0031:
            if (r2 < r1) goto L_0x004d
            r7.m3854()
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r7.f4153 = r0
            r7.f4143 = r4
            if (r0 >= 0) goto L_0x004a
            byte[] r0 = r7.f4145
            r2 = 7
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 - r0
        L_0x004a:
            r7.f4144 = r1
            goto L_0x0059
        L_0x004d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0053:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0059:
            int r0 = r7.f4144
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C1745ah.m3855():int");
    }
}
