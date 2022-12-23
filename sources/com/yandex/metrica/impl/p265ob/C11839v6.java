package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.v6 */
public class C11839v6 {

    /* renamed from: a */
    private final C11229f4 f28449a;

    /* renamed from: b */
    private final C11808u6 f28450b;

    /* renamed from: c */
    private final C11840a f28451c;

    /* renamed from: d */
    private final C10415K0 f28452d;

    /* renamed from: e */
    private final C11591o6<C11674q6> f28453e;

    /* renamed from: f */
    private final C11591o6<C11674q6> f28454f;

    /* renamed from: g */
    private C11622p6 f28455g;

    /* renamed from: h */
    private C11841b f28456h;

    /* renamed from: com.yandex.metrica.impl.ob.v6$a */
    public interface C11840a {
        /* renamed from: a */
        void mo62892a(C11411k0 k0Var, C11904w6 w6Var);
    }

    /* renamed from: com.yandex.metrica.impl.ob.v6$b */
    public enum C11841b {
        EMPTY,
        BACKGROUND,
        FOREGROUND
    }

    public C11839v6(C11229f4 f4Var, C11808u6 u6Var, C11840a aVar) {
        this(f4Var, u6Var, aVar, new C11554n6(f4Var, u6Var), new C11519m6(f4Var, u6Var), new C10415K0(f4Var.mo62874g()));
    }

    /* renamed from: e */
    private void m30564e(C11411k0 k0Var) {
        if (this.f28456h == null) {
            C11622p6 b = ((C11483l6) this.f28453e).mo63271b();
            if (m30562a(b, k0Var)) {
                this.f28455g = b;
                this.f28456h = C11841b.FOREGROUND;
                return;
            }
            C11622p6 b2 = ((C11483l6) this.f28454f).mo63271b();
            if (m30562a(b2, k0Var)) {
                this.f28455g = b2;
                this.f28456h = C11841b.BACKGROUND;
                return;
            }
            this.f28455g = null;
            this.f28456h = C11841b.EMPTY;
        }
    }

    /* renamed from: a */
    public synchronized long mo63818a() {
        C11622p6 p6Var;
        p6Var = this.f28455g;
        return p6Var == null ? 10000000000L : p6Var.mo63463c() - 1;
    }

    /* renamed from: b */
    public C11904w6 mo63819b(C11411k0 k0Var) {
        return m30561a(mo63820c(k0Var), k0Var.mo63152e());
    }

    /* renamed from: c */
    public synchronized C11622p6 mo63820c(C11411k0 k0Var) {
        m30564e(k0Var);
        C11841b bVar = this.f28456h;
        C11841b bVar2 = C11841b.EMPTY;
        if (bVar != bVar2 && !m30562a(this.f28455g, k0Var)) {
            this.f28456h = bVar2;
            this.f28455g = null;
        }
        int ordinal = this.f28456h.ordinal();
        if (ordinal == 1) {
            this.f28455g.mo63464c(k0Var.mo63152e());
            return this.f28455g;
        } else if (ordinal != 2) {
            this.f28456h = C11841b.BACKGROUND;
            long e = k0Var.mo63152e();
            C11622p6 a = ((C11483l6) this.f28454f).mo63269a(new C11674q6(e, k0Var.mo63153f()));
            if (this.f28449a.mo62889w().mo61498m()) {
                this.f28451c.mo62892a(C11411k0.m29408a(k0Var, this.f28452d), m30561a(a, k0Var.mo63152e()));
            } else if (k0Var.mo63161n() == C11413k1.EVENT_TYPE_FIRST_ACTIVATION.mo63170b()) {
                this.f28451c.mo62892a(k0Var, m30561a(a, e));
                this.f28451c.mo62892a(C11411k0.m29408a(k0Var, this.f28452d), m30561a(a, e));
            }
            this.f28455g = a;
            return a;
        } else {
            return this.f28455g;
        }
    }

    /* renamed from: d */
    public synchronized void mo63821d(C11411k0 k0Var) {
        m30564e(k0Var);
        int ordinal = this.f28456h.ordinal();
        if (ordinal == 0) {
            this.f28455g = m30560a(k0Var);
        } else if (ordinal == 1) {
            m30563b(this.f28455g, k0Var);
            this.f28455g = m30560a(k0Var);
        } else if (ordinal == 2) {
            if (m30562a(this.f28455g, k0Var)) {
                this.f28455g.mo63464c(k0Var.mo63152e());
            } else {
                this.f28455g = m30560a(k0Var);
            }
        }
    }

    /* renamed from: f */
    public C11904w6 mo63822f(C11411k0 k0Var) {
        C11622p6 p6Var;
        boolean z;
        if (this.f28456h == null) {
            p6Var = ((C11483l6) this.f28453e).mo63271b();
            boolean z2 = false;
            if (p6Var == null) {
                z = false;
            } else {
                z = p6Var.mo63462b(k0Var.mo63152e());
            }
            if (z) {
                p6Var = ((C11483l6) this.f28454f).mo63271b();
                if (p6Var != null) {
                    z2 = p6Var.mo63462b(k0Var.mo63152e());
                }
                if (z2) {
                    p6Var = null;
                }
            }
        } else {
            p6Var = this.f28455g;
        }
        if (p6Var != null) {
            return new C11904w6().mo64018c(p6Var.mo63463c()).mo64013a(p6Var.mo63466e()).mo64016b(p6Var.mo63465d()).mo64014a(p6Var.mo63467f());
        }
        long f = k0Var.mo63153f();
        long a = this.f28450b.mo63770a();
        C11782t8 i = this.f28449a.mo62876i();
        C12017z6 z6Var = C12017z6.BACKGROUND;
        i.mo63709a(a, z6Var, f);
        return new C11904w6().mo64018c(a).mo64014a(z6Var).mo64013a(0).mo64016b(0);
    }

    /* renamed from: g */
    public synchronized void mo63823g(C11411k0 k0Var) {
        mo63820c(k0Var).mo63460a(false);
        C11841b bVar = this.f28456h;
        C11841b bVar2 = C11841b.EMPTY;
        if (bVar != bVar2) {
            m30563b(this.f28455g, k0Var);
        }
        this.f28456h = bVar2;
    }

    /* renamed from: a */
    private C11622p6 m30560a(C11411k0 k0Var) {
        long e = k0Var.mo63152e();
        C11622p6 a = ((C11483l6) this.f28453e).mo63269a(new C11674q6(e, k0Var.mo63153f()));
        this.f28456h = C11841b.FOREGROUND;
        this.f28449a.mo62879l().mo62377c();
        this.f28451c.mo62892a(C11411k0.m29408a(k0Var, this.f28452d), m30561a(a, e));
        return a;
    }

    /* renamed from: b */
    private void m30563b(C11622p6 p6Var, C11411k0 k0Var) {
        if (p6Var.mo63468h()) {
            this.f28451c.mo62892a(C11411k0.m29406a(k0Var), new C11904w6().mo64018c(p6Var.mo63463c()).mo64014a(p6Var.mo63467f()).mo64013a(p6Var.mo63466e()).mo64016b(p6Var.mo63461b()));
            p6Var.mo63460a(false);
        }
        p6Var.mo63469i();
    }

    public C11839v6(C11229f4 f4Var, C11808u6 u6Var, C11840a aVar, C11591o6<C11674q6> o6Var, C11591o6<C11674q6> o6Var2, C10415K0 k0) {
        this.f28456h = null;
        this.f28449a = f4Var;
        this.f28451c = aVar;
        this.f28453e = o6Var;
        this.f28454f = o6Var2;
        this.f28450b = u6Var;
        this.f28452d = k0;
    }

    /* renamed from: a */
    private boolean m30562a(C11622p6 p6Var, C11411k0 k0Var) {
        if (p6Var == null) {
            return false;
        }
        if (p6Var.mo63462b(k0Var.mo63152e())) {
            return true;
        }
        m30563b(p6Var, k0Var);
        return false;
    }

    /* renamed from: a */
    private C11904w6 m30561a(C11622p6 p6Var, long j) {
        return new C11904w6().mo64018c(p6Var.mo63463c()).mo64013a(p6Var.mo63466e()).mo64016b(p6Var.mo63459a(j)).mo64014a(p6Var.mo63467f());
    }
}
