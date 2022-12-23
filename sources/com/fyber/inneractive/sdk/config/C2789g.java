package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.config.g */
public final class C2789g {

    /* renamed from: a */
    final Map<String, String> f6582a = new HashMap();

    C2789g() {
    }

    /* renamed from: a */
    public final boolean mo18042a(String str) {
        return this.f6582a.containsKey(str);
    }

    /* renamed from: b */
    public final boolean mo18043b(String str) {
        try {
            if (this.f6582a.containsKey(str)) {
                return Boolean.parseBoolean(this.f6582a.get(str));
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public final int mo18044c(String str) {
        int i;
        try {
            if (this.f6582a.containsKey(str)) {
                i = Integer.parseInt(this.f6582a.get(str));
                return Math.max(i, -1);
            }
        } catch (Exception unused) {
        }
        i = -1;
        return Math.max(i, -1);
    }

    /* renamed from: d */
    public final long mo18045d(String str) {
        try {
            if (this.f6582a.containsKey(str)) {
                return Long.parseLong(this.f6582a.get(str));
            }
            return 3;
        } catch (Exception unused) {
            return 3;
        }
    }
}
