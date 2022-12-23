package com.facebook.appevents.ondeviceprocessing;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;

@Metadata(mo72092d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo72093d2 = {"<anonymous>", "", "run"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: OnDeviceProcessingManager.kt */
final class OnDeviceProcessingManager$sendInstallEventAsync$1 implements Runnable {
    final /* synthetic */ String $applicationId;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $preferencesName;

    OnDeviceProcessingManager$sendInstallEventAsync$1(Context context, String str, String str2) {
        this.$context = context;
        this.$preferencesName = str;
        this.$applicationId = str2;
    }

    public final void run() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                SharedPreferences sharedPreferences = this.$context.getSharedPreferences(this.$preferencesName, 0);
                String str = this.$applicationId + "pingForOnDevice";
                if (sharedPreferences.getLong(str, 0) == 0) {
                    RemoteServiceWrapper.sendInstallEvent(this.$applicationId);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong(str, System.currentTimeMillis());
                    edit.apply();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
