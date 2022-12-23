package com.facebook.internal;

import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;

@Metadata(mo72092d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo72093d2 = {"<anonymous>", "", "run"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: FetchedAppSettingsManager.kt */
final class FetchedAppSettingsManager$pollCallbacks$2 implements Runnable {
    final /* synthetic */ FetchedAppSettings $appSettings;
    final /* synthetic */ FetchedAppSettingsManager.FetchedAppSettingsCallback $callback;

    FetchedAppSettingsManager$pollCallbacks$2(FetchedAppSettingsManager.FetchedAppSettingsCallback fetchedAppSettingsCallback, FetchedAppSettings fetchedAppSettings) {
        this.$callback = fetchedAppSettingsCallback;
        this.$appSettings = fetchedAppSettings;
    }

    public final void run() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                this.$callback.onSuccess(this.$appSettings);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
