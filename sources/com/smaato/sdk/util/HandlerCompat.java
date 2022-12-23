package com.smaato.sdk.util;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

public abstract class HandlerCompat {
    private HandlerCompat() {
    }

    public static Handler create(Looper looper) {
        if (looper != null) {
            return Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
        }
        throw new NullPointerException("'looper' specified as non-null is null");
    }
}
