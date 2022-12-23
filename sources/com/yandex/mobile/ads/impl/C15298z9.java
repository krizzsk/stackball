package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.h41;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.z9 */
public class C15298z9 {

    /* renamed from: a */
    private final sn0 f43062a;

    /* renamed from: b */
    private final C15232y3 f43063b;

    /* renamed from: c */
    private final C14645t1 f43064c;

    /* renamed from: d */
    private final List<C13690k9> f43065d;

    public C15298z9(Context context, C14645t1 t1Var, List<C13690k9> list) {
        this.f43064c = t1Var;
        this.f43065d = list == null ? Collections.emptyList() : list;
        this.f43062a = sn0.m42091b(context);
        this.f43063b = new C15232y3();
    }

    /* renamed from: a */
    public void mo71182a(List<String> list) {
        List<C13690k9> list2 = this.f43065d;
        ArrayList arrayList = new ArrayList();
        for (C13690k9 b : list2) {
            arrayList.add(b.mo68167b());
        }
        ArrayList arrayList2 = new ArrayList(list);
        arrayList2.removeAll(arrayList);
        if (!arrayList2.isEmpty()) {
            HashMap hashMap = new HashMap();
            String c = this.f43064c.mo70096c();
            if (c != null) {
                hashMap.put("block_id", c);
                hashMap.put("ad_unit_id", c);
            }
            hashMap.put("assets", arrayList2.toArray());
            hashMap.putAll(this.f43063b.mo70991a(this.f43064c.mo70080a()));
            this.f43062a.mo70035a(new h41(h41.C13276b.REQUIRED_ASSET_MISSING, hashMap));
        }
    }
}
