package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class as0 {

    /* renamed from: a */
    private String f30669a;

    /* renamed from: b */
    private List<C13690k9> f30670b;

    /* renamed from: c */
    private List<pq0> f30671c;

    /* renamed from: d */
    private d81 f30672d;

    /* renamed from: e */
    private List<k81> f30673e;

    /* renamed from: f */
    private List<String> f30674f;

    /* renamed from: g */
    private List<C14535ru> f30675g;

    /* renamed from: h */
    private Map<String, Object> f30676h = new HashMap();

    /* renamed from: a */
    public void mo65853a(List<C13690k9> list) {
        this.f30670b = list;
    }

    /* renamed from: b */
    public void mo65855b(List<C14535ru> list) {
        this.f30675g = list;
    }

    /* renamed from: c */
    public void mo65857c(List<pq0> list) {
        this.f30671c = list;
    }

    /* renamed from: d */
    public void mo65859d(List<String> list) {
        this.f30674f = list;
    }

    /* renamed from: e */
    public void mo65861e(List<k81> list) {
        this.f30673e = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || as0.class != obj.getClass()) {
            return false;
        }
        as0 as0 = (as0) obj;
        String str = this.f30669a;
        if (str == null ? as0.f30669a != null : !str.equals(as0.f30669a)) {
            return false;
        }
        List<C13690k9> list = this.f30670b;
        if (list == null ? as0.f30670b != null : !list.equals(as0.f30670b)) {
            return false;
        }
        List<pq0> list2 = this.f30671c;
        if (list2 == null ? as0.f30671c != null : !list2.equals(as0.f30671c)) {
            return false;
        }
        d81 d81 = this.f30672d;
        if (d81 == null ? as0.f30672d != null : !d81.equals(as0.f30672d)) {
            return false;
        }
        List<k81> list3 = this.f30673e;
        if (list3 == null ? as0.f30673e != null : !list3.equals(as0.f30673e)) {
            return false;
        }
        List<String> list4 = this.f30674f;
        if (list4 == null ? as0.f30674f != null : !list4.equals(as0.f30674f)) {
            return false;
        }
        List<C14535ru> list5 = this.f30675g;
        if (list5 == null ? as0.f30675g != null : !list5.equals(as0.f30675g)) {
            return false;
        }
        Map<String, Object> map = this.f30676h;
        Map<String, Object> map2 = as0.f30676h;
        if (map != null) {
            return map.equals(map2);
        }
        if (map2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public d81 mo65863f() {
        return this.f30672d;
    }

    /* renamed from: g */
    public List<k81> mo65864g() {
        return this.f30673e;
    }

    public int hashCode() {
        String str = this.f30669a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<C13690k9> list = this.f30670b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<pq0> list2 = this.f30671c;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        d81 d81 = this.f30672d;
        int hashCode4 = (hashCode3 + (d81 != null ? d81.hashCode() : 0)) * 31;
        List<k81> list3 = this.f30673e;
        int hashCode5 = (hashCode4 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<String> list4 = this.f30674f;
        int hashCode6 = (hashCode5 + (list4 != null ? list4.hashCode() : 0)) * 31;
        List<C14535ru> list5 = this.f30675g;
        int hashCode7 = (hashCode6 + (list5 != null ? list5.hashCode() : 0)) * 31;
        Map<String, Object> map = this.f30676h;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode7 + i;
    }

    /* renamed from: a */
    public void mo65850a(d81 d81) {
        this.f30672d = d81;
    }

    /* renamed from: b */
    public List<C14535ru> mo65854b() {
        return this.f30675g;
    }

    /* renamed from: c */
    public List<pq0> mo65856c() {
        return this.f30671c;
    }

    /* renamed from: d */
    public Map<String, Object> mo65858d() {
        return this.f30676h;
    }

    /* renamed from: e */
    public List<String> mo65860e() {
        return this.f30674f;
    }

    /* renamed from: a */
    public void mo65851a(String str) {
        this.f30669a = str;
    }

    /* renamed from: a */
    public void mo65852a(String str, Object obj) {
        this.f30676h.put(str, obj);
    }

    /* renamed from: a */
    public List<C13690k9> mo65849a() {
        return this.f30670b;
    }
}
