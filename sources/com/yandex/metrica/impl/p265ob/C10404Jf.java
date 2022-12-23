package com.yandex.metrica.impl.p265ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Jf */
public final class C10404Jf extends C11169e {

    /* renamed from: b */
    public C10370If f25023b;

    /* renamed from: c */
    public String f25024c;

    /* renamed from: d */
    public int f25025d;

    public C10404Jf() {
        mo61629b();
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        C10370If ifR = this.f25023b;
        if (ifR != null) {
            bVar.mo62665b(1, (C11169e) ifR);
        }
        if (!this.f25024c.equals("")) {
            bVar.mo62666b(2, this.f25024c);
        }
        int i = this.f25025d;
        if (i != -1) {
            bVar.mo62672d(3, i);
        }
    }

    /* renamed from: b */
    public C10404Jf mo61629b() {
        this.f25023b = null;
        this.f25024c = "";
        this.f25025d = -1;
        this.f26754a = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo61538a() {
        C10370If ifR = this.f25023b;
        int i = 0;
        if (ifR != null) {
            i = 0 + C11056b.m28523a(1, (C11169e) ifR);
        }
        if (!this.f25024c.equals("")) {
            i += C11056b.m28524a(2, this.f25024c);
        }
        int i2 = this.f25025d;
        return i2 != -1 ? i + C11056b.m28521a(3, i2) : i;
    }

    /* renamed from: a */
    public C11169e mo61539a(C11009a aVar) throws IOException {
        while (true) {
            int l = aVar.mo62628l();
            if (l == 0) {
                break;
            } else if (l == 10) {
                if (this.f25023b == null) {
                    this.f25023b = new C10370If();
                }
                aVar.mo62611a((C11169e) this.f25023b);
            } else if (l == 18) {
                this.f25024c = aVar.mo62627k();
            } else if (l == 24) {
                int h = aVar.mo62624h();
                if (h == -1 || h == 0 || h == 1) {
                    this.f25025d = h;
                }
            } else if (!aVar.mo62621f(l)) {
                break;
            }
        }
        return this;
    }
}
