package com.chartboost.sdk.Tracking;

/* renamed from: com.chartboost.sdk.Tracking.h */
public class C1877h {

    /* renamed from: a */
    private String f4671a;

    /* renamed from: b */
    private String f4672b;

    /* renamed from: c */
    private String f4673c;

    /* renamed from: d */
    private String f4674d;

    /* renamed from: e */
    private String f4675e;

    public C1877h(String str, String str2, String str3, String str4, String str5) {
        this.f4671a = str;
        this.f4672b = str2;
        this.f4673c = str3;
        this.f4674d = str4;
        this.f4675e = str5;
    }

    /* renamed from: a */
    public String mo14452a() {
        return this.f4674d;
    }

    /* renamed from: b */
    public String mo14453b() {
        return this.f4673c;
    }

    /* renamed from: c */
    public String mo14454c() {
        return this.f4672b;
    }

    /* renamed from: d */
    public String mo14455d() {
        return this.f4671a;
    }

    public String toString() {
        String str = this.f4673c;
        if (str != null && str.length() > 20) {
            str = this.f4673c.substring(0, 20);
        }
        return "TrackAd{location='" + this.f4671a + '\'' + "ad_type='" + this.f4672b + '\'' + ", ad_impression_id='" + str + '\'' + ", ad_creative_id='" + this.f4674d + '\'' + ", ad_creative_type='" + this.f4675e + '\'' + '}';
    }
}
