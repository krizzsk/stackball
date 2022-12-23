package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ln1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class g21 implements bl1 {

    /* renamed from: a */
    private final ln1 f33862a;

    /* renamed from: b */
    private final List<C13166a> f33863b = m36450a();

    /* renamed from: com.yandex.mobile.ads.impl.g21$a */
    private static class C13166a {

        /* renamed from: a */
        final ln1.C13869a f33864a;

        /* renamed from: b */
        final float f33865b;

        C13166a(ln1.C13869a aVar, float f) {
            this.f33864a = aVar;
            this.f33865b = f;
        }
    }

    public g21(ln1 ln1) {
        this.f33862a = ln1;
    }

    /* renamed from: a */
    public void mo66071a(long j, long j2) {
        if (j != 0) {
            Iterator<C13166a> it = this.f33863b.iterator();
            while (it.hasNext()) {
                C13166a next = it.next();
                if (next.f33865b * ((float) j) <= ((float) j2)) {
                    this.f33862a.mo65757a(next.f33864a);
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    private List<C13166a> m36450a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C13166a(ln1.C13869a.FIRST_QUARTILE, 0.25f));
        arrayList.add(new C13166a(ln1.C13869a.MIDPOINT, 0.5f));
        arrayList.add(new C13166a(ln1.C13869a.THIRD_QUARTILE, 0.75f));
        return arrayList;
    }
}
