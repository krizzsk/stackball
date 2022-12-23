package com.chartboost.sdk.Model;

import android.content.Context;
import android.os.Build;
import com.appsflyer.ServerParameters;
import com.chartboost.sdk.C2026k;
import com.chartboost.sdk.Libraries.C1823d;
import com.chartboost.sdk.Libraries.C1825e;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.C1842g;
import com.chartboost.sdk.Networking.C1848a;
import com.chartboost.sdk.Privacy.model.DataUseConsent;
import com.chartboost.sdk.impl.C1935i1;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.p243my.tracker.ads.AdFormat;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.model.Cookie;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.Model.f */
public class C1841f {

    /* renamed from: j */
    private static final String f4479j = "f";

    /* renamed from: k */
    private static Integer f4480k;

    /* renamed from: l */
    private static final String f4481l = Build.VERSION.RELEASE;

    /* renamed from: a */
    private final JSONObject f4482a = new JSONObject();

    /* renamed from: b */
    private final JSONObject f4483b = new JSONObject();

    /* renamed from: c */
    private final JSONArray f4484c = new JSONArray();

    /* renamed from: d */
    private final JSONObject f4485d = new JSONObject();

    /* renamed from: e */
    private final JSONObject f4486e = new JSONObject();

    /* renamed from: f */
    private final JSONObject f4487f = new JSONObject();

    /* renamed from: g */
    private final C1842g f4488g;

    /* renamed from: h */
    private final C1848a f4489h;

    /* renamed from: i */
    private final Context f4490i;

    public C1841f(Context context, C1842g gVar, C1848a aVar) {
        this.f4490i = context;
        f4480k = C1935i1.m4636b(context);
        this.f4488g = gVar;
        this.f4489h = aVar;
        m4132l();
        m4129i();
        m4130j();
        m4128h();
        m4131k();
        m4133m();
    }

    /* renamed from: a */
    private JSONObject m4122a() {
        JSONObject jSONObject = new JSONObject();
        C1825e.m4026a(jSONObject, ServerParameters.LAT_KEY, JSONObject.NULL);
        C1825e.m4026a(jSONObject, ServerParameters.LON_KEY, JSONObject.NULL);
        C1825e.m4026a(jSONObject, "country", this.f4488g.f4497g);
        C1825e.m4026a(jSONObject, "type", 2);
        return jSONObject;
    }

    /* renamed from: b */
    private int m4123b() {
        C1842g gVar = this.f4488g;
        if (gVar != null) {
            return gVar.mo14310f();
        }
        return 0;
    }

    /* renamed from: c */
    private Collection<DataUseConsent> m4124c() {
        C1842g gVar = this.f4488g;
        if (gVar != null) {
            return gVar.mo14315k();
        }
        return new ArrayList();
    }

    /* renamed from: d */
    private int m4125d() {
        C1842g gVar = this.f4488g;
        if (gVar != null) {
            return gVar.mo14311g();
        }
        return 0;
    }

    /* renamed from: f */
    private String m4126f() {
        int i = this.f4489h.f4554a;
        if (i == 0) {
            CBLogging.m3993b(f4479j, "INTERSTITIAL NOT COMPATIBLE WITH OPENRTB");
            return "interstitial";
        } else if (i == 1) {
            CBLogging.m3993b(f4479j, "REWARDED_VIDEO NOT COMPATIBLE WITH OPENRTB");
            return "rewarded";
        } else if (i != 2) {
            return i != 3 ? "" : AdFormat.BANNER;
        } else {
            CBLogging.m3993b(f4479j, "IN_PLAY NOT COMPATIBLE WITH OPENRTB");
            return "";
        }
    }

    /* renamed from: g */
    private Integer m4127g() {
        int i = this.f4489h.f4554a;
        if (i == 0 || i == 1) {
            return 1;
        }
        return 0;
    }

    /* renamed from: h */
    private void m4128h() {
        C1825e.m4026a(this.f4485d, "id", this.f4488g.f4502l);
        C1825e.m4026a(this.f4485d, "name", JSONObject.NULL);
        C1825e.m4026a(this.f4485d, TJAdUnitConstants.String.BUNDLE, this.f4488g.f4500j);
        C1825e.m4026a(this.f4485d, "storeurl", JSONObject.NULL);
        JSONObject jSONObject = new JSONObject();
        C1825e.m4026a(jSONObject, "id", JSONObject.NULL);
        C1825e.m4026a(jSONObject, "name", JSONObject.NULL);
        C1825e.m4026a(this.f4485d, "publisher", jSONObject);
        C1825e.m4026a(this.f4485d, "cat", JSONObject.NULL);
        C1825e.m4026a(this.f4482a, TapjoyConstants.TJC_APP_PLACEMENT, this.f4485d);
    }

    /* renamed from: i */
    private void m4129i() {
        C1823d.C1824a c = this.f4488g.f4491a.mo14231c(this.f4490i);
        C1842g.C1843a d = this.f4488g.mo14308d();
        C1825e.m4026a(this.f4483b, "devicetype", f4480k);
        C1825e.m4026a(this.f4483b, "w", Integer.valueOf(d.f4512a));
        C1825e.m4026a(this.f4483b, "h", Integer.valueOf(d.f4513b));
        C1825e.m4026a(this.f4483b, VungleApiClient.IFA, c.f4387d);
        C1825e.m4026a(this.f4483b, "osv", f4481l);
        C1825e.m4026a(this.f4483b, "lmt", Integer.valueOf(c.mo14232a().booleanValue() ? 1 : 0));
        C1825e.m4026a(this.f4483b, "connectiontype", Integer.valueOf(this.f4488g.f4492b.mo14339c()));
        C1825e.m4026a(this.f4483b, "os", "Android");
        C1825e.m4026a(this.f4483b, AdWebViewClient.GEO, m4122a());
        C1825e.m4026a(this.f4483b, "ip", JSONObject.NULL);
        C1825e.m4026a(this.f4483b, "language", this.f4488g.f4498h);
        C1825e.m4026a(this.f4483b, "ua", C2026k.f5260q);
        C1825e.m4026a(this.f4483b, ServerParameters.MODEL, this.f4488g.f4495e);
        C1825e.m4026a(this.f4483b, ServerParameters.CARRIER, this.f4488g.f4506p);
        C1825e.m4026a(this.f4482a, "device", this.f4483b);
    }

    /* renamed from: j */
    private void m4130j() {
        JSONObject jSONObject = new JSONObject();
        C1825e.m4026a(jSONObject, "id", JSONObject.NULL);
        JSONObject jSONObject2 = new JSONObject();
        C1825e.m4026a(jSONObject2, "w", this.f4489h.f4556c);
        C1825e.m4026a(jSONObject2, "h", this.f4489h.f4555b);
        C1825e.m4026a(jSONObject2, "btype", JSONObject.NULL);
        C1825e.m4026a(jSONObject2, "battr", JSONObject.NULL);
        C1825e.m4026a(jSONObject2, "pos", JSONObject.NULL);
        C1825e.m4026a(jSONObject2, "topframe", JSONObject.NULL);
        C1825e.m4026a(jSONObject2, "api", JSONObject.NULL);
        JSONObject jSONObject3 = new JSONObject();
        C1825e.m4026a(jSONObject3, "placementtype", m4126f());
        C1825e.m4026a(jSONObject3, "playableonly", JSONObject.NULL);
        C1825e.m4026a(jSONObject3, "allowscustomclosebutton", JSONObject.NULL);
        C1825e.m4026a(jSONObject2, "ext", jSONObject3);
        C1825e.m4026a(jSONObject, AdFormat.BANNER, jSONObject2);
        C1825e.m4026a(jSONObject, "instl", m4127g());
        C1825e.m4026a(jSONObject, "tagid", this.f4489h.f4557d);
        C1825e.m4026a(jSONObject, "displaymanager", "Chartboost-Android-SDK");
        C1825e.m4026a(jSONObject, "displaymanagerver", this.f4488g.f4501k);
        C1825e.m4026a(jSONObject, "bidfloor", JSONObject.NULL);
        C1825e.m4026a(jSONObject, "bidfloorcur", "USD");
        C1825e.m4026a(jSONObject, "secure", 1);
        this.f4484c.put(jSONObject);
        C1825e.m4026a(this.f4482a, "imp", this.f4484c);
    }

    /* renamed from: k */
    private void m4131k() {
        C1825e.m4026a(this.f4486e, Cookie.COPPA_KEY, 0);
        JSONObject jSONObject = new JSONObject();
        C1825e.m4026a(jSONObject, "gdpr", Integer.valueOf(m4125d()));
        for (DataUseConsent next : m4124c()) {
            C1825e.m4026a(jSONObject, next.getPrivacyStandard(), next.getConsent());
        }
        C1825e.m4026a(this.f4486e, "ext", jSONObject);
        C1825e.m4026a(this.f4482a, "regs", this.f4486e);
    }

    /* renamed from: l */
    private void m4132l() {
        C1825e.m4026a(this.f4482a, "id", JSONObject.NULL);
        C1825e.m4026a(this.f4482a, "test", JSONObject.NULL);
        C1825e.m4026a(this.f4482a, BidResponsed.KEY_CUR, new JSONArray().put("USD"));
        C1825e.m4026a(this.f4482a, "at", 2);
    }

    /* renamed from: m */
    private void m4133m() {
        C1825e.m4026a(this.f4487f, "id", JSONObject.NULL);
        C1825e.m4026a(this.f4487f, AdWebViewClient.GEO, m4122a());
        JSONObject jSONObject = new JSONObject();
        C1825e.m4026a(jSONObject, "consent", Integer.valueOf(m4123b()));
        C1825e.m4026a(jSONObject, "impdepth", Integer.valueOf(this.f4489h.f4558e));
        C1825e.m4026a(this.f4487f, "ext", jSONObject);
        C1825e.m4026a(this.f4482a, "user", this.f4487f);
    }

    /* renamed from: e */
    public JSONObject mo14303e() {
        return this.f4482a;
    }
}
