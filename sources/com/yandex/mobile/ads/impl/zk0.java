package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.s90;

public class zk0 extends C13841lb {
    public zk0(ViewGroup viewGroup, s90.C14572b bVar, s90.C14571a aVar) {
        super(viewGroup, bVar, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo68393a(pc1 pc1, int i, float f) {
        if (i > 0) {
            return pc1.mo69351b();
        }
        if (f < 0.01f) {
            return pc1.mo69349a();
        }
        int a = pc1.mo69349a();
        return Math.round(((float) a) + (((float) (pc1.mo69351b() - a)) * f));
    }

    /* renamed from: a */
    public boolean mo66653a(int i, float f) {
        if (!(this.f36602d.size() == 0)) {
            if (i != 0 && (i != 1 || f > 0.0f)) {
                return false;
            }
            this.f36602d.size();
            SparseArray<pc1> sparseArray = this.f36602d;
            pc1 valueAt = sparseArray.valueAt(sparseArray.size() - 1);
            if (valueAt.mo69349a() != valueAt.mo69351b()) {
                return true;
            }
            return false;
        }
        return true;
    }
}
