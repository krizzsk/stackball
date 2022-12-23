package com.applovin.impl.mediation.p012a.p013a;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.utils.C1514c;
import com.applovin.impl.sdk.utils.C1520h;
import com.applovin.impl.sdk.utils.C1521i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.a.e */
public class C1178e {

    /* renamed from: a */
    private final boolean f2237a;

    /* renamed from: b */
    private final boolean f2238b;

    /* renamed from: c */
    private final boolean f2239c;

    /* renamed from: d */
    private final String f2240d;

    public C1178e(JSONObject jSONObject, C1469j jVar) {
        this.f2237a = C1514c.m3412a(jVar.mo13065D()).mo13303a();
        JSONObject b = C1521i.m3492b(jSONObject, "cleartext_traffic", (JSONObject) null, jVar);
        boolean z = false;
        if (b != null) {
            this.f2238b = true;
            this.f2240d = C1521i.m3487b(b, "description", "", jVar);
            if (C1520h.m3443a()) {
                this.f2239c = true;
                return;
            }
            List a = C1521i.m3467a(b, "domains", (List) new ArrayList(), jVar);
            if (a.size() > 0) {
                Iterator it = a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!C1520h.m3446a((String) it.next())) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
            }
            this.f2239c = z;
            return;
        }
        this.f2238b = false;
        this.f2240d = "";
        this.f2239c = C1520h.m3443a();
    }

    /* renamed from: a */
    public boolean mo12185a() {
        return this.f2238b;
    }

    /* renamed from: b */
    public boolean mo12186b() {
        return this.f2239c;
    }

    /* renamed from: c */
    public String mo12187c() {
        return this.f2237a ? this.f2240d : "You must include an entry in your AndroidManifest.xml to point to your network_security_config.xml.\n\nFor more information, visit: https://developer.android.com/training/articles/security-config";
    }
}
