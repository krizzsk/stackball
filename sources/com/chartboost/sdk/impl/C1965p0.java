package com.chartboost.sdk.impl;

import com.appsflyer.ServerParameters;
import com.chartboost.sdk.C1893i;
import com.chartboost.sdk.C2026k;
import com.chartboost.sdk.Libraries.C1822c;
import com.chartboost.sdk.Libraries.C1823d;
import com.chartboost.sdk.Libraries.C1825e;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Model.C1842g;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Networking.C1851c;
import com.chartboost.sdk.Networking.C1852d;
import com.chartboost.sdk.Networking.C1853e;
import com.chartboost.sdk.Networking.C1854f;
import com.chartboost.sdk.Networking.NetworkHelper;
import com.chartboost.sdk.Networking.requests.models.MediationModel;
import com.chartboost.sdk.Tracking.C1868a;
import com.chartboost.sdk.Tracking.C1874e;
import com.google.common.net.HttpHeaders;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.p0 */
public class C1965p0 extends C1851c<JSONObject> {

    /* renamed from: j */
    private final String f5052j;

    /* renamed from: k */
    public JSONObject f5053k = new JSONObject();

    /* renamed from: l */
    public final C1966a f5054l;

    /* renamed from: m */
    public boolean f5055m = false;

    /* renamed from: n */
    protected final C1842g f5056n;

    /* renamed from: com.chartboost.sdk.impl.p0$a */
    public interface C1966a {
        /* renamed from: a */
        void mo14614a(C1965p0 p0Var, CBError cBError);

        /* renamed from: a */
        void mo14615a(C1965p0 p0Var, JSONObject jSONObject);
    }

    public C1965p0(String str, String str2, C1842g gVar, int i, C1966a aVar) {
        super("POST", NetworkHelper.m4170a(str, str2), i, (File) null);
        this.f5052j = str2;
        this.f5056n = gVar;
        this.f5054l = aVar;
    }

    /* renamed from: a */
    public void mo14749a(String str) {
    }

    /* renamed from: c */
    public void mo14752c() {
        C1842g.C1843a d = this.f5056n.mo14308d();
        mo14750a(TapjoyConstants.TJC_APP_PLACEMENT, (Object) this.f5056n.f4502l);
        mo14750a(ServerParameters.MODEL, (Object) this.f5056n.f4495e);
        mo14750a(TapjoyConstants.TJC_DEVICE_TYPE_NAME, (Object) this.f5056n.f4503m);
        mo14750a("actual_device_type", (Object) this.f5056n.f4504n);
        mo14750a("os", (Object) this.f5056n.f4496f);
        mo14750a("country", (Object) this.f5056n.f4497g);
        mo14750a("language", (Object) this.f5056n.f4498h);
        mo14750a("sdk", (Object) this.f5056n.f4501k);
        mo14750a("user_agent", (Object) C2026k.f5260q);
        mo14750a("timestamp", (Object) String.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.f5056n.f4494d.mo14254a())));
        mo14750a("session", (Object) Integer.valueOf(this.f5056n.mo14314j()));
        mo14750a("reachability", (Object) Integer.valueOf(this.f5056n.mo14306b()));
        mo14750a("is_portrait", (Object) Boolean.valueOf(this.f5056n.mo14316l()));
        mo14750a("scale", (Object) Float.valueOf(d.f4516e));
        mo14750a(TJAdUnitConstants.String.BUNDLE, (Object) this.f5056n.f4499i);
        mo14750a("bundle_id", (Object) this.f5056n.f4500j);
        mo14750a(ServerParameters.CARRIER, (Object) this.f5056n.f4505o);
        mo14750a("custom_id", (Object) C2026k.f5245b);
        MediationModel mediationModel = C2026k.f5252i;
        if (mediationModel != null) {
            mo14750a("mediation", (Object) mediationModel.getMediation());
            mo14750a("mediation_version", (Object) C2026k.f5252i.getMediationVersion());
            mo14750a(TapjoyConstants.TJC_ADAPTER_VERSION, (Object) C2026k.f5252i.getAdapterVersion());
        }
        if (C2026k.f5248e != null) {
            mo14750a("framework_version", (Object) C2026k.f5250g);
            mo14750a("wrapper_version", (Object) C2026k.f5246c);
        }
        mo14750a("rooted_device", (Object) Boolean.valueOf(this.f5056n.f4507q));
        mo14750a(TapjoyConstants.TJC_DEVICE_TIMEZONE, (Object) this.f5056n.f4508r);
        mo14750a("mobile_network", (Object) Integer.valueOf(this.f5056n.mo14304a()));
        mo14750a("dw", (Object) Integer.valueOf(d.f4512a));
        mo14750a("dh", (Object) Integer.valueOf(d.f4513b));
        mo14750a("dpi", (Object) d.f4517f);
        mo14750a("w", (Object) Integer.valueOf(d.f4514c));
        mo14750a("h", (Object) Integer.valueOf(d.f4515d));
        mo14750a("commit_hash", (Object) "47ae58346b771626762a300b4688c6bcdeb1fde2");
        C1823d.C1824a e = this.f5056n.mo14309e();
        mo14750a("identity", (Object) e.f4385b);
        int i = e.f4384a;
        if (i != -1) {
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            mo14750a("limit_ad_tracking", (Object) Boolean.valueOf(z));
        }
        mo14750a("pidatauseconsent", (Object) Integer.valueOf(C1988v0.f5103a.getValue()));
        String str = this.f5056n.f4493c.get().f4520a;
        if (!C2014x.m4911b().mo14884a((CharSequence) str)) {
            mo14750a("config_variant", (Object) str);
        }
        mo14750a("privacy", (Object) this.f5056n.mo14312h());
    }

    /* renamed from: d */
    public String mo14753d() {
        String str = "/";
        if (this.f5052j == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f5052j.startsWith(str)) {
            str = "";
        }
        sb.append(str);
        sb.append(this.f5052j);
        return sb.toString();
    }

    /* renamed from: e */
    public String mo14754e() {
        return mo14753d();
    }

    /* renamed from: a */
    public void mo14750a(String str, Object obj) {
        C1825e.m4026a(this.f5053k, str, obj);
    }

    /* renamed from: a */
    private void m4756a(C1854f fVar, CBError cBError) {
        Object obj;
        String str;
        C1825e.C1826a[] aVarArr = new C1825e.C1826a[5];
        aVarArr[0] = C1825e.m4023a("endpoint", (Object) mo14753d());
        String str2 = "None";
        if (fVar == null) {
            obj = str2;
        } else {
            obj = Integer.valueOf(fVar.f4574a);
        }
        aVarArr[1] = C1825e.m4023a("statuscode", obj);
        if (cBError == null) {
            str = str2;
        } else {
            str = cBError.getError().toString();
        }
        aVarArr[2] = C1825e.m4023a("error", (Object) str);
        if (cBError != null) {
            str2 = cBError.getErrorDesc();
        }
        aVarArr[3] = C1825e.m4023a("errorDescription", (Object) str2);
        aVarArr[4] = C1825e.m4023a("retryCount", (Object) 0);
        JSONObject a = C1825e.m4025a(aVarArr);
        CBLogging.m3991a("CBRequest", "sendToSessionLogs: " + a.toString());
    }

    /* renamed from: a */
    public C1852d mo14330a() {
        mo14752c();
        String jSONObject = this.f5053k.toString();
        String str = C2026k.f5253j;
        String str2 = C2026k.f5254k;
        String a = C1822c.m4016a(C1822c.m4017b(String.format(Locale.US, "%s %s\n%s\n%s", new Object[]{this.f4560a, mo14754e(), str2, jSONObject}).getBytes()));
        HashMap hashMap = new HashMap();
        hashMap.put(HttpHeaders.ACCEPT, WebRequest.CONTENT_TYPE_JSON);
        hashMap.put("X-Chartboost-Client", CBUtility.m4013e());
        hashMap.put("X-Chartboost-API", "8.2.1");
        hashMap.put("X-Chartboost-App", str);
        hashMap.put("X-Chartboost-Signature", a);
        if (C1893i.f4747a) {
            String b = C1893i.m4435b();
            if (b.length() > 0) {
                hashMap.put("X-Chartboost-Test", b);
            }
            String a2 = C1893i.m4433a();
            if (a2 != null) {
                hashMap.put("X-Chartboost-Test", a2);
            }
        }
        return new C1852d(hashMap, jSONObject.getBytes(), WebRequest.CONTENT_TYPE_JSON);
    }

    /* renamed from: a */
    public C1853e<JSONObject> mo14331a(C1854f fVar) {
        try {
            if (fVar.f4575b == null) {
                return C1853e.m4180a(new CBError(CBError.C1835b.INVALID_RESPONSE, "Response is not a valid json object"));
            }
            JSONObject jSONObject = new JSONObject(new String(fVar.f4575b));
            CBLogging.m3996d("CBRequest", "Request " + mo14753d() + " succeeded. Response code: " + fVar.f4574a + ", body: " + jSONObject.toString(4));
            if (this.f5055m) {
                int optInt = jSONObject.optInt("status");
                if (optInt == 404) {
                    return C1853e.m4180a(new CBError(CBError.C1835b.HTTP_NOT_FOUND, "404 error from server"));
                }
                if (optInt < 200 || optInt > 299) {
                    String str = "Request failed due to status code " + optInt + " in message";
                    CBLogging.m3993b("CBRequest", str);
                    return C1853e.m4180a(new CBError(CBError.C1835b.UNEXPECTED_RESPONSE, str));
                }
            }
            return C1853e.m4181a(jSONObject);
        } catch (Exception e) {
            C1874e.m4311e(new C1868a("response_json_serialization_error", e.getMessage(), "", ""));
            CBLogging.m3993b("CBRequest", "parseServerResponse: " + e.toString());
            return C1853e.m4180a(new CBError(CBError.C1835b.MISCELLANEOUS, e.getLocalizedMessage()));
        }
    }

    /* renamed from: a */
    public void mo14333a(JSONObject jSONObject, C1854f fVar) {
        CBLogging.m3996d("CBRequest", "Request success: " + this.f4561b + " status: " + fVar.f4574a);
        C1966a aVar = this.f5054l;
        if (!(aVar == null || jSONObject == null)) {
            aVar.mo14615a(this, jSONObject);
        }
        m4756a(fVar, (CBError) null);
    }

    /* renamed from: a */
    public void mo14332a(CBError cBError, C1854f fVar) {
        if (cBError != null) {
            CBLogging.m3996d("CBRequest", "Request failure: " + this.f4561b + " status: " + cBError.getErrorDesc());
            C1966a aVar = this.f5054l;
            if (aVar != null) {
                aVar.mo14614a(this, cBError);
            }
            m4756a(fVar, cBError);
        }
    }
}
