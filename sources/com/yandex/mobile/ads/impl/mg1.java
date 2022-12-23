package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class mg1 {

    /* renamed from: a */
    public static final mg1 f37373a = new mg1();

    /* renamed from: b */
    private static final Handler f37374b = new Handler(Looper.getMainLooper());

    private mg1() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m39448b(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "$tmp0");
        function0.invoke();
    }

    /* renamed from: a */
    public final boolean mo68688a(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "runnable");
        return f37374b.post(new Runnable() {
            public final void run() {
                mg1.m39448b(Function0.this);
            }
        });
    }
}
