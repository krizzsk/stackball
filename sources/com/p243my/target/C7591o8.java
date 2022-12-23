package com.p243my.target;

import android.app.Application;
import android.content.Context;
import com.p243my.tracker.MyTracker;

/* renamed from: com.my.target.o8 */
public final class C7591o8 {

    /* renamed from: a */
    public static boolean f19161a;

    /* renamed from: a */
    public static void m20042a(Context context) {
        if (!f19161a) {
            try {
                String str = (String) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("com.my.target.myTrackerSdkKey");
                if (str != null) {
                    MyTracker.initTracker(str, (Application) context.getApplicationContext());
                } else {
                    C7374e0.m18989a("myTracker SDK key is not provided");
                }
            } catch (Throwable th) {
                C7374e0.m18989a("Unable to initialize myTracker: " + th.getMessage());
            }
            f19161a = true;
        }
    }
}
