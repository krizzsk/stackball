package com.yandex.mobile.ads.impl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.lw */
public class C13903lw {

    /* renamed from: a */
    private final C12744cm f36932a;

    /* renamed from: b */
    private final ExecutorService f36933b;

    @Inject
    public C13903lw(C12744cm cmVar, ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(cmVar, "imageStubProvider");
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        this.f36932a = cmVar;
        this.f36933b = executorService;
    }

    /* renamed from: a */
    public void mo68520a(kj0 kj0, String str, int i, boolean z) {
        Intrinsics.checkNotNullParameter(kj0, "imageView");
        if (!(str != null)) {
            ((lj0) kj0).setPlaceholder(this.f36932a.mo65488a(i));
        }
        if (str != null) {
            lj0 lj0 = (lj0) kj0;
            Future<?> f = lj0.mo68442f();
            if (f != null) {
                f.cancel(true);
            }
            C14101nj njVar = new C14101nj(str, kj0, z);
            if (z) {
                njVar.run();
                lj0.mo68239d();
                return;
            }
            Future<?> submit = this.f36933b.submit(njVar);
            Intrinsics.checkNotNullExpressionValue(submit, "future");
            lj0.mo68440a(submit);
        }
    }
}
