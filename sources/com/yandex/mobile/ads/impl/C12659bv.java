package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.android.beacon.SendBeaconConfiguration;
import com.yandex.android.beacon.SendBeaconManager;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.bv */
public final class C12659bv implements b60<SendBeaconManager> {

    /* renamed from: a */
    private final Provider<Context> f31594a;

    /* renamed from: b */
    private final Provider<SendBeaconConfiguration> f31595b;

    public C12659bv(Provider<Context> provider, Provider<SendBeaconConfiguration> provider2) {
        this.f31594a = provider;
        this.f31595b = provider2;
    }

    public Object get() {
        Context context = this.f31594a.get();
        SendBeaconConfiguration sendBeaconConfiguration = this.f31595b.get();
        Intrinsics.checkNotNullParameter(context, "context");
        if (sendBeaconConfiguration == null) {
            return null;
        }
        return new SendBeaconManager(context, sendBeaconConfiguration);
    }
}
