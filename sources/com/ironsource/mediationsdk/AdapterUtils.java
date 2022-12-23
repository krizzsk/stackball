package com.ironsource.mediationsdk;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

public class AdapterUtils {
    public static int dpToPixels(Activity activity, int i) {
        if (activity != null) {
            return (int) TypedValue.applyDimension(1, (float) i, activity.getResources().getDisplayMetrics());
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "AdapterUtils dpToPixels - activity is null, returning dpSize", 3);
        return i;
    }

    public static boolean isLargeScreen(Activity activity) {
        if (activity == null) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "AdapterUtils isLargeScreen - activity is null", 3);
            return false;
        }
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        return ((float) displayMetrics.heightPixels) / displayMetrics.density > 720.0f && ((float) displayMetrics.widthPixels) / displayMetrics.density >= 728.0f;
    }
}
