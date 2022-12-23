package com.smaato.sdk.core.p248ad;

import com.smaato.sdk.video.vast.model.ErrorCode;

/* renamed from: com.smaato.sdk.core.ad.AdDimension */
public enum AdDimension {
    XX_LARGE(320, 50),
    X_LARGE(ErrorCode.GENERAL_WRAPPER_ERROR, 50),
    LARGE(216, 36),
    MEDIUM(168, 28),
    SMALL(120, 20),
    MEDIUM_RECTANGLE(ErrorCode.GENERAL_WRAPPER_ERROR, 250),
    SKYSCRAPER(120, 600),
    LEADERBOARD(728, 90),
    FULLSCREEN_PORTRAIT(320, 480),
    FULLSCREEN_LANDSCAPE(480, 320),
    FULLSCREEN_PORTRAIT_TABLET(768, 1024),
    FULLSCREEN_LANDSCAPE_TABLET(1024, 768);
    
    private final float aspectRatio;
    private final int height;
    private final int width;

    private AdDimension(int i, int i2) {
        this.width = i;
        this.height = i2;
        this.aspectRatio = ((float) i) / ((float) i2);
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }
}
