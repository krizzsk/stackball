package com.ogury.p245ed.internal;

/* renamed from: com.ogury.ed.internal.cw */
public final class C8122cw<T> implements C8115cr {

    /* renamed from: a */
    public static final C8123a f21054a = new C8123a((byte) 0);

    /* renamed from: b */
    private final C8431lj<T> f21055b;

    /* renamed from: c */
    private boolean f21056c;

    /* renamed from: d */
    private C8432lk<? super Throwable, C8386ke> f21057d;

    public /* synthetic */ C8122cw(C8431lj ljVar, byte b) {
        this(ljVar);
    }

    private C8122cw(C8431lj<? extends T> ljVar) {
        this.f21055b = ljVar;
    }

    /* renamed from: a */
    public final void mo53281a() {
        this.f21057d = null;
        this.f21056c = true;
    }

    /* renamed from: com.ogury.ed.internal.cw$a */
    public static final class C8123a {
        public /* synthetic */ C8123a(byte b) {
            this();
        }

        private C8123a() {
        }

        /* renamed from: a */
        public static <T> C8122cw<T> m22639a(C8431lj<? extends T> ljVar) {
            C8467mq.m23881b(ljVar, "callable");
            return new C8122cw<>(ljVar, (byte) 0);
        }
    }

    /* renamed from: a */
    public final C8122cw<T> mo53285a(C8432lk<? super Throwable, C8386ke> lkVar) {
        C8467mq.m23881b(lkVar, "consumer");
        this.f21057d = lkVar;
        return this;
    }

    /* renamed from: b */
    public final C8115cr mo53286b(C8432lk<? super T, C8386ke> lkVar) {
        C8467mq.m23881b(lkVar, "consumer");
        C8118cu cuVar = C8118cu.f21048a;
        C8118cu.m22621b().mo53278a(new Runnable(lkVar) {
            public final /* synthetic */ C8432lk f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C8122cw.m22633a(C8122cw.this, this.f$1);
            }
        });
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m22633a(C8122cw cwVar, C8432lk lkVar) {
        C8467mq.m23881b(cwVar, "this$0");
        C8467mq.m23881b(lkVar, "$consumer");
        try {
            cwVar.m22635a(lkVar, cwVar.f21055b.mo53190a());
        } catch (Throwable th) {
            C8432lk<? super Throwable, C8386ke> lkVar2 = cwVar.f21057d;
            if (lkVar2 != null) {
                cwVar.m22635a(lkVar2, th);
            }
        }
    }

    /* renamed from: a */
    private final <R> void m22635a(C8432lk<? super R, C8386ke> lkVar, R r) {
        C8118cu cuVar = C8118cu.f21048a;
        C8118cu.m22622c().mo53278a(new Runnable(lkVar, r) {
            public final /* synthetic */ C8432lk f$1;
            public final /* synthetic */ Object f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C8122cw.m22634a(C8122cw.this, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m22634a(C8122cw cwVar, C8432lk lkVar, Object obj) {
        C8467mq.m23881b(cwVar, "this$0");
        C8467mq.m23881b(lkVar, "$consumer");
        if (!cwVar.f21056c) {
            lkVar.mo53077a(obj);
        }
    }
}
