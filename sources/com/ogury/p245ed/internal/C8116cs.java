package com.ogury.p245ed.internal;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ogury.ed.internal.cs */
public final class C8116cs implements C8117ct {

    /* renamed from: a */
    private final Handler f21047a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final void mo53278a(Runnable runnable) {
        C8467mq.m23881b(runnable, "runnable");
        this.f21047a.post(runnable);
    }
}
