package com.fyber.inneractive.sdk.config.p034a;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.config.a.h */
public final class C2756h implements C2752d {

    /* renamed from: a */
    boolean f6495a;

    /* renamed from: b */
    private Set<String> f6496b = new HashSet();

    public C2756h(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    this.f6496b.add(optString);
                }
            }
        }
        this.f6495a = z;
    }

    /* renamed from: a */
    public final boolean mo17992a(C2753e eVar) {
        if (this.f6496b.isEmpty() || eVar == null || eVar.f6492c == null) {
            return false;
        }
        for (String equals : this.f6496b) {
            if (equals.equals(eVar.f6492c.value())) {
                if (!this.f6495a) {
                    return true;
                }
                return false;
            }
        }
        return this.f6495a;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", new Object[]{"placement_type", this.f6496b, Boolean.valueOf(this.f6495a)});
    }
}
