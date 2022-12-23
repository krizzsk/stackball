package com.applovin.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.unity3d.player.UnityPlayer;

public class Utils {
    static Activity getCurrentActivity() {
        return UnityPlayer.currentActivity;
    }

    static void runSafelyOnUiThread(Activity activity, final Runnable runnable) {
        activity.runOnUiThread(new Runnable() {
            public void run() {
                try {
                    runnable.run();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    static String retrieveSdkKey() {
        Bundle retrieveMetadata;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || (retrieveMetadata = retrieveMetadata(currentActivity.getApplicationContext())) == null) {
            return null;
        }
        String string = retrieveMetadata.getString("applovin.sdk.key");
        return string != null ? string : "";
    }

    private static Bundle retrieveMetadata(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (Throwable unused) {
            return null;
        }
    }
}
