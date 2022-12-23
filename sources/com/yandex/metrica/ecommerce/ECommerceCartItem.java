package com.yandex.metrica.ecommerce;

import com.yandex.metrica.impl.p265ob.C10796U2;
import java.math.BigDecimal;

public class ECommerceCartItem {

    /* renamed from: a */
    private final ECommerceProduct f24247a;

    /* renamed from: b */
    private final BigDecimal f24248b;

    /* renamed from: c */
    private final ECommercePrice f24249c;

    /* renamed from: d */
    private ECommerceReferrer f24250d;

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, long j) {
        this(eCommerceProduct, eCommercePrice, C10796U2.m27880a(j));
    }

    public ECommerceProduct getProduct() {
        return this.f24247a;
    }

    public BigDecimal getQuantity() {
        return this.f24248b;
    }

    public ECommerceReferrer getReferrer() {
        return this.f24250d;
    }

    public ECommercePrice getRevenue() {
        return this.f24249c;
    }

    public ECommerceCartItem setReferrer(ECommerceReferrer eCommerceReferrer) {
        this.f24250d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        return "ECommerceCartItem{product=" + this.f24247a + ", quantity=" + this.f24248b + ", revenue=" + this.f24249c + ", referrer=" + this.f24250d + '}';
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, double d) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(C10796U2.m27874a(d, 0.0d)));
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, BigDecimal bigDecimal) {
        this.f24247a = eCommerceProduct;
        this.f24248b = bigDecimal;
        this.f24249c = eCommercePrice;
    }
}
