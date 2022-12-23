package com.flurry.sdk;

import com.facebook.internal.security.CertificateUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.l */
public final class C2656l implements Comparable<C2656l> {

    /* renamed from: a */
    C2653j f6241a;

    /* renamed from: b */
    public int f6242b;

    /* renamed from: c */
    public int f6243c;

    /* renamed from: d */
    JSONObject f6244d;

    /* renamed from: e */
    Map<String, C2473c> f6245e = new HashMap();

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C2656l lVar = (C2656l) obj;
        C2653j jVar = this.f6241a;
        if (jVar != lVar.f6241a) {
            return jVar == C2653j.f6229a ? -1 : 1;
        }
        return this.f6242b - lVar.f6242b;
    }

    public C2656l(C2656l lVar) {
        this.f6241a = lVar.f6241a;
        this.f6242b = lVar.f6242b;
        this.f6243c = lVar.f6243c;
        this.f6244d = lVar.f6244d;
        this.f6245e = new HashMap(lVar.f6245e);
    }

    public C2656l(C2653j jVar) {
        this.f6241a = jVar;
    }

    /* renamed from: a */
    public final C2473c mo17845a(String str) {
        return this.f6245e.get(str);
    }

    /* renamed from: a */
    public final Set<Map.Entry<String, C2473c>> mo17846a() {
        return this.f6245e.entrySet();
    }

    /* renamed from: a */
    public final void mo17847a(C2656l lVar) {
        for (Map.Entry next : lVar.mo17846a()) {
            String str = (String) next.getKey();
            if (!this.f6245e.containsKey(str)) {
                this.f6245e.put(str, next.getValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2656l)) {
            return false;
        }
        C2656l lVar = (C2656l) obj;
        return this.f6241a == lVar.f6241a && this.f6242b == lVar.f6242b;
    }

    public final int hashCode() {
        return (this.f6241a.hashCode() * 31) + this.f6242b;
    }

    public final String toString() {
        return this.f6241a + CertificateUtil.DELIMITER + this.f6242b + CertificateUtil.DELIMITER + this.f6243c;
    }
}
