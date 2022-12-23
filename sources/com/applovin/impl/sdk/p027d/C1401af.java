package com.applovin.impl.sdk.p027d;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.network.C1484a;
import com.applovin.impl.sdk.p023a.C1342c;
import com.applovin.impl.sdk.p025b.C1369c;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.d.af */
public abstract class C1401af extends C1397ac {
    protected C1401af(String str, C1469j jVar) {
        super(str, jVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m2818b(JSONObject jSONObject) {
        C1342c c = m2819c(jSONObject);
        if (c != null) {
            mo12395a(c);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r3 = java.util.Collections.emptyMap();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001b */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.applovin.impl.sdk.p023a.C1342c m2819c(org.json.JSONObject r3) {
        /*
            r2 = this;
            org.json.JSONObject r0 = com.applovin.impl.sdk.utils.C1520h.m3440a((org.json.JSONObject) r3)     // Catch:{ JSONException -> 0x002d }
            com.applovin.impl.sdk.j r1 = r2.f3279b     // Catch:{ JSONException -> 0x002d }
            com.applovin.impl.sdk.utils.C1520h.m3450d(r0, r1)     // Catch:{ JSONException -> 0x002d }
            com.applovin.impl.sdk.j r1 = r2.f3279b     // Catch:{ JSONException -> 0x002d }
            com.applovin.impl.sdk.utils.C1520h.m3449c(r3, r1)     // Catch:{ JSONException -> 0x002d }
            java.lang.String r3 = "params"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x001b }
            org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch:{ all -> 0x001b }
            java.util.Map r3 = com.applovin.impl.sdk.utils.C1521i.m3470a((org.json.JSONObject) r3)     // Catch:{ all -> 0x001b }
            goto L_0x001f
        L_0x001b:
            java.util.Map r3 = java.util.Collections.emptyMap()     // Catch:{ JSONException -> 0x002d }
        L_0x001f:
            java.lang.String r1 = "result"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ all -> 0x0026 }
            goto L_0x0028
        L_0x0026:
            java.lang.String r0 = "network_timeout"
        L_0x0028:
            com.applovin.impl.sdk.a.c r3 = com.applovin.impl.sdk.p023a.C1342c.m2404a(r0, r3)     // Catch:{ JSONException -> 0x002d }
            return r3
        L_0x002d:
            r3 = move-exception
            java.lang.String r0 = "Unable to parse API response"
            r2.mo12945a(r0, r3)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p027d.C1401af.m2819c(org.json.JSONObject):com.applovin.impl.sdk.a.c");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12395a(C1342c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo12396b();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo12953h() {
        return ((Integer) this.f3279b.mo13088a(C1369c.f2921bK)).intValue();
    }

    public void run() {
        mo12958a(mo12959i(), new C1484a.C1487c<JSONObject>() {
            /* renamed from: a */
            public void mo12144a(int i) {
                if (!C1401af.this.mo12396b()) {
                    C1401af.this.mo12390a(i);
                }
            }

            /* renamed from: a */
            public void mo12145a(JSONObject jSONObject, int i) {
                if (!C1401af.this.mo12396b()) {
                    C1401af.this.m2818b(jSONObject);
                }
            }
        });
    }
}
