package com.applovin.impl.mediation.p012a.p013a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.mediation.p022d.C1255c;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.a.d */
public class C1176d implements AppLovinCommunicatorSubscriber, Comparable<C1176d> {

    /* renamed from: a */
    private final C1177a f2214a;

    /* renamed from: b */
    private int f2215b;

    /* renamed from: c */
    private final boolean f2216c;

    /* renamed from: d */
    private final boolean f2217d;

    /* renamed from: e */
    private final boolean f2218e;

    /* renamed from: f */
    private final boolean f2219f;

    /* renamed from: g */
    private final String f2220g;

    /* renamed from: h */
    private final String f2221h;

    /* renamed from: i */
    private final String f2222i;

    /* renamed from: j */
    private final String f2223j;

    /* renamed from: k */
    private final String f2224k;

    /* renamed from: l */
    private final String f2225l;

    /* renamed from: m */
    private final int f2226m;

    /* renamed from: n */
    private final List<MaxAdFormat> f2227n;

    /* renamed from: o */
    private final List<C1179f> f2228o;

    /* renamed from: p */
    private final List<C1172a> f2229p;

    /* renamed from: q */
    private final C1178e f2230q;

    /* renamed from: com.applovin.impl.mediation.a.a.d$a */
    public enum C1177a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");
        

        /* renamed from: e */
        private final String f2236e;

        private C1177a(String str) {
            this.f2236e = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String m1903a() {
            return this.f2236e;
        }
    }

    public C1176d(JSONObject jSONObject, C1469j jVar) {
        String str;
        String str2;
        this.f2220g = C1521i.m3487b(jSONObject, "name", "", jVar);
        this.f2221h = C1521i.m3487b(jSONObject, "display_name", "", jVar);
        this.f2222i = C1521i.m3487b(jSONObject, "adapter_class", "", jVar);
        this.f2225l = C1521i.m3487b(jSONObject, "latest_adapter_version", "", jVar);
        JSONObject b = C1521i.m3492b(jSONObject, "configuration", new JSONObject(), jVar);
        this.f2228o = m1885a(b, jVar);
        this.f2229p = m1886b(b, jVar);
        this.f2230q = new C1178e(b, jVar);
        this.f2216c = C1557r.m3631e(C1521i.m3487b(jSONObject, "existence_class", "", jVar));
        List<MaxAdFormat> emptyList = Collections.emptyList();
        MaxAdapter a = C1255c.m2221a(this.f2222i, jVar);
        if (a != null) {
            this.f2217d = true;
            try {
                str2 = a.getAdapterVersion();
                try {
                    str = a.getSdkVersion();
                } catch (Throwable th) {
                    th = th;
                    str = "";
                    C1505q.m3345i("MediatedNetwork", "Failed to load adapter for network " + this.f2220g + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                    this.f2224k = str2;
                    this.f2223j = str;
                    this.f2227n = emptyList;
                    this.f2219f = C1557r.m3631e(C1521i.m3487b(C1521i.m3492b(jSONObject, "alternative_network", (JSONObject) null, jVar), "adapter_class", "", jVar));
                    this.f2214a = m1887o();
                    this.f2218e = !str2.equals(this.f2225l);
                    Context D = jVar.mo13065D();
                    Resources resources = D.getResources();
                    this.f2226m = resources.getIdentifier("applovin_ic_mediation_" + this.f2220g.toLowerCase(), "drawable", D.getPackageName());
                    this.f2215b = MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode();
                    AppLovinCommunicator.getInstance(jVar.mo13065D()).subscribe((AppLovinCommunicatorSubscriber) this, "adapter_initialization_status");
                }
                try {
                    emptyList = m1884a(a);
                } catch (Throwable th2) {
                    th = th2;
                    C1505q.m3345i("MediatedNetwork", "Failed to load adapter for network " + this.f2220g + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                    this.f2224k = str2;
                    this.f2223j = str;
                    this.f2227n = emptyList;
                    this.f2219f = C1557r.m3631e(C1521i.m3487b(C1521i.m3492b(jSONObject, "alternative_network", (JSONObject) null, jVar), "adapter_class", "", jVar));
                    this.f2214a = m1887o();
                    this.f2218e = !str2.equals(this.f2225l);
                    Context D2 = jVar.mo13065D();
                    Resources resources2 = D2.getResources();
                    this.f2226m = resources2.getIdentifier("applovin_ic_mediation_" + this.f2220g.toLowerCase(), "drawable", D2.getPackageName());
                    this.f2215b = MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode();
                    AppLovinCommunicator.getInstance(jVar.mo13065D()).subscribe((AppLovinCommunicatorSubscriber) this, "adapter_initialization_status");
                }
            } catch (Throwable th3) {
                th = th3;
                str2 = "";
                str = str2;
                C1505q.m3345i("MediatedNetwork", "Failed to load adapter for network " + this.f2220g + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                this.f2224k = str2;
                this.f2223j = str;
                this.f2227n = emptyList;
                this.f2219f = C1557r.m3631e(C1521i.m3487b(C1521i.m3492b(jSONObject, "alternative_network", (JSONObject) null, jVar), "adapter_class", "", jVar));
                this.f2214a = m1887o();
                this.f2218e = !str2.equals(this.f2225l);
                Context D22 = jVar.mo13065D();
                Resources resources22 = D22.getResources();
                this.f2226m = resources22.getIdentifier("applovin_ic_mediation_" + this.f2220g.toLowerCase(), "drawable", D22.getPackageName());
                this.f2215b = MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode();
                AppLovinCommunicator.getInstance(jVar.mo13065D()).subscribe((AppLovinCommunicatorSubscriber) this, "adapter_initialization_status");
            }
        } else {
            this.f2217d = false;
            str2 = "";
            str = str2;
        }
        this.f2224k = str2;
        this.f2223j = str;
        this.f2227n = emptyList;
        this.f2219f = C1557r.m3631e(C1521i.m3487b(C1521i.m3492b(jSONObject, "alternative_network", (JSONObject) null, jVar), "adapter_class", "", jVar));
        this.f2214a = m1887o();
        this.f2218e = !str2.equals(this.f2225l);
        Context D222 = jVar.mo13065D();
        Resources resources222 = D222.getResources();
        this.f2226m = resources222.getIdentifier("applovin_ic_mediation_" + this.f2220g.toLowerCase(), "drawable", D222.getPackageName());
        this.f2215b = MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode();
        AppLovinCommunicator.getInstance(jVar.mo13065D()).subscribe((AppLovinCommunicatorSubscriber) this, "adapter_initialization_status");
    }

    /* renamed from: a */
    private List<MaxAdFormat> m1884a(MaxAdapter maxAdapter) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            arrayList.add(MaxAdFormat.MREC);
        }
        return arrayList;
    }

    /* renamed from: a */
    private List<C1179f> m1885a(JSONObject jSONObject, C1469j jVar) {
        ArrayList arrayList = new ArrayList();
        JSONObject b = C1521i.m3492b(jSONObject, "permissions", new JSONObject(), jVar);
        Iterator<String> keys = b.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                arrayList.add(new C1179f(next, b.getString(next), jVar.mo13065D()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private List<C1172a> m1886b(JSONObject jSONObject, C1469j jVar) {
        ArrayList arrayList = new ArrayList();
        JSONArray b = C1521i.m3491b(jSONObject, "dependencies", new JSONArray(), jVar);
        for (int i = 0; i < b.length(); i++) {
            JSONObject a = C1521i.m3474a(b, i, (JSONObject) null, jVar);
            if (a != null) {
                arrayList.add(new C1172a(a, jVar));
            }
        }
        return arrayList;
    }

    /* renamed from: o */
    private C1177a m1887o() {
        if (!this.f2216c && !this.f2217d) {
            return C1177a.MISSING;
        }
        for (C1179f c : this.f2228o) {
            if (!c.mo12190c()) {
                return C1177a.INVALID_INTEGRATION;
            }
        }
        for (C1172a c2 : this.f2229p) {
            if (!c2.mo12154c()) {
                return C1177a.INVALID_INTEGRATION;
            }
        }
        if (this.f2230q.mo12185a() && !this.f2230q.mo12186b()) {
            return C1177a.INVALID_INTEGRATION;
        }
        if (this.f2216c) {
            if (this.f2217d) {
                return C1177a.COMPLETE;
            }
            if (this.f2219f) {
                return C1177a.MISSING;
            }
        }
        return C1177a.INCOMPLETE_INTEGRATION;
    }

    /* renamed from: a */
    public int compareTo(C1176d dVar) {
        return this.f2221h.compareToIgnoreCase(dVar.f2221h);
    }

    /* renamed from: a */
    public C1177a mo12169a() {
        return this.f2214a;
    }

    /* renamed from: b */
    public int mo12170b() {
        return this.f2215b;
    }

    /* renamed from: c */
    public boolean mo12171c() {
        return this.f2216c;
    }

    /* renamed from: d */
    public boolean mo12173d() {
        return this.f2217d;
    }

    /* renamed from: e */
    public boolean mo12174e() {
        return this.f2218e;
    }

    /* renamed from: f */
    public String mo12175f() {
        return this.f2221h;
    }

    /* renamed from: g */
    public String mo12176g() {
        return this.f2223j;
    }

    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    /* renamed from: h */
    public String mo12177h() {
        return this.f2224k;
    }

    /* renamed from: i */
    public String mo12178i() {
        return this.f2225l;
    }

    /* renamed from: j */
    public int mo12179j() {
        return this.f2226m;
    }

    /* renamed from: k */
    public List<C1179f> mo12180k() {
        return this.f2228o;
    }

    /* renamed from: l */
    public List<C1172a> mo12181l() {
        return this.f2229p;
    }

    /* renamed from: m */
    public final C1178e mo12182m() {
        return this.f2230q;
    }

    /* renamed from: n */
    public final String mo12183n() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n------------------ ");
        sb.append(this.f2220g);
        sb.append(" ------------------");
        sb.append("\nStatus  - ");
        sb.append(this.f2214a.m1903a());
        sb.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb.append((!this.f2216c || TextUtils.isEmpty(this.f2223j)) ? str : this.f2223j);
        sb.append("\nAdapter - ");
        if (this.f2217d && !TextUtils.isEmpty(this.f2224k)) {
            str = this.f2224k;
        }
        sb.append(str);
        if (this.f2230q.mo12185a() && !this.f2230q.mo12186b()) {
            sb.append("\n* ");
            sb.append(this.f2230q.mo12187c());
        }
        for (C1179f next : mo12180k()) {
            if (!next.mo12190c()) {
                sb.append("\n* MISSING ");
                sb.append(next.mo12188a());
                sb.append(": ");
                sb.append(next.mo12189b());
            }
        }
        for (C1172a next2 : mo12181l()) {
            if (!next2.mo12154c()) {
                sb.append("\n* MISSING ");
                sb.append(next2.mo12152a());
                sb.append(": ");
                sb.append(next2.mo12153b());
            }
        }
        return sb.toString();
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f2222i.equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f2215b = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
        }
    }

    public String toString() {
        return "MediatedNetwork{name=" + this.f2220g + ", displayName=" + this.f2221h + ", sdkAvailable=" + this.f2216c + ", sdkVersion=" + this.f2223j + ", adapterAvailable=" + this.f2217d + ", adapterVersion=" + this.f2224k + "}";
    }
}
