package com.yandex.mobile.ads.exo.video;

import com.yandex.mobile.ads.impl.fy0;
import com.yandex.mobile.ads.impl.jy0;
import com.yandex.mobile.ads.impl.nq0;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.exo.video.b */
public final class C12340b {

    /* renamed from: a */
    public final List<byte[]> f30330a;

    /* renamed from: b */
    public final int f30331b;

    private C12340b(List<byte[]> list, int i) {
        this.f30330a = list;
        this.f30331b = i;
    }

    /* renamed from: a */
    public static C12340b m32498a(fy0 fy0) throws jy0 {
        List list;
        try {
            fy0.mo67114f(21);
            int r = fy0.mo67126r() & 3;
            int r2 = fy0.mo67126r();
            int b = fy0.mo67105b();
            int i = 0;
            for (int i2 = 0; i2 < r2; i2++) {
                fy0.mo67114f(1);
                int x = fy0.mo67132x();
                for (int i3 = 0; i3 < x; i3++) {
                    int x2 = fy0.mo67132x();
                    i += x2 + 4;
                    fy0.mo67114f(x2);
                }
            }
            fy0.mo67112e(b);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < r2; i5++) {
                fy0.mo67114f(1);
                int x3 = fy0.mo67132x();
                for (int i6 = 0; i6 < x3; i6++) {
                    int x4 = fy0.mo67132x();
                    byte[] bArr2 = nq0.f37879a;
                    System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                    int length = i4 + bArr2.length;
                    System.arraycopy(fy0.f33778a, fy0.mo67105b(), bArr, length, x4);
                    i4 = length + x4;
                    fy0.mo67114f(x4);
                }
            }
            if (i == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new C12340b(list, r + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new jy0("Error parsing HEVC config", e);
        }
    }
}
