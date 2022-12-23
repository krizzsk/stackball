package com.flurry.sdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.flurry.sdk.n */
public class C2658n {

    /* renamed from: a */
    private static final String f6251a = C2658n.class.getSimpleName();

    /* renamed from: a */
    public static void m5785a(C2657m mVar) {
        if (mVar.mo17862e() != 0) {
            ArrayList<C2656l> arrayList = new ArrayList<>(mVar.mo17858b());
            Collections.sort(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (C2656l lVar : arrayList) {
                arrayList2.add(Integer.toString(lVar.f6242b));
            }
        }
    }

    /* renamed from: a */
    public static void m5784a(int i, long j, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("exp_code", String.valueOf(i));
        hashMap.put("exp_ms", String.valueOf(j));
        if (str != null) {
            hashMap.put("exp_det", str);
        }
        if (C2530db.m5484c() <= 2) {
            C2530db.m5488d(f6251a, String.format("YWA event: %1$s {%2$s}", new Object[]{"expsdk_data", hashMap.toString()}));
        }
    }
}
