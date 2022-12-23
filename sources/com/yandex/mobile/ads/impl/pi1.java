package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class pi1 {

    /* renamed from: a */
    private final pw0 f38619a;

    /* renamed from: com.yandex.mobile.ads.impl.pi1$a */
    private final class C14281a implements nw0 {

        /* renamed from: a */
        private final C14282b f38620a;

        public C14281a(pi1 pi1, C14282b bVar) {
            Intrinsics.checkNotNullParameter(pi1, "this$0");
            Intrinsics.checkNotNullParameter(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f38620a = bVar;
        }

        /* renamed from: a */
        public void mo69083a() {
            this.f38620a.mo68693a();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pi1$b */
    public interface C14282b {
        /* renamed from: a */
        void mo68693a();
    }

    public pi1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38619a = new pw0(context);
    }

    /* renamed from: a */
    public final void mo69370a(List<lj1> list, C14282b bVar) {
        Intrinsics.checkNotNullParameter(list, "videoAds");
        Intrinsics.checkNotNullParameter(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                List<vi1> d = ((lj1) it.next()).mo68457d();
                Intrinsics.checkNotNullExpressionValue(d, "videoAd.adVerifications");
                if (!d.isEmpty()) {
                    break;
                }
            }
        }
        z = false;
        if (z) {
            this.f38619a.mo69451a(new C14281a(this, bVar));
            return;
        }
        ((mi1) bVar).mo68693a();
    }
}
