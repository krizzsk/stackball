package com.applovin.impl.sdk.p024ad;

import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1469j;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.h */
public final class C1361h extends AppLovinAdBase {

    /* renamed from: a */
    private AppLovinAd f2792a;

    /* renamed from: b */
    private final C1349d f2793b;

    public C1361h(C1349d dVar, C1469j jVar) {
        super(new JSONObject(), new JSONObject(), C1346b.UNKNOWN, jVar);
        this.f2793b = dVar;
    }

    /* renamed from: c */
    private AppLovinAd m2620c() {
        return (AppLovinAd) this.sdk.mo13079S().mo12872c(this.f2793b);
    }

    /* renamed from: d */
    private String m2621d() {
        C1349d adZone = getAdZone();
        if (adZone == null || adZone.mo12724j()) {
            return null;
        }
        return adZone.mo12712a();
    }

    /* renamed from: a */
    public AppLovinAd mo12829a() {
        return this.f2792a;
    }

    /* renamed from: a */
    public void mo12830a(AppLovinAd appLovinAd) {
        this.f2792a = appLovinAd;
    }

    /* renamed from: b */
    public AppLovinAd mo12831b() {
        AppLovinAd appLovinAd = this.f2792a;
        return appLovinAd != null ? appLovinAd : m2620c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppLovinAd b = mo12831b();
        return b != null ? b.equals(obj) : super.equals(obj);
    }

    public long getAdIdNumber() {
        AppLovinAd b = mo12831b();
        if (b != null) {
            return b.getAdIdNumber();
        }
        return 0;
    }

    public C1349d getAdZone() {
        AppLovinAdBase appLovinAdBase = (AppLovinAdBase) mo12831b();
        return appLovinAdBase != null ? appLovinAdBase.getAdZone() : this.f2793b;
    }

    public long getCreatedAtMillis() {
        AppLovinAd b = mo12831b();
        if (b instanceof AppLovinAdBase) {
            return ((AppLovinAdBase) b).getCreatedAtMillis();
        }
        return 0;
    }

    public AppLovinAdSize getSize() {
        return getAdZone().mo12715c();
    }

    public C1346b getSource() {
        AppLovinAdBase appLovinAdBase = (AppLovinAdBase) mo12831b();
        return appLovinAdBase != null ? appLovinAdBase.getSource() : C1346b.UNKNOWN;
    }

    public AppLovinAdType getType() {
        return getAdZone().mo12716d();
    }

    public String getZoneId() {
        if (this.f2793b.mo12724j()) {
            return null;
        }
        return this.f2793b.mo12712a();
    }

    public int hashCode() {
        AppLovinAd b = mo12831b();
        return b != null ? b.hashCode() : super.hashCode();
    }

    public boolean isVideoAd() {
        AppLovinAd b = mo12831b();
        return b != null && b.isVideoAd();
    }

    public String toString() {
        return "AppLovinAd{ #" + getAdIdNumber() + ", adType=" + getType() + ", adSize=" + getSize() + ", zoneId='" + m2621d() + '\'' + '}';
    }
}
