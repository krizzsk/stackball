package com.smaato.sdk.core.p248ad;

import com.smaato.sdk.core.appbgdetection.AppBackgroundAwareHandler;
import com.smaato.sdk.core.appbgdetection.PauseUnpauseListener;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;

/* renamed from: com.smaato.sdk.core.ad.AutoReloadPolicy */
public final class AutoReloadPolicy {
    private final AppBackgroundAwareHandler appBackgroundAwareUiHandler;
    private final AutoReloadConfig autoReloadConfig;
    private int autoReloadInterval;
    private final Logger logger;

    public AutoReloadPolicy(Logger logger2, AutoReloadConfig autoReloadConfig2, AppBackgroundAwareHandler appBackgroundAwareHandler) {
        this.logger = (Logger) Objects.requireNonNull(logger2, "Parameter logger cannot be null for AutoReloadPolicy::new");
        this.autoReloadConfig = (AutoReloadConfig) Objects.requireNonNull(autoReloadConfig2, "Parameter autoReloadConfig cannot be null for AutoReloadPolicy::new");
        this.autoReloadInterval = autoReloadConfig2.defaultInterval();
        this.appBackgroundAwareUiHandler = (AppBackgroundAwareHandler) Objects.requireNonNull(appBackgroundAwareHandler);
    }

    public final void setAutoReloadInterval(int i) {
        if (i == 0) {
            this.autoReloadInterval = i;
            stopTimer();
            this.logger.info(LogDomain.AD, "Ad auto-reload has been turned off.", new Object[0]);
            return;
        }
        int minInterval = this.autoReloadConfig.minInterval();
        if (i < minInterval) {
            this.autoReloadInterval = minInterval;
            this.logger.info(LogDomain.AD, "Ad auto-reload interval %d is too small, setting %d seconds.", Integer.valueOf(i), Integer.valueOf(minInterval));
            return;
        }
        int maxInterval = this.autoReloadConfig.maxInterval();
        if (i > maxInterval) {
            this.autoReloadInterval = maxInterval;
            this.logger.info(LogDomain.AD, "Ad auto-reload interval %f is too large, setting %f seconds.", Integer.valueOf(i), Integer.valueOf(maxInterval));
            return;
        }
        this.autoReloadInterval = i;
        this.logger.info(LogDomain.AD, "Ad auto-reload interval is set to %d seconds.", Integer.valueOf(i));
    }

    public final int getAutoReloadInterval() {
        return this.autoReloadInterval;
    }

    public final boolean isAutoReloadEnabled() {
        return this.autoReloadInterval > 0;
    }

    public final void stopTimer() {
        this.appBackgroundAwareUiHandler.stop();
    }

    public final void startWithAction(Runnable runnable) {
        if (runnable == null) {
            this.logger.info(LogDomain.AD, "No action to perform", new Object[0]);
            return;
        }
        stopTimer();
        if (isAutoReloadEnabled()) {
            long j = (long) (this.autoReloadInterval * 1000);
            this.logger.info(LogDomain.AD, "starting timer for %d millis", Long.valueOf(j));
            this.appBackgroundAwareUiHandler.postDelayed("Ad auto-reload timer", runnable, j, (PauseUnpauseListener) null);
        }
    }
}
