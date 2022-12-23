package com.tapjoy.internal;

import com.tapjoy.TapjoyConstants;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.ii */
public abstract class C9417ii extends C9118bz {
    /* renamed from: b */
    public final String mo57904b() {
        return "POST";
    }

    /* renamed from: d */
    public final String mo57906d() {
        return WebRequest.CONTENT_TYPE_JSON;
    }

    /* renamed from: e */
    public Map mo57907e() {
        Map e = super.mo57907e();
        C9344gz a = C9344gz.m25060a();
        e.put("sdk_ver", a.f23123m + "/Android");
        e.put(TapjoyConstants.TJC_API_KEY, a.f23122l);
        if (C9340gw.f23095a) {
            e.put("debug", true);
        }
        return e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Object mo57908f() {
        try {
            return super.mo57908f();
        } catch (Exception e) {
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: a */
    public Object mo57898a(C9101bn bnVar) {
        bnVar.mo57879s();
        return null;
    }
}
