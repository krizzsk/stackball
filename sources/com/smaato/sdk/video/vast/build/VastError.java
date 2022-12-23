package com.smaato.sdk.video.vast.build;

public final class VastError {
    public final String assetUrl;
    public final int code;
    public final long offsetMillis;

    /* synthetic */ VastError(int i, long j, String str, byte b) {
        this(i, j, str);
    }

    private VastError(int i, long j, String str) {
        this.code = i;
        this.offsetMillis = j;
        this.assetUrl = str;
    }

    public static class Builder {
        private String assetUrl;
        private int code;
        private long offsetMillis;

        public Builder(int i) {
            this.code = i;
        }

        public Builder setAssetUrl(String str) {
            this.assetUrl = str;
            return this;
        }

        public Builder setOffsetMillis(long j) {
            this.offsetMillis = j;
            return this;
        }

        public VastError build() {
            return new VastError(this.code, this.offsetMillis, this.assetUrl, (byte) 0);
        }
    }
}
