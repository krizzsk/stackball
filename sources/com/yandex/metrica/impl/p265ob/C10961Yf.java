package com.yandex.metrica.impl.p265ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Yf */
public final class C10961Yf extends C11169e {

    /* renamed from: b */
    public String f26362b;

    /* renamed from: c */
    public long f26363c;

    /* renamed from: d */
    public long f26364d;

    /* renamed from: e */
    public int f26365e;

    public C10961Yf() {
        mo62547b();
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        if (!this.f26362b.equals("")) {
            bVar.mo62666b(1, this.f26362b);
        }
        long j = this.f26363c;
        if (j != 0) {
            bVar.mo62676e(2, j);
        }
        long j2 = this.f26364d;
        if (j2 != 0) {
            bVar.mo62676e(3, j2);
        }
        int i = this.f26365e;
        if (i != 0) {
            bVar.mo62672d(4, i);
        }
    }

    /* renamed from: b */
    public C10961Yf mo62547b() {
        this.f26362b = "";
        this.f26363c = 0;
        this.f26364d = 0;
        this.f26365e = 0;
        this.f26754a = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo61538a() {
        int i = 0;
        if (!this.f26362b.equals("")) {
            i = 0 + C11056b.m28524a(1, this.f26362b);
        }
        long j = this.f26363c;
        if (j != 0) {
            i += C11056b.m28533b(2, j);
        }
        long j2 = this.f26364d;
        if (j2 != 0) {
            i += C11056b.m28533b(3, j2);
        }
        int i2 = this.f26365e;
        return i2 != 0 ? i + C11056b.m28521a(4, i2) : i;
    }

    /* renamed from: a */
    public C11169e mo61539a(C11009a aVar) throws IOException {
        while (true) {
            int l = aVar.mo62628l();
            if (l == 0) {
                break;
            } else if (l == 10) {
                this.f26362b = aVar.mo62627k();
            } else if (l == 16) {
                this.f26363c = aVar.mo62625i();
            } else if (l == 24) {
                this.f26364d = aVar.mo62625i();
            } else if (l == 32) {
                int h = aVar.mo62624h();
                if (h == 0 || h == 1 || h == 2) {
                    this.f26365e = h;
                }
            } else if (!aVar.mo62621f(l)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: a */
    public static C10961Yf m28317a(byte[] bArr) throws C11124d {
        return (C10961Yf) C11169e.m28803a(new C10961Yf(), bArr);
    }
}
