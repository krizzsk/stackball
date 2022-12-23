package com.yandex.metrica.impl.p265ob;

import android.util.SparseArray;

/* renamed from: com.yandex.metrica.impl.ob.Ff */
public class C10254Ff {

    /* renamed from: a */
    private static SparseArray<String> f24686a;

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        f24686a = sparseArray;
        sparseArray.put(0, "String");
        f24686a.put(1, "Number");
        f24686a.put(2, "Counter");
    }

    /* renamed from: a */
    static String m26310a(int i) {
        return f24686a.get(i);
    }
}
