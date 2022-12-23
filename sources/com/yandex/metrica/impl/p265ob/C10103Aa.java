package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11349ig;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.Aa */
public class C10103Aa implements C11194ea<C11774t2, C11349ig> {
    /* renamed from: a */
    public Object mo61049a(Object obj) {
        HashMap hashMap;
        C11349ig igVar = (C11349ig) obj;
        C11349ig.C11350a aVar = igVar.f27120b;
        if (aVar == null) {
            hashMap = null;
        } else {
            HashMap hashMap2 = new HashMap();
            for (C11349ig.C11350a.C11351a aVar2 : aVar.f27122b) {
                hashMap2.put(aVar2.f27124b, aVar2.f27125c);
            }
            hashMap = hashMap2;
        }
        return new C11774t2(hashMap, igVar.f27121c);
    }

    /* renamed from: b */
    public Object mo61050b(Object obj) {
        C11349ig.C11350a aVar;
        C11774t2 t2Var = (C11774t2) obj;
        C11349ig igVar = new C11349ig();
        Map<String, String> map = t2Var.f28263a;
        if (map == null) {
            aVar = null;
        } else {
            C11349ig.C11350a aVar2 = new C11349ig.C11350a();
            aVar2.f27122b = new C11349ig.C11350a.C11351a[map.size()];
            int i = 0;
            for (Map.Entry next : map.entrySet()) {
                C11349ig.C11350a.C11351a aVar3 = new C11349ig.C11350a.C11351a();
                aVar3.f27124b = (String) next.getKey();
                aVar3.f27125c = (String) next.getValue();
                aVar2.f27122b[i] = aVar3;
                i++;
            }
            aVar = aVar2;
        }
        igVar.f27120b = aVar;
        igVar.f27121c = t2Var.f28264b;
        return igVar;
    }
}
