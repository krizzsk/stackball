package com.yandex.metrica.impl.p265ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Of */
public final class C10605Of extends C11169e {

    /* renamed from: h */
    private static volatile C10605Of[] f25335h;

    /* renamed from: b */
    public String f25336b;

    /* renamed from: c */
    public String f25337c;

    /* renamed from: d */
    public int f25338d;

    /* renamed from: e */
    public String f25339e;

    /* renamed from: f */
    public boolean f25340f;

    /* renamed from: g */
    public int f25341g;

    public C10605Of() {
        mo61860b();
    }

    /* renamed from: c */
    public static C10605Of[] m27129c() {
        if (f25335h == null) {
            synchronized (C11095c.f26635a) {
                if (f25335h == null) {
                    f25335h = new C10605Of[0];
                }
            }
        }
        return f25335h;
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        if (!this.f25336b.equals("")) {
            bVar.mo62666b(1, this.f25336b);
        }
        if (!this.f25337c.equals("")) {
            bVar.mo62666b(2, this.f25337c);
        }
        int i = this.f25338d;
        if (i != -1) {
            bVar.mo62675e(3, i);
        }
        if (!this.f25339e.equals("")) {
            bVar.mo62666b(4, this.f25339e);
        }
        boolean z = this.f25340f;
        if (z) {
            bVar.mo62667b(5, z);
        }
        int i2 = this.f25341g;
        if (i2 != -1) {
            bVar.mo62675e(6, i2);
        }
    }

    /* renamed from: b */
    public C10605Of mo61860b() {
        this.f25336b = "";
        this.f25337c = "";
        this.f25338d = -1;
        this.f25339e = "";
        this.f25340f = false;
        this.f25341g = -1;
        this.f26754a = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo61538a() {
        int i = 0;
        if (!this.f25336b.equals("")) {
            i = 0 + C11056b.m28524a(1, this.f25336b);
        }
        if (!this.f25337c.equals("")) {
            i += C11056b.m28524a(2, this.f25337c);
        }
        int i2 = this.f25338d;
        if (i2 != -1) {
            i += C11056b.m28532b(3, i2);
        }
        if (!this.f25339e.equals("")) {
            i += C11056b.m28524a(4, this.f25339e);
        }
        boolean z = this.f25340f;
        if (z) {
            i += C11056b.m28525a(5, z);
        }
        int i3 = this.f25341g;
        return i3 != -1 ? i + C11056b.m28532b(6, i3) : i;
    }

    /* renamed from: a */
    public C11169e mo61539a(C11009a aVar) throws IOException {
        while (true) {
            int l = aVar.mo62628l();
            if (l == 0) {
                break;
            } else if (l == 10) {
                this.f25336b = aVar.mo62627k();
            } else if (l == 18) {
                this.f25337c = aVar.mo62627k();
            } else if (l == 24) {
                this.f25338d = aVar.mo62626j();
            } else if (l == 34) {
                this.f25339e = aVar.mo62627k();
            } else if (l == 40) {
                this.f25340f = aVar.mo62615c();
            } else if (l == 48) {
                this.f25341g = aVar.mo62626j();
            } else if (!aVar.mo62621f(l)) {
                break;
            }
        }
        return this;
    }
}
