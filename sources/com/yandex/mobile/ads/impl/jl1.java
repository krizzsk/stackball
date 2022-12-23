package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

public final class jl1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ym1 f35354a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C13511a f35355b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Handler f35356c = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f35357d;

    /* renamed from: e */
    private boolean f35358e;

    /* renamed from: com.yandex.mobile.ads.impl.jl1$a */
    public interface C13511a {
        /* renamed from: a */
        void mo67320a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.jl1$b */
    private final class C13512b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ jl1 f35359b;

        public C13512b(jl1 jl1) {
            Intrinsics.checkNotNullParameter(jl1, "this$0");
            this.f35359b = jl1;
        }

        public void run() {
            if (this.f35359b.f35357d || !this.f35359b.f35354a.mo68097a()) {
                this.f35359b.f35356c.postDelayed(this, 200);
                return;
            }
            this.f35359b.f35355b.mo67320a();
            this.f35359b.f35357d = true;
            this.f35359b.mo68024b();
        }
    }

    public jl1(ym1 ym1, C13511a aVar) {
        Intrinsics.checkNotNullParameter(ym1, "renderValidator");
        Intrinsics.checkNotNullParameter(aVar, "renderingStartListener");
        this.f35354a = ym1;
        this.f35355b = aVar;
    }

    /* renamed from: b */
    public final void mo68024b() {
        this.f35356c.removeCallbacksAndMessages((Object) null);
        this.f35358e = false;
    }

    /* renamed from: a */
    public final void mo68023a() {
        if (!this.f35358e && !this.f35357d) {
            this.f35358e = true;
            this.f35356c.post(new C13512b(this));
        }
    }
}
