package com.facebook.appevents;

import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import kotlin.Metadata;

@Metadata(mo72092d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, mo72093d2 = {"com/facebook/appevents/AppEventsManager$start$1", "Lcom/facebook/internal/FetchedAppSettingsManager$FetchedAppSettingsCallback;", "onError", "", "onSuccess", "fetchedAppSettings", "Lcom/facebook/internal/FetchedAppSettings;", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
/* compiled from: AppEventsManager.kt */
public final class AppEventsManager$start$1 implements FetchedAppSettingsManager.FetchedAppSettingsCallback {
    public void onError() {
    }

    AppEventsManager$start$1() {
    }

    public void onSuccess(FetchedAppSettings fetchedAppSettings) {
        FeatureManager.checkFeature(FeatureManager.Feature.AAM, AppEventsManager$start$1$onSuccess$1.INSTANCE);
        FeatureManager.checkFeature(FeatureManager.Feature.RestrictiveDataFiltering, AppEventsManager$start$1$onSuccess$2.INSTANCE);
        FeatureManager.checkFeature(FeatureManager.Feature.PrivacyProtection, AppEventsManager$start$1$onSuccess$3.INSTANCE);
        FeatureManager.checkFeature(FeatureManager.Feature.EventDeactivation, AppEventsManager$start$1$onSuccess$4.INSTANCE);
        FeatureManager.checkFeature(FeatureManager.Feature.IapLogging, AppEventsManager$start$1$onSuccess$5.INSTANCE);
    }
}
