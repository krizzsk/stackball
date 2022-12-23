package com.applovin.impl.sdk.p025b;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.utils.C1557r;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.b.d */
public class C1370d {

    /* renamed from: a */
    protected final C1469j f3139a;

    /* renamed from: b */
    protected final C1505q f3140b;

    /* renamed from: c */
    protected final Context f3141c;

    /* renamed from: d */
    protected final SharedPreferences f3142d;

    /* renamed from: e */
    private final Map<String, Object> f3143e = new HashMap();

    /* renamed from: f */
    private final Object f3144f = new Object();

    /* renamed from: g */
    private Map<String, Object> f3145g;

    /* renamed from: h */
    private final C1367a f3146h;

    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|3|4|5|7) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x003a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1370d(com.applovin.impl.sdk.C1469j r4) {
        /*
            r3 = this;
            r3.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.f3143e = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.f3144f = r0
            r3.f3139a = r4
            com.applovin.impl.sdk.q r0 = r4.mo13139v()
            r3.f3140b = r0
            android.content.Context r0 = r4.mo13065D()
            r3.f3141c = r0
            java.lang.String r1 = "com.applovin.sdk.1"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r3.f3142d = r0
            java.lang.Class<com.applovin.impl.sdk.b.c> r0 = com.applovin.impl.sdk.p025b.C1369c.class
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x003a }
            java.lang.Class.forName(r0)     // Catch:{ all -> 0x003a }
            java.lang.Class<com.applovin.impl.sdk.b.b> r0 = com.applovin.impl.sdk.p025b.C1368b.class
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x003a }
            java.lang.Class.forName(r0)     // Catch:{ all -> 0x003a }
        L_0x003a:
            com.applovin.sdk.AppLovinSdkSettings r0 = r4.mo13128l()     // Catch:{ all -> 0x0058 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0058 }
            java.lang.String r1 = "localSettings"
            java.lang.reflect.Field r0 = com.applovin.impl.sdk.utils.C1557r.m3592a((java.lang.Class) r0, (java.lang.String) r1)     // Catch:{ all -> 0x0058 }
            r1 = 1
            r0.setAccessible(r1)     // Catch:{ all -> 0x0058 }
            com.applovin.sdk.AppLovinSdkSettings r1 = r4.mo13128l()     // Catch:{ all -> 0x0058 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0058 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0058 }
            r3.f3145g = r0     // Catch:{ all -> 0x0058 }
        L_0x0058:
            com.applovin.impl.sdk.b.a r0 = new com.applovin.impl.sdk.b.a
            r0.<init>(r3, r4)
            r3.f3146h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p025b.C1370d.<init>(com.applovin.impl.sdk.j):void");
    }

    /* renamed from: a */
    private static Object m2639a(String str, JSONObject jSONObject, Object obj) throws JSONException {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }

    /* renamed from: f */
    private String m2640f() {
        return "com.applovin.sdk." + C1557r.m3589a(this.f3139a.mo13136t()) + ".";
    }

    /* renamed from: a */
    public <T> C1369c<T> mo12841a(String str, C1369c<T> cVar) {
        synchronized (this.f3144f) {
            for (C1369c<T> next : C1369c.m2635c()) {
                if (next.mo12838a().equals(str)) {
                    return next;
                }
            }
            return cVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        return r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo12842a(com.applovin.impl.sdk.p025b.C1369c<T> r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x002d
            java.lang.Object r0 = r3.f3144f
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.f3143e     // Catch:{ all -> 0x002a }
            java.lang.String r2 = r4.mo12838a()     // Catch:{ all -> 0x002a }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0024
            com.applovin.impl.sdk.b.a r1 = r3.f3146h     // Catch:{ all -> 0x002a }
            java.lang.Object r1 = r1.mo12835a(r4)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x001e
            java.lang.Object r4 = r4.mo12837a(r1)     // Catch:{ all -> 0x002a }
            goto L_0x0022
        L_0x001e:
            java.lang.Object r4 = r4.mo12839b()     // Catch:{ all -> 0x002a }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return r4
        L_0x0024:
            java.lang.Object r4 = r4.mo12837a(r1)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return r4
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        L_0x002d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "No setting type specified"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p025b.C1370d.mo12842a(com.applovin.impl.sdk.b.c):java.lang.Object");
    }

    /* renamed from: a */
    public void mo12843a() {
        this.f3146h.mo12836a();
    }

    /* renamed from: a */
    public <T> void mo12844a(C1369c<?> cVar, Object obj) {
        if (cVar == null) {
            throw new IllegalArgumentException("No setting type specified");
        } else if (obj != null) {
            synchronized (this.f3144f) {
                this.f3143e.put(cVar.mo12838a(), obj);
            }
        } else {
            throw new IllegalArgumentException("No new value specified");
        }
    }

    /* renamed from: a */
    public void mo12845a(JSONObject jSONObject) {
        C1505q qVar;
        String str;
        String str2;
        synchronized (this.f3144f) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && next.length() > 0) {
                    try {
                        C1369c<Long> a = mo12841a(next, (C1369c) null);
                        if (a != null) {
                            this.f3143e.put(a.mo12838a(), m2639a(next, jSONObject, a.mo12839b()));
                            if (a == C1369c.f3083eQ) {
                                this.f3143e.put(C1369c.f3084eR.mo12838a(), Long.valueOf(System.currentTimeMillis()));
                            }
                        }
                    } catch (JSONException e) {
                        th = e;
                        qVar = this.f3140b;
                        str = "SettingsManager";
                        str2 = "Unable to parse JSON settingsValues array";
                        qVar.mo13278b(str, str2, th);
                    } catch (Throwable th) {
                        th = th;
                        qVar = this.f3140b;
                        str = "SettingsManager";
                        str2 = "Unable to convert setting object ";
                        qVar.mo13278b(str, str2, th);
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.applovin.impl.sdk.b.c<java.lang.String>, com.applovin.impl.sdk.b.c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.String> mo12846b(com.applovin.impl.sdk.p025b.C1369c<java.lang.String> r1) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.mo12842a(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.util.List r1 = com.applovin.impl.sdk.utils.C1517e.m3423a((java.lang.String) r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p025b.C1370d.mo12846b(com.applovin.impl.sdk.b.c):java.util.List");
    }

    /* renamed from: b */
    public void mo12847b() {
        if (this.f3141c != null) {
            String f = m2640f();
            synchronized (this.f3144f) {
                SharedPreferences.Editor edit = this.f3142d.edit();
                for (C1369c next : C1369c.m2635c()) {
                    Object obj = this.f3143e.get(next.mo12838a());
                    if (obj != null) {
                        this.f3139a.mo13101a(f + next.mo12838a(), obj, edit);
                    }
                }
                edit.apply();
            }
            return;
        }
        throw new IllegalArgumentException("No context specified");
    }

    /* renamed from: c */
    public void mo12848c() {
        if (this.f3141c != null) {
            String f = m2640f();
            synchronized (this.f3144f) {
                for (C1369c next : C1369c.m2635c()) {
                    try {
                        Object a = this.f3139a.mo13090a(f + next.mo12838a(), null, next.mo12839b().getClass(), this.f3142d);
                        if (a != null) {
                            this.f3143e.put(next.mo12838a(), a);
                        }
                    } catch (Exception e) {
                        C1505q qVar = this.f3140b;
                        qVar.mo13278b("SettingsManager", "Unable to load \"" + next.mo12838a() + "\"", e);
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("No context specified");
    }

    /* renamed from: d */
    public void mo12849d() {
        synchronized (this.f3144f) {
            this.f3143e.clear();
        }
        this.f3139a.mo13093a(this.f3142d);
    }

    /* renamed from: e */
    public boolean mo12850e() {
        return this.f3139a.mo13128l().isVerboseLoggingEnabled() || ((Boolean) mo12842a(C1369c.f2854X)).booleanValue();
    }
}
