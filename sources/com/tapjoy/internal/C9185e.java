package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.e */
public final class C9185e {

    /* renamed from: a */
    public String f22572a;

    /* renamed from: b */
    public String f22573b;

    /* renamed from: c */
    public String f22574c;

    /* renamed from: d */
    public String f22575d;

    /* renamed from: e */
    public String f22576e;

    /* renamed from: f */
    public String f22577f;

    /* renamed from: g */
    public long f22578g;

    public C9185e(String str) {
        C9101bn b = C9101bn.m24359b(str);
        b.mo57868h();
        while (b.mo57870j()) {
            String l = b.mo57872l();
            if ("productId".equals(l)) {
                this.f22572a = b.mo57873m();
            } else if ("type".equals(l)) {
                this.f22573b = b.mo57873m();
            } else if ("price".equals(l)) {
                this.f22574c = b.mo57873m();
            } else if ("title".equals(l)) {
                this.f22575d = b.mo57873m();
            } else if ("description".equals(l)) {
                this.f22576e = b.mo57873m();
            } else if ("price_currency_code".equals(l)) {
                this.f22577f = b.mo57873m();
            } else if ("price_amount_micros".equals(l)) {
                this.f22578g = b.mo57877q();
            } else {
                b.mo57879s();
            }
        }
        b.mo57869i();
    }
}
