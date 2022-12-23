package com.yandex.metrica.ecommerce;

import java.util.List;

public class ECommercePrice {

    /* renamed from: a */
    private final ECommerceAmount f24255a;

    /* renamed from: b */
    private List<ECommerceAmount> f24256b;

    public ECommercePrice(ECommerceAmount eCommerceAmount) {
        this.f24255a = eCommerceAmount;
    }

    public ECommerceAmount getFiat() {
        return this.f24255a;
    }

    public List<ECommerceAmount> getInternalComponents() {
        return this.f24256b;
    }

    public ECommercePrice setInternalComponents(List<ECommerceAmount> list) {
        this.f24256b = list;
        return this;
    }

    public String toString() {
        return "ECommercePrice{fiat=" + this.f24255a + ", internalComponents=" + this.f24256b + '}';
    }
}
