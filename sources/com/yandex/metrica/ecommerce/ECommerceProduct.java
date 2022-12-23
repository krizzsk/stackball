package com.yandex.metrica.ecommerce;

import java.util.List;
import java.util.Map;

public class ECommerceProduct {

    /* renamed from: a */
    private final String f24257a;

    /* renamed from: b */
    private String f24258b;

    /* renamed from: c */
    private List<String> f24259c;

    /* renamed from: d */
    private Map<String, String> f24260d;

    /* renamed from: e */
    private ECommercePrice f24261e;

    /* renamed from: f */
    private ECommercePrice f24262f;

    /* renamed from: g */
    private List<String> f24263g;

    public ECommerceProduct(String str) {
        this.f24257a = str;
    }

    public ECommercePrice getActualPrice() {
        return this.f24261e;
    }

    public List<String> getCategoriesPath() {
        return this.f24259c;
    }

    public String getName() {
        return this.f24258b;
    }

    public ECommercePrice getOriginalPrice() {
        return this.f24262f;
    }

    public Map<String, String> getPayload() {
        return this.f24260d;
    }

    public List<String> getPromocodes() {
        return this.f24263g;
    }

    public String getSku() {
        return this.f24257a;
    }

    public ECommerceProduct setActualPrice(ECommercePrice eCommercePrice) {
        this.f24261e = eCommercePrice;
        return this;
    }

    public ECommerceProduct setCategoriesPath(List<String> list) {
        this.f24259c = list;
        return this;
    }

    public ECommerceProduct setName(String str) {
        this.f24258b = str;
        return this;
    }

    public ECommerceProduct setOriginalPrice(ECommercePrice eCommercePrice) {
        this.f24262f = eCommercePrice;
        return this;
    }

    public ECommerceProduct setPayload(Map<String, String> map) {
        this.f24260d = map;
        return this;
    }

    public ECommerceProduct setPromocodes(List<String> list) {
        this.f24263g = list;
        return this;
    }

    public String toString() {
        return "ECommerceProduct{sku='" + this.f24257a + '\'' + ", name='" + this.f24258b + '\'' + ", categoriesPath=" + this.f24259c + ", payload=" + this.f24260d + ", actualPrice=" + this.f24261e + ", originalPrice=" + this.f24262f + ", promocodes=" + this.f24263g + '}';
    }
}
