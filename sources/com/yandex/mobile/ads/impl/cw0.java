package com.yandex.mobile.ads.impl;

import java.io.IOException;

public class cw0 implements w50 {

    /* renamed from: a */
    private x50 f32086a;

    /* renamed from: b */
    private mb1 f32087b;

    /* renamed from: c */
    private boolean f32088c;

    static {
        $$Lambda$cw0$8LlgqqOFTjJrhCnAaNdoMxyOkQ r0 = $$Lambda$cw0$8LlgqqOFTjJrhCnAaNdoMxyOkQ.INSTANCE;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ w50[] m34857a() {
        return new w50[]{new cw0()};
    }

    /* renamed from: b */
    private boolean m34858b(C13416ik ikVar) throws IOException, InterruptedException {
        boolean z;
        ew0 ew0 = new ew0();
        if (ew0.mo66880a(ikVar, true) && (ew0.f33166a & 2) == 2) {
            int min = Math.min(ew0.f33170e, 8);
            fy0 fy0 = new fy0(min);
            ikVar.mo67806a(fy0.f33778a, 0, min, false);
            fy0.mo67112e(0);
            if (fy0.mo67098a() >= 5 && fy0.mo67126r() == 127 && fy0.mo67128t() == 1179402563) {
                this.f32087b = new i70();
            } else {
                fy0.mo67112e(0);
                try {
                    z = vp1.m43184a(1, fy0, true);
                } catch (jy0 unused) {
                    z = false;
                }
                if (z) {
                    this.f32087b = new up1();
                } else {
                    fy0.mo67112e(0);
                    if (gx0.m36717b(fy0)) {
                        this.f32087b = new gx0();
                    }
                }
            }
            return true;
        }
        return false;
    }

    public void release() {
    }

    /* renamed from: a */
    public boolean mo64891a(C13416ik ikVar) throws IOException, InterruptedException {
        try {
            return m34858b(ikVar);
        } catch (jy0 unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo64890a(x50 x50) {
        this.f32086a = x50;
    }

    /* renamed from: a */
    public void mo64889a(long j, long j2) {
        mb1 mb1 = this.f32087b;
        if (mb1 != null) {
            mb1.mo68642a(j, j2);
        }
    }

    /* renamed from: a */
    public int mo64888a(C13416ik ikVar, r01 r01) throws IOException, InterruptedException {
        if (this.f32087b == null) {
            if (m34858b(ikVar)) {
                ikVar.mo67812d();
            } else {
                throw new jy0("Failed to determine bitstream type");
            }
        }
        if (!this.f32088c) {
            ke1 a = this.f32086a.mo65304a(0, 1);
            this.f32086a.mo65311c();
            this.f32087b.mo68643a(this.f32086a, a);
            this.f32088c = true;
        }
        return this.f32087b.mo68640a(ikVar, r01);
    }
}
