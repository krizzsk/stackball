package com.ironsource.mediationsdk.logger;

import android.util.Log;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* renamed from: com.ironsource.mediationsdk.logger.a */
public final class C5713a extends IronSourceLogger {
    private C5713a() {
        super("console");
    }

    public C5713a(int i) {
        super("console", 0);
    }

    public final void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        if (i == 0) {
            Log.v("ironSourceSDK: " + ironSourceTag, str);
        } else if (i == 1) {
            Log.i("ironSourceSDK: " + ironSourceTag, str);
        } else if (i == 2) {
            Log.w("ironSourceSDK: " + ironSourceTag, str);
        } else if (i == 3) {
            Log.e("ironSourceSDK: " + ironSourceTag, str);
        }
    }

    public final void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        log(ironSourceTag, str + ":stacktrace[" + Log.getStackTraceString(th) + "]", 3);
    }
}
