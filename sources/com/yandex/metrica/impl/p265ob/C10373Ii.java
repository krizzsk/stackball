package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.IParamsCallback;
import com.yandex.metrica.impl.p265ob.C11541n0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.yandex.metrica.impl.ob.Ii */
public class C10373Ii implements C10434Ki, C11011a1 {

    /* renamed from: j */
    static final Map<C10342Hi, IParamsCallback.Reason> f24906j = Collections.unmodifiableMap(new C10374a());

    /* renamed from: a */
    private final List<String> f24907a;

    /* renamed from: b */
    private final C11544n2 f24908b;

    /* renamed from: c */
    private final C10576Ni f24909c;

    /* renamed from: d */
    private final Handler f24910d;

    /* renamed from: e */
    private C10380Im f24911e;

    /* renamed from: f */
    private final C11541n0.C11542a f24912f;

    /* renamed from: g */
    private final Object f24913g;

    /* renamed from: h */
    private final Map<C11989yi, List<String>> f24914h;

    /* renamed from: i */
    private Map<String, String> f24915i;

    /* renamed from: com.yandex.metrica.impl.ob.Ii$a */
    class C10374a extends HashMap<C10342Hi, IParamsCallback.Reason> {
        C10374a() {
            put(C10342Hi.UNKNOWN, IParamsCallback.Reason.UNKNOWN);
            put(C10342Hi.NETWORK, IParamsCallback.Reason.NETWORK);
            put(C10342Hi.PARSE, IParamsCallback.Reason.INVALID_RESPONSE);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Ii$b */
    class C10375b implements C11541n0.C11542a {
        C10375b(C10373Ii ii) {
        }

        /* renamed from: a */
        public void mo61558a(int i, Bundle bundle) {
        }
    }

    public C10373Ii(Context context, C11544n2 n2Var, C10248F9 f9, Handler handler) {
        this(n2Var, new C10576Ni(context, f9), handler);
    }

    /* renamed from: f */
    private void m26588f() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry next : this.f24914h.entrySet()) {
            List list = (List) next.getValue();
            if (this.f24909c.mo61826a((Collection<String>) list)) {
                weakHashMap.put(next.getKey(), list);
            }
        }
        for (Map.Entry key : weakHashMap.entrySet()) {
            C11989yi yiVar = (C11989yi) key.getKey();
            if (yiVar != null) {
                m26587a(yiVar, new Bundle());
            }
        }
        weakHashMap.clear();
    }

    /* renamed from: a */
    public long mo61544a() {
        return this.f24909c.mo61831e();
    }

    /* renamed from: b */
    public String mo61552b() {
        return this.f24909c.mo61829c();
    }

    /* renamed from: c */
    public C10921Xa mo61554c() {
        return this.f24909c.mo61830d();
    }

    /* renamed from: d */
    public C10378Il mo61555d() {
        return this.f24909c.mo61832f();
    }

    /* renamed from: e */
    public String mo61556e() {
        return this.f24909c.mo61833g();
    }

    /* renamed from: g */
    public void mo61557g() {
        boolean b;
        synchronized (this.f24913g) {
            C10576Ni ni = this.f24909c;
            synchronized (ni) {
                b = ni.mo61828b((List<String>) Arrays.asList(new String[]{IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, "appmetrica_device_id_hash", "yandex_mobile_metrica_device_id", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url", "yandex_mobile_metrica_uuid"}));
            }
            if (b) {
                Map<String, String> map = this.f24915i;
                this.f24908b.mo63350a(this.f24907a, (ResultReceiver) new C11541n0(this.f24910d, this.f24912f), map);
            }
        }
    }

    C10373Ii(C11544n2 n2Var, C10576Ni ni, Handler handler) {
        this.f24907a = Arrays.asList(new String[]{"yandex_mobile_metrica_uuid", "yandex_mobile_metrica_device_id", "appmetrica_device_id_hash", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url", IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS});
        this.f24913g = new Object();
        this.f24914h = new WeakHashMap();
        this.f24908b = n2Var;
        this.f24909c = ni;
        this.f24910d = handler;
        this.f24912f = new C10375b(this);
    }

    /* renamed from: a */
    public void mo61546a(IIdentifierCallback iIdentifierCallback, List<String> list, Map<String, String> map) {
        C11688qi qiVar = new C11688qi(iIdentifierCallback);
        synchronized (this.f24913g) {
            this.f24909c.mo61824a(map);
            if (this.f24914h.isEmpty()) {
                this.f24908b.mo63363g();
            }
            this.f24914h.put(qiVar, list);
            if (this.f24909c.mo61828b(list)) {
                this.f24908b.mo63350a(list, (ResultReceiver) new C11541n0(this.f24910d, new C10407Ji(this, qiVar)), map);
            } else {
                m26587a((C11989yi) qiVar, new Bundle());
            }
        }
    }

    /* renamed from: b */
    public void mo61553b(String str) {
        synchronized (this.f24913g) {
            this.f24908b.mo63356b(str);
        }
    }

    /* renamed from: a */
    public void mo61545a(Bundle bundle, C11989yi yiVar) {
        synchronized (this.f24913g) {
            this.f24909c.mo61820a(bundle);
            m26588f();
            m26588f();
            if (yiVar != null) {
                m26587a(yiVar, bundle);
            }
        }
    }

    /* renamed from: a */
    public void mo61547a(C10380Im im) {
        this.f24911e = im;
    }

    /* renamed from: a */
    public void mo61550a(List<String> list) {
        synchronized (this.f24913g) {
            List<String> b = this.f24909c.mo61827b();
            if (C10796U2.m27896b((Collection) list)) {
                if (!C10796U2.m27896b((Collection) b)) {
                    this.f24909c.mo61822a((List<String>) null);
                    this.f24908b.mo63349a((List<String>) null);
                }
            } else if (!C10796U2.m27892a((Object) list, (Object) b)) {
                this.f24909c.mo61822a(list);
                this.f24908b.mo63349a(list);
            } else {
                this.f24908b.mo63349a(b);
            }
        }
    }

    /* renamed from: a */
    public void mo61551a(Map<String, String> map) {
        if (!C10796U2.m27897b((Map) map)) {
            synchronized (this.f24913g) {
                Map<String, String> i = C11993ym.m30999i(map);
                this.f24915i = i;
                this.f24908b.mo63351a(i);
                this.f24909c.mo61824a(i);
            }
        }
    }

    /* renamed from: a */
    public void mo61549a(String str) {
        synchronized (this.f24913g) {
            this.f24908b.mo63346a(str);
        }
    }

    /* renamed from: a */
    public void mo61548a(C10410Jl jl) {
        this.f24909c.mo61821a(jl);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26587a(com.yandex.metrica.impl.p265ob.C11989yi r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.util.Map<com.yandex.metrica.impl.ob.yi, java.util.List<java.lang.String>> r0 = r6.f24914h
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L_0x0099
            java.util.Map<com.yandex.metrica.impl.ob.yi, java.util.List<java.lang.String>> r0 = r6.f24914h
            java.lang.Object r0 = r0.get(r7)
            java.util.List r0 = (java.util.List) r0
            com.yandex.metrica.impl.ob.Ni r1 = r6.f24909c
            boolean r1 = r1.mo61826a((java.util.Collection<java.lang.String>) r0)
            r2 = 0
            if (r1 == 0) goto L_0x002a
            if (r0 != 0) goto L_0x001c
            goto L_0x0026
        L_0x001c:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.yandex.metrica.impl.ob.Ni r8 = r6.f24909c
            r8.mo61823a((java.util.List<java.lang.String>) r0, (java.util.Map<java.lang.String, com.yandex.metrica.impl.p265ob.C11258g1>) r2)
        L_0x0026:
            r7.onReceive(r2)
            goto L_0x0087
        L_0x002a:
            java.lang.String r1 = "startup_error_key_code"
            boolean r3 = r8.containsKey(r1)
            r4 = 1
            if (r3 == 0) goto L_0x0045
            int r8 = r8.getInt(r1)
            com.yandex.metrica.impl.ob.Hi r1 = com.yandex.metrica.impl.p265ob.C10342Hi.UNKNOWN
            if (r8 == r4) goto L_0x0042
            r3 = 2
            if (r8 == r3) goto L_0x003f
            goto L_0x0046
        L_0x003f:
            com.yandex.metrica.impl.ob.Hi r1 = com.yandex.metrica.impl.p265ob.C10342Hi.PARSE
            goto L_0x0046
        L_0x0042:
            com.yandex.metrica.impl.ob.Hi r1 = com.yandex.metrica.impl.p265ob.C10342Hi.NETWORK
            goto L_0x0046
        L_0x0045:
            r1 = r2
        L_0x0046:
            if (r1 != 0) goto L_0x0065
            com.yandex.metrica.impl.ob.Ni r8 = r6.f24909c
            boolean r8 = r8.mo61825a()
            if (r8 != 0) goto L_0x0063
            com.yandex.metrica.impl.ob.Im r8 = r6.f24911e
            if (r8 == 0) goto L_0x0060
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.util.Map<java.lang.String, java.lang.String> r4 = r6.f24915i
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "Clids error. Passed clids: %s, and clids from server are empty."
            r8.mo64226c(r4, r3)
        L_0x0060:
            com.yandex.metrica.IParamsCallback$Reason r8 = com.yandex.metrica.IParamsCallback.Reason.INCONSISTENT_CLIDS
            goto L_0x0066
        L_0x0063:
            com.yandex.metrica.impl.ob.Hi r1 = com.yandex.metrica.impl.p265ob.C10342Hi.UNKNOWN
        L_0x0065:
            r8 = r2
        L_0x0066:
            if (r8 != 0) goto L_0x0077
            java.util.Map<com.yandex.metrica.impl.ob.Hi, com.yandex.metrica.IParamsCallback$Reason> r8 = f24906j
            com.yandex.metrica.IParamsCallback$Reason r3 = com.yandex.metrica.IParamsCallback.Reason.UNKNOWN
            java.lang.Object r8 = r8.get(r1)
            if (r8 != 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r3 = r8
        L_0x0074:
            r8 = r3
            com.yandex.metrica.IParamsCallback$Reason r8 = (com.yandex.metrica.IParamsCallback.Reason) r8
        L_0x0077:
            if (r0 != 0) goto L_0x007a
            goto L_0x0084
        L_0x007a:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.yandex.metrica.impl.ob.Ni r1 = r6.f24909c
            r1.mo61823a((java.util.List<java.lang.String>) r0, (java.util.Map<java.lang.String, com.yandex.metrica.impl.p265ob.C11258g1>) r2)
        L_0x0084:
            r7.mo63552a(r8, r2)
        L_0x0087:
            java.util.Map<com.yandex.metrica.impl.ob.yi, java.util.List<java.lang.String>> r8 = r6.f24914h
            r8.remove(r7)
            java.util.Map<com.yandex.metrica.impl.ob.yi, java.util.List<java.lang.String>> r7 = r6.f24914h
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0099
            com.yandex.metrica.impl.ob.n2 r7 = r6.f24908b
            r7.mo63362f()
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10373Ii.m26587a(com.yandex.metrica.impl.ob.yi, android.os.Bundle):void");
    }
}
