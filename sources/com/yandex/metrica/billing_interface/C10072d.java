package com.yandex.metrica.billing_interface;

/* renamed from: com.yandex.metrica.billing_interface.d */
public class C10072d {

    /* renamed from: a */
    public final C10073e f24217a;

    /* renamed from: b */
    public final String f24218b;

    /* renamed from: c */
    public final int f24219c;

    /* renamed from: d */
    public final long f24220d;

    /* renamed from: e */
    public final String f24221e;

    /* renamed from: f */
    public final long f24222f;

    /* renamed from: g */
    public final C10070c f24223g;

    /* renamed from: h */
    public final int f24224h;

    /* renamed from: i */
    public final C10070c f24225i;

    /* renamed from: j */
    public final String f24226j;

    /* renamed from: k */
    public final String f24227k;

    /* renamed from: l */
    public final long f24228l;

    /* renamed from: m */
    public final boolean f24229m;

    /* renamed from: n */
    public final String f24230n;

    public C10072d(C10073e eVar, String str, int i, long j, String str2, long j2, C10070c cVar, int i2, C10070c cVar2, String str3, String str4, long j3, boolean z, String str5) {
        this.f24217a = eVar;
        this.f24218b = str;
        this.f24219c = i;
        this.f24220d = j;
        this.f24221e = str2;
        this.f24222f = j2;
        this.f24223g = cVar;
        this.f24224h = i2;
        this.f24225i = cVar2;
        this.f24226j = str3;
        this.f24227k = str4;
        this.f24228l = j3;
        this.f24229m = z;
        this.f24230n = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10072d.class != obj.getClass()) {
            return false;
        }
        C10072d dVar = (C10072d) obj;
        if (this.f24219c != dVar.f24219c || this.f24220d != dVar.f24220d || this.f24222f != dVar.f24222f || this.f24224h != dVar.f24224h || this.f24228l != dVar.f24228l || this.f24229m != dVar.f24229m || this.f24217a != dVar.f24217a || !this.f24218b.equals(dVar.f24218b) || !this.f24221e.equals(dVar.f24221e)) {
            return false;
        }
        C10070c cVar = this.f24223g;
        if (cVar == null ? dVar.f24223g != null : !cVar.equals(dVar.f24223g)) {
            return false;
        }
        C10070c cVar2 = this.f24225i;
        if (cVar2 == null ? dVar.f24225i != null : !cVar2.equals(dVar.f24225i)) {
            return false;
        }
        if (this.f24226j.equals(dVar.f24226j) && this.f24227k.equals(dVar.f24227k)) {
            return this.f24230n.equals(dVar.f24230n);
        }
        return false;
    }

    public int hashCode() {
        long j = this.f24220d;
        long j2 = this.f24222f;
        int hashCode = ((((((((((this.f24217a.hashCode() * 31) + this.f24218b.hashCode()) * 31) + this.f24219c) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f24221e.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        C10070c cVar = this.f24223g;
        int i = 0;
        int hashCode2 = (((hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31) + this.f24224h) * 31;
        C10070c cVar2 = this.f24225i;
        if (cVar2 != null) {
            i = cVar2.hashCode();
        }
        long j3 = this.f24228l;
        return ((((((((((hashCode2 + i) * 31) + this.f24226j.hashCode()) * 31) + this.f24227k.hashCode()) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f24229m ? 1 : 0)) * 31) + this.f24230n.hashCode();
    }

    public String toString() {
        return "ProductInfo{type=" + this.f24217a + ", sku='" + this.f24218b + '\'' + ", quantity=" + this.f24219c + ", priceMicros=" + this.f24220d + ", priceCurrency='" + this.f24221e + '\'' + ", introductoryPriceMicros=" + this.f24222f + ", introductoryPricePeriod=" + this.f24223g + ", introductoryPriceCycles=" + this.f24224h + ", subscriptionPeriod=" + this.f24225i + ", signature='" + this.f24226j + '\'' + ", purchaseToken='" + this.f24227k + '\'' + ", purchaseTime=" + this.f24228l + ", autoRenewing=" + this.f24229m + ", purchaseOriginalJson='" + this.f24230n + '\'' + '}';
    }
}
