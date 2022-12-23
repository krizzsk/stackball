package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.h41;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ls0 implements h41.C13275a {

    /* renamed from: a */
    private final as0 f36907a;

    /* renamed from: b */
    private final ir0 f36908b = new ir0();

    public ls0(as0 as0) {
        this.f36907a = as0;
    }

    /* renamed from: a */
    public Map<String, Object> mo66063a() {
        HashMap hashMap = new HashMap();
        as0 as0 = this.f36907a;
        if (as0 != null) {
            List<String> a = this.f36908b.mo67886a(as0.mo65856c());
            if (!((ArrayList) a).isEmpty()) {
                hashMap.put("image_sizes", a);
            }
        }
        return hashMap;
    }
}
