package com.yandex.metrica.impl.p265ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.jg */
public final class C11382jg extends C11169e {

    /* renamed from: b */
    public C11383a[] f27195b;

    /* renamed from: c */
    public String f27196c;

    /* renamed from: d */
    public long f27197d;

    /* renamed from: e */
    public boolean f27198e;

    /* renamed from: f */
    public boolean f27199f;

    public C11382jg() {
        mo63070b();
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        C11383a[] aVarArr = this.f27195b;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                C11383a[] aVarArr2 = this.f27195b;
                if (i >= aVarArr2.length) {
                    break;
                }
                C11383a aVar = aVarArr2[i];
                if (aVar != null) {
                    bVar.mo62665b(1, (C11169e) aVar);
                }
                i++;
            }
        }
        bVar.mo62666b(2, this.f27196c);
        bVar.mo62670c(3, this.f27197d);
        bVar.mo62667b(4, this.f27198e);
        bVar.mo62667b(5, this.f27199f);
    }

    /* renamed from: b */
    public C11382jg mo63070b() {
        this.f27195b = C11383a.m29303c();
        this.f27196c = "";
        this.f27197d = 0;
        this.f27198e = false;
        this.f27199f = false;
        this.f26754a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.jg$a */
    public static final class C11383a extends C11169e {

        /* renamed from: d */
        private static volatile C11383a[] f27200d;

        /* renamed from: b */
        public String f27201b;

        /* renamed from: c */
        public String[] f27202c;

        public C11383a() {
            mo63071b();
        }

        /* renamed from: c */
        public static C11383a[] m29303c() {
            if (f27200d == null) {
                synchronized (C11095c.f26635a) {
                    if (f27200d == null) {
                        f27200d = new C11383a[0];
                    }
                }
            }
            return f27200d;
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62666b(1, this.f27201b);
            String[] strArr = this.f27202c;
            if (strArr != null && strArr.length > 0) {
                int i = 0;
                while (true) {
                    String[] strArr2 = this.f27202c;
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
        public C11383a mo63071b() {
            this.f27201b = "";
            this.f27202c = C11256g.f26928b;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            int i = 0;
            int a = C11056b.m28524a(1, this.f27201b) + 0;
            String[] strArr = this.f27202c;
            if (strArr == null || strArr.length <= 0) {
                return a;
            }
            int i2 = 0;
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.f27202c;
                if (i >= strArr2.length) {
                    return a + i2 + (i3 * 1);
                }
                String str = strArr2[i];
                if (str != null) {
                    i3++;
                    i2 += C11056b.m28529a(str);
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
                    this.f27201b = aVar.mo62627k();
                } else if (l == 18) {
                    int a = C11256g.m29012a(aVar, 18);
                    String[] strArr = this.f27202c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i = a + length;
                    String[] strArr2 = new String[i];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i - 1) {
                        strArr2[length] = aVar.mo62627k();
                        aVar.mo62628l();
                        length++;
                    }
                    strArr2[length] = aVar.mo62627k();
                    this.f27202c = strArr2;
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
        C11383a[] aVarArr = this.f27195b;
        int i = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C11383a[] aVarArr2 = this.f27195b;
                if (i >= aVarArr2.length) {
                    break;
                }
                C11383a aVar = aVarArr2[i];
                if (aVar != null) {
                    i2 += C11056b.m28523a(1, (C11169e) aVar);
                }
                i++;
            }
            i = i2;
        }
        return i + C11056b.m28524a(2, this.f27196c) + C11056b.m28522a(3, this.f27197d) + C11056b.m28525a(4, this.f27198e) + C11056b.m28525a(5, this.f27199f);
    }

    /* renamed from: a */
    public C11169e mo61539a(C11009a aVar) throws IOException {
        while (true) {
            int l = aVar.mo62628l();
            if (l == 0) {
                break;
            } else if (l == 10) {
                int a = C11256g.m29012a(aVar, 10);
                C11383a[] aVarArr = this.f27195b;
                int length = aVarArr == null ? 0 : aVarArr.length;
                int i = a + length;
                C11383a[] aVarArr2 = new C11383a[i];
                if (length != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                }
                while (length < i - 1) {
                    aVarArr2[length] = new C11383a();
                    aVar.mo62611a((C11169e) aVarArr2[length]);
                    aVar.mo62628l();
                    length++;
                }
                aVarArr2[length] = new C11383a();
                aVar.mo62611a((C11169e) aVarArr2[length]);
                this.f27195b = aVarArr2;
            } else if (l == 18) {
                this.f27196c = aVar.mo62627k();
            } else if (l == 24) {
                this.f27197d = aVar.mo62625i();
            } else if (l == 32) {
                this.f27198e = aVar.mo62615c();
            } else if (l == 40) {
                this.f27199f = aVar.mo62615c();
            } else if (!aVar.mo62621f(l)) {
                break;
            }
        }
        return this;
    }
}
