package com.yandex.mobile.ads.impl;

import com.tapjoy.TJAdUnitConstants;
import com.yandex.mobile.ads.base.model.C12110a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.yh */
public class C15251yh {

    /* renamed from: a */
    private static final Map<String, C12110a> f42859a = new C15252a();

    /* renamed from: com.yandex.mobile.ads.impl.yh$a */
    class C15252a extends HashMap<String, C12110a> {
        C15252a() {
            put(TJAdUnitConstants.String.HTML, C12110a.HTML);
            put("native", C12110a.NATIVE);
        }
    }

    /* renamed from: a */
    public C12110a mo71078a(Map<String, String> map) {
        return (C12110a) ((HashMap) f42859a).get(map.get(wb0.YMAD_CONTENT_TYPE.mo70671a()));
    }
}
