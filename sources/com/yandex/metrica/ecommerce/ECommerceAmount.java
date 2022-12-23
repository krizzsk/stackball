package com.yandex.metrica.ecommerce;

import com.yandex.metrica.impl.p265ob.C10796U2;
import java.math.BigDecimal;

public class ECommerceAmount {

    /* renamed from: a */
    private final BigDecimal f24245a;

    /* renamed from: b */
    private final String f24246b;

    public ECommerceAmount(long j, String str) {
        this(C10796U2.m27880a(j), str);
    }

    public BigDecimal getAmount() {
        return this.f24245a;
    }

    public String getUnit() {
        return this.f24246b;
    }

    public String toString() {
        return "ECommerceAmount{amount=" + this.f24245a + ", unit='" + this.f24246b + '\'' + '}';
    }

    public ECommerceAmount(double d, String str) {
        this(new BigDecimal(C10796U2.m27874a(d, 0.0d)), str);
    }

    public ECommerceAmount(BigDecimal bigDecimal, String str) {
        this.f24245a = bigDecimal;
        this.f24246b = str;
    }
}
