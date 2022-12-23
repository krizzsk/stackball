package com.fyber.inneractive.sdk.p049h;

import android.os.Build;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.C2739a;
import com.fyber.inneractive.sdk.config.C2788f;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.config.p034a.p035a.C2741a;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.p039dv.C2896g;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.p055l.C3024a;
import com.fyber.inneractive.sdk.p055l.C3025b;
import com.fyber.inneractive.sdk.p055l.C3026c;
import com.fyber.inneractive.sdk.util.C3628ai;
import com.fyber.inneractive.sdk.util.C3670q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.h.z */
public final class C2990z extends C2937ab<C3018e> implements C2961j {

    /* renamed from: a */
    StringBuffer f7272a;

    /* renamed from: b */
    C2767s f7273b;

    /* renamed from: g */
    private final InneractiveAdRequest f7274g;

    /* renamed from: h */
    private Map<String, String> f7275h;

    /* renamed from: i */
    private final C3026c f7276i;

    /* renamed from: j */
    private C2896g f7277j;

    /* renamed from: g */
    public final boolean mo18407g() {
        return false;
    }

    /* renamed from: h */
    public final int mo18408h() {
        return 0;
    }

    public C2990z(C2977r<C3018e> rVar, InneractiveAdRequest inneractiveAdRequest, C2767s sVar) {
        this(rVar, inneractiveAdRequest, new C3025b(sVar), new C2957f(), sVar);
    }

    private C2990z(C2977r<C3018e> rVar, InneractiveAdRequest inneractiveAdRequest, C3026c cVar, C2956e eVar, C2767s sVar) {
        super(rVar, eVar);
        this.f7277j = null;
        this.f7273b = sVar;
        this.f7274g = inneractiveAdRequest;
        this.f7276i = cVar;
    }

    /* renamed from: c */
    public final C2984u mo18406c() {
        return C2984u.POST;
    }

    /* renamed from: d */
    public final Map<String, String> mo18394d() {
        String e = C2788f.m6077e();
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("mockadnetworkresponseid", e);
        IAlog.m9034b("NetworkRequestAd: Adding mock response header - %s", e);
        return hashMap;
    }

    /* renamed from: m */
    public final int mo18410m() {
        return C2945ah.f7087a;
    }

    /* renamed from: o */
    public final C2767s mo18401o() {
        return this.f7273b;
    }

    /* renamed from: e */
    public final byte[] mo18395e() {
        byte[] bArr = new byte[0];
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONArray i = this.f7276i.mo18515i();
            if (i != null && i.length() > 0) {
                jSONObject2.put("experiments", i);
                jSONObject.put("sdk_experiments", jSONObject2);
            }
            UnitDisplayType a = C3024a.m7047a(this.f7274g.getSpotId());
            JSONArray a2 = IAConfigManager.m5943n().f6664a.mo17891a(a);
            if (a2.length() > 0) {
                jSONObject.put("user_sessions", a2);
            }
            int a3 = IAConfigManager.m5929c().f6586a.mo18046a("dv_enabled", 0, 0);
            if (a != null && a3 == 1) {
                C2896g a4 = IAConfigManager.m5931d().mo18244a(a);
                this.f7277j = a4;
                if (a4 != null) {
                    jSONObject.put("gdem_signal", a4.f6853a.getQuery());
                }
            }
            if (Build.VERSION.SDK_INT >= 19) {
                bArr = jSONObject.toString().getBytes(StandardCharsets.UTF_8);
            } else {
                bArr = jSONObject.toString().getBytes("UTF-8");
            }
            IAlog.m9034b("request json body - %s", jSONObject.toString());
        } catch (Exception unused) {
            IAlog.m9034b("Failed building body for ad request!", new Object[0]);
        }
        return bArr;
    }

    /* renamed from: a */
    public final Map<String, String> mo18429a() {
        return this.f7275h;
    }

    /* renamed from: b */
    public final StringBuffer mo18430b() {
        return this.f7272a;
    }

    /* renamed from: a */
    private static StringBuffer m6693a(InputStream inputStream) {
        try {
            return C3670q.m9156a(inputStream);
        } catch (Exception e) {
            IAlog.m9032a("failed create response builder in network request ad", (Throwable) e, new Object[0]);
            return null;
        }
    }

    /* renamed from: k */
    public final String mo18409k() {
        String str;
        String a = C2788f.m6073a();
        if (TextUtils.isEmpty(a)) {
            str = "https://" + IAConfigManager.f6419n.f6436h.f6612g;
        } else {
            str = C2739a.m5958a(a, "clientRequestEnhancedXmlAd");
        }
        return C3628ai.m9050a(str, new C2936aa(this.f7274g, this.f7276i).mo18389a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061 A[Catch:{ Exception -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0066 A[Catch:{ Exception -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006d A[Catch:{ Exception -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0078 A[Catch:{ Exception -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00aa A[Catch:{ Exception -> 0x005b }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fyber.inneractive.sdk.p049h.C2986w<com.fyber.inneractive.sdk.p051j.C3018e> mo18405a(java.io.InputStream r6, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7, int r8) throws java.lang.Exception {
        /*
            r5 = this;
            r8 = 0
            if (r7 == 0) goto L_0x0038
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r7 == 0) goto L_0x0036
            java.util.Set r1 = r7.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0012:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0036
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0012
            java.lang.Object r3 = r7.get(r2)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x0012
            int r4 = r3.size()
            if (r4 <= 0) goto L_0x0012
            java.lang.Object r3 = r3.get(r8)
            r0.put(r2, r3)
            goto L_0x0012
        L_0x0036:
            r5.f7275h = r0
        L_0x0038:
            if (r6 == 0) goto L_0x0040
            java.lang.StringBuffer r6 = m6693a(r6)
            r5.f7272a = r6
        L_0x0040:
            com.fyber.inneractive.sdk.h.x r6 = new com.fyber.inneractive.sdk.h.x
            r6.<init>()
            r0 = 0
            if (r7 == 0) goto L_0x005e
            com.fyber.inneractive.sdk.h.i r1 = com.fyber.inneractive.sdk.p049h.C2960i.RETURNED_AD_TYPE     // Catch:{ Exception -> 0x005b }
            java.lang.String r1 = r1.f7154E     // Catch:{ Exception -> 0x005b }
            java.lang.Object r7 = r7.get(r1)     // Catch:{ Exception -> 0x005b }
            java.util.List r7 = (java.util.List) r7     // Catch:{ Exception -> 0x005b }
            if (r7 == 0) goto L_0x005e
            java.lang.Object r7 = r7.get(r8)     // Catch:{ Exception -> 0x005b }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x005b }
            goto L_0x005f
        L_0x005b:
            r6 = move-exception
            goto L_0x00d8
        L_0x005e:
            r7 = r0
        L_0x005f:
            if (r7 == 0) goto L_0x0066
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ Exception -> 0x005b }
            goto L_0x0067
        L_0x0066:
            r7 = 6
        L_0x0067:
            com.fyber.inneractive.sdk.j.a r1 = com.fyber.inneractive.sdk.p051j.C3014a.m7016a(r7)     // Catch:{ Exception -> 0x005b }
            if (r1 != 0) goto L_0x006f
            com.fyber.inneractive.sdk.j.a r1 = com.fyber.inneractive.sdk.p051j.C3014a.RETURNED_ADTYPE_MRAID     // Catch:{ Exception -> 0x005b }
        L_0x006f:
            com.fyber.inneractive.sdk.c.c r2 = com.fyber.inneractive.sdk.p033c.C2727c.C2728a.f6415a     // Catch:{ Exception -> 0x005b }
            com.fyber.inneractive.sdk.j.b r1 = r2.mo17965a(r1)     // Catch:{ Exception -> 0x005b }
            r2 = 1
            if (r1 != 0) goto L_0x00aa
            java.lang.String r6 = "Received ad type %s does not have an appropriate parser!"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x005b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x005b }
            r0[r8] = r1     // Catch:{ Exception -> 0x005b }
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r6, r0)     // Catch:{ Exception -> 0x005b }
            com.fyber.inneractive.sdk.c.c r6 = com.fyber.inneractive.sdk.p033c.C2727c.C2728a.f6415a     // Catch:{ Exception -> 0x005b }
            java.util.HashMap<com.fyber.inneractive.sdk.j.a, com.fyber.inneractive.sdk.c.c$b> r6 = r6.f6414a     // Catch:{ Exception -> 0x005b }
            int r6 = r6.size()     // Catch:{ Exception -> 0x005b }
            if (r6 != 0) goto L_0x0096
            java.lang.String r6 = "Inneractive_error"
            java.lang.String r0 = "Critical error raised while fetching an ad - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project"
            android.util.Log.e(r6, r0)     // Catch:{ Exception -> 0x005b }
        L_0x0096:
            com.fyber.inneractive.sdk.h.v r6 = new com.fyber.inneractive.sdk.h.v     // Catch:{ Exception -> 0x005b }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005b }
            java.lang.String r1 = "Could not find parser for ad type "
            r0.<init>(r1)     // Catch:{ Exception -> 0x005b }
            r0.append(r7)     // Catch:{ Exception -> 0x005b }
            java.lang.String r7 = r0.toString()     // Catch:{ Exception -> 0x005b }
            r6.<init>((java.lang.String) r7)     // Catch:{ Exception -> 0x005b }
            throw r6     // Catch:{ Exception -> 0x005b }
        L_0x00aa:
            java.lang.String r3 = "Received ad type %s - Got parser! %s"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x005b }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x005b }
            r4[r8] = r7     // Catch:{ Exception -> 0x005b }
            r4[r2] = r1     // Catch:{ Exception -> 0x005b }
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r3, r4)     // Catch:{ Exception -> 0x005b }
            r1.mo18496a((com.fyber.inneractive.sdk.p049h.C2961j) r5)     // Catch:{ Exception -> 0x005b }
            com.fyber.inneractive.sdk.j.e r7 = r1.mo18495a((java.lang.String) r0)     // Catch:{ Exception -> 0x005b }
            com.fyber.inneractive.sdk.dv.g r0 = r5.f7277j     // Catch:{ Exception -> 0x005b }
            if (r0 == 0) goto L_0x00ca
            com.fyber.inneractive.sdk.dv.g r0 = r5.f7277j     // Catch:{ Exception -> 0x005b }
            r7.mo18497a(r0)     // Catch:{ Exception -> 0x005b }
        L_0x00ca:
            r6.f7270a = r7     // Catch:{ Exception -> 0x005b }
            com.fyber.inneractive.sdk.h.y$a r7 = r5.f7069f     // Catch:{ Exception -> 0x005b }
            if (r7 == 0) goto L_0x00d7
            com.fyber.inneractive.sdk.h.y$a r7 = r5.f7069f     // Catch:{ Exception -> 0x005b }
            java.lang.String r0 = "sdkParsedResponse"
            r7.mo18432a(r0)     // Catch:{ Exception -> 0x005b }
        L_0x00d7:
            return r6
        L_0x00d8:
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.String r8 = "failed parse ad network request"
            com.fyber.inneractive.sdk.util.IAlog.m9032a((java.lang.String) r8, (java.lang.Throwable) r6, (java.lang.Object[]) r7)
            com.fyber.inneractive.sdk.h.v r7 = new com.fyber.inneractive.sdk.h.v
            r7.<init>((java.lang.Exception) r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p049h.C2990z.mo18405a(java.io.InputStream, java.util.Map, int):com.fyber.inneractive.sdk.h.w");
    }

    /* renamed from: q */
    public final C2948ak mo18403q() {
        C2741a aVar;
        C2767s sVar = this.f7273b;
        if (sVar == null || (aVar = (C2741a) sVar.mo18010a(C2741a.class)) == null) {
            return super.mo18403q();
        }
        return new C2948ak(Math.max(aVar.mo17981a("connect_timeout", 5000), 1), Math.max(aVar.mo17981a("read_timeout", 5000), 1));
    }
}
