package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.impl.p265ob.C10089A;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.te */
public class C11789te extends C11715re {

    /* renamed from: A */
    private static final C11984ye f28293A = new C11984ye("BG_SESSION_ID_", (String) null);

    /* renamed from: B */
    private static final C11984ye f28294B = new C11984ye("BG_SESSION_SLEEP_START_", (String) null);

    /* renamed from: C */
    private static final C11984ye f28295C = new C11984ye("BG_SESSION_COUNTER_ID_", (String) null);

    /* renamed from: D */
    private static final C11984ye f28296D = new C11984ye("BG_SESSION_INIT_TIME_", (String) null);

    /* renamed from: E */
    private static final C11984ye f28297E = new C11984ye("IDENTITY_SEND_TIME_", (String) null);

    /* renamed from: F */
    private static final C11984ye f28298F = new C11984ye("USER_INFO_", (String) null);

    /* renamed from: G */
    private static final C11984ye f28299G = new C11984ye("REFERRER_", (String) null);
    @Deprecated

    /* renamed from: H */
    public static final C11984ye f28300H = new C11984ye("APP_ENVIRONMENT", (String) null);
    @Deprecated

    /* renamed from: I */
    public static final C11984ye f28301I = new C11984ye("APP_ENVIRONMENT_REVISION", (String) null);

    /* renamed from: J */
    private static final C11984ye f28302J = new C11984ye("APP_ENVIRONMENT_", (String) null);

    /* renamed from: K */
    private static final C11984ye f28303K = new C11984ye("APP_ENVIRONMENT_REVISION_", (String) null);

    /* renamed from: u */
    private static final C11984ye f28304u = new C11984ye("SESSION_SLEEP_START_", (String) null);

    /* renamed from: v */
    private static final C11984ye f28305v = new C11984ye("SESSION_ID_", (String) null);

    /* renamed from: w */
    private static final C11984ye f28306w = new C11984ye("SESSION_COUNTER_ID_", (String) null);

    /* renamed from: x */
    private static final C11984ye f28307x = new C11984ye("SESSION_INIT_TIME_", (String) null);

    /* renamed from: y */
    private static final C11984ye f28308y = new C11984ye("SESSION_ALIVE_TIME_", (String) null);

    /* renamed from: z */
    private static final C11984ye f28309z = new C11984ye("SESSION_IS_ALIVE_REPORT_NEEDED_", (String) null);

    /* renamed from: f */
    private C11984ye f28310f = new C11984ye(f28304u.mo64147b(), mo63600c());

    /* renamed from: g */
    private C11984ye f28311g = new C11984ye(f28305v.mo64147b(), mo63600c());

    /* renamed from: h */
    private C11984ye f28312h = new C11984ye(f28306w.mo64147b(), mo63600c());

    /* renamed from: i */
    private C11984ye f28313i = new C11984ye(f28307x.mo64147b(), mo63600c());

    /* renamed from: j */
    private C11984ye f28314j = new C11984ye(f28308y.mo64147b(), mo63600c());

    /* renamed from: k */
    private C11984ye f28315k = new C11984ye(f28309z.mo64147b(), mo63600c());

    /* renamed from: l */
    private C11984ye f28316l = new C11984ye(f28293A.mo64147b(), mo63600c());

    /* renamed from: m */
    private C11984ye f28317m = new C11984ye(f28294B.mo64147b(), mo63600c());

    /* renamed from: n */
    private C11984ye f28318n = new C11984ye(f28295C.mo64147b(), mo63600c());

    /* renamed from: o */
    private C11984ye f28319o = new C11984ye(f28296D.mo64147b(), mo63600c());

    /* renamed from: p */
    private C11984ye f28320p = new C11984ye(f28297E.mo64147b(), mo63600c());

    /* renamed from: q */
    private C11984ye f28321q = new C11984ye(f28298F.mo64147b(), mo63600c());

    /* renamed from: r */
    private C11984ye f28322r = new C11984ye(f28299G.mo64147b(), mo63600c());

    /* renamed from: s */
    private C11984ye f28323s = new C11984ye(f28302J.mo64147b(), mo63600c());

    /* renamed from: t */
    private C11984ye f28324t = new C11984ye(f28303K.mo64147b(), mo63600c());

    public C11789te(Context context, String str) {
        super(context, str);
        m30427a(-1);
        m30429c(0);
        m30428b(0);
    }

    /* renamed from: a */
    public long mo63725a(long j) {
        return this.f28085b.getLong(this.f28319o.mo64145a(), j);
    }

    /* renamed from: b */
    public long mo63728b(long j) {
        return this.f28085b.getLong(this.f28318n.mo64145a(), j);
    }

    /* renamed from: c */
    public long mo63730c(long j) {
        return this.f28085b.getLong(this.f28316l.mo64145a(), j);
    }

    /* renamed from: d */
    public long mo63731d(long j) {
        return this.f28085b.getLong(this.f28317m.mo64145a(), j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo63538d() {
        return "_boundentrypreferences";
    }

    /* renamed from: e */
    public long mo63732e(long j) {
        return this.f28085b.getLong(this.f28313i.mo64145a(), j);
    }

    /* renamed from: f */
    public long mo63733f(long j) {
        return this.f28085b.getLong(this.f28312h.mo64145a(), j);
    }

    /* renamed from: g */
    public long mo63735g(long j) {
        return this.f28085b.getLong(this.f28311g.mo64145a(), j);
    }

    /* renamed from: h */
    public long mo63737h(long j) {
        return this.f28085b.getLong(this.f28310f.mo64145a(), j);
    }

    /* renamed from: i */
    public long mo63739i(long j) {
        return this.f28085b.getLong(this.f28320p.mo64145a(), j);
    }

    /* renamed from: c */
    private void m30429c(int i) {
        C11327i.m29169a(this.f28085b, this.f28310f.mo64145a(), i);
    }

    /* renamed from: a */
    public Boolean mo63727a(boolean z) {
        return Boolean.valueOf(this.f28085b.getBoolean(this.f28315k.mo64145a(), z));
    }

    /* renamed from: b */
    public String mo63729b(String str) {
        return this.f28085b.getString(this.f28321q.mo64145a(), (String) null);
    }

    /* renamed from: f */
    public C10089A.C10090a mo63734f() {
        synchronized (this) {
            if (!this.f28085b.contains(this.f28323s.mo64145a()) || !this.f28085b.contains(this.f28324t.mo64145a())) {
                return null;
            }
            C10089A.C10090a aVar = new C10089A.C10090a(this.f28085b.getString(this.f28323s.mo64145a(), "{}"), this.f28085b.getLong(this.f28324t.mo64145a(), 0));
            return aVar;
        }
    }

    /* renamed from: g */
    public boolean mo63736g() {
        return this.f28085b.contains(this.f28313i.mo64145a()) || this.f28085b.contains(this.f28314j.mo64145a()) || this.f28085b.contains(this.f28315k.mo64145a()) || this.f28085b.contains(this.f28310f.mo64145a()) || this.f28085b.contains(this.f28311g.mo64145a()) || this.f28085b.contains(this.f28312h.mo64145a()) || this.f28085b.contains(this.f28319o.mo64145a()) || this.f28085b.contains(this.f28317m.mo64145a()) || this.f28085b.contains(this.f28316l.mo64145a()) || this.f28085b.contains(this.f28318n.mo64145a()) || this.f28085b.contains(this.f28323s.mo64145a()) || this.f28085b.contains(this.f28321q.mo64145a()) || this.f28085b.contains(this.f28322r.mo64145a()) || this.f28085b.contains(this.f28320p.mo64145a());
    }

    /* renamed from: h */
    public void mo63738h() {
        this.f28085b.edit().remove(this.f28319o.mo64145a()).remove(this.f28318n.mo64145a()).remove(this.f28316l.mo64145a()).remove(this.f28317m.mo64145a()).remove(this.f28313i.mo64145a()).remove(this.f28312h.mo64145a()).remove(this.f28311g.mo64145a()).remove(this.f28310f.mo64145a()).remove(this.f28315k.mo64145a()).remove(this.f28314j.mo64145a()).remove(this.f28321q.mo64145a()).remove(this.f28323s.mo64145a()).remove(this.f28324t.mo64145a()).remove(this.f28322r.mo64145a()).remove(this.f28320p.mo64145a()).apply();
    }

    /* renamed from: i */
    public C11789te mo63740i() {
        return (C11789te) mo63597a(this.f28322r.mo64145a());
    }

    /* renamed from: b */
    private void m30428b(int i) {
        C11327i.m29169a(this.f28085b, this.f28312h.mo64145a(), i);
    }

    /* renamed from: a */
    public C11789te mo63726a(C10089A.C10090a aVar) {
        synchronized (this) {
            mo63598a(this.f28323s.mo64145a(), aVar.f24296a);
            mo63598a(this.f28324t.mo64145a(), Long.valueOf(aVar.f24297b));
        }
        return this;
    }

    /* renamed from: a */
    private void m30427a(int i) {
        C11327i.m29169a(this.f28085b, this.f28314j.mo64145a(), i);
    }
}
