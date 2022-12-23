package com.yandex.metrica.impl.p265ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Qf */
public final class C10671Qf extends C11169e {

    /* renamed from: g */
    private static volatile C10671Qf[] f25484g;

    /* renamed from: b */
    public String f25485b;

    /* renamed from: c */
    public String f25486c;

    /* renamed from: d */
    public C10605Of[] f25487d;

    /* renamed from: e */
    public C10671Qf f25488e;

    /* renamed from: f */
    public C10671Qf[] f25489f;

    public C10671Qf() {
        mo61984b();
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        bVar.mo62666b(1, this.f25485b);
        if (!this.f25486c.equals("")) {
            bVar.mo62666b(2, this.f25486c);
        }
        C10605Of[] ofArr = this.f25487d;
        int i = 0;
        if (ofArr != null && ofArr.length > 0) {
            int i2 = 0;
            while (true) {
                C10605Of[] ofArr2 = this.f25487d;
                if (i2 >= ofArr2.length) {
                    break;
                }
                C10605Of of = ofArr2[i2];
                if (of != null) {
                    bVar.mo62665b(3, (C11169e) of);
                }
                i2++;
            }
        }
        C10671Qf qf = this.f25488e;
        if (qf != null) {
            bVar.mo62665b(4, (C11169e) qf);
        }
        C10671Qf[] qfArr = this.f25489f;
        if (qfArr != null && qfArr.length > 0) {
            while (true) {
                C10671Qf[] qfArr2 = this.f25489f;
                if (i < qfArr2.length) {
                    C10671Qf qf2 = qfArr2[i];
                    if (qf2 != null) {
                        bVar.mo62665b(5, (C11169e) qf2);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public C10671Qf mo61984b() {
        this.f25485b = "";
        this.f25486c = "";
        this.f25487d = C10605Of.m27129c();
        this.f25488e = null;
        if (f25484g == null) {
            synchronized (C11095c.f26635a) {
                if (f25484g == null) {
                    f25484g = new C10671Qf[0];
                }
            }
        }
        this.f25489f = f25484g;
        this.f26754a = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo61538a() {
        int i = 0;
        int a = C11056b.m28524a(1, this.f25485b) + 0;
        if (!this.f25486c.equals("")) {
            a += C11056b.m28524a(2, this.f25486c);
        }
        C10605Of[] ofArr = this.f25487d;
        if (ofArr != null && ofArr.length > 0) {
            int i2 = 0;
            while (true) {
                C10605Of[] ofArr2 = this.f25487d;
                if (i2 >= ofArr2.length) {
                    break;
                }
                C10605Of of = ofArr2[i2];
                if (of != null) {
                    a += C11056b.m28523a(3, (C11169e) of);
                }
                i2++;
            }
        }
        C10671Qf qf = this.f25488e;
        if (qf != null) {
            a += C11056b.m28523a(4, (C11169e) qf);
        }
        C10671Qf[] qfArr = this.f25489f;
        if (qfArr != null && qfArr.length > 0) {
            while (true) {
                C10671Qf[] qfArr2 = this.f25489f;
                if (i >= qfArr2.length) {
                    break;
                }
                C10671Qf qf2 = qfArr2[i];
                if (qf2 != null) {
                    a += C11056b.m28523a(5, (C11169e) qf2);
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
                this.f25485b = aVar.mo62627k();
            } else if (l == 18) {
                this.f25486c = aVar.mo62627k();
            } else if (l == 26) {
                int a = C11256g.m29012a(aVar, 26);
                C10605Of[] ofArr = this.f25487d;
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
                this.f25487d = ofArr2;
            } else if (l == 34) {
                if (this.f25488e == null) {
                    this.f25488e = new C10671Qf();
                }
                aVar.mo62611a((C11169e) this.f25488e);
            } else if (l == 42) {
                int a2 = C11256g.m29012a(aVar, 42);
                C10671Qf[] qfArr = this.f25489f;
                int length2 = qfArr == null ? 0 : qfArr.length;
                int i2 = a2 + length2;
                C10671Qf[] qfArr2 = new C10671Qf[i2];
                if (length2 != 0) {
                    System.arraycopy(qfArr, 0, qfArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    qfArr2[length2] = new C10671Qf();
                    aVar.mo62611a((C11169e) qfArr2[length2]);
                    aVar.mo62628l();
                    length2++;
                }
                qfArr2[length2] = new C10671Qf();
                aVar.mo62611a((C11169e) qfArr2[length2]);
                this.f25489f = qfArr2;
            } else if (!aVar.mo62621f(l)) {
                break;
            }
        }
        return this;
    }
}
