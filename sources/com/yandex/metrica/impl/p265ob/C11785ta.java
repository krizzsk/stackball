package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10199E;
import com.yandex.metrica.impl.p265ob.C10474M;
import com.yandex.metrica.impl.p265ob.C11428kg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.ta */
public class C11785ta implements Object<C11346id, C11428kg.C11441k.C11447b> {
    /* renamed from: a */
    public C11428kg.C11441k.C11447b mo63722b(C11346id idVar) {
        C11428kg.C11441k.C11447b bVar = new C11428kg.C11441k.C11447b();
        bVar.f27526b = new int[idVar.f27116a.size()];
        Iterator<C10474M.C10476b.C10477a> it = idVar.f27116a.iterator();
        int i = 0;
        while (true) {
            int i2 = 3;
            if (!it.hasNext()) {
                break;
            }
            int[] iArr = bVar.f27526b;
            int ordinal = it.next().ordinal();
            if (ordinal == 1) {
                i2 = 0;
            } else if (ordinal == 2) {
                i2 = 1;
            } else if (ordinal == 3) {
                i2 = 2;
            } else if (ordinal != 4) {
                i2 = 4;
            }
            iArr[i] = i2;
            i++;
        }
        bVar.f27527c = new int[idVar.f27117b.size()];
        int i3 = 0;
        for (C10199E.C10200a ordinal2 : idVar.f27117b) {
            int[] iArr2 = bVar.f27527c;
            int ordinal3 = ordinal2.ordinal();
            iArr2[i3] = ordinal3 != 1 ? ordinal3 != 2 ? 3 : 2 : 0;
            i3++;
        }
        return bVar;
    }

    /* renamed from: a */
    public C11346id mo63721a(C11428kg.C11441k.C11447b bVar) {
        C10199E.C10200a aVar;
        C10474M.C10476b.C10477a aVar2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (bVar.f27526b.length != 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = bVar.f27526b;
                if (i2 >= iArr.length) {
                    break;
                }
                int i3 = iArr[i2];
                if (i3 == 0) {
                    aVar2 = C10474M.C10476b.C10477a.NONE;
                } else if (i3 == 1) {
                    aVar2 = C10474M.C10476b.C10477a.USB;
                } else if (i3 == 2) {
                    aVar2 = C10474M.C10476b.C10477a.WIRELESS;
                } else if (i3 != 3) {
                    aVar2 = C10474M.C10476b.C10477a.UNKNOWN;
                } else {
                    aVar2 = C10474M.C10476b.C10477a.AC;
                }
                arrayList.add(aVar2);
                i2++;
            }
        } else {
            arrayList.addAll(Arrays.asList(C10474M.C10476b.C10477a.values()));
        }
        ArrayList arrayList2 = new ArrayList();
        if (bVar.f27527c.length != 0) {
            while (true) {
                int[] iArr2 = bVar.f27527c;
                if (i >= iArr2.length) {
                    break;
                }
                int i4 = iArr2[i];
                if (i4 == 0) {
                    aVar = C10199E.C10200a.BACKGROUND;
                } else if (i4 != 2) {
                    aVar = C10199E.C10200a.UNKNOWN;
                } else {
                    aVar = C10199E.C10200a.VISIBLE;
                }
                arrayList2.add(aVar);
                i++;
            }
        } else {
            arrayList2.addAll(Arrays.asList(C10199E.C10200a.values()));
        }
        return new C11346id(arrayList, arrayList2);
    }
}
