package com.applovin.impl.mediation.p021c;

import android.app.Activity;
import com.applovin.impl.mediation.p022d.C1253a;
import com.applovin.impl.mediation.p022d.C1255c;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p026c.C1387g;
import com.applovin.impl.sdk.p026c.C1388h;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.utils.C1515d;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1522j;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.f */
public class C1246f extends C1392a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f2415a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final MaxAdFormat f2416c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final JSONObject f2417d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final MaxAdListener f2418e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final WeakReference<Activity> f2419f;

    /* renamed from: com.applovin.impl.mediation.c.f$a */
    private class C1248a extends C1392a {

        /* renamed from: c */
        private final JSONArray f2422c;

        /* renamed from: d */
        private final int f2423d;

        C1248a(int i, JSONArray jSONArray) {
            super("TaskProcessNextWaterfallAd", C1246f.this.f3279b);
            if (i < 0 || i >= jSONArray.length()) {
                throw new IllegalArgumentException("Invalid ad index specified: " + i);
            }
            this.f2422c = jSONArray;
            this.f2423d = i;
        }

        /* renamed from: a */
        private String m2194a(int i) {
            return (i < 0 || i >= this.f2422c.length()) ? "undefined" : C1521i.m3487b(C1521i.m3474a(this.f2422c, i, new JSONObject(), this.f3279b), "type", "undefined", this.f3279b);
        }

        /* renamed from: a */
        private void m2195a() {
            JSONObject a = C1521i.m3474a(this.f2422c, this.f2423d, (JSONObject) null, this.f3279b);
            m2194a(this.f2423d);
            mo12944a("Starting task for adapter ad...");
            m2199e("started to load ad");
            this.f3279b.mo13071K().mo13013a((C1392a) new C1245e(C1246f.this.f2415a, a, C1246f.this.f2417d, this.f3279b, (Activity) C1246f.this.f2419f.get(), new C1253a(C1246f.this.f2418e, this.f3279b) {
                public void onAdLoadFailed(String str, int i) {
                    C1248a aVar = C1248a.this;
                    aVar.m2199e("failed to load ad: " + i);
                    C1248a.this.m2198b();
                }

                public void onAdLoaded(MaxAd maxAd) {
                    C1248a.this.m2199e("loaded ad");
                    C1246f.this.m2187a(maxAd);
                }
            }));
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m2198b() {
            if (this.f2423d < this.f2422c.length() - 1) {
                mo12946b("Attempting to load next ad (" + this.f2423d + ") after failure...");
                this.f3279b.mo13071K().mo13014a((C1392a) new C1248a(this.f2423d + 1, this.f2422c), C1255c.m2220a(C1246f.this.f2416c));
                return;
            }
            C1246f.this.m2183a();
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public void m2199e(String str) {
        }

        public void run() {
            if (((Boolean) this.f3279b.mo13088a(C1369c.f3090eX)).booleanValue()) {
                try {
                    m2195a();
                } catch (Throwable th) {
                    mo12945a("Encountered error while processing ad number " + this.f2423d, th);
                    C1246f.this.m2183a();
                }
            } else {
                m2195a();
            }
        }
    }

    C1246f(String str, MaxAdFormat maxAdFormat, JSONObject jSONObject, Activity activity, C1469j jVar, MaxAdListener maxAdListener) {
        super("TaskProcessMediationWaterfall " + str, jVar);
        this.f2415a = str;
        this.f2416c = maxAdFormat;
        this.f2417d = jSONObject;
        this.f2418e = maxAdListener;
        this.f2419f = new WeakReference<>(activity);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2183a() {
        m2184a((int) MaxErrorCodes.MEDIATION_ADAPTER_LOAD_FAILED);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2184a(int i) {
        C1388h L;
        C1387g gVar;
        if (i == 204) {
            L = this.f3279b.mo13072L();
            gVar = C1387g.f3264q;
        } else if (i == -5001) {
            L = this.f3279b.mo13072L();
            gVar = C1387g.f3265r;
        } else {
            L = this.f3279b.mo13072L();
            gVar = C1387g.f3266s;
        }
        L.mo12926a(gVar);
        mo12946b("Notifying parent of ad load failure for ad unit " + this.f2415a + ": " + i);
        C1522j.m3503a(this.f2418e, this.f2415a, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2187a(MaxAd maxAd) {
        mo12946b("Notifying parent of ad load success for ad unit " + this.f2415a);
        C1522j.m3500a(this.f2418e, maxAd);
    }

    public void run() {
        JSONArray optJSONArray = this.f2417d.optJSONArray(CampaignUnit.JSON_KEY_ADS);
        int length = optJSONArray != null ? optJSONArray.length() : 0;
        if (length > 0) {
            mo12944a("Loading the first out of " + length + " ads...");
            this.f3279b.mo13071K().mo13013a((C1392a) new C1248a(0, optJSONArray));
            return;
        }
        mo12947c("No ads were returned from the server");
        C1557r.m3603a(this.f2415a, this.f2417d, this.f3279b);
        JSONObject b = C1521i.m3492b(this.f2417d, "settings", new JSONObject(), this.f3279b);
        long a = C1521i.m3461a(b, "alfdcs", 0, this.f3279b);
        if (a > 0) {
            long millis = TimeUnit.SECONDS.toMillis(a);
            C12471 r4 = new Runnable() {
                public void run() {
                    C1246f.this.m2184a(204);
                }
            };
            if (C1521i.m3463a(b, "alfdcs_iba", (Boolean) false, this.f3279b).booleanValue()) {
                C1515d.m3417a(millis, this.f3279b, r4);
            } else {
                AppLovinSdkUtils.runOnUiThreadDelayed(r4, millis);
            }
        } else {
            m2184a(204);
        }
    }
}
