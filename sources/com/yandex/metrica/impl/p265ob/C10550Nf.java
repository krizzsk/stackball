package com.yandex.metrica.impl.p265ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Nf */
public final class C10550Nf extends C11169e {

    /* renamed from: b */
    public int f25249b;

    /* renamed from: c */
    public String f25250c;

    public C10550Nf() {
        mo61818b();
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        int i = this.f25249b;
        if (i != 0) {
            bVar.mo62672d(1, i);
        }
        if (!this.f25250c.equals("")) {
            bVar.mo62666b(2, this.f25250c);
        }
    }

    /* renamed from: b */
    public C10550Nf mo61818b() {
        this.f25249b = 0;
        this.f25250c = "";
        this.f26754a = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo61538a() {
        int i = this.f25249b;
        int i2 = 0;
        if (i != 0) {
            i2 = 0 + C11056b.m28521a(1, i);
        }
        return !this.f25250c.equals("") ? i2 + C11056b.m28524a(2, this.f25250c) : i2;
    }

    /* renamed from: a */
    public C11169e mo61539a(C11009a aVar) throws IOException {
        while (true) {
            int l = aVar.mo62628l();
            if (l == 0) {
                break;
            } else if (l == 8) {
                int h = aVar.mo62624h();
                if (h == 0 || h == 1 || h == 2 || h == 3) {
                    this.f25249b = h;
                }
            } else if (l == 18) {
                this.f25250c = aVar.mo62627k();
            } else if (!aVar.mo62621f(l)) {
                break;
            }
        }
        return this;
    }
}
