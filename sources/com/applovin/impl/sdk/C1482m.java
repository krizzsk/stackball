package com.applovin.impl.sdk;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.applovin.impl.sdk.m */
public class C1482m {

    /* renamed from: a */
    private final String f3591a = UUID.randomUUID().toString();

    /* renamed from: b */
    private final String f3592b;

    /* renamed from: c */
    private final Map<String, Object> f3593c;

    /* renamed from: d */
    private final long f3594d;

    public C1482m(String str, Map<String, String> map, Map<String, Object> map2) {
        this.f3592b = str;
        HashMap hashMap = new HashMap();
        this.f3593c = hashMap;
        hashMap.putAll(map);
        this.f3593c.put("applovin_sdk_super_properties", map2);
        this.f3594d = System.currentTimeMillis();
    }

    /* renamed from: a */
    public String mo13159a() {
        return this.f3592b;
    }

    /* renamed from: b */
    public Map<String, Object> mo13160b() {
        return this.f3593c;
    }

    /* renamed from: c */
    public long mo13161c() {
        return this.f3594d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1482m mVar = (C1482m) obj;
        if (this.f3594d != mVar.f3594d) {
            return false;
        }
        String str = this.f3592b;
        if (str == null ? mVar.f3592b != null : !str.equals(mVar.f3592b)) {
            return false;
        }
        Map<String, Object> map = this.f3593c;
        if (map == null ? mVar.f3593c != null : !map.equals(mVar.f3593c)) {
            return false;
        }
        String str2 = this.f3591a;
        String str3 = mVar.f3591a;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
    }

    public int hashCode() {
        String str = this.f3592b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, Object> map = this.f3593c;
        int hashCode2 = map != null ? map.hashCode() : 0;
        long j = this.f3594d;
        int i2 = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f3591a;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "Event{name='" + this.f3592b + '\'' + ", id='" + this.f3591a + '\'' + ", creationTimestampMillis=" + this.f3594d + ", parameters=" + this.f3593c + '}';
    }
}
