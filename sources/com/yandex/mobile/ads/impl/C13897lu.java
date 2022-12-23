package com.yandex.mobile.ads.impl;

import com.yandex.android.beacon.SendBeaconConfiguration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.inject.Provider;
import javax.inject.Singleton;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.lu */
public final class C13897lu {

    /* renamed from: a */
    private final Provider<SendBeaconConfiguration> f36918a;

    /* renamed from: b */
    private final ExecutorService f36919b;

    /* renamed from: c */
    private final Provider<aa0> f36920c;

    /* renamed from: com.yandex.mobile.ads.impl.lu$a */
    public static final class C13898a {

        /* renamed from: a */
        private Provider<aa0> f36921a = $$Lambda$lu$a$u5NhFANZ50WiU9fDR4pPrehCPw.INSTANCE;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final aa0 m39013b() {
            return aa0.f30480a;
        }

        /* renamed from: a */
        public final C13897lu mo68518a() {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "executorService ?: Execu…newSingleThreadExecutor()");
            return new C13897lu((Provider) null, newSingleThreadExecutor, this.f36921a, (DefaultConstructorMarker) null);
        }
    }

    private C13897lu(Provider<SendBeaconConfiguration> provider, ExecutorService executorService, Provider<aa0> provider2) {
        this.f36918a = provider;
        this.f36919b = executorService;
        this.f36920c = provider2;
    }

    public /* synthetic */ C13897lu(Provider provider, ExecutorService executorService, Provider provider2, DefaultConstructorMarker defaultConstructorMarker) {
        this((Provider<SendBeaconConfiguration>) null, executorService, provider2);
    }

    @Singleton
    /* renamed from: a */
    public final C13323hi mo68512a() {
        C13323hi hiVar = this.f36920c.get().mo65701c().get();
        Intrinsics.checkNotNullExpressionValue(hiVar, "histogramConfiguration.g…geHistogramReporter.get()");
        return hiVar;
    }

    /* renamed from: b */
    public final ExecutorService mo68513b() {
        return this.f36919b;
    }

    /* renamed from: c */
    public final aa0 mo68514c() {
        aa0 aa0 = this.f36920c.get();
        Intrinsics.checkNotNullExpressionValue(aa0, "histogramConfiguration.get()");
        return aa0;
    }

    /* renamed from: d */
    public final ca0 mo68515d() {
        aa0 aa0 = this.f36920c.get();
        Intrinsics.checkNotNullExpressionValue(aa0, "histogramConfiguration.get()");
        return aa0;
    }

    @Singleton
    /* renamed from: e */
    public final da0 mo68516e() {
        return new da0(this.f36920c.get().mo65702d().get());
    }

    /* renamed from: f */
    public final SendBeaconConfiguration mo68517f() {
        Provider<SendBeaconConfiguration> provider = this.f36918a;
        if (provider == null) {
            return null;
        }
        return provider.get();
    }
}
