package com.smaato.sdk.core.util;

import android.os.SystemClock;

public final class Clock {
    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
