package com.amazon.device.ads;

import android.view.ViewTreeObserver;

class ViewUtils {
    private final AndroidBuildInfo androidBuildInfo;

    public ViewUtils() {
        this(new AndroidBuildInfo());
    }

    ViewUtils(AndroidBuildInfo androidBuildInfo2) {
        this.androidBuildInfo = androidBuildInfo2;
    }

    public boolean removeOnGlobalLayoutListener(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (!viewTreeObserver.isAlive()) {
            return false;
        }
        if (AndroidTargetUtils.isAtLeastAndroidAPI(this.androidBuildInfo, 16)) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
        return true;
    }
}
