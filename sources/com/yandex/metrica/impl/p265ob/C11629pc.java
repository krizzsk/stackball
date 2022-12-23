package com.yandex.metrica.impl.p265ob;

import com.appsflyer.internal.referrer.Payload;
import com.yandex.metrica.impl.p265ob.C11037ac;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.pc */
public class C11629pc {

    /* renamed from: a */
    public static final Map<String, C11037ac.C11038a> f27912a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Payload.SOURCE_GOOGLE, C11037ac.C11038a.GOOGLE);
        hashMap.put(Payload.SOURCE_HUAWEI, C11037ac.C11038a.HMS);
        hashMap.put("yandex", C11037ac.C11038a.YANDEX);
        f27912a = Collections.unmodifiableMap(hashMap);
    }
}
