package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.s90;

public class s20 extends C13841lb {
    public s20(ViewGroup viewGroup, s90.C14572b bVar, s90.C14571a aVar) {
        super(viewGroup, bVar, aVar);
    }

    /* renamed from: a */
    public int mo66652a(int i, int i2) {
        mo68394a();
        return super.mo66652a(i, i2);
    }

    /* renamed from: a */
    public boolean mo66653a(int i, float f) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo68393a(pc1 pc1, int i, float f) {
        if (f < 0.01f) {
            return pc1.mo69350a(i);
        }
        int a = pc1.mo69350a(i);
        return Math.round(((float) a) + (((float) (pc1.mo69350a(i + 1) - a)) * f));
    }
}
