package com.smaato.sdk.core;

import android.util.Log;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.LogLevel;
import com.smaato.sdk.core.util.Objects;

public final class Config {
    private final AdContentRating adContentRating;
    private final boolean enableLogging;
    private final boolean httpsOnly;
    private final LogLevel logLevel;

    /* synthetic */ Config(LogLevel logLevel2, AdContentRating adContentRating2, boolean z, boolean z2, byte b) {
        this(logLevel2, adContentRating2, z, z2);
    }

    private Config(LogLevel logLevel2, AdContentRating adContentRating2, boolean z, boolean z2) {
        this.logLevel = (LogLevel) Objects.requireNonNull(logLevel2);
        this.adContentRating = (AdContentRating) Objects.requireNonNull(adContentRating2);
        this.enableLogging = z;
        this.httpsOnly = z2;
    }

    public static ConfigBuilder builder() {
        return new ConfigBuilder();
    }

    public final boolean loggingEnabled() {
        return this.enableLogging;
    }

    public final LogLevel getConsoleLogLevel() {
        return this.logLevel;
    }

    public final boolean isHttpsOnly() {
        return this.httpsOnly;
    }

    public final AdContentRating getAdContentRating() {
        return this.adContentRating;
    }

    public static class ConfigBuilder {
        private AdContentRating adContentRating = AdContentRating.MAX_AD_CONTENT_RATING_UNDEFINED;
        private boolean enableLogging;
        private boolean httpsOnly;
        private LogLevel logLevel = LogLevel.INFO;

        public ConfigBuilder enableLogging(boolean z) {
            this.enableLogging = z;
            return this;
        }

        public ConfigBuilder setLogLevel(LogLevel logLevel2) {
            if (logLevel2 != null) {
                this.logLevel = logLevel2;
            } else {
                Log.w(LogDomain.CORE.name(), String.format("Setting logLevel to null is ignored, current value = %s", new Object[]{this.logLevel}));
            }
            return this;
        }

        public ConfigBuilder setHttpsOnly(boolean z) {
            this.httpsOnly = z;
            return this;
        }

        public ConfigBuilder setAdContentRating(AdContentRating adContentRating2) {
            if (adContentRating2 != null) {
                this.adContentRating = adContentRating2;
            } else {
                Log.w(LogDomain.CORE.name(), String.format("Setting adContentRating to null is ignored, current value = %s", new Object[]{this.adContentRating}));
            }
            return this;
        }

        public Config build() {
            return new Config(this.logLevel, this.adContentRating, this.enableLogging, this.httpsOnly, (byte) 0);
        }
    }
}
