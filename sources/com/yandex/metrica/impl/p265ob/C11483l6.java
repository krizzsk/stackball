package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11705r6;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.l6 */
public abstract class C11483l6 implements C11591o6<C11674q6> {

    /* renamed from: a */
    private final C11229f4 f27643a;

    /* renamed from: b */
    private final C11808u6 f27644b;

    /* renamed from: c */
    private final C11974y6 f27645c;

    /* renamed from: d */
    private final C11778t6 f27646d;

    /* renamed from: e */
    private final C10868W0 f27647e;

    /* renamed from: f */
    private final C10580Nm f27648f;

    public C11483l6(C11229f4 f4Var, C11808u6 u6Var, C11974y6 y6Var, C11778t6 t6Var, C10868W0 w0, C10580Nm nm) {
        this.f27643a = f4Var;
        this.f27644b = u6Var;
        this.f27645c = y6Var;
        this.f27646d = t6Var;
        this.f27647e = w0;
        this.f27648f = nm;
    }

    /* renamed from: a */
    public C11622p6 mo63269a(Object obj) {
        C11674q6 q6Var = (C11674q6) obj;
        if (this.f27645c.mo64134h()) {
            this.f27647e.reportEvent("create session with non-empty storage");
        }
        C11229f4 f4Var = this.f27643a;
        C11974y6 y6Var = this.f27645c;
        long a = this.f27644b.mo63770a();
        C11974y6 d = this.f27645c.mo64128d(a);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d.mo64130e(timeUnit.toSeconds(q6Var.f28006a)).mo64121a(q6Var.f28006a).mo64126c(0).mo64122a(true).mo64125b();
        this.f27643a.mo62876i().mo63709a(a, this.f27646d.mo63700b(), timeUnit.toSeconds(q6Var.f28007b));
        return new C11622p6(f4Var, y6Var, mo63270a(), new C10580Nm());
    }

    /* renamed from: b */
    public final C11622p6 mo63271b() {
        if (this.f27645c.mo64134h()) {
            return new C11622p6(this.f27643a, this.f27645c, mo63270a(), this.f27648f);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C11705r6 mo63270a() {
        C11705r6.C11707b d = new C11705r6.C11707b(this.f27646d).mo63579a(this.f27645c.mo64135i()).mo63581b(this.f27645c.mo64131e()).mo63580a(this.f27645c.mo64127c()).mo63582c(this.f27645c.mo64132f()).mo63583d(this.f27645c.mo64133g());
        d.f28064a = this.f27645c.mo64129d();
        return new C11705r6(d);
    }
}
