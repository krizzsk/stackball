package com.yandex.metrica.impl.p265ob;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.xn */
class C11960xn implements Executor {

    /* renamed from: a */
    final /* synthetic */ Handler f28732a;

    C11960xn(C11995yn ynVar, Handler handler) {
        this.f28732a = handler;
    }

    public void execute(Runnable runnable) {
        this.f28732a.post(runnable);
    }
}
