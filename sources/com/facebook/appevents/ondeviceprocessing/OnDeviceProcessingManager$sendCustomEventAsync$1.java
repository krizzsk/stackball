package com.facebook.appevents.ondeviceprocessing;

import com.facebook.appevents.AppEvent;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(mo72092d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo72093d2 = {"<anonymous>", "", "run"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: OnDeviceProcessingManager.kt */
final class OnDeviceProcessingManager$sendCustomEventAsync$1 implements Runnable {
    final /* synthetic */ String $applicationId;
    final /* synthetic */ AppEvent $event;

    OnDeviceProcessingManager$sendCustomEventAsync$1(String str, AppEvent appEvent) {
        this.$applicationId = str;
        this.$event = appEvent;
    }

    public final void run() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                RemoteServiceWrapper.sendCustomEvents(this.$applicationId, CollectionsKt.listOf(this.$event));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
