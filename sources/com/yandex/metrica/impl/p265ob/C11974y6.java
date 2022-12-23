package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p265ob.C11993ym;

/* renamed from: com.yandex.metrica.impl.ob.y6 */
public class C11974y6 implements C11936x6 {

    /* renamed from: a */
    private final String f28767a;

    /* renamed from: b */
    protected final C10306G9 f28768b;

    /* renamed from: c */
    private C11993ym.C11994a f28769c;

    public C11974y6(C10306G9 g9, String str) {
        this.f28768b = g9;
        this.f28767a = str;
        C11993ym.C11994a aVar = new C11993ym.C11994a();
        try {
            String f = g9.mo61366f(str);
            if (!TextUtils.isEmpty(f)) {
                aVar = new C11993ym.C11994a(f);
            }
        } catch (Throwable unused) {
        }
        this.f28769c = aVar;
    }

    /* renamed from: a */
    public C11974y6 mo64121a(long j) {
        m30891a("SESSION_INIT_TIME", Long.valueOf(j));
        return this;
    }

    /* renamed from: b */
    public C11974y6 mo64124b(long j) {
        m30891a("SESSION_LAST_EVENT_OFFSET", Long.valueOf(j));
        return this;
    }

    /* renamed from: c */
    public Long mo64127c() {
        return this.f28769c.mo64175a("SESSION_INIT_TIME");
    }

    /* renamed from: d */
    public C11974y6 mo64128d(long j) {
        m30891a("SESSION_ID", Long.valueOf(j));
        return this;
    }

    /* renamed from: e */
    public Long mo64131e() {
        return this.f28769c.mo64175a("SESSION_COUNTER_ID");
    }

    /* renamed from: f */
    public Long mo64132f() {
        return this.f28769c.mo64175a("SESSION_ID");
    }

    /* renamed from: g */
    public Long mo64133g() {
        return this.f28769c.mo64175a("SESSION_SLEEP_START");
    }

    /* renamed from: h */
    public boolean mo64134h() {
        return this.f28769c.length() > 0;
    }

    /* renamed from: i */
    public Boolean mo64135i() {
        C11993ym.C11994a aVar = this.f28769c;
        aVar.getClass();
        try {
            return Boolean.valueOf(aVar.getBoolean("SESSION_IS_ALIVE_REPORT_NEEDED"));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public C11974y6 mo64122a(boolean z) {
        m30891a("SESSION_IS_ALIVE_REPORT_NEEDED", Boolean.valueOf(z));
        return this;
    }

    /* renamed from: b */
    public void mo64125b() {
        this.f28768b.mo61361c(this.f28767a, this.f28769c.toString());
        this.f28768b.mo61454c();
    }

    /* renamed from: c */
    public C11974y6 mo64126c(long j) {
        m30891a("SESSION_COUNTER_ID", Long.valueOf(j));
        return this;
    }

    /* renamed from: d */
    public Long mo64129d() {
        return this.f28769c.mo64175a("SESSION_LAST_EVENT_OFFSET");
    }

    /* renamed from: e */
    public C11974y6 mo64130e(long j) {
        m30891a("SESSION_SLEEP_START", Long.valueOf(j));
        return this;
    }

    /* renamed from: a */
    private void m30891a(String str, Object obj) {
        try {
            this.f28769c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo64123a() {
        this.f28769c = new C11993ym.C11994a();
        mo64125b();
    }
}
