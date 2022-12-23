package com.smaato.sdk.richmedia.p255ad.tracker;

import android.view.View;
import com.smaato.sdk.core.appbgdetection.AppBackgroundAwareHandler;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;

/* renamed from: com.smaato.sdk.richmedia.ad.tracker.RichMediaVisibilityTrackerCreator */
public class RichMediaVisibilityTrackerCreator {
    private final AppBackgroundDetector appBackgroundDetector;
    private final Logger logger;
    private final long millis;
    private final double ratio;

    public RichMediaVisibilityTrackerCreator(Logger logger2, double d, long j, AppBackgroundDetector appBackgroundDetector2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.ratio = d;
        this.millis = j;
        this.appBackgroundDetector = (AppBackgroundDetector) Objects.requireNonNull(appBackgroundDetector2);
    }

    public RichMediaVisibilityTracker createTracker(View view, VisibilityTrackerListener visibilityTrackerListener) {
        return new RichMediaVisibilityTracker(this.logger, view, this.ratio, this.millis, visibilityTrackerListener, new AppBackgroundAwareHandler(this.logger, Threads.newUiHandler(), this.appBackgroundDetector));
    }
}
