package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdImpressionData;
import java.util.Collections;
import java.util.List;

public class wu0 {

    /* renamed from: a */
    private final String f42296a;

    /* renamed from: b */
    private final List<C13690k9> f42297b;

    /* renamed from: c */
    private final List<k81> f42298c;

    /* renamed from: d */
    private final List<String> f42299d;

    /* renamed from: e */
    private final AdImpressionData f42300e;

    public wu0(List<C13690k9> list, List<k81> list2, List<String> list3, String str, AdImpressionData adImpressionData) {
        this.f42297b = list;
        this.f42298c = list2;
        this.f42299d = list3;
        this.f42296a = str;
        this.f42300e = adImpressionData;
    }

    /* renamed from: a */
    public String mo70756a() {
        return this.f42296a;
    }

    /* renamed from: b */
    public List<C13690k9> mo70757b() {
        List<C13690k9> list = this.f42297b;
        return list != null ? list : Collections.emptyList();
    }

    /* renamed from: c */
    public AdImpressionData mo70758c() {
        return this.f42300e;
    }

    /* renamed from: d */
    public List<String> mo70759d() {
        return this.f42299d;
    }

    /* renamed from: e */
    public List<k81> mo70760e() {
        return this.f42298c;
    }
}
