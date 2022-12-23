package com.yandex.metrica.impl.p265ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Xf */
public final class C10927Xf extends C11169e {

    /* renamed from: b */
    public byte[] f26283b;

    /* renamed from: c */
    public long f26284c;

    /* renamed from: d */
    public long f26285d;

    /* renamed from: e */
    public int f26286e;

    public C10927Xf() {
        mo62484b();
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        bVar.mo62668b(1, this.f26283b);
        long j = this.f26284c;
        if (j != 0) {
            bVar.mo62676e(2, j);
        }
        long j2 = this.f26285d;
        if (j2 != 0) {
            bVar.mo62676e(3, j2);
        }
        int i = this.f26286e;
        if (i != 0) {
            bVar.mo62672d(4, i);
        }
    }

    /* renamed from: b */
    public C10927Xf mo62484b() {
        this.f26283b = C11256g.f26930d;
        this.f26284c = 0;
        this.f26285d = 0;
        this.f26286e = 0;
        this.f26754a = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo61538a() {
        int a = C11056b.m28526a(1, this.f26283b) + 0;
        long j = this.f26284c;
        if (j != 0) {
            a += C11056b.m28533b(2, j);
        }
        long j2 = this.f26285d;
        if (j2 != 0) {
            a += C11056b.m28533b(3, j2);
        }
        int i = this.f26286e;
        return i != 0 ? a + C11056b.m28521a(4, i) : a;
    }

    /* renamed from: a */
    public C11169e mo61539a(C11009a aVar) throws IOException {
        while (true) {
            int l = aVar.mo62628l();
            if (l == 0) {
                break;
            } else if (l == 10) {
                this.f26283b = aVar.mo62616d();
            } else if (l == 16) {
                this.f26284c = aVar.mo62625i();
            } else if (l == 24) {
                this.f26285d = aVar.mo62625i();
            } else if (l == 32) {
                int h = aVar.mo62624h();
                if (h == 0 || h == 1 || h == 2) {
                    this.f26286e = h;
                }
            } else if (!aVar.mo62621f(l)) {
                break;
            }
        }
        return this;
    }
}
