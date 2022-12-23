package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class go0 {

    /* renamed from: a */
    private final Executor f34058a = new Executor(new Handler(Looper.getMainLooper())) {
        public final /* synthetic */ Handler f$0;

        {
            this.f$0 = r1;
        }

        public final void execute(Runnable runnable) {
            this.f$0.post(runnable);
        }
    };

    /* renamed from: b */
    private final Executor f34059b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));

    /* renamed from: a */
    public Executor mo67334a() {
        return this.f34059b;
    }

    /* renamed from: b */
    public Executor mo67335b() {
        return this.f34058a;
    }
}
