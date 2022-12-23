package com.yandex.mobile.ads.impl;

import android.util.Log;
import java.io.IOException;

final class bq1 {

    /* renamed from: com.yandex.mobile.ads.impl.bq1$a */
    private static final class C12605a {

        /* renamed from: a */
        public final int f31399a;

        /* renamed from: b */
        public final long f31400b;

        private C12605a(int i, long j) {
            this.f31399a = i;
            this.f31400b = j;
        }

        /* renamed from: a */
        public static C12605a m34308a(C13416ik ikVar, fy0 fy0) throws IOException, InterruptedException {
            ikVar.mo67806a(fy0.f33778a, 0, 8, false);
            fy0.mo67112e(0);
            return new C12605a(fy0.mo67113f(), fy0.mo67119k());
        }
    }

    /* renamed from: a */
    public static aq1 m34307a(C13416ik ikVar) throws IOException, InterruptedException {
        byte[] bArr;
        ikVar.getClass();
        fy0 fy0 = new fy0(16);
        if (C12605a.m34308a(ikVar, fy0).f31399a != 1380533830) {
            return null;
        }
        ikVar.mo67806a(fy0.f33778a, 0, 4, false);
        fy0.mo67112e(0);
        int f = fy0.mo67113f();
        if (f != 1463899717) {
            Log.e("WavHeaderReader", "Unsupported RIFF format: " + f);
            return null;
        }
        C12605a a = C12605a.m34308a(ikVar, fy0);
        while (a.f31399a != 1718449184) {
            ikVar.mo67805a((int) a.f31400b, false);
            a = C12605a.m34308a(ikVar, fy0);
        }
        C13479j9.m37708b(a.f31400b >= 16);
        ikVar.mo67806a(fy0.f33778a, 0, 16, false);
        fy0.mo67112e(0);
        int m = fy0.mo67121m();
        int m2 = fy0.mo67121m();
        int l = fy0.mo67120l();
        int l2 = fy0.mo67120l();
        int m3 = fy0.mo67121m();
        int m4 = fy0.mo67121m();
        int i = ((int) a.f31400b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            ikVar.mo67806a(bArr2, 0, i, false);
            bArr = bArr2;
        } else {
            bArr = ih1.f34863f;
        }
        return new aq1(m, m2, l, l2, m3, m4, bArr);
    }
}
