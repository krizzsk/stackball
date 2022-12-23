package com.yandex.metrica.impl.p265ob;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Bi */
public class C10140Bi {

    /* renamed from: a */
    public final String f24407a;

    /* renamed from: b */
    public final String f24408b;

    /* renamed from: c */
    public final String f24409c;

    /* renamed from: d */
    public final List<Pair<String, String>> f24410d;

    /* renamed from: e */
    public final Long f24411e;

    /* renamed from: f */
    public final List<C10141a> f24412f;

    /* renamed from: com.yandex.metrica.impl.ob.Bi$a */
    public enum C10141a {
        WIFI,
        CELL
    }

    public C10140Bi(String str, String str2, String str3, List<Pair<String, String>> list, Long l, List<C10141a> list2) {
        this.f24407a = str;
        this.f24408b = str2;
        this.f24409c = str3;
        this.f24410d = Collections.unmodifiableList(list);
        this.f24411e = l;
        this.f24412f = list2;
    }
}
