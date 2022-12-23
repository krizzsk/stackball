package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.ecommerce.ECommerceReferrer;

/* renamed from: com.yandex.metrica.impl.ob.Gb */
public class C10308Gb {

    /* renamed from: a */
    public final String f24773a;

    /* renamed from: b */
    public final String f24774b;

    /* renamed from: c */
    public final C10335Hb f24775c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C10308Gb(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C10335Hb(eCommerceReferrer.getScreen()));
    }

    public String toString() {
        return "ReferrerWrapper{type='" + this.f24773a + '\'' + ", identifier='" + this.f24774b + '\'' + ", screen=" + this.f24775c + '}';
    }

    public C10308Gb(String str, String str2, C10335Hb hb) {
        this.f24773a = str;
        this.f24774b = str2;
        this.f24775c = hb;
    }
}
