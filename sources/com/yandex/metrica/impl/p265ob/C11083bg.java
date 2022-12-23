package com.yandex.metrica.impl.p265ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.bg */
public final class C11083bg extends C11169e {

    /* renamed from: b */
    public C11085b[] f26608b;

    /* renamed from: c */
    public C11084a f26609c;

    /* renamed from: d */
    public String[] f26610d;

    public C11083bg() {
        mo62700b();
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        C11085b[] bVarArr = this.f26608b;
        int i = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C11085b[] bVarArr2 = this.f26608b;
                if (i2 >= bVarArr2.length) {
                    break;
                }
                C11085b bVar2 = bVarArr2[i2];
                if (bVar2 != null) {
                    bVar.mo62665b(1, (C11169e) bVar2);
                }
                i2++;
            }
        }
        C11084a aVar = this.f26609c;
        if (aVar != null) {
            bVar.mo62665b(2, (C11169e) aVar);
        }
        String[] strArr = this.f26610d;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f26610d;
                if (i < strArr2.length) {
                    String str = strArr2[i];
                    if (str != null) {
                        bVar.mo62666b(3, str);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public C11083bg mo62700b() {
        this.f26608b = C11085b.m28599c();
        this.f26609c = null;
        this.f26610d = C11256g.f26928b;
        this.f26754a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.bg$a */
    public static final class C11084a extends C11169e {

        /* renamed from: b */
        public int f26611b;

        /* renamed from: c */
        public int f26612c;

        public C11084a() {
            mo62701b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62672d(2, this.f26611b);
            bVar.mo62672d(3, this.f26612c);
        }

        /* renamed from: b */
        public C11084a mo62701b() {
            this.f26611b = 0;
            this.f26612c = -1;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            return C11056b.m28521a(2, this.f26611b) + 0 + C11056b.m28521a(3, this.f26612c);
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 16) {
                    int h = aVar.mo62624h();
                    if (h == 0 || h == 1 || h == 2 || h == 3 || h == 4 || h == 5) {
                        this.f26611b = h;
                    }
                } else if (l == 24) {
                    int h2 = aVar.mo62624h();
                    if (h2 == -1 || h2 == 0 || h2 == 1) {
                        this.f26612c = h2;
                    }
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.bg$b */
    public static final class C11085b extends C11169e {

        /* renamed from: d */
        private static volatile C11085b[] f26613d;

        /* renamed from: b */
        public String f26614b;

        /* renamed from: c */
        public boolean f26615c;

        public C11085b() {
            mo62702b();
        }

        /* renamed from: c */
        public static C11085b[] m28599c() {
            if (f26613d == null) {
                synchronized (C11095c.f26635a) {
                    if (f26613d == null) {
                        f26613d = new C11085b[0];
                    }
                }
            }
            return f26613d;
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62666b(1, this.f26614b);
            bVar.mo62667b(2, this.f26615c);
        }

        /* renamed from: b */
        public C11085b mo62702b() {
            this.f26614b = "";
            this.f26615c = false;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            return C11056b.m28524a(1, this.f26614b) + 0 + C11056b.m28525a(2, this.f26615c);
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    this.f26614b = aVar.mo62627k();
                } else if (l == 16) {
                    this.f26615c = aVar.mo62615c();
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
        int i;
        C11085b[] bVarArr = this.f26608b;
        int i2 = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i3 = 0;
            i = 0;
            while (true) {
                C11085b[] bVarArr2 = this.f26608b;
                if (i3 >= bVarArr2.length) {
                    break;
                }
                C11085b bVar = bVarArr2[i3];
                if (bVar != null) {
                    i += C11056b.m28523a(1, (C11169e) bVar);
                }
                i3++;
            }
        } else {
            i = 0;
        }
        C11084a aVar = this.f26609c;
        if (aVar != null) {
            i += C11056b.m28523a(2, (C11169e) aVar);
        }
        String[] strArr = this.f26610d;
        if (strArr == null || strArr.length <= 0) {
            return i;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String[] strArr2 = this.f26610d;
            if (i2 >= strArr2.length) {
                return i + i4 + (i5 * 1);
            }
            String str = strArr2[i2];
            if (str != null) {
                i5++;
                i4 += C11056b.m28529a(str);
            }
            i2++;
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
                C11085b[] bVarArr = this.f26608b;
                int length = bVarArr == null ? 0 : bVarArr.length;
                int i = a + length;
                C11085b[] bVarArr2 = new C11085b[i];
                if (length != 0) {
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                }
                while (length < i - 1) {
                    bVarArr2[length] = new C11085b();
                    aVar.mo62611a((C11169e) bVarArr2[length]);
                    aVar.mo62628l();
                    length++;
                }
                bVarArr2[length] = new C11085b();
                aVar.mo62611a((C11169e) bVarArr2[length]);
                this.f26608b = bVarArr2;
            } else if (l == 18) {
                if (this.f26609c == null) {
                    this.f26609c = new C11084a();
                }
                aVar.mo62611a((C11169e) this.f26609c);
            } else if (l == 26) {
                int a2 = C11256g.m29012a(aVar, 26);
                String[] strArr = this.f26610d;
                int length2 = strArr == null ? 0 : strArr.length;
                int i2 = a2 + length2;
                String[] strArr2 = new String[i2];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    strArr2[length2] = aVar.mo62627k();
                    aVar.mo62628l();
                    length2++;
                }
                strArr2[length2] = aVar.mo62627k();
                this.f26610d = strArr2;
            } else if (!aVar.mo62621f(l)) {
                break;
            }
        }
        return this;
    }
}
