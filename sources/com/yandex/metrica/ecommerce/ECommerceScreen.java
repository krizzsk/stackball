package com.yandex.metrica.ecommerce;

import java.util.List;
import java.util.Map;

public class ECommerceScreen {

    /* renamed from: a */
    private String f24267a;

    /* renamed from: b */
    private List<String> f24268b;

    /* renamed from: c */
    private String f24269c;

    /* renamed from: d */
    private Map<String, String> f24270d;

    public List<String> getCategoriesPath() {
        return this.f24268b;
    }

    public String getName() {
        return this.f24267a;
    }

    public Map<String, String> getPayload() {
        return this.f24270d;
    }

    public String getSearchQuery() {
        return this.f24269c;
    }

    public ECommerceScreen setCategoriesPath(List<String> list) {
        this.f24268b = list;
        return this;
    }

    public ECommerceScreen setName(String str) {
        this.f24267a = str;
        return this;
    }

    public ECommerceScreen setPayload(Map<String, String> map) {
        this.f24270d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(String str) {
        this.f24269c = str;
        return this;
    }

    public String toString() {
        return "ECommerceScreen{name='" + this.f24267a + '\'' + ", categoriesPath=" + this.f24268b + ", searchQuery='" + this.f24269c + '\'' + ", payload=" + this.f24270d + '}';
    }
}
