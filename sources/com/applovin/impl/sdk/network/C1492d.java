package com.applovin.impl.sdk.network;

import android.content.Context;
import com.applovin.impl.sdk.p025b.C1371e;
import com.applovin.impl.sdk.p025b.C1372f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.d */
public class C1492d {

    /* renamed from: a */
    private static final Object f3633a = new Object();

    /* renamed from: a */
    private static JSONObject m3229a(String str, Context context) {
        JSONObject b = m3233b(context);
        if (b == null) {
            b = new JSONObject();
        }
        if (!b.has(str)) {
            try {
                b.put(str, new JSONObject());
            } catch (JSONException unused) {
            }
        }
        return b;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:5|6|7|8|9|10|11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0023 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0026 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m3230a(int r4, java.lang.String r5, android.content.Context r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.Object r0 = f3633a
            monitor-enter(r0)
            java.lang.String r5 = com.applovin.impl.sdk.utils.C1557r.m3627d((java.lang.String) r5)     // Catch:{ all -> 0x002b }
            org.json.JSONObject r1 = m3229a((java.lang.String) r5, (android.content.Context) r6)     // Catch:{ all -> 0x002b }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x002b }
            org.json.JSONObject r2 = r1.optJSONObject(r5)     // Catch:{ all -> 0x002b }
            int r3 = r2.optInt(r4)     // Catch:{ all -> 0x002b }
            int r3 = r3 + 1
            r2.put(r4, r3)     // Catch:{ JSONException -> 0x0023 }
        L_0x0023:
            r1.put(r5, r2)     // Catch:{ JSONException -> 0x0026 }
        L_0x0026:
            m3232a((org.json.JSONObject) r1, (android.content.Context) r6)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.network.C1492d.m3230a(int, java.lang.String, android.content.Context):void");
    }

    /* renamed from: a */
    public static void m3231a(Context context) {
        synchronized (f3633a) {
            C1372f.m2655a(C1371e.f3165q, context);
        }
    }

    /* renamed from: a */
    private static void m3232a(JSONObject jSONObject, Context context) {
        C1372f.m2656a(C1371e.f3165q, jSONObject.toString(), context);
    }

    /* renamed from: b */
    public static JSONObject m3233b(Context context) {
        JSONObject jSONObject;
        synchronized (f3633a) {
            try {
                jSONObject = new JSONObject((String) C1372f.m2658b(C1371e.f3165q, "{}", context));
            } catch (JSONException unused) {
                return new JSONObject();
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject;
    }
}
