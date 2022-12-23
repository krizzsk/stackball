package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.appsflyer.internal.ai */
public class C1746ai extends FilterInputStream {

    /* renamed from: ı */
    private long[] f4155;

    /* renamed from: Ɩ */
    private int f4156;

    /* renamed from: ǃ */
    private byte[] f4157;

    /* renamed from: ɩ */
    private short f4158;

    /* renamed from: ɹ */
    private int f4159;

    /* renamed from: Ι */
    private final int f4160;

    /* renamed from: ι */
    private long[] f4161;

    /* renamed from: І */
    private int f4162 = Integer.MAX_VALUE;

    public boolean markSupported() {
        return false;
    }

    public C1746ai(InputStream inputStream, int i, int i2, short s, int i3, int i4) throws IOException {
        super(inputStream);
        int min = Math.min(Math.max(s, 4), 8);
        this.f4160 = min;
        this.f4157 = new byte[min];
        this.f4161 = new long[4];
        this.f4155 = new long[4];
        this.f4159 = min;
        this.f4156 = min;
        this.f4161 = C1744ae.m3852(i ^ i4, min ^ i4);
        this.f4155 = C1744ae.m3852(i2 ^ i4, i3 ^ i4);
    }

    public int read() throws IOException {
        m3856();
        int i = this.f4159;
        if (i >= this.f4156) {
            return -1;
        }
        byte[] bArr = this.f4157;
        this.f4159 = i + 1;
        return bArr[i] & 255;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            m3856();
            int i5 = this.f4159;
            if (i5 < this.f4156) {
                byte[] bArr2 = this.f4157;
                this.f4159 = i5 + 1;
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
        m3856();
        return this.f4156 - this.f4159;
    }

    /* renamed from: ι */
    private void m3857() {
        C1744ae.m3853(this.f4161, this.f4155, this.f4158);
        for (int i = 0; i < this.f4160; i++) {
            byte[] bArr = this.f4157;
            bArr[i] = (byte) ((int) (((long) bArr[i]) ^ ((this.f4161[this.f4158] >> (i << 3)) & 255)));
        }
        this.f4158 = (short) ((this.f4158 + 1) % 4);
    }

    /* renamed from: ı */
    private int m3856() throws IOException {
        int read;
        int i;
        if (this.f4162 == Integer.MAX_VALUE) {
            this.f4162 = this.in.read();
        }
        if (this.f4159 == this.f4160) {
            byte[] bArr = this.f4157;
            int i2 = this.f4162;
            bArr[0] = (byte) i2;
            if (i2 >= 0) {
                int i3 = 1;
                do {
                    read = this.in.read(this.f4157, i3, this.f4160 - i3);
                    if (read <= 0 || (i3 = i3 + read) >= this.f4160) {
                    }
                    read = this.in.read(this.f4157, i3, this.f4160 - i3);
                    break;
                } while ((i3 = i3 + read) >= this.f4160);
                if (i3 >= this.f4160) {
                    m3857();
                    int read2 = this.in.read();
                    this.f4162 = read2;
                    this.f4159 = 0;
                    if (read2 < 0) {
                        int i4 = this.f4160;
                        i = i4 - (this.f4157[i4 - 1] & 255);
                    } else {
                        i = this.f4160;
                    }
                    this.f4156 = i;
                } else {
                    throw new IllegalStateException("unexpected block size");
                }
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.f4156;
    }
}
