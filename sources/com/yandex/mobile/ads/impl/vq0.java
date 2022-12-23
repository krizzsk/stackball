package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

public class vq0 {

    /* renamed from: a */
    private final AdResponse f41371a;

    /* renamed from: b */
    private final C14645t1 f41372b;

    /* renamed from: c */
    private final as0 f41373c;

    public vq0(as0 as0, AdResponse adResponse, C14645t1 t1Var) {
        this.f41371a = adResponse;
        this.f41372b = t1Var;
        this.f41373c = as0;
    }

    /* renamed from: a */
    public C14645t1 mo70513a() {
        return this.f41372b;
    }

    /* renamed from: b */
    public AdResponse mo70514b() {
        return this.f41371a;
    }

    /* renamed from: c */
    public as0 mo70515c() {
        return this.f41373c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vq0.class != obj.getClass()) {
            return false;
        }
        vq0 vq0 = (vq0) obj;
        AdResponse adResponse = this.f41371a;
        if (adResponse == null ? vq0.f41371a != null : !adResponse.equals(vq0.f41371a)) {
            return false;
        }
        C14645t1 t1Var = this.f41372b;
        if (t1Var == null ? vq0.f41372b != null : !t1Var.equals(vq0.f41372b)) {
            return false;
        }
        as0 as0 = this.f41373c;
        if (as0 != null) {
            return as0.equals(vq0.f41373c);
        }
        if (vq0.f41373c == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        AdResponse adResponse = this.f41371a;
        int i = 0;
        int hashCode = (adResponse != null ? adResponse.hashCode() : 0) * 31;
        C14645t1 t1Var = this.f41372b;
        int hashCode2 = (hashCode + (t1Var != null ? t1Var.hashCode() : 0)) * 31;
        as0 as0 = this.f41373c;
        if (as0 != null) {
            i = as0.hashCode();
        }
        return hashCode2 + i;
    }
}
