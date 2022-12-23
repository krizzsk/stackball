package com.yandex.metrica.impl.p265ob;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.Vf */
public final class C10842Vf extends C11169e {

    /* renamed from: b */
    public C10847d[] f26008b;

    /* renamed from: c */
    public C10845c f26009c;

    /* renamed from: d */
    public C10843a[] f26010d;

    /* renamed from: e */
    public C10852e[] f26011e;

    /* renamed from: f */
    public String[] f26012f;

    /* renamed from: com.yandex.metrica.impl.ob.Vf$c */
    public static final class C10845c extends C11169e {

        /* renamed from: b */
        public String f26025b;

        /* renamed from: c */
        public String f26026c;

        /* renamed from: d */
        public String f26027d;

        /* renamed from: e */
        public int f26028e;

        /* renamed from: f */
        public String f26029f;

        /* renamed from: g */
        public String f26030g;

        /* renamed from: h */
        public boolean f26031h;

        /* renamed from: i */
        public int f26032i;

        /* renamed from: j */
        public String f26033j;

        /* renamed from: k */
        public String f26034k;

        /* renamed from: l */
        public int f26035l;

        /* renamed from: m */
        public C10846a[] f26036m;

        /* renamed from: n */
        public String f26037n;

        public C10845c() {
            mo62384b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            if (!this.f26025b.equals("")) {
                bVar.mo62666b(1, this.f26025b);
            }
            if (!this.f26026c.equals("")) {
                bVar.mo62666b(2, this.f26026c);
            }
            if (!this.f26027d.equals("")) {
                bVar.mo62666b(4, this.f26027d);
            }
            int i = this.f26028e;
            if (i != 0) {
                bVar.mo62677f(5, i);
            }
            if (!this.f26029f.equals("")) {
                bVar.mo62666b(10, this.f26029f);
            }
            if (!this.f26030g.equals("")) {
                bVar.mo62666b(15, this.f26030g);
            }
            boolean z = this.f26031h;
            if (z) {
                bVar.mo62667b(17, z);
            }
            int i2 = this.f26032i;
            if (i2 != 0) {
                bVar.mo62677f(18, i2);
            }
            if (!this.f26033j.equals("")) {
                bVar.mo62666b(19, this.f26033j);
            }
            if (!this.f26034k.equals("")) {
                bVar.mo62666b(21, this.f26034k);
            }
            int i3 = this.f26035l;
            if (i3 != 0) {
                bVar.mo62677f(22, i3);
            }
            C10846a[] aVarArr = this.f26036m;
            if (aVarArr != null && aVarArr.length > 0) {
                int i4 = 0;
                while (true) {
                    C10846a[] aVarArr2 = this.f26036m;
                    if (i4 >= aVarArr2.length) {
                        break;
                    }
                    C10846a aVar = aVarArr2[i4];
                    if (aVar != null) {
                        bVar.mo62665b(23, (C11169e) aVar);
                    }
                    i4++;
                }
            }
            if (!this.f26037n.equals("")) {
                bVar.mo62666b(24, this.f26037n);
            }
        }

        /* renamed from: b */
        public C10845c mo62384b() {
            this.f26025b = "";
            this.f26026c = "";
            this.f26027d = "";
            this.f26028e = 0;
            this.f26029f = "";
            this.f26030g = "";
            this.f26031h = false;
            this.f26032i = 0;
            this.f26033j = "";
            this.f26034k = "";
            this.f26035l = 0;
            this.f26036m = C10846a.m28018c();
            this.f26037n = "";
            this.f26754a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.Vf$c$a */
        public static final class C10846a extends C11169e {

            /* renamed from: d */
            private static volatile C10846a[] f26038d;

            /* renamed from: b */
            public String f26039b;

            /* renamed from: c */
            public long f26040c;

            public C10846a() {
                mo62385b();
            }

            /* renamed from: c */
            public static C10846a[] m28018c() {
                if (f26038d == null) {
                    synchronized (C11095c.f26635a) {
                        if (f26038d == null) {
                            f26038d = new C10846a[0];
                        }
                    }
                }
                return f26038d;
            }

            /* renamed from: a */
            public void mo61540a(C11056b bVar) throws IOException {
                bVar.mo62666b(1, this.f26039b);
                bVar.mo62676e(2, this.f26040c);
            }

            /* renamed from: b */
            public C10846a mo62385b() {
                this.f26039b = "";
                this.f26040c = 0;
                this.f26754a = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo61538a() {
                return C11056b.m28524a(1, this.f26039b) + 0 + C11056b.m28533b(2, this.f26040c);
            }

            /* renamed from: a */
            public C11169e mo61539a(C11009a aVar) throws IOException {
                while (true) {
                    int l = aVar.mo62628l();
                    if (l == 0) {
                        break;
                    } else if (l == 10) {
                        this.f26039b = aVar.mo62627k();
                    } else if (l == 16) {
                        this.f26040c = aVar.mo62625i();
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
            int i = 0;
            int a = !this.f26025b.equals("") ? C11056b.m28524a(1, this.f26025b) + 0 : 0;
            if (!this.f26026c.equals("")) {
                a += C11056b.m28524a(2, this.f26026c);
            }
            if (!this.f26027d.equals("")) {
                a += C11056b.m28524a(4, this.f26027d);
            }
            int i2 = this.f26028e;
            if (i2 != 0) {
                a += C11056b.m28535c(5, i2);
            }
            if (!this.f26029f.equals("")) {
                a += C11056b.m28524a(10, this.f26029f);
            }
            if (!this.f26030g.equals("")) {
                a += C11056b.m28524a(15, this.f26030g);
            }
            boolean z = this.f26031h;
            if (z) {
                a += C11056b.m28525a(17, z);
            }
            int i3 = this.f26032i;
            if (i3 != 0) {
                a += C11056b.m28535c(18, i3);
            }
            if (!this.f26033j.equals("")) {
                a += C11056b.m28524a(19, this.f26033j);
            }
            if (!this.f26034k.equals("")) {
                a += C11056b.m28524a(21, this.f26034k);
            }
            int i4 = this.f26035l;
            if (i4 != 0) {
                a += C11056b.m28535c(22, i4);
            }
            C10846a[] aVarArr = this.f26036m;
            if (aVarArr != null && aVarArr.length > 0) {
                while (true) {
                    C10846a[] aVarArr2 = this.f26036m;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C10846a aVar = aVarArr2[i];
                    if (aVar != null) {
                        a += C11056b.m28523a(23, (C11169e) aVar);
                    }
                    i++;
                }
            }
            return !this.f26037n.equals("") ? a + C11056b.m28524a(24, this.f26037n) : a;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                switch (l) {
                    case 0:
                        break;
                    case 10:
                        this.f26025b = aVar.mo62627k();
                        continue;
                    case 18:
                        this.f26026c = aVar.mo62627k();
                        continue;
                    case 34:
                        this.f26027d = aVar.mo62627k();
                        continue;
                    case 40:
                        this.f26028e = aVar.mo62624h();
                        continue;
                    case 82:
                        this.f26029f = aVar.mo62627k();
                        continue;
                    case 122:
                        this.f26030g = aVar.mo62627k();
                        continue;
                    case 136:
                        this.f26031h = aVar.mo62615c();
                        continue;
                    case 144:
                        this.f26032i = aVar.mo62624h();
                        continue;
                    case 154:
                        this.f26033j = aVar.mo62627k();
                        continue;
                    case 170:
                        this.f26034k = aVar.mo62627k();
                        continue;
                    case 176:
                        this.f26035l = aVar.mo62624h();
                        continue;
                    case 186:
                        int a = C11256g.m29012a(aVar, 186);
                        C10846a[] aVarArr = this.f26036m;
                        int length = aVarArr == null ? 0 : aVarArr.length;
                        int i = a + length;
                        C10846a[] aVarArr2 = new C10846a[i];
                        if (length != 0) {
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                        }
                        while (length < i - 1) {
                            aVarArr2[length] = new C10846a();
                            aVar.mo62611a((C11169e) aVarArr2[length]);
                            aVar.mo62628l();
                            length++;
                        }
                        aVarArr2[length] = new C10846a();
                        aVar.mo62611a((C11169e) aVarArr2[length]);
                        this.f26036m = aVarArr2;
                        continue;
                    case 194:
                        this.f26037n = aVar.mo62627k();
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

    public C10842Vf() {
        mo62381b();
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        C10847d[] dVarArr = this.f26008b;
        int i = 0;
        if (dVarArr != null && dVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C10847d[] dVarArr2 = this.f26008b;
                if (i2 >= dVarArr2.length) {
                    break;
                }
                C10847d dVar = dVarArr2[i2];
                if (dVar != null) {
                    bVar.mo62665b(3, (C11169e) dVar);
                }
                i2++;
            }
        }
        C10845c cVar = this.f26009c;
        if (cVar != null) {
            bVar.mo62665b(4, (C11169e) cVar);
        }
        C10843a[] aVarArr = this.f26010d;
        if (aVarArr != null && aVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                C10843a[] aVarArr2 = this.f26010d;
                if (i3 >= aVarArr2.length) {
                    break;
                }
                C10843a aVar = aVarArr2[i3];
                if (aVar != null) {
                    bVar.mo62665b(7, (C11169e) aVar);
                }
                i3++;
            }
        }
        C10852e[] eVarArr = this.f26011e;
        if (eVarArr != null && eVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                C10852e[] eVarArr2 = this.f26011e;
                if (i4 >= eVarArr2.length) {
                    break;
                }
                C10852e eVar = eVarArr2[i4];
                if (eVar != null) {
                    bVar.mo62665b(10, (C11169e) eVar);
                }
                i4++;
            }
        }
        String[] strArr = this.f26012f;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f26012f;
                if (i < strArr2.length) {
                    String str = strArr2[i];
                    if (str != null) {
                        bVar.mo62666b(11, str);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public C10842Vf mo62381b() {
        this.f26008b = C10847d.m28023c();
        this.f26009c = null;
        this.f26010d = C10843a.m28005c();
        this.f26011e = C10852e.m28045c();
        this.f26012f = C11256g.f26928b;
        this.f26754a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.Vf$a */
    public static final class C10843a extends C11169e {

        /* renamed from: d */
        private static volatile C10843a[] f26013d;

        /* renamed from: b */
        public String f26014b;

        /* renamed from: c */
        public String f26015c;

        public C10843a() {
            mo62382b();
        }

        /* renamed from: c */
        public static C10843a[] m28005c() {
            if (f26013d == null) {
                synchronized (C11095c.f26635a) {
                    if (f26013d == null) {
                        f26013d = new C10843a[0];
                    }
                }
            }
            return f26013d;
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62666b(1, this.f26014b);
            bVar.mo62666b(2, this.f26015c);
        }

        /* renamed from: b */
        public C10843a mo62382b() {
            this.f26014b = "";
            this.f26015c = "";
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            return C11056b.m28524a(1, this.f26014b) + 0 + C11056b.m28524a(2, this.f26015c);
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    this.f26014b = aVar.mo62627k();
                } else if (l == 18) {
                    this.f26015c = aVar.mo62627k();
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Vf$d */
    public static final class C10847d extends C11169e {

        /* renamed from: e */
        private static volatile C10847d[] f26041e;

        /* renamed from: b */
        public long f26042b;

        /* renamed from: c */
        public C10851b f26043c;

        /* renamed from: d */
        public C10848a[] f26044d;

        public C10847d() {
            mo62386b();
        }

        /* renamed from: c */
        public static C10847d[] m28023c() {
            if (f26041e == null) {
                synchronized (C11095c.f26635a) {
                    if (f26041e == null) {
                        f26041e = new C10847d[0];
                    }
                }
            }
            return f26041e;
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62676e(1, this.f26042b);
            C10851b bVar2 = this.f26043c;
            if (bVar2 != null) {
                bVar.mo62665b(2, (C11169e) bVar2);
            }
            C10848a[] aVarArr = this.f26044d;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C10848a[] aVarArr2 = this.f26044d;
                    if (i < aVarArr2.length) {
                        C10848a aVar = aVarArr2[i];
                        if (aVar != null) {
                            bVar.mo62665b(3, (C11169e) aVar);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public C10847d mo62386b() {
            this.f26042b = 0;
            this.f26043c = null;
            this.f26044d = C10848a.m28028c();
            this.f26754a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.Vf$d$a */
        public static final class C10848a extends C11169e {

            /* renamed from: y */
            private static volatile C10848a[] f26045y;

            /* renamed from: b */
            public long f26046b;

            /* renamed from: c */
            public long f26047c;

            /* renamed from: d */
            public int f26048d;

            /* renamed from: e */
            public String f26049e;

            /* renamed from: f */
            public byte[] f26050f;

            /* renamed from: g */
            public C10844b f26051g;

            /* renamed from: h */
            public C10850b f26052h;

            /* renamed from: i */
            public String f26053i;

            /* renamed from: j */
            public C10849a f26054j;

            /* renamed from: k */
            public int f26055k;

            /* renamed from: l */
            public int f26056l;

            /* renamed from: m */
            public int f26057m;

            /* renamed from: n */
            public byte[] f26058n;

            /* renamed from: o */
            public int f26059o;

            /* renamed from: p */
            public long f26060p;

            /* renamed from: q */
            public long f26061q;

            /* renamed from: r */
            public int f26062r;

            /* renamed from: s */
            public int f26063s;

            /* renamed from: t */
            public int f26064t;

            /* renamed from: u */
            public int f26065u;

            /* renamed from: v */
            public int f26066v;

            /* renamed from: w */
            public boolean f26067w;

            /* renamed from: x */
            public long f26068x;

            public C10848a() {
                mo62387b();
            }

            /* renamed from: c */
            public static C10848a[] m28028c() {
                if (f26045y == null) {
                    synchronized (C11095c.f26635a) {
                        if (f26045y == null) {
                            f26045y = new C10848a[0];
                        }
                    }
                }
                return f26045y;
            }

            /* renamed from: a */
            public void mo61540a(C11056b bVar) throws IOException {
                bVar.mo62676e(1, this.f26046b);
                bVar.mo62676e(2, this.f26047c);
                bVar.mo62677f(3, this.f26048d);
                if (!this.f26049e.equals("")) {
                    bVar.mo62666b(4, this.f26049e);
                }
                byte[] bArr = this.f26050f;
                byte[] bArr2 = C11256g.f26930d;
                if (!Arrays.equals(bArr, bArr2)) {
                    bVar.mo62668b(5, this.f26050f);
                }
                C10844b bVar2 = this.f26051g;
                if (bVar2 != null) {
                    bVar.mo62665b(6, (C11169e) bVar2);
                }
                C10850b bVar3 = this.f26052h;
                if (bVar3 != null) {
                    bVar.mo62665b(7, (C11169e) bVar3);
                }
                if (!this.f26053i.equals("")) {
                    bVar.mo62666b(8, this.f26053i);
                }
                C10849a aVar = this.f26054j;
                if (aVar != null) {
                    bVar.mo62665b(9, (C11169e) aVar);
                }
                int i = this.f26055k;
                if (i != 0) {
                    bVar.mo62677f(10, i);
                }
                int i2 = this.f26056l;
                if (i2 != 0) {
                    bVar.mo62672d(12, i2);
                }
                int i3 = this.f26057m;
                if (i3 != -1) {
                    bVar.mo62672d(13, i3);
                }
                if (!Arrays.equals(this.f26058n, bArr2)) {
                    bVar.mo62668b(14, this.f26058n);
                }
                int i4 = this.f26059o;
                if (i4 != -1) {
                    bVar.mo62672d(15, i4);
                }
                long j = this.f26060p;
                if (j != 0) {
                    bVar.mo62676e(16, j);
                }
                long j2 = this.f26061q;
                if (j2 != 0) {
                    bVar.mo62676e(17, j2);
                }
                int i5 = this.f26062r;
                if (i5 != 0) {
                    bVar.mo62672d(18, i5);
                }
                int i6 = this.f26063s;
                if (i6 != 0) {
                    bVar.mo62672d(19, i6);
                }
                int i7 = this.f26064t;
                if (i7 != -1) {
                    bVar.mo62672d(20, i7);
                }
                int i8 = this.f26065u;
                if (i8 != 0) {
                    bVar.mo62672d(21, i8);
                }
                int i9 = this.f26066v;
                if (i9 != 0) {
                    bVar.mo62672d(22, i9);
                }
                boolean z = this.f26067w;
                if (z) {
                    bVar.mo62667b(23, z);
                }
                long j3 = this.f26068x;
                if (j3 != 1) {
                    bVar.mo62676e(24, j3);
                }
            }

            /* renamed from: b */
            public C10848a mo62387b() {
                this.f26046b = 0;
                this.f26047c = 0;
                this.f26048d = 0;
                this.f26049e = "";
                byte[] bArr = C11256g.f26930d;
                this.f26050f = bArr;
                this.f26051g = null;
                this.f26052h = null;
                this.f26053i = "";
                this.f26054j = null;
                this.f26055k = 0;
                this.f26056l = 0;
                this.f26057m = -1;
                this.f26058n = bArr;
                this.f26059o = -1;
                this.f26060p = 0;
                this.f26061q = 0;
                this.f26062r = 0;
                this.f26063s = 0;
                this.f26064t = -1;
                this.f26065u = 0;
                this.f26066v = 0;
                this.f26067w = false;
                this.f26068x = 1;
                this.f26754a = -1;
                return this;
            }

            /* renamed from: com.yandex.metrica.impl.ob.Vf$d$a$a */
            public static final class C10849a extends C11169e {

                /* renamed from: b */
                public String f26069b;

                /* renamed from: c */
                public String f26070c;

                /* renamed from: d */
                public String f26071d;

                public C10849a() {
                    mo62388b();
                }

                /* renamed from: a */
                public void mo61540a(C11056b bVar) throws IOException {
                    bVar.mo62666b(1, this.f26069b);
                    if (!this.f26070c.equals("")) {
                        bVar.mo62666b(2, this.f26070c);
                    }
                    if (!this.f26071d.equals("")) {
                        bVar.mo62666b(3, this.f26071d);
                    }
                }

                /* renamed from: b */
                public C10849a mo62388b() {
                    this.f26069b = "";
                    this.f26070c = "";
                    this.f26071d = "";
                    this.f26754a = -1;
                    return this;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int mo61538a() {
                    int a = C11056b.m28524a(1, this.f26069b) + 0;
                    if (!this.f26070c.equals("")) {
                        a += C11056b.m28524a(2, this.f26070c);
                    }
                    return !this.f26071d.equals("") ? a + C11056b.m28524a(3, this.f26071d) : a;
                }

                /* renamed from: a */
                public C11169e mo61539a(C11009a aVar) throws IOException {
                    while (true) {
                        int l = aVar.mo62628l();
                        if (l == 0) {
                            break;
                        } else if (l == 10) {
                            this.f26069b = aVar.mo62627k();
                        } else if (l == 18) {
                            this.f26070c = aVar.mo62627k();
                        } else if (l == 26) {
                            this.f26071d = aVar.mo62627k();
                        } else if (!aVar.mo62621f(l)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            /* renamed from: com.yandex.metrica.impl.ob.Vf$d$a$b */
            public static final class C10850b extends C11169e {

                /* renamed from: b */
                public C10784Tf[] f26072b;

                /* renamed from: c */
                public C10887Wf[] f26073c;

                /* renamed from: d */
                public int f26074d;

                /* renamed from: e */
                public String f26075e;

                public C10850b() {
                    mo62389b();
                }

                /* renamed from: a */
                public void mo61540a(C11056b bVar) throws IOException {
                    C10784Tf[] tfArr = this.f26072b;
                    int i = 0;
                    if (tfArr != null && tfArr.length > 0) {
                        int i2 = 0;
                        while (true) {
                            C10784Tf[] tfArr2 = this.f26072b;
                            if (i2 >= tfArr2.length) {
                                break;
                            }
                            C10784Tf tf = tfArr2[i2];
                            if (tf != null) {
                                bVar.mo62665b(1, (C11169e) tf);
                            }
                            i2++;
                        }
                    }
                    C10887Wf[] wfArr = this.f26073c;
                    if (wfArr != null && wfArr.length > 0) {
                        while (true) {
                            C10887Wf[] wfArr2 = this.f26073c;
                            if (i >= wfArr2.length) {
                                break;
                            }
                            C10887Wf wf = wfArr2[i];
                            if (wf != null) {
                                bVar.mo62665b(2, (C11169e) wf);
                            }
                            i++;
                        }
                    }
                    int i3 = this.f26074d;
                    if (i3 != 2) {
                        bVar.mo62672d(3, i3);
                    }
                    if (!this.f26075e.equals("")) {
                        bVar.mo62666b(4, this.f26075e);
                    }
                }

                /* renamed from: b */
                public C10850b mo62389b() {
                    this.f26072b = C10784Tf.m27819c();
                    this.f26073c = C10887Wf.m28137c();
                    this.f26074d = 2;
                    this.f26075e = "";
                    this.f26754a = -1;
                    return this;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int mo61538a() {
                    int i;
                    C10784Tf[] tfArr = this.f26072b;
                    int i2 = 0;
                    if (tfArr != null && tfArr.length > 0) {
                        int i3 = 0;
                        i = 0;
                        while (true) {
                            C10784Tf[] tfArr2 = this.f26072b;
                            if (i3 >= tfArr2.length) {
                                break;
                            }
                            C10784Tf tf = tfArr2[i3];
                            if (tf != null) {
                                i += C11056b.m28523a(1, (C11169e) tf);
                            }
                            i3++;
                        }
                    } else {
                        i = 0;
                    }
                    C10887Wf[] wfArr = this.f26073c;
                    if (wfArr != null && wfArr.length > 0) {
                        while (true) {
                            C10887Wf[] wfArr2 = this.f26073c;
                            if (i2 >= wfArr2.length) {
                                break;
                            }
                            C10887Wf wf = wfArr2[i2];
                            if (wf != null) {
                                i += C11056b.m28523a(2, (C11169e) wf);
                            }
                            i2++;
                        }
                    }
                    int i4 = this.f26074d;
                    if (i4 != 2) {
                        i += C11056b.m28521a(3, i4);
                    }
                    return !this.f26075e.equals("") ? i + C11056b.m28524a(4, this.f26075e) : i;
                }

                /* renamed from: a */
                public C11169e mo61539a(C11009a aVar) throws IOException {
                    while (true) {
                        int l = aVar.mo62628l();
                        if (l == 0) {
                            break;
                        } else if (l == 10) {
                            int a = C11256g.m29012a(aVar, 10);
                            C10784Tf[] tfArr = this.f26072b;
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
                            this.f26072b = tfArr2;
                        } else if (l != 18) {
                            if (l == 24) {
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
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                        this.f26074d = h;
                                        break;
                                }
                            } else if (l == 34) {
                                this.f26075e = aVar.mo62627k();
                            } else if (!aVar.mo62621f(l)) {
                                break;
                            }
                        } else {
                            int a2 = C11256g.m29012a(aVar, 18);
                            C10887Wf[] wfArr = this.f26073c;
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
                            this.f26073c = wfArr2;
                        }
                    }
                    return this;
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo61538a() {
                int b = C11056b.m28533b(1, this.f26046b) + 0 + C11056b.m28533b(2, this.f26047c) + C11056b.m28535c(3, this.f26048d);
                if (!this.f26049e.equals("")) {
                    b += C11056b.m28524a(4, this.f26049e);
                }
                byte[] bArr = this.f26050f;
                byte[] bArr2 = C11256g.f26930d;
                if (!Arrays.equals(bArr, bArr2)) {
                    b += C11056b.m28526a(5, this.f26050f);
                }
                C10844b bVar = this.f26051g;
                if (bVar != null) {
                    b += C11056b.m28523a(6, (C11169e) bVar);
                }
                C10850b bVar2 = this.f26052h;
                if (bVar2 != null) {
                    b += C11056b.m28523a(7, (C11169e) bVar2);
                }
                if (!this.f26053i.equals("")) {
                    b += C11056b.m28524a(8, this.f26053i);
                }
                C10849a aVar = this.f26054j;
                if (aVar != null) {
                    b += C11056b.m28523a(9, (C11169e) aVar);
                }
                int i = this.f26055k;
                if (i != 0) {
                    b += C11056b.m28535c(10, i);
                }
                int i2 = this.f26056l;
                if (i2 != 0) {
                    b += C11056b.m28521a(12, i2);
                }
                int i3 = this.f26057m;
                if (i3 != -1) {
                    b += C11056b.m28521a(13, i3);
                }
                if (!Arrays.equals(this.f26058n, bArr2)) {
                    b += C11056b.m28526a(14, this.f26058n);
                }
                int i4 = this.f26059o;
                if (i4 != -1) {
                    b += C11056b.m28521a(15, i4);
                }
                long j = this.f26060p;
                if (j != 0) {
                    b += C11056b.m28533b(16, j);
                }
                long j2 = this.f26061q;
                if (j2 != 0) {
                    b += C11056b.m28533b(17, j2);
                }
                int i5 = this.f26062r;
                if (i5 != 0) {
                    b += C11056b.m28521a(18, i5);
                }
                int i6 = this.f26063s;
                if (i6 != 0) {
                    b += C11056b.m28521a(19, i6);
                }
                int i7 = this.f26064t;
                if (i7 != -1) {
                    b += C11056b.m28521a(20, i7);
                }
                int i8 = this.f26065u;
                if (i8 != 0) {
                    b += C11056b.m28521a(21, i8);
                }
                int i9 = this.f26066v;
                if (i9 != 0) {
                    b += C11056b.m28521a(22, i9);
                }
                boolean z = this.f26067w;
                if (z) {
                    b += C11056b.m28525a(23, z);
                }
                long j3 = this.f26068x;
                return j3 != 1 ? b + C11056b.m28533b(24, j3) : b;
            }

            /* renamed from: a */
            public C11169e mo61539a(C11009a aVar) throws IOException {
                while (true) {
                    int l = aVar.mo62628l();
                    switch (l) {
                        case 0:
                            break;
                        case 8:
                            this.f26046b = aVar.mo62625i();
                            continue;
                        case 16:
                            this.f26047c = aVar.mo62625i();
                            continue;
                        case 24:
                            this.f26048d = aVar.mo62624h();
                            continue;
                        case 34:
                            this.f26049e = aVar.mo62627k();
                            continue;
                        case 42:
                            this.f26050f = aVar.mo62616d();
                            continue;
                        case 50:
                            if (this.f26051g == null) {
                                this.f26051g = new C10844b();
                            }
                            aVar.mo62611a((C11169e) this.f26051g);
                            continue;
                        case 58:
                            if (this.f26052h == null) {
                                this.f26052h = new C10850b();
                            }
                            aVar.mo62611a((C11169e) this.f26052h);
                            continue;
                        case 66:
                            this.f26053i = aVar.mo62627k();
                            continue;
                        case 74:
                            if (this.f26054j == null) {
                                this.f26054j = new C10849a();
                            }
                            aVar.mo62611a((C11169e) this.f26054j);
                            continue;
                        case 80:
                            this.f26055k = aVar.mo62624h();
                            continue;
                        case 96:
                            int h = aVar.mo62624h();
                            if (h == 0 || h == 1 || h == 2) {
                                this.f26056l = h;
                                break;
                            } else {
                                continue;
                            }
                        case 104:
                            int h2 = aVar.mo62624h();
                            if (h2 == -1 || h2 == 0 || h2 == 1) {
                                this.f26057m = h2;
                                break;
                            } else {
                                continue;
                            }
                        case 114:
                            this.f26058n = aVar.mo62616d();
                            continue;
                        case 120:
                            int h3 = aVar.mo62624h();
                            if (h3 == -1 || h3 == 0 || h3 == 1) {
                                this.f26059o = h3;
                                break;
                            } else {
                                continue;
                            }
                        case 128:
                            this.f26060p = aVar.mo62625i();
                            continue;
                        case 136:
                            this.f26061q = aVar.mo62625i();
                            continue;
                        case 144:
                            int h4 = aVar.mo62624h();
                            if (h4 == 0 || h4 == 1 || h4 == 2 || h4 == 3 || h4 == 4) {
                                this.f26062r = h4;
                                break;
                            } else {
                                continue;
                            }
                        case 152:
                            int h5 = aVar.mo62624h();
                            if (h5 == 0 || h5 == 1 || h5 == 2 || h5 == 3) {
                                this.f26063s = h5;
                                break;
                            } else {
                                continue;
                            }
                        case 160:
                            int h6 = aVar.mo62624h();
                            if (h6 == -1 || h6 == 0 || h6 == 1) {
                                this.f26064t = h6;
                                break;
                            } else {
                                continue;
                            }
                        case 168:
                            int h7 = aVar.mo62624h();
                            if (h7 == 0 || h7 == 1 || h7 == 2 || h7 == 3) {
                                this.f26065u = h7;
                                break;
                            } else {
                                continue;
                            }
                        case 176:
                            int h8 = aVar.mo62624h();
                            if (h8 == 0 || h8 == 1) {
                                this.f26066v = h8;
                                break;
                            } else {
                                continue;
                            }
                        case 184:
                            this.f26067w = aVar.mo62615c();
                            continue;
                        case 192:
                            this.f26068x = aVar.mo62625i();
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

        /* renamed from: com.yandex.metrica.impl.ob.Vf$d$b */
        public static final class C10851b extends C11169e {

            /* renamed from: b */
            public C10853f f26076b;

            /* renamed from: c */
            public String f26077c;

            /* renamed from: d */
            public int f26078d;

            public C10851b() {
                mo62390b();
            }

            /* renamed from: a */
            public void mo61540a(C11056b bVar) throws IOException {
                C10853f fVar = this.f26076b;
                if (fVar != null) {
                    bVar.mo62665b(1, (C11169e) fVar);
                }
                bVar.mo62666b(2, this.f26077c);
                int i = this.f26078d;
                if (i != 0) {
                    bVar.mo62672d(5, i);
                }
            }

            /* renamed from: b */
            public C10851b mo62390b() {
                this.f26076b = null;
                this.f26077c = "";
                this.f26078d = 0;
                this.f26754a = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo61538a() {
                C10853f fVar = this.f26076b;
                int i = 0;
                if (fVar != null) {
                    i = 0 + C11056b.m28523a(1, (C11169e) fVar);
                }
                int a = i + C11056b.m28524a(2, this.f26077c);
                int i2 = this.f26078d;
                return i2 != 0 ? a + C11056b.m28521a(5, i2) : a;
            }

            /* renamed from: a */
            public C11169e mo61539a(C11009a aVar) throws IOException {
                while (true) {
                    int l = aVar.mo62628l();
                    if (l == 0) {
                        break;
                    } else if (l == 10) {
                        if (this.f26076b == null) {
                            this.f26076b = new C10853f();
                        }
                        aVar.mo62611a((C11169e) this.f26076b);
                    } else if (l == 18) {
                        this.f26077c = aVar.mo62627k();
                    } else if (l == 40) {
                        int h = aVar.mo62624h();
                        if (h == 0 || h == 1 || h == 2) {
                            this.f26078d = h;
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
            int i = 0;
            int b = C11056b.m28533b(1, this.f26042b) + 0;
            C10851b bVar = this.f26043c;
            if (bVar != null) {
                b += C11056b.m28523a(2, (C11169e) bVar);
            }
            C10848a[] aVarArr = this.f26044d;
            if (aVarArr != null && aVarArr.length > 0) {
                while (true) {
                    C10848a[] aVarArr2 = this.f26044d;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C10848a aVar = aVarArr2[i];
                    if (aVar != null) {
                        b += C11056b.m28523a(3, (C11169e) aVar);
                    }
                    i++;
                }
            }
            return b;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 8) {
                    this.f26042b = aVar.mo62625i();
                } else if (l == 18) {
                    if (this.f26043c == null) {
                        this.f26043c = new C10851b();
                    }
                    aVar.mo62611a((C11169e) this.f26043c);
                } else if (l == 26) {
                    int a = C11256g.m29012a(aVar, 26);
                    C10848a[] aVarArr = this.f26044d;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i = a + length;
                    C10848a[] aVarArr2 = new C10848a[i];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        aVarArr2[length] = new C10848a();
                        aVar.mo62611a((C11169e) aVarArr2[length]);
                        aVar.mo62628l();
                        length++;
                    }
                    aVarArr2[length] = new C10848a();
                    aVar.mo62611a((C11169e) aVarArr2[length]);
                    this.f26044d = aVarArr2;
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Vf$f */
    public static final class C10853f extends C11169e {

        /* renamed from: b */
        public long f26084b;

        /* renamed from: c */
        public int f26085c;

        /* renamed from: d */
        public long f26086d;

        /* renamed from: e */
        public boolean f26087e;

        public C10853f() {
            mo62392b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62676e(1, this.f26084b);
            bVar.mo62675e(2, this.f26085c);
            long j = this.f26086d;
            if (j != 0) {
                bVar.mo62670c(3, j);
            }
            boolean z = this.f26087e;
            if (z) {
                bVar.mo62667b(4, z);
            }
        }

        /* renamed from: b */
        public C10853f mo62392b() {
            this.f26084b = 0;
            this.f26085c = 0;
            this.f26086d = 0;
            this.f26087e = false;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            int b = C11056b.m28533b(1, this.f26084b) + 0 + C11056b.m28532b(2, this.f26085c);
            long j = this.f26086d;
            if (j != 0) {
                b += C11056b.m28522a(3, j);
            }
            boolean z = this.f26087e;
            return z ? b + C11056b.m28525a(4, z) : b;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 8) {
                    this.f26084b = aVar.mo62625i();
                } else if (l == 16) {
                    this.f26085c = aVar.mo62626j();
                } else if (l == 24) {
                    this.f26086d = aVar.mo62625i();
                } else if (l == 32) {
                    this.f26087e = aVar.mo62615c();
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Vf$e */
    public static final class C10852e extends C11169e {

        /* renamed from: f */
        private static volatile C10852e[] f26079f;

        /* renamed from: b */
        public int f26080b;

        /* renamed from: c */
        public int f26081c;

        /* renamed from: d */
        public String f26082d;

        /* renamed from: e */
        public boolean f26083e;

        public C10852e() {
            mo62391b();
        }

        /* renamed from: c */
        public static C10852e[] m28045c() {
            if (f26079f == null) {
                synchronized (C11095c.f26635a) {
                    if (f26079f == null) {
                        f26079f = new C10852e[0];
                    }
                }
            }
            return f26079f;
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            int i = this.f26080b;
            if (i != 0) {
                bVar.mo62677f(1, i);
            }
            int i2 = this.f26081c;
            if (i2 != 0) {
                bVar.mo62677f(2, i2);
            }
            if (!this.f26082d.equals("")) {
                bVar.mo62666b(3, this.f26082d);
            }
            boolean z = this.f26083e;
            if (z) {
                bVar.mo62667b(4, z);
            }
        }

        /* renamed from: b */
        public C10852e mo62391b() {
            this.f26080b = 0;
            this.f26081c = 0;
            this.f26082d = "";
            this.f26083e = false;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            int i = this.f26080b;
            int i2 = 0;
            if (i != 0) {
                i2 = 0 + C11056b.m28535c(1, i);
            }
            int i3 = this.f26081c;
            if (i3 != 0) {
                i2 += C11056b.m28535c(2, i3);
            }
            if (!this.f26082d.equals("")) {
                i2 += C11056b.m28524a(3, this.f26082d);
            }
            boolean z = this.f26083e;
            return z ? i2 + C11056b.m28525a(4, z) : i2;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 8) {
                    this.f26080b = aVar.mo62624h();
                } else if (l == 16) {
                    this.f26081c = aVar.mo62624h();
                } else if (l == 26) {
                    this.f26082d = aVar.mo62627k();
                } else if (l == 32) {
                    this.f26083e = aVar.mo62615c();
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Vf$b */
    public static final class C10844b extends C11169e {

        /* renamed from: b */
        public double f26016b;

        /* renamed from: c */
        public double f26017c;

        /* renamed from: d */
        public long f26018d;

        /* renamed from: e */
        public int f26019e;

        /* renamed from: f */
        public int f26020f;

        /* renamed from: g */
        public int f26021g;

        /* renamed from: h */
        public int f26022h;

        /* renamed from: i */
        public int f26023i;

        /* renamed from: j */
        public String f26024j;

        public C10844b() {
            mo62383b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62664b(1, this.f26016b);
            bVar.mo62664b(2, this.f26017c);
            long j = this.f26018d;
            if (j != 0) {
                bVar.mo62676e(3, j);
            }
            int i = this.f26019e;
            if (i != 0) {
                bVar.mo62677f(4, i);
            }
            int i2 = this.f26020f;
            if (i2 != 0) {
                bVar.mo62677f(5, i2);
            }
            int i3 = this.f26021g;
            if (i3 != 0) {
                bVar.mo62677f(6, i3);
            }
            int i4 = this.f26022h;
            if (i4 != 0) {
                bVar.mo62672d(7, i4);
            }
            int i5 = this.f26023i;
            if (i5 != 0) {
                bVar.mo62672d(8, i5);
            }
            if (!this.f26024j.equals("")) {
                bVar.mo62666b(9, this.f26024j);
            }
        }

        /* renamed from: b */
        public C10844b mo62383b() {
            this.f26016b = 0.0d;
            this.f26017c = 0.0d;
            this.f26018d = 0;
            this.f26019e = 0;
            this.f26020f = 0;
            this.f26021g = 0;
            this.f26022h = 0;
            this.f26023i = 0;
            this.f26024j = "";
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            int a = C11056b.m28520a(1, this.f26016b) + 0 + C11056b.m28520a(2, this.f26017c);
            long j = this.f26018d;
            if (j != 0) {
                a += C11056b.m28533b(3, j);
            }
            int i = this.f26019e;
            if (i != 0) {
                a += C11056b.m28535c(4, i);
            }
            int i2 = this.f26020f;
            if (i2 != 0) {
                a += C11056b.m28535c(5, i2);
            }
            int i3 = this.f26021g;
            if (i3 != 0) {
                a += C11056b.m28535c(6, i3);
            }
            int i4 = this.f26022h;
            if (i4 != 0) {
                a += C11056b.m28521a(7, i4);
            }
            int i5 = this.f26023i;
            if (i5 != 0) {
                a += C11056b.m28521a(8, i5);
            }
            return !this.f26024j.equals("") ? a + C11056b.m28524a(9, this.f26024j) : a;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 9) {
                    this.f26016b = Double.longBitsToDouble(aVar.mo62622g());
                } else if (l == 17) {
                    this.f26017c = Double.longBitsToDouble(aVar.mo62622g());
                } else if (l == 24) {
                    this.f26018d = aVar.mo62625i();
                } else if (l == 32) {
                    this.f26019e = aVar.mo62624h();
                } else if (l == 40) {
                    this.f26020f = aVar.mo62624h();
                } else if (l == 48) {
                    this.f26021g = aVar.mo62624h();
                } else if (l == 56) {
                    this.f26022h = aVar.mo62624h();
                } else if (l == 64) {
                    int h = aVar.mo62624h();
                    if (h == 0 || h == 1 || h == 2) {
                        this.f26023i = h;
                    }
                } else if (l == 74) {
                    this.f26024j = aVar.mo62627k();
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
        int i;
        C10847d[] dVarArr = this.f26008b;
        int i2 = 0;
        if (dVarArr != null && dVarArr.length > 0) {
            int i3 = 0;
            i = 0;
            while (true) {
                C10847d[] dVarArr2 = this.f26008b;
                if (i3 >= dVarArr2.length) {
                    break;
                }
                C10847d dVar = dVarArr2[i3];
                if (dVar != null) {
                    i += C11056b.m28523a(3, (C11169e) dVar);
                }
                i3++;
            }
        } else {
            i = 0;
        }
        C10845c cVar = this.f26009c;
        if (cVar != null) {
            i += C11056b.m28523a(4, (C11169e) cVar);
        }
        C10843a[] aVarArr = this.f26010d;
        if (aVarArr != null && aVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                C10843a[] aVarArr2 = this.f26010d;
                if (i4 >= aVarArr2.length) {
                    break;
                }
                C10843a aVar = aVarArr2[i4];
                if (aVar != null) {
                    i += C11056b.m28523a(7, (C11169e) aVar);
                }
                i4++;
            }
        }
        C10852e[] eVarArr = this.f26011e;
        if (eVarArr != null && eVarArr.length > 0) {
            int i5 = 0;
            while (true) {
                C10852e[] eVarArr2 = this.f26011e;
                if (i5 >= eVarArr2.length) {
                    break;
                }
                C10852e eVar = eVarArr2[i5];
                if (eVar != null) {
                    i += C11056b.m28523a(10, (C11169e) eVar);
                }
                i5++;
            }
        }
        String[] strArr = this.f26012f;
        if (strArr == null || strArr.length <= 0) {
            return i;
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            String[] strArr2 = this.f26012f;
            if (i2 >= strArr2.length) {
                return i + i6 + (i7 * 1);
            }
            String str = strArr2[i2];
            if (str != null) {
                i7++;
                i6 += C11056b.m28529a(str);
            }
            i2++;
        }
    }

    /* renamed from: a */
    public C11169e mo61539a(C11009a aVar) throws IOException {
        while (true) {
            int l = aVar.mo62628l();
            if (l == 0) {
                break;
            } else if (l == 26) {
                int a = C11256g.m29012a(aVar, 26);
                C10847d[] dVarArr = this.f26008b;
                int length = dVarArr == null ? 0 : dVarArr.length;
                int i = a + length;
                C10847d[] dVarArr2 = new C10847d[i];
                if (length != 0) {
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                }
                while (length < i - 1) {
                    dVarArr2[length] = new C10847d();
                    aVar.mo62611a((C11169e) dVarArr2[length]);
                    aVar.mo62628l();
                    length++;
                }
                dVarArr2[length] = new C10847d();
                aVar.mo62611a((C11169e) dVarArr2[length]);
                this.f26008b = dVarArr2;
            } else if (l == 34) {
                if (this.f26009c == null) {
                    this.f26009c = new C10845c();
                }
                aVar.mo62611a((C11169e) this.f26009c);
            } else if (l == 58) {
                int a2 = C11256g.m29012a(aVar, 58);
                C10843a[] aVarArr = this.f26010d;
                int length2 = aVarArr == null ? 0 : aVarArr.length;
                int i2 = a2 + length2;
                C10843a[] aVarArr2 = new C10843a[i2];
                if (length2 != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    aVarArr2[length2] = new C10843a();
                    aVar.mo62611a((C11169e) aVarArr2[length2]);
                    aVar.mo62628l();
                    length2++;
                }
                aVarArr2[length2] = new C10843a();
                aVar.mo62611a((C11169e) aVarArr2[length2]);
                this.f26010d = aVarArr2;
            } else if (l == 82) {
                int a3 = C11256g.m29012a(aVar, 82);
                C10852e[] eVarArr = this.f26011e;
                int length3 = eVarArr == null ? 0 : eVarArr.length;
                int i3 = a3 + length3;
                C10852e[] eVarArr2 = new C10852e[i3];
                if (length3 != 0) {
                    System.arraycopy(eVarArr, 0, eVarArr2, 0, length3);
                }
                while (length3 < i3 - 1) {
                    eVarArr2[length3] = new C10852e();
                    aVar.mo62611a((C11169e) eVarArr2[length3]);
                    aVar.mo62628l();
                    length3++;
                }
                eVarArr2[length3] = new C10852e();
                aVar.mo62611a((C11169e) eVarArr2[length3]);
                this.f26011e = eVarArr2;
            } else if (l == 90) {
                int a4 = C11256g.m29012a(aVar, 90);
                String[] strArr = this.f26012f;
                int length4 = strArr == null ? 0 : strArr.length;
                int i4 = a4 + length4;
                String[] strArr2 = new String[i4];
                if (length4 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length4);
                }
                while (length4 < i4 - 1) {
                    strArr2[length4] = aVar.mo62627k();
                    aVar.mo62628l();
                    length4++;
                }
                strArr2[length4] = aVar.mo62627k();
                this.f26012f = strArr2;
            } else if (!aVar.mo62621f(l)) {
                break;
            }
        }
        return this;
    }
}
