package com.fyber.inneractive.sdk.player.p059c.p081l;

import com.fyber.inneractive.sdk.player.p059c.C3295l;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3538c;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3544i;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.c.l.a */
public final class C3562a {

    /* renamed from: a */
    public final List<byte[]> f9665a;

    /* renamed from: b */
    public final int f9666b;

    /* renamed from: c */
    public final int f9667c;

    /* renamed from: d */
    public final int f9668d;

    /* renamed from: e */
    public final float f9669e;

    /* renamed from: a */
    public static C3562a m8897a(C3548k kVar) throws C3295l {
        float f;
        int i;
        int i2;
        try {
            kVar.mo19388d(4);
            int d = (kVar.mo19387d() & 3) + 1;
            if (d != 3) {
                ArrayList arrayList = new ArrayList();
                int d2 = kVar.mo19387d() & 31;
                for (int i3 = 0; i3 < d2; i3++) {
                    arrayList.add(m8898b(kVar));
                }
                int d3 = kVar.mo19387d();
                for (int i4 = 0; i4 < d3; i4++) {
                    arrayList.add(m8898b(kVar));
                }
                if (d2 > 0) {
                    C3544i.C3546b a = C3544i.m8805a((byte[]) arrayList.get(0), d, ((byte[]) arrayList.get(0)).length);
                    int i5 = a.f9612b;
                    int i6 = a.f9613c;
                    f = a.f9614d;
                    i2 = i5;
                    i = i6;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                return new C3562a(arrayList, d, i2, i, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C3295l("Error parsing AVC config", e);
        }
    }

    private C3562a(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f9665a = list;
        this.f9666b = i;
        this.f9667c = i2;
        this.f9668d = i3;
        this.f9669e = f;
    }

    /* renamed from: b */
    private static byte[] m8898b(C3548k kVar) {
        int e = kVar.mo19389e();
        int i = kVar.f9626b;
        kVar.mo19388d(e);
        return C3538c.m8790a(kVar.f9625a, i, e);
    }
}
