package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fa0;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.ct */
public final class C12774ct {

    /* renamed from: com.yandex.mobile.ads.impl.ct$a */
    /* synthetic */ class C12775a extends FunctionReferenceImpl implements Function0<y90> {
        C12775a(Object obj) {
            super(0, obj, Provider.class, "get", "get()Ljava/lang/Object;", 0);
        }

        public Object invoke() {
            return (y90) ((Provider) this.receiver).get();
        }
    }

    /* renamed from: a */
    public static final ea0 m34851a(aa0 aa0, Provider<da0> provider, Provider<y90> provider2) {
        fa0 fa0;
        Intrinsics.checkNotNullParameter(aa0, "histogramConfiguration");
        Intrinsics.checkNotNullParameter(provider, "histogramRecorderProvider");
        Intrinsics.checkNotNullParameter(provider2, "histogramColdTypeChecker");
        if (!aa0.mo65700b()) {
            fa0 = fa0.C13039a.f33287a;
        } else {
            fa0 = new ga0(provider, new x90(new C12775a(provider2)), aa0, aa0.mo65703i());
        }
        return new ea0(fa0);
    }
}
