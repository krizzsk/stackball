package com.yandex.metrica.impl.p265ob;

import com.android.billingclient.api.BillingClient;
import com.yandex.metrica.billing_interface.C10068a;
import com.yandex.metrica.billing_interface.C10075g;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.n */
public final class C11540n {

    /* renamed from: a */
    public static final C11540n f27742a = new C11540n();

    private C11540n() {
    }

    /* renamed from: a */
    public static void m29812a(C11540n nVar, Map map, Map map2, String str, C11727s sVar, C10075g gVar, int i) {
        C10075g gVar2 = (i & 16) != 0 ? new C10075g() : null;
        Intrinsics.checkNotNullParameter(map, "history");
        Intrinsics.checkNotNullParameter(map2, "newBillingInfo");
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(sVar, "billingInfoManager");
        Intrinsics.checkNotNullParameter(gVar2, "systemTimeProvider");
        gVar2.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        for (C10068a aVar : map.values()) {
            if (map2.containsKey(aVar.f24200b)) {
                aVar.f24203e = currentTimeMillis;
            } else {
                C10068a a = sVar.mo63052a(aVar.f24200b);
                if (a != null) {
                    aVar.f24203e = a.f24203e;
                }
            }
        }
        sVar.mo63053a((Map<String, C10068a>) map);
        if (!sVar.mo63054a() && Intrinsics.areEqual((Object) BillingClient.SkuType.INAPP, (Object) str)) {
            sVar.mo63055b();
        }
    }
}
