package com.ironsource.sdk.p143a;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;

/* renamed from: com.ironsource.sdk.a.a */
public final class C5821a {

    /* renamed from: a */
    public HashMap<String, Object> f14151a = new HashMap<>();

    /* renamed from: a */
    public final C5821a mo42154a(String str, Object obj) {
        if (obj != null) {
            this.f14151a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }
}
