package com.ironsource.mediationsdk;

import com.smaato.sdk.video.vast.model.ErrorCode;

public class ISBannerSize {
    public static final ISBannerSize BANNER = new ISBannerSize("BANNER", 320, 50);
    public static final ISBannerSize LARGE = new ISBannerSize("LARGE", 320, 90);
    public static final ISBannerSize RECTANGLE = new ISBannerSize("RECTANGLE", ErrorCode.GENERAL_WRAPPER_ERROR, 250);
    public static final ISBannerSize SMART = new ISBannerSize("SMART", 0, 0);

    /* renamed from: a */
    protected static final ISBannerSize f12971a = new ISBannerSize("LEADERBOARD", 728, 90);

    /* renamed from: b */
    private int f12972b;

    /* renamed from: c */
    private int f12973c;

    /* renamed from: d */
    private String f12974d;

    public ISBannerSize(int i, int i2) {
        this("CUSTOM", i, i2);
    }

    public ISBannerSize(String str, int i, int i2) {
        this.f12974d = str;
        this.f12972b = i;
        this.f12973c = i2;
    }

    public String getDescription() {
        return this.f12974d;
    }

    public int getHeight() {
        return this.f12973c;
    }

    public int getWidth() {
        return this.f12972b;
    }

    public boolean isSmart() {
        return this.f12974d.equals("SMART");
    }
}
