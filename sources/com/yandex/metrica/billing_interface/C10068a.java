package com.yandex.metrica.billing_interface;

/* renamed from: com.yandex.metrica.billing_interface.a */
public class C10068a {

    /* renamed from: a */
    public final C10073e f24199a;

    /* renamed from: b */
    public final String f24200b;

    /* renamed from: c */
    public final String f24201c;

    /* renamed from: d */
    public final long f24202d;

    /* renamed from: e */
    public long f24203e;

    public C10068a(C10073e eVar, String str, String str2, long j, long j2) {
        this.f24199a = eVar;
        this.f24200b = str;
        this.f24201c = str2;
        this.f24202d = j;
        this.f24203e = j2;
    }

    public String toString() {
        return "BillingInfo{type=" + this.f24199a + "sku='" + this.f24200b + "'purchaseToken='" + this.f24201c + "'purchaseTime=" + this.f24202d + "sendTime=" + this.f24203e + "}";
    }
}
