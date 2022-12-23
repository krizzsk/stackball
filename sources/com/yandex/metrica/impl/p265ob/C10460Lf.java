package com.yandex.metrica.impl.p265ob;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.Lf */
public final class C10460Lf extends C11169e {

    /* renamed from: l */
    private static byte[] f25114l;

    /* renamed from: m */
    private static volatile boolean f25115m;

    /* renamed from: b */
    public C10671Qf f25116b;

    /* renamed from: c */
    public C10370If f25117c;

    /* renamed from: d */
    public String f25118d;

    /* renamed from: e */
    public int f25119e;

    /* renamed from: f */
    public C10605Of[] f25120f;

    /* renamed from: g */
    public int f25121g;

    /* renamed from: h */
    public C10461a f25122h;

    /* renamed from: i */
    public byte[] f25123i;

    /* renamed from: j */
    public byte[] f25124j;

    /* renamed from: k */
    public C10431Kf[] f25125k;

    public C10460Lf() {
        if (!f25115m) {
            synchronized (C11095c.f26635a) {
                if (!f25115m) {
                    f25114l = C11095c.m28614a("JVM");
                    f25115m = true;
                }
            }
        }
        mo61733b();
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        C10671Qf qf = this.f25116b;
        if (qf != null) {
            bVar.mo62665b(1, (C11169e) qf);
        }
        C10370If ifR = this.f25117c;
        if (ifR != null) {
            bVar.mo62665b(2, (C11169e) ifR);
        }
        if (!this.f25118d.equals("")) {
            bVar.mo62666b(3, this.f25118d);
        }
        int i = this.f25119e;
        if (i != -1) {
            bVar.mo62672d(4, i);
        }
        C10605Of[] ofArr = this.f25120f;
        int i2 = 0;
        if (ofArr != null && ofArr.length > 0) {
            int i3 = 0;
            while (true) {
                C10605Of[] ofArr2 = this.f25120f;
                if (i3 >= ofArr2.length) {
                    break;
                }
                C10605Of of = ofArr2[i3];
                if (of != null) {
                    bVar.mo62665b(5, (C11169e) of);
                }
                i3++;
            }
        }
        int i4 = this.f25121g;
        if (i4 != 0) {
            bVar.mo62672d(6, i4);
        }
        C10461a aVar = this.f25122h;
        if (aVar != null) {
            bVar.mo62665b(7, (C11169e) aVar);
        }
        if (!Arrays.equals(this.f25123i, f25114l)) {
            bVar.mo62668b(8, this.f25123i);
        }
        if (!Arrays.equals(this.f25124j, C11256g.f26930d)) {
            bVar.mo62668b(9, this.f25124j);
        }
        C10431Kf[] kfArr = this.f25125k;
        if (kfArr != null && kfArr.length > 0) {
            while (true) {
                C10431Kf[] kfArr2 = this.f25125k;
                if (i2 < kfArr2.length) {
                    C10431Kf kf = kfArr2[i2];
                    if (kf != null) {
                        bVar.mo62665b(10, (C11169e) kf);
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public C10460Lf mo61733b() {
        this.f25116b = null;
        this.f25117c = null;
        this.f25118d = "";
        this.f25119e = -1;
        this.f25120f = C10605Of.m27129c();
        this.f25121g = 0;
        this.f25122h = null;
        this.f25123i = (byte[]) f25114l.clone();
        this.f25124j = C11256g.f26930d;
        this.f25125k = C10431Kf.m26746c();
        this.f26754a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.Lf$a */
    public static final class C10461a extends C11169e {

        /* renamed from: b */
        public byte[] f25126b;

        /* renamed from: c */
        public C10550Nf f25127c;

        public C10461a() {
            mo61734b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            if (!Arrays.equals(this.f25126b, C11256g.f26930d)) {
                bVar.mo62668b(1, this.f25126b);
            }
            C10550Nf nf = this.f25127c;
            if (nf != null) {
                bVar.mo62665b(2, (C11169e) nf);
            }
        }

        /* renamed from: b */
        public C10461a mo61734b() {
            this.f25126b = C11256g.f26930d;
            this.f25127c = null;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            int i = 0;
            if (!Arrays.equals(this.f25126b, C11256g.f26930d)) {
                i = 0 + C11056b.m28526a(1, this.f25126b);
            }
            C10550Nf nf = this.f25127c;
            return nf != null ? i + C11056b.m28523a(2, (C11169e) nf) : i;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    this.f25126b = aVar.mo62616d();
                } else if (l == 18) {
                    if (this.f25127c == null) {
                        this.f25127c = new C10550Nf();
                    }
                    aVar.mo62611a((C11169e) this.f25127c);
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
        C10671Qf qf = this.f25116b;
        int i = 0;
        int a = qf != null ? C11056b.m28523a(1, (C11169e) qf) + 0 : 0;
        C10370If ifR = this.f25117c;
        if (ifR != null) {
            a += C11056b.m28523a(2, (C11169e) ifR);
        }
        if (!this.f25118d.equals("")) {
            a += C11056b.m28524a(3, this.f25118d);
        }
        int i2 = this.f25119e;
        if (i2 != -1) {
            a += C11056b.m28521a(4, i2);
        }
        C10605Of[] ofArr = this.f25120f;
        if (ofArr != null && ofArr.length > 0) {
            int i3 = 0;
            while (true) {
                C10605Of[] ofArr2 = this.f25120f;
                if (i3 >= ofArr2.length) {
                    break;
                }
                C10605Of of = ofArr2[i3];
                if (of != null) {
                    a += C11056b.m28523a(5, (C11169e) of);
                }
                i3++;
            }
        }
        int i4 = this.f25121g;
        if (i4 != 0) {
            a += C11056b.m28521a(6, i4);
        }
        C10461a aVar = this.f25122h;
        if (aVar != null) {
            a += C11056b.m28523a(7, (C11169e) aVar);
        }
        if (!Arrays.equals(this.f25123i, f25114l)) {
            a += C11056b.m28526a(8, this.f25123i);
        }
        if (!Arrays.equals(this.f25124j, C11256g.f26930d)) {
            a += C11056b.m28526a(9, this.f25124j);
        }
        C10431Kf[] kfArr = this.f25125k;
        if (kfArr != null && kfArr.length > 0) {
            while (true) {
                C10431Kf[] kfArr2 = this.f25125k;
                if (i >= kfArr2.length) {
                    break;
                }
                C10431Kf kf = kfArr2[i];
                if (kf != null) {
                    a += C11056b.m28523a(10, (C11169e) kf);
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
            switch (l) {
                case 0:
                    break;
                case 10:
                    if (this.f25116b == null) {
                        this.f25116b = new C10671Qf();
                    }
                    aVar.mo62611a((C11169e) this.f25116b);
                    continue;
                case 18:
                    if (this.f25117c == null) {
                        this.f25117c = new C10370If();
                    }
                    aVar.mo62611a((C11169e) this.f25117c);
                    continue;
                case 26:
                    this.f25118d = aVar.mo62627k();
                    continue;
                case 32:
                    int h = aVar.mo62624h();
                    if (h == -1 || h == 0 || h == 1) {
                        this.f25119e = h;
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    int a = C11256g.m29012a(aVar, 42);
                    C10605Of[] ofArr = this.f25120f;
                    int length = ofArr == null ? 0 : ofArr.length;
                    int i = a + length;
                    C10605Of[] ofArr2 = new C10605Of[i];
                    if (length != 0) {
                        System.arraycopy(ofArr, 0, ofArr2, 0, length);
                    }
                    while (length < i - 1) {
                        ofArr2[length] = new C10605Of();
                        aVar.mo62611a((C11169e) ofArr2[length]);
                        aVar.mo62628l();
                        length++;
                    }
                    ofArr2[length] = new C10605Of();
                    aVar.mo62611a((C11169e) ofArr2[length]);
                    this.f25120f = ofArr2;
                    continue;
                case 48:
                    int h2 = aVar.mo62624h();
                    if (h2 == 0 || h2 == 1) {
                        this.f25121g = h2;
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (this.f25122h == null) {
                        this.f25122h = new C10461a();
                    }
                    aVar.mo62611a((C11169e) this.f25122h);
                    continue;
                case 66:
                    this.f25123i = aVar.mo62616d();
                    continue;
                case 74:
                    this.f25124j = aVar.mo62616d();
                    continue;
                case 82:
                    int a2 = C11256g.m29012a(aVar, 82);
                    C10431Kf[] kfArr = this.f25125k;
                    int length2 = kfArr == null ? 0 : kfArr.length;
                    int i2 = a2 + length2;
                    C10431Kf[] kfArr2 = new C10431Kf[i2];
                    if (length2 != 0) {
                        System.arraycopy(kfArr, 0, kfArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        kfArr2[length2] = new C10431Kf();
                        aVar.mo62611a((C11169e) kfArr2[length2]);
                        aVar.mo62628l();
                        length2++;
                    }
                    kfArr2[length2] = new C10431Kf();
                    aVar.mo62611a((C11169e) kfArr2[length2]);
                    this.f25125k = kfArr2;
                    continue;
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
