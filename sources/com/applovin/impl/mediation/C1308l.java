package com.applovin.impl.mediation;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;

/* renamed from: com.applovin.impl.mediation.l */
public class C1308l implements MaxAd {

    /* renamed from: a */
    private final String f2550a;

    /* renamed from: b */
    private final MaxAdFormat f2551b;

    /* renamed from: c */
    private final String f2552c;

    public C1308l(String str, MaxAdFormat maxAdFormat, String str2) {
        this.f2550a = str;
        this.f2551b = maxAdFormat;
        this.f2552c = str2;
    }

    public String getAdUnitId() {
        return this.f2550a;
    }

    public MaxAdFormat getFormat() {
        return this.f2551b;
    }

    public String getNetworkName() {
        return this.f2552c;
    }

    public String toString() {
        return "MaxAd{adUnitId=" + this.f2550a + ", format=" + this.f2551b + ", networkName=" + this.f2552c + "}";
    }
}
