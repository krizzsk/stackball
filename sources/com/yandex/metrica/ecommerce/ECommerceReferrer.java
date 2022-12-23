package com.yandex.metrica.ecommerce;

public class ECommerceReferrer {

    /* renamed from: a */
    private String f24264a;

    /* renamed from: b */
    private String f24265b;

    /* renamed from: c */
    private ECommerceScreen f24266c;

    public String getIdentifier() {
        return this.f24265b;
    }

    public ECommerceScreen getScreen() {
        return this.f24266c;
    }

    public String getType() {
        return this.f24264a;
    }

    public ECommerceReferrer setIdentifier(String str) {
        this.f24265b = str;
        return this;
    }

    public ECommerceReferrer setScreen(ECommerceScreen eCommerceScreen) {
        this.f24266c = eCommerceScreen;
        return this;
    }

    public ECommerceReferrer setType(String str) {
        this.f24264a = str;
        return this;
    }

    public String toString() {
        return "ECommerceReferrer{type='" + this.f24264a + '\'' + ", identifier='" + this.f24265b + '\'' + ", screen=" + this.f24266c + '}';
    }
}
