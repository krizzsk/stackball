package com.fyber.inneractive.sdk.player.p059c.p081l;

import com.fyber.inneractive.sdk.player.p059c.C3295l;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3544i;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.c.l.c */
public final class C3565c {

    /* renamed from: a */
    public final List<byte[]> f9675a;

    /* renamed from: b */
    public final int f9676b;

    /* renamed from: a */
    public static C3565c m8899a(C3548k kVar) throws C3295l {
        List list;
        try {
            kVar.mo19388d(21);
            int d = kVar.mo19387d() & 3;
            int d2 = kVar.mo19387d();
            int i = kVar.f9626b;
            int i2 = 0;
            for (int i3 = 0; i3 < d2; i3++) {
                kVar.mo19388d(1);
                int e = kVar.mo19389e();
                for (int i4 = 0; i4 < e; i4++) {
                    int e2 = kVar.mo19389e();
                    i2 += e2 + 4;
                    kVar.mo19388d(e2);
                }
            }
            kVar.mo19386c(i);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            for (int i6 = 0; i6 < d2; i6++) {
                kVar.mo19388d(1);
                int e3 = kVar.mo19389e();
                for (int i7 = 0; i7 < e3; i7++) {
                    int e4 = kVar.mo19389e();
                    System.arraycopy(C3544i.f9604a, 0, bArr, i5, C3544i.f9604a.length);
                    int length = i5 + C3544i.f9604a.length;
                    System.arraycopy(kVar.f9625a, kVar.f9626b, bArr, length, e4);
                    i5 = length + e4;
                    kVar.mo19388d(e4);
                }
            }
            if (i2 == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new C3565c(list, d + 1);
        } catch (ArrayIndexOutOfBoundsException e5) {
            throw new C3295l("Error parsing HEVC config", e5);
        }
    }

    private C3565c(List<byte[]> list, int i) {
        this.f9675a = list;
        this.f9676b = i;
    }
}
