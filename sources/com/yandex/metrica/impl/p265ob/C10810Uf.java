package com.yandex.metrica.impl.p265ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Uf */
public final class C10810Uf extends C11169e {

    /* renamed from: b */
    public C10812b[] f25927b;

    /* renamed from: c */
    public C10811a[] f25928c;

    public C10810Uf() {
        mo62356b();
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        C10812b[] bVarArr = this.f25927b;
        int i = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C10812b[] bVarArr2 = this.f25927b;
                if (i2 >= bVarArr2.length) {
                    break;
                }
                C10812b bVar2 = bVarArr2[i2];
                if (bVar2 != null) {
                    bVar.mo62665b(1, (C11169e) bVar2);
                }
                i2++;
            }
        }
        C10811a[] aVarArr = this.f25928c;
        if (aVarArr != null && aVarArr.length > 0) {
            while (true) {
                C10811a[] aVarArr2 = this.f25928c;
                if (i < aVarArr2.length) {
                    C10811a aVar = aVarArr2[i];
                    if (aVar != null) {
                        bVar.mo62665b(2, (C11169e) aVar);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public C10810Uf mo62356b() {
        this.f25927b = C10812b.m27936c();
        this.f25928c = C10811a.m27931c();
        this.f26754a = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo61538a() {
        int i;
        C10812b[] bVarArr = this.f25927b;
        int i2 = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i3 = 0;
            i = 0;
            while (true) {
                C10812b[] bVarArr2 = this.f25927b;
                if (i3 >= bVarArr2.length) {
                    break;
                }
                C10812b bVar = bVarArr2[i3];
                if (bVar != null) {
                    i += C11056b.m28523a(1, (C11169e) bVar);
                }
                i3++;
            }
        } else {
            i = 0;
        }
        C10811a[] aVarArr = this.f25928c;
        if (aVarArr != null && aVarArr.length > 0) {
            while (true) {
                C10811a[] aVarArr2 = this.f25928c;
                if (i2 >= aVarArr2.length) {
                    break;
                }
                C10811a aVar = aVarArr2[i2];
                if (aVar != null) {
                    i += C11056b.m28523a(2, (C11169e) aVar);
                }
                i2++;
            }
        }
        return i;
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$a */
    public static final class C10811a extends C11169e {

        /* renamed from: i */
        private static volatile C10811a[] f25929i;

        /* renamed from: b */
        public long f25930b;

        /* renamed from: c */
        public long f25931c;

        /* renamed from: d */
        public C10784Tf[] f25932d;

        /* renamed from: e */
        public C10887Wf[] f25933e;

        /* renamed from: f */
        public long f25934f;

        /* renamed from: g */
        public int f25935g;

        /* renamed from: h */
        public int f25936h;

        public C10811a() {
            mo62357b();
        }

        /* renamed from: c */
        public static C10811a[] m27931c() {
            if (f25929i == null) {
                synchronized (C11095c.f26635a) {
                    if (f25929i == null) {
                        f25929i = new C10811a[0];
                    }
                }
            }
            return f25929i;
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62676e(1, this.f25930b);
            bVar.mo62676e(2, this.f25931c);
            C10784Tf[] tfArr = this.f25932d;
            int i = 0;
            if (tfArr != null && tfArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C10784Tf[] tfArr2 = this.f25932d;
                    if (i2 >= tfArr2.length) {
                        break;
                    }
                    C10784Tf tf = tfArr2[i2];
                    if (tf != null) {
                        bVar.mo62665b(3, (C11169e) tf);
                    }
                    i2++;
                }
            }
            C10887Wf[] wfArr = this.f25933e;
            if (wfArr != null && wfArr.length > 0) {
                while (true) {
                    C10887Wf[] wfArr2 = this.f25933e;
                    if (i >= wfArr2.length) {
                        break;
                    }
                    C10887Wf wf = wfArr2[i];
                    if (wf != null) {
                        bVar.mo62665b(4, (C11169e) wf);
                    }
                    i++;
                }
            }
            long j = this.f25934f;
            if (j != 0) {
                bVar.mo62676e(5, j);
            }
            int i3 = this.f25935g;
            if (i3 != 0) {
                bVar.mo62672d(6, i3);
            }
            int i4 = this.f25936h;
            if (i4 != 0) {
                bVar.mo62672d(7, i4);
            }
        }

        /* renamed from: b */
        public C10811a mo62357b() {
            this.f25930b = 0;
            this.f25931c = 0;
            this.f25932d = C10784Tf.m27819c();
            this.f25933e = C10887Wf.m28137c();
            this.f25934f = 0;
            this.f25935g = 0;
            this.f25936h = 0;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            int i = 0;
            int b = C11056b.m28533b(1, this.f25930b) + 0 + C11056b.m28533b(2, this.f25931c);
            C10784Tf[] tfArr = this.f25932d;
            if (tfArr != null && tfArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C10784Tf[] tfArr2 = this.f25932d;
                    if (i2 >= tfArr2.length) {
                        break;
                    }
                    C10784Tf tf = tfArr2[i2];
                    if (tf != null) {
                        b += C11056b.m28523a(3, (C11169e) tf);
                    }
                    i2++;
                }
            }
            C10887Wf[] wfArr = this.f25933e;
            if (wfArr != null && wfArr.length > 0) {
                while (true) {
                    C10887Wf[] wfArr2 = this.f25933e;
                    if (i >= wfArr2.length) {
                        break;
                    }
                    C10887Wf wf = wfArr2[i];
                    if (wf != null) {
                        b += C11056b.m28523a(4, (C11169e) wf);
                    }
                    i++;
                }
            }
            long j = this.f25934f;
            if (j != 0) {
                b += C11056b.m28533b(5, j);
            }
            int i3 = this.f25935g;
            if (i3 != 0) {
                b += C11056b.m28521a(6, i3);
            }
            int i4 = this.f25936h;
            return i4 != 0 ? b + C11056b.m28521a(7, i4) : b;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 8) {
                    this.f25930b = aVar.mo62625i();
                } else if (l == 16) {
                    this.f25931c = aVar.mo62625i();
                } else if (l == 26) {
                    int a = C11256g.m29012a(aVar, 26);
                    C10784Tf[] tfArr = this.f25932d;
                    int length = tfArr == null ? 0 : tfArr.length;
                    int i = a + length;
                    C10784Tf[] tfArr2 = new C10784Tf[i];
                    if (length != 0) {
                        System.arraycopy(tfArr, 0, tfArr2, 0, length);
                    }
                    while (length < i - 1) {
                        tfArr2[length] = new C10784Tf();
                        aVar.mo62611a((C11169e) tfArr2[length]);
                        aVar.mo62628l();
                        length++;
                    }
                    tfArr2[length] = new C10784Tf();
                    aVar.mo62611a((C11169e) tfArr2[length]);
                    this.f25932d = tfArr2;
                } else if (l == 34) {
                    int a2 = C11256g.m29012a(aVar, 34);
                    C10887Wf[] wfArr = this.f25933e;
                    int length2 = wfArr == null ? 0 : wfArr.length;
                    int i2 = a2 + length2;
                    C10887Wf[] wfArr2 = new C10887Wf[i2];
                    if (length2 != 0) {
                        System.arraycopy(wfArr, 0, wfArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        wfArr2[length2] = new C10887Wf();
                        aVar.mo62611a((C11169e) wfArr2[length2]);
                        aVar.mo62628l();
                        length2++;
                    }
                    wfArr2[length2] = new C10887Wf();
                    aVar.mo62611a((C11169e) wfArr2[length2]);
                    this.f25933e = wfArr2;
                } else if (l == 40) {
                    this.f25934f = aVar.mo62625i();
                } else if (l == 48) {
                    int h = aVar.mo62624h();
                    if (h == 0 || h == 1 || h == 2 || h == 3 || h == 4) {
                        this.f25935g = h;
                    }
                } else if (l == 56) {
                    int h2 = aVar.mo62624h();
                    if (h2 == 0 || h2 == 1 || h2 == 2 || h2 == 3) {
                        this.f25936h = h2;
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
                int a = C11256g.m29012a(aVar, 10);
                C10812b[] bVarArr = this.f25927b;
                int length = bVarArr == null ? 0 : bVarArr.length;
                int i = a + length;
                C10812b[] bVarArr2 = new C10812b[i];
                if (length != 0) {
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                }
                while (length < i - 1) {
                    bVarArr2[length] = new C10812b();
                    aVar.mo62611a((C11169e) bVarArr2[length]);
                    aVar.mo62628l();
                    length++;
                }
                bVarArr2[length] = new C10812b();
                aVar.mo62611a((C11169e) bVarArr2[length]);
                this.f25927b = bVarArr2;
            } else if (l == 18) {
                int a2 = C11256g.m29012a(aVar, 18);
                C10811a[] aVarArr = this.f25928c;
                int length2 = aVarArr == null ? 0 : aVarArr.length;
                int i2 = a2 + length2;
                C10811a[] aVarArr2 = new C10811a[i2];
                if (length2 != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    aVarArr2[length2] = new C10811a();
                    aVar.mo62611a((C11169e) aVarArr2[length2]);
                    aVar.mo62628l();
                    length2++;
                }
                aVarArr2[length2] = new C10811a();
                aVar.mo62611a((C11169e) aVarArr2[length2]);
                this.f25928c = aVarArr2;
            } else if (!aVar.mo62621f(l)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$b */
    public static final class C10812b extends C11169e {

        /* renamed from: o */
        private static volatile C10812b[] f25937o;

        /* renamed from: b */
        public long f25938b;

        /* renamed from: c */
        public long f25939c;

        /* renamed from: d */
        public long f25940d;

        /* renamed from: e */
        public double f25941e;

        /* renamed from: f */
        public double f25942f;

        /* renamed from: g */
        public int f25943g;

        /* renamed from: h */
        public int f25944h;

        /* renamed from: i */
        public int f25945i;

        /* renamed from: j */
        public int f25946j;

        /* renamed from: k */
        public int f25947k;

        /* renamed from: l */
        public int f25948l;

        /* renamed from: m */
        public long f25949m;

        /* renamed from: n */
        public int f25950n;

        public C10812b() {
            mo62358b();
        }

        /* renamed from: c */
        public static C10812b[] m27936c() {
            if (f25937o == null) {
                synchronized (C11095c.f26635a) {
                    if (f25937o == null) {
                        f25937o = new C10812b[0];
                    }
                }
            }
            return f25937o;
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62676e(1, this.f25938b);
            bVar.mo62676e(2, this.f25939c);
            long j = this.f25940d;
            if (j != 0) {
                bVar.mo62676e(3, j);
            }
            bVar.mo62664b(4, this.f25941e);
            bVar.mo62664b(5, this.f25942f);
            int i = this.f25943g;
            if (i != 0) {
                bVar.mo62677f(6, i);
            }
            int i2 = this.f25944h;
            if (i2 != 0) {
                bVar.mo62677f(7, i2);
            }
            int i3 = this.f25945i;
            if (i3 != 0) {
                bVar.mo62677f(8, i3);
            }
            int i4 = this.f25946j;
            if (i4 != 0) {
                bVar.mo62672d(9, i4);
            }
            int i5 = this.f25947k;
            if (i5 != 0) {
                bVar.mo62672d(10, i5);
            }
            int i6 = this.f25948l;
            if (i6 != 0) {
                bVar.mo62672d(11, i6);
            }
            long j2 = this.f25949m;
            if (j2 != 0) {
                bVar.mo62676e(12, j2);
            }
            int i7 = this.f25950n;
            if (i7 != 0) {
                bVar.mo62672d(13, i7);
            }
        }

        /* renamed from: b */
        public C10812b mo62358b() {
            this.f25938b = 0;
            this.f25939c = 0;
            this.f25940d = 0;
            this.f25941e = 0.0d;
            this.f25942f = 0.0d;
            this.f25943g = 0;
            this.f25944h = 0;
            this.f25945i = 0;
            this.f25946j = 0;
            this.f25947k = 0;
            this.f25948l = 0;
            this.f25949m = 0;
            this.f25950n = 0;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            int b = C11056b.m28533b(1, this.f25938b) + 0 + C11056b.m28533b(2, this.f25939c);
            long j = this.f25940d;
            if (j != 0) {
                b += C11056b.m28533b(3, j);
            }
            int a = b + C11056b.m28520a(4, this.f25941e) + C11056b.m28520a(5, this.f25942f);
            int i = this.f25943g;
            if (i != 0) {
                a += C11056b.m28535c(6, i);
            }
            int i2 = this.f25944h;
            if (i2 != 0) {
                a += C11056b.m28535c(7, i2);
            }
            int i3 = this.f25945i;
            if (i3 != 0) {
                a += C11056b.m28535c(8, i3);
            }
            int i4 = this.f25946j;
            if (i4 != 0) {
                a += C11056b.m28521a(9, i4);
            }
            int i5 = this.f25947k;
            if (i5 != 0) {
                a += C11056b.m28521a(10, i5);
            }
            int i6 = this.f25948l;
            if (i6 != 0) {
                a += C11056b.m28521a(11, i6);
            }
            long j2 = this.f25949m;
            if (j2 != 0) {
                a += C11056b.m28533b(12, j2);
            }
            int i7 = this.f25950n;
            return i7 != 0 ? a + C11056b.m28521a(13, i7) : a;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                switch (l) {
                    case 0:
                        break;
                    case 8:
                        this.f25938b = aVar.mo62625i();
                        continue;
                    case 16:
                        this.f25939c = aVar.mo62625i();
                        continue;
                    case 24:
                        this.f25940d = aVar.mo62625i();
                        continue;
                    case 33:
                        this.f25941e = Double.longBitsToDouble(aVar.mo62622g());
                        continue;
                    case 41:
                        this.f25942f = Double.longBitsToDouble(aVar.mo62622g());
                        continue;
                    case 48:
                        this.f25943g = aVar.mo62624h();
                        continue;
                    case 56:
                        this.f25944h = aVar.mo62624h();
                        continue;
                    case 64:
                        this.f25945i = aVar.mo62624h();
                        continue;
                    case 72:
                        this.f25946j = aVar.mo62624h();
                        continue;
                    case 80:
                        int h = aVar.mo62624h();
                        if (h == 0 || h == 1 || h == 2 || h == 3) {
                            this.f25947k = h;
                            break;
                        } else {
                            continue;
                        }
                    case 88:
                        int h2 = aVar.mo62624h();
                        if (h2 == 0 || h2 == 1 || h2 == 2 || h2 == 3) {
                            this.f25948l = h2;
                            break;
                        } else {
                            continue;
                        }
                    case 96:
                        this.f25949m = aVar.mo62625i();
                        continue;
                    case 104:
                        int h3 = aVar.mo62624h();
                        if (h3 == 0 || h3 == 1 || h3 == 2 || h3 == 3 || h3 == 4) {
                            this.f25950n = h3;
                            break;
                        } else {
                            continue;
                        }
                    default:
                        if (!aVar.mo62621f(l)) {
                            break;
                        } else {
                            continue;
                        }
                }
            }
            return this;
        }
    }
}
