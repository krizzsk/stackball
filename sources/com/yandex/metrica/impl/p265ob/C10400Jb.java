package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Jb */
public class C10400Jb extends ECommerceEvent {

    /* renamed from: b */
    public final C10219Eb f25017b;

    /* renamed from: c */
    public final C10308Gb f25018c;

    /* renamed from: d */
    private final C11488lb<C10400Jb> f25019d;

    public C10400Jb(C10219Eb eb, C10308Gb gb, C11488lb<C10400Jb> lbVar) {
        this.f25017b = eb;
        this.f25018c = gb;
        this.f25019d = lbVar;
    }

    public String getPublicDescription() {
        return "shown product details info";
    }

    public List<C11786tb<C10705Rf, C10265Fn>> toProto() {
        return (List) this.f25019d.mo61050b(this);
    }

    public String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.f25017b + ", referrer=" + this.f25018c + ", converter=" + this.f25019d + '}';
    }
}
