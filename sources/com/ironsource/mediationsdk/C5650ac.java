package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.environment.C5517c;
import com.ironsource.environment.C5527g;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.C5790c;
import com.ironsource.mediationsdk.utils.C5804m;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.ac */
final class C5650ac {

    /* renamed from: b */
    private static C5650ac f13356b;

    /* renamed from: a */
    JSONObject f13357a = new JSONObject();

    private C5650ac() {
    }

    /* renamed from: a */
    public static synchronized C5650ac m13819a() {
        C5650ac acVar;
        synchronized (C5650ac.class) {
            if (f13356b == null) {
                f13356b = new C5650ac();
            }
            acVar = f13356b;
        }
        return acVar;
    }

    /* renamed from: a */
    private synchronized void m13822a(String str, Object obj) {
        try {
            this.f13357a.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    static JSONObject m13823b() {
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        int k = C5527g.m13157k();
        int l = C5527g.m13159l();
        float o = C5527g.m13165o();
        if (applicationContext != null) {
            try {
                ConcurrentHashMap<String, List<String>> concurrentHashMap = C5685c.m13965a().f13532c;
                concurrentHashMap.putAll(C5790c.m14278a().mo42115d());
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry next : concurrentHashMap.entrySet()) {
                    jSONObject2.put((String) next.getKey(), next.getValue());
                }
                Boolean bool = C5556E.m13257a().f12868x;
                if (bool != null) {
                    jSONObject.put("consent", bool.booleanValue());
                }
                jSONObject.put("connT", IronSourceUtils.getConnectionType(applicationContext));
                jSONObject.put("dVol", (double) C5527g.m13161m(applicationContext));
                jSONObject.put("root", C5527g.m13156j());
                jSONObject.put("bat", C5527g.m13178w(applicationContext));
                jSONObject.put("diskFS", C5527g.m13168p());
                jSONObject.put("MD", jSONObject2);
                jSONObject.put("cTime", new Date().getTime());
                jSONObject.put("dWidth", k);
                jSONObject.put("dHeight", l);
                jSONObject.put("dScrenScle", String.valueOf(o));
                jSONObject.put("sDepIS", C5804m.m14360a().mo42136b(2));
                jSONObject.put("sDepRV", C5804m.m14360a().mo42136b(1));
                jSONObject.put("UA", C5527g.m13171r());
            } catch (JSONException e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("got the following error " + e.getMessage());
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* renamed from: c */
    static JSONObject m13824c() {
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            try {
                String language = applicationContext.getResources().getConfiguration().locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObject.put("dLang", language.toUpperCase(Locale.ENGLISH));
                }
                String pluginType = ConfigFile.getConfigFile().getPluginType();
                if (!TextUtils.isEmpty(pluginType)) {
                    jSONObject.put("plType", pluginType);
                }
                String e = C5527g.m13146e();
                if (e != null) {
                    jSONObject.put("dOSVF", e);
                    jSONObject.put("dOSV", e.replaceAll("[^0-9/.]", ""));
                }
                String z = C5527g.m13181z(applicationContext);
                if (z != null) {
                    jSONObject.put("auid", z);
                }
                jSONObject.put("sId", IronSourceUtils.getSessionId());
                jSONObject.put("appKey", C5556E.m13257a().f12854j);
                jSONObject.put("mCar", C5527g.m13155j(applicationContext));
                jSONObject.put("medV", IronSourceUtils.getSDKVersion());
                jSONObject.put("dModel", Build.MODEL);
                jSONObject.put("dOS", "android");
                jSONObject.put("dMake", Build.MANUFACTURER);
                jSONObject.put("dAPI", String.valueOf(Build.VERSION.SDK_INT));
                jSONObject.put("bId", applicationContext.getPackageName());
                jSONObject.put("appV", C5517c.m13106c(applicationContext, applicationContext.getPackageName()));
                jSONObject.put("usId", C5556E.m13257a().f12855k);
            } catch (JSONException e2) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("got the following error " + e2.getMessage());
                e2.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m13825d() {
        /*
            java.lang.String r0 = ""
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r2 = r2.getApplicationContext()
            if (r2 == 0) goto L_0x0072
            r3 = 0
            java.lang.String[] r4 = com.ironsource.environment.C5527g.m13136a((android.content.Context) r2)     // Catch:{ Exception -> 0x0030 }
            r5 = r4[r3]     // Catch:{ Exception -> 0x0030 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0030 }
            if (r5 != 0) goto L_0x0021
            r5 = r4[r3]     // Catch:{ Exception -> 0x0030 }
            goto L_0x0022
        L_0x0021:
            r5 = r0
        L_0x0022:
            r6 = 1
            r4 = r4[r6]     // Catch:{ Exception -> 0x002e }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x002e }
            boolean r3 = r4.booleanValue()     // Catch:{ Exception -> 0x002e }
            goto L_0x0049
        L_0x002e:
            r4 = move-exception
            goto L_0x0032
        L_0x0030:
            r4 = move-exception
            r5 = r0
        L_0x0032:
            com.ironsource.mediationsdk.logger.IronLog r6 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "got the following error "
            r7.<init>(r8)
            java.lang.String r4 = r4.getMessage()
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r6.error(r4)
        L_0x0049:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L_0x0052
            java.lang.String r0 = "GAID"
            goto L_0x005e
        L_0x0052:
            java.lang.String r5 = com.ironsource.environment.C5527g.m13180y(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L_0x005e
            java.lang.String r0 = "UUID"
        L_0x005e:
            java.lang.String r2 = "advId"
            r1.put(r2, r5)     // Catch:{ Exception -> 0x006e }
            java.lang.String r2 = "advType"
            r1.put(r2, r0)     // Catch:{ Exception -> 0x006e }
            java.lang.String r0 = "isLAT"
            r1.put(r0, r3)     // Catch:{ Exception -> 0x006e }
            goto L_0x0072
        L_0x006e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0072:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5650ac.m13825d():org.json.JSONObject");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41713a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            m13822a(next, jSONObject.opt(next));
        }
    }
}
