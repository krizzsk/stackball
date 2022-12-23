package com.yandex.mobile.ads.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

public class g40 implements h51 {

    /* renamed from: a */
    private final Executor f33875a;

    /* renamed from: com.yandex.mobile.ads.impl.g40$a */
    class C13171a implements Executor {

        /* renamed from: a */
        final /* synthetic */ Handler f33876a;

        C13171a(g40 g40, Handler handler) {
            this.f33876a = handler;
        }

        public void execute(Runnable runnable) {
            this.f33876a.post(runnable);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.g40$b */
    private static class C13172b implements Runnable {

        /* renamed from: b */
        private final l41 f33877b;

        /* renamed from: c */
        private final c51 f33878c;

        /* renamed from: d */
        private final Runnable f33879d;

        public C13172b(l41 l41, c51 c51, Runnable runnable) {
            this.f33877b = l41;
            this.f33878c = c51;
            this.f33879d = runnable;
        }

        public void run() {
            if (this.f33877b.mo68350n()) {
                this.f33877b.mo68341c("canceled-at-delivery");
                return;
            }
            c51 c51 = this.f33878c;
            op1 op1 = c51.f31812c;
            if (op1 == null) {
                this.f33877b.mo66996a(c51.f31810a);
            } else {
                this.f33877b.mo68336a(op1);
            }
            if (this.f33878c.f31813d) {
                this.f33877b.mo68337a("intermediate-response");
            } else {
                this.f33877b.mo68341c("done");
            }
            Runnable runnable = this.f33879d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public g40(Handler handler) {
        this.f33875a = new C13171a(this, handler);
    }

    /* renamed from: a */
    public void mo67181a(l41<?> l41, c51<?> c51) {
        l41.mo68351o();
        l41.mo68337a("post-response");
        this.f33875a.execute(new C13172b(l41, c51, (Runnable) null));
    }

    /* renamed from: a */
    public void mo67182a(l41<?> l41, c51<?> c51, Runnable runnable) {
        l41.mo68351o();
        l41.mo68337a("post-response");
        this.f33875a.execute(new C13172b(l41, c51, runnable));
    }

    /* renamed from: a */
    public void mo67183a(l41<?> l41, op1 op1) {
        l41.mo68337a("post-error");
        this.f33875a.execute(new C13172b(l41, c51.m34588a(op1), (Runnable) null));
    }
}
