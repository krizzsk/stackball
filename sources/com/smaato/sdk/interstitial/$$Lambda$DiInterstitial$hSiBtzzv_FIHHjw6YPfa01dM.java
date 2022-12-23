package com.smaato.sdk.interstitial;

import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.util.notifier.TimerUtils;

/* renamed from: com.smaato.sdk.interstitial.-$$Lambda$DiInterstitial$hSiBtzzv_FIHHj-w6YPfa-01-dM  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$DiInterstitial$hSiBtzzv_FIHHjw6YPfa01dM implements ClassFactory {
    public static final /* synthetic */ $$Lambda$DiInterstitial$hSiBtzzv_FIHHjw6YPfa01dM INSTANCE = new $$Lambda$DiInterstitial$hSiBtzzv_FIHHjw6YPfa01dM();

    private /* synthetic */ $$Lambda$DiInterstitial$hSiBtzzv_FIHHjw6YPfa01dM() {
    }

    public final Object get(DiConstructor diConstructor) {
        return TimerUtils.createSingleTimer(2000);
    }
}
