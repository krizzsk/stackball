package com.yandex.mobile.ads.impl;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;
import javax.inject.Singleton;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.xu */
public final class C15212xu {

    /* renamed from: a */
    public static final C15212xu f42697a = new C15212xu();

    /* renamed from: com.yandex.mobile.ads.impl.xu$a */
    /* synthetic */ class C15213a extends FunctionReferenceImpl implements Function0<ea0> {
        C15213a(Object obj) {
            super(0, obj, Provider.class, "get", "get()Ljava/lang/Object;", 0);
        }

        public Object invoke() {
            return (ea0) ((Provider) this.receiver).get();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xu$b */
    /* synthetic */ class C15214b extends FunctionReferenceImpl implements Function0<Executor> {
        C15214b(Object obj) {
            super(0, obj, Provider.class, "get", "get()Ljava/lang/Object;", 0);
        }

        public Object invoke() {
            return (Executor) ((Provider) this.receiver).get();
        }
    }

    private C15212xu() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final Executor m44127a() {
        return $$Lambda$xu$GwG38NgPZjO1ePVvyFrmwolYiE.INSTANCE;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m44130a(Runnable runnable) {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final ea0 m44131b(aa0 aa0, Provider provider, Provider provider2) {
        Intrinsics.checkNotNullParameter(aa0, "$histogramConfiguration");
        Intrinsics.checkNotNullParameter(provider, "$histogramRecorderProvider");
        Intrinsics.checkNotNullParameter(provider2, "$histogramColdTypeCheckerProvider");
        return C12774ct.m34851a(aa0, provider, provider2);
    }

    @Singleton
    /* renamed from: a */
    public final C15276yv mo70943a(aa0 aa0, Provider<da0> provider, Provider<y90> provider2, Provider<ExecutorService> provider3) {
        Intrinsics.checkNotNullParameter(aa0, "histogramConfiguration");
        Intrinsics.checkNotNullParameter(provider, "histogramRecorderProvider");
        Intrinsics.checkNotNullParameter(provider2, "histogramColdTypeCheckerProvider");
        Intrinsics.checkNotNullParameter(provider3, "executorService");
        if (!aa0.mo65700b()) {
            return C15276yv.f42964a.mo71130a();
        }
        return new C15357zv(new C15213a(m44129a(aa0, provider, provider2)), new C15214b(m44128a(aa0, provider3)));
    }

    /* renamed from: a */
    private final Provider<Executor> m44128a(aa0 aa0, Provider<ExecutorService> provider) {
        if (aa0.mo65707g()) {
            return provider;
        }
        Provider<Executor> b = d20.m34976b($$Lambda$xu$P2Xnq5EGgwGPOJZKOWQvuzWbx78.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(b, "provider(Provider { Executor {} })");
        return b;
    }

    /* renamed from: a */
    private final Provider<ea0> m44129a(aa0 aa0, Provider<da0> provider, Provider<y90> provider2) {
        Provider<ea0> b = d20.m34976b(new Provider(provider, provider2) {
            public final /* synthetic */ Provider f$1;
            public final /* synthetic */ Provider f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final Object get() {
                return C15212xu.m44131b(aa0.this, this.f$1, this.f$2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(b, "provider(Provider {\n    …\n            )\n        })");
        return b;
    }
}
