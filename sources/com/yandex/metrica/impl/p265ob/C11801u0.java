package com.yandex.metrica.impl.p265ob;

import android.location.Location;
import com.yandex.metrica.C12043l;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.u0 */
public class C11801u0 implements C11899w1 {

    /* renamed from: a */
    private Location f28344a;

    /* renamed from: b */
    private Boolean f28345b;

    /* renamed from: c */
    private Boolean f28346c;

    /* renamed from: d */
    private Boolean f28347d;

    /* renamed from: e */
    private Map<String, String> f28348e = new LinkedHashMap();

    /* renamed from: f */
    private Map<String, String> f28349f = new LinkedHashMap();

    /* renamed from: g */
    private String f28350g;

    /* renamed from: h */
    private boolean f28351h;

    /* renamed from: i */
    private C11544n2 f28352i;

    /* renamed from: a */
    private static boolean m30472a(Object obj) {
        return obj == null;
    }

    /* renamed from: a */
    public void mo61678a(boolean z) {
        this.f28346c = Boolean.valueOf(z);
        m30473b();
    }

    /* renamed from: b */
    public void mo61681b(boolean z) {
        this.f28345b = Boolean.valueOf(z);
        m30473b();
    }

    /* renamed from: c */
    public void mo61682c(String str, String str2) {
        this.f28349f.put(str, str2);
    }

    public void setStatisticsSending(boolean z) {
        this.f28347d = Boolean.valueOf(z);
        m30473b();
    }

    public void setUserProfileID(String str) {
        this.f28350g = str;
    }

    /* renamed from: b */
    private void m30474b(Map<String, String> map, C12043l.C12045b bVar) {
        if (!C10796U2.m27897b((Map) map)) {
            for (Map.Entry next : map.entrySet()) {
                bVar.mo64257b((String) next.getKey(), (String) next.getValue());
            }
        }
    }

    /* renamed from: a */
    public void mo61671a(Location location) {
        this.f28344a = location;
    }

    /* renamed from: a */
    public C12043l mo63754a(C12043l lVar) {
        if (this.f28351h) {
            return lVar;
        }
        C12043l.C12045b a = C12043l.m31130a(lVar.apiKey);
        a.mo64251a(lVar.f28946b, lVar.f28953i);
        a.mo64256b(lVar.f28945a);
        a.mo64246a(lVar.preloadInfo);
        a.mo64245a(lVar.location);
        if (C10796U2.m27891a((Object) lVar.f28948d)) {
            a.mo64250a(lVar.f28948d);
        }
        if (C10796U2.m27891a((Object) lVar.appVersion)) {
            a.mo64248a(lVar.appVersion);
        }
        if (C10796U2.m27891a((Object) lVar.f28950f)) {
            a.mo64255b(lVar.f28950f.intValue());
        }
        if (C10796U2.m27891a((Object) lVar.f28949e)) {
            a.mo64244a(lVar.f28949e.intValue());
        }
        if (C10796U2.m27891a((Object) lVar.f28951g)) {
            a.mo64259c(lVar.f28951g.intValue());
        }
        if (C10796U2.m27891a((Object) lVar.logs) && lVar.logs.booleanValue()) {
            a.mo64254b();
        }
        if (C10796U2.m27891a((Object) lVar.sessionTimeout)) {
            a.mo64264e(lVar.sessionTimeout.intValue());
        }
        if (C10796U2.m27891a((Object) lVar.crashReporting)) {
            a.mo64263d(lVar.crashReporting.booleanValue());
        }
        if (C10796U2.m27891a((Object) lVar.nativeCrashReporting)) {
            a.mo64266f(lVar.nativeCrashReporting.booleanValue());
        }
        if (C10796U2.m27891a((Object) lVar.locationTracking)) {
            a.mo64265e(lVar.locationTracking.booleanValue());
        }
        if (C10796U2.m27891a((Object) lVar.f28947c)) {
            a.f28962f = lVar.f28947c;
        }
        if (C10796U2.m27891a((Object) lVar.firstActivationAsUpdate)) {
            a.mo64252a(lVar.firstActivationAsUpdate.booleanValue());
        }
        if (C10796U2.m27891a((Object) lVar.statisticsSending)) {
            a.mo64270j(lVar.statisticsSending.booleanValue());
        }
        if (C10796U2.m27891a((Object) lVar.f28955k)) {
            a.mo64258b(lVar.f28955k.booleanValue());
        }
        if (C10796U2.m27891a((Object) lVar.maxReportsInDatabaseCount)) {
            a.mo64262d(lVar.maxReportsInDatabaseCount.intValue());
        }
        if (C10796U2.m27891a((Object) lVar.f28956l)) {
            a.mo64247a(lVar.f28956l);
        }
        if (C10796U2.m27891a((Object) lVar.userProfileID)) {
            a.mo64260c(lVar.userProfileID);
        }
        if (C10796U2.m27891a((Object) lVar.revenueAutoTrackingEnabled)) {
            a.mo64268h(lVar.revenueAutoTrackingEnabled.booleanValue());
        }
        if (C10796U2.m27891a((Object) lVar.appOpenTrackingEnabled)) {
            a.mo64261c(lVar.appOpenTrackingEnabled.booleanValue());
        }
        m30471a(this.f28348e, a);
        m30471a(lVar.f28952h, a);
        m30474b(this.f28349f, a);
        m30474b(lVar.errorEnvironment, a);
        Boolean bool = this.f28345b;
        if (m30472a((Object) lVar.locationTracking) && C10796U2.m27891a((Object) bool)) {
            a.mo64265e(bool.booleanValue());
        }
        Location location = this.f28344a;
        if (m30472a((Object) lVar.location) && C10796U2.m27891a((Object) location)) {
            a.mo64245a(location);
        }
        Boolean bool2 = this.f28347d;
        if (m30472a((Object) lVar.statisticsSending) && C10796U2.m27891a((Object) bool2)) {
            a.mo64270j(bool2.booleanValue());
        }
        if (!C10796U2.m27891a((Object) lVar.userProfileID) && C10796U2.m27891a((Object) this.f28350g)) {
            a.mo64260c(this.f28350g);
        }
        this.f28351h = true;
        this.f28344a = null;
        this.f28345b = null;
        this.f28347d = null;
        this.f28348e.clear();
        this.f28349f.clear();
        this.f28350g = null;
        return a.mo64253a();
    }

    /* renamed from: b */
    private void m30473b() {
        C11544n2 n2Var = this.f28352i;
        if (n2Var != null) {
            n2Var.mo63345a(this.f28345b, this.f28347d, this.f28346c);
        }
    }

    /* renamed from: a */
    private void m30471a(Map<String, String> map, C12043l.C12045b bVar) {
        if (!C10796U2.m27897b((Map) map)) {
            for (Map.Entry next : map.entrySet()) {
                bVar.mo64249a((String) next.getKey(), (String) next.getValue());
            }
        }
    }

    /* renamed from: a */
    public void mo63755a(C11544n2 n2Var) {
        this.f28352i = n2Var;
    }
}
