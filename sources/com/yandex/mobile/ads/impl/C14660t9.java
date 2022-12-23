package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.t9 */
public class C14660t9 {

    /* renamed from: a */
    private final Map<String, Object> f40268a;

    public C14660t9(List<C13690k9> list) {
        this.f40268a = m42281a(list);
    }

    /* renamed from: a */
    private Map<String, Object> m42281a(List<C13690k9> list) {
        HashMap hashMap = new HashMap();
        for (C13690k9 next : list) {
            hashMap.put(next.mo68167b(), next.mo68169d());
        }
        return hashMap;
    }

    /* renamed from: a */
    public dm0 mo70139a() {
        Object obj = this.f40268a.get("media");
        if (obj instanceof dm0) {
            return (dm0) obj;
        }
        return null;
    }
}
