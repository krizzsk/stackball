package com.yandex.mobile.ads.exo;

import android.util.Pair;
import com.yandex.mobile.ads.exo.C12270q;
import com.yandex.mobile.ads.exo.source.C12285e;
import com.yandex.mobile.ads.exo.source.C12287f;
import com.yandex.mobile.ads.impl.C13479j9;

/* renamed from: com.yandex.mobile.ads.exo.k */
final class C12225k {

    /* renamed from: a */
    private final C12270q.C12272b f29834a = new C12270q.C12272b();

    /* renamed from: b */
    private final C12270q.C12273c f29835b = new C12270q.C12273c();

    /* renamed from: c */
    private long f29836c;

    /* renamed from: d */
    private C12270q f29837d = C12270q.f30037a;

    /* renamed from: e */
    private int f29838e;

    /* renamed from: f */
    private boolean f29839f;

    /* renamed from: g */
    private C12223i f29840g;

    /* renamed from: h */
    private C12223i f29841h;

    /* renamed from: i */
    private C12223i f29842i;

    /* renamed from: j */
    private int f29843j;

    /* renamed from: k */
    private Object f29844k;

    /* renamed from: l */
    private long f29845l;

    /* renamed from: g */
    private boolean m31993g() {
        C12223i iVar = this.f29840g;
        if (iVar == null) {
            return true;
        }
        int a = this.f29837d.mo65186a(iVar.f29814b);
        while (true) {
            a = this.f29837d.mo65185a(a, this.f29834a, this.f29835b, this.f29838e, this.f29839f);
            while (iVar.mo64952d() != null && !iVar.f29818f.f29832f) {
                iVar = iVar.mo64952d();
            }
            C12223i d = iVar.mo64952d();
            if (a == -1 || d == null || this.f29837d.mo65186a(d.f29814b) != a) {
                boolean a2 = mo64972a(iVar);
                iVar.f29818f = mo64965a(iVar.f29818f);
            } else {
                iVar = d;
            }
        }
        boolean a22 = mo64972a(iVar);
        iVar.f29818f = mo64965a(iVar.f29818f);
        return !a22;
    }

    /* renamed from: a */
    public void mo64968a(C12270q qVar) {
        this.f29837d = qVar;
    }

    /* renamed from: b */
    public boolean mo64975b(boolean z) {
        this.f29839f = z;
        return m31993g();
    }

    /* renamed from: c */
    public C12223i mo64976c() {
        return this.f29842i;
    }

    /* renamed from: d */
    public C12223i mo64977d() {
        return this.f29840g;
    }

    /* renamed from: e */
    public C12223i mo64978e() {
        return this.f29841h;
    }

    /* renamed from: f */
    public boolean mo64979f() {
        C12223i iVar = this.f29842i;
        return iVar == null || (!iVar.f29818f.f29833g && iVar.mo64958i() && this.f29842i.f29818f.f29831e != -9223372036854775807L && this.f29843j < 100);
    }

    /* renamed from: a */
    public boolean mo64970a(int i) {
        this.f29838e = i;
        return m31993g();
    }

    /* renamed from: b */
    public C12223i mo64974b() {
        C12223i iVar = this.f29841h;
        C13479j9.m37708b((iVar == null || iVar.mo64952d() == null) ? false : true);
        C12223i d = this.f29841h.mo64952d();
        this.f29841h = d;
        return d;
    }

    /* renamed from: a */
    public boolean mo64973a(C12285e eVar) {
        C12223i iVar = this.f29842i;
        return iVar != null && iVar.f29813a == eVar;
    }

    /* renamed from: b */
    private C12287f.C12288a m31992b(Object obj, long j, long j2) {
        C12270q qVar = this.f29837d;
        qVar.mo65188a(qVar.mo65186a(obj), this.f29834a, true);
        int b = this.f29834a.mo65203b(j);
        if (b == -1) {
            return new C12287f.C12288a(obj, j2, this.f29834a.mo65198a(j));
        }
        return new C12287f.C12288a(obj, b, this.f29834a.mo65206c(b), j2);
    }

    /* renamed from: a */
    public void mo64967a(long j) {
        C12223i iVar = this.f29842i;
        if (iVar != null) {
            iVar.mo64948b(j);
        }
    }

    /* renamed from: a */
    public C12224j mo64964a(long j, C12226l lVar) {
        C12223i iVar = this.f29842i;
        if (iVar != null) {
            return m31987a(iVar, j);
        }
        return m31988a(lVar.f29848b, lVar.f29850d, lVar.f29849c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r1 != -9223372036854775807L) goto L_0x002c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.mobile.ads.exo.C12223i mo64963a(com.yandex.mobile.ads.exo.C12178d[] r12, com.yandex.mobile.ads.exo.trackselection.C12334f r13, com.yandex.mobile.ads.impl.C13477j7 r14, com.yandex.mobile.ads.exo.source.C12287f r15, com.yandex.mobile.ads.exo.C12224j r16, com.yandex.mobile.ads.impl.le1 r17) {
        /*
            r11 = this;
            r0 = r11
            r8 = r16
            com.yandex.mobile.ads.exo.i r1 = r0.f29842i
            if (r1 != 0) goto L_0x001e
            com.yandex.mobile.ads.exo.source.f$a r1 = r8.f29827a
            boolean r1 = r1.mo65283a()
            if (r1 == 0) goto L_0x001b
            long r1 = r8.f29829c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x001b
            goto L_0x002c
        L_0x001b:
            r1 = 0
            goto L_0x002c
        L_0x001e:
            long r1 = r1.mo64953e()
            com.yandex.mobile.ads.exo.i r3 = r0.f29842i
            com.yandex.mobile.ads.exo.j r3 = r3.f29818f
            long r3 = r3.f29831e
            long r1 = r1 + r3
            long r3 = r8.f29828b
            long r1 = r1 - r3
        L_0x002c:
            r3 = r1
            com.yandex.mobile.ads.exo.i r10 = new com.yandex.mobile.ads.exo.i
            r1 = r10
            r2 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r5, r6, r7, r8, r9)
            com.yandex.mobile.ads.exo.i r1 = r0.f29842i
            if (r1 == 0) goto L_0x0043
            r1.mo64946a((com.yandex.mobile.ads.exo.C12223i) r10)
            goto L_0x0047
        L_0x0043:
            r0.f29840g = r10
            r0.f29841h = r10
        L_0x0047:
            r1 = 0
            r0.f29844k = r1
            r0.f29842i = r10
            int r1 = r0.f29843j
            int r1 = r1 + 1
            r0.f29843j = r1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.C12225k.mo64963a(com.yandex.mobile.ads.exo.d[], com.yandex.mobile.ads.exo.trackselection.f, com.yandex.mobile.ads.impl.j7, com.yandex.mobile.ads.exo.source.f, com.yandex.mobile.ads.exo.j, com.yandex.mobile.ads.impl.le1):com.yandex.mobile.ads.exo.i");
    }

    /* renamed from: a */
    public C12223i mo64962a() {
        C12223i iVar = this.f29840g;
        if (iVar == null) {
            return null;
        }
        if (iVar == this.f29841h) {
            this.f29841h = iVar.mo64952d();
        }
        this.f29840g.mo64959k();
        int i = this.f29843j - 1;
        this.f29843j = i;
        if (i == 0) {
            this.f29842i = null;
            C12223i iVar2 = this.f29840g;
            this.f29844k = iVar2.f29814b;
            this.f29845l = iVar2.f29818f.f29827a.f30088d;
        }
        C12223i d = this.f29840g.mo64952d();
        this.f29840g = d;
        return d;
    }

    /* renamed from: a */
    public boolean mo64972a(C12223i iVar) {
        boolean z = false;
        C13479j9.m37708b(iVar != null);
        this.f29842i = iVar;
        while (iVar.mo64952d() != null) {
            iVar = iVar.mo64952d();
            if (iVar == this.f29841h) {
                this.f29841h = this.f29840g;
                z = true;
            }
            iVar.mo64959k();
            this.f29843j--;
        }
        this.f29842i.mo64946a((C12223i) null);
        return z;
    }

    /* renamed from: a */
    public void mo64969a(boolean z) {
        C12223i iVar = this.f29840g;
        if (iVar != null) {
            this.f29844k = z ? iVar.f29814b : null;
            this.f29845l = iVar.f29818f.f29827a.f30088d;
            mo64972a(iVar);
            iVar.mo64959k();
        } else if (!z) {
            this.f29844k = null;
        }
        this.f29840g = null;
        this.f29842i = null;
        this.f29841h = null;
        this.f29843j = 0;
    }

    /* renamed from: a */
    public boolean mo64971a(long j, long j2) {
        C12224j jVar;
        C12224j jVar2;
        long j3;
        boolean a;
        C12223i iVar = this.f29840g;
        C12223i iVar2 = null;
        while (iVar != null) {
            C12224j jVar3 = iVar.f29818f;
            if (iVar2 == null) {
                jVar = mo64965a(jVar3);
                long j4 = j;
            } else {
                C12224j a2 = m31987a(iVar2, j);
                if (a2 == null) {
                    a = mo64972a(iVar2);
                } else {
                    if (!(jVar3.f29828b == a2.f29828b && jVar3.f29827a.equals(a2.f29827a))) {
                        a = mo64972a(iVar2);
                    } else {
                        jVar = a2;
                    }
                }
                return !a;
            }
            long j5 = jVar3.f29829c;
            if (j5 == jVar.f29829c) {
                jVar2 = jVar;
            } else {
                jVar2 = new C12224j(jVar.f29827a, jVar.f29828b, j5, jVar.f29830d, jVar.f29831e, jVar.f29832f, jVar.f29833g);
            }
            iVar.f29818f = jVar2;
            long j6 = jVar3.f29831e;
            long j7 = jVar.f29831e;
            if (!(j6 == -9223372036854775807L || j6 == j7)) {
                if (j7 == -9223372036854775807L) {
                    j3 = Long.MAX_VALUE;
                } else {
                    j3 = iVar.mo64954e(j7);
                }
                boolean z = iVar == this.f29841h && (j2 == Long.MIN_VALUE || j2 >= j3);
                if (mo64972a(iVar) || z) {
                    return false;
                }
                return true;
            }
            iVar2 = iVar;
            iVar = iVar.mo64952d();
        }
        return true;
    }

    /* renamed from: a */
    public C12224j mo64965a(C12224j jVar) {
        long j;
        C12287f.C12288a aVar = jVar.f29827a;
        boolean z = !aVar.mo65283a() && aVar.f30089e == -1;
        boolean a = m31991a(aVar, z);
        this.f29837d.mo65189a(jVar.f29827a.f30085a, this.f29834a);
        if (aVar.mo65283a()) {
            j = this.f29834a.mo65200a(aVar.f30086b, aVar.f30087c);
        } else {
            j = jVar.f29830d;
            if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
                j = this.f29834a.f30041d;
            }
        }
        return new C12224j(aVar, jVar.f29828b, jVar.f29829c, jVar.f29830d, j, z, a);
    }

    /* renamed from: a */
    public C12287f.C12288a mo64966a(Object obj, long j) {
        long j2;
        int a;
        C12270q qVar = this.f29837d;
        int i = qVar.mo65188a(qVar.mo65186a(obj), this.f29834a, true).f30040c;
        Object obj2 = this.f29844k;
        if (obj2 == null || (a = this.f29837d.mo65186a(obj2)) == -1 || this.f29837d.mo65188a(a, this.f29834a, false).f30040c != i) {
            C12223i iVar = this.f29840g;
            while (true) {
                if (iVar == null) {
                    C12223i iVar2 = this.f29840g;
                    while (true) {
                        if (iVar2 != null) {
                            int a2 = this.f29837d.mo65186a(iVar2.f29814b);
                            if (a2 != -1 && this.f29837d.mo65188a(a2, this.f29834a, false).f30040c == i) {
                                j2 = iVar2.f29818f.f29827a.f30088d;
                                break;
                            }
                            iVar2 = iVar2.mo64952d();
                        } else {
                            j2 = this.f29836c;
                            this.f29836c = 1 + j2;
                            if (this.f29840g == null) {
                                this.f29844k = obj;
                                this.f29845l = j2;
                            }
                        }
                    }
                } else if (iVar.f29814b.equals(obj)) {
                    j2 = iVar.f29818f.f29827a.f30088d;
                    break;
                } else {
                    iVar = iVar.mo64952d();
                }
            }
        } else {
            j2 = this.f29845l;
        }
        return m31992b(obj, j, j2);
    }

    /* renamed from: a */
    private C12224j m31987a(C12223i iVar, long j) {
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        C12224j jVar = iVar.f29818f;
        long e = (iVar.mo64953e() + jVar.f29831e) - j;
        long j6 = 0;
        if (jVar.f29832f) {
            int a = this.f29837d.mo65185a(this.f29837d.mo65186a(jVar.f29827a.f30085a), this.f29834a, this.f29835b, this.f29838e, this.f29839f);
            if (a == -1) {
                return null;
            }
            int i = this.f29837d.mo65188a(a, this.f29834a, true).f30040c;
            Object obj2 = this.f29834a.f30039b;
            long j7 = jVar.f29827a.f30088d;
            if (this.f29837d.mo65190a(i, this.f29835b, 0).f30053i == a) {
                Pair<Object, Long> a2 = this.f29837d.mo65187a(this.f29835b, this.f29834a, i, -9223372036854775807L, Math.max(0, e));
                if (a2 == null) {
                    return null;
                }
                Object obj3 = a2.first;
                long longValue = ((Long) a2.second).longValue();
                C12223i d = iVar.mo64952d();
                if (d == null || !d.f29814b.equals(obj3)) {
                    j5 = this.f29836c;
                    this.f29836c = 1 + j5;
                } else {
                    j5 = d.f29818f.f29827a.f30088d;
                }
                j3 = longValue;
                j6 = -9223372036854775807L;
                j4 = j5;
                obj = obj3;
            } else {
                obj = obj2;
                j4 = j7;
                j3 = 0;
            }
            return m31988a(m31992b(obj, j3, j4), j6, j3);
        }
        C12287f.C12288a aVar = jVar.f29827a;
        this.f29837d.mo65189a(aVar.f30085a, this.f29834a);
        if (aVar.mo65283a()) {
            int i2 = aVar.f30086b;
            int a3 = this.f29834a.mo65197a(i2);
            if (a3 == -1) {
                return null;
            }
            int b = this.f29834a.mo65202b(i2, aVar.f30087c);
            if (b >= a3) {
                long j8 = jVar.f29829c;
                if (j8 == -9223372036854775807L) {
                    C12270q qVar = this.f29837d;
                    C12270q.C12273c cVar = this.f29835b;
                    C12270q.C12272b bVar = this.f29834a;
                    Pair<Object, Long> a4 = qVar.mo65187a(cVar, bVar, bVar.f30040c, -9223372036854775807L, Math.max(0, e));
                    if (a4 == null) {
                        return null;
                    }
                    j2 = ((Long) a4.second).longValue();
                } else {
                    j2 = j8;
                }
                return m31990a(aVar.f30085a, j2, aVar.f30088d);
            } else if (!this.f29834a.mo65208c(i2, b)) {
                return null;
            } else {
                return m31989a(aVar.f30085a, i2, b, jVar.f29829c, aVar.f30088d);
            }
        } else {
            int b2 = this.f29834a.mo65203b(jVar.f29830d);
            if (b2 == -1) {
                return m31990a(aVar.f30085a, jVar.f29831e, aVar.f30088d);
            }
            int c = this.f29834a.mo65206c(b2);
            if (!this.f29834a.mo65208c(b2, c)) {
                return null;
            }
            return m31989a(aVar.f30085a, b2, c, jVar.f29831e, aVar.f30088d);
        }
    }

    /* renamed from: a */
    private C12224j m31988a(C12287f.C12288a aVar, long j, long j2) {
        this.f29837d.mo65189a(aVar.f30085a, this.f29834a);
        if (!aVar.mo65283a()) {
            return m31990a(aVar.f30085a, j2, aVar.f30088d);
        } else if (!this.f29834a.mo65208c(aVar.f30086b, aVar.f30087c)) {
            return null;
        } else {
            return m31989a(aVar.f30085a, aVar.f30086b, aVar.f30087c, j, aVar.f30088d);
        }
    }

    /* renamed from: a */
    private C12224j m31989a(Object obj, int i, int i2, long j, long j2) {
        int i3 = i;
        int i4 = i2;
        C12287f.C12288a aVar = new C12287f.C12288a(obj, i, i2, j2);
        long a = this.f29837d.mo65189a(obj, this.f29834a).mo65200a(i3, i4);
        if (i4 == this.f29834a.mo65206c(i3)) {
            this.f29834a.mo65199a();
        }
        return new C12224j(aVar, 0, j, -9223372036854775807L, a, false, false);
    }

    /* renamed from: a */
    private C12224j m31990a(Object obj, long j, long j2) {
        long j3;
        int a = this.f29834a.mo65198a(j);
        C12287f.C12288a aVar = new C12287f.C12288a(obj, j2, a);
        boolean z = !aVar.mo65283a() && a == -1;
        boolean a2 = m31991a(aVar, z);
        long b = a != -1 ? this.f29834a.mo65205b(a) : -9223372036854775807L;
        if (b == -9223372036854775807L || b == Long.MIN_VALUE) {
            j3 = this.f29834a.f30041d;
        } else {
            j3 = b;
        }
        return new C12224j(aVar, j, -9223372036854775807L, b, j3, z, a2);
    }

    /* renamed from: a */
    private boolean m31991a(C12287f.C12288a aVar, boolean z) {
        int a = this.f29837d.mo65186a(aVar.f30085a);
        if (this.f29837d.mo65190a(this.f29837d.mo65188a(a, this.f29834a, false).f30040c, this.f29835b, 0).f30051g) {
            return false;
        }
        if (!(this.f29837d.mo65185a(a, this.f29834a, this.f29835b, this.f29838e, this.f29839f) == -1) || !z) {
            return false;
        }
        return true;
    }
}
