package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.g70;
import com.yandex.mobile.ads.impl.h70;
import com.yandex.mobile.ads.impl.ke1;
import com.yandex.mobile.ads.impl.s71;
import java.io.IOException;

public final class f70 implements w50 {

    /* renamed from: a */
    private final byte[] f33256a = new byte[42];

    /* renamed from: b */
    private final fy0 f33257b = new fy0(new byte[32768], 0);

    /* renamed from: c */
    private final boolean f33258c;

    /* renamed from: d */
    private final g70.C13179a f33259d;

    /* renamed from: e */
    private x50 f33260e;

    /* renamed from: f */
    private ke1 f33261f;

    /* renamed from: g */
    private int f33262g;

    /* renamed from: h */
    private Metadata f33263h;

    /* renamed from: i */
    private k70 f33264i;

    /* renamed from: j */
    private int f33265j;

    /* renamed from: k */
    private int f33266k;

    /* renamed from: l */
    private e70 f33267l;

    /* renamed from: m */
    private int f33268m;

    /* renamed from: n */
    private long f33269n;

    static {
        $$Lambda$f70$Fkl5aXI3GB05nP5FYH8c7EheHjM r0 = $$Lambda$f70$Fkl5aXI3GB05nP5FYH8c7EheHjM.INSTANCE;
    }

    public f70(int i) {
        this.f33258c = (i & 1) == 0 ? false : true;
        this.f33259d = new g70.C13179a();
        this.f33262g = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static w50[] m35924a() {
        return new w50[]{new f70(0)};
    }

    /* renamed from: b */
    private void m35925b() {
        k70 k70 = this.f33264i;
        int i = ih1.f34858a;
        this.f33261f.mo65337a((this.f33269n * 1000000) / ((long) k70.f36003e), 1, this.f33268m, 0, (ke1.C13702a) null);
    }

    public void release() {
    }

    /* renamed from: a */
    public boolean mo64891a(C13416ik ikVar) throws IOException, InterruptedException {
        h70.m36811a(ikVar, false);
        fy0 fy0 = new fy0(4);
        ikVar.mo67806a(fy0.f33778a, 0, 4, false);
        if (fy0.mo67128t() == 1716281667) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo64890a(x50 x50) {
        this.f33260e = x50;
        this.f33261f = x50.mo65304a(0, 1);
        x50.mo65311c();
    }

    /* renamed from: a */
    public int mo64888a(C13416ik ikVar, r01 r01) throws IOException, InterruptedException {
        s71 s71;
        long j;
        boolean z;
        C13416ik ikVar2 = ikVar;
        int i = this.f33262g;
        boolean z2 = true;
        if (i == 0) {
            ikVar.mo67812d();
            long b = ikVar.mo67808b();
            Metadata a = h70.m36811a(ikVar2, !this.f33258c);
            ikVar2.mo67813d((int) (ikVar.mo67808b() - b));
            this.f33263h = a;
            this.f33262g = 1;
            return 0;
        } else if (i == 1) {
            byte[] bArr = this.f33256a;
            ikVar2.mo67806a(bArr, 0, bArr.length, false);
            ikVar.mo67812d();
            this.f33262g = 2;
            return 0;
        } else if (i == 2) {
            fy0 fy0 = new fy0(4);
            ikVar2.mo67809b(fy0.f33778a, 0, 4, false);
            if (fy0.mo67128t() == 1716281667) {
                this.f33262g = 3;
                return 0;
            }
            throw new jy0("Failed to read FLAC stream marker.");
        } else if (i == 3) {
            h70.C13281a aVar = new h70.C13281a(this.f33264i);
            boolean z3 = false;
            while (!z3) {
                z3 = h70.m36813a(ikVar2, aVar);
                k70 k70 = aVar.f34282a;
                int i2 = ih1.f34858a;
                this.f33264i = k70;
            }
            this.f33264i.getClass();
            this.f33265j = Math.max(this.f33264i.f36001c, 6);
            ke1 ke1 = this.f33261f;
            int i3 = ih1.f34858a;
            ke1.mo65339a(this.f33264i.mo68149a(this.f33256a, this.f33263h));
            this.f33262g = 4;
            return 0;
        } else if (i == 4) {
            ikVar.mo67812d();
            fy0 fy02 = new fy0(2);
            ikVar2.mo67806a(fy02.f33778a, 0, 2, false);
            int x = fy02.mo67132x();
            if ((x >> 2) == 16382) {
                ikVar.mo67812d();
                this.f33266k = x;
                x50 x50 = this.f33260e;
                int i4 = ih1.f34858a;
                long c = ikVar.mo67811c();
                long a2 = ikVar.mo67804a();
                this.f33264i.getClass();
                k70 k702 = this.f33264i;
                if (k702.f36009k != null) {
                    s71 = new j70(k702, c);
                } else if (a2 == -1 || k702.f36008j <= 0) {
                    s71 = new s71.C14567b(k702.mo68153b(), 0);
                } else {
                    e70 e70 = new e70(k702, this.f33266k, c, a2);
                    this.f33267l = e70;
                    s71 = e70.mo66547a();
                }
                x50.mo65309a(s71);
                this.f33262g = 5;
                return 0;
            }
            ikVar.mo67812d();
            throw new jy0("First frame does not start with sync code.");
        } else if (i == 5) {
            this.f33261f.getClass();
            this.f33264i.getClass();
            e70 e702 = this.f33267l;
            if (e702 != null && e702.mo66551b()) {
                return this.f33267l.mo66546a(ikVar2, r01);
            }
            if (this.f33269n == -1) {
                this.f33269n = g70.m36494a(ikVar2, this.f33264i);
                return 0;
            }
            int c2 = this.f33257b.mo67107c();
            if (c2 < 32768) {
                int b2 = ikVar2.mo67807b(this.f33257b.f33778a, c2, 32768 - c2);
                if (b2 != -1) {
                    z2 = false;
                }
                if (!z2) {
                    this.f33257b.mo67110d(c2 + b2);
                } else if (this.f33257b.mo67098a() == 0) {
                    m35925b();
                    return -1;
                }
            } else {
                z2 = false;
            }
            int b3 = this.f33257b.mo67105b();
            int i5 = this.f33268m;
            int i6 = this.f33265j;
            if (i5 < i6) {
                fy0 fy03 = this.f33257b;
                fy03.mo67114f(Math.min(i6 - i5, fy03.mo67098a()));
            }
            fy0 fy04 = this.f33257b;
            this.f33264i.getClass();
            int b4 = fy04.mo67105b();
            while (true) {
                if (b4 <= fy04.mo67107c() - 16) {
                    fy04.mo67112e(b4);
                    if (g70.m36495a(fy04, this.f33264i, this.f33266k, this.f33259d)) {
                        fy04.mo67112e(b4);
                        j = this.f33259d.f33897a;
                        break;
                    }
                    b4++;
                } else {
                    if (z2) {
                        while (b4 <= fy04.mo67107c() - this.f33265j) {
                            fy04.mo67112e(b4);
                            try {
                                z = g70.m36495a(fy04, this.f33264i, this.f33266k, this.f33259d);
                            } catch (IndexOutOfBoundsException unused) {
                                z = false;
                            }
                            if (fy04.mo67105b() > fy04.mo67107c()) {
                                z = false;
                            }
                            if (z) {
                                fy04.mo67112e(b4);
                                j = this.f33259d.f33897a;
                                break;
                            }
                            b4++;
                        }
                        fy04.mo67112e(fy04.mo67107c());
                    } else {
                        fy04.mo67112e(b4);
                    }
                    j = -1;
                }
            }
            int b5 = this.f33257b.mo67105b() - b3;
            this.f33257b.mo67112e(b3);
            this.f33261f.mo65341a(this.f33257b, b5);
            this.f33268m += b5;
            if (j != -1) {
                m35925b();
                this.f33268m = 0;
                this.f33269n = j;
            }
            if (this.f33257b.mo67098a() >= 16) {
                return 0;
            }
            fy0 fy05 = this.f33257b;
            byte[] bArr2 = fy05.f33778a;
            int b6 = fy05.mo67105b();
            fy0 fy06 = this.f33257b;
            System.arraycopy(bArr2, b6, fy06.f33778a, 0, fy06.mo67098a());
            fy0 fy07 = this.f33257b;
            fy07.mo67108c(fy07.mo67098a());
            return 0;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public void mo64889a(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.f33262g = 0;
        } else {
            e70 e70 = this.f33267l;
            if (e70 != null) {
                e70.mo66548a(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.f33269n = j3;
        this.f33268m = 0;
        this.f33257b.mo67134z();
    }
}
