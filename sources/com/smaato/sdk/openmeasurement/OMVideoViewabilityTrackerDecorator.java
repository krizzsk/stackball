package com.smaato.sdk.openmeasurement;

import android.view.View;
import com.smaato.sdk.core.analytics.VideoViewabilityTracker;
import com.smaato.sdk.core.analytics.ViewabilityVerificationResource;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.p251fi.Consumer;
import java.util.List;
import java.util.Map;

public final class OMVideoViewabilityTrackerDecorator extends BaseOMViewabilityTracker<OMVideoViewabilityTracker> implements VideoViewabilityTracker {
    OMVideoViewabilityTrackerDecorator(Logger logger, OMVideoViewabilityTracker oMVideoViewabilityTracker) {
        super(logger, oMVideoViewabilityTracker);
    }

    public final void registerAdView(View view, Map<String, List<ViewabilityVerificationResource>> map) {
        performActionSafely(new Consumer(view, map) {
            public final /* synthetic */ View f$0;
            public final /* synthetic */ Map f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                ((OMVideoViewabilityTracker) obj).registerAdView(this.f$0, this.f$1);
            }
        });
    }

    public final void trackPlayerStateChange() {
        performActionSafely($$Lambda$4qKMuQEOoaGeek_oM2xDIVuPOLA.INSTANCE);
    }

    public final void trackVideoClicked() {
        performActionSafely($$Lambda$L0jRFJrdHwKQyN2E4L6E6XK7vJc.INSTANCE);
    }

    public final void trackLoaded(VideoViewabilityTracker.VideoProps videoProps) {
        performActionSafely(new Consumer() {
            public final void accept(Object obj) {
                ((OMVideoViewabilityTracker) obj).trackLoaded(VideoViewabilityTracker.VideoProps.this);
            }
        });
    }

    public final void trackStarted(float f, float f2) {
        performActionSafely(new Consumer(f, f2) {
            public final /* synthetic */ float f$0;
            public final /* synthetic */ float f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                ((OMVideoViewabilityTracker) obj).trackStarted(this.f$0, this.f$1);
            }
        });
    }

    public final void trackFirstQuartile() {
        performActionSafely($$Lambda$cEg4gfOYGoIFgsSuVmU5IshiaE8.INSTANCE);
    }

    public final void trackMidPoint() {
        performActionSafely($$Lambda$_hdvW7TDhmbOKm4HMMEP_4l4BXM.INSTANCE);
    }

    public final void trackThirdQuartile() {
        performActionSafely($$Lambda$pkK2nP7EPxvdUkabehuXd34fET4.INSTANCE);
    }

    public final void trackCompleted() {
        performActionSafely($$Lambda$s0IdYArUcGIM_6jHJwQNOSyaFd8.INSTANCE);
    }

    public final void trackPaused() {
        performActionSafely($$Lambda$Yv6ZtJtUPzseXx4mA_G53A2NhN0.INSTANCE);
    }

    public final void trackResumed() {
        performActionSafely($$Lambda$4Fy7zEXR_nC_2pgJfTRAD774jcE.INSTANCE);
    }

    public final void trackBufferStart() {
        performActionSafely($$Lambda$4qG35F7vq1hWzpQ22RJjfCcXkYs.INSTANCE);
    }

    public final void trackBufferFinish() {
        performActionSafely($$Lambda$3dhSIQ1nP1Asl3hve4kg7o7ESg.INSTANCE);
    }

    public final void trackPlayerVolumeChanged(float f) {
        performActionSafely(new Consumer(f) {
            public final /* synthetic */ float f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((OMVideoViewabilityTracker) obj).trackPlayerVolumeChanged(this.f$0);
            }
        });
    }

    public final void trackSkipped() {
        performActionSafely($$Lambda$dqYaXbrlhToa1MzlQUu_5ksU.INSTANCE);
    }
}
