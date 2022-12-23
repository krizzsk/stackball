package com.yandex.metrica.impl.p265ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.hg */
public final class C11316hg extends C11169e {

    /* renamed from: b */
    public C11317a[] f27047b;

    /* renamed from: c */
    public String[] f27048c;

    /* renamed from: com.yandex.metrica.impl.ob.hg$a */
    public static final class C11317a extends C11169e {

        /* renamed from: h */
        private static volatile C11317a[] f27049h;

        /* renamed from: b */
        public String f27050b;

        /* renamed from: c */
        public String f27051c;

        /* renamed from: d */
        public String f27052d;

        /* renamed from: e */
        public C11318a[] f27053e;

        /* renamed from: f */
        public long f27054f;

        /* renamed from: g */
        public int[] f27055g;

        public C11317a() {
            mo63014b();
        }

        /* renamed from: c */
        public static C11317a[] m29139c() {
            if (f27049h == null) {
                synchronized (C11095c.f26635a) {
                    if (f27049h == null) {
                        f27049h = new C11317a[0];
                    }
                }
            }
            return f27049h;
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62666b(1, this.f27050b);
            bVar.mo62666b(2, this.f27051c);
            bVar.mo62666b(3, this.f27052d);
            C11318a[] aVarArr = this.f27053e;
            int i = 0;
            if (aVarArr != null && aVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C11318a[] aVarArr2 = this.f27053e;
                    if (i2 >= aVarArr2.length) {
                        break;
                    }
                    C11318a aVar = aVarArr2[i2];
                    if (aVar != null) {
                        bVar.mo62665b(4, (C11169e) aVar);
                    }
                    i2++;
                }
            }
            bVar.mo62676e(5, this.f27054f);
            int[] iArr = this.f27055g;
            if (iArr != null && iArr.length > 0) {
                while (true) {
                    int[] iArr2 = this.f27055g;
                    if (i < iArr2.length) {
                        bVar.mo62672d(6, iArr2[i]);
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public C11317a mo63014b() {
            this.f27050b = "";
            this.f27051c = "";
            this.f27052d = "";
            this.f27053e = C11318a.m29144c();
            this.f27054f = 0;
            this.f27055g = C11256g.f26927a;
            this.f26754a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.hg$a$a */
        public static final class C11318a extends C11169e {

            /* renamed from: d */
            private static volatile C11318a[] f27056d;

            /* renamed from: b */
            public String f27057b;

            /* renamed from: c */
            public String f27058c;

            public C11318a() {
                mo63015b();
            }

            /* renamed from: c */
            public static C11318a[] m29144c() {
                if (f27056d == null) {
                    synchronized (C11095c.f26635a) {
                        if (f27056d == null) {
                            f27056d = new C11318a[0];
                        }
                    }
                }
                return f27056d;
            }

            /* renamed from: a */
            public void mo61540a(C11056b bVar) throws IOException {
                bVar.mo62666b(1, this.f27057b);
                bVar.mo62666b(2, this.f27058c);
            }

            /* renamed from: b */
            public C11318a mo63015b() {
                this.f27057b = "";
                this.f27058c = "";
                this.f26754a = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo61538a() {
                return C11056b.m28524a(1, this.f27057b) + 0 + C11056b.m28524a(2, this.f27058c);
            }

            /* renamed from: a */
            public C11169e mo61539a(C11009a aVar) throws IOException {
                while (true) {
                    int l = aVar.mo62628l();
                    if (l == 0) {
                        break;
                    } else if (l == 10) {
                        this.f27057b = aVar.mo62627k();
                    } else if (l == 18) {
                        this.f27058c = aVar.mo62627k();
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
            int i = 0;
            int a = C11056b.m28524a(1, this.f27050b) + 0 + C11056b.m28524a(2, this.f27051c) + C11056b.m28524a(3, this.f27052d);
            C11318a[] aVarArr = this.f27053e;
            if (aVarArr != null && aVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C11318a[] aVarArr2 = this.f27053e;
                    if (i2 >= aVarArr2.length) {
                        break;
                    }
                    C11318a aVar = aVarArr2[i2];
                    if (aVar != null) {
                        a += C11056b.m28523a(4, (C11169e) aVar);
                    }
                    i2++;
                }
            }
            int b = a + C11056b.m28533b(5, this.f27054f);
            int[] iArr = this.f27055g;
            if (iArr == null || iArr.length <= 0) {
                return b;
            }
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.f27055g;
                if (i >= iArr2.length) {
                    return b + i3 + (iArr2.length * 1);
                }
                i3 += C11056b.m28519a(iArr2[i]);
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
                    this.f27050b = aVar.mo62627k();
                } else if (l == 18) {
                    this.f27051c = aVar.mo62627k();
                } else if (l == 26) {
                    this.f27052d = aVar.mo62627k();
                } else if (l == 34) {
                    int a = C11256g.m29012a(aVar, 34);
                    C11318a[] aVarArr = this.f27053e;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i = a + length;
                    C11318a[] aVarArr2 = new C11318a[i];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        aVarArr2[length] = new C11318a();
                        aVar.mo62611a((C11169e) aVarArr2[length]);
                        aVar.mo62628l();
                        length++;
                    }
                    aVarArr2[length] = new C11318a();
                    aVar.mo62611a((C11169e) aVarArr2[length]);
                    this.f27053e = aVarArr2;
                } else if (l == 40) {
                    this.f27054f = aVar.mo62625i();
                } else if (l == 48) {
                    int a2 = C11256g.m29012a(aVar, 48);
                    int[] iArr = new int[a2];
                    int i2 = 0;
                    for (int i3 = 0; i3 < a2; i3++) {
                        if (i3 != 0) {
                            aVar.mo62628l();
                        }
                        int h = aVar.mo62624h();
                        if (h == 1 || h == 2) {
                            iArr[i2] = h;
                            i2++;
                        }
                    }
                    if (i2 != 0) {
                        int[] iArr2 = this.f27055g;
                        int length2 = iArr2 == null ? 0 : iArr2.length;
                        if (length2 == 0 && i2 == a2) {
                            this.f27055g = iArr;
                        } else {
                            int[] iArr3 = new int[(length2 + i2)];
                            if (length2 != 0) {
                                System.arraycopy(iArr2, 0, iArr3, 0, length2);
                            }
                            System.arraycopy(iArr, 0, iArr3, length2, i2);
                            this.f27055g = iArr3;
                        }
                    }
                } else if (l == 50) {
                    int c = aVar.mo62614c(aVar.mo62624h());
                    int b = aVar.mo62612b();
                    int i4 = 0;
                    while (aVar.mo62609a() > 0) {
                        int h2 = aVar.mo62624h();
                        if (h2 == 1 || h2 == 2) {
                            i4++;
                        }
                    }
                    if (i4 != 0) {
                        aVar.mo62619e(b);
                        int[] iArr4 = this.f27055g;
                        int length3 = iArr4 == null ? 0 : iArr4.length;
                        int[] iArr5 = new int[(i4 + length3)];
                        if (length3 != 0) {
                            System.arraycopy(iArr4, 0, iArr5, 0, length3);
                        }
                        while (aVar.mo62609a() > 0) {
                            int h3 = aVar.mo62624h();
                            if (h3 == 1 || h3 == 2) {
                                iArr5[length3] = h3;
                                length3++;
                            }
                        }
                        this.f27055g = iArr5;
                    }
                    aVar.mo62613b(c);
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    public C11316hg() {
        mo63013b();
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        C11317a[] aVarArr = this.f27047b;
        int i = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C11317a[] aVarArr2 = this.f27047b;
                if (i2 >= aVarArr2.length) {
                    break;
                }
                C11317a aVar = aVarArr2[i2];
                if (aVar != null) {
                    bVar.mo62665b(1, (C11169e) aVar);
                }
                i2++;
            }
        }
        String[] strArr = this.f27048c;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f27048c;
                if (i < strArr2.length) {
                    String str = strArr2[i];
                    if (str != null) {
                        bVar.mo62666b(2, str);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public C11316hg mo63013b() {
        this.f27047b = C11317a.m29139c();
        this.f27048c = C11256g.f26928b;
        this.f26754a = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo61538a() {
        int i;
        C11317a[] aVarArr = this.f27047b;
        int i2 = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int i3 = 0;
            i = 0;
            while (true) {
                C11317a[] aVarArr2 = this.f27047b;
                if (i3 >= aVarArr2.length) {
                    break;
                }
                C11317a aVar = aVarArr2[i3];
                if (aVar != null) {
                    i += C11056b.m28523a(1, (C11169e) aVar);
                }
                i3++;
            }
        } else {
            i = 0;
        }
        String[] strArr = this.f27048c;
        if (strArr == null || strArr.length <= 0) {
            return i;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String[] strArr2 = this.f27048c;
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
                C11317a[] aVarArr = this.f27047b;
                int length = aVarArr == null ? 0 : aVarArr.length;
                int i = a + length;
                C11317a[] aVarArr2 = new C11317a[i];
                if (length != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                }
                while (length < i - 1) {
                    aVarArr2[length] = new C11317a();
                    aVar.mo62611a((C11169e) aVarArr2[length]);
                    aVar.mo62628l();
                    length++;
                }
                aVarArr2[length] = new C11317a();
                aVar.mo62611a((C11169e) aVarArr2[length]);
                this.f27047b = aVarArr2;
            } else if (l == 18) {
                int a2 = C11256g.m29012a(aVar, 18);
                String[] strArr = this.f27048c;
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
                this.f27048c = strArr2;
            } else if (!aVar.mo62621f(l)) {
                break;
            }
        }
        return this;
    }
}
