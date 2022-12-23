package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Y */
public class C10941Y {

    /* renamed from: i */
    private static volatile C10941Y f26307i;

    /* renamed from: a */
    private final C10197Dm f26308a;

    /* renamed from: b */
    private final C11801u0 f26309b;

    /* renamed from: c */
    private final C11696qn f26310c;

    /* renamed from: d */
    private final C10443L1 f26311d;

    /* renamed from: e */
    private final C11962y f26312e;

    /* renamed from: f */
    private final C10353I2 f26313f;

    /* renamed from: g */
    private final C11328i0 f26314g;

    /* renamed from: h */
    private final C11924x f26315h;

    private C10941Y() {
        this(new C10197Dm(), new C11962y(), new C11696qn());
    }

    /* renamed from: g */
    public static C10941Y m28234g() {
        if (f26307i == null) {
            synchronized (C10941Y.class) {
                if (f26307i == null) {
                    f26307i = new C10941Y(new C10197Dm(), new C11962y(), new C11696qn());
                }
            }
        }
        return f26307i;
    }

    /* renamed from: a */
    public C11924x mo62497a() {
        return this.f26315h;
    }

    /* renamed from: b */
    public C11962y mo62498b() {
        return this.f26312e;
    }

    /* renamed from: c */
    public C11769sn mo62499c() {
        return this.f26310c.mo63560a();
    }

    /* renamed from: d */
    public C11696qn mo62500d() {
        return this.f26310c;
    }

    /* renamed from: e */
    public C11328i0 mo62501e() {
        return this.f26314g;
    }

    /* renamed from: f */
    public C11801u0 mo62502f() {
        return this.f26309b;
    }

    /* renamed from: h */
    public C10197Dm mo62503h() {
        return this.f26308a;
    }

    /* renamed from: i */
    public C10443L1 mo62504i() {
        return this.f26311d;
    }

    /* renamed from: j */
    public C10348Hm mo62505j() {
        return this.f26308a;
    }

    /* renamed from: k */
    public C10353I2 mo62506k() {
        return this.f26313f;
    }

    private C10941Y(C10197Dm dm, C11962y yVar, C11696qn qnVar) {
        this(dm, yVar, qnVar, new C11924x(yVar, qnVar.mo63560a()));
    }

    private C10941Y(C10197Dm dm, C11962y yVar, C11696qn qnVar, C11924x xVar) {
        this(dm, new C11801u0(), qnVar, xVar, new C10443L1(dm), yVar, new C10353I2(yVar, qnVar.mo63560a(), xVar), new C11328i0(yVar));
    }

    C10941Y(C10197Dm dm, C11801u0 u0Var, C11696qn qnVar, C11924x xVar, C10443L1 l1, C11962y yVar, C10353I2 i2, C11328i0 i0Var) {
        this.f26308a = dm;
        this.f26309b = u0Var;
        this.f26310c = qnVar;
        this.f26315h = xVar;
        this.f26311d = l1;
        this.f26312e = yVar;
        this.f26313f = i2;
        this.f26314g = i0Var;
    }
}
