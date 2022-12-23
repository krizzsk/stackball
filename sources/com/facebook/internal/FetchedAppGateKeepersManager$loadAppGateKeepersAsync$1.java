package com.facebook.internal;

import android.content.Context;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(mo72092d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo72093d2 = {"<anonymous>", "", "run"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: FetchedAppGateKeepersManager.kt */
final class FetchedAppGateKeepersManager$loadAppGateKeepersAsync$1 implements Runnable {
    final /* synthetic */ String $applicationId;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $gateKeepersKey;

    FetchedAppGateKeepersManager$loadAppGateKeepersAsync$1(String str, Context context, String str2) {
        this.$applicationId = str;
        this.$context = context;
        this.$gateKeepersKey = str2;
    }

    public final void run() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                FetchedAppGateKeepersManager fetchedAppGateKeepersManager = FetchedAppGateKeepersManager.INSTANCE;
                String str = this.$applicationId;
                Intrinsics.checkNotNullExpressionValue(str, "applicationId");
                JSONObject access$getAppGateKeepersQueryResponse = fetchedAppGateKeepersManager.getAppGateKeepersQueryResponse(str);
                if (access$getAppGateKeepersQueryResponse.length() != 0) {
                    String str2 = this.$applicationId;
                    Intrinsics.checkNotNullExpressionValue(str2, "applicationId");
                    FetchedAppGateKeepersManager.parseAppGateKeepersFromJSON$facebook_core_release(str2, access$getAppGateKeepersQueryResponse);
                    this.$context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(this.$gateKeepersKey, access$getAppGateKeepersQueryResponse.toString()).apply();
                    FetchedAppGateKeepersManager.timestamp = Long.valueOf(System.currentTimeMillis());
                }
                FetchedAppGateKeepersManager.INSTANCE.pollCallbacks();
                FetchedAppGateKeepersManager.isLoading.set(false);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
