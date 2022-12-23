package com.applovin.impl.mediation.p012a.p013a;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1557r;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.a.a */
public class C1172a {

    /* renamed from: a */
    private final String f2196a;

    /* renamed from: b */
    private final String f2197b;

    /* renamed from: c */
    private final boolean f2198c;

    C1172a(JSONObject jSONObject, C1469j jVar) {
        boolean z;
        this.f2196a = C1521i.m3487b(jSONObject, "name", "", jVar);
        this.f2197b = C1521i.m3487b(jSONObject, "description", "", jVar);
        List a = C1521i.m3467a(jSONObject, "existence_classes", (List) null, jVar);
        if (a != null) {
            z = false;
            Iterator it = a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C1557r.m3631e((String) it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        } else {
            z = C1557r.m3631e(C1521i.m3487b(jSONObject, "existence_class", "", jVar));
        }
        this.f2198c = z;
    }

    /* renamed from: a */
    public String mo12152a() {
        return this.f2196a;
    }

    /* renamed from: b */
    public String mo12153b() {
        return this.f2197b;
    }

    /* renamed from: c */
    public boolean mo12154c() {
        return this.f2198c;
    }
}
