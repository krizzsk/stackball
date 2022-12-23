package com.applovin.impl.mediation.ads;

import com.applovin.impl.mediation.C1259f;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.sdk.AppLovinSdk;

/* renamed from: com.applovin.impl.mediation.ads.a */
public abstract class C1220a {

    /* renamed from: a */
    private static C1469j f2351a;
    protected final MaxAdFormat adFormat;
    protected MaxAdListener adListener = null;
    protected final String adUnitId;
    protected final C1259f.C1261a loadRequestBuilder;
    protected final C1505q logger;
    protected final C1469j sdk;
    protected final String tag;

    protected C1220a(String str, MaxAdFormat maxAdFormat, String str2, C1469j jVar) {
        this.adUnitId = str;
        this.adFormat = maxAdFormat;
        this.sdk = jVar;
        this.tag = str2;
        this.logger = jVar.mo13139v();
        this.loadRequestBuilder = new C1259f.C1261a();
    }

    public static void logApiCall(String str, String str2) {
        C1469j jVar = f2351a;
        if (jVar != null) {
            jVar.mo13139v().mo13277b(str, str2);
            return;
        }
        for (AppLovinSdk a : AppLovinSdk.m3688a()) {
            C1469j a2 = C1557r.m3585a(a);
            if (a2 != null && !a2.mo13121e()) {
                f2351a = a2;
                a2.mo13139v().mo13277b(str, str2);
            }
        }
    }

    public String getAdUnitId() {
        return this.adUnitId;
    }

    public void logApiCall(String str) {
        this.logger.mo13277b(this.tag, str);
    }

    public void setExtraParameter(String str, String str2) {
        if (str != null) {
            this.loadRequestBuilder.mo12405a(str, str2);
            return;
        }
        throw new IllegalArgumentException("No key specified");
    }

    public void setListener(MaxAdListener maxAdListener) {
        C1505q qVar = this.logger;
        String str = this.tag;
        qVar.mo13277b(str, "Setting listener: " + maxAdListener);
        this.adListener = maxAdListener;
    }
}
