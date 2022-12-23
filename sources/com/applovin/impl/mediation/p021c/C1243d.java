package com.applovin.impl.mediation.p021c;

import com.applovin.impl.mediation.C1258e;
import com.applovin.impl.mediation.p020b.C1223a;
import com.applovin.impl.mediation.p020b.C1227e;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.network.C1496f;
import com.applovin.impl.sdk.network.C1499g;
import com.applovin.impl.sdk.p025b.C1368b;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.p027d.C1435s;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.mediation.c.d */
public class C1243d extends C1392a {

    /* renamed from: a */
    private final String f2403a;

    /* renamed from: c */
    private final String f2404c;

    /* renamed from: d */
    private final C1227e f2405d;

    /* renamed from: e */
    private final Map<String, String> f2406e;

    /* renamed from: f */
    private final Map<String, String> f2407f;

    /* renamed from: g */
    private final C1258e f2408g;

    public C1243d(String str, Map<String, String> map, C1258e eVar, C1227e eVar2, C1469j jVar) {
        super("TaskFireMediationPostbacks", jVar);
        this.f2403a = str;
        this.f2404c = str + "_urls";
        this.f2406e = C1557r.m3618b(map);
        this.f2408g = eVar != null ? eVar : C1258e.EMPTY;
        this.f2405d = eVar2;
        HashMap hashMap = new HashMap(6);
        hashMap.put("AppLovin-Event-Type", str);
        hashMap.put("AppLovin-Ad-Network-Name", eVar2.mo12337I());
        if (eVar2 instanceof C1223a) {
            C1223a aVar = (C1223a) eVar2;
            hashMap.put("AppLovin-Ad-Unit-Id", aVar.getAdUnitId());
            hashMap.put("AppLovin-Ad-Format", aVar.getFormat().getLabel());
        }
        if (eVar != null) {
            hashMap.put("AppLovin-Error-Code", String.valueOf(eVar.getErrorCode()));
            hashMap.put("AppLovin-Error-Message", eVar.getErrorMessage());
        }
        this.f2407f = hashMap;
    }

    /* renamed from: a */
    private C1499g m2173a(String str, C1258e eVar, Map<String, String> map) {
        return C1499g.m3280b(mo12948d()).mo13200a(m2174a(str, eVar)).mo13203a(false).mo13207b(map).mo13204a();
    }

    /* renamed from: a */
    private String m2174a(String str, C1258e eVar) {
        int i;
        String str2;
        if (eVar instanceof MaxAdapterError) {
            MaxAdapterError maxAdapterError = (MaxAdapterError) eVar;
            i = maxAdapterError.getThirdPartySdkErrorCode();
            str2 = maxAdapterError.getThirdPartySdkErrorMessage();
        } else {
            i = 0;
            str2 = "";
        }
        return str.replace("{ERROR_CODE}", String.valueOf(eVar.getErrorCode())).replace("{ERROR_MESSAGE}", C1553o.m3557e(eVar.getErrorMessage())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(i)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", C1553o.m3557e(str2));
    }

    /* renamed from: a */
    private void m2175a() {
        List<String> a = this.f2405d.mo12349a(this.f2404c, this.f2406e);
        if (!a.isEmpty()) {
            for (String a2 : a) {
                mo12948d().mo13077Q().dispatchPostbackRequest(m2173a(a2, this.f2408g, this.f2407f), C1435s.C1437a.MEDIATION_POSTBACKS, new AppLovinPostbackListener() {
                    public void onPostbackFailure(String str, int i) {
                        C1243d dVar = C1243d.this;
                        dVar.mo12949d("Failed to fire postback with code: " + i + " and url: " + str);
                    }

                    public void onPostbackSuccess(String str) {
                    }
                });
            }
        }
    }

    /* renamed from: b */
    private C1496f m2177b(String str, C1258e eVar, Map<String, String> map) {
        return C1496f.m3253l().mo13233a(m2174a(str, eVar)).mo13235a(false).mo13238b(map).mo13236a();
    }

    /* renamed from: b */
    private void m2178b() {
        List<String> a = this.f2405d.mo12349a(this.f2404c, this.f2406e);
        if (!a.isEmpty()) {
            for (String b : a) {
                mo12948d().mo13073M().mo13215a(m2177b(b, this.f2408g, this.f2407f));
            }
        }
    }

    public void run() {
        if (((Boolean) mo12948d().mo13088a(C1368b.f2831j)).booleanValue()) {
            m2178b();
        } else {
            m2175a();
        }
    }
}
