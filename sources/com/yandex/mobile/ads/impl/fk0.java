package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

public final class fk0 {

    /* renamed from: a */
    private final Handler f33381a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final void mo67023a() {
        this.f33381a.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: a */
    public final void mo67024a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (Intrinsics.areEqual((Object) Thread.currentThread(), (Object) Looper.getMainLooper().getThread())) {
            runnable.run();
        } else {
            this.f33381a.post(runnable);
        }
    }
}
