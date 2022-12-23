package com.yandex.mobile.ads.impl;

import java.io.IOException;

final class rf1 {

    /* renamed from: a */
    private final de1 f39442a = new de1(0);

    /* renamed from: b */
    private final fy0 f39443b = new fy0();

    /* renamed from: c */
    private boolean f39444c;

    /* renamed from: d */
    private boolean f39445d;

    /* renamed from: e */
    private boolean f39446e;

    /* renamed from: f */
    private long f39447f = -9223372036854775807L;

    /* renamed from: g */
    private long f39448g = -9223372036854775807L;

    /* renamed from: h */
    private long f39449h = -9223372036854775807L;

    rf1() {
    }

    /* renamed from: a */
    public int mo69761a(C13416ik ikVar, r01 r01, int i) throws IOException, InterruptedException {
        if (i <= 0) {
            m41576a(ikVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.f39446e) {
            long a = ikVar.mo67804a();
            int min = (int) Math.min(112800, a);
            long j2 = a - ((long) min);
            if (ikVar.mo67811c() != j2) {
                r01.f39340a = j2;
                return 1;
            }
            this.f39443b.mo67108c(min);
            ikVar.mo67812d();
            ikVar.mo67806a(this.f39443b.f33778a, 0, min, false);
            fy0 fy0 = this.f39443b;
            int b = fy0.mo67105b();
            int c = fy0.mo67107c() - 1;
            while (true) {
                if (c < b) {
                    break;
                }
                if (fy0.f33778a[c] == 71) {
                    long a2 = uf1.m42679a(fy0, c, i);
                    if (a2 != -9223372036854775807L) {
                        j = a2;
                        break;
                    }
                }
                c--;
            }
            this.f39448g = j;
            this.f39446e = true;
            return 0;
        } else if (this.f39448g == -9223372036854775807L) {
            m41576a(ikVar);
            return 0;
        } else if (!this.f39445d) {
            int min2 = (int) Math.min(112800, ikVar.mo67804a());
            long j3 = (long) 0;
            if (ikVar.mo67811c() != j3) {
                r01.f39340a = j3;
                return 1;
            }
            this.f39443b.mo67108c(min2);
            ikVar.mo67812d();
            ikVar.mo67806a(this.f39443b.f33778a, 0, min2, false);
            fy0 fy02 = this.f39443b;
            int b2 = fy02.mo67105b();
            int c2 = fy02.mo67107c();
            while (true) {
                if (b2 >= c2) {
                    break;
                }
                if (fy02.f33778a[b2] == 71) {
                    long a3 = uf1.m42679a(fy02, b2, i);
                    if (a3 != -9223372036854775807L) {
                        j = a3;
                        break;
                    }
                }
                b2++;
            }
            this.f39447f = j;
            this.f39445d = true;
            return 0;
        } else {
            long j4 = this.f39447f;
            if (j4 == -9223372036854775807L) {
                m41576a(ikVar);
                return 0;
            }
            this.f39449h = this.f39442a.mo66566b(this.f39448g) - this.f39442a.mo66566b(j4);
            m41576a(ikVar);
            return 0;
        }
    }

    /* renamed from: b */
    public de1 mo69763b() {
        return this.f39442a;
    }

    /* renamed from: c */
    public boolean mo69764c() {
        return this.f39444c;
    }

    /* renamed from: a */
    public long mo69762a() {
        return this.f39449h;
    }

    /* renamed from: a */
    private int m41576a(C13416ik ikVar) {
        this.f39443b.mo67102a(ih1.f34863f);
        this.f39444c = true;
        ikVar.mo67812d();
        return 0;
    }
}
