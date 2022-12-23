package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public class p30 {

    /* renamed from: a */
    private final Set<Function1<List<? extends Throwable>, Unit>> f38509a = new LinkedHashSet();

    /* renamed from: b */
    private final List<Throwable> f38510b = new ArrayList();

    /* renamed from: a */
    public void mo69304a(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "e");
        this.f38510b.add(th);
        for (Function1 invoke : this.f38509a) {
            invoke.invoke(this.f38510b);
        }
    }

    /* renamed from: a */
    public C15055wl mo69303a(Function1<? super List<? extends Throwable>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "observer");
        this.f38509a.add(function1);
        function1.invoke(this.f38510b);
        return new C15055wl(function1) {
            public final /* synthetic */ Function1 f$1;

            {
                this.f$1 = r2;
            }

            public final void close() {
                p30.m40655a(p30.this, this.f$1);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m40655a(p30 p30, Function1 function1) {
        Intrinsics.checkNotNullParameter(p30, "this$0");
        Intrinsics.checkNotNullParameter(function1, "$observer");
        p30.f38509a.remove(function1);
    }
}
