package com.fyber.inneractive.sdk.player.p059c.p063d;

import com.fyber.inneractive.sdk.player.p059c.p078j.C3506g;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.b */
public final class C3245b implements C3269g {

    /* renamed from: a */
    private static final byte[] f8184a = new byte[4096];

    /* renamed from: b */
    private final C3506g f8185b;

    /* renamed from: c */
    private final long f8186c;

    /* renamed from: d */
    private long f8187d;

    /* renamed from: e */
    private byte[] f8188e = new byte[65536];

    /* renamed from: f */
    private int f8189f;

    /* renamed from: g */
    private int f8190g;

    public C3245b(C3506g gVar, long j, long j2) {
        this.f8185b = gVar;
        this.f8187d = j;
        this.f8186c = j2;
    }

    /* renamed from: a */
    public final int mo19005a(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int d = m7900d(bArr, i, i2);
        if (d == 0) {
            d = m7897a(bArr, i, i2, 0, true);
        }
        m7902f(d);
        return d;
    }

    /* renamed from: a */
    public final boolean mo19007a(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int d = m7900d(bArr, i, i2);
        while (d < i2 && d != -1) {
            d = m7897a(bArr, i, i2, d, z);
        }
        m7902f(d);
        return d != -1;
    }

    /* renamed from: b */
    public final void mo19010b(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        mo19007a(bArr, i, i2, false);
    }

    /* renamed from: a */
    public final int mo19004a(int i) throws IOException, InterruptedException {
        int d = m7899d(i);
        if (d == 0) {
            byte[] bArr = f8184a;
            d = m7897a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        m7902f(d);
        return d;
    }

    /* renamed from: b */
    public final boolean mo19011b(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        if (!m7898a(i2, z)) {
            return false;
        }
        System.arraycopy(this.f8188e, this.f8189f - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: c */
    public final void mo19014c(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        mo19011b(bArr, i, i2, false);
    }

    /* renamed from: c */
    public final void mo19013c(int i) throws IOException, InterruptedException {
        m7898a(i, false);
    }

    /* renamed from: a */
    public final void mo19006a() {
        this.f8189f = 0;
    }

    /* renamed from: b */
    public final long mo19008b() {
        return this.f8187d + ((long) this.f8189f);
    }

    /* renamed from: c */
    public final long mo19012c() {
        return this.f8187d;
    }

    /* renamed from: d */
    public final long mo19015d() {
        return this.f8186c;
    }

    /* renamed from: d */
    private int m7899d(int i) {
        int min = Math.min(this.f8190g, i);
        m7901e(min);
        return min;
    }

    /* renamed from: d */
    private int m7900d(byte[] bArr, int i, int i2) {
        int i3 = this.f8190g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f8188e, 0, bArr, i, min);
        m7901e(min);
        return min;
    }

    /* renamed from: e */
    private void m7901e(int i) {
        int i2 = this.f8190g - i;
        this.f8190g = i2;
        this.f8189f = 0;
        byte[] bArr = this.f8188e;
        if (i2 < bArr.length - 524288) {
            bArr = new byte[(i2 + 65536)];
        }
        System.arraycopy(this.f8188e, i, bArr, 0, this.f8190g);
        this.f8188e = bArr;
    }

    /* renamed from: a */
    private int m7897a(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int a = this.f8185b.mo18702a(bArr, i + i3, i2 - i3);
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

    /* renamed from: f */
    private void m7902f(int i) {
        if (i != -1) {
            this.f8187d += (long) i;
        }
    }

    /* renamed from: b */
    public final void mo19009b(int i) throws IOException, InterruptedException {
        int d = m7899d(i);
        while (d < i && d != -1) {
            byte[] bArr = f8184a;
            d = m7897a(bArr, -d, Math.min(i, bArr.length + d), d, false);
        }
        m7902f(d);
    }

    /* renamed from: a */
    private boolean m7898a(int i, boolean z) throws IOException, InterruptedException {
        int i2 = this.f8189f + i;
        byte[] bArr = this.f8188e;
        if (i2 > bArr.length) {
            this.f8188e = Arrays.copyOf(this.f8188e, C3560t.m8872a(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
        int min = Math.min(this.f8190g - this.f8189f, i);
        while (min < i) {
            min = m7897a(this.f8188e, this.f8189f, i, min, z);
            if (min == -1) {
                return false;
            }
        }
        int i3 = this.f8189f + i;
        this.f8189f = i3;
        this.f8190g = Math.max(this.f8190g, i3);
        return true;
    }
}
