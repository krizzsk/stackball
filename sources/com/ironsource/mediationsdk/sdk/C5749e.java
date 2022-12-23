package com.ironsource.mediationsdk.sdk;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.sdk.e */
public final class C5749e {

    /* renamed from: a */
    private static C5749e f13831a;

    /* renamed from: b */
    private JSONObject f13832b = new JSONObject();

    private C5749e() {
    }

    /* renamed from: a */
    public static synchronized C5749e m14210a() {
        C5749e eVar;
        synchronized (C5749e.class) {
            if (f13831a == null) {
                f13831a = new C5749e();
            }
            eVar = f13831a;
        }
        return eVar;
    }

    /* renamed from: a */
    public final synchronized String mo42052a(String str) {
        return this.f13832b.optString(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000c, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo42053a(java.lang.String r2, java.lang.Object r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            org.json.JSONObject r0 = r1.f13832b     // Catch:{ Exception -> 0x000b, all -> 0x0008 }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x000b, all -> 0x0008 }
            monitor-exit(r1)
            return
        L_0x0008:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x000b:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.sdk.C5749e.mo42053a(java.lang.String, java.lang.Object):void");
    }

    /* renamed from: a */
    public final synchronized void mo42054a(Map<String, Object> map) {
        if (map != null) {
            for (String next : map.keySet()) {
                mo42053a(next, map.get(next));
            }
        }
    }

    /* renamed from: b */
    public final synchronized JSONObject mo42055b() {
        return this.f13832b;
    }
}
