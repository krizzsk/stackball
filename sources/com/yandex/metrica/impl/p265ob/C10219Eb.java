package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.ecommerce.ECommerceProduct;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Eb */
public class C10219Eb {

    /* renamed from: a */
    public final String f24575a;

    /* renamed from: b */
    public final String f24576b;

    /* renamed from: c */
    public final List<String> f24577c;

    /* renamed from: d */
    public final Map<String, String> f24578d;

    /* renamed from: e */
    public final C10186Db f24579e;

    /* renamed from: f */
    public final C10186Db f24580f;

    /* renamed from: g */
    public final List<String> f24581g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C10219Eb(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), C10796U2.m27881a(eCommerceProduct.getCategoriesPath()), C10796U2.m27898c(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new C10186Db(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() == null ? null : new C10186Db(eCommerceProduct.getOriginalPrice()), C10796U2.m27881a(eCommerceProduct.getPromocodes()));
    }

    public String toString() {
        return "ProductWrapper{sku='" + this.f24575a + '\'' + ", name='" + this.f24576b + '\'' + ", categoriesPath=" + this.f24577c + ", payload=" + this.f24578d + ", actualPrice=" + this.f24579e + ", originalPrice=" + this.f24580f + ", promocodes=" + this.f24581g + '}';
    }

    public C10219Eb(String str, String str2, List<String> list, Map<String, String> map, C10186Db db, C10186Db db2, List<String> list2) {
        this.f24575a = str;
        this.f24576b = str2;
        this.f24577c = list;
        this.f24578d = map;
        this.f24579e = db;
        this.f24580f = db2;
        this.f24581g = list2;
    }
}
