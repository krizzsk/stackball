package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* renamed from: com.yandex.metrica.impl.ob.Ab */
public class C10104Ab {

    /* renamed from: a */
    public final C10219Eb f24312a;

    /* renamed from: b */
    public final BigDecimal f24313b;

    /* renamed from: c */
    public final C10186Db f24314c;

    /* renamed from: d */
    public final C10308Gb f24315d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C10104Ab(ECommerceCartItem eCommerceCartItem) {
        this(new C10219Eb(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new C10186Db(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new C10308Gb(eCommerceCartItem.getReferrer()));
    }

    public String toString() {
        return "CartItemWrapper{product=" + this.f24312a + ", quantity=" + this.f24313b + ", revenue=" + this.f24314c + ", referrer=" + this.f24315d + '}';
    }

    public C10104Ab(C10219Eb eb, BigDecimal bigDecimal, C10186Db db, C10308Gb gb) {
        this.f24312a = eb;
        this.f24313b = bigDecimal;
        this.f24314c = db;
        this.f24315d = gb;
    }
}
