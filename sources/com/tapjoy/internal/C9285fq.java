package com.tapjoy.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TapjoyLog;
import com.tapjoy.internal.C9314gf;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tapjoy.internal.fq */
public abstract class C9285fq {

    /* renamed from: c */
    private static final String f22961c = C9285fq.class.getSimpleName();

    /* renamed from: a */
    public final Map f22962a = new HashMap();

    /* renamed from: b */
    public final Map f22963b = new HashMap();

    protected C9285fq(String str, String str2, String str3) {
        this.f22962a.put("placement", str);
        this.f22962a.put("placement_type", str2);
        this.f22962a.put(FirebaseAnalytics.Param.CONTENT_TYPE, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C9314gf.C9316a mo58147a(String str, Map map, Map map2) {
        C9314gf.C9316a b = C9314gf.m24967e(str).mo58196a().mo58200a(this.f22962a).mo58200a(map).mo58203b(map2);
        this.f22963b.put(str, b);
        return b;
    }

    /* renamed from: a */
    public final void mo58148a(String str, Object obj) {
        this.f22962a.put(str, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C9314gf.C9316a mo58150b(String str, Map map, Map map2) {
        C9314gf.C9316a aVar = !C9067al.m24297a(str) ? (C9314gf.C9316a) this.f22963b.remove(str) : null;
        if (aVar == null) {
            String str2 = f22961c;
            TapjoyLog.m24275e(str2, "Error when calling endTrackingEvent -- " + str + " tracking has not been started.");
        } else {
            aVar.mo58200a(this.f22962a).mo58200a(map).mo58203b(map2).mo58201b().mo58204c();
        }
        return aVar;
    }

    /* renamed from: a */
    public final C9314gf.C9316a mo58146a() {
        return mo58147a("Content.rendered", (Map) null, (Map) null);
    }

    /* renamed from: b */
    public final C9314gf.C9316a mo58149b() {
        return mo58150b("Content.rendered", (Map) null, (Map) null);
    }
}
