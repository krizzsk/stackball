package com.smaato.sdk.core.framework;

public final class VisibilityPrivateConfig {
    /* access modifiers changed from: private */
    public final double visibilityRatio;
    /* access modifiers changed from: private */
    public final long visibilityTimeMillis;

    /* synthetic */ VisibilityPrivateConfig(double d, long j, byte b) {
        this(d, j);
    }

    private VisibilityPrivateConfig(double d, long j) {
        this.visibilityRatio = d;
        this.visibilityTimeMillis = j;
    }

    public final double getVisibilityRatio() {
        return this.visibilityRatio;
    }

    public final long getVisibilityTimeMillis() {
        return this.visibilityTimeMillis;
    }

    public static class Builder {
        private double visibilityRatio;
        private long visibilityTimeMillis;

        public Builder() {
        }

        public Builder(VisibilityPrivateConfig visibilityPrivateConfig) {
            this.visibilityRatio = visibilityPrivateConfig.visibilityRatio;
            this.visibilityTimeMillis = visibilityPrivateConfig.visibilityTimeMillis;
        }

        public Builder visibilityRatio(double d) {
            this.visibilityRatio = d;
            return this;
        }

        public Builder visibilityTimeMillis(long j) {
            this.visibilityTimeMillis = j;
            return this;
        }

        public VisibilityPrivateConfig build() {
            return new VisibilityPrivateConfig(this.visibilityRatio, this.visibilityTimeMillis, (byte) 0);
        }
    }
}
