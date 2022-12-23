package com.yandex.metrica;

import java.util.Map;

/* renamed from: com.yandex.metrica.k */
public class C12042k {

    /* renamed from: a */
    private String f28942a;

    /* renamed from: b */
    private String f28943b;

    /* renamed from: c */
    private Map<String, String> f28944c;

    /* renamed from: a */
    public void mo64237a(String str) {
        this.f28943b = str;
    }

    /* renamed from: b */
    public void mo64240b(String str) {
        this.f28942a = str;
    }

    /* renamed from: c */
    public String mo64241c() {
        return this.f28942a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12042k.class != obj.getClass()) {
            return false;
        }
        C12042k kVar = (C12042k) obj;
        String str = this.f28942a;
        if (str == null ? kVar.f28942a != null : !str.equals(kVar.f28942a)) {
            return false;
        }
        String str2 = this.f28943b;
        if (str2 == null ? kVar.f28943b != null : !str2.equals(kVar.f28943b)) {
            return false;
        }
        Map<String, String> map = this.f28944c;
        Map<String, String> map2 = kVar.f28944c;
        if (map != null) {
            return map.equals(map2);
        }
        if (map2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f28942a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f28943b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, String> map = this.f28944c;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode2 + i;
    }

    /* renamed from: a */
    public Map<String, String> mo64236a() {
        return this.f28944c;
    }

    /* renamed from: b */
    public String mo64239b() {
        return this.f28943b;
    }

    /* renamed from: a */
    public void mo64238a(Map<String, String> map) {
        this.f28944c = map;
    }
}
