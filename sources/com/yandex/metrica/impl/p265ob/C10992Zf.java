package com.yandex.metrica.impl.p265ob;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.Zf */
public final class C10992Zf extends C11169e {

    /* renamed from: b */
    public int f26428b;

    /* renamed from: c */
    public double f26429c;

    /* renamed from: d */
    public byte[] f26430d;

    /* renamed from: e */
    public byte[] f26431e;

    /* renamed from: f */
    public byte[] f26432f;

    /* renamed from: g */
    public C10993a f26433g;

    /* renamed from: h */
    public long f26434h;

    /* renamed from: i */
    public boolean f26435i;

    /* renamed from: j */
    public int f26436j;

    /* renamed from: k */
    public int f26437k;

    /* renamed from: l */
    public C10997c f26438l;

    /* renamed from: m */
    public C10994b f26439m;

    public C10992Zf() {
        mo62580b();
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        int i = this.f26428b;
        if (i != 1) {
            bVar.mo62677f(1, i);
        }
        if (Double.doubleToLongBits(this.f26429c) != Double.doubleToLongBits(0.0d)) {
            bVar.mo62664b(2, this.f26429c);
        }
        bVar.mo62668b(3, this.f26430d);
        byte[] bArr = this.f26431e;
        byte[] bArr2 = C11256g.f26930d;
        if (!Arrays.equals(bArr, bArr2)) {
            bVar.mo62668b(4, this.f26431e);
        }
        if (!Arrays.equals(this.f26432f, bArr2)) {
            bVar.mo62668b(5, this.f26432f);
        }
        C10993a aVar = this.f26433g;
        if (aVar != null) {
            bVar.mo62665b(6, (C11169e) aVar);
        }
        long j = this.f26434h;
        if (j != 0) {
            bVar.mo62670c(7, j);
        }
        boolean z = this.f26435i;
        if (z) {
            bVar.mo62667b(8, z);
        }
        int i2 = this.f26436j;
        if (i2 != 0) {
            bVar.mo62672d(9, i2);
        }
        int i3 = this.f26437k;
        if (i3 != 1) {
            bVar.mo62672d(10, i3);
        }
        C10997c cVar = this.f26438l;
        if (cVar != null) {
            bVar.mo62665b(11, (C11169e) cVar);
        }
        C10994b bVar2 = this.f26439m;
        if (bVar2 != null) {
            bVar.mo62665b(12, (C11169e) bVar2);
        }
    }

    /* renamed from: b */
    public C10992Zf mo62580b() {
        this.f26428b = 1;
        this.f26429c = 0.0d;
        byte[] bArr = C11256g.f26930d;
        this.f26430d = bArr;
        this.f26431e = bArr;
        this.f26432f = bArr;
        this.f26433g = null;
        this.f26434h = 0;
        this.f26435i = false;
        this.f26436j = 0;
        this.f26437k = 1;
        this.f26438l = null;
        this.f26439m = null;
        this.f26754a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.Zf$b */
    public static final class C10994b extends C11169e {

        /* renamed from: b */
        public boolean f26442b;

        /* renamed from: c */
        public C10996b f26443c;

        /* renamed from: d */
        public C10995a f26444d;

        public C10994b() {
            mo62582b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            boolean z = this.f26442b;
            if (z) {
                bVar.mo62667b(1, z);
            }
            C10996b bVar2 = this.f26443c;
            if (bVar2 != null) {
                bVar.mo62665b(2, (C11169e) bVar2);
            }
            C10995a aVar = this.f26444d;
            if (aVar != null) {
                bVar.mo62665b(3, (C11169e) aVar);
            }
        }

        /* renamed from: b */
        public C10994b mo62582b() {
            this.f26442b = false;
            this.f26443c = null;
            this.f26444d = null;
            this.f26754a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.Zf$b$b */
        public static final class C10996b extends C11169e {

            /* renamed from: b */
            public int f26449b;

            /* renamed from: c */
            public int f26450c;

            public C10996b() {
                mo62584b();
            }

            /* renamed from: a */
            public void mo61540a(C11056b bVar) throws IOException {
                int i = this.f26449b;
                if (i != 0) {
                    bVar.mo62677f(1, i);
                }
                int i2 = this.f26450c;
                if (i2 != 0) {
                    bVar.mo62672d(2, i2);
                }
            }

            /* renamed from: b */
            public C10996b mo62584b() {
                this.f26449b = 0;
                this.f26450c = 0;
                this.f26754a = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo61538a() {
                int i = this.f26449b;
                int i2 = 0;
                if (i != 0) {
                    i2 = 0 + C11056b.m28535c(1, i);
                }
                int i3 = this.f26450c;
                return i3 != 0 ? i2 + C11056b.m28521a(2, i3) : i2;
            }

            /* renamed from: a */
            public C11169e mo61539a(C11009a aVar) throws IOException {
                while (true) {
                    int l = aVar.mo62628l();
                    if (l == 0) {
                        break;
                    } else if (l == 8) {
                        this.f26449b = aVar.mo62624h();
                    } else if (l == 16) {
                        int h = aVar.mo62624h();
                        if (h == 0 || h == 1 || h == 2 || h == 3 || h == 4) {
                            this.f26450c = h;
                        }
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
            boolean z = this.f26442b;
            int i = 0;
            if (z) {
                i = 0 + C11056b.m28525a(1, z);
            }
            C10996b bVar = this.f26443c;
            if (bVar != null) {
                i += C11056b.m28523a(2, (C11169e) bVar);
            }
            C10995a aVar = this.f26444d;
            return aVar != null ? i + C11056b.m28523a(3, (C11169e) aVar) : i;
        }

        /* renamed from: com.yandex.metrica.impl.ob.Zf$b$a */
        public static final class C10995a extends C11169e {

            /* renamed from: b */
            public long f26445b;

            /* renamed from: c */
            public C10996b f26446c;

            /* renamed from: d */
            public int f26447d;

            /* renamed from: e */
            public byte[] f26448e;

            public C10995a() {
                mo62583b();
            }

            /* renamed from: a */
            public void mo61540a(C11056b bVar) throws IOException {
                long j = this.f26445b;
                if (j != 0) {
                    bVar.mo62670c(1, j);
                }
                C10996b bVar2 = this.f26446c;
                if (bVar2 != null) {
                    bVar.mo62665b(2, (C11169e) bVar2);
                }
                int i = this.f26447d;
                if (i != 0) {
                    bVar.mo62677f(3, i);
                }
                if (!Arrays.equals(this.f26448e, C11256g.f26930d)) {
                    bVar.mo62668b(4, this.f26448e);
                }
            }

            /* renamed from: b */
            public C10995a mo62583b() {
                this.f26445b = 0;
                this.f26446c = null;
                this.f26447d = 0;
                this.f26448e = C11256g.f26930d;
                this.f26754a = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo61538a() {
                long j = this.f26445b;
                int i = 0;
                if (j != 0) {
                    i = 0 + C11056b.m28522a(1, j);
                }
                C10996b bVar = this.f26446c;
                if (bVar != null) {
                    i += C11056b.m28523a(2, (C11169e) bVar);
                }
                int i2 = this.f26447d;
                if (i2 != 0) {
                    i += C11056b.m28535c(3, i2);
                }
                return !Arrays.equals(this.f26448e, C11256g.f26930d) ? i + C11056b.m28526a(4, this.f26448e) : i;
            }

            /* renamed from: a */
            public C11169e mo61539a(C11009a aVar) throws IOException {
                while (true) {
                    int l = aVar.mo62628l();
                    if (l == 0) {
                        break;
                    } else if (l == 8) {
                        this.f26445b = aVar.mo62625i();
                    } else if (l == 18) {
                        if (this.f26446c == null) {
                            this.f26446c = new C10996b();
                        }
                        aVar.mo62611a((C11169e) this.f26446c);
                    } else if (l == 24) {
                        this.f26447d = aVar.mo62624h();
                    } else if (l == 34) {
                        this.f26448e = aVar.mo62616d();
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
                } else if (l == 8) {
                    this.f26442b = aVar.mo62615c();
                } else if (l == 18) {
                    if (this.f26443c == null) {
                        this.f26443c = new C10996b();
                    }
                    aVar.mo62611a((C11169e) this.f26443c);
                } else if (l == 26) {
                    if (this.f26444d == null) {
                        this.f26444d = new C10995a();
                    }
                    aVar.mo62611a((C11169e) this.f26444d);
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Zf$a */
    public static final class C10993a extends C11169e {

        /* renamed from: b */
        public byte[] f26440b;

        /* renamed from: c */
        public byte[] f26441c;

        public C10993a() {
            mo62581b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            byte[] bArr = this.f26440b;
            byte[] bArr2 = C11256g.f26930d;
            if (!Arrays.equals(bArr, bArr2)) {
                bVar.mo62668b(1, this.f26440b);
            }
            if (!Arrays.equals(this.f26441c, bArr2)) {
                bVar.mo62668b(2, this.f26441c);
            }
        }

        /* renamed from: b */
        public C10993a mo62581b() {
            byte[] bArr = C11256g.f26930d;
            this.f26440b = bArr;
            this.f26441c = bArr;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            byte[] bArr = this.f26440b;
            byte[] bArr2 = C11256g.f26930d;
            int i = 0;
            if (!Arrays.equals(bArr, bArr2)) {
                i = 0 + C11056b.m28526a(1, this.f26440b);
            }
            return !Arrays.equals(this.f26441c, bArr2) ? i + C11056b.m28526a(2, this.f26441c) : i;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    this.f26440b = aVar.mo62616d();
                } else if (l == 18) {
                    this.f26441c = aVar.mo62616d();
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Zf$c */
    public static final class C10997c extends C11169e {

        /* renamed from: b */
        public byte[] f26451b;

        /* renamed from: c */
        public long f26452c;

        /* renamed from: d */
        public int f26453d;

        /* renamed from: e */
        public byte[] f26454e;

        /* renamed from: f */
        public long f26455f;

        public C10997c() {
            mo62585b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            byte[] bArr = this.f26451b;
            byte[] bArr2 = C11256g.f26930d;
            if (!Arrays.equals(bArr, bArr2)) {
                bVar.mo62668b(1, this.f26451b);
            }
            long j = this.f26452c;
            if (j != 0) {
                bVar.mo62676e(2, j);
            }
            int i = this.f26453d;
            if (i != 0) {
                bVar.mo62672d(3, i);
            }
            if (!Arrays.equals(this.f26454e, bArr2)) {
                bVar.mo62668b(4, this.f26454e);
            }
            long j2 = this.f26455f;
            if (j2 != 0) {
                bVar.mo62676e(5, j2);
            }
        }

        /* renamed from: b */
        public C10997c mo62585b() {
            byte[] bArr = C11256g.f26930d;
            this.f26451b = bArr;
            this.f26452c = 0;
            this.f26453d = 0;
            this.f26454e = bArr;
            this.f26455f = 0;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            byte[] bArr = this.f26451b;
            byte[] bArr2 = C11256g.f26930d;
            int i = 0;
            if (!Arrays.equals(bArr, bArr2)) {
                i = 0 + C11056b.m28526a(1, this.f26451b);
            }
            long j = this.f26452c;
            if (j != 0) {
                i += C11056b.m28533b(2, j);
            }
            int i2 = this.f26453d;
            if (i2 != 0) {
                i += C11056b.m28521a(3, i2);
            }
            if (!Arrays.equals(this.f26454e, bArr2)) {
                i += C11056b.m28526a(4, this.f26454e);
            }
            long j2 = this.f26455f;
            return j2 != 0 ? i + C11056b.m28533b(5, j2) : i;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    this.f26451b = aVar.mo62616d();
                } else if (l == 16) {
                    this.f26452c = aVar.mo62625i();
                } else if (l == 24) {
                    int h = aVar.mo62624h();
                    if (h == 0 || h == 1 || h == 2) {
                        this.f26453d = h;
                    }
                } else if (l == 34) {
                    this.f26454e = aVar.mo62616d();
                } else if (l == 40) {
                    this.f26455f = aVar.mo62625i();
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
        int i = this.f26428b;
        int i2 = 0;
        if (i != 1) {
            i2 = 0 + C11056b.m28535c(1, i);
        }
        if (Double.doubleToLongBits(this.f26429c) != Double.doubleToLongBits(0.0d)) {
            i2 += C11056b.m28520a(2, this.f26429c);
        }
        int a = i2 + C11056b.m28526a(3, this.f26430d);
        byte[] bArr = this.f26431e;
        byte[] bArr2 = C11256g.f26930d;
        if (!Arrays.equals(bArr, bArr2)) {
            a += C11056b.m28526a(4, this.f26431e);
        }
        if (!Arrays.equals(this.f26432f, bArr2)) {
            a += C11056b.m28526a(5, this.f26432f);
        }
        C10993a aVar = this.f26433g;
        if (aVar != null) {
            a += C11056b.m28523a(6, (C11169e) aVar);
        }
        long j = this.f26434h;
        if (j != 0) {
            a += C11056b.m28522a(7, j);
        }
        boolean z = this.f26435i;
        if (z) {
            a += C11056b.m28525a(8, z);
        }
        int i3 = this.f26436j;
        if (i3 != 0) {
            a += C11056b.m28521a(9, i3);
        }
        int i4 = this.f26437k;
        if (i4 != 1) {
            a += C11056b.m28521a(10, i4);
        }
        C10997c cVar = this.f26438l;
        if (cVar != null) {
            a += C11056b.m28523a(11, (C11169e) cVar);
        }
        C10994b bVar = this.f26439m;
        return bVar != null ? a + C11056b.m28523a(12, (C11169e) bVar) : a;
    }

    /* renamed from: a */
    public C11169e mo61539a(C11009a aVar) throws IOException {
        while (true) {
            int l = aVar.mo62628l();
            switch (l) {
                case 0:
                    break;
                case 8:
                    this.f26428b = aVar.mo62624h();
                    continue;
                case 17:
                    this.f26429c = Double.longBitsToDouble(aVar.mo62622g());
                    continue;
                case 26:
                    this.f26430d = aVar.mo62616d();
                    continue;
                case 34:
                    this.f26431e = aVar.mo62616d();
                    continue;
                case 42:
                    this.f26432f = aVar.mo62616d();
                    continue;
                case 50:
                    if (this.f26433g == null) {
                        this.f26433g = new C10993a();
                    }
                    aVar.mo62611a((C11169e) this.f26433g);
                    continue;
                case 56:
                    this.f26434h = aVar.mo62625i();
                    continue;
                case 64:
                    this.f26435i = aVar.mo62615c();
                    continue;
                case 72:
                    int h = aVar.mo62624h();
                    if (h == 0 || h == 1 || h == 2) {
                        this.f26436j = h;
                        break;
                    } else {
                        continue;
                    }
                case 80:
                    int h2 = aVar.mo62624h();
                    if (h2 == 1 || h2 == 2) {
                        this.f26437k = h2;
                        break;
                    } else {
                        continue;
                    }
                case 90:
                    if (this.f26438l == null) {
                        this.f26438l = new C10997c();
                    }
                    aVar.mo62611a((C11169e) this.f26438l);
                    continue;
                case 98:
                    if (this.f26439m == null) {
                        this.f26439m = new C10994b();
                    }
                    aVar.mo62611a((C11169e) this.f26439m);
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
