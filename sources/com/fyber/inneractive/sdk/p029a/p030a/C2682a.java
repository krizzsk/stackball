package com.fyber.inneractive.sdk.p029a.p030a;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.p029a.p030a.p031a.C2689b;
import com.fyber.inneractive.sdk.util.C3662m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.a.a.a */
public final class C2682a {

    /* renamed from: a */
    public C2693c f6322a;

    /* renamed from: b */
    HashMap<C2689b, C2695d> f6323b;

    /* renamed from: c */
    final Object f6324c;

    /* renamed from: d */
    boolean f6325d;

    /* renamed from: e */
    private final Object f6326e;

    /* renamed from: f */
    private C2687a f6327f;

    /* renamed from: com.fyber.inneractive.sdk.a.a.a$a */
    public interface C2687a {
    }

    private C2682a() {
        this.f6322a = new C2693c();
        this.f6324c = new Object();
        this.f6326e = new Object();
        this.f6325d = false;
        this.f6323b = new HashMap<C2689b, C2695d>() {

            /* renamed from: a */
            final /* synthetic */ int f6328a = 25;

            {
                for (C2689b bVar : C2689b.values()) {
                    if (bVar != C2689b.NONE) {
                        put(bVar, new C2695d(this.f6328a));
                    }
                }
            }
        };
        this.f6327f = null;
    }

    public C2682a(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo17893a(final C2689b bVar, final int i) {
        C3662m.m9138a(new Runnable() {
            /* JADX WARNING: Can't wrap try/catch for region: R(9:2|3|(2:5|(2:7|(2:9|(2:11|(1:13)(1:14))(1:15))(1:16)))(1:17)|18|19|20|21|22|23) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0060 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r5 = this;
                    com.fyber.inneractive.sdk.a.a.a r0 = com.fyber.inneractive.sdk.p029a.p030a.C2682a.this
                    java.lang.Object r0 = r0.f6324c
                    monitor-enter(r0)
                    int r1 = r3     // Catch:{ all -> 0x0062 }
                    int r2 = com.fyber.inneractive.sdk.p029a.p030a.p031a.C2688a.f6339d     // Catch:{ all -> 0x0062 }
                    if (r1 == r2) goto L_0x003e
                    com.fyber.inneractive.sdk.a.a.a r1 = com.fyber.inneractive.sdk.p029a.p030a.C2682a.this     // Catch:{ all -> 0x0062 }
                    com.fyber.inneractive.sdk.a.a.c r1 = r1.f6322a     // Catch:{ all -> 0x0062 }
                    com.fyber.inneractive.sdk.a.a.a.b r2 = r2     // Catch:{ all -> 0x0062 }
                    int r3 = r3     // Catch:{ all -> 0x0062 }
                    java.util.HashMap<com.fyber.inneractive.sdk.a.a.a.b, com.fyber.inneractive.sdk.a.a.b> r1 = r1.f6357a     // Catch:{ all -> 0x0062 }
                    java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0062 }
                    com.fyber.inneractive.sdk.a.a.b r1 = (com.fyber.inneractive.sdk.p029a.p030a.C2691b) r1     // Catch:{ all -> 0x0062 }
                    if (r1 == 0) goto L_0x0047
                    int[] r2 = com.fyber.inneractive.sdk.p029a.p030a.C2691b.C26921.f6356a     // Catch:{ all -> 0x0062 }
                    r4 = 1
                    int r3 = r3 - r4
                    r2 = r2[r3]     // Catch:{ all -> 0x0062 }
                    if (r2 == r4) goto L_0x0038
                    r3 = 2
                    if (r2 == r3) goto L_0x0032
                    r3 = 3
                    if (r2 == r3) goto L_0x002c
                    goto L_0x0047
                L_0x002c:
                    int r2 = r1.f6352a     // Catch:{ all -> 0x0062 }
                    int r2 = r2 + r4
                    r1.f6352a = r2     // Catch:{ all -> 0x0062 }
                    goto L_0x0047
                L_0x0032:
                    int r2 = r1.f6354c     // Catch:{ all -> 0x0062 }
                    int r2 = r2 + r4
                    r1.f6354c = r2     // Catch:{ all -> 0x0062 }
                    goto L_0x0047
                L_0x0038:
                    int r2 = r1.f6353b     // Catch:{ all -> 0x0062 }
                    int r2 = r2 + r4
                    r1.f6353b = r2     // Catch:{ all -> 0x0062 }
                    goto L_0x0047
                L_0x003e:
                    com.fyber.inneractive.sdk.a.a.a r1 = com.fyber.inneractive.sdk.p029a.p030a.C2682a.this     // Catch:{ all -> 0x0062 }
                    com.fyber.inneractive.sdk.a.a.c r2 = new com.fyber.inneractive.sdk.a.a.c     // Catch:{ all -> 0x0062 }
                    r2.<init>()     // Catch:{ all -> 0x0062 }
                    r1.f6322a = r2     // Catch:{ all -> 0x0062 }
                L_0x0047:
                    com.fyber.inneractive.sdk.a.a.a r1 = com.fyber.inneractive.sdk.p029a.p030a.C2682a.this     // Catch:{ all -> 0x0062 }
                    org.json.JSONObject r1 = r1.mo17892a()     // Catch:{ all -> 0x0062 }
                    java.lang.String r2 = "session_details.json"
                    android.app.Application r3 = com.fyber.inneractive.sdk.util.C3657l.m9125p()     // Catch:{ UnsupportedEncodingException -> 0x0060 }
                    java.lang.String r1 = r1.toString()     // Catch:{ UnsupportedEncodingException -> 0x0060 }
                    java.lang.String r4 = "UTF-8"
                    byte[] r1 = r1.getBytes(r4)     // Catch:{ UnsupportedEncodingException -> 0x0060 }
                    com.fyber.inneractive.sdk.util.C3657l.m9116a(r2, r3, r1)     // Catch:{ UnsupportedEncodingException -> 0x0060 }
                L_0x0060:
                    monitor-exit(r0)     // Catch:{ all -> 0x0062 }
                    return
                L_0x0062:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0062 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p029a.p030a.C2682a.C26863.run():void");
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JSONObject mo17892a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("currentSession", this.f6322a.mo17900a());
            for (Map.Entry next : this.f6323b.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                C2689b bVar = (C2689b) next.getKey();
                Iterator it = ((PriorityQueue) next.getValue()).iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C2691b) it.next()).mo17899a(true, true));
                }
                jSONObject.put(bVar.name(), jSONArray);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo17894a(C2689b bVar, C2691b bVar2) {
        synchronized (this.f6326e) {
            C2695d dVar = this.f6323b.get(bVar);
            if (dVar != null) {
                dVar.add(bVar2);
            }
        }
    }

    /* renamed from: a */
    public final JSONArray mo17891a(UnitDisplayType unitDisplayType) {
        String str;
        JSONArray jSONArray = new JSONArray();
        try {
            for (C2689b bVar : C2689b.values()) {
                if (bVar != C2689b.NONE && (unitDisplayType == null || bVar.f6349h == unitDisplayType)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", bVar.f6349h.value());
                    if (bVar.name().toLowerCase().contains("video")) {
                        str = "video";
                    } else {
                        str = "display";
                    }
                    jSONObject.put("subType", str);
                    C2695d dVar = this.f6323b.get(bVar);
                    int a = IAConfigManager.m5929c().f6586a.mo18046a("number_of_sessions", 5, 0);
                    if (a > 0 && dVar != null && dVar.size() >= a) {
                        jSONObject.put("sessionData", dVar.mo17901a(a, bVar.f6350i));
                        jSONArray.put(jSONObject);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    /* renamed from: a */
    public final void mo17895a(C2693c cVar) {
        C2691b bVar;
        for (C2689b bVar2 : C2689b.values()) {
            if (!(bVar2 == C2689b.NONE || (bVar = cVar.f6357a.get(bVar2)) == null || bVar.f6352a == 0)) {
                mo17894a(bVar2, bVar);
            }
        }
    }
}
