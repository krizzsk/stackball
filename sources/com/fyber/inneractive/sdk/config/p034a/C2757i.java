package com.fyber.inneractive.sdk.config.p034a;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.config.a.i */
public final class C2757i implements C2752d {

    /* renamed from: a */
    boolean f6497a;

    /* renamed from: b */
    private Set<Long> f6498b = new HashSet();

    public C2757i(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                long optLong = jSONArray.optLong(i);
                if (optLong != 0) {
                    this.f6498b.add(Long.valueOf(optLong));
                }
            }
        }
        this.f6497a = z;
    }

    /* renamed from: a */
    public final boolean mo17992a(C2753e eVar) {
        if (this.f6498b.isEmpty() || eVar == null || eVar.f6491b == null) {
            return false;
        }
        for (Long equals : this.f6498b) {
            if (equals.equals(eVar.f6491b)) {
                if (!this.f6497a) {
                    return true;
                }
                return false;
            }
        }
        return this.f6497a;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", new Object[]{"pub_id", this.f6498b, Boolean.valueOf(this.f6497a)});
    }
}
