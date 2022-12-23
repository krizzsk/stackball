package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

/* renamed from: com.yandex.metrica.impl.ob.yb */
public class C11981yb {

    /* renamed from: a */
    public final BigDecimal f28772a;

    /* renamed from: b */
    public final String f28773b;

    public C11981yb(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public String toString() {
        return "AmountWrapper{amount=" + this.f28772a + ", unit='" + this.f28773b + '\'' + '}';
    }

    public C11981yb(BigDecimal bigDecimal, String str) {
        this.f28772a = bigDecimal;
        this.f28773b = str;
    }
}
