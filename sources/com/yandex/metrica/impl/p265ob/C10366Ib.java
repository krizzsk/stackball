package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Ib */
public class C10366Ib extends ECommerceEvent {

    /* renamed from: b */
    public final C10219Eb f24896b;

    /* renamed from: c */
    public final C10335Hb f24897c;

    /* renamed from: d */
    private final C11488lb<C10366Ib> f24898d;

    public C10366Ib(C10219Eb eb, C10335Hb hb, C11488lb<C10366Ib> lbVar) {
        this.f24896b = eb;
        this.f24897c = hb;
        this.f24898d = lbVar;
    }

    public String getPublicDescription() {
        return "shown product card info";
    }

    public List<C11786tb<C10705Rf, C10265Fn>> toProto() {
        return (List) this.f24898d.mo61050b(this);
    }

    public String toString() {
        return "ShownProductCardInfoEvent{product=" + this.f24896b + ", screen=" + this.f24897c + ", converter=" + this.f24898d + '}';
    }
}
