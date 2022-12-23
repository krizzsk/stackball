package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.flac.PictureFrame;
import com.yandex.mobile.ads.exo.metadata.id3.C12248a;
import com.yandex.mobile.ads.impl.k70;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class h70 {

    /* renamed from: com.yandex.mobile.ads.impl.h70$a */
    public static final class C13281a {

        /* renamed from: a */
        public k70 f34282a;

        public C13281a(k70 k70) {
            this.f34282a = k70;
        }
    }

    /* renamed from: a */
    public static Metadata m36811a(C13416ik ikVar, boolean z) throws IOException, InterruptedException {
        Metadata a = new nc0().mo69023a(ikVar, z ? null : C12248a.f29939b);
        if (a == null || a.mo64997c() == 0) {
            return null;
        }
        return a;
    }

    /* renamed from: a */
    public static boolean m36813a(C13416ik ikVar, C13281a aVar) throws IOException, InterruptedException {
        C13416ik ikVar2 = ikVar;
        C13281a aVar2 = aVar;
        ikVar.mo67812d();
        ey0 ey0 = new ey0(new byte[4], 4);
        ikVar2.mo67806a(ey0.f33187a, 0, 4, false);
        boolean f = ey0.mo66900f();
        int a = ey0.mo66886a(7);
        int a2 = ey0.mo66886a(24) + 4;
        if (a == 0) {
            byte[] bArr = new byte[38];
            ikVar2.mo67809b(bArr, 0, 38, false);
            aVar2.f34282a = new k70(bArr, 4);
        } else {
            k70 k70 = aVar2.f34282a;
            if (k70 == null) {
                throw new IllegalArgumentException();
            } else if (a == 3) {
                fy0 fy0 = new fy0(a2);
                ikVar2.mo67809b(fy0.f33778a, 0, a2, false);
                aVar2.f34282a = k70.mo68151a(m36812a(fy0));
            } else if (a == 4) {
                fy0 fy02 = new fy0(a2);
                ikVar2.mo67809b(fy02.f33778a, 0, a2, false);
                fy02.mo67114f(4);
                aVar2.f34282a = k70.mo68154b((List<String>) Arrays.asList(vp1.m43183a(fy02, false, false).f41363a));
            } else if (a == 6) {
                fy0 fy03 = new fy0(a2);
                ikVar2.mo67809b(fy03.f33778a, 0, a2, false);
                fy03.mo67114f(4);
                int f2 = fy03.mo67113f();
                String a3 = fy03.mo67100a(fy03.mo67113f(), Charset.forName("US-ASCII"));
                String b = fy03.mo67106b(fy03.mo67113f());
                int f3 = fy03.mo67113f();
                int f4 = fy03.mo67113f();
                int f5 = fy03.mo67113f();
                int f6 = fy03.mo67113f();
                int f7 = fy03.mo67113f();
                byte[] bArr2 = new byte[f7];
                fy03.mo67104a(bArr2, 0, f7);
                aVar2.f34282a = k70.mo68152a((List<PictureFrame>) Collections.singletonList(new PictureFrame(f2, a3, b, f3, f4, f5, f6, bArr2)));
            } else {
                ikVar2.mo67813d(a2);
            }
        }
        return f;
    }

    /* renamed from: a */
    public static k70.C13688a m36812a(fy0 fy0) {
        fy0.mo67114f(1);
        int u = fy0.mo67129u();
        long b = (long) (fy0.mo67105b() + u);
        int i = u / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long n = fy0.mo67122n();
            if (n == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = n;
            jArr2[i2] = fy0.mo67122n();
            fy0.mo67114f(2);
            i2++;
        }
        fy0.mo67114f((int) (b - ((long) fy0.mo67105b())));
        return new k70.C13688a(jArr, jArr2);
    }
}
