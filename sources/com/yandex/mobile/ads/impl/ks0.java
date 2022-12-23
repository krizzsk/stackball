package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.h41;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ks0 implements h41.C13275a {

    /* renamed from: a */
    private final C14645t1 f36406a;

    public ks0(C14645t1 t1Var) {
        this.f36406a = t1Var;
    }

    /* renamed from: a */
    public Map<String, Object> mo66063a() {
        HashMap hashMap = new HashMap();
        String[] k = this.f36406a.mo70105k();
        if (k != null && k.length > 0) {
            hashMap.put("image_sizes", Arrays.asList(k));
        }
        return hashMap;
    }
}
