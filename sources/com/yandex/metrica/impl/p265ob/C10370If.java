package com.yandex.metrica.impl.p265ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.If */
public final class C10370If extends C11169e {

    /* renamed from: b */
    public C10641Pf f24901b;

    /* renamed from: c */
    public C10641Pf[] f24902c;

    /* renamed from: d */
    public String f24903d;

    public C10370If() {
        mo61541b();
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        C10641Pf pf = this.f24901b;
        if (pf != null) {
            bVar.mo62665b(1, (C11169e) pf);
        }
        C10641Pf[] pfArr = this.f24902c;
        if (pfArr != null && pfArr.length > 0) {
            int i = 0;
            while (true) {
                C10641Pf[] pfArr2 = this.f24902c;
                if (i >= pfArr2.length) {
                    break;
                }
                C10641Pf pf2 = pfArr2[i];
                if (pf2 != null) {
                    bVar.mo62665b(2, (C11169e) pf2);
                }
                i++;
            }
        }
        if (!this.f24903d.equals("")) {
            bVar.mo62666b(3, this.f24903d);
        }
    }

    /* renamed from: b */
    public C10370If mo61541b() {
        this.f24901b = null;
        this.f24902c = C10641Pf.m27237c();
        this.f24903d = "";
        this.f26754a = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo61538a() {
        C10641Pf pf = this.f24901b;
        int i = 0;
        int a = pf != null ? C11056b.m28523a(1, (C11169e) pf) + 0 : 0;
        C10641Pf[] pfArr = this.f24902c;
        if (pfArr != null && pfArr.length > 0) {
            while (true) {
                C10641Pf[] pfArr2 = this.f24902c;
                if (i >= pfArr2.length) {
                    break;
                }
                C10641Pf pf2 = pfArr2[i];
                if (pf2 != null) {
                    a += C11056b.m28523a(2, (C11169e) pf2);
                }
                i++;
            }
        }
        return !this.f24903d.equals("") ? a + C11056b.m28524a(3, this.f24903d) : a;
    }

    /* renamed from: a */
    public C11169e mo61539a(C11009a aVar) throws IOException {
        while (true) {
            int l = aVar.mo62628l();
            if (l == 0) {
                break;
            } else if (l == 10) {
                if (this.f24901b == null) {
                    this.f24901b = new C10641Pf();
                }
                aVar.mo62611a((C11169e) this.f24901b);
            } else if (l == 18) {
                int a = C11256g.m29012a(aVar, 18);
                C10641Pf[] pfArr = this.f24902c;
                int length = pfArr == null ? 0 : pfArr.length;
                int i = a + length;
                C10641Pf[] pfArr2 = new C10641Pf[i];
                if (length != 0) {
                    System.arraycopy(pfArr, 0, pfArr2, 0, length);
                }
                while (length < i - 1) {
                    pfArr2[length] = new C10641Pf();
                    aVar.mo62611a((C11169e) pfArr2[length]);
                    aVar.mo62628l();
                    length++;
                }
                pfArr2[length] = new C10641Pf();
                aVar.mo62611a((C11169e) pfArr2[length]);
                this.f24902c = pfArr2;
            } else if (l == 26) {
                this.f24903d = aVar.mo62627k();
            } else if (!aVar.mo62621f(l)) {
                break;
            }
        }
        return this;
    }
}
