package com.yandex.mobile.ads.exo;

import android.util.Pair;
import com.yandex.mobile.ads.impl.C12848d3;
import com.yandex.mobile.ads.impl.C12874dd;
import com.yandex.mobile.ads.impl.C13479j9;
import com.yandex.mobile.ads.impl.ih1;

/* renamed from: com.yandex.mobile.ads.exo.q */
public abstract class C12270q {

    /* renamed from: a */
    public static final C12270q f30037a = new C12271a();

    /* renamed from: com.yandex.mobile.ads.exo.q$a */
    class C12271a extends C12270q {
        C12271a() {
        }

        /* renamed from: a */
        public int mo65186a(Object obj) {
            return -1;
        }

        /* renamed from: a */
        public C12273c mo65190a(int i, C12273c cVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: b */
        public int mo65192b() {
            return 0;
        }

        /* renamed from: c */
        public int mo65193c() {
            return 0;
        }

        /* renamed from: a */
        public C12272b mo65188a(int i, C12272b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: a */
        public Object mo65191a(int i) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.q$b */
    public static final class C12272b {

        /* renamed from: a */
        public Object f30038a;

        /* renamed from: b */
        public Object f30039b;

        /* renamed from: c */
        public int f30040c;

        /* renamed from: d */
        public long f30041d;

        /* renamed from: e */
        private long f30042e;

        /* renamed from: f */
        private C12848d3 f30043f = C12848d3.f32352e;

        /* renamed from: a */
        public C12272b mo65201a(Object obj, Object obj2, int i, long j, long j2) {
            C12848d3 d3Var = C12848d3.f32352e;
            this.f30038a = null;
            this.f30039b = obj2;
            this.f30040c = i;
            this.f30041d = j;
            this.f30042e = j2;
            this.f30043f = d3Var;
            return this;
        }

        /* renamed from: b */
        public long mo65204b() {
            return C12874dd.m35213b(this.f30042e);
        }

        /* renamed from: c */
        public long mo65207c() {
            return this.f30042e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (C12272b.class.equals(obj.getClass())) {
                    C12272b bVar = (C12272b) obj;
                    if (!ih1.m37382a(this.f30038a, bVar.f30038a) || !ih1.m37382a(this.f30039b, bVar.f30039b) || this.f30040c != bVar.f30040c || this.f30041d != bVar.f30041d || this.f30042e != bVar.f30042e || !ih1.m37382a((Object) this.f30043f, (Object) bVar.f30043f)) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f30038a;
            int i = 0;
            int hashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
            Object obj2 = this.f30039b;
            int hashCode2 = obj2 == null ? 0 : obj2.hashCode();
            long j = this.f30041d;
            long j2 = this.f30042e;
            int i2 = (((((((hashCode + hashCode2) * 31) + this.f30040c) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            C12848d3 d3Var = this.f30043f;
            if (d3Var != null) {
                i = d3Var.hashCode();
            }
            return i2 + i;
        }

        /* renamed from: b */
        public long mo65205b(int i) {
            return this.f30043f.f32354b[i];
        }

        /* renamed from: c */
        public int mo65206c(int i) {
            return this.f30043f.f32355c[i].mo66397a(-1);
        }

        /* renamed from: b */
        public int mo65202b(int i, int i2) {
            return this.f30043f.f32355c[i].mo66397a(i2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0031 A[LOOP:0: B:1:0x0009->B:15:0x0031, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0034 A[EDGE_INSN: B:21:0x0034->B:16:0x0034 ?: BREAK  , SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo65203b(long r11) {
            /*
                r10 = this;
                com.yandex.mobile.ads.impl.d3 r0 = r10.f30043f
                long r1 = r10.f30041d
                long[] r3 = r0.f32354b
                int r3 = r3.length
                r4 = 1
                int r3 = r3 - r4
            L_0x0009:
                if (r3 < 0) goto L_0x0034
                r5 = -9223372036854775808
                int r7 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r7 != 0) goto L_0x0012
                goto L_0x002e
            L_0x0012:
                long[] r7 = r0.f32354b
                r8 = r7[r3]
                int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r7 != 0) goto L_0x0028
                r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r7 == 0) goto L_0x002c
                int r5 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
                if (r5 >= 0) goto L_0x002e
                goto L_0x002c
            L_0x0028:
                int r5 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r5 >= 0) goto L_0x002e
            L_0x002c:
                r5 = 1
                goto L_0x002f
            L_0x002e:
                r5 = 0
            L_0x002f:
                if (r5 == 0) goto L_0x0034
                int r3 = r3 + -1
                goto L_0x0009
            L_0x0034:
                if (r3 < 0) goto L_0x0041
                com.yandex.mobile.ads.impl.d3$a[] r11 = r0.f32355c
                r11 = r11[r3]
                boolean r11 = r11.mo66398a()
                if (r11 == 0) goto L_0x0041
                goto L_0x0042
            L_0x0041:
                r3 = -1
            L_0x0042:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.C12270q.C12272b.mo65203b(long):int");
        }

        /* renamed from: c */
        public boolean mo65208c(int i, int i2) {
            C12848d3.C12849a aVar = this.f30043f.f32355c[i];
            return (aVar.f32357a == -1 || aVar.f32359c[i2] == 0) ? false : true;
        }

        /* renamed from: a */
        public int mo65198a(long j) {
            C12848d3 d3Var = this.f30043f;
            long j2 = this.f30041d;
            d3Var.getClass();
            if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
                int i = 0;
                while (true) {
                    long[] jArr = d3Var.f32354b;
                    if (i < jArr.length && jArr[i] != Long.MIN_VALUE && (j >= jArr[i] || !d3Var.f32355c[i].mo66398a())) {
                        i++;
                    }
                }
                if (i < d3Var.f32354b.length) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: a */
        public int mo65197a(int i) {
            return this.f30043f.f32355c[i].f32357a;
        }

        /* renamed from: a */
        public long mo65200a(int i, int i2) {
            C12848d3.C12849a aVar = this.f30043f.f32355c[i];
            if (aVar.f32357a != -1) {
                return aVar.f32360d[i2];
            }
            return -9223372036854775807L;
        }

        /* renamed from: a */
        public long mo65199a() {
            this.f30043f.getClass();
            return 0;
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.q$c */
    public static final class C12273c {

        /* renamed from: n */
        public static final Object f30044n = new Object();

        /* renamed from: a */
        public Object f30045a = f30044n;

        /* renamed from: b */
        public Object f30046b;

        /* renamed from: c */
        public Object f30047c;

        /* renamed from: d */
        public long f30048d;

        /* renamed from: e */
        public long f30049e;

        /* renamed from: f */
        public boolean f30050f;

        /* renamed from: g */
        public boolean f30051g;

        /* renamed from: h */
        public boolean f30052h;

        /* renamed from: i */
        public int f30053i;

        /* renamed from: j */
        public int f30054j;

        /* renamed from: k */
        public long f30055k;

        /* renamed from: l */
        public long f30056l;

        /* renamed from: m */
        public long f30057m;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (C12273c.class.equals(obj.getClass())) {
                    C12273c cVar = (C12273c) obj;
                    if (ih1.m37382a(this.f30045a, cVar.f30045a) && ih1.m37382a(this.f30046b, cVar.f30046b) && ih1.m37382a(this.f30047c, cVar.f30047c) && this.f30048d == cVar.f30048d && this.f30049e == cVar.f30049e && this.f30050f == cVar.f30050f && this.f30051g == cVar.f30051g && this.f30052h == cVar.f30052h && this.f30055k == cVar.f30055k && this.f30056l == cVar.f30056l && this.f30053i == cVar.f30053i && this.f30054j == cVar.f30054j && this.f30057m == cVar.f30057m) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }

        public int hashCode() {
            int hashCode = (this.f30045a.hashCode() + 217) * 31;
            Object obj = this.f30046b;
            int i = 0;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f30047c;
            if (obj2 != null) {
                i = obj2.hashCode();
            }
            long j = this.f30048d;
            long j2 = this.f30049e;
            long j3 = this.f30055k;
            long j4 = this.f30056l;
            long j5 = this.f30057m;
            return ((((((((((((((((((((hashCode2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f30050f ? 1 : 0)) * 31) + (this.f30051g ? 1 : 0)) * 31) + (this.f30052h ? 1 : 0)) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f30053i) * 31) + this.f30054j) * 31) + ((int) (j5 ^ (j5 >>> 32)));
        }
    }

    /* renamed from: a */
    public int mo65184a() {
        return mo65194d() ? -1 : 0;
    }

    /* renamed from: a */
    public abstract int mo65186a(Object obj);

    /* renamed from: a */
    public abstract C12272b mo65188a(int i, C12272b bVar, boolean z);

    /* renamed from: a */
    public abstract C12273c mo65190a(int i, C12273c cVar, long j);

    /* renamed from: a */
    public abstract Object mo65191a(int i);

    /* renamed from: b */
    public abstract int mo65192b();

    /* renamed from: c */
    public abstract int mo65193c();

    /* renamed from: d */
    public final boolean mo65194d() {
        return mo65193c() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12270q)) {
            return false;
        }
        C12270q qVar = (C12270q) obj;
        if (qVar.mo65193c() != mo65193c() || qVar.mo65192b() != mo65192b()) {
            return false;
        }
        C12273c cVar = new C12273c();
        C12272b bVar = new C12272b();
        C12273c cVar2 = new C12273c();
        C12272b bVar2 = new C12272b();
        for (int i = 0; i < mo65193c(); i++) {
            if (!mo65190a(i, cVar, 0).equals(qVar.mo65190a(i, cVar2, 0))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < mo65192b(); i2++) {
            if (!mo65188a(i2, bVar, true).equals(qVar.mo65188a(i2, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        C12273c cVar = new C12273c();
        C12272b bVar = new C12272b();
        int c = mo65193c() + 217;
        for (int i = 0; i < mo65193c(); i++) {
            c = (c * 31) + mo65190a(i, cVar, 0).hashCode();
        }
        int b = (c * 31) + mo65192b();
        for (int i2 = 0; i2 < mo65192b(); i2++) {
            b = (b * 31) + mo65188a(i2, bVar, true).hashCode();
        }
        return b;
    }

    /* renamed from: a */
    public final Pair<Object, Long> mo65187a(C12273c cVar, C12272b bVar, int i, long j, long j2) {
        C13479j9.m37702a(i, 0, mo65193c());
        mo65190a(i, cVar, j2);
        if (j == -9223372036854775807L) {
            j = cVar.f30055k;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = cVar.f30053i;
        long j3 = cVar.f30057m + j;
        long j4 = mo65188a(i2, bVar, true).f30041d;
        while (j4 != -9223372036854775807L && j3 >= j4 && i2 < cVar.f30054j) {
            j3 -= j4;
            i2++;
            j4 = mo65188a(i2, bVar, true).f30041d;
        }
        Object obj = bVar.f30039b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(j3));
    }

    /* renamed from: a */
    public C12272b mo65189a(Object obj, C12272b bVar) {
        return mo65188a(mo65186a(obj), bVar, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo65185a(int r4, com.yandex.mobile.ads.exo.C12270q.C12272b r5, com.yandex.mobile.ads.exo.C12270q.C12273c r6, int r7, boolean r8) {
        /*
            r3 = this;
            r8 = 0
            com.yandex.mobile.ads.exo.q$b r5 = r3.mo65188a((int) r4, (com.yandex.mobile.ads.exo.C12270q.C12272b) r5, (boolean) r8)
            int r5 = r5.f30040c
            r0 = 0
            com.yandex.mobile.ads.exo.q$c r8 = r3.mo65190a((int) r5, (com.yandex.mobile.ads.exo.C12270q.C12273c) r6, (long) r0)
            int r8 = r8.f30054j
            r2 = 1
            if (r8 != r4) goto L_0x0051
            r4 = -1
            if (r7 == 0) goto L_0x0034
            if (r7 == r2) goto L_0x0047
            r8 = 2
            if (r7 != r8) goto L_0x002e
            boolean r7 = r3.mo65194d()
            if (r7 == 0) goto L_0x0022
            r7 = -1
            goto L_0x0027
        L_0x0022:
            int r7 = r3.mo65193c()
            int r7 = r7 - r2
        L_0x0027:
            if (r5 != r7) goto L_0x0045
            int r5 = r3.mo65184a()
            goto L_0x0047
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>()
            throw r4
        L_0x0034:
            boolean r7 = r3.mo65194d()
            if (r7 == 0) goto L_0x003c
            r7 = -1
            goto L_0x0041
        L_0x003c:
            int r7 = r3.mo65193c()
            int r7 = r7 - r2
        L_0x0041:
            if (r5 != r7) goto L_0x0045
            r5 = -1
            goto L_0x0047
        L_0x0045:
            int r5 = r5 + 1
        L_0x0047:
            if (r5 != r4) goto L_0x004a
            return r4
        L_0x004a:
            com.yandex.mobile.ads.exo.q$c r4 = r3.mo65190a((int) r5, (com.yandex.mobile.ads.exo.C12270q.C12273c) r6, (long) r0)
            int r4 = r4.f30053i
            return r4
        L_0x0051:
            int r4 = r4 + r2
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.C12270q.mo65185a(int, com.yandex.mobile.ads.exo.q$b, com.yandex.mobile.ads.exo.q$c, int, boolean):int");
    }
}
