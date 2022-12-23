package com.ironsource.sdk.p150g;

/* renamed from: com.ironsource.sdk.g.a */
public final class C6004a extends C6015f {

    /* renamed from: e */
    private static String f14710e = "type";

    /* renamed from: f */
    private static String f14711f = "numOfAdUnits";

    /* renamed from: g */
    private static String f14712g = "firstCampaignCredits";

    /* renamed from: h */
    private static String f14713h = "totalNumberCredits";

    /* renamed from: i */
    private static String f14714i = "productType";

    /* renamed from: a */
    public String f14715a;

    /* renamed from: b */
    public String f14716b;

    /* renamed from: c */
    public boolean f14717c;

    /* renamed from: j */
    private String f14718j;

    /* renamed from: k */
    private String f14719k;

    /* renamed from: l */
    private String f14720l;

    public C6004a(String str) {
        super(str);
        boolean z;
        if (mo42561a(f14710e)) {
            this.f14718j = mo42564d(f14710e);
        }
        if (mo42561a(f14711f)) {
            this.f14716b = mo42564d(f14711f);
            z = true;
        } else {
            z = false;
        }
        this.f14717c = z;
        if (mo42561a(f14712g)) {
            this.f14719k = mo42564d(f14712g);
        }
        if (mo42561a(f14713h)) {
            this.f14720l = mo42564d(f14713h);
        }
        if (mo42561a(f14714i)) {
            this.f14715a = mo42564d(f14714i);
        }
    }
}
