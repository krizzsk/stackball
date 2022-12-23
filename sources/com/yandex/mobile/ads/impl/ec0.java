package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ec0 extends C14576sb {

    /* renamed from: a */
    private final C14576sb f32954a;

    /* renamed from: b */
    private final gh1 f32955b = new gh1();

    /* renamed from: c */
    private final Context f32956c;

    public ec0(Context context, C14576sb sbVar) {
        this.f32954a = sbVar;
        this.f32956c = context != null ? context.getApplicationContext() : null;
    }

    /* renamed from: a */
    public bc0 mo65925a(l41<?> l41, Map<String, String> map) throws IOException, C13965ma {
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put(wb0.USER_AGENT.mo70671a(), this.f32955b.mo67308a(this.f32956c));
        return this.f32954a.mo65925a(l41, hashMap);
    }
}
