package com.yandex.metrica.impl.p265ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.we */
public class C11912we extends C11715re {

    /* renamed from: A */
    private static final C11984ye f28650A = new C11984ye("PREF_KEY_EASY_COLLECTING_ENABLED_", (String) null);

    /* renamed from: p */
    static final C11984ye f28651p = new C11984ye("PREF_KEY_DEVICE_ID_", (String) null);

    /* renamed from: q */
    static final C11984ye f28652q = new C11984ye("PREF_KEY_UID_", (String) null);

    /* renamed from: r */
    private static final C11984ye f28653r = new C11984ye("PREF_KEY_HOST_URL_", (String) null);

    /* renamed from: s */
    private static final C11984ye f28654s = new C11984ye("PREF_KEY_REPORT_URL_", (String) null);

    /* renamed from: t */
    private static final C11984ye f28655t = new C11984ye("PREF_KEY_GET_AD_URL", (String) null);

    /* renamed from: u */
    private static final C11984ye f28656u = new C11984ye("PREF_KEY_REPORT_AD_URL", (String) null);

    /* renamed from: v */
    private static final C11984ye f28657v = new C11984ye("PREF_KEY_STARTUP_OBTAIN_TIME_", (String) null);

    /* renamed from: w */
    private static final C11984ye f28658w = new C11984ye("PREF_KEY_STARTUP_ENCODED_CLIDS_", (String) null);

    /* renamed from: x */
    private static final C11984ye f28659x = new C11984ye("PREF_KEY_DISTRIBUTION_REFERRER_", (String) null);

    /* renamed from: y */
    static final C11984ye f28660y = new C11984ye("STARTUP_CLIDS_MATCH_WITH_APP_CLIDS_", (String) null);

    /* renamed from: z */
    static final C11984ye f28661z = new C11984ye("PREF_KEY_PINNING_UPDATE_URL", (String) null);

    /* renamed from: f */
    private C11984ye f28662f;

    /* renamed from: g */
    private C11984ye f28663g;

    /* renamed from: h */
    private C11984ye f28664h;

    /* renamed from: i */
    private C11984ye f28665i;

    /* renamed from: j */
    private C11984ye f28666j;

    /* renamed from: k */
    private C11984ye f28667k;

    /* renamed from: l */
    private C11984ye f28668l;

    /* renamed from: m */
    private C11984ye f28669m;

    /* renamed from: n */
    private C11984ye f28670n;

    /* renamed from: o */
    private C11984ye f28671o;

    public C11912we(Context context) {
        this(context, (String) null);
    }

    /* renamed from: a */
    public long mo64031a(long j) {
        return this.f28085b.getLong(this.f28668l.mo64145a(), j);
    }

    /* renamed from: b */
    public String mo64032b(String str) {
        return this.f28085b.getString(this.f28662f.mo64145a(), (String) null);
    }

    /* renamed from: c */
    public String mo64033c(String str) {
        return this.f28085b.getString(this.f28669m.mo64145a(), (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo63538d() {
        return "_startupserviceinfopreferences";
    }

    /* renamed from: d */
    public String mo64034d(String str) {
        return this.f28085b.getString(this.f28666j.mo64145a(), (String) null);
    }

    /* renamed from: e */
    public String mo64035e(String str) {
        return this.f28085b.getString(this.f28664h.mo64145a(), (String) null);
    }

    /* renamed from: f */
    public String mo64036f(String str) {
        return this.f28085b.getString(this.f28667k.mo64145a(), (String) null);
    }

    /* renamed from: g */
    public String mo64038g(String str) {
        return this.f28085b.getString(this.f28665i.mo64145a(), (String) null);
    }

    /* renamed from: h */
    public String mo64039h(String str) {
        return this.f28085b.getString(this.f28663g.mo64145a(), (String) null);
    }

    /* renamed from: i */
    public C11912we mo64040i(String str) {
        return (C11912we) mo63598a(this.f28662f.mo64145a(), str);
    }

    /* renamed from: j */
    public C11912we mo64041j(String str) {
        return (C11912we) mo63598a(this.f28663g.mo64145a(), str);
    }

    public C11912we(Context context, String str) {
        super(context, str);
        this.f28662f = new C11984ye(f28651p.mo64147b());
        this.f28663g = new C11984ye(f28652q.mo64147b(), mo63600c());
        this.f28664h = new C11984ye(f28653r.mo64147b(), mo63600c());
        this.f28665i = new C11984ye(f28654s.mo64147b(), mo63600c());
        this.f28666j = new C11984ye(f28655t.mo64147b(), mo63600c());
        this.f28667k = new C11984ye(f28656u.mo64147b(), mo63600c());
        this.f28668l = new C11984ye(f28657v.mo64147b(), mo63600c());
        this.f28669m = new C11984ye(f28658w.mo64147b(), mo63600c());
        this.f28670n = new C11984ye(f28659x.mo64147b(), mo63600c());
        this.f28671o = new C11984ye(f28650A.mo64147b(), mo63600c());
    }

    /* renamed from: b */
    public static void m30775b(Context context) {
        C11327i.m29165a(context, "_startupserviceinfopreferences").edit().remove(f28651p.mo64147b()).apply();
    }

    /* renamed from: f */
    public void mo64037f() {
        mo63597a(this.f28662f.mo64145a()).mo63597a(this.f28663g.mo64145a()).mo63597a(this.f28664h.mo64145a()).mo63597a(this.f28665i.mo64145a()).mo63597a(this.f28666j.mo64145a()).mo63597a(this.f28667k.mo64145a()).mo63597a(this.f28668l.mo64145a()).mo63597a(this.f28671o.mo64145a()).mo63597a(this.f28669m.mo64145a()).mo63597a(this.f28670n.mo64147b()).mo63597a(f28660y.mo64147b()).mo63597a(f28661z.mo64147b()).mo63599b();
    }
}
