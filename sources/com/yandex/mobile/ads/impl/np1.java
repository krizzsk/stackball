package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.h41;
import java.util.HashMap;

public class np1 implements w41<jp1, ep1> {
    /* renamed from: a */
    public h41 mo66663a(Object obj) {
        jp1 jp1 = (jp1) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("page_id", jp1.mo68078c());
        hashMap.put("category_id", jp1.mo68077b());
        return new h41(h41.C13276b.VMAP_REQUEST, hashMap);
    }

    /* renamed from: a */
    public h41 mo66662a(c51 c51, int i, Object obj) {
        jp1 jp1 = (jp1) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("page_id", jp1.mo68078c());
        hashMap.put("category_id", jp1.mo68077b());
        if (i != -1) {
            hashMap.put("code", Integer.valueOf(i));
        }
        return new h41(h41.C13276b.VMAP_RESPONSE, hashMap);
    }
}
