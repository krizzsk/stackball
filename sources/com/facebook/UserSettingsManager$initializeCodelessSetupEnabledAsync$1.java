package com.facebook;

import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(mo72092d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo72093d2 = {"<anonymous>", "", "run"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: UserSettingsManager.kt */
final class UserSettingsManager$initializeCodelessSetupEnabledAsync$1 implements Runnable {
    final /* synthetic */ long $currTime;

    UserSettingsManager$initializeCodelessSetupEnabledAsync$1(long j) {
        this.$currTime = j;
    }

    public final void run() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                if (UserSettingsManager.access$getAdvertiserIDCollectionEnabled$p(UserSettingsManager.INSTANCE).getValue()) {
                    String applicationId = FacebookSdk.getApplicationId();
                    Intrinsics.checkNotNullExpressionValue(applicationId, "FacebookSdk.getApplicationId()");
                    FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(applicationId, false);
                    if (queryAppSettings != null && queryAppSettings.getCodelessEventsEnabled()) {
                        String str = null;
                        Context applicationContext = FacebookSdk.getApplicationContext();
                        AttributionIdentifiers.Companion companion = AttributionIdentifiers.Companion;
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "context");
                        AttributionIdentifiers attributionIdentifiers = companion.getAttributionIdentifiers(applicationContext);
                        if (!(attributionIdentifiers == null || attributionIdentifiers.getAndroidAdvertiserId() == null)) {
                            str = attributionIdentifiers.getAndroidAdvertiserId();
                        }
                        if (str != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("advertiser_id", str);
                            bundle.putString(GraphRequest.FIELDS_PARAM, "auto_event_setup_enabled");
                            GraphRequest newGraphPathRequest = GraphRequest.Companion.newGraphPathRequest((AccessToken) null, FacebookSdk.getApplicationId(), (GraphRequest.Callback) null);
                            newGraphPathRequest.setSkipClientToken(true);
                            newGraphPathRequest.setParameters(bundle);
                            JSONObject jSONObject = newGraphPathRequest.executeAndWait().getJSONObject();
                            if (jSONObject != null) {
                                UserSettingsManager.access$getCodelessSetupEnabled$p(UserSettingsManager.INSTANCE).setValue(Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false)));
                                UserSettingsManager.access$getCodelessSetupEnabled$p(UserSettingsManager.INSTANCE).setLastTS(this.$currTime);
                                UserSettingsManager.access$writeSettingToCache(UserSettingsManager.INSTANCE, UserSettingsManager.access$getCodelessSetupEnabled$p(UserSettingsManager.INSTANCE));
                            }
                        }
                    }
                }
                UserSettingsManager.access$isFetchingCodelessStatus$p(UserSettingsManager.INSTANCE).set(false);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
