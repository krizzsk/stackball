package com.yandex.metrica.impl.p265ob;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.Rf */
public final class C10705Rf extends C11169e {

    /* renamed from: b */
    public int f25600b;

    /* renamed from: c */
    public C10723q f25601c;

    /* renamed from: d */
    public C10721o f25602d;

    /* renamed from: e */
    public C10722p f25603e;

    /* renamed from: f */
    public C10707b f25604f;

    /* renamed from: g */
    public C10713h f25605g;

    public C10705Rf() {
        mo62130b();
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        int i = this.f25600b;
        if (i != 0) {
            bVar.mo62672d(1, i);
        }
        C10723q qVar = this.f25601c;
        if (qVar != null) {
            bVar.mo62665b(2, (C11169e) qVar);
        }
        C10721o oVar = this.f25602d;
        if (oVar != null) {
            bVar.mo62665b(3, (C11169e) oVar);
        }
        C10722p pVar = this.f25603e;
        if (pVar != null) {
            bVar.mo62665b(4, (C11169e) pVar);
        }
        C10707b bVar2 = this.f25604f;
        if (bVar2 != null) {
            bVar.mo62665b(5, (C11169e) bVar2);
        }
        C10713h hVar = this.f25605g;
        if (hVar != null) {
            bVar.mo62665b(6, (C11169e) hVar);
        }
    }

    /* renamed from: b */
    public C10705Rf mo62130b() {
        this.f25600b = 0;
        this.f25601c = null;
        this.f25602d = null;
        this.f25603e = null;
        this.f25604f = null;
        this.f25605g = null;
        this.f26754a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$b */
    public static final class C10707b extends C11169e {

        /* renamed from: b */
        public C10708c f25609b;

        public C10707b() {
            mo62132b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            C10708c cVar = this.f25609b;
            if (cVar != null) {
                bVar.mo62665b(1, (C11169e) cVar);
            }
        }

        /* renamed from: b */
        public C10707b mo62132b() {
            this.f25609b = null;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            C10708c cVar = this.f25609b;
            if (cVar != null) {
                return 0 + C11056b.m28523a(1, (C11169e) cVar);
            }
            return 0;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    if (this.f25609b == null) {
                        this.f25609b = new C10708c();
                    }
                    aVar.mo62611a((C11169e) this.f25609b);
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$h */
    public static final class C10713h extends C11169e {

        /* renamed from: b */
        public C10711f f25625b;

        public C10713h() {
            mo62138b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            C10711f fVar = this.f25625b;
            if (fVar != null) {
                bVar.mo62665b(1, (C11169e) fVar);
            }
        }

        /* renamed from: b */
        public C10713h mo62138b() {
            this.f25625b = null;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            C10711f fVar = this.f25625b;
            if (fVar != null) {
                return 0 + C11056b.m28523a(1, (C11169e) fVar);
            }
            return 0;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    if (this.f25625b == null) {
                        this.f25625b = new C10711f();
                    }
                    aVar.mo62611a((C11169e) this.f25625b);
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$l */
    public static final class C10718l extends C11169e {

        /* renamed from: c */
        private static volatile C10718l[] f25640c;

        /* renamed from: b */
        public byte[] f25641b;

        public C10718l() {
            mo62143b();
        }

        /* renamed from: c */
        public static C10718l[] m27557c() {
            if (f25640c == null) {
                synchronized (C11095c.f26635a) {
                    if (f25640c == null) {
                        f25640c = new C10718l[0];
                    }
                }
            }
            return f25640c;
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            if (!Arrays.equals(this.f25641b, C11256g.f26930d)) {
                bVar.mo62668b(1, this.f25641b);
            }
        }

        /* renamed from: b */
        public C10718l mo62143b() {
            this.f25641b = C11256g.f26930d;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            if (!Arrays.equals(this.f25641b, C11256g.f26930d)) {
                return 0 + C11056b.m28526a(1, this.f25641b);
            }
            return 0;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    this.f25641b = aVar.mo62616d();
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$q */
    public static final class C10723q extends C11169e {

        /* renamed from: b */
        public C10720n f25653b;

        public C10723q() {
            mo62148b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            C10720n nVar = this.f25653b;
            if (nVar != null) {
                bVar.mo62665b(1, (C11169e) nVar);
            }
        }

        /* renamed from: b */
        public C10723q mo62148b() {
            this.f25653b = null;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            C10720n nVar = this.f25653b;
            if (nVar != null) {
                return 0 + C11056b.m28523a(1, (C11169e) nVar);
            }
            return 0;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    if (this.f25653b == null) {
                        this.f25653b = new C10720n();
                    }
                    aVar.mo62611a((C11169e) this.f25653b);
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$i */
    public static final class C10714i extends C11169e {

        /* renamed from: b */
        public C10715a[] f25626b;

        /* renamed from: c */
        public int f25627c;

        public C10714i() {
            mo62139b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            C10715a[] aVarArr = this.f25626b;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C10715a[] aVarArr2 = this.f25626b;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C10715a aVar = aVarArr2[i];
                    if (aVar != null) {
                        bVar.mo62665b(1, (C11169e) aVar);
                    }
                    i++;
                }
            }
            int i2 = this.f25627c;
            if (i2 != 0) {
                bVar.mo62677f(2, i2);
            }
        }

        /* renamed from: b */
        public C10714i mo62139b() {
            this.f25626b = C10715a.m27544c();
            this.f25627c = 0;
            this.f26754a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.Rf$i$a */
        public static final class C10715a extends C11169e {

            /* renamed from: d */
            private static volatile C10715a[] f25628d;

            /* renamed from: b */
            public byte[] f25629b;

            /* renamed from: c */
            public byte[] f25630c;

            public C10715a() {
                mo62140b();
            }

            /* renamed from: c */
            public static C10715a[] m27544c() {
                if (f25628d == null) {
                    synchronized (C11095c.f26635a) {
                        if (f25628d == null) {
                            f25628d = new C10715a[0];
                        }
                    }
                }
                return f25628d;
            }

            /* renamed from: a */
            public void mo61540a(C11056b bVar) throws IOException {
                byte[] bArr = this.f25629b;
                byte[] bArr2 = C11256g.f26930d;
                if (!Arrays.equals(bArr, bArr2)) {
                    bVar.mo62668b(1, this.f25629b);
                }
                if (!Arrays.equals(this.f25630c, bArr2)) {
                    bVar.mo62668b(2, this.f25630c);
                }
            }

            /* renamed from: b */
            public C10715a mo62140b() {
                byte[] bArr = C11256g.f26930d;
                this.f25629b = bArr;
                this.f25630c = bArr;
                this.f26754a = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo61538a() {
                byte[] bArr = this.f25629b;
                byte[] bArr2 = C11256g.f26930d;
                int i = 0;
                if (!Arrays.equals(bArr, bArr2)) {
                    i = 0 + C11056b.m28526a(1, this.f25629b);
                }
                return !Arrays.equals(this.f25630c, bArr2) ? i + C11056b.m28526a(2, this.f25630c) : i;
            }

            /* renamed from: a */
            public C11169e mo61539a(C11009a aVar) throws IOException {
                while (true) {
                    int l = aVar.mo62628l();
                    if (l == 0) {
                        break;
                    } else if (l == 10) {
                        this.f25629b = aVar.mo62616d();
                    } else if (l == 18) {
                        this.f25630c = aVar.mo62616d();
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
            C10715a[] aVarArr = this.f25626b;
            int i = 0;
            if (aVarArr != null && aVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C10715a[] aVarArr2 = this.f25626b;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C10715a aVar = aVarArr2[i];
                    if (aVar != null) {
                        i2 += C11056b.m28523a(1, (C11169e) aVar);
                    }
                    i++;
                }
                i = i2;
            }
            int i3 = this.f25627c;
            return i3 != 0 ? i + C11056b.m28535c(2, i3) : i;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    int a = C11256g.m29012a(aVar, 10);
                    C10715a[] aVarArr = this.f25626b;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i = a + length;
                    C10715a[] aVarArr2 = new C10715a[i];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        aVarArr2[length] = new C10715a();
                        aVar.mo62611a((C11169e) aVarArr2[length]);
                        aVar.mo62628l();
                        length++;
                    }
                    aVarArr2[length] = new C10715a();
                    aVar.mo62611a((C11169e) aVarArr2[length]);
                    this.f25626b = aVarArr2;
                } else if (l == 16) {
                    this.f25627c = aVar.mo62624h();
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$a */
    public static final class C10706a extends C11169e {

        /* renamed from: d */
        private static volatile C10706a[] f25606d;

        /* renamed from: b */
        public byte[] f25607b;

        /* renamed from: c */
        public C10710e f25608c;

        public C10706a() {
            mo62131b();
        }

        /* renamed from: c */
        public static C10706a[] m27506c() {
            if (f25606d == null) {
                synchronized (C11095c.f26635a) {
                    if (f25606d == null) {
                        f25606d = new C10706a[0];
                    }
                }
            }
            return f25606d;
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            if (!Arrays.equals(this.f25607b, C11256g.f26930d)) {
                bVar.mo62668b(1, this.f25607b);
            }
            C10710e eVar = this.f25608c;
            if (eVar != null) {
                bVar.mo62665b(2, (C11169e) eVar);
            }
        }

        /* renamed from: b */
        public C10706a mo62131b() {
            this.f25607b = C11256g.f26930d;
            this.f25608c = null;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            int i = 0;
            if (!Arrays.equals(this.f25607b, C11256g.f26930d)) {
                i = 0 + C11056b.m28526a(1, this.f25607b);
            }
            C10710e eVar = this.f25608c;
            return eVar != null ? i + C11056b.m28523a(2, (C11169e) eVar) : i;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    this.f25607b = aVar.mo62616d();
                } else if (l == 18) {
                    if (this.f25608c == null) {
                        this.f25608c = new C10710e();
                    }
                    aVar.mo62611a((C11169e) this.f25608c);
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$d */
    public static final class C10709d extends C11169e {

        /* renamed from: b */
        public byte[][] f25614b;

        public C10709d() {
            mo62134b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            byte[][] bArr = this.f25614b;
            if (bArr != null && bArr.length > 0) {
                int i = 0;
                while (true) {
                    byte[][] bArr2 = this.f25614b;
                    if (i < bArr2.length) {
                        byte[] bArr3 = bArr2[i];
                        if (bArr3 != null) {
                            bVar.mo62668b(1, bArr3);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public C10709d mo62134b() {
            this.f25614b = C11256g.f26929c;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            byte[][] bArr = this.f25614b;
            if (bArr == null || bArr.length <= 0) {
                return 0;
            }
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[][] bArr2 = this.f25614b;
                if (i >= bArr2.length) {
                    return 0 + i2 + (i3 * 1);
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i3++;
                    i2 += C11056b.m28531b(bArr3.length) + bArr3.length;
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
                    byte[][] bArr = this.f25614b;
                    int length = bArr == null ? 0 : bArr.length;
                    int i = a + length;
                    byte[][] bArr2 = new byte[i][];
                    if (length != 0) {
                        System.arraycopy(bArr, 0, bArr2, 0, length);
                    }
                    while (length < i - 1) {
                        bArr2[length] = aVar.mo62616d();
                        aVar.mo62628l();
                        length++;
                    }
                    bArr2[length] = aVar.mo62616d();
                    this.f25614b = bArr2;
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$e */
    public static final class C10710e extends C11169e {

        /* renamed from: b */
        public long f25615b;

        /* renamed from: c */
        public int f25616c;

        public C10710e() {
            mo62135b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            long j = this.f25615b;
            if (j != 0) {
                bVar.mo62670c(1, j);
            }
            int i = this.f25616c;
            if (i != 0) {
                bVar.mo62672d(2, i);
            }
        }

        /* renamed from: b */
        public C10710e mo62135b() {
            this.f25615b = 0;
            this.f25616c = 0;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            long j = this.f25615b;
            int i = 0;
            if (j != 0) {
                i = 0 + C11056b.m28522a(1, j);
            }
            int i2 = this.f25616c;
            return i2 != 0 ? i + C11056b.m28521a(2, i2) : i;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 8) {
                    this.f25615b = aVar.mo62625i();
                } else if (l == 16) {
                    this.f25616c = aVar.mo62624h();
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$g */
    public static final class C10712g extends C11169e {

        /* renamed from: d */
        private static volatile C10712g[] f25622d;

        /* renamed from: b */
        public int f25623b;

        /* renamed from: c */
        public C10708c f25624c;

        public C10712g() {
            mo62137b();
        }

        /* renamed from: c */
        public static C10712g[] m27531c() {
            if (f25622d == null) {
                synchronized (C11095c.f26635a) {
                    if (f25622d == null) {
                        f25622d = new C10712g[0];
                    }
                }
            }
            return f25622d;
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            int i = this.f25623b;
            if (i != 0) {
                bVar.mo62677f(1, i);
            }
            C10708c cVar = this.f25624c;
            if (cVar != null) {
                bVar.mo62665b(2, (C11169e) cVar);
            }
        }

        /* renamed from: b */
        public C10712g mo62137b() {
            this.f25623b = 0;
            this.f25624c = null;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            int i = this.f25623b;
            int i2 = 0;
            if (i != 0) {
                i2 = 0 + C11056b.m28535c(1, i);
            }
            C10708c cVar = this.f25624c;
            return cVar != null ? i2 + C11056b.m28523a(2, (C11169e) cVar) : i2;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 8) {
                    this.f25623b = aVar.mo62624h();
                } else if (l == 18) {
                    if (this.f25624c == null) {
                        this.f25624c = new C10708c();
                    }
                    aVar.mo62611a((C11169e) this.f25624c);
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$o */
    public static final class C10721o extends C11169e {

        /* renamed from: b */
        public C10717k f25649b;

        /* renamed from: c */
        public C10720n f25650c;

        public C10721o() {
            mo62146b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            C10717k kVar = this.f25649b;
            if (kVar != null) {
                bVar.mo62665b(1, (C11169e) kVar);
            }
            C10720n nVar = this.f25650c;
            if (nVar != null) {
                bVar.mo62665b(2, (C11169e) nVar);
            }
        }

        /* renamed from: b */
        public C10721o mo62146b() {
            this.f25649b = null;
            this.f25650c = null;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            C10717k kVar = this.f25649b;
            int i = 0;
            if (kVar != null) {
                i = 0 + C11056b.m28523a(1, (C11169e) kVar);
            }
            C10720n nVar = this.f25650c;
            return nVar != null ? i + C11056b.m28523a(2, (C11169e) nVar) : i;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    if (this.f25649b == null) {
                        this.f25649b = new C10717k();
                    }
                    aVar.mo62611a((C11169e) this.f25649b);
                } else if (l == 18) {
                    if (this.f25650c == null) {
                        this.f25650c = new C10720n();
                    }
                    aVar.mo62611a((C11169e) this.f25650c);
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$p */
    public static final class C10722p extends C11169e {

        /* renamed from: b */
        public C10717k f25651b;

        /* renamed from: c */
        public C10719m f25652c;

        public C10722p() {
            mo62147b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            C10717k kVar = this.f25651b;
            if (kVar != null) {
                bVar.mo62665b(1, (C11169e) kVar);
            }
            C10719m mVar = this.f25652c;
            if (mVar != null) {
                bVar.mo62665b(2, (C11169e) mVar);
            }
        }

        /* renamed from: b */
        public C10722p mo62147b() {
            this.f25651b = null;
            this.f25652c = null;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            C10717k kVar = this.f25651b;
            int i = 0;
            if (kVar != null) {
                i = 0 + C11056b.m28523a(1, (C11169e) kVar);
            }
            C10719m mVar = this.f25652c;
            return mVar != null ? i + C11056b.m28523a(2, (C11169e) mVar) : i;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    if (this.f25651b == null) {
                        this.f25651b = new C10717k();
                    }
                    aVar.mo62611a((C11169e) this.f25651b);
                } else if (l == 18) {
                    if (this.f25652c == null) {
                        this.f25652c = new C10719m();
                    }
                    aVar.mo62611a((C11169e) this.f25652c);
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$j */
    public static final class C10716j extends C11169e {

        /* renamed from: b */
        public C10706a f25631b;

        /* renamed from: c */
        public C10706a[] f25632c;

        public C10716j() {
            mo62141b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            C10706a aVar = this.f25631b;
            if (aVar != null) {
                bVar.mo62665b(1, (C11169e) aVar);
            }
            C10706a[] aVarArr = this.f25632c;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C10706a[] aVarArr2 = this.f25632c;
                    if (i < aVarArr2.length) {
                        C10706a aVar2 = aVarArr2[i];
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
        public C10716j mo62141b() {
            this.f25631b = null;
            this.f25632c = C10706a.m27506c();
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            C10706a aVar = this.f25631b;
            int i = 0;
            int a = aVar != null ? C11056b.m28523a(1, (C11169e) aVar) + 0 : 0;
            C10706a[] aVarArr = this.f25632c;
            if (aVarArr != null && aVarArr.length > 0) {
                while (true) {
                    C10706a[] aVarArr2 = this.f25632c;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C10706a aVar2 = aVarArr2[i];
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
                    if (this.f25631b == null) {
                        this.f25631b = new C10706a();
                    }
                    aVar.mo62611a((C11169e) this.f25631b);
                } else if (l == 18) {
                    int a = C11256g.m29012a(aVar, 18);
                    C10706a[] aVarArr = this.f25632c;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i = a + length;
                    C10706a[] aVarArr2 = new C10706a[i];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        aVarArr2[length] = new C10706a();
                        aVar.mo62611a((C11169e) aVarArr2[length]);
                        aVar.mo62628l();
                        length++;
                    }
                    aVarArr2[length] = new C10706a();
                    aVar.mo62611a((C11169e) aVarArr2[length]);
                    this.f25632c = aVarArr2;
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$m */
    public static final class C10719m extends C11169e {

        /* renamed from: b */
        public byte[] f25642b;

        /* renamed from: c */
        public byte[] f25643c;

        /* renamed from: d */
        public C10720n f25644d;

        public C10719m() {
            mo62144b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            byte[] bArr = this.f25642b;
            byte[] bArr2 = C11256g.f26930d;
            if (!Arrays.equals(bArr, bArr2)) {
                bVar.mo62668b(1, this.f25642b);
            }
            if (!Arrays.equals(this.f25643c, bArr2)) {
                bVar.mo62668b(2, this.f25643c);
            }
            C10720n nVar = this.f25644d;
            if (nVar != null) {
                bVar.mo62665b(3, (C11169e) nVar);
            }
        }

        /* renamed from: b */
        public C10719m mo62144b() {
            byte[] bArr = C11256g.f26930d;
            this.f25642b = bArr;
            this.f25643c = bArr;
            this.f25644d = null;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            byte[] bArr = this.f25642b;
            byte[] bArr2 = C11256g.f26930d;
            int i = 0;
            if (!Arrays.equals(bArr, bArr2)) {
                i = 0 + C11056b.m28526a(1, this.f25642b);
            }
            if (!Arrays.equals(this.f25643c, bArr2)) {
                i += C11056b.m28526a(2, this.f25643c);
            }
            C10720n nVar = this.f25644d;
            return nVar != null ? i + C11056b.m28523a(3, (C11169e) nVar) : i;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    this.f25642b = aVar.mo62616d();
                } else if (l == 18) {
                    this.f25643c = aVar.mo62616d();
                } else if (l == 26) {
                    if (this.f25644d == null) {
                        this.f25644d = new C10720n();
                    }
                    aVar.mo62611a((C11169e) this.f25644d);
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$c */
    public static final class C10708c extends C11169e {

        /* renamed from: b */
        public C10717k f25610b;

        /* renamed from: c */
        public C10719m f25611c;

        /* renamed from: d */
        public C10710e f25612d;

        /* renamed from: e */
        public C10716j f25613e;

        public C10708c() {
            mo62133b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            C10717k kVar = this.f25610b;
            if (kVar != null) {
                bVar.mo62665b(1, (C11169e) kVar);
            }
            C10719m mVar = this.f25611c;
            if (mVar != null) {
                bVar.mo62665b(2, (C11169e) mVar);
            }
            C10710e eVar = this.f25612d;
            if (eVar != null) {
                bVar.mo62665b(3, (C11169e) eVar);
            }
            C10716j jVar = this.f25613e;
            if (jVar != null) {
                bVar.mo62665b(4, (C11169e) jVar);
            }
        }

        /* renamed from: b */
        public C10708c mo62133b() {
            this.f25610b = null;
            this.f25611c = null;
            this.f25612d = null;
            this.f25613e = null;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            C10717k kVar = this.f25610b;
            int i = 0;
            if (kVar != null) {
                i = 0 + C11056b.m28523a(1, (C11169e) kVar);
            }
            C10719m mVar = this.f25611c;
            if (mVar != null) {
                i += C11056b.m28523a(2, (C11169e) mVar);
            }
            C10710e eVar = this.f25612d;
            if (eVar != null) {
                i += C11056b.m28523a(3, (C11169e) eVar);
            }
            C10716j jVar = this.f25613e;
            return jVar != null ? i + C11056b.m28523a(4, (C11169e) jVar) : i;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    if (this.f25610b == null) {
                        this.f25610b = new C10717k();
                    }
                    aVar.mo62611a((C11169e) this.f25610b);
                } else if (l == 18) {
                    if (this.f25611c == null) {
                        this.f25611c = new C10719m();
                    }
                    aVar.mo62611a((C11169e) this.f25611c);
                } else if (l == 26) {
                    if (this.f25612d == null) {
                        this.f25612d = new C10710e();
                    }
                    aVar.mo62611a((C11169e) this.f25612d);
                } else if (l == 34) {
                    if (this.f25613e == null) {
                        this.f25613e = new C10716j();
                    }
                    aVar.mo62611a((C11169e) this.f25613e);
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$n */
    public static final class C10720n extends C11169e {

        /* renamed from: b */
        public byte[] f25645b;

        /* renamed from: c */
        public C10709d f25646c;

        /* renamed from: d */
        public byte[] f25647d;

        /* renamed from: e */
        public C10714i f25648e;

        public C10720n() {
            mo62145b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            byte[] bArr = this.f25645b;
            byte[] bArr2 = C11256g.f26930d;
            if (!Arrays.equals(bArr, bArr2)) {
                bVar.mo62668b(1, this.f25645b);
            }
            C10709d dVar = this.f25646c;
            if (dVar != null) {
                bVar.mo62665b(2, (C11169e) dVar);
            }
            if (!Arrays.equals(this.f25647d, bArr2)) {
                bVar.mo62668b(3, this.f25647d);
            }
            C10714i iVar = this.f25648e;
            if (iVar != null) {
                bVar.mo62665b(4, (C11169e) iVar);
            }
        }

        /* renamed from: b */
        public C10720n mo62145b() {
            byte[] bArr = C11256g.f26930d;
            this.f25645b = bArr;
            this.f25646c = null;
            this.f25647d = bArr;
            this.f25648e = null;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            byte[] bArr = this.f25645b;
            byte[] bArr2 = C11256g.f26930d;
            int i = 0;
            if (!Arrays.equals(bArr, bArr2)) {
                i = 0 + C11056b.m28526a(1, this.f25645b);
            }
            C10709d dVar = this.f25646c;
            if (dVar != null) {
                i += C11056b.m28523a(2, (C11169e) dVar);
            }
            if (!Arrays.equals(this.f25647d, bArr2)) {
                i += C11056b.m28526a(3, this.f25647d);
            }
            C10714i iVar = this.f25648e;
            return iVar != null ? i + C11056b.m28523a(4, (C11169e) iVar) : i;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    this.f25645b = aVar.mo62616d();
                } else if (l == 18) {
                    if (this.f25646c == null) {
                        this.f25646c = new C10709d();
                    }
                    aVar.mo62611a((C11169e) this.f25646c);
                } else if (l == 26) {
                    this.f25647d = aVar.mo62616d();
                } else if (l == 34) {
                    if (this.f25648e == null) {
                        this.f25648e = new C10714i();
                    }
                    aVar.mo62611a((C11169e) this.f25648e);
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
        int i = this.f25600b;
        int i2 = 0;
        if (i != 0) {
            i2 = 0 + C11056b.m28521a(1, i);
        }
        C10723q qVar = this.f25601c;
        if (qVar != null) {
            i2 += C11056b.m28523a(2, (C11169e) qVar);
        }
        C10721o oVar = this.f25602d;
        if (oVar != null) {
            i2 += C11056b.m28523a(3, (C11169e) oVar);
        }
        C10722p pVar = this.f25603e;
        if (pVar != null) {
            i2 += C11056b.m28523a(4, (C11169e) pVar);
        }
        C10707b bVar = this.f25604f;
        if (bVar != null) {
            i2 += C11056b.m28523a(5, (C11169e) bVar);
        }
        C10713h hVar = this.f25605g;
        return hVar != null ? i2 + C11056b.m28523a(6, (C11169e) hVar) : i2;
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$f */
    public static final class C10711f extends C11169e {

        /* renamed from: b */
        public byte[] f25617b;

        /* renamed from: c */
        public byte[] f25618c;

        /* renamed from: d */
        public C10714i f25619d;

        /* renamed from: e */
        public C10712g[] f25620e;

        /* renamed from: f */
        public int f25621f;

        public C10711f() {
            mo62136b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            byte[] bArr = this.f25617b;
            byte[] bArr2 = C11256g.f26930d;
            if (!Arrays.equals(bArr, bArr2)) {
                bVar.mo62668b(1, this.f25617b);
            }
            if (!Arrays.equals(this.f25618c, bArr2)) {
                bVar.mo62668b(2, this.f25618c);
            }
            C10714i iVar = this.f25619d;
            if (iVar != null) {
                bVar.mo62665b(3, (C11169e) iVar);
            }
            C10712g[] gVarArr = this.f25620e;
            if (gVarArr != null && gVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C10712g[] gVarArr2 = this.f25620e;
                    if (i >= gVarArr2.length) {
                        break;
                    }
                    C10712g gVar = gVarArr2[i];
                    if (gVar != null) {
                        bVar.mo62665b(4, (C11169e) gVar);
                    }
                    i++;
                }
            }
            int i2 = this.f25621f;
            if (i2 != 0) {
                bVar.mo62677f(5, i2);
            }
        }

        /* renamed from: b */
        public C10711f mo62136b() {
            byte[] bArr = C11256g.f26930d;
            this.f25617b = bArr;
            this.f25618c = bArr;
            this.f25619d = null;
            this.f25620e = C10712g.m27531c();
            this.f25621f = 0;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            byte[] bArr = this.f25617b;
            byte[] bArr2 = C11256g.f26930d;
            int i = 0;
            int a = !Arrays.equals(bArr, bArr2) ? C11056b.m28526a(1, this.f25617b) + 0 : 0;
            if (!Arrays.equals(this.f25618c, bArr2)) {
                a += C11056b.m28526a(2, this.f25618c);
            }
            C10714i iVar = this.f25619d;
            if (iVar != null) {
                a += C11056b.m28523a(3, (C11169e) iVar);
            }
            C10712g[] gVarArr = this.f25620e;
            if (gVarArr != null && gVarArr.length > 0) {
                while (true) {
                    C10712g[] gVarArr2 = this.f25620e;
                    if (i >= gVarArr2.length) {
                        break;
                    }
                    C10712g gVar = gVarArr2[i];
                    if (gVar != null) {
                        a += C11056b.m28523a(4, (C11169e) gVar);
                    }
                    i++;
                }
            }
            int i2 = this.f25621f;
            return i2 != 0 ? a + C11056b.m28535c(5, i2) : a;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    this.f25617b = aVar.mo62616d();
                } else if (l == 18) {
                    this.f25618c = aVar.mo62616d();
                } else if (l == 26) {
                    if (this.f25619d == null) {
                        this.f25619d = new C10714i();
                    }
                    aVar.mo62611a((C11169e) this.f25619d);
                } else if (l == 34) {
                    int a = C11256g.m29012a(aVar, 34);
                    C10712g[] gVarArr = this.f25620e;
                    int length = gVarArr == null ? 0 : gVarArr.length;
                    int i = a + length;
                    C10712g[] gVarArr2 = new C10712g[i];
                    if (length != 0) {
                        System.arraycopy(gVarArr, 0, gVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        gVarArr2[length] = new C10712g();
                        aVar.mo62611a((C11169e) gVarArr2[length]);
                        aVar.mo62628l();
                        length++;
                    }
                    gVarArr2[length] = new C10712g();
                    aVar.mo62611a((C11169e) gVarArr2[length]);
                    this.f25620e = gVarArr2;
                } else if (l == 40) {
                    this.f25621f = aVar.mo62624h();
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$k */
    public static final class C10717k extends C11169e {

        /* renamed from: b */
        public byte[] f25633b;

        /* renamed from: c */
        public byte[] f25634c;

        /* renamed from: d */
        public C10709d f25635d;

        /* renamed from: e */
        public C10714i f25636e;

        /* renamed from: f */
        public C10716j f25637f;

        /* renamed from: g */
        public C10716j f25638g;

        /* renamed from: h */
        public C10718l[] f25639h;

        public C10717k() {
            mo62142b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            byte[] bArr = this.f25633b;
            byte[] bArr2 = C11256g.f26930d;
            if (!Arrays.equals(bArr, bArr2)) {
                bVar.mo62668b(1, this.f25633b);
            }
            if (!Arrays.equals(this.f25634c, bArr2)) {
                bVar.mo62668b(2, this.f25634c);
            }
            C10709d dVar = this.f25635d;
            if (dVar != null) {
                bVar.mo62665b(3, (C11169e) dVar);
            }
            C10714i iVar = this.f25636e;
            if (iVar != null) {
                bVar.mo62665b(4, (C11169e) iVar);
            }
            C10716j jVar = this.f25637f;
            if (jVar != null) {
                bVar.mo62665b(5, (C11169e) jVar);
            }
            C10716j jVar2 = this.f25638g;
            if (jVar2 != null) {
                bVar.mo62665b(6, (C11169e) jVar2);
            }
            C10718l[] lVarArr = this.f25639h;
            if (lVarArr != null && lVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C10718l[] lVarArr2 = this.f25639h;
                    if (i < lVarArr2.length) {
                        C10718l lVar = lVarArr2[i];
                        if (lVar != null) {
                            bVar.mo62665b(7, (C11169e) lVar);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public C10717k mo62142b() {
            byte[] bArr = C11256g.f26930d;
            this.f25633b = bArr;
            this.f25634c = bArr;
            this.f25635d = null;
            this.f25636e = null;
            this.f25637f = null;
            this.f25638g = null;
            this.f25639h = C10718l.m27557c();
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            byte[] bArr = this.f25633b;
            byte[] bArr2 = C11256g.f26930d;
            int i = 0;
            int a = !Arrays.equals(bArr, bArr2) ? C11056b.m28526a(1, this.f25633b) + 0 : 0;
            if (!Arrays.equals(this.f25634c, bArr2)) {
                a += C11056b.m28526a(2, this.f25634c);
            }
            C10709d dVar = this.f25635d;
            if (dVar != null) {
                a += C11056b.m28523a(3, (C11169e) dVar);
            }
            C10714i iVar = this.f25636e;
            if (iVar != null) {
                a += C11056b.m28523a(4, (C11169e) iVar);
            }
            C10716j jVar = this.f25637f;
            if (jVar != null) {
                a += C11056b.m28523a(5, (C11169e) jVar);
            }
            C10716j jVar2 = this.f25638g;
            if (jVar2 != null) {
                a += C11056b.m28523a(6, (C11169e) jVar2);
            }
            C10718l[] lVarArr = this.f25639h;
            if (lVarArr != null && lVarArr.length > 0) {
                while (true) {
                    C10718l[] lVarArr2 = this.f25639h;
                    if (i >= lVarArr2.length) {
                        break;
                    }
                    C10718l lVar = lVarArr2[i];
                    if (lVar != null) {
                        a += C11056b.m28523a(7, (C11169e) lVar);
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
                    this.f25633b = aVar.mo62616d();
                } else if (l == 18) {
                    this.f25634c = aVar.mo62616d();
                } else if (l == 26) {
                    if (this.f25635d == null) {
                        this.f25635d = new C10709d();
                    }
                    aVar.mo62611a((C11169e) this.f25635d);
                } else if (l == 34) {
                    if (this.f25636e == null) {
                        this.f25636e = new C10714i();
                    }
                    aVar.mo62611a((C11169e) this.f25636e);
                } else if (l == 42) {
                    if (this.f25637f == null) {
                        this.f25637f = new C10716j();
                    }
                    aVar.mo62611a((C11169e) this.f25637f);
                } else if (l == 50) {
                    if (this.f25638g == null) {
                        this.f25638g = new C10716j();
                    }
                    aVar.mo62611a((C11169e) this.f25638g);
                } else if (l == 58) {
                    int a = C11256g.m29012a(aVar, 58);
                    C10718l[] lVarArr = this.f25639h;
                    int length = lVarArr == null ? 0 : lVarArr.length;
                    int i = a + length;
                    C10718l[] lVarArr2 = new C10718l[i];
                    if (length != 0) {
                        System.arraycopy(lVarArr, 0, lVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        lVarArr2[length] = new C10718l();
                        aVar.mo62611a((C11169e) lVarArr2[length]);
                        aVar.mo62628l();
                        length++;
                    }
                    lVarArr2[length] = new C10718l();
                    aVar.mo62611a((C11169e) lVarArr2[length]);
                    this.f25639h = lVarArr2;
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
            if (l != 0) {
                if (l == 8) {
                    int h = aVar.mo62624h();
                    switch (h) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f25600b = h;
                            break;
                    }
                } else if (l == 18) {
                    if (this.f25601c == null) {
                        this.f25601c = new C10723q();
                    }
                    aVar.mo62611a((C11169e) this.f25601c);
                } else if (l == 26) {
                    if (this.f25602d == null) {
                        this.f25602d = new C10721o();
                    }
                    aVar.mo62611a((C11169e) this.f25602d);
                } else if (l == 34) {
                    if (this.f25603e == null) {
                        this.f25603e = new C10722p();
                    }
                    aVar.mo62611a((C11169e) this.f25603e);
                } else if (l == 42) {
                    if (this.f25604f == null) {
                        this.f25604f = new C10707b();
                    }
                    aVar.mo62611a((C11169e) this.f25604f);
                } else if (l == 50) {
                    if (this.f25605g == null) {
                        this.f25605g = new C10713h();
                    }
                    aVar.mo62611a((C11169e) this.f25605g);
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            } else {
                break;
            }
        }
        return this;
    }
}
