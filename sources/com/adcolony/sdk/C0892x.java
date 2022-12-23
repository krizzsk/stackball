package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.x */
class C0892x {

    /* renamed from: a */
    private String f1605a;

    /* renamed from: b */
    private String f1606b;

    /* renamed from: c */
    private String f1607c;

    /* renamed from: d */
    private String f1608d = "%s_%s_%s";

    public C0892x(String str, String str2, String str3) {
        this.f1605a = str;
        this.f1606b = str2;
        this.f1607c = str3;
    }

    /* renamed from: a */
    public String mo10007a() {
        return this.f1607c;
    }

    /* renamed from: b */
    public String mo10008b() {
        return String.format(this.f1608d, new Object[]{mo10009c(), mo10010d(), mo10007a()});
    }

    /* renamed from: c */
    public String mo10009c() {
        return this.f1605a;
    }

    /* renamed from: d */
    public String mo10010d() {
        return this.f1606b;
    }
}
