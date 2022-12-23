package com.applovin.impl.mediation.p021c;

import android.app.Activity;
import com.applovin.impl.mediation.p020b.C1223a;
import com.applovin.impl.mediation.p020b.C1224b;
import com.applovin.impl.mediation.p020b.C1225c;
import com.applovin.impl.mediation.p020b.C1226d;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1522j;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxErrorCodes;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.e */
public class C1245e extends C1392a {

    /* renamed from: a */
    private final String f2410a;

    /* renamed from: c */
    private final JSONObject f2411c;

    /* renamed from: d */
    private final JSONObject f2412d;

    /* renamed from: e */
    private final MaxAdListener f2413e;

    /* renamed from: f */
    private final WeakReference<Activity> f2414f;

    C1245e(String str, JSONObject jSONObject, JSONObject jSONObject2, C1469j jVar, Activity activity, MaxAdListener maxAdListener) {
        super("TaskLoadAdapterAd " + str, jVar);
        this.f2410a = str;
        this.f2411c = jSONObject;
        this.f2412d = jSONObject2;
        this.f2414f = new WeakReference<>(activity);
        this.f2413e = maxAdListener;
    }

    /* renamed from: a */
    private void m2179a() {
        this.f3279b.mo13142y().loadThirdPartyMediatedAd(this.f2410a, m2181c(), m2180b(), this.f2413e);
    }

    /* renamed from: b */
    private Activity m2180b() {
        Activity activity = (Activity) this.f2414f.get();
        return activity != null ? activity : this.f3279b.mo13110ag();
    }

    /* renamed from: c */
    private C1223a m2181c() {
        String b = C1521i.m3487b(this.f2412d, "ad_format", (String) null, this.f3279b);
        MaxAdFormat c = C1557r.m3624c(b);
        if (c == MaxAdFormat.BANNER || c == MaxAdFormat.MREC || c == MaxAdFormat.LEADER) {
            return new C1224b(this.f2411c, this.f2412d, this.f3279b);
        }
        if (c == MaxAdFormat.NATIVE) {
            return new C1226d(this.f2411c, this.f2412d, this.f3279b);
        }
        if (c == MaxAdFormat.INTERSTITIAL || c == MaxAdFormat.REWARDED) {
            return new C1225c(this.f2411c, this.f2412d, this.f3279b);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + b);
    }

    public void run() {
        if (((Boolean) this.f3279b.mo13088a(C1369c.f3091eY)).booleanValue()) {
            try {
                m2179a();
            } catch (Throwable th) {
                mo12945a("Unable to process adapter ad", th);
                C1522j.m3503a(this.f2413e, this.f2410a, (int) MaxErrorCodes.MEDIATION_ADAPTER_LOAD_FAILED);
            }
        } else {
            m2179a();
        }
    }
}
