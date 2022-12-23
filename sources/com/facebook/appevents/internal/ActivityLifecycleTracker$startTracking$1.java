package com.facebook.appevents.internal;

import com.facebook.appevents.codeless.CodelessManager;
import com.facebook.internal.FeatureManager;
import kotlin.Metadata;

@Metadata(mo72092d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo72093d2 = {"<anonymous>", "", "enabled", "", "onCompleted"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: ActivityLifecycleTracker.kt */
final class ActivityLifecycleTracker$startTracking$1 implements FeatureManager.Callback {
    public static final ActivityLifecycleTracker$startTracking$1 INSTANCE = new ActivityLifecycleTracker$startTracking$1();

    ActivityLifecycleTracker$startTracking$1() {
    }

    public final void onCompleted(boolean z) {
        if (z) {
            CodelessManager.enable();
        } else {
            CodelessManager.disable();
        }
    }
}
