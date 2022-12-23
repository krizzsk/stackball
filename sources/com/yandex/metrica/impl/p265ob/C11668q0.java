package com.yandex.metrica.impl.p265ob;

import android.content.ContentValues;
import android.content.Context;
import com.appsflyer.ServerParameters;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.q0 */
public final class C11668q0 {

    /* renamed from: a */
    private final Context f27992a;

    /* renamed from: b */
    private final C10474M f27993b;

    /* renamed from: c */
    private final C10199E f27994c;

    /* renamed from: d */
    private final C11146dd f27995d;

    /* renamed from: e */
    private final C11100c3 f27996e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ContentValues f27997f;

    /* renamed from: g */
    private C11384jh f27998g;

    public C11668q0(Context context) {
        this(context, C10619P0.m27164i().mo61877d(), C10619P0.m27164i().mo61876c(), C11146dd.m28727a(context), C11065b3.m28563a(context));
    }

    /* renamed from: a */
    public C11668q0 mo63522a(ContentValues contentValues) {
        this.f27997f = contentValues;
        return this;
    }

    /* renamed from: a */
    public C11668q0 mo63523a(C11384jh jhVar) {
        this.f27998g = jhVar;
        return this;
    }

    /* renamed from: a */
    public void mo63524a() {
        JSONObject jSONObject = new JSONObject();
        try {
            m30070a(jSONObject);
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        this.f27997f.put("report_request_parameters", jSONObject.toString());
    }

    C11668q0(Context context, C10474M m, C10199E e, C11146dd ddVar, C11065b3 b3Var) {
        this.f27992a = context;
        this.f27993b = m;
        this.f27994c = e;
        this.f27995d = ddVar;
        this.f27996e = b3Var.mo62679a();
    }

    /* renamed from: a */
    private void m30070a(JSONObject jSONObject) throws JSONException {
        JSONObject putOpt = jSONObject.putOpt("dId", this.f27998g.mo62778g()).putOpt("uId", this.f27998g.mo62795x()).putOpt("appVer", this.f27998g.mo62777f()).putOpt("appBuild", this.f27998g.mo62769b());
        this.f27998g.getClass();
        JSONObject putOpt2 = putOpt.putOpt("analyticsSdkVersionName", "5.0.0");
        this.f27998g.getClass();
        JSONObject putOpt3 = putOpt2.putOpt("kitBuildNumber", "45001354").putOpt("kitBuildType", this.f27998g.mo62782k()).putOpt("osVer", this.f27998g.mo62787p()).putOpt("osApiLev", Integer.valueOf(this.f27998g.mo62786o())).putOpt(ServerParameters.LANG, this.f27998g.mo62783l()).putOpt("root", this.f27998g.mo62780i()).putOpt("app_debuggable", this.f27998g.mo62969A()).putOpt("app_framework", this.f27998g.mo62771c()).putOpt("attribution_id", Integer.valueOf(this.f27998g.mo63073D()));
        this.f27998g.getClass();
        putOpt3.putOpt("commit_hash", "f6c3700f69aeb2f115563bfb01aee99b5faed63c");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.util.Collection} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo63525a(com.yandex.metrica.impl.p265ob.C11407jn r6, com.yandex.metrica.impl.p265ob.C10089A.C10090a r7, com.yandex.metrica.impl.p265ob.C11255fo<com.yandex.metrica.impl.p265ob.C10856Vi.C10858b, java.lang.Object> r8) {
        /*
            r5 = this;
            com.yandex.metrica.impl.ob.k0 r0 = r6.f27289a
            android.content.ContentValues r1 = r5.f27997f
            java.lang.String r2 = r0.f27298a
            java.lang.String r3 = "name"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f27997f
            java.lang.String r2 = r0.f27299b
            java.lang.String r3 = "value"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f27997f
            int r2 = r0.f27302e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "type"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f27997f
            int r2 = r0.f27303f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "custom_type"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f27997f
            java.lang.String r2 = r0.mo63155h()
            java.lang.String r3 = "error_environment"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f27997f
            java.lang.String r2 = r0.mo63162o()
            java.lang.String r3 = "user_info"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f27997f
            int r2 = r0.f27305h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "truncated"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f27997f
            android.content.Context r2 = r5.f27992a
            int r2 = com.yandex.metrica.impl.p265ob.C11060b2.m28561b((android.content.Context) r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "connection_type"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f27997f
            java.lang.String r2 = r0.mo63159l()
            java.lang.String r3 = "profile_id"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f27997f
            com.yandex.metrica.impl.ob.mn r6 = r6.f27290b
            int r6 = r6.mo63328a()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r2 = "encrypting_mode"
            r1.put(r2, r6)
            android.content.ContentValues r6 = r5.f27997f
            com.yandex.metrica.impl.ob.N0 r1 = r0.mo63156i()
            int r1 = r1.f25231a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "first_occurrence_status"
            r6.put(r2, r1)
            com.yandex.metrica.impl.ob.I0 r6 = r0.mo63160m()
            if (r6 == 0) goto L_0x00a2
            android.content.ContentValues r1 = r5.f27997f
            int r6 = r6.f24858a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r2 = "source"
            r1.put(r2, r6)
        L_0x00a2:
            java.lang.Boolean r6 = r0.mo63149c()
            if (r6 == 0) goto L_0x00af
            android.content.ContentValues r1 = r5.f27997f
            java.lang.String r2 = "attribution_id_changed"
            r1.put(r2, r6)
        L_0x00af:
            android.content.ContentValues r6 = r5.f27997f
            java.lang.Integer r0 = r0.mo63157j()
            java.lang.String r1 = "open_id"
            r6.put(r1, r0)
            android.content.ContentValues r6 = r5.f27997f
            java.lang.String r0 = r7.f24296a
            java.lang.String r1 = "app_environment"
            r6.put(r1, r0)
            android.content.ContentValues r6 = r5.f27997f
            long r0 = r7.f24297b
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "app_environment_revision"
            r6.put(r0, r7)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r7 = "enabled"
            r0 = 0
            com.yandex.metrica.impl.ob.jh r1 = r5.f27998g     // Catch:{ all -> 0x0119 }
            boolean r1 = r1.mo63087R()     // Catch:{ all -> 0x0119 }
            r6.put(r7, r1)     // Catch:{ all -> 0x0119 }
            com.yandex.metrica.impl.ob.jh r7 = r5.f27998g     // Catch:{ all -> 0x0119 }
            boolean r7 = r7.mo63087R()     // Catch:{ all -> 0x0119 }
            if (r7 == 0) goto L_0x00fe
            com.yandex.metrica.impl.ob.jh r7 = r5.f27998g     // Catch:{ all -> 0x0119 }
            android.location.Location r7 = r7.mo63078I()     // Catch:{ all -> 0x0119 }
            if (r7 != 0) goto L_0x00f9
            com.yandex.metrica.impl.ob.dd r7 = r5.f27995d     // Catch:{ all -> 0x0119 }
            android.location.Location r7 = r7.mo62750a()     // Catch:{ all -> 0x0119 }
            r1 = r0
            goto L_0x0100
        L_0x00f9:
            com.yandex.metrica.impl.ob.e3 r1 = com.yandex.metrica.impl.p265ob.C11173e3.m28812a(r7)     // Catch:{ all -> 0x0119 }
            goto L_0x0100
        L_0x00fe:
            r7 = r0
            r1 = r7
        L_0x0100:
            if (r1 != 0) goto L_0x0108
            if (r7 == 0) goto L_0x0108
            com.yandex.metrica.impl.ob.e3 r1 = com.yandex.metrica.impl.p265ob.C11173e3.m28813b(r7)     // Catch:{ all -> 0x0119 }
        L_0x0108:
            if (r1 == 0) goto L_0x010d
            r5.m30071a(r6, r1)     // Catch:{ all -> 0x0119 }
        L_0x010d:
            android.content.ContentValues r7 = r5.f27997f     // Catch:{ all -> 0x0119 }
            java.lang.String r1 = "location_info"
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0119 }
            r7.put(r1, r6)     // Catch:{ all -> 0x0119 }
            goto L_0x011a
        L_0x0119:
        L_0x011a:
            java.util.EnumMap r6 = new java.util.EnumMap
            java.lang.Class<com.yandex.metrica.impl.ob.Vi$b> r7 = com.yandex.metrica.impl.p265ob.C10856Vi.C10858b.class
            r6.<init>(r7)
            com.yandex.metrica.impl.ob.P0 r7 = com.yandex.metrica.impl.p265ob.C10619P0.m27164i()
            com.yandex.metrica.impl.ob.yk r7 = r7.mo61895w()
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            com.yandex.metrica.impl.ob.p0 r2 = new com.yandex.metrica.impl.ob.p0
            r2.<init>(r5, r1)
            r7.mo62204a((com.yandex.metrica.impl.p265ob.C10891Wj) r2)
            com.yandex.metrica.impl.ob.Vi$b r2 = com.yandex.metrica.impl.p265ob.C10856Vi.C10858b.WIFI
            com.yandex.metrica.impl.ob.c3 r3 = r5.f27996e
            java.lang.Object r3 = r3.mo61900a()
            r6.put(r2, r3)
            com.yandex.metrica.impl.ob.Vi$b r3 = com.yandex.metrica.impl.p265ob.C10856Vi.C10858b.CELL
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x014b
            r1 = r0
            goto L_0x0151
        L_0x014b:
            java.lang.Object r1 = r1.getFirst()
            java.util.Collection r1 = (java.util.Collection) r1
        L_0x0151:
            r6.put(r3, r1)
            com.yandex.metrica.impl.ob.jo r6 = r8.mo62659a(r6)
            android.content.ContentValues r8 = r5.f27997f
            com.yandex.metrica.impl.ob.jo$a r1 = r6.f27291a
            com.yandex.metrica.impl.ob.jo$a r4 = com.yandex.metrica.impl.p265ob.C11408jo.C11409a.NOT_CHANGED
            if (r1 != r4) goto L_0x0162
            r1 = 1
            goto L_0x0163
        L_0x0162:
            r1 = 0
        L_0x0163:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r4 = "has_omitted_data"
            r8.put(r4, r1)
            com.yandex.metrica.impl.ob.jo$a r8 = r6.f27291a
            D r1 = r6.f27292b
            if (r1 != 0) goto L_0x0174
            r1 = r0
            goto L_0x017c
        L_0x0174:
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r1.get(r3)
            java.util.Collection r1 = (java.util.Collection) r1
        L_0x017c:
            com.yandex.metrica.impl.ob.o0 r3 = new com.yandex.metrica.impl.ob.o0
            r3.<init>(r5)
            r7.mo62202a((com.yandex.metrica.impl.p265ob.C10143Bk) r3)
            com.yandex.metrica.impl.ob.jo$a r7 = com.yandex.metrica.impl.p265ob.C11408jo.C11409a.NEW
            if (r8 == r7) goto L_0x018c
            com.yandex.metrica.impl.ob.jo$a r3 = com.yandex.metrica.impl.p265ob.C11408jo.C11409a.REFRESH
            if (r8 != r3) goto L_0x019d
        L_0x018c:
            if (r1 == 0) goto L_0x019d
            android.content.ContentValues r8 = r5.f27997f
            org.json.JSONArray r1 = com.yandex.metrica.impl.p265ob.C11993ym.m30967a((java.util.Collection<com.yandex.metrica.impl.p265ob.C10859Vj>) r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "cell_info"
            r8.put(r3, r1)
        L_0x019d:
            com.yandex.metrica.impl.ob.jo$a r8 = r6.f27291a
            D r6 = r6.f27292b
            if (r6 != 0) goto L_0x01a4
            goto L_0x01ad
        L_0x01a4:
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r6 = r6.get(r2)
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
        L_0x01ad:
            com.yandex.metrica.impl.ob.jo$a r6 = com.yandex.metrica.impl.p265ob.C11408jo.C11409a.REFRESH
            if (r8 == r6) goto L_0x01b3
            if (r8 != r7) goto L_0x01c4
        L_0x01b3:
            if (r0 == 0) goto L_0x01c4
            org.json.JSONArray r6 = com.yandex.metrica.impl.p265ob.C10977Z2.m28338a(r0)
            android.content.ContentValues r7 = r5.f27997f
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = "wifi_network_info"
            r7.put(r8, r6)
        L_0x01c4:
            android.content.ContentValues r6 = r5.f27997f
            com.yandex.metrica.impl.ob.M r7 = r5.f27993b
            com.yandex.metrica.impl.ob.M$b$a r7 = r7.mo61752b()
            int r7 = r7.mo61753a()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "battery_charge_type"
            r6.put(r8, r7)
            android.content.ContentValues r6 = r5.f27997f
            com.yandex.metrica.impl.ob.E r7 = r5.f27994c
            com.yandex.metrica.impl.ob.E$a r7 = r7.mo61211c()
            com.yandex.metrica.impl.ob.Wc$a r7 = com.yandex.metrica.impl.p265ob.C10883Wc.C10884a.m28132a((com.yandex.metrica.impl.p265ob.C10199E.C10200a) r7)
            java.lang.String r7 = r7.mo62449a()
            java.lang.String r8 = "collection_mode"
            r6.put(r8, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11668q0.mo63525a(com.yandex.metrica.impl.ob.jn, com.yandex.metrica.impl.ob.A$a, com.yandex.metrica.impl.ob.fo):void");
    }

    /* renamed from: a */
    private void m30071a(JSONObject jSONObject, C11173e3 e3Var) throws JSONException {
        jSONObject.put(ServerParameters.LAT_KEY, e3Var.getLatitude());
        jSONObject.put(ServerParameters.LON_KEY, e3Var.getLongitude());
        jSONObject.putOpt("timestamp", Long.valueOf(e3Var.getTime()));
        jSONObject.putOpt("precision", e3Var.hasAccuracy() ? Float.valueOf(e3Var.getAccuracy()) : null);
        jSONObject.putOpt("direction", e3Var.hasBearing() ? Float.valueOf(e3Var.getBearing()) : null);
        jSONObject.putOpt("speed", e3Var.hasSpeed() ? Float.valueOf(e3Var.getSpeed()) : null);
        jSONObject.putOpt("altitude", e3Var.hasAltitude() ? Double.valueOf(e3Var.getAltitude()) : null);
        jSONObject.putOpt(IronSourceConstants.EVENTS_PROVIDER, C10585O2.m27103a(e3Var.getProvider(), (String) null));
        jSONObject.putOpt("original_provider", e3Var.mo62805a());
    }
}
