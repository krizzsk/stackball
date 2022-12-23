package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C13184ga;
import java.nio.ByteBuffer;

final class kf1 extends C13695kb {

    /* renamed from: i */
    private int f36117i;

    /* renamed from: j */
    private int f36118j;

    /* renamed from: k */
    private boolean f36119k;

    /* renamed from: l */
    private int f36120l;

    /* renamed from: m */
    private byte[] f36121m = ih1.f34863f;

    /* renamed from: n */
    private int f36122n;

    /* renamed from: o */
    private long f36123o;

    /* renamed from: a */
    public void mo68207a(int i, int i2) {
        this.f36117i = i;
        this.f36118j = i2;
    }

    /* renamed from: b */
    public C13184ga.C13185a mo68192b(C13184ga.C13185a aVar) throws C13184ga.C13186b {
        if (aVar.f33916c == 2) {
            this.f36119k = true;
            return (this.f36117i == 0 && this.f36118j == 0) ? C13184ga.C13185a.f33913e : aVar;
        }
        throw new C13184ga.C13186b(aVar);
    }

    /* renamed from: e */
    public boolean mo67217e() {
        return super.mo67217e() && this.f36122n == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo68194f() {
        if (this.f36119k) {
            this.f36119k = false;
            int i = this.f36118j;
            int i2 = this.f36079b.f33917d;
            this.f36121m = new byte[(i * i2)];
            this.f36120l = this.f36117i * i2;
        }
        this.f36122n = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo68195h() {
        if (this.f36119k) {
            int i = this.f36122n;
            if (i > 0) {
                this.f36123o += (long) (i / this.f36079b.f33917d);
            }
            this.f36122n = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo68196i() {
        this.f36121m = ih1.f34863f;
    }

    /* renamed from: j */
    public long mo68208j() {
        return this.f36123o;
    }

    /* renamed from: k */
    public void mo68209k() {
        this.f36123o = 0;
    }

    /* renamed from: a */
    public void mo67214a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.f36120l);
            this.f36123o += (long) (min / this.f36079b.f33917d);
            this.f36120l -= min;
            byteBuffer.position(position + min);
            if (this.f36120l <= 0) {
                int i2 = i - min;
                int length = (this.f36122n + i2) - this.f36121m.length;
                ByteBuffer a = mo68191a(length);
                int i3 = this.f36122n;
                int i4 = ih1.f34858a;
                int max = Math.max(0, Math.min(length, i3));
                a.put(this.f36121m, 0, max);
                int max2 = Math.max(0, Math.min(length - max, i2));
                byteBuffer.limit(byteBuffer.position() + max2);
                a.put(byteBuffer);
                byteBuffer.limit(limit);
                int i5 = i2 - max2;
                int i6 = this.f36122n - max;
                this.f36122n = i6;
                byte[] bArr = this.f36121m;
                System.arraycopy(bArr, max, bArr, 0, i6);
                byteBuffer.get(this.f36121m, this.f36122n, i5);
                this.f36122n += i5;
                a.flip();
            }
        }
    }

    /* renamed from: a */
    public ByteBuffer mo67213a() {
        int i;
        if (super.mo67217e() && (i = this.f36122n) > 0) {
            mo68191a(i).put(this.f36121m, 0, this.f36122n).flip();
            this.f36122n = 0;
        }
        return super.mo67213a();
    }
}
