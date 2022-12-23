package com.p243my.tracker.ads;

/* renamed from: com.my.tracker.ads.AdEventBuilder */
public final class AdEventBuilder {

    /* renamed from: a */
    final int f19772a;

    /* renamed from: b */
    final int f19773b;

    /* renamed from: c */
    final double f19774c;

    /* renamed from: d */
    final String f19775d;

    /* renamed from: e */
    String f19776e;

    /* renamed from: f */
    String f19777f;

    /* renamed from: g */
    String f19778g;

    /* renamed from: h */
    String f19779h;

    private AdEventBuilder(int i, int i2, double d, String str) {
        this.f19772a = i;
        this.f19773b = i2;
        this.f19774c = d;
        this.f19775d = str;
    }

    public static AdEventBuilder newClickBuilder(int i) {
        return new AdEventBuilder(18, i, Double.NaN, (String) null);
    }

    public static AdEventBuilder newImpressionBuilder(int i) {
        return new AdEventBuilder(17, i, Double.NaN, (String) null);
    }

    public static AdEventBuilder newRevenueBuilder(int i, double d, String str) {
        return new AdEventBuilder(19, i, d, str);
    }

    public AdEvent build() {
        return new AdEvent(this.f19772a, this.f19773b, this.f19774c, this.f19775d, this.f19776e, this.f19777f, this.f19778g, this.f19779h);
    }

    public AdEventBuilder withAdFormat(String str) {
        this.f19779h = str;
        return this;
    }

    public AdEventBuilder withAdId(String str) {
        this.f19778g = str;
        return this;
    }

    public AdEventBuilder withPlacementId(String str) {
        this.f19777f = str;
        return this;
    }

    public AdEventBuilder withSource(String str) {
        this.f19776e = str;
        return this;
    }
}
