package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11060b2;
import com.yandex.metrica.impl.p265ob.C11316hg;
import com.yandex.metrica.impl.p265ob.C11493lg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.ya */
public class C11978ya implements Object<C11493lg.C11498e, C11316hg> {

    /* renamed from: a */
    private static final Map<Integer, C11060b2.C11064d> f28770a = Collections.unmodifiableMap(new C11979a());

    /* renamed from: b */
    private static final Map<C11060b2.C11064d, Integer> f28771b = Collections.unmodifiableMap(new C11980b());

    /* renamed from: com.yandex.metrica.impl.ob.ya$a */
    class C11979a extends HashMap<Integer, C11060b2.C11064d> {
        C11979a() {
            put(1, C11060b2.C11064d.WIFI);
            put(2, C11060b2.C11064d.CELL);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ya$b */
    class C11980b extends HashMap<C11060b2.C11064d, Integer> {
        C11980b() {
            put(C11060b2.C11064d.WIFI, 1);
            put(C11060b2.C11064d.CELL, 2);
        }
    }

    /* renamed from: a */
    public Object mo64137a(Object obj) {
        C11316hg hgVar = (C11316hg) obj;
        ArrayList arrayList = new ArrayList();
        C11316hg.C11317a[] aVarArr = hgVar.f27047b;
        int length = aVarArr.length;
        boolean z = false;
        int i = 0;
        while (i < length) {
            C11316hg.C11317a aVar = aVarArr[i];
            String str = aVar.f27050b;
            String str2 = aVar.f27051c;
            String str3 = aVar.f27052d;
            C11316hg.C11317a.C11318a[] aVarArr2 = aVar.f27053e;
            C11007Zm zm = new C11007Zm(z);
            int length2 = aVarArr2.length;
            int i2 = 0;
            while (i2 < length2) {
                C11316hg.C11317a.C11318a aVar2 = aVarArr2[i2];
                zm.mo62601a(aVar2.f27057b, aVar2.f27058c);
                i2++;
                aVarArr = aVarArr;
            }
            C11316hg.C11317a[] aVarArr3 = aVarArr;
            long j = aVar.f27054f;
            int[] iArr = aVar.f27055g;
            ArrayList arrayList2 = new ArrayList(iArr.length);
            int length3 = iArr.length;
            int i3 = 0;
            while (i3 < length3) {
                arrayList2.add(f28770a.get(Integer.valueOf(iArr[i3])));
                i3++;
                iArr = iArr;
                length = length;
            }
            int i4 = length;
            C11493lg.C11498e.C11499a aVar3 = r8;
            C11493lg.C11498e.C11499a aVar4 = new C11493lg.C11498e.C11499a(str, str2, str3, zm, j, arrayList2);
            arrayList.add(aVar3);
            i++;
            aVarArr = aVarArr3;
            z = false;
        }
        return new C11493lg.C11498e(arrayList, Arrays.asList(hgVar.f27048c));
    }

    /* renamed from: b */
    public Object mo64138b(Object obj) {
        C11493lg.C11498e eVar = (C11493lg.C11498e) obj;
        C11316hg hgVar = new C11316hg();
        Set<String> a = eVar.mo63288a();
        hgVar.f27048c = (String[]) a.toArray(new String[((HashSet) a).size()]);
        List<C11493lg.C11498e.C11499a> b = eVar.mo63290b();
        C11316hg.C11317a[] aVarArr = new C11316hg.C11317a[b.size()];
        for (int i = 0; i < b.size(); i++) {
            C11493lg.C11498e.C11499a aVar = b.get(i);
            C11316hg.C11317a aVar2 = new C11316hg.C11317a();
            aVar2.f27050b = aVar.f27680a;
            aVar2.f27051c = aVar.f27681b;
            C11316hg.C11317a.C11318a[] aVarArr2 = new C11316hg.C11317a.C11318a[aVar.f27683d.mo62606c()];
            int i2 = 0;
            for (Map.Entry entry : aVar.f27683d.mo62602a()) {
                for (String str : (Collection) entry.getValue()) {
                    C11316hg.C11317a.C11318a aVar3 = new C11316hg.C11317a.C11318a();
                    aVar3.f27057b = (String) entry.getKey();
                    aVar3.f27058c = str;
                    aVarArr2[i2] = aVar3;
                    i2++;
                }
            }
            aVar2.f27053e = aVarArr2;
            aVar2.f27052d = aVar.f27682c;
            aVar2.f27054f = aVar.f27684e;
            List<C11060b2.C11064d> list = aVar.f27685f;
            int[] iArr = new int[list.size()];
            for (int i3 = 0; i3 < list.size(); i3++) {
                iArr[i3] = f28771b.get(list.get(i3)).intValue();
            }
            aVar2.f27055g = iArr;
            aVarArr[i] = aVar2;
        }
        hgVar.f27047b = aVarArr;
        return hgVar;
    }
}
