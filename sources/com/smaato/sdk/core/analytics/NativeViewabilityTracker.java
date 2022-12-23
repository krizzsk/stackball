package com.smaato.sdk.core.analytics;

import android.view.View;

public interface NativeViewabilityTracker extends ViewabilityTracker {
    void registerAdView(View view);
}
