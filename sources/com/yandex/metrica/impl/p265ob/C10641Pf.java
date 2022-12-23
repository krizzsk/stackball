package com.yandex.metrica.impl.p265ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Pf */
public final class C10641Pf extends C11169e {

    /* renamed from: h */
    private static volatile C10641Pf[] f25425h;

    /* renamed from: b */
    public String f25426b;

    /* renamed from: c */
    public int f25427c;

    /* renamed from: d */
    public long f25428d;

    /* renamed from: e */
    public String f25429e;

    /* renamed from: f */
    public int f25430f;

    /* renamed from: g */
    public C10605Of[] f25431g;

    public C10641Pf() {
        mo61926b();
    }

    /* renamed from: c */
    public static C10641Pf[] m27237c() {
        if (f25425h == null) {
            synchronized (C11095c.f26635a) {
                if (f25425h == null) {
                    f25425h = new C10641Pf[0];
                }
            }
        }
        return f25425h;
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        bVar.mo62666b(1, this.f25426b);
        bVar.mo62675e(2, this.f25427c);
        bVar.mo62673d(3, this.f25428d);
        if (!this.f25429e.equals("")) {
            bVar.mo62666b(4, this.f25429e);
        }
        int i = this.f25430f;
        if (i != 0) {
            bVar.mo62677f(5, i);
        }
        C10605Of[] ofArr = this.f25431g;
        if (ofArr != null && ofArr.length > 0) {
            int i2 = 0;
            while (true) {
                C10605Of[] ofArr2 = this.f25431g;
                if (i2 < ofArr2.length) {
                    C10605Of of = ofArr2[i2];
                    if (of != null) {
                        bVar.mo62665b(6, (C11169e) of);
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public C10641Pf mo61926b() {
        this.f25426b = "";
        this.f25427c = 0;
        this.f25428d = 0;
        this.f25429e = "";
        this.f25430f = 0;
        this.f25431g = C10605Of.m27129c();
        this.f26754a = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo61538a() {
        int i = 0;
        int a = C11056b.m28524a(1, this.f25426b) + 0 + C11056b.m28532b(2, this.f25427c);
        long j = this.f25428d;
        int c = a + C11056b.m28534c(3) + C11056b.m28527a((j >> 63) ^ (j << 1));
        if (!this.f25429e.equals("")) {
            c += C11056b.m28524a(4, this.f25429e);
        }
        int i2 = this.f25430f;
        if (i2 != 0) {
            c += C11056b.m28535c(5, i2);
        }
        C10605Of[] ofArr = this.f25431g;
        if (ofArr != null && ofArr.length > 0) {
            while (true) {
                C10605Of[] ofArr2 = this.f25431g;
                if (i >= ofArr2.length) {
                    break;
                }
                C10605Of of = ofArr2[i];
                if (of != null) {
                    c += C11056b.m28523a(6, (C11169e) of);
                }
                i++;
            }
        }
        return c;
    }

    /* renamed from: a */
    public C11169e mo61539a(C11009a aVar) throws IOException {
        while (true) {
            int l = aVar.mo62628l();
            if (l == 0) {
                break;
            } else if (l == 10) {
                this.f25426b = aVar.mo62627k();
            } else if (l == 16) {
                this.f25427c = aVar.mo62626j();
            } else if (l == 24) {
                long i = aVar.mo62625i();
                this.f25428d = (-(i & 1)) ^ (i >>> 1);
            } else if (l == 34) {
                this.f25429e = aVar.mo62627k();
            } else if (l == 40) {
                this.f25430f = aVar.mo62624h();
            } else if (l == 50) {
                int a = C11256g.m29012a(aVar, 50);
                C10605Of[] ofArr = this.f25431g;
                int length = ofArr == null ? 0 : ofArr.length;
                int i2 = a + length;
                C10605Of[] ofArr2 = new C10605Of[i2];
                if (length != 0) {
                    System.arraycopy(ofArr, 0, ofArr2, 0, length);
                }
                while (length < i2 - 1) {
                    ofArr2[length] = new C10605Of();
                    aVar.mo62611a((C11169e) ofArr2[length]);
                    aVar.mo62628l();
                    length++;
                }
                ofArr2[length] = new C10605Of();
                aVar.mo62611a((C11169e) ofArr2[length]);
                this.f25431g = ofArr2;
            } else if (!aVar.mo62621f(l)) {
                break;
            }
        }
        return this;
    }
}
