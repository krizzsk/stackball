package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Bb */
public class C10132Bb extends ECommerceEvent {

    /* renamed from: b */
    public final int f24394b;

    /* renamed from: c */
    public final C10160Cb f24395c;

    /* renamed from: d */
    private final C11488lb<C10132Bb> f24396d;

    public C10132Bb(int i, C10160Cb cb, C11488lb<C10132Bb> lbVar) {
        this.f24394b = i;
        this.f24395c = cb;
        this.f24396d = lbVar;
    }

    public String getPublicDescription() {
        return "order info";
    }

    public List<C11786tb<C10705Rf, C10265Fn>> toProto() {
        return (List) this.f24396d.mo61050b(this);
    }

    public String toString() {
        return "OrderInfoEvent{eventType=" + this.f24394b + ", order=" + this.f24395c + ", converter=" + this.f24396d + '}';
    }
}
