package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.ecommerce.ECommerceAmount;
import com.yandex.metrica.ecommerce.ECommercePrice;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Db */
public class C10186Db {

    /* renamed from: a */
    public final C11981yb f24486a;

    /* renamed from: b */
    public final List<C11981yb> f24487b;

    public C10186Db(ECommercePrice eCommercePrice) {
        this(new C11981yb(eCommercePrice.getFiat()), m26146a(eCommercePrice.getInternalComponents()));
    }

    /* renamed from: a */
    public static List<C11981yb> m26146a(List<ECommerceAmount> list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (ECommerceAmount next : list) {
            linkedList.add(new C11981yb(next.getAmount(), next.getUnit()));
        }
        return linkedList;
    }

    public String toString() {
        return "PriceWrapper{fiat=" + this.f24486a + ", internalComponents=" + this.f24487b + '}';
    }

    public C10186Db(C11981yb ybVar, List<C11981yb> list) {
        this.f24486a = ybVar;
        this.f24487b = list;
    }
}
