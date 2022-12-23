package com.facebook.internal;

import com.facebook.internal.FetchedAppGateKeepersManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;

@Metadata(mo72092d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo72093d2 = {"<anonymous>", "", "run"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: FetchedAppGateKeepersManager.kt */
final class FetchedAppGateKeepersManager$pollCallbacks$1 implements Runnable {
    final /* synthetic */ FetchedAppGateKeepersManager.Callback $callback;

    FetchedAppGateKeepersManager$pollCallbacks$1(FetchedAppGateKeepersManager.Callback callback) {
        this.$callback = callback;
    }

    public final void run() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                this.$callback.onCompleted();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
