package com.yandex.metrica.impl.p265ob;

import com.tapjoy.TapjoyConstants;
import com.yandex.metrica.impl.p265ob.C10856Vi;
import com.yandex.metrica.impl.p265ob.C11428kg;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Ha */
public class C10334Ha implements C11194ea<C10856Vi, C11428kg.C11456s> {

    /* renamed from: a */
    private static final EnumMap<C10856Vi.C10858b, String> f24824a;

    /* renamed from: b */
    private static final Map<String, C10856Vi.C10858b> f24825b;

    static {
        EnumMap<C10856Vi.C10858b, String> enumMap = new EnumMap<>(C10856Vi.C10858b.class);
        f24824a = enumMap;
        HashMap hashMap = new HashMap();
        f24825b = hashMap;
        C10856Vi.C10858b bVar = C10856Vi.C10858b.WIFI;
        enumMap.put(bVar, TapjoyConstants.TJC_CONNECTION_TYPE_WIFI);
        C10856Vi.C10858b bVar2 = C10856Vi.C10858b.CELL;
        enumMap.put(bVar2, "cell");
        hashMap.put(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI, bVar);
        hashMap.put("cell", bVar2);
    }

    /* renamed from: a */
    public C11428kg.C11456s mo61050b(C10856Vi vi) {
        C11428kg.C11456s sVar = new C11428kg.C11456s();
        if (vi.f26092a != null) {
            C11428kg.C11457t tVar = new C11428kg.C11457t();
            sVar.f27559b = tVar;
            C10856Vi.C10857a aVar = vi.f26092a;
            tVar.f27561b = aVar.f26094a;
            tVar.f27562c = aVar.f26095b;
        }
        if (vi.f26093b != null) {
            C11428kg.C11457t tVar2 = new C11428kg.C11457t();
            sVar.f27560c = tVar2;
            C10856Vi.C10857a aVar2 = vi.f26093b;
            tVar2.f27561b = aVar2.f26094a;
            tVar2.f27562c = aVar2.f26095b;
        }
        return sVar;
    }

    /* renamed from: a */
    public C10856Vi mo61049a(C11428kg.C11456s sVar) {
        C11428kg.C11457t tVar = sVar.f27559b;
        C10856Vi.C10857a aVar = null;
        C10856Vi.C10857a aVar2 = tVar != null ? new C10856Vi.C10857a(tVar.f27561b, tVar.f27562c) : null;
        C11428kg.C11457t tVar2 = sVar.f27560c;
        if (tVar2 != null) {
            aVar = new C10856Vi.C10857a(tVar2.f27561b, tVar2.f27562c);
        }
        return new C10856Vi(aVar2, aVar);
    }
}
