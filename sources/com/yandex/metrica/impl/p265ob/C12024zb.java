package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.zb */
public class C12024zb extends ECommerceEvent {

    /* renamed from: b */
    public final int f28883b;

    /* renamed from: c */
    public final C10104Ab f28884c;

    /* renamed from: d */
    private final C11488lb<C12024zb> f28885d;

    public C12024zb(int i, C10104Ab ab, C11488lb<C12024zb> lbVar) {
        this.f28883b = i;
        this.f28884c = ab;
        this.f28885d = lbVar;
    }

    public String getPublicDescription() {
        int i = this.f28883b;
        if (i != 4) {
            return i != 5 ? "unknown cart action info" : "remove cart item info";
        }
        return "add cart item info";
    }

    public List<C11786tb<C10705Rf, C10265Fn>> toProto() {
        return (List) this.f28885d.mo61050b(this);
    }

    public String toString() {
        return "CartActionInfoEvent{eventType=" + this.f28883b + ", cartItem=" + this.f28884c + ", converter=" + this.f28885d + '}';
    }
}
