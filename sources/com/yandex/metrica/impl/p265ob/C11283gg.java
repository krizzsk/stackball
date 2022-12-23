package com.yandex.metrica.impl.p265ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.gg */
public final class C11283gg extends C11169e {

    /* renamed from: b */
    public C11284a f26986b;

    /* renamed from: c */
    public C11285b[] f26987c;

    public C11283gg() {
        mo62966b();
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        C11284a aVar = this.f26986b;
        if (aVar != null) {
            bVar.mo62665b(1, (C11169e) aVar);
        }
        C11285b[] bVarArr = this.f26987c;
        if (bVarArr != null && bVarArr.length > 0) {
            int i = 0;
            while (true) {
                C11285b[] bVarArr2 = this.f26987c;
                if (i < bVarArr2.length) {
                    C11285b bVar2 = bVarArr2[i];
                    if (bVar2 != null) {
                        bVar.mo62665b(2, (C11169e) bVar2);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public C11283gg mo62966b() {
        this.f26986b = null;
        this.f26987c = C11285b.m29076c();
        this.f26754a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.gg$b */
    public static final class C11285b extends C11169e {

        /* renamed from: e */
        private static volatile C11285b[] f26993e;

        /* renamed from: b */
        public String f26994b;

        /* renamed from: c */
        public String f26995c;

        /* renamed from: d */
        public int f26996d;

        public C11285b() {
            mo62968b();
        }

        /* renamed from: c */
        public static C11285b[] m29076c() {
            if (f26993e == null) {
                synchronized (C11095c.f26635a) {
                    if (f26993e == null) {
                        f26993e = new C11285b[0];
                    }
                }
            }
            return f26993e;
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            if (!this.f26994b.equals("")) {
                bVar.mo62666b(1, this.f26994b);
            }
            if (!this.f26995c.equals("")) {
                bVar.mo62666b(2, this.f26995c);
            }
            bVar.mo62672d(3, this.f26996d);
        }

        /* renamed from: b */
        public C11285b mo62968b() {
            this.f26994b = "";
            this.f26995c = "";
            this.f26996d = 0;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            int i = 0;
            if (!this.f26994b.equals("")) {
                i = 0 + C11056b.m28524a(1, this.f26994b);
            }
            if (!this.f26995c.equals("")) {
                i += C11056b.m28524a(2, this.f26995c);
            }
            return i + C11056b.m28521a(3, this.f26996d);
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    this.f26994b = aVar.mo62627k();
                } else if (l == 18) {
                    this.f26995c = aVar.mo62627k();
                } else if (l == 24) {
                    int h = aVar.mo62624h();
                    if (h == 0 || h == 1 || h == 2 || h == 3) {
                        this.f26996d = h;
                    }
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
        C11284a aVar = this.f26986b;
        int i = 0;
        int a = aVar != null ? C11056b.m28523a(1, (C11169e) aVar) + 0 : 0;
        C11285b[] bVarArr = this.f26987c;
        if (bVarArr != null && bVarArr.length > 0) {
            while (true) {
                C11285b[] bVarArr2 = this.f26987c;
                if (i >= bVarArr2.length) {
                    break;
                }
                C11285b bVar = bVarArr2[i];
                if (bVar != null) {
                    a += C11056b.m28523a(2, (C11169e) bVar);
                }
                i++;
            }
        }
        return a;
    }

    /* renamed from: com.yandex.metrica.impl.ob.gg$a */
    public static final class C11284a extends C11169e {

        /* renamed from: b */
        public String f26988b;

        /* renamed from: c */
        public String f26989c;

        /* renamed from: d */
        public boolean f26990d;

        /* renamed from: e */
        public boolean f26991e;

        /* renamed from: f */
        public int f26992f;

        public C11284a() {
            mo62967b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            if (!this.f26988b.equals("")) {
                bVar.mo62666b(1, this.f26988b);
            }
            if (!this.f26989c.equals("")) {
                bVar.mo62666b(2, this.f26989c);
            }
            boolean z = this.f26990d;
            if (z) {
                bVar.mo62667b(3, z);
            }
            boolean z2 = this.f26991e;
            if (z2) {
                bVar.mo62667b(4, z2);
            }
            bVar.mo62672d(5, this.f26992f);
        }

        /* renamed from: b */
        public C11284a mo62967b() {
            this.f26988b = "";
            this.f26989c = "";
            this.f26990d = false;
            this.f26991e = false;
            this.f26992f = 0;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            int i = 0;
            if (!this.f26988b.equals("")) {
                i = 0 + C11056b.m28524a(1, this.f26988b);
            }
            if (!this.f26989c.equals("")) {
                i += C11056b.m28524a(2, this.f26989c);
            }
            boolean z = this.f26990d;
            if (z) {
                i += C11056b.m28525a(3, z);
            }
            boolean z2 = this.f26991e;
            if (z2) {
                i += C11056b.m28525a(4, z2);
            }
            return i + C11056b.m28521a(5, this.f26992f);
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    this.f26988b = aVar.mo62627k();
                } else if (l == 18) {
                    this.f26989c = aVar.mo62627k();
                } else if (l == 24) {
                    this.f26990d = aVar.mo62615c();
                } else if (l == 32) {
                    this.f26991e = aVar.mo62615c();
                } else if (l == 40) {
                    int h = aVar.mo62624h();
                    if (h == 0 || h == 1 || h == 2 || h == 3) {
                        this.f26992f = h;
                    }
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: a */
    public C11169e mo61539a(C11009a aVar) throws IOException {
        while (true) {
            int l = aVar.mo62628l();
            if (l == 0) {
                break;
            } else if (l == 10) {
                if (this.f26986b == null) {
                    this.f26986b = new C11284a();
                }
                aVar.mo62611a((C11169e) this.f26986b);
            } else if (l == 18) {
                int a = C11256g.m29012a(aVar, 18);
                C11285b[] bVarArr = this.f26987c;
                int length = bVarArr == null ? 0 : bVarArr.length;
                int i = a + length;
                C11285b[] bVarArr2 = new C11285b[i];
                if (length != 0) {
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                }
                while (length < i - 1) {
                    bVarArr2[length] = new C11285b();
                    aVar.mo62611a((C11169e) bVarArr2[length]);
                    aVar.mo62628l();
                    length++;
                }
                bVarArr2[length] = new C11285b();
                aVar.mo62611a((C11169e) bVarArr2[length]);
                this.f26987c = bVarArr2;
            } else if (!aVar.mo62621f(l)) {
                break;
            }
        }
        return this;
    }
}
