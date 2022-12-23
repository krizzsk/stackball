package com.yandex.metrica.impl.p265ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.cg */
public final class C11113cg extends C11169e {

    /* renamed from: b */
    public C11114a[] f26652b;

    /* renamed from: c */
    public boolean f26653c;

    public C11113cg() {
        mo62730b();
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        C11114a[] aVarArr = this.f26652b;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                C11114a[] aVarArr2 = this.f26652b;
                if (i >= aVarArr2.length) {
                    break;
                }
                C11114a aVar = aVarArr2[i];
                if (aVar != null) {
                    bVar.mo62665b(1, (C11169e) aVar);
                }
                i++;
            }
        }
        bVar.mo62667b(2, this.f26653c);
    }

    /* renamed from: b */
    public C11113cg mo62730b() {
        this.f26652b = C11114a.m28645c();
        this.f26653c = false;
        this.f26754a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.cg$a */
    public static final class C11114a extends C11169e {

        /* renamed from: g */
        private static volatile C11114a[] f26654g;

        /* renamed from: b */
        public int f26655b;

        /* renamed from: c */
        public String f26656c;

        /* renamed from: d */
        public String f26657d;

        /* renamed from: e */
        public long f26658e;

        /* renamed from: f */
        public long f26659f;

        public C11114a() {
            mo62731b();
        }

        /* renamed from: c */
        public static C11114a[] m28645c() {
            if (f26654g == null) {
                synchronized (C11095c.f26635a) {
                    if (f26654g == null) {
                        f26654g = new C11114a[0];
                    }
                }
            }
            return f26654g;
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62672d(1, this.f26655b);
            bVar.mo62666b(2, this.f26656c);
            bVar.mo62666b(3, this.f26657d);
            bVar.mo62676e(4, this.f26658e);
            bVar.mo62676e(5, this.f26659f);
        }

        /* renamed from: b */
        public C11114a mo62731b() {
            this.f26655b = 1;
            this.f26656c = "";
            this.f26657d = "";
            this.f26658e = 0;
            this.f26659f = 0;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            return C11056b.m28521a(1, this.f26655b) + 0 + C11056b.m28524a(2, this.f26656c) + C11056b.m28524a(3, this.f26657d) + C11056b.m28533b(4, this.f26658e) + C11056b.m28533b(5, this.f26659f);
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 8) {
                    int h = aVar.mo62624h();
                    if (h == 1 || h == 2 || h == 3) {
                        this.f26655b = h;
                    }
                } else if (l == 18) {
                    this.f26656c = aVar.mo62627k();
                } else if (l == 26) {
                    this.f26657d = aVar.mo62627k();
                } else if (l == 32) {
                    this.f26658e = aVar.mo62625i();
                } else if (l == 40) {
                    this.f26659f = aVar.mo62625i();
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
        C11114a[] aVarArr = this.f26652b;
        int i = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C11114a[] aVarArr2 = this.f26652b;
                if (i >= aVarArr2.length) {
                    break;
                }
                C11114a aVar = aVarArr2[i];
                if (aVar != null) {
                    i2 += C11056b.m28523a(1, (C11169e) aVar);
                }
                i++;
            }
            i = i2;
        }
        return i + C11056b.m28525a(2, this.f26653c);
    }

    /* renamed from: a */
    public C11169e mo61539a(C11009a aVar) throws IOException {
        while (true) {
            int l = aVar.mo62628l();
            if (l == 0) {
                break;
            } else if (l == 10) {
                int a = C11256g.m29012a(aVar, 10);
                C11114a[] aVarArr = this.f26652b;
                int length = aVarArr == null ? 0 : aVarArr.length;
                int i = a + length;
                C11114a[] aVarArr2 = new C11114a[i];
                if (length != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                }
                while (length < i - 1) {
                    aVarArr2[length] = new C11114a();
                    aVar.mo62611a((C11169e) aVarArr2[length]);
                    aVar.mo62628l();
                    length++;
                }
                aVarArr2[length] = new C11114a();
                aVar.mo62611a((C11169e) aVarArr2[length]);
                this.f26652b = aVarArr2;
            } else if (l == 16) {
                this.f26653c = aVar.mo62615c();
            } else if (!aVar.mo62621f(l)) {
                break;
            }
        }
        return this;
    }
}
