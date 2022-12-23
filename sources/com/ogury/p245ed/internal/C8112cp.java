package com.ogury.p245ed.internal;

/* renamed from: com.ogury.ed.internal.cp */
public final class C8112cp implements C8115cr {

    /* renamed from: a */
    public static final C8113a f21042a = new C8113a((byte) 0);

    /* renamed from: b */
    private final C8431lj<C8386ke> f21043b;

    /* renamed from: c */
    private boolean f21044c;

    /* renamed from: d */
    private C8432lk<? super Throwable, C8386ke> f21045d;

    public /* synthetic */ C8112cp(C8431lj ljVar, byte b) {
        this(ljVar);
    }

    private C8112cp(C8431lj<C8386ke> ljVar) {
        this.f21043b = ljVar;
    }

    /* renamed from: a */
    public final void mo53281a() {
        this.f21045d = null;
        this.f21044c = true;
    }

    /* renamed from: com.ogury.ed.internal.cp$a */
    public static final class C8113a {
        public /* synthetic */ C8113a(byte b) {
            this();
        }

        private C8113a() {
        }

        /* renamed from: a */
        public static C8112cp m22614a(C8431lj<C8386ke> ljVar) {
            C8467mq.m23881b(ljVar, "action");
            return new C8112cp(ljVar, (byte) 0);
        }
    }

    /* renamed from: a */
    public final C8112cp mo53279a(C8432lk<? super Throwable, C8386ke> lkVar) {
        C8467mq.m23881b(lkVar, "consumer");
        this.f21045d = lkVar;
        return this;
    }

    /* renamed from: a */
    public final C8115cr mo53280a(C8431lj<C8386ke> ljVar) {
        C8467mq.m23881b(ljVar, "subscribedAction");
        C8118cu cuVar = C8118cu.f21048a;
        C8118cu.m22621b().mo53278a(new Runnable(ljVar) {
            public final /* synthetic */ C8431lj f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C8112cp.m22606a(C8112cp.this, this.f$1);
            }
        });
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m22606a(C8112cp cpVar, C8431lj ljVar) {
        C8467mq.m23881b(cpVar, "this$0");
        C8467mq.m23881b(ljVar, "$subscribedAction");
        try {
            cpVar.f21043b.mo53190a();
            cpVar.m22610b(ljVar);
        } catch (Throwable th) {
            C8432lk<? super Throwable, C8386ke> lkVar = cpVar.f21045d;
            if (lkVar != null) {
                cpVar.m22608a(lkVar, th);
            }
        }
    }

    /* renamed from: b */
    private final void m22610b(C8431lj<C8386ke> ljVar) {
        C8118cu cuVar = C8118cu.f21048a;
        C8118cu.m22622c().mo53278a(new Runnable(ljVar) {
            public final /* synthetic */ C8431lj f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C8112cp.m22609b(C8112cp.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m22609b(C8112cp cpVar, C8431lj ljVar) {
        C8467mq.m23881b(cpVar, "this$0");
        C8467mq.m23881b(ljVar, "$action");
        if (!cpVar.f21044c) {
            ljVar.mo53190a();
        }
    }

    /* renamed from: a */
    private final <R> void m22608a(C8432lk<? super R, C8386ke> lkVar, R r) {
        C8118cu cuVar = C8118cu.f21048a;
        C8118cu.m22622c().mo53278a(new Runnable(lkVar, r) {
            public final /* synthetic */ C8432lk f$1;
            public final /* synthetic */ Object f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C8112cp.m22607a(C8112cp.this, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m22607a(C8112cp cpVar, C8432lk lkVar, Object obj) {
        C8467mq.m23881b(cpVar, "this$0");
        C8467mq.m23881b(lkVar, "$consumer");
        if (!cpVar.f21044c) {
            lkVar.mo53077a(obj);
        }
    }
}
