package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.h41;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class dr1 implements w41<lj1, List<lj1>> {

    /* renamed from: a */
    private final ai1 f32748a;

    public dr1(ai1 ai1) {
        this.f32748a = ai1;
    }

    /* renamed from: a */
    public h41 mo66663a(Object obj) {
        lj1 lj1 = (lj1) obj;
        return new h41(h41.C13276b.VAST_WRAPPER_REQUEST, m35422a());
    }

    /* renamed from: a */
    public h41 mo66662a(c51 c51, int i, Object obj) {
        h41.C13277c cVar;
        T t;
        lj1 lj1 = (lj1) obj;
        Map<String, Object> a = m35422a();
        if (204 == i) {
            cVar = h41.C13277c.NO_ADS;
        } else if (c51 == null || (t = c51.f31810a) == null || i != 200) {
            cVar = h41.C13277c.ERROR;
        } else {
            cVar = ((List) t).isEmpty() ? h41.C13277c.NO_ADS : h41.C13277c.SUCCESS;
        }
        ((HashMap) a).put("status", cVar.mo67417a());
        return new h41(h41.C13276b.VAST_WRAPPER_RESPONSE, a);
    }

    /* renamed from: a */
    private Map<String, Object> m35422a() {
        HashMap hashMap = new HashMap();
        hashMap.put("page_id", this.f32748a.mo65780b());
        hashMap.put("imp_id", this.f32748a.mo65779a());
        return hashMap;
    }
}
