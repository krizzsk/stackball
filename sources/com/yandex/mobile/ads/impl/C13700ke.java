package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.C12178d;
import com.yandex.mobile.ads.exo.Format;
import java.nio.ByteBuffer;

/* renamed from: com.yandex.mobile.ads.impl.ke */
public class C13700ke extends C12178d {

    /* renamed from: m */
    private final C14387qj f36102m = new C14387qj(1);

    /* renamed from: n */
    private final fy0 f36103n = new fy0();

    /* renamed from: o */
    private long f36104o;

    /* renamed from: p */
    private C13492je f36105p;

    /* renamed from: q */
    private long f36106q;

    public C13700ke() {
        super(5);
    }

    /* renamed from: a */
    public int mo64795a(Format format) {
        if ("application/x-camera-motion".equals(format.f29530j)) {
            return C12178d.m31711b(4);
        }
        return C12178d.m31711b(0);
    }

    /* renamed from: c */
    public boolean mo65006c() {
        return true;
    }

    /* renamed from: e */
    public boolean mo65007e() {
        return mo64817k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo64827w() {
        this.f36106q = 0;
        C13492je jeVar = this.f36105p;
        if (jeVar != null) {
            jeVar.mo67977a();
        }
    }

    /* renamed from: a */
    public void mo64802a(int i, Object obj) throws k40 {
        if (i == 7) {
            this.f36105p = (C13492je) obj;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64807a(Format[] formatArr, long j) throws k40 {
        this.f36104o = j;
    }

    /* renamed from: a */
    public void mo65005a(long j, long j2) throws k40 {
        float[] fArr;
        while (!mo64817k() && this.f36106q < 100000 + j) {
            this.f36102m.mo66557b();
            if (mo64796a(mo64824t(), this.f36102m, false) == -4 && !this.f36102m.mo71021e()) {
                this.f36102m.mo69600g();
                C14387qj qjVar = this.f36102m;
                this.f36106q = qjVar.f39149f;
                if (this.f36105p != null) {
                    ByteBuffer byteBuffer = qjVar.f39147d;
                    int i = ih1.f34858a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        this.f36103n.mo67103a(byteBuffer.array(), byteBuffer.limit());
                        this.f36103n.mo67112e(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i2 = 0; i2 < 3; i2++) {
                            fArr2[i2] = Float.intBitsToFloat(this.f36103n.mo67117i());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.f36105p.mo67978a(this.f36106q - this.f36104o, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64804a(long j, boolean z) throws k40 {
        this.f36106q = 0;
        C13492je jeVar = this.f36105p;
        if (jeVar != null) {
            jeVar.mo67977a();
        }
    }
}
