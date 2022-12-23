package com.yandex.metrica.impl.p265ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.ig */
public final class C11349ig extends C11169e {

    /* renamed from: b */
    public C11350a f27120b;

    /* renamed from: c */
    public boolean f27121c;

    public C11349ig() {
        mo63042b();
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        C11350a aVar = this.f27120b;
        if (aVar != null) {
            bVar.mo62665b(1, (C11169e) aVar);
        }
        boolean z = this.f27121c;
        if (z) {
            bVar.mo62667b(2, z);
        }
    }

    /* renamed from: b */
    public C11349ig mo63042b() {
        this.f27120b = null;
        this.f27121c = false;
        this.f26754a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.ig$a */
    public static final class C11350a extends C11169e {

        /* renamed from: b */
        public C11351a[] f27122b;

        public C11350a() {
            mo63043b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            C11351a[] aVarArr = this.f27122b;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C11351a[] aVarArr2 = this.f27122b;
                    if (i < aVarArr2.length) {
                        C11351a aVar = aVarArr2[i];
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
        public C11350a mo63043b() {
            this.f27122b = C11351a.m29225c();
            this.f26754a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.ig$a$a */
        public static final class C11351a extends C11169e {

            /* renamed from: d */
            private static volatile C11351a[] f27123d;

            /* renamed from: b */
            public String f27124b;

            /* renamed from: c */
            public String f27125c;

            public C11351a() {
                mo63044b();
            }

            /* renamed from: c */
            public static C11351a[] m29225c() {
                if (f27123d == null) {
                    synchronized (C11095c.f26635a) {
                        if (f27123d == null) {
                            f27123d = new C11351a[0];
                        }
                    }
                }
                return f27123d;
            }

            /* renamed from: a */
            public void mo61540a(C11056b bVar) throws IOException {
                bVar.mo62666b(1, this.f27124b);
                if (!this.f27125c.equals("")) {
                    bVar.mo62666b(2, this.f27125c);
                }
            }

            /* renamed from: b */
            public C11351a mo63044b() {
                this.f27124b = "";
                this.f27125c = "";
                this.f26754a = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo61538a() {
                int a = C11056b.m28524a(1, this.f27124b) + 0;
                return !this.f27125c.equals("") ? a + C11056b.m28524a(2, this.f27125c) : a;
            }

            /* renamed from: a */
            public C11169e mo61539a(C11009a aVar) throws IOException {
                while (true) {
                    int l = aVar.mo62628l();
                    if (l == 0) {
                        break;
                    } else if (l == 10) {
                        this.f27124b = aVar.mo62627k();
                    } else if (l == 18) {
                        this.f27125c = aVar.mo62627k();
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
            C11351a[] aVarArr = this.f27122b;
            int i = 0;
            if (aVarArr == null || aVarArr.length <= 0) {
                return 0;
            }
            int i2 = 0;
            while (true) {
                C11351a[] aVarArr2 = this.f27122b;
                if (i >= aVarArr2.length) {
                    return i2;
                }
                C11351a aVar = aVarArr2[i];
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
                    C11351a[] aVarArr = this.f27122b;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i = a + length;
                    C11351a[] aVarArr2 = new C11351a[i];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        aVarArr2[length] = new C11351a();
                        aVar.mo62611a((C11169e) aVarArr2[length]);
                        aVar.mo62628l();
                        length++;
                    }
                    aVarArr2[length] = new C11351a();
                    aVar.mo62611a((C11169e) aVarArr2[length]);
                    this.f27122b = aVarArr2;
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
        C11350a aVar = this.f27120b;
        int i = 0;
        if (aVar != null) {
            i = 0 + C11056b.m28523a(1, (C11169e) aVar);
        }
        boolean z = this.f27121c;
        return z ? i + C11056b.m28525a(2, z) : i;
    }

    /* renamed from: a */
    public C11169e mo61539a(C11009a aVar) throws IOException {
        while (true) {
            int l = aVar.mo62628l();
            if (l == 0) {
                break;
            } else if (l == 10) {
                if (this.f27120b == null) {
                    this.f27120b = new C11350a();
                }
                aVar.mo62611a((C11169e) this.f27120b);
            } else if (l == 16) {
                this.f27121c = aVar.mo62615c();
            } else if (!aVar.mo62621f(l)) {
                break;
            }
        }
        return this;
    }
}
