package com.smaato.sdk.core.analytics;

import android.view.View;
import com.smaato.sdk.core.analytics.VideoViewabilityTracker;
import com.smaato.sdk.core.util.p251fi.Consumer;
import java.util.List;
import java.util.Map;

final class VideoViewabilityTrackerComposite extends BaseViewabilityTrackerComposite<VideoViewabilityTracker> implements VideoViewabilityTracker {
    VideoViewabilityTrackerComposite(List<VideoViewabilityTracker> list) {
        super(list);
    }

    public final void registerAdView(View view, Map<String, List<ViewabilityVerificationResource>> map) {
        performActionOnMainThread(new Consumer(view, map) {
            public final /* synthetic */ View f$0;
            public final /* synthetic */ Map f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                ((VideoViewabilityTracker) obj).registerAdView(this.f$0, this.f$1);
            }
        });
    }

    public final void trackPlayerStateChange() {
        performActionOnMainThread($$Lambda$j9o5e7knS7YfG3HTHucvp_0M0c.INSTANCE);
    }

    public final void trackVideoClicked() {
        performActionOnMainThread($$Lambda$P6HnH67F6dHmXxp1nJC1IvaMnCw.INSTANCE);
    }

    public final void trackLoaded(VideoViewabilityTracker.VideoProps videoProps) {
        performActionOnMainThread(new Consumer() {
            public final void accept(Object obj) {
                ((VideoViewabilityTracker) obj).trackLoaded(VideoViewabilityTracker.VideoProps.this);
            }
        });
    }

    public final void trackStarted(float f, float f2) {
        performActionOnMainThread(new Consumer(f, f2) {
            public final /* synthetic */ float f$0;
            public final /* synthetic */ float f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                ((VideoViewabilityTracker) obj).trackStarted(this.f$0, this.f$1);
            }
        });
    }

    public final void trackFirstQuartile() {
        performActionOnMainThread($$Lambda$YLSFC7pzLcTr6i1EQ4EomGB31bo.INSTANCE);
    }

    public final void trackMidPoint() {
        performActionOnMainThread($$Lambda$7JlpH4e3LLIrizBh5UPhHS4YbFw.INSTANCE);
    }

    public final void trackThirdQuartile() {
        performActionOnMainThread($$Lambda$1W1AUgj46JigaW0ZO2uCuqK1fY.INSTANCE);
    }

    public final void trackCompleted() {
        performActionOnMainThread($$Lambda$wVmN2eKjTySHLtjWNEQAkTlaans.INSTANCE);
    }

    public final void trackPaused() {
        performActionOnMainThread($$Lambda$9qgZZ_UoWXHktEe3ooCtHuEvsPU.INSTANCE);
    }

    public final void trackResumed() {
        performActionOnMainThread($$Lambda$nbLQ8VrFEIYThh_aUW_IYv9aR4.INSTANCE);
    }

    public final void trackBufferStart() {
        performActionOnMainThread($$Lambda$FxDo3AkqAlpzrueWOkrnL56bI_g.INSTANCE);
    }

    public final void trackBufferFinish() {
        performActionOnMainThread($$Lambda$PjCfKl4NhVelqkD8e58VEVxLdgI.INSTANCE);
    }

    public final void trackPlayerVolumeChanged(float f) {
        performActionOnMainThread(new Consumer(f) {
            public final /* synthetic */ float f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((VideoViewabilityTracker) obj).trackPlayerVolumeChanged(this.f$0);
            }
        });
    }

    public final void trackSkipped() {
        performActionOnMainThread($$Lambda$3rX8vFa9X4MxpGol7VV2zlK98rY.INSTANCE);
    }
}
