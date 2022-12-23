package com.yandex.metrica.impl.p265ob;

import android.util.SparseIntArray;

/* renamed from: com.yandex.metrica.impl.ob.Tk */
public class C10789Tk implements C11766sl {

    /* renamed from: a */
    private final SparseIntArray f25884a = new SparseIntArray();

    /* renamed from: b */
    private final int f25885b;

    public C10789Tk(int i) {
        this.f25885b = i;
    }

    /* renamed from: a */
    public void mo62092a(C10893Wl wl) {
        SparseIntArray sparseIntArray = this.f25884a;
        int i = wl.f26181d;
        sparseIntArray.put(i, sparseIntArray.get(i) + 1);
    }

    /* renamed from: a */
    public int mo62309a(int i) {
        int i2 = this.f25885b;
        Integer valueOf = Integer.valueOf(this.f25884a.get(i));
        if (valueOf == null) {
            valueOf = 0;
        }
        return i2 - valueOf.intValue();
    }
}
