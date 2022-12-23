package com.adcolony.sdk;

import com.smaato.sdk.video.vast.model.ErrorCode;

public class AdColonyAdSize {
    public static final AdColonyAdSize BANNER = new AdColonyAdSize(320, 50);
    public static final AdColonyAdSize LEADERBOARD = new AdColonyAdSize(728, 90);
    public static final AdColonyAdSize MEDIUM_RECTANGLE = new AdColonyAdSize(ErrorCode.GENERAL_WRAPPER_ERROR, 250);
    public static final AdColonyAdSize SKYSCRAPER = new AdColonyAdSize(160, 600);

    /* renamed from: a */
    int f88a;

    /* renamed from: b */
    int f89b;

    public AdColonyAdSize(int i, int i2) {
        this.f88a = i;
        this.f89b = i2;
    }

    public int getHeight() {
        return this.f89b;
    }

    public int getWidth() {
        return this.f88a;
    }
}
