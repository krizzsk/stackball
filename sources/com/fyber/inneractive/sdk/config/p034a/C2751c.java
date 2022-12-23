package com.fyber.inneractive.sdk.config.p034a;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.config.a.c */
public class C2751c implements C2752d {

    /* renamed from: a */
    Set<Long> f6488a = new HashSet();

    /* renamed from: b */
    boolean f6489b;

    public C2751c(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                long optLong = jSONArray.optLong(i);
                if (optLong != 0) {
                    this.f6488a.add(Long.valueOf(optLong));
                }
            }
        }
        this.f6489b = z;
    }

    /* renamed from: a */
    public final boolean mo17992a(C2753e eVar) {
        if (this.f6488a.isEmpty() || eVar == null || eVar.f6490a == null) {
            return false;
        }
        for (Long equals : this.f6488a) {
            if (equals.equals(eVar.f6490a)) {
                if (!this.f6489b) {
                    return true;
                }
                return false;
            }
        }
        return this.f6489b;
    }

    public String toString() {
        return String.format("%s - %s include: %b", new Object[]{"demand", this.f6488a, Boolean.valueOf(this.f6489b)});
    }
}
