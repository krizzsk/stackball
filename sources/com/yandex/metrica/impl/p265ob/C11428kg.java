package com.yandex.metrica.impl.p265ob;

import com.smaato.sdk.video.vast.model.ErrorCode;
import com.tapjoy.TapjoyConstants;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.kg */
public final class C11428kg extends C11169e {

    /* renamed from: A */
    public String f27394A;

    /* renamed from: B */
    public String f27395B;

    /* renamed from: C */
    public String f27396C;

    /* renamed from: D */
    public String f27397D;

    /* renamed from: E */
    public String f27398E;

    /* renamed from: F */
    public long f27399F;

    /* renamed from: G */
    public long f27400G;

    /* renamed from: H */
    public boolean f27401H;

    /* renamed from: I */
    public C11449m f27402I;

    /* renamed from: J */
    public C11440j f27403J;

    /* renamed from: K */
    public int f27404K;

    /* renamed from: L */
    public int f27405L;

    /* renamed from: M */
    public C11459v f27406M;

    /* renamed from: N */
    public C11458u f27407N;

    /* renamed from: O */
    public C11458u f27408O;

    /* renamed from: P */
    public C11458u f27409P;

    /* renamed from: Q */
    public C11456s f27410Q;

    /* renamed from: R */
    public C11433c f27411R;

    /* renamed from: S */
    public C11436f f27412S;

    /* renamed from: T */
    public String[] f27413T;

    /* renamed from: U */
    public C11432b f27414U;

    /* renamed from: V */
    public C11429a f27415V;

    /* renamed from: W */
    public C11438h f27416W;

    /* renamed from: X */
    public C11437g f27417X;

    /* renamed from: Y */
    public C11454q f27418Y;

    /* renamed from: b */
    public String f27419b;

    /* renamed from: c */
    public long f27420c;

    /* renamed from: d */
    public String[] f27421d;

    /* renamed from: e */
    public String f27422e;

    /* renamed from: f */
    public String f27423f;

    /* renamed from: g */
    public String[] f27424g;

    /* renamed from: h */
    public String[] f27425h;

    /* renamed from: i */
    public String[] f27426i;

    /* renamed from: j */
    public String[] f27427j;

    /* renamed from: k */
    public C11434d[] f27428k;

    /* renamed from: l */
    public C11439i f27429l;

    /* renamed from: m */
    public C11441k[] f27430m;

    /* renamed from: n */
    public C11462y f27431n;

    /* renamed from: o */
    public C11453p f27432o;

    /* renamed from: p */
    public C11450n[] f27433p;

    /* renamed from: q */
    public String f27434q;

    /* renamed from: r */
    public String f27435r;

    /* renamed from: s */
    public String f27436s;

    /* renamed from: t */
    public boolean f27437t;

    /* renamed from: u */
    public String f27438u;

    /* renamed from: v */
    public String[] f27439v;

    /* renamed from: w */
    public C11455r f27440w;

    /* renamed from: x */
    public boolean f27441x;

    /* renamed from: y */
    public C11448l[] f27442y;

    /* renamed from: z */
    public C11452o f27443z;

    /* renamed from: com.yandex.metrica.impl.ob.kg$a */
    public static final class C11429a extends C11169e {

        /* renamed from: b */
        public C11431b[] f27444b;

        public C11429a() {
            mo63189b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            C11431b[] bVarArr = this.f27444b;
            if (bVarArr != null && bVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C11431b[] bVarArr2 = this.f27444b;
                    if (i < bVarArr2.length) {
                        C11431b bVar2 = bVarArr2[i];
                        if (bVar2 != null) {
                            bVar.mo62665b(1, (C11169e) bVar2);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public C11429a mo63189b() {
            this.f27444b = C11431b.m29493c();
            this.f26754a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.kg$a$a */
        public static final class C11430a extends C11169e {

            /* renamed from: b */
            public String f27445b;

            public C11430a() {
                mo63190b();
            }

            /* renamed from: a */
            public void mo61540a(C11056b bVar) throws IOException {
                if (!this.f27445b.equals("")) {
                    bVar.mo62666b(1, this.f27445b);
                }
            }

            /* renamed from: b */
            public C11430a mo63190b() {
                this.f27445b = "";
                this.f26754a = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo61538a() {
                if (!this.f27445b.equals("")) {
                    return 0 + C11056b.m28524a(1, this.f27445b);
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
                        this.f27445b = aVar.mo62627k();
                    } else if (!aVar.mo62621f(l)) {
                        break;
                    }
                }
                return this;
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.kg$a$b */
        public static final class C11431b extends C11169e {

            /* renamed from: d */
            private static volatile C11431b[] f27446d;

            /* renamed from: b */
            public String f27447b;

            /* renamed from: c */
            public C11430a f27448c;

            public C11431b() {
                mo63191b();
            }

            /* renamed from: c */
            public static C11431b[] m29493c() {
                if (f27446d == null) {
                    synchronized (C11095c.f26635a) {
                        if (f27446d == null) {
                            f27446d = new C11431b[0];
                        }
                    }
                }
                return f27446d;
            }

            /* renamed from: a */
            public void mo61540a(C11056b bVar) throws IOException {
                if (!this.f27447b.equals("")) {
                    bVar.mo62666b(1, this.f27447b);
                }
                C11430a aVar = this.f27448c;
                if (aVar != null) {
                    bVar.mo62665b(2, (C11169e) aVar);
                }
            }

            /* renamed from: b */
            public C11431b mo63191b() {
                this.f27447b = "";
                this.f27448c = null;
                this.f26754a = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo61538a() {
                int i = 0;
                if (!this.f27447b.equals("")) {
                    i = 0 + C11056b.m28524a(1, this.f27447b);
                }
                C11430a aVar = this.f27448c;
                return aVar != null ? i + C11056b.m28523a(2, (C11169e) aVar) : i;
            }

            /* renamed from: a */
            public C11169e mo61539a(C11009a aVar) throws IOException {
                while (true) {
                    int l = aVar.mo62628l();
                    if (l == 0) {
                        break;
                    } else if (l == 10) {
                        this.f27447b = aVar.mo62627k();
                    } else if (l == 18) {
                        if (this.f27448c == null) {
                            this.f27448c = new C11430a();
                        }
                        aVar.mo62611a((C11169e) this.f27448c);
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
            C11431b[] bVarArr = this.f27444b;
            int i = 0;
            if (bVarArr == null || bVarArr.length <= 0) {
                return 0;
            }
            int i2 = 0;
            while (true) {
                C11431b[] bVarArr2 = this.f27444b;
                if (i >= bVarArr2.length) {
                    return i2;
                }
                C11431b bVar = bVarArr2[i];
                if (bVar != null) {
                    i2 += C11056b.m28523a(1, (C11169e) bVar);
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
                    C11431b[] bVarArr = this.f27444b;
                    int length = bVarArr == null ? 0 : bVarArr.length;
                    int i = a + length;
                    C11431b[] bVarArr2 = new C11431b[i];
                    if (length != 0) {
                        System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        bVarArr2[length] = new C11431b();
                        aVar.mo62611a((C11169e) bVarArr2[length]);
                        aVar.mo62628l();
                        length++;
                    }
                    bVarArr2[length] = new C11431b();
                    aVar.mo62611a((C11169e) bVarArr2[length]);
                    this.f27444b = bVarArr2;
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$j */
    public static final class C11440j extends C11169e {

        /* renamed from: b */
        public long f27494b;

        public C11440j() {
            mo63200b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62670c(1, this.f27494b);
        }

        /* renamed from: b */
        public C11440j mo63200b() {
            this.f27494b = 900;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            return C11056b.m28522a(1, this.f27494b) + 0;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 8) {
                    this.f27494b = aVar.mo62625i();
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$n */
    public static final class C11450n extends C11169e {

        /* renamed from: h */
        private static volatile C11450n[] f27533h;

        /* renamed from: b */
        public String f27534b;

        /* renamed from: c */
        public String f27535c;

        /* renamed from: d */
        public String f27536d;

        /* renamed from: e */
        public C11451a[] f27537e;

        /* renamed from: f */
        public long f27538f;

        /* renamed from: g */
        public int[] f27539g;

        public C11450n() {
            mo63210b();
        }

        /* renamed from: c */
        public static C11450n[] m29573c() {
            if (f27533h == null) {
                synchronized (C11095c.f26635a) {
                    if (f27533h == null) {
                        f27533h = new C11450n[0];
                    }
                }
            }
            return f27533h;
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62666b(1, this.f27534b);
            bVar.mo62666b(2, this.f27535c);
            bVar.mo62666b(3, this.f27536d);
            C11451a[] aVarArr = this.f27537e;
            int i = 0;
            if (aVarArr != null && aVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C11451a[] aVarArr2 = this.f27537e;
                    if (i2 >= aVarArr2.length) {
                        break;
                    }
                    C11451a aVar = aVarArr2[i2];
                    if (aVar != null) {
                        bVar.mo62665b(4, (C11169e) aVar);
                    }
                    i2++;
                }
            }
            bVar.mo62670c(5, this.f27538f);
            int[] iArr = this.f27539g;
            if (iArr != null && iArr.length > 0) {
                while (true) {
                    int[] iArr2 = this.f27539g;
                    if (i < iArr2.length) {
                        bVar.mo62672d(6, iArr2[i]);
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public C11450n mo63210b() {
            this.f27534b = "";
            this.f27535c = "";
            this.f27536d = "";
            this.f27537e = C11451a.m29578c();
            this.f27538f = 0;
            this.f27539g = C11256g.f26927a;
            this.f26754a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.kg$n$a */
        public static final class C11451a extends C11169e {

            /* renamed from: d */
            private static volatile C11451a[] f27540d;

            /* renamed from: b */
            public String f27541b;

            /* renamed from: c */
            public String f27542c;

            public C11451a() {
                mo63211b();
            }

            /* renamed from: c */
            public static C11451a[] m29578c() {
                if (f27540d == null) {
                    synchronized (C11095c.f26635a) {
                        if (f27540d == null) {
                            f27540d = new C11451a[0];
                        }
                    }
                }
                return f27540d;
            }

            /* renamed from: a */
            public void mo61540a(C11056b bVar) throws IOException {
                bVar.mo62666b(1, this.f27541b);
                bVar.mo62666b(2, this.f27542c);
            }

            /* renamed from: b */
            public C11451a mo63211b() {
                this.f27541b = "";
                this.f27542c = "";
                this.f26754a = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo61538a() {
                return C11056b.m28524a(1, this.f27541b) + 0 + C11056b.m28524a(2, this.f27542c);
            }

            /* renamed from: a */
            public C11169e mo61539a(C11009a aVar) throws IOException {
                while (true) {
                    int l = aVar.mo62628l();
                    if (l == 0) {
                        break;
                    } else if (l == 10) {
                        this.f27541b = aVar.mo62627k();
                    } else if (l == 18) {
                        this.f27542c = aVar.mo62627k();
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
            int a = C11056b.m28524a(1, this.f27534b) + 0 + C11056b.m28524a(2, this.f27535c) + C11056b.m28524a(3, this.f27536d);
            C11451a[] aVarArr = this.f27537e;
            if (aVarArr != null && aVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C11451a[] aVarArr2 = this.f27537e;
                    if (i2 >= aVarArr2.length) {
                        break;
                    }
                    C11451a aVar = aVarArr2[i2];
                    if (aVar != null) {
                        a += C11056b.m28523a(4, (C11169e) aVar);
                    }
                    i2++;
                }
            }
            int a2 = a + C11056b.m28522a(5, this.f27538f);
            int[] iArr = this.f27539g;
            if (iArr == null || iArr.length <= 0) {
                return a2;
            }
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.f27539g;
                if (i >= iArr2.length) {
                    return a2 + i3 + (iArr2.length * 1);
                }
                i3 += C11056b.m28519a(iArr2[i]);
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
                    this.f27534b = aVar.mo62627k();
                } else if (l == 18) {
                    this.f27535c = aVar.mo62627k();
                } else if (l == 26) {
                    this.f27536d = aVar.mo62627k();
                } else if (l == 34) {
                    int a = C11256g.m29012a(aVar, 34);
                    C11451a[] aVarArr = this.f27537e;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i = a + length;
                    C11451a[] aVarArr2 = new C11451a[i];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        aVarArr2[length] = new C11451a();
                        aVar.mo62611a((C11169e) aVarArr2[length]);
                        aVar.mo62628l();
                        length++;
                    }
                    aVarArr2[length] = new C11451a();
                    aVar.mo62611a((C11169e) aVarArr2[length]);
                    this.f27537e = aVarArr2;
                } else if (l == 40) {
                    this.f27538f = aVar.mo62625i();
                } else if (l == 48) {
                    int a2 = C11256g.m29012a(aVar, 48);
                    int[] iArr = new int[a2];
                    int i2 = 0;
                    for (int i3 = 0; i3 < a2; i3++) {
                        if (i3 != 0) {
                            aVar.mo62628l();
                        }
                        int h = aVar.mo62624h();
                        if (h == 1 || h == 2) {
                            iArr[i2] = h;
                            i2++;
                        }
                    }
                    if (i2 != 0) {
                        int[] iArr2 = this.f27539g;
                        int length2 = iArr2 == null ? 0 : iArr2.length;
                        if (length2 == 0 && i2 == a2) {
                            this.f27539g = iArr;
                        } else {
                            int[] iArr3 = new int[(length2 + i2)];
                            if (length2 != 0) {
                                System.arraycopy(iArr2, 0, iArr3, 0, length2);
                            }
                            System.arraycopy(iArr, 0, iArr3, length2, i2);
                            this.f27539g = iArr3;
                        }
                    }
                } else if (l == 50) {
                    int c = aVar.mo62614c(aVar.mo62624h());
                    int b = aVar.mo62612b();
                    int i4 = 0;
                    while (aVar.mo62609a() > 0) {
                        int h2 = aVar.mo62624h();
                        if (h2 == 1 || h2 == 2) {
                            i4++;
                        }
                    }
                    if (i4 != 0) {
                        aVar.mo62619e(b);
                        int[] iArr4 = this.f27539g;
                        int length3 = iArr4 == null ? 0 : iArr4.length;
                        int[] iArr5 = new int[(i4 + length3)];
                        if (length3 != 0) {
                            System.arraycopy(iArr4, 0, iArr5, 0, length3);
                        }
                        while (aVar.mo62609a() > 0) {
                            int h3 = aVar.mo62624h();
                            if (h3 == 1 || h3 == 2) {
                                iArr5[length3] = h3;
                                length3++;
                            }
                        }
                        this.f27539g = iArr5;
                    }
                    aVar.mo62613b(c);
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$r */
    public static final class C11455r extends C11169e {

        /* renamed from: b */
        public long f27558b;

        public C11455r() {
            mo63215b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62670c(1, this.f27558b);
        }

        /* renamed from: b */
        public C11455r mo63215b() {
            this.f27558b = 18000000;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            return C11056b.m28522a(1, this.f27558b) + 0;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 8) {
                    this.f27558b = aVar.mo62625i();
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$y */
    public static final class C11462y extends C11169e {

        /* renamed from: b */
        public long f27592b;

        /* renamed from: c */
        public boolean f27593c;

        /* renamed from: d */
        public C11463a[] f27594d;

        public C11462y() {
            mo63222b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62670c(1, this.f27592b);
            bVar.mo62667b(2, this.f27593c);
            C11463a[] aVarArr = this.f27594d;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C11463a[] aVarArr2 = this.f27594d;
                    if (i < aVarArr2.length) {
                        C11463a aVar = aVarArr2[i];
                        if (aVar != null) {
                            bVar.mo62665b(5, (C11169e) aVar);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public C11462y mo63222b() {
            this.f27592b = 60000;
            this.f27593c = false;
            this.f27594d = C11463a.m29628c();
            this.f26754a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.kg$y$a */
        public static final class C11463a extends C11169e {

            /* renamed from: d */
            private static volatile C11463a[] f27595d;

            /* renamed from: b */
            public long f27596b;

            /* renamed from: c */
            public long f27597c;

            public C11463a() {
                mo63223b();
            }

            /* renamed from: c */
            public static C11463a[] m29628c() {
                if (f27595d == null) {
                    synchronized (C11095c.f26635a) {
                        if (f27595d == null) {
                            f27595d = new C11463a[0];
                        }
                    }
                }
                return f27595d;
            }

            /* renamed from: a */
            public void mo61540a(C11056b bVar) throws IOException {
                bVar.mo62670c(1, this.f27596b);
                bVar.mo62670c(2, this.f27597c);
            }

            /* renamed from: b */
            public C11463a mo63223b() {
                this.f27596b = 0;
                this.f27597c = 0;
                this.f26754a = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo61538a() {
                return C11056b.m28522a(1, this.f27596b) + 0 + C11056b.m28522a(2, this.f27597c);
            }

            /* renamed from: a */
            public C11169e mo61539a(C11009a aVar) throws IOException {
                while (true) {
                    int l = aVar.mo62628l();
                    if (l == 0) {
                        break;
                    } else if (l == 8) {
                        this.f27596b = aVar.mo62625i();
                    } else if (l == 16) {
                        this.f27597c = aVar.mo62625i();
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
            int a = C11056b.m28522a(1, this.f27592b) + 0 + C11056b.m28525a(2, this.f27593c);
            C11463a[] aVarArr = this.f27594d;
            if (aVarArr != null && aVarArr.length > 0) {
                while (true) {
                    C11463a[] aVarArr2 = this.f27594d;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C11463a aVar = aVarArr2[i];
                    if (aVar != null) {
                        a += C11056b.m28523a(5, (C11169e) aVar);
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
                } else if (l == 8) {
                    this.f27592b = aVar.mo62625i();
                } else if (l == 16) {
                    this.f27593c = aVar.mo62615c();
                } else if (l == 42) {
                    int a = C11256g.m29012a(aVar, 42);
                    C11463a[] aVarArr = this.f27594d;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i = a + length;
                    C11463a[] aVarArr2 = new C11463a[i];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        aVarArr2[length] = new C11463a();
                        aVar.mo62611a((C11169e) aVarArr2[length]);
                        aVar.mo62628l();
                        length++;
                    }
                    aVarArr2[length] = new C11463a();
                    aVar.mo62611a((C11169e) aVarArr2[length]);
                    this.f27594d = aVarArr2;
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    public C11428kg() {
        mo63188b();
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        if (!this.f27419b.equals("")) {
            bVar.mo62666b(1, this.f27419b);
        }
        bVar.mo62670c(3, this.f27420c);
        String[] strArr = this.f27421d;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.f27421d;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    bVar.mo62666b(4, str);
                }
                i2++;
            }
        }
        if (!this.f27422e.equals("")) {
            bVar.mo62666b(5, this.f27422e);
        }
        if (!this.f27423f.equals("")) {
            bVar.mo62666b(6, this.f27423f);
        }
        String[] strArr3 = this.f27424g;
        if (strArr3 != null && strArr3.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr4 = this.f27424g;
                if (i3 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i3];
                if (str2 != null) {
                    bVar.mo62666b(7, str2);
                }
                i3++;
            }
        }
        String[] strArr5 = this.f27425h;
        if (strArr5 != null && strArr5.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr6 = this.f27425h;
                if (i4 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i4];
                if (str3 != null) {
                    bVar.mo62666b(8, str3);
                }
                i4++;
            }
        }
        String[] strArr7 = this.f27426i;
        if (strArr7 != null && strArr7.length > 0) {
            int i5 = 0;
            while (true) {
                String[] strArr8 = this.f27426i;
                if (i5 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i5];
                if (str4 != null) {
                    bVar.mo62666b(9, str4);
                }
                i5++;
            }
        }
        C11439i iVar = this.f27429l;
        if (iVar != null) {
            bVar.mo62665b(10, (C11169e) iVar);
        }
        C11441k[] kVarArr = this.f27430m;
        if (kVarArr != null && kVarArr.length > 0) {
            int i6 = 0;
            while (true) {
                C11441k[] kVarArr2 = this.f27430m;
                if (i6 >= kVarArr2.length) {
                    break;
                }
                C11441k kVar = kVarArr2[i6];
                if (kVar != null) {
                    bVar.mo62665b(11, (C11169e) kVar);
                }
                i6++;
            }
        }
        C11462y yVar = this.f27431n;
        if (yVar != null) {
            bVar.mo62665b(12, (C11169e) yVar);
        }
        C11453p pVar = this.f27432o;
        if (pVar != null) {
            bVar.mo62665b(13, (C11169e) pVar);
        }
        C11450n[] nVarArr = this.f27433p;
        if (nVarArr != null && nVarArr.length > 0) {
            int i7 = 0;
            while (true) {
                C11450n[] nVarArr2 = this.f27433p;
                if (i7 >= nVarArr2.length) {
                    break;
                }
                C11450n nVar = nVarArr2[i7];
                if (nVar != null) {
                    bVar.mo62665b(14, (C11169e) nVar);
                }
                i7++;
            }
        }
        if (!this.f27434q.equals("")) {
            bVar.mo62666b(15, this.f27434q);
        }
        if (!this.f27435r.equals("")) {
            bVar.mo62666b(16, this.f27435r);
        }
        bVar.mo62667b(17, this.f27437t);
        if (!this.f27438u.equals("")) {
            bVar.mo62666b(19, this.f27438u);
        }
        String[] strArr9 = this.f27439v;
        if (strArr9 != null && strArr9.length > 0) {
            int i8 = 0;
            while (true) {
                String[] strArr10 = this.f27439v;
                if (i8 >= strArr10.length) {
                    break;
                }
                String str5 = strArr10[i8];
                if (str5 != null) {
                    bVar.mo62666b(20, str5);
                }
                i8++;
            }
        }
        C11455r rVar = this.f27440w;
        if (rVar != null) {
            bVar.mo62665b(21, (C11169e) rVar);
        }
        boolean z = this.f27441x;
        if (z) {
            bVar.mo62667b(22, z);
        }
        C11448l[] lVarArr = this.f27442y;
        if (lVarArr != null && lVarArr.length > 0) {
            int i9 = 0;
            while (true) {
                C11448l[] lVarArr2 = this.f27442y;
                if (i9 >= lVarArr2.length) {
                    break;
                }
                C11448l lVar = lVarArr2[i9];
                if (lVar != null) {
                    bVar.mo62665b(23, (C11169e) lVar);
                }
                i9++;
            }
        }
        C11452o oVar = this.f27443z;
        if (oVar != null) {
            bVar.mo62665b(24, (C11169e) oVar);
        }
        if (!this.f27394A.equals("")) {
            bVar.mo62666b(25, this.f27394A);
        }
        if (!this.f27395B.equals("")) {
            bVar.mo62666b(26, this.f27395B);
        }
        if (!this.f27397D.equals("")) {
            bVar.mo62666b(27, this.f27397D);
        }
        bVar.mo62670c(28, this.f27399F);
        bVar.mo62670c(29, this.f27400G);
        boolean z2 = this.f27401H;
        if (z2) {
            bVar.mo62667b(30, z2);
        }
        if (!this.f27396C.equals("")) {
            bVar.mo62666b(31, this.f27396C);
        }
        C11449m mVar = this.f27402I;
        if (mVar != null) {
            bVar.mo62665b(32, (C11169e) mVar);
        }
        C11440j jVar = this.f27403J;
        if (jVar != null) {
            bVar.mo62665b(33, (C11169e) jVar);
        }
        bVar.mo62672d(35, this.f27404K);
        bVar.mo62672d(36, this.f27405L);
        C11459v vVar = this.f27406M;
        if (vVar != null) {
            bVar.mo62665b(37, (C11169e) vVar);
        }
        C11458u uVar = this.f27407N;
        if (uVar != null) {
            bVar.mo62665b(38, (C11169e) uVar);
        }
        C11458u uVar2 = this.f27408O;
        if (uVar2 != null) {
            bVar.mo62665b(39, (C11169e) uVar2);
        }
        C11456s sVar = this.f27410Q;
        if (sVar != null) {
            bVar.mo62665b(41, (C11169e) sVar);
        }
        C11433c cVar = this.f27411R;
        if (cVar != null) {
            bVar.mo62665b(42, (C11169e) cVar);
        }
        C11458u uVar3 = this.f27409P;
        if (uVar3 != null) {
            bVar.mo62665b(43, (C11169e) uVar3);
        }
        if (!this.f27436s.equals("")) {
            bVar.mo62666b(44, this.f27436s);
        }
        C11436f fVar = this.f27412S;
        if (fVar != null) {
            bVar.mo62665b(45, (C11169e) fVar);
        }
        String[] strArr11 = this.f27427j;
        if (strArr11 != null && strArr11.length > 0) {
            int i10 = 0;
            while (true) {
                String[] strArr12 = this.f27427j;
                if (i10 >= strArr12.length) {
                    break;
                }
                String str6 = strArr12[i10];
                if (str6 != null) {
                    bVar.mo62666b(46, str6);
                }
                i10++;
            }
        }
        String[] strArr13 = this.f27413T;
        if (strArr13 != null && strArr13.length > 0) {
            int i11 = 0;
            while (true) {
                String[] strArr14 = this.f27413T;
                if (i11 >= strArr14.length) {
                    break;
                }
                String str7 = strArr14[i11];
                if (str7 != null) {
                    bVar.mo62666b(47, str7);
                }
                i11++;
            }
        }
        C11432b bVar2 = this.f27414U;
        if (bVar2 != null) {
            bVar.mo62665b(48, (C11169e) bVar2);
        }
        if (!this.f27398E.equals("")) {
            bVar.mo62666b(49, this.f27398E);
        }
        C11429a aVar = this.f27415V;
        if (aVar != null) {
            bVar.mo62665b(51, (C11169e) aVar);
        }
        C11438h hVar = this.f27416W;
        if (hVar != null) {
            bVar.mo62665b(52, (C11169e) hVar);
        }
        C11437g gVar = this.f27417X;
        if (gVar != null) {
            bVar.mo62665b(53, (C11169e) gVar);
        }
        C11434d[] dVarArr = this.f27428k;
        if (dVarArr != null && dVarArr.length > 0) {
            while (true) {
                C11434d[] dVarArr2 = this.f27428k;
                if (i >= dVarArr2.length) {
                    break;
                }
                C11434d dVar = dVarArr2[i];
                if (dVar != null) {
                    bVar.mo62665b(54, (C11169e) dVar);
                }
                i++;
            }
        }
        C11454q qVar = this.f27418Y;
        if (qVar != null) {
            bVar.mo62665b(55, (C11169e) qVar);
        }
    }

    /* renamed from: b */
    public C11428kg mo63188b() {
        this.f27419b = "";
        this.f27420c = 0;
        String[] strArr = C11256g.f26928b;
        this.f27421d = strArr;
        this.f27422e = "";
        this.f27423f = "";
        this.f27424g = strArr;
        this.f27425h = strArr;
        this.f27426i = strArr;
        this.f27427j = strArr;
        this.f27428k = C11434d.m29506c();
        this.f27429l = null;
        this.f27430m = C11441k.m29535c();
        this.f27431n = null;
        this.f27432o = null;
        this.f27433p = C11450n.m29573c();
        this.f27434q = "";
        this.f27435r = "";
        this.f27436s = "";
        this.f27437t = false;
        this.f27438u = "";
        this.f27439v = strArr;
        this.f27440w = null;
        this.f27441x = false;
        this.f27442y = C11448l.m29564c();
        this.f27443z = null;
        this.f27394A = "";
        this.f27395B = "";
        this.f27396C = "";
        this.f27397D = "";
        this.f27398E = "";
        this.f27399F = 0;
        this.f27400G = 0;
        this.f27401H = false;
        this.f27402I = null;
        this.f27403J = null;
        this.f27404K = 600;
        this.f27405L = 1;
        this.f27406M = null;
        this.f27407N = null;
        this.f27408O = null;
        this.f27409P = null;
        this.f27410Q = null;
        this.f27411R = null;
        this.f27412S = null;
        this.f27413T = strArr;
        this.f27414U = null;
        this.f27415V = null;
        this.f27416W = null;
        this.f27417X = null;
        this.f27418Y = null;
        this.f26754a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$g */
    public static final class C11437g extends C11169e {

        /* renamed from: b */
        public long f27463b;

        public C11437g() {
            mo63197b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            long j = this.f27463b;
            if (j != 1209600) {
                bVar.mo62676e(1, j);
            }
        }

        /* renamed from: b */
        public C11437g mo63197b() {
            this.f27463b = 1209600;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            long j = this.f27463b;
            if (j != 1209600) {
                return 0 + C11056b.m28533b(1, j);
            }
            return 0;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 8) {
                    this.f27463b = aVar.mo62625i();
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$l */
    public static final class C11448l extends C11169e {

        /* renamed from: d */
        private static volatile C11448l[] f27528d;

        /* renamed from: b */
        public String f27529b;

        /* renamed from: c */
        public boolean f27530c;

        public C11448l() {
            mo63208b();
        }

        /* renamed from: c */
        public static C11448l[] m29564c() {
            if (f27528d == null) {
                synchronized (C11095c.f26635a) {
                    if (f27528d == null) {
                        f27528d = new C11448l[0];
                    }
                }
            }
            return f27528d;
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62666b(1, this.f27529b);
            bVar.mo62667b(2, this.f27530c);
        }

        /* renamed from: b */
        public C11448l mo63208b() {
            this.f27529b = "";
            this.f27530c = false;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            return C11056b.m28524a(1, this.f27529b) + 0 + C11056b.m28525a(2, this.f27530c);
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    this.f27529b = aVar.mo62627k();
                } else if (l == 16) {
                    this.f27530c = aVar.mo62615c();
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$m */
    public static final class C11449m extends C11169e {

        /* renamed from: b */
        public long f27531b;

        /* renamed from: c */
        public long f27532c;

        public C11449m() {
            mo63209b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62670c(1, this.f27531b);
            bVar.mo62670c(2, this.f27532c);
        }

        /* renamed from: b */
        public C11449m mo63209b() {
            this.f27531b = 86400;
            this.f27532c = 432000;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            return C11056b.m28522a(1, this.f27531b) + 0 + C11056b.m28522a(2, this.f27532c);
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 8) {
                    this.f27531b = aVar.mo62625i();
                } else if (l == 16) {
                    this.f27532c = aVar.mo62625i();
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$q */
    public static final class C11454q extends C11169e {

        /* renamed from: b */
        public int f27557b;

        public C11454q() {
            mo63214b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            int i = this.f27557b;
            if (i != 86400) {
                bVar.mo62677f(1, i);
            }
        }

        /* renamed from: b */
        public C11454q mo63214b() {
            this.f27557b = 86400;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            int i = this.f27557b;
            if (i != 86400) {
                return 0 + C11056b.m28535c(1, i);
            }
            return 0;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 8) {
                    this.f27557b = aVar.mo62624h();
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$w */
    public static final class C11460w extends C11169e {

        /* renamed from: b */
        public boolean f27587b;

        /* renamed from: c */
        public boolean f27588c;

        public C11460w() {
            mo63220b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62667b(1, this.f27587b);
            bVar.mo62667b(2, this.f27588c);
        }

        /* renamed from: b */
        public C11460w mo63220b() {
            this.f27587b = true;
            this.f27588c = false;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            return C11056b.m28525a(1, this.f27587b) + 0 + C11056b.m28525a(2, this.f27588c);
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 8) {
                    this.f27587b = aVar.mo62615c();
                } else if (l == 16) {
                    this.f27588c = aVar.mo62615c();
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$x */
    public static final class C11461x extends C11169e {

        /* renamed from: d */
        private static volatile C11461x[] f27589d;

        /* renamed from: b */
        public int f27590b;

        /* renamed from: c */
        public String f27591c;

        public C11461x() {
            mo63221b();
        }

        /* renamed from: c */
        public static C11461x[] m29619c() {
            if (f27589d == null) {
                synchronized (C11095c.f26635a) {
                    if (f27589d == null) {
                        f27589d = new C11461x[0];
                    }
                }
            }
            return f27589d;
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62672d(1, this.f27590b);
            bVar.mo62666b(2, this.f27591c);
        }

        /* renamed from: b */
        public C11461x mo63221b() {
            this.f27590b = 0;
            this.f27591c = "";
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            return C11056b.m28521a(1, this.f27590b) + 0 + C11056b.m28524a(2, this.f27591c);
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 8) {
                    int h = aVar.mo62624h();
                    if (h == 0 || h == 1 || h == 2 || h == 3) {
                        this.f27590b = h;
                    }
                } else if (l == 18) {
                    this.f27591c = aVar.mo62627k();
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$e */
    public static final class C11435e extends C11169e {

        /* renamed from: b */
        public long f27458b;

        /* renamed from: c */
        public int f27459c;

        public C11435e() {
            mo63195b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62670c(1, this.f27458b);
            int i = this.f27459c;
            if (i != 86400) {
                bVar.mo62672d(2, i);
            }
        }

        /* renamed from: b */
        public C11435e mo63195b() {
            this.f27458b = 0;
            this.f27459c = 86400;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            int a = C11056b.m28522a(1, this.f27458b) + 0;
            int i = this.f27459c;
            return i != 86400 ? a + C11056b.m28521a(2, i) : a;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 8) {
                    this.f27458b = aVar.mo62625i();
                } else if (l == 16) {
                    this.f27459c = aVar.mo62624h();
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$b */
    public static final class C11432b extends C11169e {

        /* renamed from: b */
        public int f27449b;

        /* renamed from: c */
        public int f27450c;

        public C11432b() {
            mo63192b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            int i = this.f27449b;
            if (i != 86400) {
                bVar.mo62672d(1, i);
            }
            int i2 = this.f27450c;
            if (i2 != 86400) {
                bVar.mo62672d(2, i2);
            }
        }

        /* renamed from: b */
        public C11432b mo63192b() {
            this.f27449b = 86400;
            this.f27450c = 86400;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            int i = this.f27449b;
            int i2 = 0;
            if (i != 86400) {
                i2 = 0 + C11056b.m28521a(1, i);
            }
            int i3 = this.f27450c;
            return i3 != 86400 ? i2 + C11056b.m28521a(2, i3) : i2;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 8) {
                    this.f27449b = aVar.mo62624h();
                } else if (l == 16) {
                    this.f27450c = aVar.mo62624h();
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$k */
    public static final class C11441k extends C11169e {

        /* renamed from: d */
        private static volatile C11441k[] f27495d;

        /* renamed from: b */
        public C11442a f27496b;

        /* renamed from: c */
        public C11447b f27497c;

        /* renamed from: com.yandex.metrica.impl.ob.kg$k$a */
        public static final class C11442a extends C11169e {

            /* renamed from: b */
            public long f27498b;

            /* renamed from: c */
            public float f27499c;

            /* renamed from: d */
            public int f27500d;

            /* renamed from: e */
            public int f27501e;

            /* renamed from: f */
            public long f27502f;

            /* renamed from: g */
            public int f27503g;

            /* renamed from: h */
            public boolean f27504h;

            /* renamed from: i */
            public boolean f27505i;

            /* renamed from: j */
            public boolean f27506j;

            /* renamed from: k */
            public long f27507k;

            /* renamed from: l */
            public C11443a f27508l;

            /* renamed from: m */
            public C11443a f27509m;

            /* renamed from: n */
            public C11443a f27510n;

            /* renamed from: o */
            public C11443a f27511o;

            /* renamed from: p */
            public C11445b f27512p;

            /* renamed from: q */
            public boolean f27513q;

            /* renamed from: r */
            public boolean f27514r;

            /* renamed from: com.yandex.metrica.impl.ob.kg$k$a$a */
            public static final class C11443a extends C11169e {

                /* renamed from: b */
                public boolean f27515b;

                /* renamed from: c */
                public boolean f27516c;

                /* renamed from: d */
                public C11444a f27517d;

                public C11443a() {
                    mo63203b();
                }

                /* renamed from: a */
                public void mo61540a(C11056b bVar) throws IOException {
                    bVar.mo62667b(1, this.f27515b);
                    bVar.mo62667b(2, this.f27516c);
                    C11444a aVar = this.f27517d;
                    if (aVar != null) {
                        bVar.mo62665b(3, (C11169e) aVar);
                    }
                }

                /* renamed from: b */
                public C11443a mo63203b() {
                    this.f27515b = true;
                    this.f27516c = false;
                    this.f27517d = null;
                    this.f26754a = -1;
                    return this;
                }

                /* renamed from: com.yandex.metrica.impl.ob.kg$k$a$a$a */
                public static final class C11444a extends C11169e {

                    /* renamed from: b */
                    public long f27518b;

                    /* renamed from: c */
                    public long f27519c;

                    public C11444a() {
                        mo63204b();
                    }

                    /* renamed from: a */
                    public void mo61540a(C11056b bVar) throws IOException {
                        bVar.mo62670c(1, this.f27518b);
                        bVar.mo62670c(2, this.f27519c);
                    }

                    /* renamed from: b */
                    public C11444a mo63204b() {
                        this.f27518b = 0;
                        this.f27519c = 0;
                        this.f26754a = -1;
                        return this;
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public int mo61538a() {
                        return C11056b.m28522a(1, this.f27518b) + 0 + C11056b.m28522a(2, this.f27519c);
                    }

                    /* renamed from: a */
                    public C11169e mo61539a(C11009a aVar) throws IOException {
                        while (true) {
                            int l = aVar.mo62628l();
                            if (l == 0) {
                                break;
                            } else if (l == 8) {
                                this.f27518b = aVar.mo62625i();
                            } else if (l == 16) {
                                this.f27519c = aVar.mo62625i();
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
                    int a = C11056b.m28525a(1, this.f27515b) + 0 + C11056b.m28525a(2, this.f27516c);
                    C11444a aVar = this.f27517d;
                    return aVar != null ? a + C11056b.m28523a(3, (C11169e) aVar) : a;
                }

                /* renamed from: a */
                public C11169e mo61539a(C11009a aVar) throws IOException {
                    while (true) {
                        int l = aVar.mo62628l();
                        if (l == 0) {
                            break;
                        } else if (l == 8) {
                            this.f27515b = aVar.mo62615c();
                        } else if (l == 16) {
                            this.f27516c = aVar.mo62615c();
                        } else if (l == 26) {
                            if (this.f27517d == null) {
                                this.f27517d = new C11444a();
                            }
                            aVar.mo62611a((C11169e) this.f27517d);
                        } else if (!aVar.mo62621f(l)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            public C11442a() {
                mo63202b();
            }

            /* renamed from: a */
            public void mo61540a(C11056b bVar) throws IOException {
                bVar.mo62670c(1, this.f27498b);
                bVar.mo62662a(2, this.f27499c);
                bVar.mo62672d(3, this.f27500d);
                bVar.mo62672d(4, this.f27501e);
                bVar.mo62670c(5, this.f27502f);
                bVar.mo62672d(6, this.f27503g);
                bVar.mo62667b(7, this.f27504h);
                bVar.mo62667b(8, this.f27505i);
                bVar.mo62670c(9, this.f27507k);
                C11443a aVar = this.f27508l;
                if (aVar != null) {
                    bVar.mo62665b(10, (C11169e) aVar);
                }
                C11443a aVar2 = this.f27509m;
                if (aVar2 != null) {
                    bVar.mo62665b(11, (C11169e) aVar2);
                }
                C11443a aVar3 = this.f27510n;
                if (aVar3 != null) {
                    bVar.mo62665b(12, (C11169e) aVar3);
                }
                bVar.mo62667b(13, this.f27506j);
                C11443a aVar4 = this.f27511o;
                if (aVar4 != null) {
                    bVar.mo62665b(14, (C11169e) aVar4);
                }
                C11445b bVar2 = this.f27512p;
                if (bVar2 != null) {
                    bVar.mo62665b(15, (C11169e) bVar2);
                }
                boolean z = this.f27513q;
                if (z) {
                    bVar.mo62667b(16, z);
                }
                boolean z2 = this.f27514r;
                if (z2) {
                    bVar.mo62667b(17, z2);
                }
            }

            /* renamed from: b */
            public C11442a mo63202b() {
                this.f27498b = 5000;
                this.f27499c = 10.0f;
                this.f27500d = 20;
                this.f27501e = 200;
                this.f27502f = 60000;
                this.f27503g = 10000;
                this.f27504h = false;
                this.f27505i = false;
                this.f27506j = true;
                this.f27507k = 60000;
                this.f27508l = null;
                this.f27509m = null;
                this.f27510n = null;
                this.f27511o = null;
                this.f27512p = null;
                this.f27513q = false;
                this.f27514r = false;
                this.f26754a = -1;
                return this;
            }

            /* renamed from: com.yandex.metrica.impl.ob.kg$k$a$b */
            public static final class C11445b extends C11169e {

                /* renamed from: b */
                public boolean f27520b;

                /* renamed from: c */
                public boolean f27521c;

                /* renamed from: d */
                public C11446a f27522d;

                public C11445b() {
                    mo63205b();
                }

                /* renamed from: a */
                public void mo61540a(C11056b bVar) throws IOException {
                    bVar.mo62667b(1, this.f27520b);
                    bVar.mo62667b(2, this.f27521c);
                    C11446a aVar = this.f27522d;
                    if (aVar != null) {
                        bVar.mo62665b(3, (C11169e) aVar);
                    }
                }

                /* renamed from: b */
                public C11445b mo63205b() {
                    this.f27520b = true;
                    this.f27521c = false;
                    this.f27522d = null;
                    this.f26754a = -1;
                    return this;
                }

                /* renamed from: com.yandex.metrica.impl.ob.kg$k$a$b$a */
                public static final class C11446a extends C11169e {

                    /* renamed from: b */
                    public long f27523b;

                    /* renamed from: c */
                    public long f27524c;

                    /* renamed from: d */
                    public int f27525d;

                    public C11446a() {
                        mo63206b();
                    }

                    /* renamed from: a */
                    public void mo61540a(C11056b bVar) throws IOException {
                        bVar.mo62670c(1, this.f27523b);
                        bVar.mo62670c(2, this.f27524c);
                        bVar.mo62672d(3, this.f27525d);
                    }

                    /* renamed from: b */
                    public C11446a mo63206b() {
                        this.f27523b = 0;
                        this.f27524c = 0;
                        this.f27525d = 0;
                        this.f26754a = -1;
                        return this;
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public int mo61538a() {
                        return C11056b.m28522a(1, this.f27523b) + 0 + C11056b.m28522a(2, this.f27524c) + C11056b.m28521a(3, this.f27525d);
                    }

                    /* renamed from: a */
                    public C11169e mo61539a(C11009a aVar) throws IOException {
                        while (true) {
                            int l = aVar.mo62628l();
                            if (l == 0) {
                                break;
                            } else if (l == 8) {
                                this.f27523b = aVar.mo62625i();
                            } else if (l == 16) {
                                this.f27524c = aVar.mo62625i();
                            } else if (l == 24) {
                                int h = aVar.mo62624h();
                                if (h == 0 || h == 1 || h == 2 || h == 3) {
                                    this.f27525d = h;
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
                    int a = C11056b.m28525a(1, this.f27520b) + 0 + C11056b.m28525a(2, this.f27521c);
                    C11446a aVar = this.f27522d;
                    return aVar != null ? a + C11056b.m28523a(3, (C11169e) aVar) : a;
                }

                /* renamed from: a */
                public C11169e mo61539a(C11009a aVar) throws IOException {
                    while (true) {
                        int l = aVar.mo62628l();
                        if (l == 0) {
                            break;
                        } else if (l == 8) {
                            this.f27520b = aVar.mo62615c();
                        } else if (l == 16) {
                            this.f27521c = aVar.mo62615c();
                        } else if (l == 26) {
                            if (this.f27522d == null) {
                                this.f27522d = new C11446a();
                            }
                            aVar.mo62611a((C11169e) this.f27522d);
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
                int a = C11056b.m28522a(1, this.f27498b) + 0 + C11056b.m28534c(2) + 4 + C11056b.m28521a(3, this.f27500d) + C11056b.m28521a(4, this.f27501e) + C11056b.m28522a(5, this.f27502f) + C11056b.m28521a(6, this.f27503g) + C11056b.m28525a(7, this.f27504h) + C11056b.m28525a(8, this.f27505i) + C11056b.m28522a(9, this.f27507k);
                C11443a aVar = this.f27508l;
                if (aVar != null) {
                    a += C11056b.m28523a(10, (C11169e) aVar);
                }
                C11443a aVar2 = this.f27509m;
                if (aVar2 != null) {
                    a += C11056b.m28523a(11, (C11169e) aVar2);
                }
                C11443a aVar3 = this.f27510n;
                if (aVar3 != null) {
                    a += C11056b.m28523a(12, (C11169e) aVar3);
                }
                int a2 = a + C11056b.m28525a(13, this.f27506j);
                C11443a aVar4 = this.f27511o;
                if (aVar4 != null) {
                    a2 += C11056b.m28523a(14, (C11169e) aVar4);
                }
                C11445b bVar = this.f27512p;
                if (bVar != null) {
                    a2 += C11056b.m28523a(15, (C11169e) bVar);
                }
                boolean z = this.f27513q;
                if (z) {
                    a2 += C11056b.m28525a(16, z);
                }
                boolean z2 = this.f27514r;
                return z2 ? a2 + C11056b.m28525a(17, z2) : a2;
            }

            /* renamed from: a */
            public C11169e mo61539a(C11009a aVar) throws IOException {
                while (true) {
                    int l = aVar.mo62628l();
                    switch (l) {
                        case 0:
                            break;
                        case 8:
                            this.f27498b = aVar.mo62625i();
                            continue;
                        case 21:
                            this.f27499c = Float.intBitsToFloat(aVar.mo62620f());
                            continue;
                        case 24:
                            this.f27500d = aVar.mo62624h();
                            continue;
                        case 32:
                            this.f27501e = aVar.mo62624h();
                            continue;
                        case 40:
                            this.f27502f = aVar.mo62625i();
                            continue;
                        case 48:
                            this.f27503g = aVar.mo62624h();
                            continue;
                        case 56:
                            this.f27504h = aVar.mo62615c();
                            continue;
                        case 64:
                            this.f27505i = aVar.mo62615c();
                            continue;
                        case 72:
                            this.f27507k = aVar.mo62625i();
                            continue;
                        case 82:
                            if (this.f27508l == null) {
                                this.f27508l = new C11443a();
                            }
                            aVar.mo62611a((C11169e) this.f27508l);
                            continue;
                        case 90:
                            if (this.f27509m == null) {
                                this.f27509m = new C11443a();
                            }
                            aVar.mo62611a((C11169e) this.f27509m);
                            continue;
                        case 98:
                            if (this.f27510n == null) {
                                this.f27510n = new C11443a();
                            }
                            aVar.mo62611a((C11169e) this.f27510n);
                            continue;
                        case 104:
                            this.f27506j = aVar.mo62615c();
                            continue;
                        case 114:
                            if (this.f27511o == null) {
                                this.f27511o = new C11443a();
                            }
                            aVar.mo62611a((C11169e) this.f27511o);
                            continue;
                        case 122:
                            if (this.f27512p == null) {
                                this.f27512p = new C11445b();
                            }
                            aVar.mo62611a((C11169e) this.f27512p);
                            continue;
                        case 128:
                            this.f27513q = aVar.mo62615c();
                            continue;
                        case 136:
                            this.f27514r = aVar.mo62615c();
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

        public C11441k() {
            mo63201b();
        }

        /* renamed from: c */
        public static C11441k[] m29535c() {
            if (f27495d == null) {
                synchronized (C11095c.f26635a) {
                    if (f27495d == null) {
                        f27495d = new C11441k[0];
                    }
                }
            }
            return f27495d;
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            C11442a aVar = this.f27496b;
            if (aVar != null) {
                bVar.mo62665b(1, (C11169e) aVar);
            }
            C11447b bVar2 = this.f27497c;
            if (bVar2 != null) {
                bVar.mo62665b(2, (C11169e) bVar2);
            }
        }

        /* renamed from: b */
        public C11441k mo63201b() {
            this.f27496b = null;
            this.f27497c = null;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            C11442a aVar = this.f27496b;
            int i = 0;
            if (aVar != null) {
                i = 0 + C11056b.m28523a(1, (C11169e) aVar);
            }
            C11447b bVar = this.f27497c;
            return bVar != null ? i + C11056b.m28523a(2, (C11169e) bVar) : i;
        }

        /* renamed from: com.yandex.metrica.impl.ob.kg$k$b */
        public static final class C11447b extends C11169e {

            /* renamed from: b */
            public int[] f27526b;

            /* renamed from: c */
            public int[] f27527c;

            public C11447b() {
                mo63207b();
            }

            /* renamed from: a */
            public void mo61540a(C11056b bVar) throws IOException {
                int[] iArr = this.f27526b;
                int i = 0;
                if (iArr != null && iArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr2 = this.f27526b;
                        if (i2 >= iArr2.length) {
                            break;
                        }
                        bVar.mo62672d(1, iArr2[i2]);
                        i2++;
                    }
                }
                int[] iArr3 = this.f27527c;
                if (iArr3 != null && iArr3.length > 0) {
                    while (true) {
                        int[] iArr4 = this.f27527c;
                        if (i < iArr4.length) {
                            bVar.mo62672d(2, iArr4[i]);
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            }

            /* renamed from: b */
            public C11447b mo63207b() {
                int[] iArr = C11256g.f26927a;
                this.f27526b = iArr;
                this.f27527c = iArr;
                this.f26754a = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo61538a() {
                int i;
                int[] iArr;
                int[] iArr2 = this.f27526b;
                int i2 = 0;
                if (iArr2 == null || iArr2.length <= 0) {
                    i = 0;
                } else {
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        iArr = this.f27526b;
                        if (i3 >= iArr.length) {
                            break;
                        }
                        i4 += C11056b.m28519a(iArr[i3]);
                        i3++;
                    }
                    i = i4 + 0 + (iArr.length * 1);
                }
                int[] iArr3 = this.f27527c;
                if (iArr3 == null || iArr3.length <= 0) {
                    return i;
                }
                int i5 = 0;
                while (true) {
                    int[] iArr4 = this.f27527c;
                    if (i2 >= iArr4.length) {
                        return i + i5 + (iArr4.length * 1);
                    }
                    i5 += C11056b.m28519a(iArr4[i2]);
                    i2++;
                }
            }

            /* renamed from: a */
            public C11169e mo61539a(C11009a aVar) throws IOException {
                while (true) {
                    int l = aVar.mo62628l();
                    if (l == 0) {
                        break;
                    } else if (l == 8) {
                        int a = C11256g.m29012a(aVar, 8);
                        int[] iArr = new int[a];
                        int i = 0;
                        for (int i2 = 0; i2 < a; i2++) {
                            if (i2 != 0) {
                                aVar.mo62628l();
                            }
                            int h = aVar.mo62624h();
                            if (h == 0 || h == 1 || h == 2 || h == 3 || h == 4) {
                                iArr[i] = h;
                                i++;
                            }
                        }
                        if (i != 0) {
                            int[] iArr2 = this.f27526b;
                            int length = iArr2 == null ? 0 : iArr2.length;
                            if (length == 0 && i == a) {
                                this.f27526b = iArr;
                            } else {
                                int[] iArr3 = new int[(length + i)];
                                if (length != 0) {
                                    System.arraycopy(iArr2, 0, iArr3, 0, length);
                                }
                                System.arraycopy(iArr, 0, iArr3, length, i);
                                this.f27526b = iArr3;
                            }
                        }
                    } else if (l == 10) {
                        int c = aVar.mo62614c(aVar.mo62624h());
                        int b = aVar.mo62612b();
                        int i3 = 0;
                        while (aVar.mo62609a() > 0) {
                            int h2 = aVar.mo62624h();
                            if (h2 == 0 || h2 == 1 || h2 == 2 || h2 == 3 || h2 == 4) {
                                i3++;
                            }
                        }
                        if (i3 != 0) {
                            aVar.mo62619e(b);
                            int[] iArr4 = this.f27526b;
                            int length2 = iArr4 == null ? 0 : iArr4.length;
                            int[] iArr5 = new int[(i3 + length2)];
                            if (length2 != 0) {
                                System.arraycopy(iArr4, 0, iArr5, 0, length2);
                            }
                            while (aVar.mo62609a() > 0) {
                                int h3 = aVar.mo62624h();
                                if (h3 == 0 || h3 == 1 || h3 == 2 || h3 == 3 || h3 == 4) {
                                    iArr5[length2] = h3;
                                    length2++;
                                }
                            }
                            this.f27526b = iArr5;
                        }
                        aVar.mo62613b(c);
                    } else if (l == 16) {
                        int a2 = C11256g.m29012a(aVar, 16);
                        int[] iArr6 = new int[a2];
                        int i4 = 0;
                        for (int i5 = 0; i5 < a2; i5++) {
                            if (i5 != 0) {
                                aVar.mo62628l();
                            }
                            int h4 = aVar.mo62624h();
                            if (h4 == 0 || h4 == 2 || h4 == 3) {
                                iArr6[i4] = h4;
                                i4++;
                            }
                        }
                        if (i4 != 0) {
                            int[] iArr7 = this.f27527c;
                            int length3 = iArr7 == null ? 0 : iArr7.length;
                            if (length3 == 0 && i4 == a2) {
                                this.f27527c = iArr6;
                            } else {
                                int[] iArr8 = new int[(length3 + i4)];
                                if (length3 != 0) {
                                    System.arraycopy(iArr7, 0, iArr8, 0, length3);
                                }
                                System.arraycopy(iArr6, 0, iArr8, length3, i4);
                                this.f27527c = iArr8;
                            }
                        }
                    } else if (l == 18) {
                        int c2 = aVar.mo62614c(aVar.mo62624h());
                        int b2 = aVar.mo62612b();
                        int i6 = 0;
                        while (aVar.mo62609a() > 0) {
                            int h5 = aVar.mo62624h();
                            if (h5 == 0 || h5 == 2 || h5 == 3) {
                                i6++;
                            }
                        }
                        if (i6 != 0) {
                            aVar.mo62619e(b2);
                            int[] iArr9 = this.f27527c;
                            int length4 = iArr9 == null ? 0 : iArr9.length;
                            int[] iArr10 = new int[(i6 + length4)];
                            if (length4 != 0) {
                                System.arraycopy(iArr9, 0, iArr10, 0, length4);
                            }
                            while (aVar.mo62609a() > 0) {
                                int h6 = aVar.mo62624h();
                                if (h6 == 0 || h6 == 2 || h6 == 3) {
                                    iArr10[length4] = h6;
                                    length4++;
                                }
                            }
                            this.f27527c = iArr10;
                        }
                        aVar.mo62613b(c2);
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
                    if (this.f27496b == null) {
                        this.f27496b = new C11442a();
                    }
                    aVar.mo62611a((C11169e) this.f27496b);
                } else if (l == 18) {
                    if (this.f27497c == null) {
                        this.f27497c = new C11447b();
                    }
                    aVar.mo62611a((C11169e) this.f27497c);
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$s */
    public static final class C11456s extends C11169e {

        /* renamed from: b */
        public C11457t f27559b;

        /* renamed from: c */
        public C11457t f27560c;

        public C11456s() {
            mo63216b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            C11457t tVar = this.f27559b;
            if (tVar != null) {
                bVar.mo62665b(1, (C11169e) tVar);
            }
            C11457t tVar2 = this.f27560c;
            if (tVar2 != null) {
                bVar.mo62665b(2, (C11169e) tVar2);
            }
        }

        /* renamed from: b */
        public C11456s mo63216b() {
            this.f27559b = null;
            this.f27560c = null;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            C11457t tVar = this.f27559b;
            int i = 0;
            if (tVar != null) {
                i = 0 + C11056b.m28523a(1, (C11169e) tVar);
            }
            C11457t tVar2 = this.f27560c;
            return tVar2 != null ? i + C11056b.m28523a(2, (C11169e) tVar2) : i;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    if (this.f27559b == null) {
                        this.f27559b = new C11457t();
                    }
                    aVar.mo62611a((C11169e) this.f27559b);
                } else if (l == 18) {
                    if (this.f27560c == null) {
                        this.f27560c = new C11457t();
                    }
                    aVar.mo62611a((C11169e) this.f27560c);
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$t */
    public static final class C11457t extends C11169e {

        /* renamed from: b */
        public int f27561b;

        /* renamed from: c */
        public long f27562c;

        public C11457t() {
            mo63217b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            int i = this.f27561b;
            if (i != 100) {
                bVar.mo62672d(1, i);
            }
            long j = this.f27562c;
            if (j != 60) {
                bVar.mo62670c(2, j);
            }
        }

        /* renamed from: b */
        public C11457t mo63217b() {
            this.f27561b = 100;
            this.f27562c = 60;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            int i = this.f27561b;
            int i2 = 0;
            if (i != 100) {
                i2 = 0 + C11056b.m28521a(1, i);
            }
            long j = this.f27562c;
            return j != 60 ? i2 + C11056b.m28522a(2, j) : i2;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 8) {
                    this.f27561b = aVar.mo62624h();
                } else if (l == 16) {
                    this.f27562c = aVar.mo62625i();
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$d */
    public static final class C11434d extends C11169e {

        /* renamed from: d */
        private static volatile C11434d[] f27455d;

        /* renamed from: b */
        public String f27456b;

        /* renamed from: c */
        public String[] f27457c;

        public C11434d() {
            mo63194b();
        }

        /* renamed from: c */
        public static C11434d[] m29506c() {
            if (f27455d == null) {
                synchronized (C11095c.f26635a) {
                    if (f27455d == null) {
                        f27455d = new C11434d[0];
                    }
                }
            }
            return f27455d;
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            if (!this.f27456b.equals("")) {
                bVar.mo62666b(1, this.f27456b);
            }
            String[] strArr = this.f27457c;
            if (strArr != null && strArr.length > 0) {
                int i = 0;
                while (true) {
                    String[] strArr2 = this.f27457c;
                    if (i < strArr2.length) {
                        String str = strArr2[i];
                        if (str != null) {
                            bVar.mo62666b(2, str);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public C11434d mo63194b() {
            this.f27456b = "";
            this.f27457c = C11256g.f26928b;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            int i = 0;
            int a = !this.f27456b.equals("") ? C11056b.m28524a(1, this.f27456b) + 0 : 0;
            String[] strArr = this.f27457c;
            if (strArr == null || strArr.length <= 0) {
                return a;
            }
            int i2 = 0;
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.f27457c;
                if (i >= strArr2.length) {
                    return a + i2 + (i3 * 1);
                }
                String str = strArr2[i];
                if (str != null) {
                    i3++;
                    i2 += C11056b.m28529a(str);
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
                    this.f27456b = aVar.mo62627k();
                } else if (l == 18) {
                    int a = C11256g.m29012a(aVar, 18);
                    String[] strArr = this.f27457c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i = a + length;
                    String[] strArr2 = new String[i];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i - 1) {
                        strArr2[length] = aVar.mo62627k();
                        aVar.mo62628l();
                        length++;
                    }
                    strArr2[length] = aVar.mo62627k();
                    this.f27457c = strArr2;
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$f */
    public static final class C11436f extends C11169e {

        /* renamed from: b */
        public C11435e f27460b;

        /* renamed from: c */
        public C11435e f27461c;

        /* renamed from: d */
        public C11435e f27462d;

        public C11436f() {
            mo63196b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            C11435e eVar = this.f27460b;
            if (eVar != null) {
                bVar.mo62665b(1, (C11169e) eVar);
            }
            C11435e eVar2 = this.f27461c;
            if (eVar2 != null) {
                bVar.mo62665b(2, (C11169e) eVar2);
            }
            C11435e eVar3 = this.f27462d;
            if (eVar3 != null) {
                bVar.mo62665b(3, (C11169e) eVar3);
            }
        }

        /* renamed from: b */
        public C11436f mo63196b() {
            this.f27460b = null;
            this.f27461c = null;
            this.f27462d = null;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            C11435e eVar = this.f27460b;
            int i = 0;
            if (eVar != null) {
                i = 0 + C11056b.m28523a(1, (C11169e) eVar);
            }
            C11435e eVar2 = this.f27461c;
            if (eVar2 != null) {
                i += C11056b.m28523a(2, (C11169e) eVar2);
            }
            C11435e eVar3 = this.f27462d;
            return eVar3 != null ? i + C11056b.m28523a(3, (C11169e) eVar3) : i;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    if (this.f27460b == null) {
                        this.f27460b = new C11435e();
                    }
                    aVar.mo62611a((C11169e) this.f27460b);
                } else if (l == 18) {
                    if (this.f27461c == null) {
                        this.f27461c = new C11435e();
                    }
                    aVar.mo62611a((C11169e) this.f27461c);
                } else if (l == 26) {
                    if (this.f27462d == null) {
                        this.f27462d = new C11435e();
                    }
                    aVar.mo62611a((C11169e) this.f27462d);
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$c */
    public static final class C11433c extends C11169e {

        /* renamed from: b */
        public long f27451b;

        /* renamed from: c */
        public long f27452c;

        /* renamed from: d */
        public long f27453d;

        /* renamed from: e */
        public long f27454e;

        public C11433c() {
            mo63193b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            long j = this.f27451b;
            if (j != TapjoyConstants.TIMER_INCREMENT) {
                bVar.mo62670c(1, j);
            }
            long j2 = this.f27452c;
            if (j2 != TapjoyConstants.TIMER_INCREMENT) {
                bVar.mo62670c(2, j2);
            }
            long j3 = this.f27453d;
            if (j3 != TapjoyConstants.TIMER_INCREMENT) {
                bVar.mo62670c(3, j3);
            }
            long j4 = this.f27454e;
            if (j4 != TapjoyConstants.TIMER_INCREMENT) {
                bVar.mo62670c(4, j4);
            }
        }

        /* renamed from: b */
        public C11433c mo63193b() {
            this.f27451b = TapjoyConstants.TIMER_INCREMENT;
            this.f27452c = TapjoyConstants.TIMER_INCREMENT;
            this.f27453d = TapjoyConstants.TIMER_INCREMENT;
            this.f27454e = TapjoyConstants.TIMER_INCREMENT;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            long j = this.f27451b;
            int i = 0;
            if (j != TapjoyConstants.TIMER_INCREMENT) {
                i = 0 + C11056b.m28522a(1, j);
            }
            long j2 = this.f27452c;
            if (j2 != TapjoyConstants.TIMER_INCREMENT) {
                i += C11056b.m28522a(2, j2);
            }
            long j3 = this.f27453d;
            if (j3 != TapjoyConstants.TIMER_INCREMENT) {
                i += C11056b.m28522a(3, j3);
            }
            long j4 = this.f27454e;
            return j4 != TapjoyConstants.TIMER_INCREMENT ? i + C11056b.m28522a(4, j4) : i;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 8) {
                    this.f27451b = aVar.mo62625i();
                } else if (l == 16) {
                    this.f27452c = aVar.mo62625i();
                } else if (l == 24) {
                    this.f27453d = aVar.mo62625i();
                } else if (l == 32) {
                    this.f27454e = aVar.mo62625i();
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$o */
    public static final class C11452o extends C11169e {

        /* renamed from: b */
        public long f27543b;

        /* renamed from: c */
        public long f27544c;

        /* renamed from: d */
        public long f27545d;

        /* renamed from: e */
        public long f27546e;

        public C11452o() {
            mo63212b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            long j = this.f27543b;
            if (j != 432000000) {
                bVar.mo62670c(1, j);
            }
            long j2 = this.f27544c;
            if (j2 != 86400000) {
                bVar.mo62670c(2, j2);
            }
            long j3 = this.f27545d;
            if (j3 != TapjoyConstants.TIMER_INCREMENT) {
                bVar.mo62670c(3, j3);
            }
            long j4 = this.f27546e;
            if (j4 != 3600000) {
                bVar.mo62670c(4, j4);
            }
        }

        /* renamed from: b */
        public C11452o mo63212b() {
            this.f27543b = 432000000;
            this.f27544c = 86400000;
            this.f27545d = TapjoyConstants.TIMER_INCREMENT;
            this.f27546e = 3600000;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            long j = this.f27543b;
            int i = 0;
            if (j != 432000000) {
                i = 0 + C11056b.m28522a(1, j);
            }
            long j2 = this.f27544c;
            if (j2 != 86400000) {
                i += C11056b.m28522a(2, j2);
            }
            long j3 = this.f27545d;
            if (j3 != TapjoyConstants.TIMER_INCREMENT) {
                i += C11056b.m28522a(3, j3);
            }
            long j4 = this.f27546e;
            return j4 != 3600000 ? i + C11056b.m28522a(4, j4) : i;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 8) {
                    this.f27543b = aVar.mo62625i();
                } else if (l == 16) {
                    this.f27544c = aVar.mo62625i();
                } else if (l == 24) {
                    this.f27545d = aVar.mo62625i();
                } else if (l == 32) {
                    this.f27546e = aVar.mo62625i();
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$v */
    public static final class C11459v extends C11169e {

        /* renamed from: b */
        public int f27579b;

        /* renamed from: c */
        public int f27580c;

        /* renamed from: d */
        public int f27581d;

        /* renamed from: e */
        public long f27582e;

        /* renamed from: f */
        public boolean f27583f;

        /* renamed from: g */
        public boolean f27584g;

        /* renamed from: h */
        public boolean f27585h;

        /* renamed from: i */
        public C11461x[] f27586i;

        public C11459v() {
            mo63219b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62672d(1, this.f27579b);
            bVar.mo62672d(2, this.f27580c);
            bVar.mo62672d(3, this.f27581d);
            bVar.mo62670c(4, this.f27582e);
            bVar.mo62667b(5, this.f27583f);
            bVar.mo62667b(6, this.f27584g);
            bVar.mo62667b(7, this.f27585h);
            C11461x[] xVarArr = this.f27586i;
            if (xVarArr != null && xVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C11461x[] xVarArr2 = this.f27586i;
                    if (i < xVarArr2.length) {
                        C11461x xVar = xVarArr2[i];
                        if (xVar != null) {
                            bVar.mo62665b(8, (C11169e) xVar);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public C11459v mo63219b() {
            this.f27579b = 10000;
            this.f27580c = 1000;
            this.f27581d = 100;
            this.f27582e = 5000;
            this.f27583f = true;
            this.f27584g = false;
            this.f27585h = true;
            this.f27586i = C11461x.m29619c();
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            int i = 0;
            int a = C11056b.m28521a(1, this.f27579b) + 0 + C11056b.m28521a(2, this.f27580c) + C11056b.m28521a(3, this.f27581d) + C11056b.m28522a(4, this.f27582e) + C11056b.m28525a(5, this.f27583f) + C11056b.m28525a(6, this.f27584g) + C11056b.m28525a(7, this.f27585h);
            C11461x[] xVarArr = this.f27586i;
            if (xVarArr != null && xVarArr.length > 0) {
                while (true) {
                    C11461x[] xVarArr2 = this.f27586i;
                    if (i >= xVarArr2.length) {
                        break;
                    }
                    C11461x xVar = xVarArr2[i];
                    if (xVar != null) {
                        a += C11056b.m28523a(8, (C11169e) xVar);
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
                } else if (l == 8) {
                    this.f27579b = aVar.mo62624h();
                } else if (l == 16) {
                    this.f27580c = aVar.mo62624h();
                } else if (l == 24) {
                    this.f27581d = aVar.mo62624h();
                } else if (l == 32) {
                    this.f27582e = aVar.mo62625i();
                } else if (l == 40) {
                    this.f27583f = aVar.mo62615c();
                } else if (l == 48) {
                    this.f27584g = aVar.mo62615c();
                } else if (l == 56) {
                    this.f27585h = aVar.mo62615c();
                } else if (l == 66) {
                    int a = C11256g.m29012a(aVar, 66);
                    C11461x[] xVarArr = this.f27586i;
                    int length = xVarArr == null ? 0 : xVarArr.length;
                    int i = a + length;
                    C11461x[] xVarArr2 = new C11461x[i];
                    if (length != 0) {
                        System.arraycopy(xVarArr, 0, xVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        xVarArr2[length] = new C11461x();
                        aVar.mo62611a((C11169e) xVarArr2[length]);
                        aVar.mo62628l();
                        length++;
                    }
                    xVarArr2[length] = new C11461x();
                    aVar.mo62611a((C11169e) xVarArr2[length]);
                    this.f27586i = xVarArr2;
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$h */
    public static final class C11438h extends C11169e {

        /* renamed from: b */
        public String f27464b;

        /* renamed from: c */
        public int f27465c;

        /* renamed from: d */
        public int f27466d;

        /* renamed from: e */
        public boolean f27467e;

        /* renamed from: f */
        public boolean f27468f;

        public C11438h() {
            mo63198b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            if (!this.f27464b.equals("")) {
                bVar.mo62666b(1, this.f27464b);
            }
            int i = this.f27465c;
            if (i != 600) {
                bVar.mo62677f(2, i);
            }
            int i2 = this.f27466d;
            if (i2 != 300) {
                bVar.mo62677f(3, i2);
            }
            boolean z = this.f27467e;
            if (z) {
                bVar.mo62667b(4, z);
            }
            boolean z2 = this.f27468f;
            if (!z2) {
                bVar.mo62667b(5, z2);
            }
        }

        /* renamed from: b */
        public C11438h mo63198b() {
            this.f27464b = "";
            this.f27465c = 600;
            this.f27466d = ErrorCode.GENERAL_WRAPPER_ERROR;
            this.f27467e = false;
            this.f27468f = true;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            int i = 0;
            if (!this.f27464b.equals("")) {
                i = 0 + C11056b.m28524a(1, this.f27464b);
            }
            int i2 = this.f27465c;
            if (i2 != 600) {
                i += C11056b.m28535c(2, i2);
            }
            int i3 = this.f27466d;
            if (i3 != 300) {
                i += C11056b.m28535c(3, i3);
            }
            boolean z = this.f27467e;
            if (z) {
                i += C11056b.m28525a(4, z);
            }
            boolean z2 = this.f27468f;
            return !z2 ? i + C11056b.m28525a(5, z2) : i;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                if (l == 0) {
                    break;
                } else if (l == 10) {
                    this.f27464b = aVar.mo62627k();
                } else if (l == 16) {
                    this.f27465c = aVar.mo62624h();
                } else if (l == 24) {
                    this.f27466d = aVar.mo62624h();
                } else if (l == 32) {
                    this.f27467e = aVar.mo62615c();
                } else if (l == 40) {
                    this.f27468f = aVar.mo62615c();
                } else if (!aVar.mo62621f(l)) {
                    break;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$p */
    public static final class C11453p extends C11169e {

        /* renamed from: b */
        public long f27547b;

        /* renamed from: c */
        public String f27548c;

        /* renamed from: d */
        public int[] f27549d;

        /* renamed from: e */
        public int[] f27550e;

        /* renamed from: f */
        public long f27551f;

        /* renamed from: g */
        public int f27552g;

        /* renamed from: h */
        public long f27553h;

        /* renamed from: i */
        public long f27554i;

        /* renamed from: j */
        public long f27555j;

        /* renamed from: k */
        public long f27556k;

        public C11453p() {
            mo63213b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62670c(1, this.f27547b);
            bVar.mo62666b(2, this.f27548c);
            int[] iArr = this.f27549d;
            int i = 0;
            if (iArr != null && iArr.length > 0) {
                int i2 = 0;
                while (true) {
                    int[] iArr2 = this.f27549d;
                    if (i2 >= iArr2.length) {
                        break;
                    }
                    bVar.mo62672d(3, iArr2[i2]);
                    i2++;
                }
            }
            bVar.mo62670c(4, this.f27551f);
            bVar.mo62672d(5, this.f27552g);
            long j = this.f27553h;
            if (j != 43200) {
                bVar.mo62670c(6, j);
            }
            long j2 = this.f27554i;
            if (j2 != 3600) {
                bVar.mo62670c(7, j2);
            }
            long j3 = this.f27555j;
            if (j3 != 86400) {
                bVar.mo62670c(8, j3);
            }
            int[] iArr3 = this.f27550e;
            if (iArr3 != null && iArr3.length > 0) {
                while (true) {
                    int[] iArr4 = this.f27550e;
                    if (i >= iArr4.length) {
                        break;
                    }
                    bVar.mo62672d(9, iArr4[i]);
                    i++;
                }
            }
            long j4 = this.f27556k;
            if (j4 != 30) {
                bVar.mo62670c(10, j4);
            }
        }

        /* renamed from: b */
        public C11453p mo63213b() {
            this.f27547b = 0;
            this.f27548c = "";
            int[] iArr = C11256g.f26927a;
            this.f27549d = iArr;
            this.f27550e = iArr;
            this.f27551f = 259200;
            this.f27552g = 10;
            this.f27553h = 43200;
            this.f27554i = 3600;
            this.f27555j = 86400;
            this.f27556k = 30;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            int[] iArr;
            int[] iArr2;
            int i = 0;
            int a = C11056b.m28522a(1, this.f27547b) + 0 + C11056b.m28524a(2, this.f27548c);
            int[] iArr3 = this.f27549d;
            if (iArr3 != null && iArr3.length > 0) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    iArr2 = this.f27549d;
                    if (i2 >= iArr2.length) {
                        break;
                    }
                    i3 += C11056b.m28519a(iArr2[i2]);
                    i2++;
                }
                a = a + i3 + (iArr2.length * 1);
            }
            int a2 = a + C11056b.m28522a(4, this.f27551f) + C11056b.m28521a(5, this.f27552g);
            long j = this.f27553h;
            if (j != 43200) {
                a2 += C11056b.m28522a(6, j);
            }
            long j2 = this.f27554i;
            if (j2 != 3600) {
                a2 += C11056b.m28522a(7, j2);
            }
            long j3 = this.f27555j;
            if (j3 != 86400) {
                a2 += C11056b.m28522a(8, j3);
            }
            int[] iArr4 = this.f27550e;
            if (iArr4 != null && iArr4.length > 0) {
                int i4 = 0;
                while (true) {
                    iArr = this.f27550e;
                    if (i >= iArr.length) {
                        break;
                    }
                    i4 += C11056b.m28519a(iArr[i]);
                    i++;
                }
                a2 = a2 + i4 + (iArr.length * 1);
            }
            long j4 = this.f27556k;
            return j4 != 30 ? a2 + C11056b.m28522a(10, j4) : a2;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                switch (l) {
                    case 0:
                        break;
                    case 8:
                        this.f27547b = aVar.mo62625i();
                        continue;
                    case 18:
                        this.f27548c = aVar.mo62627k();
                        continue;
                    case 24:
                        int a = C11256g.m29012a(aVar, 24);
                        int[] iArr = this.f27549d;
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
                        this.f27549d = iArr2;
                        continue;
                    case 26:
                        int c = aVar.mo62614c(aVar.mo62624h());
                        int b = aVar.mo62612b();
                        int i2 = 0;
                        while (aVar.mo62609a() > 0) {
                            aVar.mo62624h();
                            i2++;
                        }
                        aVar.mo62619e(b);
                        int[] iArr3 = this.f27549d;
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
                        this.f27549d = iArr4;
                        aVar.mo62613b(c);
                        continue;
                    case 32:
                        this.f27551f = aVar.mo62625i();
                        continue;
                    case 40:
                        this.f27552g = aVar.mo62624h();
                        continue;
                    case 48:
                        this.f27553h = aVar.mo62625i();
                        continue;
                    case 56:
                        this.f27554i = aVar.mo62625i();
                        continue;
                    case 64:
                        this.f27555j = aVar.mo62625i();
                        continue;
                    case 72:
                        int a2 = C11256g.m29012a(aVar, 72);
                        int[] iArr5 = this.f27550e;
                        int length3 = iArr5 == null ? 0 : iArr5.length;
                        int i4 = a2 + length3;
                        int[] iArr6 = new int[i4];
                        if (length3 != 0) {
                            System.arraycopy(iArr5, 0, iArr6, 0, length3);
                        }
                        while (length3 < i4 - 1) {
                            iArr6[length3] = aVar.mo62624h();
                            aVar.mo62628l();
                            length3++;
                        }
                        iArr6[length3] = aVar.mo62624h();
                        this.f27550e = iArr6;
                        continue;
                    case 74:
                        int c2 = aVar.mo62614c(aVar.mo62624h());
                        int b2 = aVar.mo62612b();
                        int i5 = 0;
                        while (aVar.mo62609a() > 0) {
                            aVar.mo62624h();
                            i5++;
                        }
                        aVar.mo62619e(b2);
                        int[] iArr7 = this.f27550e;
                        int length4 = iArr7 == null ? 0 : iArr7.length;
                        int i6 = i5 + length4;
                        int[] iArr8 = new int[i6];
                        if (length4 != 0) {
                            System.arraycopy(iArr7, 0, iArr8, 0, length4);
                        }
                        while (length4 < i6) {
                            iArr8[length4] = aVar.mo62624h();
                            length4++;
                        }
                        this.f27550e = iArr8;
                        aVar.mo62613b(c2);
                        continue;
                    case 80:
                        this.f27556k = aVar.mo62625i();
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

    /* renamed from: com.yandex.metrica.impl.ob.kg$i */
    public static final class C11439i extends C11169e {

        /* renamed from: b */
        public boolean f27469b;

        /* renamed from: c */
        public boolean f27470c;

        /* renamed from: d */
        public boolean f27471d;

        /* renamed from: e */
        public boolean f27472e;

        /* renamed from: f */
        public boolean f27473f;

        /* renamed from: g */
        public boolean f27474g;

        /* renamed from: h */
        public boolean f27475h;

        /* renamed from: i */
        public boolean f27476i;

        /* renamed from: j */
        public boolean f27477j;

        /* renamed from: k */
        public boolean f27478k;

        /* renamed from: l */
        public boolean f27479l;

        /* renamed from: m */
        public boolean f27480m;

        /* renamed from: n */
        public boolean f27481n;

        /* renamed from: o */
        public boolean f27482o;

        /* renamed from: p */
        public boolean f27483p;

        /* renamed from: q */
        public boolean f27484q;

        /* renamed from: r */
        public boolean f27485r;

        /* renamed from: s */
        public boolean f27486s;

        /* renamed from: t */
        public boolean f27487t;

        /* renamed from: u */
        public boolean f27488u;

        /* renamed from: v */
        public boolean f27489v;

        /* renamed from: w */
        public boolean f27490w;

        /* renamed from: x */
        public boolean f27491x;

        /* renamed from: y */
        public boolean f27492y;

        /* renamed from: z */
        public int f27493z;

        public C11439i() {
            mo63199b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            bVar.mo62667b(1, this.f27469b);
            bVar.mo62667b(2, this.f27470c);
            bVar.mo62667b(3, this.f27471d);
            bVar.mo62667b(4, this.f27472e);
            bVar.mo62667b(6, this.f27473f);
            bVar.mo62667b(8, this.f27474g);
            bVar.mo62667b(9, this.f27475h);
            bVar.mo62667b(11, this.f27476i);
            bVar.mo62667b(12, this.f27477j);
            bVar.mo62667b(15, this.f27478k);
            bVar.mo62667b(16, this.f27479l);
            bVar.mo62667b(18, this.f27480m);
            bVar.mo62667b(19, this.f27481n);
            bVar.mo62667b(20, this.f27482o);
            bVar.mo62667b(21, this.f27483p);
            bVar.mo62667b(22, this.f27484q);
            bVar.mo62667b(23, this.f27485r);
            bVar.mo62667b(24, this.f27486s);
            bVar.mo62667b(25, this.f27487t);
            bVar.mo62667b(26, this.f27488u);
            bVar.mo62667b(27, this.f27489v);
            bVar.mo62667b(28, this.f27490w);
            boolean z = this.f27491x;
            if (z) {
                bVar.mo62667b(29, z);
            }
            boolean z2 = this.f27492y;
            if (z2) {
                bVar.mo62667b(33, z2);
            }
            int i = this.f27493z;
            if (i != -1) {
                bVar.mo62672d(34, i);
            }
        }

        /* renamed from: b */
        public C11439i mo63199b() {
            this.f27469b = false;
            this.f27470c = false;
            this.f27471d = false;
            this.f27472e = false;
            this.f27473f = false;
            this.f27474g = false;
            this.f27475h = false;
            this.f27476i = false;
            this.f27477j = false;
            this.f27478k = false;
            this.f27479l = true;
            this.f27480m = false;
            this.f27481n = false;
            this.f27482o = false;
            this.f27483p = false;
            this.f27484q = false;
            this.f27485r = false;
            this.f27486s = false;
            this.f27487t = false;
            this.f27488u = false;
            this.f27489v = true;
            this.f27490w = false;
            this.f27491x = false;
            this.f27492y = false;
            this.f27493z = -1;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            int a = C11056b.m28525a(1, this.f27469b) + 0 + C11056b.m28525a(2, this.f27470c) + C11056b.m28525a(3, this.f27471d) + C11056b.m28525a(4, this.f27472e) + C11056b.m28525a(6, this.f27473f) + C11056b.m28525a(8, this.f27474g) + C11056b.m28525a(9, this.f27475h) + C11056b.m28525a(11, this.f27476i) + C11056b.m28525a(12, this.f27477j) + C11056b.m28525a(15, this.f27478k) + C11056b.m28525a(16, this.f27479l) + C11056b.m28525a(18, this.f27480m) + C11056b.m28525a(19, this.f27481n) + C11056b.m28525a(20, this.f27482o) + C11056b.m28525a(21, this.f27483p) + C11056b.m28525a(22, this.f27484q) + C11056b.m28525a(23, this.f27485r) + C11056b.m28525a(24, this.f27486s) + C11056b.m28525a(25, this.f27487t) + C11056b.m28525a(26, this.f27488u) + C11056b.m28525a(27, this.f27489v) + C11056b.m28525a(28, this.f27490w);
            boolean z = this.f27491x;
            if (z) {
                a += C11056b.m28525a(29, z);
            }
            boolean z2 = this.f27492y;
            if (z2) {
                a += C11056b.m28525a(33, z2);
            }
            int i = this.f27493z;
            return i != -1 ? a + C11056b.m28521a(34, i) : a;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                switch (l) {
                    case 0:
                        break;
                    case 8:
                        this.f27469b = aVar.mo62615c();
                        continue;
                    case 16:
                        this.f27470c = aVar.mo62615c();
                        continue;
                    case 24:
                        this.f27471d = aVar.mo62615c();
                        continue;
                    case 32:
                        this.f27472e = aVar.mo62615c();
                        continue;
                    case 48:
                        this.f27473f = aVar.mo62615c();
                        continue;
                    case 64:
                        this.f27474g = aVar.mo62615c();
                        continue;
                    case 72:
                        this.f27475h = aVar.mo62615c();
                        continue;
                    case 88:
                        this.f27476i = aVar.mo62615c();
                        continue;
                    case 96:
                        this.f27477j = aVar.mo62615c();
                        continue;
                    case 120:
                        this.f27478k = aVar.mo62615c();
                        continue;
                    case 128:
                        this.f27479l = aVar.mo62615c();
                        continue;
                    case 144:
                        this.f27480m = aVar.mo62615c();
                        continue;
                    case 152:
                        this.f27481n = aVar.mo62615c();
                        continue;
                    case 160:
                        this.f27482o = aVar.mo62615c();
                        continue;
                    case 168:
                        this.f27483p = aVar.mo62615c();
                        continue;
                    case 176:
                        this.f27484q = aVar.mo62615c();
                        continue;
                    case 184:
                        this.f27485r = aVar.mo62615c();
                        continue;
                    case 192:
                        this.f27486s = aVar.mo62615c();
                        continue;
                    case 200:
                        this.f27487t = aVar.mo62615c();
                        continue;
                    case 208:
                        this.f27488u = aVar.mo62615c();
                        continue;
                    case 216:
                        this.f27489v = aVar.mo62615c();
                        continue;
                    case 224:
                        this.f27490w = aVar.mo62615c();
                        continue;
                    case 232:
                        this.f27491x = aVar.mo62615c();
                        continue;
                    case 264:
                        this.f27492y = aVar.mo62615c();
                        continue;
                    case 272:
                        int h = aVar.mo62624h();
                        if (h == -1 || h == 0 || h == 1) {
                            this.f27493z = h;
                            break;
                        } else {
                            continue;
                        }
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

    /* renamed from: com.yandex.metrica.impl.ob.kg$u */
    public static final class C11458u extends C11169e {

        /* renamed from: b */
        public boolean f27563b;

        /* renamed from: c */
        public boolean f27564c;

        /* renamed from: d */
        public boolean f27565d;

        /* renamed from: e */
        public boolean f27566e;

        /* renamed from: f */
        public int f27567f;

        /* renamed from: g */
        public int f27568g;

        /* renamed from: h */
        public int f27569h;

        /* renamed from: i */
        public int f27570i;

        /* renamed from: j */
        public boolean f27571j;

        /* renamed from: k */
        public boolean f27572k;

        /* renamed from: l */
        public boolean f27573l;

        /* renamed from: m */
        public boolean f27574m;

        /* renamed from: n */
        public C11461x[] f27575n;

        /* renamed from: o */
        public boolean f27576o;

        /* renamed from: p */
        public boolean f27577p;

        /* renamed from: q */
        public int f27578q;

        public C11458u() {
            mo63218b();
        }

        /* renamed from: a */
        public void mo61540a(C11056b bVar) throws IOException {
            boolean z = this.f27563b;
            if (!z) {
                bVar.mo62667b(1, z);
            }
            boolean z2 = this.f27564c;
            if (!z2) {
                bVar.mo62667b(2, z2);
            }
            boolean z3 = this.f27565d;
            if (!z3) {
                bVar.mo62667b(3, z3);
            }
            boolean z4 = this.f27566e;
            if (!z4) {
                bVar.mo62667b(4, z4);
            }
            int i = this.f27567f;
            if (i != 10000) {
                bVar.mo62672d(5, i);
            }
            int i2 = this.f27568g;
            if (i2 != 1000) {
                bVar.mo62672d(6, i2);
            }
            int i3 = this.f27569h;
            if (i3 != 1000) {
                bVar.mo62672d(7, i3);
            }
            int i4 = this.f27570i;
            if (i4 != 200000) {
                bVar.mo62672d(8, i4);
            }
            boolean z5 = this.f27571j;
            if (z5) {
                bVar.mo62667b(9, z5);
            }
            boolean z6 = this.f27572k;
            if (z6) {
                bVar.mo62667b(10, z6);
            }
            boolean z7 = this.f27573l;
            if (z7) {
                bVar.mo62667b(11, z7);
            }
            boolean z8 = this.f27574m;
            if (z8) {
                bVar.mo62667b(12, z8);
            }
            C11461x[] xVarArr = this.f27575n;
            if (xVarArr != null && xVarArr.length > 0) {
                int i5 = 0;
                while (true) {
                    C11461x[] xVarArr2 = this.f27575n;
                    if (i5 >= xVarArr2.length) {
                        break;
                    }
                    C11461x xVar = xVarArr2[i5];
                    if (xVar != null) {
                        bVar.mo62665b(13, (C11169e) xVar);
                    }
                    i5++;
                }
            }
            boolean z9 = this.f27576o;
            if (z9) {
                bVar.mo62667b(14, z9);
            }
            boolean z10 = this.f27577p;
            if (z10) {
                bVar.mo62667b(15, z10);
            }
            int i6 = this.f27578q;
            if (i6 != 4000) {
                bVar.mo62672d(16, i6);
            }
        }

        /* renamed from: b */
        public C11458u mo63218b() {
            this.f27563b = true;
            this.f27564c = true;
            this.f27565d = true;
            this.f27566e = true;
            this.f27567f = 10000;
            this.f27568g = 1000;
            this.f27569h = 1000;
            this.f27570i = 200000;
            this.f27571j = false;
            this.f27572k = false;
            this.f27573l = false;
            this.f27574m = false;
            this.f27575n = C11461x.m29619c();
            this.f27576o = false;
            this.f27577p = false;
            this.f27578q = 4000;
            this.f26754a = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo61538a() {
            boolean z = this.f27563b;
            int i = 0;
            int a = !z ? C11056b.m28525a(1, z) + 0 : 0;
            boolean z2 = this.f27564c;
            if (!z2) {
                a += C11056b.m28525a(2, z2);
            }
            boolean z3 = this.f27565d;
            if (!z3) {
                a += C11056b.m28525a(3, z3);
            }
            boolean z4 = this.f27566e;
            if (!z4) {
                a += C11056b.m28525a(4, z4);
            }
            int i2 = this.f27567f;
            if (i2 != 10000) {
                a += C11056b.m28521a(5, i2);
            }
            int i3 = this.f27568g;
            if (i3 != 1000) {
                a += C11056b.m28521a(6, i3);
            }
            int i4 = this.f27569h;
            if (i4 != 1000) {
                a += C11056b.m28521a(7, i4);
            }
            int i5 = this.f27570i;
            if (i5 != 200000) {
                a += C11056b.m28521a(8, i5);
            }
            boolean z5 = this.f27571j;
            if (z5) {
                a += C11056b.m28525a(9, z5);
            }
            boolean z6 = this.f27572k;
            if (z6) {
                a += C11056b.m28525a(10, z6);
            }
            boolean z7 = this.f27573l;
            if (z7) {
                a += C11056b.m28525a(11, z7);
            }
            boolean z8 = this.f27574m;
            if (z8) {
                a += C11056b.m28525a(12, z8);
            }
            C11461x[] xVarArr = this.f27575n;
            if (xVarArr != null && xVarArr.length > 0) {
                while (true) {
                    C11461x[] xVarArr2 = this.f27575n;
                    if (i >= xVarArr2.length) {
                        break;
                    }
                    C11461x xVar = xVarArr2[i];
                    if (xVar != null) {
                        a += C11056b.m28523a(13, (C11169e) xVar);
                    }
                    i++;
                }
            }
            boolean z9 = this.f27576o;
            if (z9) {
                a += C11056b.m28525a(14, z9);
            }
            boolean z10 = this.f27577p;
            if (z10) {
                a += C11056b.m28525a(15, z10);
            }
            int i6 = this.f27578q;
            return i6 != 4000 ? a + C11056b.m28521a(16, i6) : a;
        }

        /* renamed from: a */
        public C11169e mo61539a(C11009a aVar) throws IOException {
            while (true) {
                int l = aVar.mo62628l();
                switch (l) {
                    case 0:
                        break;
                    case 8:
                        this.f27563b = aVar.mo62615c();
                        continue;
                    case 16:
                        this.f27564c = aVar.mo62615c();
                        continue;
                    case 24:
                        this.f27565d = aVar.mo62615c();
                        continue;
                    case 32:
                        this.f27566e = aVar.mo62615c();
                        continue;
                    case 40:
                        this.f27567f = aVar.mo62624h();
                        continue;
                    case 48:
                        this.f27568g = aVar.mo62624h();
                        continue;
                    case 56:
                        this.f27569h = aVar.mo62624h();
                        continue;
                    case 64:
                        this.f27570i = aVar.mo62624h();
                        continue;
                    case 72:
                        this.f27571j = aVar.mo62615c();
                        continue;
                    case 80:
                        this.f27572k = aVar.mo62615c();
                        continue;
                    case 88:
                        this.f27573l = aVar.mo62615c();
                        continue;
                    case 96:
                        this.f27574m = aVar.mo62615c();
                        continue;
                    case 106:
                        int a = C11256g.m29012a(aVar, 106);
                        C11461x[] xVarArr = this.f27575n;
                        int length = xVarArr == null ? 0 : xVarArr.length;
                        int i = a + length;
                        C11461x[] xVarArr2 = new C11461x[i];
                        if (length != 0) {
                            System.arraycopy(xVarArr, 0, xVarArr2, 0, length);
                        }
                        while (length < i - 1) {
                            xVarArr2[length] = new C11461x();
                            aVar.mo62611a((C11169e) xVarArr2[length]);
                            aVar.mo62628l();
                            length++;
                        }
                        xVarArr2[length] = new C11461x();
                        aVar.mo62611a((C11169e) xVarArr2[length]);
                        this.f27575n = xVarArr2;
                        continue;
                    case 112:
                        this.f27576o = aVar.mo62615c();
                        continue;
                    case 120:
                        this.f27577p = aVar.mo62615c();
                        continue;
                    case 128:
                        this.f27578q = aVar.mo62624h();
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

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo61538a() {
        int i = 0;
        int a = (!this.f27419b.equals("") ? C11056b.m28524a(1, this.f27419b) + 0 : 0) + C11056b.m28522a(3, this.f27420c);
        String[] strArr = this.f27421d;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.f27421d;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    i4++;
                    i3 += C11056b.m28529a(str);
                }
                i2++;
            }
            a = a + i3 + (i4 * 1);
        }
        if (!this.f27422e.equals("")) {
            a += C11056b.m28524a(5, this.f27422e);
        }
        if (!this.f27423f.equals("")) {
            a += C11056b.m28524a(6, this.f27423f);
        }
        String[] strArr3 = this.f27424g;
        if (strArr3 != null && strArr3.length > 0) {
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                String[] strArr4 = this.f27424g;
                if (i5 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i5];
                if (str2 != null) {
                    i7++;
                    i6 += C11056b.m28529a(str2);
                }
                i5++;
            }
            a = a + i6 + (i7 * 1);
        }
        String[] strArr5 = this.f27425h;
        if (strArr5 != null && strArr5.length > 0) {
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                String[] strArr6 = this.f27425h;
                if (i8 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i8];
                if (str3 != null) {
                    i10++;
                    i9 += C11056b.m28529a(str3);
                }
                i8++;
            }
            a = a + i9 + (i10 * 1);
        }
        String[] strArr7 = this.f27426i;
        if (strArr7 != null && strArr7.length > 0) {
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                String[] strArr8 = this.f27426i;
                if (i11 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i11];
                if (str4 != null) {
                    i13++;
                    i12 += C11056b.m28529a(str4);
                }
                i11++;
            }
            a = a + i12 + (i13 * 1);
        }
        C11439i iVar = this.f27429l;
        if (iVar != null) {
            a += C11056b.m28523a(10, (C11169e) iVar);
        }
        C11441k[] kVarArr = this.f27430m;
        if (kVarArr != null && kVarArr.length > 0) {
            int i14 = 0;
            while (true) {
                C11441k[] kVarArr2 = this.f27430m;
                if (i14 >= kVarArr2.length) {
                    break;
                }
                C11441k kVar = kVarArr2[i14];
                if (kVar != null) {
                    a += C11056b.m28523a(11, (C11169e) kVar);
                }
                i14++;
            }
        }
        C11462y yVar = this.f27431n;
        if (yVar != null) {
            a += C11056b.m28523a(12, (C11169e) yVar);
        }
        C11453p pVar = this.f27432o;
        if (pVar != null) {
            a += C11056b.m28523a(13, (C11169e) pVar);
        }
        C11450n[] nVarArr = this.f27433p;
        if (nVarArr != null && nVarArr.length > 0) {
            int i15 = 0;
            while (true) {
                C11450n[] nVarArr2 = this.f27433p;
                if (i15 >= nVarArr2.length) {
                    break;
                }
                C11450n nVar = nVarArr2[i15];
                if (nVar != null) {
                    a += C11056b.m28523a(14, (C11169e) nVar);
                }
                i15++;
            }
        }
        if (!this.f27434q.equals("")) {
            a += C11056b.m28524a(15, this.f27434q);
        }
        if (!this.f27435r.equals("")) {
            a += C11056b.m28524a(16, this.f27435r);
        }
        int a2 = a + C11056b.m28525a(17, this.f27437t);
        if (!this.f27438u.equals("")) {
            a2 += C11056b.m28524a(19, this.f27438u);
        }
        String[] strArr9 = this.f27439v;
        if (strArr9 != null && strArr9.length > 0) {
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                String[] strArr10 = this.f27439v;
                if (i16 >= strArr10.length) {
                    break;
                }
                String str5 = strArr10[i16];
                if (str5 != null) {
                    i18++;
                    i17 += C11056b.m28529a(str5);
                }
                i16++;
            }
            a2 = a2 + i17 + (i18 * 2);
        }
        C11455r rVar = this.f27440w;
        if (rVar != null) {
            a2 += C11056b.m28523a(21, (C11169e) rVar);
        }
        boolean z = this.f27441x;
        if (z) {
            a2 += C11056b.m28525a(22, z);
        }
        C11448l[] lVarArr = this.f27442y;
        if (lVarArr != null && lVarArr.length > 0) {
            int i19 = 0;
            while (true) {
                C11448l[] lVarArr2 = this.f27442y;
                if (i19 >= lVarArr2.length) {
                    break;
                }
                C11448l lVar = lVarArr2[i19];
                if (lVar != null) {
                    a2 += C11056b.m28523a(23, (C11169e) lVar);
                }
                i19++;
            }
        }
        C11452o oVar = this.f27443z;
        if (oVar != null) {
            a2 += C11056b.m28523a(24, (C11169e) oVar);
        }
        if (!this.f27394A.equals("")) {
            a2 += C11056b.m28524a(25, this.f27394A);
        }
        if (!this.f27395B.equals("")) {
            a2 += C11056b.m28524a(26, this.f27395B);
        }
        if (!this.f27397D.equals("")) {
            a2 += C11056b.m28524a(27, this.f27397D);
        }
        int a3 = a2 + C11056b.m28522a(28, this.f27399F) + C11056b.m28522a(29, this.f27400G);
        boolean z2 = this.f27401H;
        if (z2) {
            a3 += C11056b.m28525a(30, z2);
        }
        if (!this.f27396C.equals("")) {
            a3 += C11056b.m28524a(31, this.f27396C);
        }
        C11449m mVar = this.f27402I;
        if (mVar != null) {
            a3 += C11056b.m28523a(32, (C11169e) mVar);
        }
        C11440j jVar = this.f27403J;
        if (jVar != null) {
            a3 += C11056b.m28523a(33, (C11169e) jVar);
        }
        int a4 = a3 + C11056b.m28521a(35, this.f27404K) + C11056b.m28521a(36, this.f27405L);
        C11459v vVar = this.f27406M;
        if (vVar != null) {
            a4 += C11056b.m28523a(37, (C11169e) vVar);
        }
        C11458u uVar = this.f27407N;
        if (uVar != null) {
            a4 += C11056b.m28523a(38, (C11169e) uVar);
        }
        C11458u uVar2 = this.f27408O;
        if (uVar2 != null) {
            a4 += C11056b.m28523a(39, (C11169e) uVar2);
        }
        C11456s sVar = this.f27410Q;
        if (sVar != null) {
            a4 += C11056b.m28523a(41, (C11169e) sVar);
        }
        C11433c cVar = this.f27411R;
        if (cVar != null) {
            a4 += C11056b.m28523a(42, (C11169e) cVar);
        }
        C11458u uVar3 = this.f27409P;
        if (uVar3 != null) {
            a4 += C11056b.m28523a(43, (C11169e) uVar3);
        }
        if (!this.f27436s.equals("")) {
            a4 += C11056b.m28524a(44, this.f27436s);
        }
        C11436f fVar = this.f27412S;
        if (fVar != null) {
            a4 += C11056b.m28523a(45, (C11169e) fVar);
        }
        String[] strArr11 = this.f27427j;
        if (strArr11 != null && strArr11.length > 0) {
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                String[] strArr12 = this.f27427j;
                if (i20 >= strArr12.length) {
                    break;
                }
                String str6 = strArr12[i20];
                if (str6 != null) {
                    i22++;
                    i21 += C11056b.m28529a(str6);
                }
                i20++;
            }
            a4 = a4 + i21 + (i22 * 2);
        }
        String[] strArr13 = this.f27413T;
        if (strArr13 != null && strArr13.length > 0) {
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            while (true) {
                String[] strArr14 = this.f27413T;
                if (i23 >= strArr14.length) {
                    break;
                }
                String str7 = strArr14[i23];
                if (str7 != null) {
                    i25++;
                    i24 += C11056b.m28529a(str7);
                }
                i23++;
            }
            a4 = a4 + i24 + (i25 * 2);
        }
        C11432b bVar = this.f27414U;
        if (bVar != null) {
            a4 += C11056b.m28523a(48, (C11169e) bVar);
        }
        if (!this.f27398E.equals("")) {
            a4 += C11056b.m28524a(49, this.f27398E);
        }
        C11429a aVar = this.f27415V;
        if (aVar != null) {
            a4 += C11056b.m28523a(51, (C11169e) aVar);
        }
        C11438h hVar = this.f27416W;
        if (hVar != null) {
            a4 += C11056b.m28523a(52, (C11169e) hVar);
        }
        C11437g gVar = this.f27417X;
        if (gVar != null) {
            a4 += C11056b.m28523a(53, (C11169e) gVar);
        }
        C11434d[] dVarArr = this.f27428k;
        if (dVarArr != null && dVarArr.length > 0) {
            while (true) {
                C11434d[] dVarArr2 = this.f27428k;
                if (i >= dVarArr2.length) {
                    break;
                }
                C11434d dVar = dVarArr2[i];
                if (dVar != null) {
                    a4 += C11056b.m28523a(54, (C11169e) dVar);
                }
                i++;
            }
        }
        C11454q qVar = this.f27418Y;
        return qVar != null ? a4 + C11056b.m28523a(55, (C11169e) qVar) : a4;
    }

    /* renamed from: a */
    public C11169e mo61539a(C11009a aVar) throws IOException {
        while (true) {
            int l = aVar.mo62628l();
            switch (l) {
                case 0:
                    break;
                case 10:
                    this.f27419b = aVar.mo62627k();
                    continue;
                case 24:
                    this.f27420c = aVar.mo62625i();
                    continue;
                case 34:
                    int a = C11256g.m29012a(aVar, 34);
                    String[] strArr = this.f27421d;
                    int length = strArr == null ? 0 : strArr.length;
                    int i = a + length;
                    String[] strArr2 = new String[i];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i - 1) {
                        strArr2[length] = aVar.mo62627k();
                        aVar.mo62628l();
                        length++;
                    }
                    strArr2[length] = aVar.mo62627k();
                    this.f27421d = strArr2;
                    continue;
                case 42:
                    this.f27422e = aVar.mo62627k();
                    continue;
                case 50:
                    this.f27423f = aVar.mo62627k();
                    continue;
                case 58:
                    int a2 = C11256g.m29012a(aVar, 58);
                    String[] strArr3 = this.f27424g;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i2 = a2 + length2;
                    String[] strArr4 = new String[i2];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        strArr4[length2] = aVar.mo62627k();
                        aVar.mo62628l();
                        length2++;
                    }
                    strArr4[length2] = aVar.mo62627k();
                    this.f27424g = strArr4;
                    continue;
                case 66:
                    int a3 = C11256g.m29012a(aVar, 66);
                    String[] strArr5 = this.f27425h;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int i3 = a3 + length3;
                    String[] strArr6 = new String[i3];
                    if (length3 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < i3 - 1) {
                        strArr6[length3] = aVar.mo62627k();
                        aVar.mo62628l();
                        length3++;
                    }
                    strArr6[length3] = aVar.mo62627k();
                    this.f27425h = strArr6;
                    continue;
                case 74:
                    int a4 = C11256g.m29012a(aVar, 74);
                    String[] strArr7 = this.f27426i;
                    int length4 = strArr7 == null ? 0 : strArr7.length;
                    int i4 = a4 + length4;
                    String[] strArr8 = new String[i4];
                    if (length4 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length4);
                    }
                    while (length4 < i4 - 1) {
                        strArr8[length4] = aVar.mo62627k();
                        aVar.mo62628l();
                        length4++;
                    }
                    strArr8[length4] = aVar.mo62627k();
                    this.f27426i = strArr8;
                    continue;
                case 82:
                    if (this.f27429l == null) {
                        this.f27429l = new C11439i();
                    }
                    aVar.mo62611a((C11169e) this.f27429l);
                    continue;
                case 90:
                    int a5 = C11256g.m29012a(aVar, 90);
                    C11441k[] kVarArr = this.f27430m;
                    int length5 = kVarArr == null ? 0 : kVarArr.length;
                    int i5 = a5 + length5;
                    C11441k[] kVarArr2 = new C11441k[i5];
                    if (length5 != 0) {
                        System.arraycopy(kVarArr, 0, kVarArr2, 0, length5);
                    }
                    while (length5 < i5 - 1) {
                        kVarArr2[length5] = new C11441k();
                        aVar.mo62611a((C11169e) kVarArr2[length5]);
                        aVar.mo62628l();
                        length5++;
                    }
                    kVarArr2[length5] = new C11441k();
                    aVar.mo62611a((C11169e) kVarArr2[length5]);
                    this.f27430m = kVarArr2;
                    continue;
                case 98:
                    if (this.f27431n == null) {
                        this.f27431n = new C11462y();
                    }
                    aVar.mo62611a((C11169e) this.f27431n);
                    continue;
                case 106:
                    if (this.f27432o == null) {
                        this.f27432o = new C11453p();
                    }
                    aVar.mo62611a((C11169e) this.f27432o);
                    continue;
                case 114:
                    int a6 = C11256g.m29012a(aVar, 114);
                    C11450n[] nVarArr = this.f27433p;
                    int length6 = nVarArr == null ? 0 : nVarArr.length;
                    int i6 = a6 + length6;
                    C11450n[] nVarArr2 = new C11450n[i6];
                    if (length6 != 0) {
                        System.arraycopy(nVarArr, 0, nVarArr2, 0, length6);
                    }
                    while (length6 < i6 - 1) {
                        nVarArr2[length6] = new C11450n();
                        aVar.mo62611a((C11169e) nVarArr2[length6]);
                        aVar.mo62628l();
                        length6++;
                    }
                    nVarArr2[length6] = new C11450n();
                    aVar.mo62611a((C11169e) nVarArr2[length6]);
                    this.f27433p = nVarArr2;
                    continue;
                case 122:
                    this.f27434q = aVar.mo62627k();
                    continue;
                case 130:
                    this.f27435r = aVar.mo62627k();
                    continue;
                case 136:
                    this.f27437t = aVar.mo62615c();
                    continue;
                case 154:
                    this.f27438u = aVar.mo62627k();
                    continue;
                case 162:
                    int a7 = C11256g.m29012a(aVar, 162);
                    String[] strArr9 = this.f27439v;
                    int length7 = strArr9 == null ? 0 : strArr9.length;
                    int i7 = a7 + length7;
                    String[] strArr10 = new String[i7];
                    if (length7 != 0) {
                        System.arraycopy(strArr9, 0, strArr10, 0, length7);
                    }
                    while (length7 < i7 - 1) {
                        strArr10[length7] = aVar.mo62627k();
                        aVar.mo62628l();
                        length7++;
                    }
                    strArr10[length7] = aVar.mo62627k();
                    this.f27439v = strArr10;
                    continue;
                case 170:
                    if (this.f27440w == null) {
                        this.f27440w = new C11455r();
                    }
                    aVar.mo62611a((C11169e) this.f27440w);
                    continue;
                case 176:
                    this.f27441x = aVar.mo62615c();
                    continue;
                case 186:
                    int a8 = C11256g.m29012a(aVar, 186);
                    C11448l[] lVarArr = this.f27442y;
                    int length8 = lVarArr == null ? 0 : lVarArr.length;
                    int i8 = a8 + length8;
                    C11448l[] lVarArr2 = new C11448l[i8];
                    if (length8 != 0) {
                        System.arraycopy(lVarArr, 0, lVarArr2, 0, length8);
                    }
                    while (length8 < i8 - 1) {
                        lVarArr2[length8] = new C11448l();
                        aVar.mo62611a((C11169e) lVarArr2[length8]);
                        aVar.mo62628l();
                        length8++;
                    }
                    lVarArr2[length8] = new C11448l();
                    aVar.mo62611a((C11169e) lVarArr2[length8]);
                    this.f27442y = lVarArr2;
                    continue;
                case 194:
                    if (this.f27443z == null) {
                        this.f27443z = new C11452o();
                    }
                    aVar.mo62611a((C11169e) this.f27443z);
                    continue;
                case ErrorCode.DIFFERENT_DURATION_EXPECTED_ERROR:
                    this.f27394A = aVar.mo62627k();
                    continue;
                case 210:
                    this.f27395B = aVar.mo62627k();
                    continue;
                case 218:
                    this.f27397D = aVar.mo62627k();
                    continue;
                case 224:
                    this.f27399F = aVar.mo62625i();
                    continue;
                case 232:
                    this.f27400G = aVar.mo62625i();
                    continue;
                case 240:
                    this.f27401H = aVar.mo62615c();
                    continue;
                case 250:
                    this.f27396C = aVar.mo62627k();
                    continue;
                case 258:
                    if (this.f27402I == null) {
                        this.f27402I = new C11449m();
                    }
                    aVar.mo62611a((C11169e) this.f27402I);
                    continue;
                case 266:
                    if (this.f27403J == null) {
                        this.f27403J = new C11440j();
                    }
                    aVar.mo62611a((C11169e) this.f27403J);
                    continue;
                case 280:
                    this.f27404K = aVar.mo62624h();
                    continue;
                case 288:
                    this.f27405L = aVar.mo62624h();
                    continue;
                case 298:
                    if (this.f27406M == null) {
                        this.f27406M = new C11459v();
                    }
                    aVar.mo62611a((C11169e) this.f27406M);
                    continue;
                case 306:
                    if (this.f27407N == null) {
                        this.f27407N = new C11458u();
                    }
                    aVar.mo62611a((C11169e) this.f27407N);
                    continue;
                case 314:
                    if (this.f27408O == null) {
                        this.f27408O = new C11458u();
                    }
                    aVar.mo62611a((C11169e) this.f27408O);
                    continue;
                case 330:
                    if (this.f27410Q == null) {
                        this.f27410Q = new C11456s();
                    }
                    aVar.mo62611a((C11169e) this.f27410Q);
                    continue;
                case 338:
                    if (this.f27411R == null) {
                        this.f27411R = new C11433c();
                    }
                    aVar.mo62611a((C11169e) this.f27411R);
                    continue;
                case 346:
                    if (this.f27409P == null) {
                        this.f27409P = new C11458u();
                    }
                    aVar.mo62611a((C11169e) this.f27409P);
                    continue;
                case 354:
                    this.f27436s = aVar.mo62627k();
                    continue;
                case 362:
                    if (this.f27412S == null) {
                        this.f27412S = new C11436f();
                    }
                    aVar.mo62611a((C11169e) this.f27412S);
                    continue;
                case 370:
                    int a9 = C11256g.m29012a(aVar, 370);
                    String[] strArr11 = this.f27427j;
                    int length9 = strArr11 == null ? 0 : strArr11.length;
                    int i9 = a9 + length9;
                    String[] strArr12 = new String[i9];
                    if (length9 != 0) {
                        System.arraycopy(strArr11, 0, strArr12, 0, length9);
                    }
                    while (length9 < i9 - 1) {
                        strArr12[length9] = aVar.mo62627k();
                        aVar.mo62628l();
                        length9++;
                    }
                    strArr12[length9] = aVar.mo62627k();
                    this.f27427j = strArr12;
                    continue;
                case 378:
                    int a10 = C11256g.m29012a(aVar, 378);
                    String[] strArr13 = this.f27413T;
                    int length10 = strArr13 == null ? 0 : strArr13.length;
                    int i10 = a10 + length10;
                    String[] strArr14 = new String[i10];
                    if (length10 != 0) {
                        System.arraycopy(strArr13, 0, strArr14, 0, length10);
                    }
                    while (length10 < i10 - 1) {
                        strArr14[length10] = aVar.mo62627k();
                        aVar.mo62628l();
                        length10++;
                    }
                    strArr14[length10] = aVar.mo62627k();
                    this.f27413T = strArr14;
                    continue;
                case 386:
                    if (this.f27414U == null) {
                        this.f27414U = new C11432b();
                    }
                    aVar.mo62611a((C11169e) this.f27414U);
                    continue;
                case 394:
                    this.f27398E = aVar.mo62627k();
                    continue;
                case ErrorCode.VERIFICATION_UNIT_NOT_EXECUTED_ERROR:
                    if (this.f27415V == null) {
                        this.f27415V = new C11429a();
                    }
                    aVar.mo62611a((C11169e) this.f27415V);
                    continue;
                case 418:
                    if (this.f27416W == null) {
                        this.f27416W = new C11438h();
                    }
                    aVar.mo62611a((C11169e) this.f27416W);
                    continue;
                case 426:
                    if (this.f27417X == null) {
                        this.f27417X = new C11437g();
                    }
                    aVar.mo62611a((C11169e) this.f27417X);
                    continue;
                case 434:
                    int a11 = C11256g.m29012a(aVar, 434);
                    C11434d[] dVarArr = this.f27428k;
                    int length11 = dVarArr == null ? 0 : dVarArr.length;
                    int i11 = a11 + length11;
                    C11434d[] dVarArr2 = new C11434d[i11];
                    if (length11 != 0) {
                        System.arraycopy(dVarArr, 0, dVarArr2, 0, length11);
                    }
                    while (length11 < i11 - 1) {
                        dVarArr2[length11] = new C11434d();
                        aVar.mo62611a((C11169e) dVarArr2[length11]);
                        aVar.mo62628l();
                        length11++;
                    }
                    dVarArr2[length11] = new C11434d();
                    aVar.mo62611a((C11169e) dVarArr2[length11]);
                    this.f27428k = dVarArr2;
                    continue;
                case 442:
                    if (this.f27418Y == null) {
                        this.f27418Y = new C11454q();
                    }
                    aVar.mo62611a((C11169e) this.f27418Y);
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
