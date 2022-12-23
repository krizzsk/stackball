package com.yandex.mobile.ads.impl;

import java.util.Map;

public class z01 {

    /* renamed from: a */
    private final String f42993a;

    /* renamed from: b */
    private final String f42994b;

    /* renamed from: c */
    private final Map<String, Object> f42995c;

    public z01(String str, String str2, Map<String, Object> map) {
        this.f42993a = str;
        this.f42994b = str2;
        this.f42995c = map;
    }

    /* renamed from: a */
    public Map<String, Object> mo71140a() {
        return this.f42995c;
    }

    /* renamed from: b */
    public String mo71141b() {
        return this.f42993a;
    }

    /* renamed from: c */
    public String mo71142c() {
        return this.f42994b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z01.class != obj.getClass()) {
            return false;
        }
        z01 z01 = (z01) obj;
        if (!this.f42993a.equals(z01.f42993a) || !this.f42994b.equals(z01.f42994b)) {
            return false;
        }
        Map<String, Object> map = this.f42995c;
        Map<String, Object> map2 = z01.f42995c;
        if (map != null) {
            return map.equals(map2);
        }
        if (map2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f42993a.hashCode() * 31) + this.f42994b.hashCode()) * 31;
        Map<String, Object> map = this.f42995c;
        return hashCode + (map != null ? map.hashCode() : 0);
    }
}
