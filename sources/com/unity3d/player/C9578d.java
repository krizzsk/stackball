package com.unity3d.player;

import android.util.Log;
import com.adcolony.sdk.AdColonyAppOptions;

/* renamed from: com.unity3d.player.d */
final class C9578d {

    /* renamed from: a */
    protected static boolean f23857a = false;

    protected static void Log(int i, String str) {
        if (!f23857a) {
            if (i == 6) {
                Log.e(AdColonyAppOptions.UNITY, str);
            }
            if (i == 5) {
                Log.w(AdColonyAppOptions.UNITY, str);
            }
        }
    }
}
