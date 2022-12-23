package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.IReporter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.t5 */
public class C11777t5 extends C11737s5 {

    /* renamed from: b */
    private final IReporter f28265b;

    public C11777t5(C11229f4 f4Var, IReporter iReporter) {
        super(f4Var);
        this.f28265b = iReporter;
    }

    /* renamed from: a */
    public boolean mo61047a(C11411k0 k0Var) {
        C10983Z6 a = C10983Z6.m28354a(k0Var.mo63161n());
        HashMap hashMap = new HashMap();
        hashMap.put("type", a.f26407a);
        hashMap.put("delivery_method", a.f26408b);
        this.f28265b.reportEvent("crash_saved", (Map<String, Object>) hashMap);
        return false;
    }
}
