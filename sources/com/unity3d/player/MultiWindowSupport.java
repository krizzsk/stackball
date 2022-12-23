package com.unity3d.player;

import android.app.Activity;

public class MultiWindowSupport {
    private static final String RESIZABLE_WINDOW = "unity.allow-resizable-window";

    public static boolean getAllowResizableWindow(Activity activity) {
        try {
            return isInMultiWindowMode(activity) && activity.getApplicationInfo().metaData.getBoolean(RESIZABLE_WINDOW);
        } catch (Exception unused) {
        }
    }

    static boolean isInMultiWindowMode(Activity activity) {
        if (PlatformSupport.NOUGAT_SUPPORT) {
            return activity.isInMultiWindowMode();
        }
        return false;
    }
}
