package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.InstreamAdLoadListener;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class cf0 implements ef0 {

    /* renamed from: a */
    private final Context f31911a;

    /* renamed from: b */
    private final Object f31912b = new Object();

    /* renamed from: c */
    private final List<df0> f31913c = new ArrayList();

    /* renamed from: d */
    private InstreamAdLoadListener f31914d;

    public cf0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31911a = context;
    }

    /* renamed from: a */
    public final void mo66280a(InstreamAdLoadListener instreamAdLoadListener) {
        synchronized (this.f31912b) {
            this.f31914d = instreamAdLoadListener;
            for (df0 a : this.f31913c) {
                a.mo66571a(instreamAdLoadListener);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final void mo66281a(InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        Intrinsics.checkNotNullParameter(instreamAdRequestConfiguration, "configuration");
        synchronized (this.f31912b) {
            df0 df0 = new df0(this.f31911a, this);
            this.f31913c.add(df0);
            df0.mo66571a(this.f31914d);
            df0.mo66572a(instreamAdRequestConfiguration);
        }
    }

    /* renamed from: a */
    public void mo66279a(df0 df0) {
        Intrinsics.checkNotNullParameter(df0, "nativeAdLoadingItem");
        synchronized (this.f31912b) {
            this.f31913c.remove(df0);
        }
    }
}
