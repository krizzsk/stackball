package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Kb */
public class C10427Kb extends ECommerceEvent {

    /* renamed from: b */
    public final C10335Hb f25052b;

    /* renamed from: c */
    private final C11488lb<C10427Kb> f25053c;

    public C10427Kb(C10335Hb hb, C11488lb<C10427Kb> lbVar) {
        this.f25052b = hb;
        this.f25053c = lbVar;
    }

    public String getPublicDescription() {
        return "shown screen info";
    }

    public List<C11786tb<C10705Rf, C10265Fn>> toProto() {
        return (List) this.f25053c.mo61050b(this);
    }

    public String toString() {
        return "ShownScreenInfoEvent{screen=" + this.f25052b + ", converter=" + this.f25053c + '}';
    }
}
