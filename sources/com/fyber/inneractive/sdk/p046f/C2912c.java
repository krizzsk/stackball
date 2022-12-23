package com.fyber.inneractive.sdk.p046f;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.f.c */
public final class C2912c {

    /* renamed from: b */
    private static final C2912c f6930b = new C2912c();

    /* renamed from: a */
    final Map<String, C2915f> f6931a = new HashMap();

    /* renamed from: c */
    private final C2915f f6932c = new C2914e();

    private C2912c() {
    }

    /* renamed from: a */
    public static C2912c m6513a() {
        return f6930b;
    }

    /* renamed from: a */
    public final C2915f mo18364a(String str) {
        if (str == null) {
            try {
                return this.f6932c;
            } catch (Exception unused) {
                return this.f6932c;
            }
        } else {
            C2915f fVar = this.f6931a.get(str);
            if (fVar != null) {
                return fVar;
            }
            C2913d dVar = new C2913d();
            this.f6931a.put(str, dVar);
            return dVar;
        }
    }
}
