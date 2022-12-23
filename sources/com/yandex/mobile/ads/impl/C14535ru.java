package com.yandex.mobile.ads.impl;

import java.util.List;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.ru */
public class C14535ru {

    /* renamed from: a */
    private final String f39716a;

    /* renamed from: b */
    private final JSONObject f39717b;

    /* renamed from: c */
    private final JSONObject f39718c;

    /* renamed from: d */
    private final List<hd0> f39719d;

    public C14535ru(String str, JSONObject jSONObject, JSONObject jSONObject2, List<hd0> list) {
        this.f39716a = str;
        this.f39717b = jSONObject;
        this.f39718c = jSONObject2;
        this.f39719d = list;
    }

    /* renamed from: a */
    public JSONObject mo69818a() {
        return this.f39717b;
    }

    /* renamed from: b */
    public List<hd0> mo69819b() {
        return this.f39719d;
    }

    /* renamed from: c */
    public String mo69820c() {
        return this.f39716a;
    }

    /* renamed from: d */
    public JSONObject mo69821d() {
        return this.f39718c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14535ru.class != obj.getClass()) {
            return false;
        }
        C14535ru ruVar = (C14535ru) obj;
        if (!this.f39716a.equals(ruVar.f39716a) || !this.f39717b.equals(ruVar.f39717b)) {
            return false;
        }
        JSONObject jSONObject = this.f39718c;
        if (jSONObject == null ? ruVar.f39718c != null : !jSONObject.equals(ruVar.f39718c)) {
            return false;
        }
        List<hd0> list = this.f39719d;
        List<hd0> list2 = ruVar.f39719d;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f39717b.hashCode() * 31) + this.f39716a.hashCode()) * 31;
        JSONObject jSONObject = this.f39718c;
        int i = 0;
        int hashCode2 = (hashCode + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31;
        List<hd0> list = this.f39719d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }
}
