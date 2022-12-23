package com.smaato.sdk.core.analytics;

import android.view.View;

public interface ViewabilityTracker {
    void registerFriendlyObstruction(View view);

    void removeFriendlyObstruction(View view);

    void startTracking();

    void stopTracking();

    void trackImpression();
}
