package com.yandex.metrica.impl.p265ob;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.Kf */
public final class C10431Kf extends C11169e {

    /* renamed from: d */
    private static volatile C10431Kf[] f25057d;

    /* renamed from: b */
    public byte[] f25058b;

    /* renamed from: c */
    public byte[] f25059c;

    public C10431Kf() {
        mo61666b();
    }

    /* renamed from: c */
    public static C10431Kf[] m26746c() {
        if (f25057d == null) {
            synchronized (C11095c.f26635a) {
                if (f25057d == null) {
                    f25057d = new C10431Kf[0];
                }
            }
        }
        return f25057d;
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        byte[] bArr = this.f25058b;
        byte[] bArr2 = C11256g.f26930d;
        if (!Arrays.equals(bArr, bArr2)) {
            bVar.mo62668b(1, this.f25058b);
        }
        if (!Arrays.equals(this.f25059c, bArr2)) {
            bVar.mo62668b(2, this.f25059c);
        }
    }

    /* renamed from: b */
    public C10431Kf mo61666b() {
        byte[] bArr = C11256g.f26930d;
        this.f25058b = bArr;
        this.f25059c = bArr;
        this.f26754a = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo61538a() {
        byte[] bArr = this.f25058b;
        byte[] bArr2 = C11256g.f26930d;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            i = 0 + C11056b.m28526a(1, this.f25058b);
        }
        return !Arrays.equals(this.f25059c, bArr2) ? i + C11056b.m28526a(2, this.f25059c) : i;
    }

    /* renamed from: a */
    public C11169e mo61539a(C11009a aVar) throws IOException {
        while (true) {
            int l = aVar.mo62628l();
            if (l == 0) {
                break;
            } else if (l == 10) {
                this.f25058b = aVar.mo62616d();
            } else if (l == 18) {
                this.f25059c = aVar.mo62616d();
            } else if (!aVar.mo62621f(l)) {
                break;
            }
        }
        return this;
    }
}
