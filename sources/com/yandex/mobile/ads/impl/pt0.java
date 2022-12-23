package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yandex.mobile.ads.impl.jt0;
import kotlin.jvm.internal.Intrinsics;

public final class pt0 {

    /* renamed from: a */
    private final pw0 f38827a;

    /* renamed from: b */
    private final ot0 f38828b = new ot0();

    /* renamed from: com.yandex.mobile.ads.impl.pt0$a */
    private static final class C14312a implements nw0 {

        /* renamed from: a */
        private final C14313b f38829a;

        public C14312a(C14313b bVar) {
            Intrinsics.checkNotNullParameter(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f38829a = bVar;
        }

        /* renamed from: a */
        public void mo69083a() {
            ((jt0.C13587b) this.f38829a).mo68093c();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pt0$b */
    public interface C14313b {
    }

    public pt0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38827a = new pw0(context);
    }

    /* renamed from: a */
    public final void mo69435a(vq0 vq0, C14313b bVar) {
        Intrinsics.checkNotNullParameter(vq0, "nativeAdBlock");
        Intrinsics.checkNotNullParameter(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (this.f38828b.mo69266a(vq0)) {
            this.f38827a.mo69451a(new C14312a(bVar));
            return;
        }
        ((jt0.C13587b) bVar).mo68093c();
    }

    /* renamed from: a */
    public final void mo69434a() {
        this.f38827a.mo69450a();
    }
}
