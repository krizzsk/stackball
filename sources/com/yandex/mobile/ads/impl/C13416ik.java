package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.ik */
public final class C13416ik {

    /* renamed from: a */
    private final byte[] f34892a = new byte[4096];

    /* renamed from: b */
    private final C13325hj f34893b;

    /* renamed from: c */
    private final long f34894c;

    /* renamed from: d */
    private long f34895d;

    /* renamed from: e */
    private byte[] f34896e = new byte[65536];

    /* renamed from: f */
    private int f34897f;

    /* renamed from: g */
    private int f34898g;

    public C13416ik(C13325hj hjVar, long j, long j2) {
        this.f34893b = hjVar;
        this.f34895d = j;
        this.f34894c = j2;
    }

    /* renamed from: e */
    private void m37433e(int i) {
        int i2 = this.f34898g - i;
        this.f34898g = i2;
        this.f34897f = 0;
        byte[] bArr = this.f34896e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[(65536 + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f34896e = bArr2;
    }

    /* renamed from: a */
    public int mo67803a(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int i3;
        m37432b(i2);
        int i4 = this.f34898g;
        int i5 = this.f34897f;
        int i6 = i4 - i5;
        if (i6 == 0) {
            i3 = m37430a(this.f34896e, i5, i2, 0, true);
            if (i3 == -1) {
                return -1;
            }
            this.f34898g += i3;
        } else {
            i3 = Math.min(i2, i6);
        }
        System.arraycopy(this.f34896e, this.f34897f, bArr, i, i3);
        this.f34897f += i3;
        return i3;
    }

    /* renamed from: b */
    public long mo67808b() {
        return this.f34895d + ((long) this.f34897f);
    }

    /* renamed from: c */
    public long mo67811c() {
        return this.f34895d;
    }

    /* renamed from: d */
    public void mo67812d() {
        this.f34897f = 0;
    }

    /* renamed from: b */
    private void m37432b(int i) {
        int i2 = this.f34897f + i;
        byte[] bArr = this.f34896e;
        if (i2 > bArr.length) {
            int i3 = ih1.f34858a;
            this.f34896e = Arrays.copyOf(this.f34896e, Math.max(65536 + i2, Math.min(bArr.length * 2, i2 + 524288)));
        }
    }

    /* renamed from: c */
    public int mo67810c(int i) throws IOException, InterruptedException {
        int min = Math.min(this.f34898g, i);
        m37433e(min);
        if (min == 0) {
            byte[] bArr = this.f34892a;
            min = m37430a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        m37431a(min);
        return min;
    }

    /* renamed from: d */
    public void mo67813d(int i) throws IOException, InterruptedException {
        int min = Math.min(this.f34898g, i);
        m37433e(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            i2 = m37430a(this.f34892a, -i2, Math.min(i, this.f34892a.length + i2), i2, false);
        }
        m37431a(i2);
    }

    /* renamed from: b */
    public int mo67807b(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int i3 = this.f34898g;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.f34896e, 0, bArr, i, min);
            m37433e(min);
            i4 = min;
        }
        if (i4 == 0) {
            i4 = m37430a(bArr, i, i2, 0, true);
        }
        m37431a(i4);
        return i4;
    }

    /* renamed from: b */
    public boolean mo67809b(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int i3;
        int i4 = this.f34898g;
        if (i4 == 0) {
            i3 = 0;
        } else {
            int min = Math.min(i4, i2);
            System.arraycopy(this.f34896e, 0, bArr, i, min);
            m37433e(min);
            i3 = min;
        }
        while (i3 < i2 && i3 != -1) {
            i3 = m37430a(bArr, i, i2, i3, z);
        }
        m37431a(i3);
        if (i3 != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo67806a(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        if (!mo67805a(i2, z)) {
            return false;
        }
        System.arraycopy(this.f34896e, this.f34897f - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: a */
    public boolean mo67805a(int i, boolean z) throws IOException, InterruptedException {
        m37432b(i);
        int i2 = this.f34898g - this.f34897f;
        while (i2 < i) {
            i2 = m37430a(this.f34896e, this.f34897f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f34898g = this.f34897f + i2;
        }
        this.f34897f += i;
        return true;
    }

    /* renamed from: a */
    public long mo67804a() {
        return this.f34894c;
    }

    /* renamed from: a */
    private int m37430a(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int a = this.f34893b.mo65274a(bArr, i + i3, i2 - i3);
            if (a != -1) {
                return i3 + a;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    /* renamed from: a */
    private void m37431a(int i) {
        if (i != -1) {
            this.f34895d += (long) i;
        }
    }
}
