package com.yandex.metrica.impl.p265ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.dg */
public final class C11152dg extends C11169e {

    /* renamed from: b */
    public C11153a f26720b;

    /* renamed from: c */
    public C11153a[] f26721c;

    public C11152dg() {
        mo62758b();
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        C11153a aVar = this.f26720b;
        if (aVar != null) {
            bVar.mo62665b(1, (C11169e) aVar);
        }
        C11153a[] aVarArr = this.f26721c;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                C11153a[] aVarArr2 = this.f26721c;
                if (i < aVarArr2.length) {
                    C11153a aVar2 = aVarArr2[i];
                    if (aVar2 != null) {
                        bVar.mo62665b(2, (C11169e) aVar2);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public C11152dg mo62758b() {
        this.f26720b = null;
        this.f26721c = C11153a.m28743c();
        this.f26754a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.dg$b */
    public static final class C11154b extends C11169e {

        /* renamed from: b */
        public C11155a[] f26725b;

        public C11154b() {
            mo62760b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            C11155a[] aVarArr = this.f26725b;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C11155a[] aVarArr2 = this.f26725b;
                    if (i < aVarArr2.length) {
                        C11155a aVar = aVarArr2[i];
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
        public C11154b mo62760b() {
            this.f26725b = C11155a.m28752c();
            this.f26754a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.dg$b$a */
        public static final class C11155a extends C11169e {

            /* renamed from: d */
            private static volatile C11155a[] f26726d;

            /* renamed from: b */
            public String f26727b;

            /* renamed from: c */
            public String f26728c;

            public C11155a() {
                mo62761b();
            }

            /* renamed from: c */
            public static C11155a[] m28752c() {
                if (f26726d == null) {
                    synchronized (C11095c.f26635a) {
                        if (f26726d == null) {
                            f26726d = new C11155a[0];
                        }
                    }
                }
                return f26726d;
            }

            /* renamed from: a */
            public void mo61540a(C11056b bVar) throws IOException {
                if (!this.f26727b.equals("")) {
                    bVar.mo62666b(1, this.f26727b);
                }
                if (!this.f26728c.equals("")) {
                    bVar.mo62666b(2, this.f26728c);
                }
            }

            /* renamed from: b */
            public C11155a mo62761b() {
                this.f26727b = "";
                this.f26728c = "";
                this.f26754a = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo61538a() {
                int i = 0;
                if (!this.f26727b.equals("")) {
                    i = 0 + C11056b.m28524a(1, this.f26727b);
                }
                return !this.f26728c.equals("") ? i + C11056b.m28524a(2, this.f26728c) : i;
            }

            /* renamed from: a */
            public C11169e mo61539a(C11009a aVar) throws IOException {
                while (true) {
                    int l = aVar.mo62628l();
                    if (l == 0) {
                        break;
                    } else if (l == 10) {
                        this.f26727b = aVar.mo62627k();
                    } else if (l == 18) {
                        this.f26728c = aVar.mo62627k();
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
            C11155a[] aVarArr = this.f26725b;
            int i = 0;
            if (aVarArr == null || aVarArr.length <= 0) {
                return 0;
            }
            int i2 = 0;
            while (true) {
                C11155a[] aVarArr2 = this.f26725b;
                if (i >= aVarArr2.length) {
                    return i2;
                }
                C11155a aVar = aVarArr2[i];
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
                    C11155a[] aVarArr = this.f26725b;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i = a + length;
                    C11155a[] aVarArr2 = new C11155a[i];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        aVarArr2[length] = new C11155a();
                        aVar.mo62611a((C11169e) aVarArr2[length]);
                        aVar.mo62628l();
                        length++;
                    }
                    aVarArr2[length] = new C11155a();
                    aVar.mo62611a((C11169e) aVarArr2[length]);
                    this.f26725b = aVarArr2;
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dg$a */
    public static final class C11153a extends C11169e {

        /* renamed from: d */
        private static volatile C11153a[] f26722d;

        /* renamed from: b */
        public C11154b f26723b;

        /* renamed from: c */
        public int f26724c;

        public C11153a() {
            mo62759b();
        }

        /* renamed from: c */
        public static C11153a[] m28743c() {
            if (f26722d == null) {
                synchronized (C11095c.f26635a) {
                    if (f26722d == null) {
                        f26722d = new C11153a[0];
                    }
                }
            }
            return f26722d;
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            C11154b bVar2 = this.f26723b;
            if (bVar2 != null) {
                bVar.mo62665b(1, (C11169e) bVar2);
            }
            int i = this.f26724c;
            if (i != 0) {
                bVar.mo62672d(2, i);
            }
        }

        /* renamed from: b */
        public C11153a mo62759b() {
            this.f26723b = null;
            this.f26724c = 0;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            C11154b bVar = this.f26723b;
            int i = 0;
            if (bVar != null) {
                i = 0 + C11056b.m28523a(1, (C11169e) bVar);
            }
            int i2 = this.f26724c;
            return i2 != 0 ? i + C11056b.m28521a(2, i2) : i;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    if (this.f26723b == null) {
                        this.f26723b = new C11154b();
                    }
                    aVar.mo62611a((C11169e) this.f26723b);
                } else if (l == 16) {
                    int h = aVar.mo62624h();
                    if (h == 0 || h == 1 || h == 2 || h == 3) {
                        this.f26724c = h;
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
        C11153a aVar = this.f26720b;
        int i = 0;
        int a = aVar != null ? C11056b.m28523a(1, (C11169e) aVar) + 0 : 0;
        C11153a[] aVarArr = this.f26721c;
        if (aVarArr != null && aVarArr.length > 0) {
            while (true) {
                C11153a[] aVarArr2 = this.f26721c;
                if (i >= aVarArr2.length) {
                    break;
                }
                C11153a aVar2 = aVarArr2[i];
                if (aVar2 != null) {
                    a += C11056b.m28523a(2, (C11169e) aVar2);
                }
                i++;
            }
        }
        return a;
    }

    /* renamed from: a */
    public C11169e mo61539a(C11009a aVar) throws IOException {
        while (true) {
            int l = aVar.mo62628l();
            if (l == 0) {
                break;
            } else if (l == 10) {
                if (this.f26720b == null) {
                    this.f26720b = new C11153a();
                }
                aVar.mo62611a((C11169e) this.f26720b);
            } else if (l == 18) {
                int a = C11256g.m29012a(aVar, 18);
                C11153a[] aVarArr = this.f26721c;
                int length = aVarArr == null ? 0 : aVarArr.length;
                int i = a + length;
                C11153a[] aVarArr2 = new C11153a[i];
                if (length != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                }
                while (length < i - 1) {
                    aVarArr2[length] = new C11153a();
                    aVar.mo62611a((C11169e) aVarArr2[length]);
                    aVar.mo62628l();
                    length++;
                }
                aVarArr2[length] = new C11153a();
                aVar.mo62611a((C11169e) aVarArr2[length]);
                this.f26721c = aVarArr2;
            } else if (!aVar.mo62621f(l)) {
                break;
            }
        }
        return this;
    }
}
