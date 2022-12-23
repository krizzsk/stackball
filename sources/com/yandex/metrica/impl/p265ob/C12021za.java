package com.yandex.metrica.impl.p265ob;

import android.util.Pair;
import com.yandex.metrica.impl.p265ob.C10140Bi;
import com.yandex.metrica.impl.p265ob.C11428kg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.za */
public class C12021za implements Object<C10140Bi, C11428kg.C11450n> {

    /* renamed from: a */
    private static final Map<Integer, C10140Bi.C10141a> f28881a = Collections.unmodifiableMap(new C12022a());

    /* renamed from: b */
    private static final Map<C10140Bi.C10141a, Integer> f28882b = Collections.unmodifiableMap(new C12023b());

    /* renamed from: com.yandex.metrica.impl.ob.za$a */
    class C12022a extends HashMap<Integer, C10140Bi.C10141a> {
        C12022a() {
            put(1, C10140Bi.C10141a.WIFI);
            put(2, C10140Bi.C10141a.CELL);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.za$b */
    class C12023b extends HashMap<C10140Bi.C10141a, Integer> {
        C12023b() {
            put(C10140Bi.C10141a.WIFI, 1);
            put(C10140Bi.C10141a.CELL, 2);
        }
    }

    /* renamed from: a */
    public C11428kg.C11450n mo64190b(C10140Bi bi) {
        C11428kg.C11450n nVar = new C11428kg.C11450n();
        nVar.f27534b = bi.f24407a;
        nVar.f27535c = bi.f24408b;
        nVar.f27536d = bi.f24409c;
        List<Pair<String, String>> list = bi.f24410d;
        C11428kg.C11450n.C11451a[] aVarArr = new C11428kg.C11450n.C11451a[list.size()];
        int i = 0;
        for (Pair next : list) {
            C11428kg.C11450n.C11451a aVar = new C11428kg.C11450n.C11451a();
            aVar.f27541b = (String) next.first;
            aVar.f27542c = (String) next.second;
            aVarArr[i] = aVar;
            i++;
        }
        nVar.f27537e = aVarArr;
        Long l = bi.f24411e;
        nVar.f27538f = l == null ? 0 : l.longValue();
        List<C10140Bi.C10141a> list2 = bi.f24412f;
        int[] iArr = new int[list2.size()];
        for (int i2 = 0; i2 < list2.size(); i2++) {
            iArr[i2] = f28882b.get(list2.get(i2)).intValue();
        }
        nVar.f27539g = iArr;
        return nVar;
    }

    /* renamed from: a */
    public C10140Bi mo64189a(C11428kg.C11450n nVar) {
        String str = nVar.f27534b;
        String str2 = nVar.f27535c;
        String str3 = nVar.f27536d;
        C11428kg.C11450n.C11451a[] aVarArr = nVar.f27537e;
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (C11428kg.C11450n.C11451a aVar : aVarArr) {
            arrayList.add(new Pair(aVar.f27541b, aVar.f27542c));
        }
        Long valueOf = Long.valueOf(nVar.f27538f);
        int[] iArr = nVar.f27539g;
        ArrayList arrayList2 = new ArrayList(iArr.length);
        for (int valueOf2 : iArr) {
            arrayList2.add(f28881a.get(Integer.valueOf(valueOf2)));
        }
        return new C10140Bi(str, str2, str3, arrayList, valueOf, arrayList2);
    }
}
