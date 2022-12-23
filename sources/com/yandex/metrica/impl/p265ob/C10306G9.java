package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10089A;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.G9 */
public class C10306G9 extends C10333H9 {

    /* renamed from: c */
    private static final C11984ye f24760c = new C11984ye("IDENTITY_SEND_TIME", (String) null);

    /* renamed from: d */
    private static final C11984ye f24761d = new C11984ye("PERMISSIONS_CHECK_TIME", (String) null);

    /* renamed from: e */
    private static final C11984ye f24762e = new C11984ye("USER_INFO", (String) null);

    /* renamed from: f */
    private static final C11984ye f24763f = new C11984ye("PROFILE_ID", (String) null);

    /* renamed from: g */
    private static final C11984ye f24764g = new C11984ye("APP_ENVIRONMENT", (String) null);

    /* renamed from: h */
    private static final C11984ye f24765h = new C11984ye("APP_ENVIRONMENT_REVISION", (String) null);

    /* renamed from: i */
    private static final C11984ye f24766i = new C11984ye("LAST_MIGRATION_VERSION", (String) null);

    /* renamed from: j */
    private static final C11984ye f24767j = new C11984ye("LAST_APP_VERSION_WITH_FEATURES", (String) null);

    /* renamed from: k */
    private static final C11984ye f24768k = new C11984ye("APPLICATION_FEATURES", (String) null);

    /* renamed from: l */
    private static final C11984ye f24769l = new C11984ye("LAST_STAT_SENDING_DISABLED_REPORTING_TIMESTAMP", (String) null);

    /* renamed from: m */
    private static final C11984ye f24770m = new C11984ye("CERTIFICATES_SHA1_FINGERPRINTS", (String) null);

    /* renamed from: n */
    static final C11984ye f24771n = new C11984ye("DEPRECATED_NATIVE_CRASHES_CHECKED", (String) null);

    /* renamed from: o */
    private static final C11984ye f24772o = new C11984ye("REFERRER_HANDLED", (String) null);

    public C10306G9(C12019z8 z8Var) {
        super(z8Var);
    }

    /* renamed from: a */
    public C10306G9 mo61357a(C10089A.C10090a aVar) {
        synchronized (this) {
            mo61449b(f24764g.mo64145a(), aVar.f24296a);
            mo61448b(f24765h.mo64145a(), aVar.f24297b);
        }
        return this;
    }

    /* renamed from: b */
    public long mo61359b(long j) {
        return mo61443a(f24760c.mo64145a(), j);
    }

    /* renamed from: c */
    public C10306G9 mo61360c(long j) {
        return (C10306G9) mo61448b(f24760c.mo64145a(), j);
    }

    /* renamed from: d */
    public C10306G9 mo61362d(long j) {
        return (C10306G9) mo61448b(f24769l.mo64145a(), j);
    }

    /* renamed from: e */
    public C10089A.C10090a mo61363e() {
        C10089A.C10090a aVar;
        synchronized (this) {
            aVar = new C10089A.C10090a(mo61444a(f24764g.mo64145a(), "{}"), mo61443a(f24765h.mo64145a(), 0));
        }
        return aVar;
    }

    /* renamed from: f */
    public String mo61365f() {
        return mo61444a(f24768k.mo64145a(), "");
    }

    /* renamed from: g */
    public C10306G9 mo61367g(String str) {
        return (C10306G9) mo61449b(f24768k.mo64145a(), str);
    }

    /* renamed from: h */
    public int mo61369h() {
        return mo61442a(f24767j.mo64145a(), -1);
    }

    /* renamed from: i */
    public C10306G9 mo61371i(String str) {
        return (C10306G9) mo61449b(f24762e.mo64145a(), str);
    }

    /* renamed from: j */
    public long mo61373j() {
        return mo61443a(f24769l.mo64145a(), 0);
    }

    /* renamed from: k */
    public long mo61374k() {
        return mo61443a(f24761d.mo64145a(), 0);
    }

    /* renamed from: l */
    public String mo61375l() {
        return mo61455d(f24763f.mo64145a());
    }

    /* renamed from: m */
    public String mo61376m() {
        return mo61444a(f24762e.mo64145a(), (String) null);
    }

    /* renamed from: n */
    public boolean mo61377n() {
        return mo61446a(f24771n.mo64145a(), false);
    }

    /* renamed from: o */
    public C10306G9 mo61378o() {
        return (C10306G9) mo61451b(f24771n.mo64145a(), true);
    }

    @Deprecated
    /* renamed from: p */
    public C10306G9 mo61379p() {
        return (C10306G9) mo61451b(f24772o.mo64145a(), true);
    }

    @Deprecated
    /* renamed from: q */
    public C10306G9 mo61380q() {
        return (C10306G9) mo61457e(f24766i.mo64145a());
    }

    @Deprecated
    /* renamed from: r */
    public C10306G9 mo61381r() {
        return (C10306G9) mo61457e(f24772o.mo64145a());
    }

    @Deprecated
    /* renamed from: s */
    public Boolean mo61382s() {
        C11984ye yeVar = f24772o;
        if (!mo61452b(yeVar.mo64145a())) {
            return null;
        }
        return Boolean.valueOf(mo61446a(yeVar.mo64145a(), false));
    }

    /* renamed from: c */
    public C10306G9 mo61361c(String str, String str2) {
        return (C10306G9) mo61449b(new C11984ye("SESSION_", str).mo64145a(), str2);
    }

    /* renamed from: f */
    public String mo61366f(String str) {
        return mo61444a(new C11984ye("SESSION_", str).mo64145a(), "");
    }

    /* renamed from: g */
    public List<String> mo61368g() {
        return mo61445a(f24770m.mo64145a(), (List<String>) Collections.emptyList());
    }

    /* renamed from: h */
    public C10306G9 mo61370h(String str) {
        return (C10306G9) mo61449b(f24763f.mo64145a(), str);
    }

    @Deprecated
    /* renamed from: i */
    public Integer mo61372i() {
        C11984ye yeVar = f24766i;
        if (!mo61452b(yeVar.mo64145a())) {
            return null;
        }
        return Integer.valueOf((int) mo61443a(yeVar.mo64145a(), 0));
    }

    /* renamed from: a */
    public C10306G9 mo61356a(int i) {
        return (C10306G9) mo61447b(f24767j.mo64145a(), i);
    }

    /* renamed from: a */
    public C10306G9 mo61358a(List<String> list) {
        return (C10306G9) mo61450b(f24770m.mo64145a(), list);
    }

    /* renamed from: e */
    public C10306G9 mo61364e(long j) {
        return (C10306G9) mo61448b(f24761d.mo64145a(), j);
    }
}
