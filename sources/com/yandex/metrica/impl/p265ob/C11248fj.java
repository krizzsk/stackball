package com.yandex.metrica.impl.p265ob;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.tapjoy.TJAdUnitConstants;
import com.yandex.metrica.impl.p265ob.C11428kg;
import com.yandex.metrica.impl.p265ob.C11993ym;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.fj */
public class C11248fj {

    /* renamed from: a */
    private final C11277ga f26916a;

    public C11248fj() {
        this(new C11277ga());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo62911a(C11885vj vjVar, C11993ym.C11994a aVar) {
        JSONArray optJSONArray;
        JSONObject optJSONObject = aVar.optJSONObject("diagnostics");
        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("functionalities")) != null) {
            C10880Wa wa = null;
            C10880Wa wa2 = null;
            C10880Wa wa3 = null;
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = optJSONArray.getJSONObject(i);
                    String string = jSONObject.getString(ViewHierarchyConstants.TAG_KEY);
                    C11277ga gaVar = this.f26916a;
                    C11428kg.C11435e eVar = new C11428kg.C11435e();
                    eVar.f27458b = jSONObject.getLong("expiration_timestamp");
                    eVar.f27459c = jSONObject.optInt(TJAdUnitConstants.String.INTERVAL, eVar.f27459c);
                    C10880Wa a = gaVar.mo62957a(eVar);
                    if ("activation".equals(string)) {
                        wa = a;
                    } else if ("clids_info".equals(string)) {
                        wa2 = a;
                    } else if ("preload_info".equals(string)) {
                        wa3 = a;
                    }
                } catch (Throwable unused) {
                }
            }
            vjVar.mo63936a(new C10921Xa(wa, wa2, wa3));
        }
    }

    C11248fj(C11277ga gaVar) {
        this.f26916a = gaVar;
    }
}
