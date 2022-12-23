package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Hb */
public class C10335Hb {

    /* renamed from: a */
    public final String f24826a;

    /* renamed from: b */
    public final List<String> f24827b;

    /* renamed from: c */
    public final String f24828c;

    /* renamed from: d */
    public final Map<String, String> f24829d;

    public C10335Hb(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), C10796U2.m27881a(eCommerceScreen.getCategoriesPath()), eCommerceScreen.getSearchQuery(), C10796U2.m27898c(eCommerceScreen.getPayload()));
    }

    public String toString() {
        return "ScreenWrapper{name='" + this.f24826a + '\'' + ", categoriesPath=" + this.f24827b + ", searchQuery='" + this.f24828c + '\'' + ", payload=" + this.f24829d + '}';
    }

    public C10335Hb(String str, List<String> list, String str2, Map<String, String> map) {
        this.f24826a = str;
        this.f24827b = list;
        this.f24828c = str2;
        this.f24829d = map;
    }
}
