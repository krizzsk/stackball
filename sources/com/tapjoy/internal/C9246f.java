package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.f */
public final class C9246f {

    /* renamed from: a */
    public String f22752a;

    /* renamed from: b */
    public String f22753b;

    /* renamed from: c */
    public String f22754c;

    /* renamed from: d */
    public long f22755d;

    /* renamed from: e */
    public int f22756e;

    /* renamed from: f */
    public String f22757f;

    /* renamed from: g */
    public String f22758g;

    public C9246f(String str) {
        C9101bn b = C9101bn.m24359b(str);
        b.mo57868h();
        while (b.mo57870j()) {
            String l = b.mo57872l();
            if ("orderId".equals(l)) {
                this.f22752a = b.mo57873m();
            } else if ("packageName".equals(l)) {
                this.f22753b = b.mo57873m();
            } else if ("productId".equals(l)) {
                this.f22754c = b.mo57873m();
            } else if ("purchaseTime".equals(l)) {
                this.f22755d = b.mo57877q();
            } else if ("purchaseState".equals(l)) {
                this.f22756e = b.mo57878r();
            } else if ("developerPayload".equals(l)) {
                this.f22757f = b.mo57873m();
            } else if ("purchaseToken".equals(l)) {
                this.f22758g = b.mo57873m();
            } else {
                b.mo57879s();
            }
        }
        b.mo57869i();
    }
}
