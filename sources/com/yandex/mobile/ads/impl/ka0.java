package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ia0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

class ka0 {

    /* renamed from: a */
    private final Executor f36073a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    private final ma0 f36074b = new ma0();

    /* renamed from: c */
    private final ja0 f36075c = new ja0();

    /* renamed from: com.yandex.mobile.ads.impl.ka0$a */
    private class C13694a implements Runnable {

        /* renamed from: b */
        private final la0 f36076b;

        public C13694a(la0 la0) {
            this.f36076b = la0;
        }

        public void run() {
            Boolean bool;
            try {
                bool = ka0.m38272a(ka0.this);
            } catch (Throwable unused) {
                bool = null;
            }
            ((ia0.C13402a) this.f36076b).mo67763a(bool);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo68188a(la0 la0) {
        this.f36073a.execute(new C13694a(la0));
    }

    /* renamed from: a */
    static Boolean m38272a(ka0 ka0) throws ExecutionException, InterruptedException {
        Future<na0> a = ka0.f36074b.mo68632a("yandex.ru");
        Future<na0> a2 = ka0.f36074b.mo68632a("mobile.yandexadexchange.net");
        boolean a3 = ((na0) ((FutureTask) a).get()).mo68946a();
        boolean a4 = ((na0) ((FutureTask) a2).get()).mo68946a();
        ka0.f36075c.getClass();
        if (!a4 && a3) {
            return Boolean.TRUE;
        }
        if (a4 || a3) {
            return Boolean.FALSE;
        }
        return null;
    }
}
