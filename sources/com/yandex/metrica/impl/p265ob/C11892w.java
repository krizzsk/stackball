package com.yandex.metrica.impl.p265ob;

import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.w */
public class C11892w {

    /* renamed from: c */
    public static final long f28609c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a */
    private long f28610a;

    /* renamed from: b */
    private final C10580Nm f28611b;

    /* renamed from: com.yandex.metrica.impl.ob.w$a */
    class C11893a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11897c f28612a;

        C11893a(C11892w wVar, C11897c cVar) {
            this.f28612a = cVar;
        }

        public void run() {
            this.f28612a.mo61059a();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.w$c */
    public interface C11897c {
        /* renamed from: a */
        void mo61059a();
    }

    public C11892w() {
        this(new C10580Nm());
    }

    /* renamed from: a */
    public void mo63994a() {
        this.f28611b.getClass();
        this.f28610a = System.currentTimeMillis();
    }

    /* renamed from: com.yandex.metrica.impl.ob.w$b */
    public static class C11894b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f28613a = false;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C11897c f28614b;

        /* renamed from: c */
        private final C11892w f28615c;

        /* renamed from: com.yandex.metrica.impl.ob.w$b$a */
        class C11895a implements C11897c {

            /* renamed from: a */
            final /* synthetic */ Runnable f28616a;

            C11895a(Runnable runnable) {
                this.f28616a = runnable;
            }

            /* renamed from: a */
            public void mo61059a() {
                boolean unused = C11894b.this.f28613a = true;
                this.f28616a.run();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.w$b$b */
        class C11896b implements Runnable {
            C11896b() {
            }

            public void run() {
                C11894b.this.f28614b.mo61059a();
            }
        }

        C11894b(Runnable runnable, C11892w wVar) {
            this.f28614b = new C11895a(runnable);
            this.f28615c = wVar;
        }

        /* renamed from: a */
        public void mo63997a(long j, C11769sn snVar) {
            if (!this.f28613a) {
                this.f28615c.mo63995a(j, snVar, this.f28614b);
                return;
            }
            ((C11725rn) snVar).execute(new C11896b());
        }
    }

    C11892w(C10580Nm nm) {
        this.f28611b = nm;
    }

    /* renamed from: a */
    public void mo63995a(long j, C11769sn snVar, C11897c cVar) {
        this.f28611b.getClass();
        C11725rn rnVar = (C11725rn) snVar;
        rnVar.mo63613a(new C11893a(this, cVar), Math.max(j - (System.currentTimeMillis() - this.f28610a), 0));
    }
}
