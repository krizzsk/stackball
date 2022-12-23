package com.smaato.sdk.core.analytics;

import android.view.View;
import java.util.List;
import java.util.Map;

public interface VideoViewabilityTracker extends ViewabilityTracker {
    void registerAdView(View view, Map<String, List<ViewabilityVerificationResource>> map);

    void trackBufferFinish();

    void trackBufferStart();

    void trackCompleted();

    void trackFirstQuartile();

    void trackImpression();

    void trackLoaded(VideoProps videoProps);

    void trackMidPoint();

    void trackPaused();

    void trackPlayerStateChange();

    void trackPlayerVolumeChanged(float f);

    void trackResumed();

    void trackSkipped();

    void trackStarted(float f, float f2);

    void trackThirdQuartile();

    void trackVideoClicked();

    public static class VideoProps {
        public final boolean isAutoPlay;
        public final boolean isSkippable;
        public final float skipOffset;

        private VideoProps(boolean z, float f) {
            this.isAutoPlay = true;
            this.isSkippable = z;
            this.skipOffset = f;
        }

        private VideoProps() {
            this(false, Float.MIN_VALUE);
        }

        public static VideoProps buildForSkippableVideo(float f) {
            return new VideoProps(true, f);
        }

        public static VideoProps buildForNonSkippableVideo() {
            return new VideoProps();
        }
    }
}
