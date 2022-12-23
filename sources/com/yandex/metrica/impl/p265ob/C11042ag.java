package com.yandex.metrica.impl.p265ob;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.ag */
public final class C11042ag extends C11169e {

    /* renamed from: b */
    public C11043a[] f26522b;

    public C11042ag() {
        mo62646b();
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        C11043a[] aVarArr = this.f26522b;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                C11043a[] aVarArr2 = this.f26522b;
                if (i < aVarArr2.length) {
                    C11043a aVar = aVarArr2[i];
                    if (aVar != null) {
                        bVar.mo62665b(1, (C11169e) aVar);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public C11042ag mo62646b() {
        this.f26522b = C11043a.m28485c();
        this.f26754a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.ag$b */
    public static final class C11044b extends C11169e {

        /* renamed from: b */
        public boolean f26528b;

        /* renamed from: c */
        public boolean f26529c;

        public C11044b() {
            mo62648b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            boolean z = this.f26528b;
            if (z) {
                bVar.mo62667b(1, z);
            }
            boolean z2 = this.f26529c;
            if (z2) {
                bVar.mo62667b(2, z2);
            }
        }

        /* renamed from: b */
        public C11044b mo62648b() {
            this.f26528b = false;
            this.f26529c = false;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            boolean z = this.f26528b;
            int i = 0;
            if (z) {
                i = 0 + C11056b.m28525a(1, z);
            }
            boolean z2 = this.f26529c;
            return z2 ? i + C11056b.m28525a(2, z2) : i;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 8) {
                    this.f26528b = aVar.mo62615c();
                } else if (l == 16) {
                    this.f26529c = aVar.mo62615c();
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
        C11043a[] aVarArr = this.f26522b;
        int i = 0;
        if (aVarArr == null || aVarArr.length <= 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            C11043a[] aVarArr2 = this.f26522b;
            if (i >= aVarArr2.length) {
                return i2;
            }
            C11043a aVar = aVarArr2[i];
            if (aVar != null) {
                i2 += C11056b.m28523a(1, (C11169e) aVar);
            }
            i++;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ag$a */
    public static final class C11043a extends C11169e {

        /* renamed from: f */
        private static volatile C11043a[] f26523f;

        /* renamed from: b */
        public byte[] f26524b;

        /* renamed from: c */
        public int f26525c;

        /* renamed from: d */
        public C11044b f26526d;

        /* renamed from: e */
        public C11045c f26527e;

        public C11043a() {
            mo62647b();
        }

        /* renamed from: c */
        public static C11043a[] m28485c() {
            if (f26523f == null) {
                synchronized (C11095c.f26635a) {
                    if (f26523f == null) {
                        f26523f = new C11043a[0];
                    }
                }
            }
            return f26523f;
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62668b(1, this.f26524b);
            bVar.mo62672d(2, this.f26525c);
            C11044b bVar2 = this.f26526d;
            if (bVar2 != null) {
                bVar.mo62665b(3, (C11169e) bVar2);
            }
            C11045c cVar = this.f26527e;
            if (cVar != null) {
                bVar.mo62665b(4, (C11169e) cVar);
            }
        }

        /* renamed from: b */
        public C11043a mo62647b() {
            this.f26524b = C11256g.f26930d;
            this.f26525c = 0;
            this.f26526d = null;
            this.f26527e = null;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            int a = C11056b.m28526a(1, this.f26524b) + 0 + C11056b.m28521a(2, this.f26525c);
            C11044b bVar = this.f26526d;
            if (bVar != null) {
                a += C11056b.m28523a(3, (C11169e) bVar);
            }
            C11045c cVar = this.f26527e;
            return cVar != null ? a + C11056b.m28523a(4, (C11169e) cVar) : a;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    this.f26524b = aVar.mo62616d();
                } else if (l == 16) {
                    int h = aVar.mo62624h();
                    if (h == 0 || h == 1 || h == 2 || h == 3) {
                        this.f26525c = h;
                    }
                } else if (l == 26) {
                    if (this.f26526d == null) {
                        this.f26526d = new C11044b();
                    }
                    aVar.mo62611a((C11169e) this.f26526d);
                } else if (l == 34) {
                    if (this.f26527e == null) {
                        this.f26527e = new C11045c();
                    }
                    aVar.mo62611a((C11169e) this.f26527e);
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
                C11043a[] aVarArr = this.f26522b;
                int length = aVarArr == null ? 0 : aVarArr.length;
                int i = a + length;
                C11043a[] aVarArr2 = new C11043a[i];
                if (length != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                }
                while (length < i - 1) {
                    aVarArr2[length] = new C11043a();
                    aVar.mo62611a((C11169e) aVarArr2[length]);
                    aVar.mo62628l();
                    length++;
                }
                aVarArr2[length] = new C11043a();
                aVar.mo62611a((C11169e) aVarArr2[length]);
                this.f26522b = aVarArr2;
            } else if (!aVar.mo62621f(l)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.ag$c */
    public static final class C11045c extends C11169e {

        /* renamed from: b */
        public byte[] f26530b;

        /* renamed from: c */
        public double f26531c;

        /* renamed from: d */
        public double f26532d;

        /* renamed from: e */
        public boolean f26533e;

        public C11045c() {
            mo62649b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            if (!Arrays.equals(this.f26530b, C11256g.f26930d)) {
                bVar.mo62668b(1, this.f26530b);
            }
            if (Double.doubleToLongBits(this.f26531c) != Double.doubleToLongBits(0.0d)) {
                bVar.mo62664b(2, this.f26531c);
            }
            if (Double.doubleToLongBits(this.f26532d) != Double.doubleToLongBits(0.0d)) {
                bVar.mo62664b(3, this.f26532d);
            }
            boolean z = this.f26533e;
            if (z) {
                bVar.mo62667b(4, z);
            }
        }

        /* renamed from: b */
        public C11045c mo62649b() {
            this.f26530b = C11256g.f26930d;
            this.f26531c = 0.0d;
            this.f26532d = 0.0d;
            this.f26533e = false;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            int i = 0;
            if (!Arrays.equals(this.f26530b, C11256g.f26930d)) {
                i = 0 + C11056b.m28526a(1, this.f26530b);
            }
            if (Double.doubleToLongBits(this.f26531c) != Double.doubleToLongBits(0.0d)) {
                i += C11056b.m28520a(2, this.f26531c);
            }
            if (Double.doubleToLongBits(this.f26532d) != Double.doubleToLongBits(0.0d)) {
                i += C11056b.m28520a(3, this.f26532d);
            }
            boolean z = this.f26533e;
            return z ? i + C11056b.m28525a(4, z) : i;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    this.f26530b = aVar.mo62616d();
                } else if (l == 17) {
                    this.f26531c = Double.longBitsToDouble(aVar.mo62622g());
                } else if (l == 25) {
                    this.f26532d = Double.longBitsToDouble(aVar.mo62622g());
                } else if (l == 32) {
                    this.f26533e = aVar.mo62615c();
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }
}
