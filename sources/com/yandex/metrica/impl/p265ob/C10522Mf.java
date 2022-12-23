package com.yandex.metrica.impl.p265ob;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.Mf */
public final class C10522Mf extends C11169e {

    /* renamed from: m */
    private static byte[] f25208m;

    /* renamed from: n */
    private static volatile boolean f25209n;

    /* renamed from: b */
    public C10671Qf f25210b;

    /* renamed from: c */
    public C10370If f25211c;

    /* renamed from: d */
    public String f25212d;

    /* renamed from: e */
    public int f25213e;

    /* renamed from: f */
    public C10605Of[] f25214f;

    /* renamed from: g */
    public String f25215g;

    /* renamed from: h */
    public int f25216h;

    /* renamed from: i */
    public C10523a f25217i;

    /* renamed from: j */
    public byte[] f25218j;

    /* renamed from: k */
    public byte[] f25219k;

    /* renamed from: l */
    public C10431Kf[] f25220l;

    /* renamed from: com.yandex.metrica.impl.ob.Mf$a */
    public static final class C10523a extends C11169e {

        /* renamed from: b */
        public String f25221b;

        public C10523a() {
            mo61800b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62666b(1, this.f25221b);
        }

        /* renamed from: b */
        public C10523a mo61800b() {
            this.f25221b = "";
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            return C11056b.m28524a(1, this.f25221b) + 0;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    this.f25221b = aVar.mo62627k();
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    public C10522Mf() {
        if (!f25209n) {
            synchronized (C11095c.f26635a) {
                if (!f25209n) {
                    f25208m = C11095c.m28614a("JVM");
                    f25209n = true;
                }
            }
        }
        mo61799b();
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        C10671Qf qf = this.f25210b;
        if (qf != null) {
            bVar.mo62665b(1, (C11169e) qf);
        }
        C10370If ifR = this.f25211c;
        if (ifR != null) {
            bVar.mo62665b(2, (C11169e) ifR);
        }
        if (!this.f25212d.equals("")) {
            bVar.mo62666b(3, this.f25212d);
        }
        int i = this.f25213e;
        if (i != -1) {
            bVar.mo62672d(4, i);
        }
        C10605Of[] ofArr = this.f25214f;
        int i2 = 0;
        if (ofArr != null && ofArr.length > 0) {
            int i3 = 0;
            while (true) {
                C10605Of[] ofArr2 = this.f25214f;
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
        if (!this.f25215g.equals("")) {
            bVar.mo62666b(6, this.f25215g);
        }
        int i4 = this.f25216h;
        if (i4 != 0) {
            bVar.mo62672d(7, i4);
        }
        C10523a aVar = this.f25217i;
        if (aVar != null) {
            bVar.mo62665b(8, (C11169e) aVar);
        }
        if (!Arrays.equals(this.f25218j, f25208m)) {
            bVar.mo62668b(9, this.f25218j);
        }
        if (!Arrays.equals(this.f25219k, C11256g.f26930d)) {
            bVar.mo62668b(10, this.f25219k);
        }
        C10431Kf[] kfArr = this.f25220l;
        if (kfArr != null && kfArr.length > 0) {
            while (true) {
                C10431Kf[] kfArr2 = this.f25220l;
                if (i2 < kfArr2.length) {
                    C10431Kf kf = kfArr2[i2];
                    if (kf != null) {
                        bVar.mo62665b(11, (C11169e) kf);
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public C10522Mf mo61799b() {
        this.f25210b = null;
        this.f25211c = null;
        this.f25212d = "";
        this.f25213e = -1;
        this.f25214f = C10605Of.m27129c();
        this.f25215g = "";
        this.f25216h = 0;
        this.f25217i = null;
        this.f25218j = (byte[]) f25208m.clone();
        this.f25219k = C11256g.f26930d;
        this.f25220l = C10431Kf.m26746c();
        this.f26754a = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo61538a() {
        C10671Qf qf = this.f25210b;
        int i = 0;
        int a = qf != null ? C11056b.m28523a(1, (C11169e) qf) + 0 : 0;
        C10370If ifR = this.f25211c;
        if (ifR != null) {
            a += C11056b.m28523a(2, (C11169e) ifR);
        }
        if (!this.f25212d.equals("")) {
            a += C11056b.m28524a(3, this.f25212d);
        }
        int i2 = this.f25213e;
        if (i2 != -1) {
            a += C11056b.m28521a(4, i2);
        }
        C10605Of[] ofArr = this.f25214f;
        if (ofArr != null && ofArr.length > 0) {
            int i3 = 0;
            while (true) {
                C10605Of[] ofArr2 = this.f25214f;
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
        if (!this.f25215g.equals("")) {
            a += C11056b.m28524a(6, this.f25215g);
        }
        int i4 = this.f25216h;
        if (i4 != 0) {
            a += C11056b.m28521a(7, i4);
        }
        C10523a aVar = this.f25217i;
        if (aVar != null) {
            a += C11056b.m28523a(8, (C11169e) aVar);
        }
        if (!Arrays.equals(this.f25218j, f25208m)) {
            a += C11056b.m28526a(9, this.f25218j);
        }
        if (!Arrays.equals(this.f25219k, C11256g.f26930d)) {
            a += C11056b.m28526a(10, this.f25219k);
        }
        C10431Kf[] kfArr = this.f25220l;
        if (kfArr != null && kfArr.length > 0) {
            while (true) {
                C10431Kf[] kfArr2 = this.f25220l;
                if (i >= kfArr2.length) {
                    break;
                }
                C10431Kf kf = kfArr2[i];
                if (kf != null) {
                    a += C11056b.m28523a(11, (C11169e) kf);
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
                    if (this.f25210b == null) {
                        this.f25210b = new C10671Qf();
                    }
                    aVar.mo62611a((C11169e) this.f25210b);
                    continue;
                case 18:
                    if (this.f25211c == null) {
                        this.f25211c = new C10370If();
                    }
                    aVar.mo62611a((C11169e) this.f25211c);
                    continue;
                case 26:
                    this.f25212d = aVar.mo62627k();
                    continue;
                case 32:
                    int h = aVar.mo62624h();
                    if (h == -1 || h == 0 || h == 1) {
                        this.f25213e = h;
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    int a = C11256g.m29012a(aVar, 42);
                    C10605Of[] ofArr = this.f25214f;
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
                    this.f25214f = ofArr2;
                    continue;
                case 50:
                    this.f25215g = aVar.mo62627k();
                    continue;
                case 56:
                    int h2 = aVar.mo62624h();
                    if (h2 == 0 || h2 == 1) {
                        this.f25216h = h2;
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (this.f25217i == null) {
                        this.f25217i = new C10523a();
                    }
                    aVar.mo62611a((C11169e) this.f25217i);
                    continue;
                case 74:
                    this.f25218j = aVar.mo62616d();
                    continue;
                case 82:
                    this.f25219k = aVar.mo62616d();
                    continue;
                case 90:
                    int a2 = C11256g.m29012a(aVar, 90);
                    C10431Kf[] kfArr = this.f25220l;
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
                    this.f25220l = kfArr2;
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
