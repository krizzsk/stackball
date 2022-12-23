package com.yandex.metrica.impl.p265ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Wf */
public final class C10887Wf extends C11169e {

    /* renamed from: g */
    private static volatile C10887Wf[] f26163g;

    /* renamed from: b */
    public String f26164b;

    /* renamed from: c */
    public int f26165c;

    /* renamed from: d */
    public String f26166d;

    /* renamed from: e */
    public boolean f26167e;

    /* renamed from: f */
    public long f26168f;

    public C10887Wf() {
        mo62451b();
    }

    /* renamed from: c */
    public static C10887Wf[] m28137c() {
        if (f26163g == null) {
            synchronized (C11095c.f26635a) {
                if (f26163g == null) {
                    f26163g = new C10887Wf[0];
                }
            }
        }
        return f26163g;
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        bVar.mo62666b(1, this.f26164b);
        int i = this.f26165c;
        if (i != 0) {
            bVar.mo62675e(2, i);
        }
        if (!this.f26166d.equals("")) {
            bVar.mo62666b(3, this.f26166d);
        }
        boolean z = this.f26167e;
        if (z) {
            bVar.mo62667b(4, z);
        }
        long j = this.f26168f;
        if (j != 0) {
            bVar.mo62676e(5, j);
        }
    }

    /* renamed from: b */
    public C10887Wf mo62451b() {
        this.f26164b = "";
        this.f26165c = 0;
        this.f26166d = "";
        this.f26167e = false;
        this.f26168f = 0;
        this.f26754a = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo61538a() {
        int a = C11056b.m28524a(1, this.f26164b) + 0;
        int i = this.f26165c;
        if (i != 0) {
            a += C11056b.m28532b(2, i);
        }
        if (!this.f26166d.equals("")) {
            a += C11056b.m28524a(3, this.f26166d);
        }
        boolean z = this.f26167e;
        if (z) {
            a += C11056b.m28525a(4, z);
        }
        long j = this.f26168f;
        return j != 0 ? a + C11056b.m28533b(5, j) : a;
    }

    /* renamed from: a */
    public C11169e mo61539a(C11009a aVar) throws IOException {
        while (true) {
            int l = aVar.mo62628l();
            if (l == 0) {
                break;
            } else if (l == 10) {
                this.f26164b = aVar.mo62627k();
            } else if (l == 16) {
                this.f26165c = aVar.mo62626j();
            } else if (l == 26) {
                this.f26166d = aVar.mo62627k();
            } else if (l == 32) {
                this.f26167e = aVar.mo62615c();
            } else if (l == 40) {
                this.f26168f = aVar.mo62625i();
            } else if (!aVar.mo62621f(l)) {
                break;
            }
        }
        return this;
    }
}
