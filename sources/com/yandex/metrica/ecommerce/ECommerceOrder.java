package com.yandex.metrica.ecommerce;

import java.util.List;
import java.util.Map;

public class ECommerceOrder {

    /* renamed from: a */
    private final String f24252a;

    /* renamed from: b */
    private final List<ECommerceCartItem> f24253b;

    /* renamed from: c */
    private Map<String, String> f24254c;

    public ECommerceOrder(String str, List<ECommerceCartItem> list) {
        this.f24252a = str;
        this.f24253b = list;
    }

    public List<ECommerceCartItem> getCartItems() {
        return this.f24253b;
    }

    public String getIdentifier() {
        return this.f24252a;
    }

    public Map<String, String> getPayload() {
        return this.f24254c;
    }

    public ECommerceOrder setPayload(Map<String, String> map) {
        this.f24254c = map;
        return this;
    }

    public String toString() {
        return "ECommerceOrder{identifier='" + this.f24252a + '\'' + ", cartItems=" + this.f24253b + ", payload=" + this.f24254c + '}';
    }
}
