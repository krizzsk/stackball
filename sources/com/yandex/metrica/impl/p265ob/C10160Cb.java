package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.ecommerce.ECommerceCartItem;
import com.yandex.metrica.ecommerce.ECommerceOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.yandex.metrica.impl.ob.Cb */
public class C10160Cb {

    /* renamed from: a */
    public final String f24447a;

    /* renamed from: b */
    public final String f24448b;

    /* renamed from: c */
    public final List<C10104Ab> f24449c;

    /* renamed from: d */
    public final Map<String, String> f24450d;

    public C10160Cb(ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), m26108a(eCommerceOrder.getCartItems()), C10796U2.m27898c(eCommerceOrder.getPayload()));
    }

    /* renamed from: a */
    private static List<C10104Ab> m26108a(List<ECommerceCartItem> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (ECommerceCartItem ab : list) {
            arrayList.add(new C10104Ab(ab));
        }
        return arrayList;
    }

    public String toString() {
        return "OrderWrapper{uuid='" + this.f24447a + '\'' + ", identifier='" + this.f24448b + '\'' + ", cartItems=" + this.f24449c + ", payload=" + this.f24450d + '}';
    }

    public C10160Cb(String str, String str2, List<C10104Ab> list, Map<String, String> map) {
        this.f24447a = str;
        this.f24448b = str2;
        this.f24449c = list;
        this.f24450d = map;
    }
}
