package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.mobile.ads.impl.ck */
public final class C12742ck implements C14593sh {

    /* renamed from: c */
    public static final C12742ck f31958c = new C12742ck(Collections.emptyMap());

    /* renamed from: a */
    private int f31959a;

    /* renamed from: b */
    private final Map<String, byte[]> f31960b;

    public C12742ck() {
        this(Collections.emptyMap());
    }

    /* renamed from: a */
    public C12742ck mo66312a(C14680th thVar) {
        byte[] bArr;
        HashMap hashMap = new HashMap(this.f31960b);
        List<String> b = thVar.mo70181b();
        for (int i = 0; i < b.size(); i++) {
            hashMap.remove(b.get(i));
        }
        Map<String, Object> a = thVar.mo70180a();
        for (String next : a.keySet()) {
            Object obj = a.get(next);
            if (obj instanceof Long) {
                bArr = ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
            } else if (obj instanceof String) {
                bArr = ((String) obj).getBytes(Charset.forName("UTF-8"));
            } else if (obj instanceof byte[]) {
                bArr = (byte[]) obj;
            } else {
                throw new IllegalArgumentException();
            }
            hashMap.put(next, bArr);
        }
        if (m34751a(this.f31960b, (Map<String, byte[]>) hashMap)) {
            return this;
        }
        return new C12742ck(hashMap);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12742ck.class != obj.getClass()) {
            return false;
        }
        return m34751a(this.f31960b, ((C12742ck) obj).f31960b);
    }

    public int hashCode() {
        if (this.f31959a == 0) {
            int i = 0;
            for (Map.Entry next : this.f31960b.entrySet()) {
                i += Arrays.hashCode((byte[]) next.getValue()) ^ ((String) next.getKey()).hashCode();
            }
            this.f31959a = i;
        }
        return this.f31959a;
    }

    public C12742ck(Map<String, byte[]> map) {
        this.f31960b = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public Set<Map.Entry<String, byte[]>> mo66314a() {
        return this.f31960b.entrySet();
    }

    /* renamed from: a */
    public final String mo66313a(String str, String str2) {
        if (this.f31960b.containsKey(str)) {
            return new String(this.f31960b.get(str), Charset.forName("UTF-8"));
        }
        return null;
    }

    /* renamed from: a */
    public final long mo66311a(String str, long j) {
        return this.f31960b.containsKey(str) ? ByteBuffer.wrap(this.f31960b.get(str)).getLong() : j;
    }

    /* renamed from: a */
    private static boolean m34751a(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry next : map.entrySet()) {
            if (!Arrays.equals((byte[]) next.getValue(), map2.get(next.getKey()))) {
                return false;
            }
        }
        return true;
    }
}
