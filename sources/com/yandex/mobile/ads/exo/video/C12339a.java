package com.yandex.mobile.ads.exo.video;

import com.yandex.mobile.ads.impl.C12972eg;
import com.yandex.mobile.ads.impl.fy0;
import com.yandex.mobile.ads.impl.jy0;
import com.yandex.mobile.ads.impl.nq0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.exo.video.a */
public final class C12339a {

    /* renamed from: a */
    public final List<byte[]> f30325a;

    /* renamed from: b */
    public final int f30326b;

    /* renamed from: c */
    public final int f30327c;

    /* renamed from: d */
    public final int f30328d;

    /* renamed from: e */
    public final float f30329e;

    private C12339a(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f30325a = list;
        this.f30326b = i;
        this.f30327c = i2;
        this.f30328d = i3;
        this.f30329e = f;
    }

    /* renamed from: a */
    public static C12339a m32497a(fy0 fy0) throws jy0 {
        float f;
        int i;
        int i2;
        try {
            fy0.mo67114f(4);
            int r = (fy0.mo67126r() & 3) + 1;
            if (r != 3) {
                ArrayList arrayList = new ArrayList();
                int r2 = fy0.mo67126r() & 31;
                for (int i3 = 0; i3 < r2; i3++) {
                    int x = fy0.mo67132x();
                    int b = fy0.mo67105b();
                    fy0.mo67114f(x);
                    arrayList.add(C12972eg.m35653a(fy0.f33778a, b, x));
                }
                int r3 = fy0.mo67126r();
                for (int i4 = 0; i4 < r3; i4++) {
                    int x2 = fy0.mo67132x();
                    int b2 = fy0.mo67105b();
                    fy0.mo67114f(x2);
                    arrayList.add(C12972eg.m35653a(fy0.f33778a, b2, x2));
                }
                if (r2 > 0) {
                    nq0.C14127b b3 = nq0.m40149b((byte[]) arrayList.get(0), r, ((byte[]) arrayList.get(0)).length);
                    int i5 = b3.f37890e;
                    int i6 = b3.f37891f;
                    f = b3.f37892g;
                    i2 = i5;
                    i = i6;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                return new C12339a(arrayList, r, i2, i, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new jy0("Error parsing AVC config", e);
        }
    }
}
