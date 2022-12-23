package com.yandex.metrica.impl.p265ob;

import android.util.Pair;
import com.yandex.metrica.impl.p265ob.C11428kg;
import com.yandex.metrica.impl.p265ob.C11606oi;
import java.util.ArrayList;

/* renamed from: com.yandex.metrica.impl.ob.Y9 */
public class C10951Y9 implements C11194ea<C11606oi, C11428kg.C11429a> {
    /* renamed from: a */
    public C11428kg.C11429a mo61050b(C11606oi oiVar) {
        C11428kg.C11429a.C11430a aVar;
        C11428kg.C11429a aVar2 = new C11428kg.C11429a();
        aVar2.f27444b = new C11428kg.C11429a.C11431b[oiVar.f27864a.size()];
        for (int i = 0; i < oiVar.f27864a.size(); i++) {
            C11428kg.C11429a.C11431b bVar = new C11428kg.C11429a.C11431b();
            Pair pair = oiVar.f27864a.get(i);
            bVar.f27447b = (String) pair.first;
            if (pair.second != null) {
                bVar.f27448c = new C11428kg.C11429a.C11430a();
                C11606oi.C11607a aVar3 = (C11606oi.C11607a) pair.second;
                if (aVar3 == null) {
                    aVar = null;
                } else {
                    C11428kg.C11429a.C11430a aVar4 = new C11428kg.C11429a.C11430a();
                    aVar4.f27445b = aVar3.f27865a;
                    aVar = aVar4;
                }
                bVar.f27448c = aVar;
            }
            aVar2.f27444b[i] = bVar;
        }
        return aVar2;
    }

    /* renamed from: a */
    public C11606oi mo61049a(C11428kg.C11429a aVar) {
        C11606oi.C11607a aVar2;
        ArrayList arrayList = new ArrayList();
        for (C11428kg.C11429a.C11431b bVar : aVar.f27444b) {
            String str = bVar.f27447b;
            C11428kg.C11429a.C11430a aVar3 = bVar.f27448c;
            if (aVar3 == null) {
                aVar2 = null;
            } else {
                aVar2 = new C11606oi.C11607a(aVar3.f27445b);
            }
            arrayList.add(new Pair(str, aVar2));
        }
        return new C11606oi(arrayList);
    }
}
