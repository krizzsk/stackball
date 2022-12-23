package com.fyber.inneractive.sdk.p049h;

import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.ServerParameters;
import com.chartboost.sdk.Privacy.model.CCPA;
import com.facebook.appevents.AppEventsConstants;
import com.fyber.inneractive.sdk.config.C2786d;
import com.fyber.inneractive.sdk.config.C2788f;
import com.fyber.inneractive.sdk.config.C2796l;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.p055l.C3026c;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.C3669p;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.h.aa */
public final class C2936aa {

    /* renamed from: a */
    final InneractiveAdRequest f7061a;

    /* renamed from: b */
    final C3026c f7062b;

    /* renamed from: c */
    Map<String, String> f7063c;

    public C2936aa(InneractiveAdRequest inneractiveAdRequest, C3026c cVar) {
        this.f7061a = inneractiveAdRequest;
        this.f7062b = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map<String, String> mo18389a() {
        this.f7063c = new HashMap();
        m6563a("fromSDK", Boolean.toString(true));
        m6563a("po", C2788f.m6075c());
        String str = "1";
        m6563a("secure", (C3669p.m9149a() ^ true) || IAConfigManager.m5941l() ? str : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        m6563a("spotid", this.f7061a.getSpotId());
        String k = C2788f.m6083k();
        String str2 = null;
        if (k == null) {
            k = this.f7061a.getSelectedUnitConfig() == null ? null : this.f7061a.getSelectedUnitConfig().mo18064a();
        }
        m6563a(ServerParameters.AF_USER_ID, k);
        if (!TextUtils.isEmpty(this.f7061a.getMediationVersion())) {
            m6563a("med", String.format("%s_%s", new Object[]{this.f7061a.getMediationName(), this.f7061a.getMediationVersion()}));
        } else {
            m6563a("med", this.f7061a.getMediationName());
        }
        m6563a(InneractiveMediationDefs.GENDER_FEMALE, Integer.toString(372));
        List<Integer> b = this.f7062b.mo18508b();
        if (!b.isEmpty()) {
            m6563a("protocols", C3657l.m9120b(",", b));
        }
        List<String> c = this.f7062b.mo18509c();
        if (!c.isEmpty()) {
            m6563a("mimes", C3657l.m9109a(",", (Collection<String>) c));
        }
        List<Integer> a = this.f7062b.mo18505a();
        if (!a.isEmpty()) {
            m6563a("api", C3657l.m9120b(",", a));
        }
        m6563a(CampaignUnit.JSON_KEY_SESSION_ID, Integer.toString(this.f7061a.getUserParams().getAge()));
        InneractiveUserConfig.Gender gender = this.f7061a.getUserParams().getGender();
        if (InneractiveUserConfig.Gender.MALE.equals(gender)) {
            m6563a("g", InneractiveMediationDefs.GENDER_MALE);
        } else if (InneractiveUserConfig.Gender.FEMALE.equals(gender)) {
            m6563a("g", InneractiveMediationDefs.GENDER_FEMALE);
        }
        m6563a("zip", this.f7061a.getUserParams().getZipCode());
        m6563a(CampaignEx.JSON_KEY_AD_K, this.f7061a.getKeywords());
        m6563a("t", Long.toString(System.currentTimeMillis()));
        m6563a("v", this.f7062b.mo18504a("2.2.0"));
        Boolean h = this.f7062b.mo18514h();
        if (h != null) {
            if (!h.booleanValue()) {
                str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
            }
            m6563a("gdpr_privacy_consent", str);
        }
        String d = C2788f.m6076d();
        String str3 = C2796l.m6101b() ? "amazonId" : "aaid";
        if (TextUtils.isEmpty(d)) {
            d = C2796l.m6100a();
        }
        m6563a(str3, d);
        m6563a("dnt", Boolean.toString(C2796l.m6102c()));
        m6563a("dml", this.f7062b.mo18525s());
        int y = this.f7062b.mo18531y();
        int z = this.f7062b.mo18532z();
        if (y > 0 && z > 0) {
            m6563a("w", Integer.toString(y));
            m6563a("h", Integer.toString(z));
        }
        int A = this.f7062b.mo18503A();
        m6563a("o", A == 1 ? "p" : A == 2 ? "l" : "u");
        if (this.f7062b.mo18517k() && IAConfigManager.m5946q()) {
            m6563a("lg", this.f7062b.mo18518l() + "," + this.f7062b.mo18519m());
            m6563a("hacc", this.f7062b.mo18520n());
            m6563a("vacc", this.f7062b.mo18521o());
            m6563a("tacc", this.f7062b.mo18522p());
        }
        m6563a("ciso", this.f7062b.mo18523q());
        m6563a("os", "Android");
        m6563a("mcc", this.f7062b.mo18527u());
        m6563a("mnc", this.f7062b.mo18526t());
        m6563a("nt", this.f7062b.mo18524r());
        m6563a("crn", this.f7062b.mo18528v());
        m6563a("lng", this.f7062b.mo18529w());
        List<String> x = this.f7062b.mo18530x();
        if (x != null && !x.isEmpty()) {
            m6563a("in_lng", C3657l.m9109a(",", (Collection<String>) x));
        }
        m6563a(BidResponsed.KEY_BID_ID, this.f7062b.mo18510d());
        m6563a("appv", this.f7062b.mo18511e());
        m6563a("gdpr_consent_data", C3657l.m9125p() == null ? null : IAConfigManager.m5936g().f6575b);
        C2786d g = IAConfigManager.m5936g();
        if (C3657l.m9125p() != null) {
            str2 = g.f6578e;
        }
        m6563a(CCPA.CCPA_STANDARD, str2);
        m6563a("mute_video", Boolean.toString(this.f7061a.getMuteVideo()));
        m6563a("osv", Build.VERSION.RELEASE);
        HashMap hashMap = new HashMap();
        this.f7062b.mo18506a(hashMap, this.f7061a.getSpotId());
        for (Map.Entry entry : hashMap.entrySet()) {
            m6563a((String) entry.getKey(), (String) entry.getValue());
        }
        return this.f7063c;
    }

    /* renamed from: a */
    private void m6563a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f7063c.put(str, str2);
        }
    }
}
