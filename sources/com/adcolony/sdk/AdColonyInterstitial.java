package com.adcolony.sdk;

import android.content.Context;
import android.content.Intent;
import com.adcolony.sdk.C0580a0;
import com.tapjoy.TapjoyConstants;

public class AdColonyInterstitial {
    public static final int ADCOLONY_IAP_ENGAGEMENT_END_CARD = 0;
    public static final int ADCOLONY_IAP_ENGAGEMENT_OVERLAY = 1;

    /* renamed from: a */
    private AdColonyInterstitialListener f128a;

    /* renamed from: b */
    private C0576c f129b;

    /* renamed from: c */
    private C0589c f130c;

    /* renamed from: d */
    private AdColonyAdOptions f131d;

    /* renamed from: e */
    private C0742k0 f132e;

    /* renamed from: f */
    private int f133f;

    /* renamed from: g */
    private String f134g;

    /* renamed from: h */
    private String f135h;

    /* renamed from: i */
    private String f136i;

    /* renamed from: j */
    private final String f137j;

    /* renamed from: k */
    private String f138k;

    /* renamed from: l */
    private String f139l;

    /* renamed from: m */
    private boolean f140m;

    /* renamed from: n */
    private C0577d f141n = C0577d.REQUESTED;

    /* renamed from: o */
    private boolean f142o;

    /* renamed from: p */
    private String f143p;

    /* renamed from: com.adcolony.sdk.AdColonyInterstitial$a */
    class C0574a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitialListener f144a;

        C0574a(AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f144a = adColonyInterstitialListener;
        }

        public void run() {
            this.f144a.onRequestNotFilled(AdColony.m31a(AdColonyInterstitial.this.getZoneID()));
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyInterstitial$b */
    class C0575b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitialListener f146a;

        C0575b(AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f146a = adColonyInterstitialListener;
        }

        public void run() {
            this.f146a.onExpiring(AdColonyInterstitial.this);
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyInterstitial$c */
    interface C0576c {
        /* renamed from: a */
        void mo9360a();
    }

    /* renamed from: com.adcolony.sdk.AdColonyInterstitial$d */
    enum C0577d {
        REQUESTED,
        FILLED,
        NOT_FILLED,
        EXPIRED,
        SHOWN,
        CLOSED
    }

    AdColonyInterstitial(String str, AdColonyInterstitialListener adColonyInterstitialListener, String str2) {
        this.f128a = adColonyInterstitialListener;
        this.f137j = str2;
        this.f134g = str;
    }

    /* renamed from: m */
    private boolean m88m() {
        String e = C0578a.m143c().mo9618v().mo9567e();
        String viewNetworkPassFilter = getViewNetworkPassFilter();
        return viewNetworkPassFilter == null || viewNetworkPassFilter.length() == 0 || viewNetworkPassFilter.equals(e) || viewNetworkPassFilter.equals(TtmlNode.COMBINE_ALL) || (viewNetworkPassFilter.equals("online") && (e.equals(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI) || e.equals("cell"))) || (viewNetworkPassFilter.equals("offline") && e.equals("none"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo9323a(AdColonyZone adColonyZone) {
        if (adColonyZone != null) {
            if (adColonyZone.getPlayFrequency() <= 1) {
                return false;
            }
            if (adColonyZone.mo9400a() == 0) {
                adColonyZone.mo9402b(adColonyZone.getPlayFrequency() - 1);
                return false;
            }
            adColonyZone.mo9402b(adColonyZone.mo9400a() - 1);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo9324b() {
        return this.f134g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9328c(String str) {
        this.f136i = str;
    }

    public boolean cancel() {
        if (this.f130c == null) {
            return false;
        }
        Context b = C0578a.m141b();
        if (b != null && !(b instanceof AdColonyInterstitialActivity)) {
            return false;
        }
        C0897z0 b2 = C0894y.m1151b();
        C0894y.m1148a(b2, "id", this.f130c.mo9441a());
        new C0645d0("AdSession.on_request_close", this.f130c.mo9469k(), b2).mo9536d();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0589c mo9330d() {
        return this.f130c;
    }

    public boolean destroy() {
        C0578a.m143c().mo9597d().mo9509f().remove(this.f134g);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo9333e() {
        String str = this.f136i;
        return str == null ? "" : str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C0742k0 mo9334f() {
        return this.f132e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo9335g() {
        return this.f133f;
    }

    public AdColonyInterstitialListener getListener() {
        return this.f128a;
    }

    public String getViewNetworkPassFilter() {
        return this.f143p;
    }

    public String getZoneID() {
        return this.f137j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo9339h() {
        return this.f139l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo9340i() {
        return this.f142o;
    }

    public boolean isExpired() {
        C0577d dVar = this.f141n;
        return dVar == C0577d.EXPIRED || dVar == C0577d.SHOWN || dVar == C0577d.CLOSED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo9342j() {
        return this.f132e != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo9343k() {
        return this.f141n == C0577d.FILLED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo9344l() {
        return this.f140m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo9345n() {
        return this.f141n == C0577d.REQUESTED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo9346o() {
        return this.f141n == C0577d.SHOWN;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo9347p() {
        Context b = C0578a.m141b();
        if (b == null || !C0578a.m145e()) {
            return false;
        }
        C0578a.m143c().mo9601e(true);
        C0578a.m143c().mo9590a(this.f130c);
        C0578a.m143c().mo9588a(this);
        C0849u0.m912a(new Intent(b, AdColonyInterstitialActivity.class));
        this.f141n = C0577d.SHOWN;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo9348q() {
        C0576c cVar;
        synchronized (this) {
            mo9354t();
            cVar = this.f129b;
            if (cVar != null) {
                this.f129b = null;
            } else {
                cVar = null;
            }
        }
        if (cVar != null) {
            cVar.mo9360a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo9349r() {
        mo9355u();
        AdColonyInterstitialListener adColonyInterstitialListener = this.f128a;
        if (adColonyInterstitialListener == null) {
            return false;
        }
        C0849u0.m931b((Runnable) new C0575b(adColonyInterstitialListener));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo9350s() {
        mo9357w();
        AdColonyInterstitialListener adColonyInterstitialListener = this.f128a;
        if (adColonyInterstitialListener == null) {
            return false;
        }
        C0849u0.m931b((Runnable) new C0574a(adColonyInterstitialListener));
        return true;
    }

    public void setListener(AdColonyInterstitialListener adColonyInterstitialListener) {
        this.f128a = adColonyInterstitialListener;
    }

    public void setViewNetworkPassFilter(String str) {
        this.f143p = str;
    }

    public boolean show() {
        boolean z = false;
        if (!C0578a.m145e()) {
            return false;
        }
        C0693i c = C0578a.m143c();
        C0897z0 b = C0894y.m1151b();
        C0894y.m1148a(b, "zone_id", this.f137j);
        C0894y.m1156b(b, "type", 0);
        C0894y.m1148a(b, "id", this.f134g);
        C0577d dVar = this.f141n;
        if (dVar == C0577d.SHOWN) {
            C0894y.m1156b(b, "request_fail_reason", 24);
            new C0580a0.C0581a().mo9419a("This ad object has already been shown. Please request a new ad ").mo9419a("via AdColony.requestInterstitial.").mo9421a(C0580a0.f189g);
        } else if (dVar == C0577d.EXPIRED) {
            C0894y.m1156b(b, "request_fail_reason", 17);
            new C0580a0.C0581a().mo9419a("This ad object has expired. Please request a new ad via AdColony").mo9419a(".requestInterstitial.").mo9421a(C0580a0.f189g);
        } else if (c.mo9580L()) {
            C0894y.m1156b(b, "request_fail_reason", 23);
            new C0580a0.C0581a().mo9419a("Can not show ad while an interstitial is already active.").mo9421a(C0580a0.f189g);
        } else if (mo9323a(c.mo9574F().get(this.f137j))) {
            C0894y.m1156b(b, "request_fail_reason", 11);
        } else if (!m88m()) {
            C0894y.m1156b(b, "request_fail_reason", 9);
            new C0580a0.C0581a().mo9419a("Tried to show interstitial ad during unacceptable network conditions.").mo9421a(C0580a0.f189g);
        } else {
            z = true;
        }
        AdColonyAdOptions adColonyAdOptions = this.f131d;
        if (adColonyAdOptions != null) {
            C0894y.m1158b(b, "pre_popup", adColonyAdOptions.f84a);
            C0894y.m1158b(b, "post_popup", this.f131d.f85b);
        }
        AdColonyZone adColonyZone = c.mo9574F().get(this.f137j);
        if (adColonyZone != null && adColonyZone.isRewarded() && c.mo9622z() == null) {
            new C0580a0.C0581a().mo9419a("Rewarded ad: show() called with no reward listener set.").mo9421a(C0580a0.f189g);
        }
        new C0645d0("AdSession.launch_ad_unit", 1, b).mo9536d();
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo9354t() {
        this.f141n = C0577d.CLOSED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo9355u() {
        this.f141n = C0577d.EXPIRED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo9356v() {
        this.f141n = C0577d.FILLED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo9357w() {
        this.f141n = C0577d.NOT_FILLED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9325b(String str) {
        this.f138k = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo9327c() {
        return this.f138k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9331d(String str) {
        this.f139l = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9326b(boolean z) {
        this.f142o = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9318a(C0576c cVar) {
        boolean z;
        synchronized (this) {
            if (this.f141n == C0577d.CLOSED) {
                z = true;
            } else {
                this.f129b = cVar;
                z = false;
            }
        }
        if (z) {
            cVar.mo9360a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9320a(C0897z0 z0Var) {
        if (z0Var.mo10070c() > 0) {
            this.f132e = new C0742k0(z0Var, this.f134g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9319a(C0589c cVar) {
        this.f130c = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9317a(AdColonyAdOptions adColonyAdOptions) {
        this.f131d = adColonyAdOptions;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9316a(int i) {
        this.f133f = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo9315a() {
        String str = this.f135h;
        return str == null ? "" : str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9321a(String str) {
        this.f135h = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9322a(boolean z) {
        this.f140m = z;
    }
}
