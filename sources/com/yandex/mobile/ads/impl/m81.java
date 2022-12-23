package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.yandex.mobile.ads.impl.C13184ga;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class m81 extends C13695kb {

    /* renamed from: i */
    private final long f37250i;

    /* renamed from: j */
    private final long f37251j;

    /* renamed from: k */
    private final short f37252k;

    /* renamed from: l */
    private int f37253l;

    /* renamed from: m */
    private boolean f37254m;

    /* renamed from: n */
    private byte[] f37255n;

    /* renamed from: o */
    private byte[] f37256o;

    /* renamed from: p */
    private int f37257p;

    /* renamed from: q */
    private int f37258q;

    /* renamed from: r */
    private int f37259r;

    /* renamed from: s */
    private boolean f37260s;

    /* renamed from: t */
    private long f37261t;

    public m81() {
        this(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, SilenceSkippingAudioProcessor.DEFAULT_SILENCE_THRESHOLD_LEVEL);
    }

    /* renamed from: a */
    public void mo68617a(boolean z) {
        this.f37254m = z;
    }

    /* renamed from: b */
    public C13184ga.C13185a mo68192b(C13184ga.C13185a aVar) throws C13184ga.C13186b {
        if (aVar.f33916c == 2) {
            return this.f37254m ? aVar : C13184ga.C13185a.f33913e;
        }
        throw new C13184ga.C13186b(aVar);
    }

    /* renamed from: c */
    public boolean mo67216c() {
        return this.f37254m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo68194f() {
        if (this.f37254m) {
            C13184ga.C13185a aVar = this.f36079b;
            int i = aVar.f33917d;
            this.f37253l = i;
            long j = this.f37250i;
            long j2 = (long) aVar.f33914a;
            int i2 = ((int) ((j * j2) / 1000000)) * i;
            if (this.f37255n.length != i2) {
                this.f37255n = new byte[i2];
            }
            int i3 = ((int) ((this.f37251j * j2) / 1000000)) * i;
            this.f37259r = i3;
            if (this.f37256o.length != i3) {
                this.f37256o = new byte[i3];
            }
        }
        this.f37257p = 0;
        this.f37261t = 0;
        this.f37258q = 0;
        this.f37260s = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo68195h() {
        int i = this.f37258q;
        if (i > 0) {
            m39351a(this.f37255n, i);
        }
        if (!this.f37260s) {
            this.f37261t += (long) (this.f37259r / this.f37253l);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo68196i() {
        this.f37254m = false;
        this.f37259r = 0;
        byte[] bArr = ih1.f34863f;
        this.f37255n = bArr;
        this.f37256o = bArr;
    }

    /* renamed from: j */
    public long mo68618j() {
        return this.f37261t;
    }

    public m81(long j, long j2, short s) {
        C13479j9.m37705a(j2 <= j);
        this.f37250i = j;
        this.f37251j = j2;
        this.f37252k = s;
        byte[] bArr = ih1.f34863f;
        this.f37255n = bArr;
        this.f37256o = bArr;
    }

    /* renamed from: a */
    public void mo67214a(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !mo68193d()) {
            int i = this.f37257p;
            boolean z = false;
            if (i == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f37255n.length));
                if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                    z = true;
                }
                C13479j9.m37705a(z);
                int limit2 = byteBuffer.limit() - 2;
                while (true) {
                    if (limit2 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else if (Math.abs(byteBuffer.getShort(limit2)) > this.f37252k) {
                        int i2 = this.f37253l;
                        position = ((limit2 / i2) * i2) + i2;
                        break;
                    } else {
                        limit2 -= 2;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f37257p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    mo68191a(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f37260s = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i == 1) {
                int limit3 = byteBuffer.limit();
                int b = m39352b(byteBuffer);
                int position2 = b - byteBuffer.position();
                byte[] bArr = this.f37255n;
                int length = bArr.length;
                int i3 = this.f37258q;
                int i4 = length - i3;
                if (b >= limit3 || position2 >= i4) {
                    int min = Math.min(position2, i4);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f37255n, this.f37258q, min);
                    int i5 = this.f37258q + min;
                    this.f37258q = i5;
                    byte[] bArr2 = this.f37255n;
                    if (i5 == bArr2.length) {
                        if (this.f37260s) {
                            m39351a(bArr2, this.f37259r);
                            this.f37261t += (long) ((this.f37258q - (this.f37259r * 2)) / this.f37253l);
                        } else {
                            this.f37261t += (long) ((i5 - this.f37259r) / this.f37253l);
                        }
                        m39350a(byteBuffer, this.f37255n, this.f37258q);
                        this.f37258q = 0;
                        this.f37257p = 2;
                    }
                    byteBuffer.limit(limit3);
                } else {
                    m39351a(bArr, i3);
                    this.f37258q = 0;
                    this.f37257p = 0;
                }
            } else if (i == 2) {
                int limit4 = byteBuffer.limit();
                int b2 = m39352b(byteBuffer);
                byteBuffer.limit(b2);
                this.f37261t += (long) (byteBuffer.remaining() / this.f37253l);
                m39350a(byteBuffer, this.f37256o, this.f37259r);
                if (b2 < limit4) {
                    m39351a(this.f37256o, this.f37259r);
                    this.f37257p = 0;
                    byteBuffer.limit(limit4);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: b */
    private int m39352b(ByteBuffer byteBuffer) {
        C13479j9.m37705a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.getShort(position)) > this.f37252k) {
                int i = this.f37253l;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: a */
    private void m39351a(byte[] bArr, int i) {
        mo68191a(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f37260s = true;
        }
    }

    /* renamed from: a */
    private void m39350a(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f37259r);
        int i2 = this.f37259r - min;
        System.arraycopy(bArr, i - i2, this.f37256o, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f37256o, i2, min);
    }
}
