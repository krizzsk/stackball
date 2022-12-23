package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11243fg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.wa */
public class C11908wa implements C11194ea<List<C11347ie>, C11243fg> {
    /* renamed from: a */
    public Object mo61049a(Object obj) {
        C11243fg fgVar = (C11243fg) obj;
        ArrayList arrayList = new ArrayList(fgVar.f26909b.length);
        int i = 0;
        while (true) {
            C11243fg.C11244a[] aVarArr = fgVar.f26909b;
            if (i >= aVarArr.length) {
                return arrayList;
            }
            C11243fg.C11244a aVar = aVarArr[i];
            arrayList.add(new C11347ie(aVar.f26911b, aVar.f26912c));
            i++;
        }
    }

    /* renamed from: b */
    public Object mo61050b(Object obj) {
        List list = (List) obj;
        C11243fg fgVar = new C11243fg();
        fgVar.f26909b = new C11243fg.C11244a[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C11243fg.C11244a[] aVarArr = fgVar.f26909b;
            C11347ie ieVar = (C11347ie) list.get(i);
            C11243fg.C11244a aVar = new C11243fg.C11244a();
            aVar.f26911b = ieVar.f27118a;
            aVar.f26912c = ieVar.f27119b;
            aVarArr[i] = aVar;
        }
        return fgVar;
    }
}
