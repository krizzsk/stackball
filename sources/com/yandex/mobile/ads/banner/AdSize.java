package com.yandex.mobile.ads.banner;

import android.content.Context;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.yandex.mobile.ads.base.SizeInfo;

public final class AdSize extends C12079f {
    @Deprecated
    public static final AdSize BANNER_240x400 = new AdSize(240, ErrorCode.GENERAL_LINEAR_ERROR);
    @Deprecated
    public static final AdSize BANNER_300x250 = new AdSize(ErrorCode.GENERAL_WRAPPER_ERROR, 250);
    @Deprecated
    public static final AdSize BANNER_300x300 = new AdSize(ErrorCode.GENERAL_WRAPPER_ERROR, ErrorCode.GENERAL_WRAPPER_ERROR);
    @Deprecated
    public static final AdSize BANNER_320x100 = new AdSize(320, 100);
    @Deprecated
    public static final AdSize BANNER_320x50 = new AdSize(320, 50);
    @Deprecated
    public static final AdSize BANNER_400x240 = new AdSize(ErrorCode.GENERAL_LINEAR_ERROR, 240);
    @Deprecated
    public static final AdSize BANNER_728x90 = new AdSize(728, 90);
    public static final AdSize FULL_SCREEN = new AdSize(-1, -2);
    private static final long serialVersionUID = 2680092174282737642L;

    @Deprecated
    public AdSize(int i, int i2) {
        this(i, i2, SizeInfo.C12090b.FIXED);
    }

    public static AdSize flexibleSize(int i, int i2) {
        return new AdSize(i, i2, SizeInfo.C12090b.FLEXIBLE);
    }

    public static AdSize stickySize(int i) {
        return new AdSize(i, 0, SizeInfo.C12090b.STICKY);
    }

    public int getHeight() {
        return super.getHeight();
    }

    public int getHeightInPixels(Context context) {
        return super.getHeightInPixels(context);
    }

    public int getWidth() {
        return super.getWidth();
    }

    public int getWidthInPixels(Context context) {
        return super.getWidthInPixels(context);
    }

    AdSize(int i, int i2, SizeInfo.C12090b bVar) {
        super(i, i2, bVar);
    }

    public int getHeight(Context context) {
        return super.getHeight(context);
    }

    public int getWidth(Context context) {
        return super.getWidth(context);
    }
}
