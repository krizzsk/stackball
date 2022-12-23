package com.yandex.metrica.impl.p265ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.eg */
public final class C11209eg extends C11169e {

    /* renamed from: b */
    public boolean f26832b;

    /* renamed from: c */
    public int f26833c;

    /* renamed from: d */
    public int f26834d;

    /* renamed from: e */
    public int[] f26835e;

    public C11209eg() {
        mo62832b();
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        bVar.mo62667b(1, this.f26832b);
        bVar.mo62677f(2, this.f26833c);
        bVar.mo62677f(3, this.f26834d);
        int[] iArr = this.f26835e;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.f26835e;
                if (i < iArr2.length) {
                    bVar.mo62672d(4, iArr2[i]);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public C11209eg mo62832b() {
        this.f26832b = false;
        this.f26833c = 0;
        this.f26834d = 0;
        this.f26835e = C11256g.f26927a;
        this.f26754a = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo61538a() {
        int i = 0;
        int a = C11056b.m28525a(1, this.f26832b) + 0 + C11056b.m28535c(2, this.f26833c) + C11056b.m28535c(3, this.f26834d);
        int[] iArr = this.f26835e;
        if (iArr == null || iArr.length <= 0) {
            return a;
        }
        int i2 = 0;
        while (true) {
            int[] iArr2 = this.f26835e;
            if (i >= iArr2.length) {
                return a + i2 + (iArr2.length * 1);
            }
            i2 += C11056b.m28519a(iArr2[i]);
            i++;
        }
    }

    /* renamed from: a */
    public C11169e mo61539a(C11009a aVar) throws IOException {
        while (true) {
            int l = aVar.mo62628l();
            if (l == 0) {
                break;
            } else if (l == 8) {
                this.f26832b = aVar.mo62615c();
            } else if (l == 16) {
                this.f26833c = aVar.mo62624h();
            } else if (l == 24) {
                this.f26834d = aVar.mo62624h();
            } else if (l == 32) {
                int a = C11256g.m29012a(aVar, 32);
                int[] iArr = this.f26835e;
                int length = iArr == null ? 0 : iArr.length;
                int i = a + length;
                int[] iArr2 = new int[i];
                if (length != 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                }
                while (length < i - 1) {
                    iArr2[length] = aVar.mo62624h();
                    aVar.mo62628l();
                    length++;
                }
                iArr2[length] = aVar.mo62624h();
                this.f26835e = iArr2;
            } else if (l == 34) {
                int c = aVar.mo62614c(aVar.mo62624h());
                int b = aVar.mo62612b();
                int i2 = 0;
                while (aVar.mo62609a() > 0) {
                    aVar.mo62624h();
                    i2++;
                }
                aVar.mo62619e(b);
                int[] iArr3 = this.f26835e;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int i3 = i2 + length2;
                int[] iArr4 = new int[i3];
                if (length2 != 0) {
                    System.arraycopy(iArr3, 0, iArr4, 0, length2);
                }
                while (length2 < i3) {
                    iArr4[length2] = aVar.mo62624h();
                    length2++;
                }
                this.f26835e = iArr4;
                aVar.mo62613b(c);
            } else if (!aVar.mo62621f(l)) {
                break;
            }
        }
        return this;
    }
}
