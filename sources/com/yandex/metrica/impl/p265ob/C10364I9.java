package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10766T1;

/* renamed from: com.yandex.metrica.impl.ob.I9 */
public class C10364I9 extends C10333H9 implements C10644Ph {

    /* renamed from: c */
    static final C11984ye f24876c = new C11984ye("LOCATION_TRACKING_ENABLED", (String) null);

    /* renamed from: d */
    static final C11984ye f24877d = new C11984ye("PREF_KEY_OFFSET", (String) null);

    /* renamed from: e */
    static final C11984ye f24878e = new C11984ye("UNCHECKED_TIME", (String) null);

    /* renamed from: f */
    static final C11984ye f24879f = new C11984ye("STATISTICS_RESTRICTED_IN_MAIN", (String) null);

    /* renamed from: g */
    static final C11984ye f24880g = new C11984ye("LAST_IDENTITY_LIGHT_SEND_TIME", (String) null);

    /* renamed from: h */
    static final C11984ye f24881h = new C11984ye("NEXT_REPORT_SEND_ATTEMPT_NUMBER", (String) null);

    /* renamed from: i */
    static final C11984ye f24882i = new C11984ye("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", (String) null);

    /* renamed from: j */
    static final C11984ye f24883j = new C11984ye("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", (String) null);

    /* renamed from: k */
    static final C11984ye f24884k = new C11984ye("LAST_REPORT_SEND_ATTEMPT_TIME", (String) null);

    /* renamed from: l */
    static final C11984ye f24885l = new C11984ye("LAST_LOCATION_SEND_ATTEMPT_TIME", (String) null);

    /* renamed from: m */
    static final C11984ye f24886m = new C11984ye("LAST_STARTUP_SEND_ATTEMPT_TIME", (String) null);

    /* renamed from: n */
    private static final C11984ye f24887n = new C11984ye("LAST_MIGRATION_VERSION", (String) null);

    /* renamed from: o */
    static final C11984ye f24888o = new C11984ye("LAST_WIFI_SCANNING_ATTEMPT_TIME", (String) null);

    /* renamed from: p */
    static final C11984ye f24889p = new C11984ye("LAST_LBS_SCANNING_ATTEMPT_TIME", (String) null);

    /* renamed from: q */
    static final C11984ye f24890q = new C11984ye("LAST_GPS_SCANNING_ATTEMPT_TIME", (String) null);

    /* renamed from: r */
    static final C11984ye f24891r = new C11984ye("LAST_FUSED_SCANNING_ATTEMPT_TIME", (String) null);

    /* renamed from: s */
    static final C11984ye f24892s = new C11984ye("SATELLITE_PRELOAD_INFO_CHECKED", (String) null);

    /* renamed from: t */
    static final C11984ye f24893t = new C11984ye("SATELLITE_CLIDS_CHECKED", (String) null);

    /* renamed from: u */
    static final C11984ye f24894u = new C11984ye("CERTIFICATE_REQUEST_ETAG", (String) null);

    /* renamed from: v */
    static final C11984ye f24895v = new C11984ye("CERTIFICATE_REQUEST_NEXT_ATTEMPT_TIME", (String) null);

    static {
        new C11984ye("SDKFCE", (String) null);
        new C11984ye("FST", (String) null);
        new C11984ye("LSST", (String) null);
        new C11984ye("FSDKFCO", (String) null);
        new C11984ye("SRSDKFC", (String) null);
        new C11984ye("LSDKFCAT", (String) null);
    }

    public C10364I9(C12019z8 z8Var) {
        super(z8Var);
    }

    @Deprecated
    /* renamed from: a */
    public int mo61500a(int i) {
        return mo61442a(f24887n.mo64145a(), i);
    }

    /* renamed from: b */
    public long mo61508b(int i) {
        return mo61443a(f24877d.mo64145a(), (long) i);
    }

    /* renamed from: c */
    public C10364I9 mo61515c(boolean z) {
        return (C10364I9) mo61451b(f24878e.mo64145a(), z);
    }

    /* renamed from: d */
    public void mo61517d(boolean z) {
        mo61451b(f24876c.mo64145a(), z).mo61454c();
    }

    /* renamed from: e */
    public Boolean mo61519e() {
        C11984ye yeVar = f24879f;
        if (mo61452b(yeVar.mo64145a())) {
            return Boolean.valueOf(mo61446a(yeVar.mo64145a(), true));
        }
        return null;
    }

    /* renamed from: f */
    public boolean mo61521f() {
        return mo61446a(f24876c.mo64145a(), false);
    }

    /* renamed from: g */
    public C10364I9 mo61523g(long j) {
        return (C10364I9) mo61448b(f24891r.mo64145a(), j);
    }

    /* renamed from: h */
    public C10364I9 mo61525h(long j) {
        return (C10364I9) mo61448b(f24890q.mo64145a(), j);
    }

    /* renamed from: i */
    public C10364I9 mo61527i(long j) {
        return (C10364I9) mo61448b(f24880g.mo64145a(), j);
    }

    /* renamed from: j */
    public C10364I9 mo61528j(long j) {
        return (C10364I9) mo61448b(f24889p.mo64145a(), j);
    }

    /* renamed from: k */
    public C10364I9 mo61530k(long j) {
        return (C10364I9) mo61448b(f24888o.mo64145a(), j);
    }

    /* renamed from: l */
    public C10364I9 mo61532l(long j) {
        return (C10364I9) mo61448b(f24877d.mo64145a(), j);
    }

    /* renamed from: a */
    public boolean mo61507a(boolean z) {
        return mo61446a(f24878e.mo64145a(), z);
    }

    /* renamed from: b */
    public C10364I9 mo61512b(boolean z) {
        return (C10364I9) mo61451b(f24879f.mo64145a(), z);
    }

    /* renamed from: c */
    public long mo61514c(long j) {
        return mo61443a(f24890q.mo64145a(), j);
    }

    /* renamed from: d */
    public long mo61516d(long j) {
        return mo61443a(f24880g.mo64145a(), j);
    }

    /* renamed from: f */
    public long mo61520f(long j) {
        return mo61443a(f24888o.mo64145a(), j);
    }

    /* renamed from: g */
    public C10364I9 mo61522g() {
        return (C10364I9) mo61451b(f24893t.mo64145a(), true);
    }

    /* renamed from: h */
    public C10364I9 mo61524h() {
        return (C10364I9) mo61451b(f24892s.mo64145a(), true);
    }

    @Deprecated
    /* renamed from: i */
    public C10364I9 mo61526i() {
        return (C10364I9) mo61457e(f24887n.mo64145a());
    }

    /* renamed from: j */
    public boolean mo61529j() {
        return mo61446a(f24892s.mo64145a(), false);
    }

    /* renamed from: k */
    public boolean mo61531k() {
        return mo61446a(f24893t.mo64145a(), false);
    }

    /* renamed from: a */
    public int mo61501a(C10766T1.C10767a aVar, int i) {
        C11984ye b = m26537b(aVar);
        return b == null ? i : mo61442a(b.mo64145a(), i);
    }

    /* renamed from: b */
    public C10364I9 mo61510b(C10766T1.C10767a aVar, int i) {
        C11984ye b = m26537b(aVar);
        return b != null ? (C10364I9) mo61447b(b.mo64145a(), i) : this;
    }

    /* renamed from: e */
    public long mo61518e(long j) {
        return mo61443a(f24889p.mo64145a(), j);
    }

    /* renamed from: a */
    public long mo61503a(C10766T1.C10767a aVar, long j) {
        C11984ye a = m26536a(aVar);
        return a == null ? j : mo61443a(a.mo64145a(), j);
    }

    /* renamed from: b */
    public C10364I9 mo61511b(C10766T1.C10767a aVar, long j) {
        C11984ye a = m26536a(aVar);
        return a != null ? (C10364I9) mo61448b(a.mo64145a(), j) : this;
    }

    /* renamed from: a */
    public C10364I9 mo61504a(String str, String str2, String str3) {
        return (C10364I9) mo61449b(new C11984ye("LAST_SOCKET_REPORT_TIMES_" + str + "_" + str2, (String) null).mo64145a(), str3);
    }

    /* renamed from: b */
    public long mo61509b(long j) {
        return mo61443a(f24891r.mo64145a(), j);
    }

    /* renamed from: b */
    public String mo61513b() {
        return mo61444a(f24894u.mo64145a(), (String) null);
    }

    /* renamed from: b */
    private C11984ye m26537b(C10766T1.C10767a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return f24881h;
        }
        if (ordinal == 1) {
            return f24882i;
        }
        if (ordinal != 2) {
            return null;
        }
        return f24883j;
    }

    /* renamed from: a */
    public C10644Ph mo61506a(String str) {
        return (C10644Ph) mo61449b(f24894u.mo64145a(), str);
    }

    /* renamed from: a */
    public long mo61502a() {
        return mo61443a(f24895v.mo64145a(), 0);
    }

    /* renamed from: a */
    public C10644Ph mo61505a(long j) {
        return (C10644Ph) mo61448b(f24895v.mo64145a(), j);
    }

    /* renamed from: a */
    private C11984ye m26536a(C10766T1.C10767a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return f24884k;
        }
        if (ordinal == 1) {
            return f24885l;
        }
        if (ordinal != 2) {
            return null;
        }
        return f24886m;
    }
}
