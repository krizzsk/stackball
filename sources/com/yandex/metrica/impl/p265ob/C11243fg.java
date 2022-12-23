package com.yandex.metrica.impl.p265ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.fg */
public final class C11243fg extends C11169e {

    /* renamed from: b */
    public C11244a[] f26909b;

    public C11243fg() {
        mo62901b();
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        C11244a[] aVarArr = this.f26909b;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                C11244a[] aVarArr2 = this.f26909b;
                if (i < aVarArr2.length) {
                    C11244a aVar = aVarArr2[i];
                    if (aVar != null) {
                        bVar.mo62665b(1, (C11169e) aVar);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public C11243fg mo62901b() {
        this.f26909b = C11244a.m28991c();
        this.f26754a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.fg$a */
    public static final class C11244a extends C11169e {

        /* renamed from: d */
        private static volatile C11244a[] f26910d;

        /* renamed from: b */
        public String f26911b;

        /* renamed from: c */
        public boolean f26912c;

        public C11244a() {
            mo62902b();
        }

        /* renamed from: c */
        public static C11244a[] m28991c() {
            if (f26910d == null) {
                synchronized (C11095c.f26635a) {
                    if (f26910d == null) {
                        f26910d = new C11244a[0];
                    }
                }
            }
            return f26910d;
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62666b(1, this.f26911b);
            bVar.mo62667b(2, this.f26912c);
        }

        /* renamed from: b */
        public C11244a mo62902b() {
            this.f26911b = "";
            this.f26912c = false;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            return C11056b.m28524a(1, this.f26911b) + 0 + C11056b.m28525a(2, this.f26912c);
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    this.f26911b = aVar.mo62627k();
                } else if (l == 16) {
                    this.f26912c = aVar.mo62615c();
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo61538a() {
        C11244a[] aVarArr = this.f26909b;
        int i = 0;
        if (aVarArr == null || aVarArr.length <= 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            C11244a[] aVarArr2 = this.f26909b;
            if (i >= aVarArr2.length) {
                return i2;
            }
            C11244a aVar = aVarArr2[i];
            if (aVar != null) {
                i2 += C11056b.m28523a(1, (C11169e) aVar);
            }
            i++;
        }
    }

    /* renamed from: a */
    public C11169e mo61539a(C11009a aVar) throws IOException {
        while (true) {
            int l = aVar.mo62628l();
            if (l == 0) {
                break;
            } else if (l == 10) {
                int a = C11256g.m29012a(aVar, 10);
                C11244a[] aVarArr = this.f26909b;
                int length = aVarArr == null ? 0 : aVarArr.length;
                int i = a + length;
                C11244a[] aVarArr2 = new C11244a[i];
                if (length != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                }
                while (length < i - 1) {
                    aVarArr2[length] = new C11244a();
                    aVar.mo62611a((C11169e) aVarArr2[length]);
                    aVar.mo62628l();
                    length++;
                }
                aVarArr2[length] = new C11244a();
                aVar.mo62611a((C11169e) aVarArr2[length]);
                this.f26909b = aVarArr2;
            } else if (!aVar.mo62621f(l)) {
                break;
            }
        }
        return this;
    }
}
