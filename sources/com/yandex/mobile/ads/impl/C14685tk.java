package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.tk */
public final class C14685tk implements yc1 {

    /* renamed from: a */
    private final Handler f40347a = new Handler(Looper.getMainLooper());

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m42361b(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "$tmp0");
        function0.invoke();
    }

    /* renamed from: a */
    public void mo70190a(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "task");
        if (Intrinsics.areEqual((Object) Looper.myLooper(), (Object) Looper.getMainLooper())) {
            function0.invoke();
        } else {
            this.f40347a.post(new Runnable() {
                public final void run() {
                    C14685tk.m42361b(Function0.this);
                }
            });
        }
    }
}
