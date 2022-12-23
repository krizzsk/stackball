package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJPlacementListener;

public class TapjoyNative {
    public static Object createPlacement(Context context, String str, TJPlacementListener tJPlacementListener) {
        return C9311gc.m24948a().mo58187a(context, str, tJPlacementListener);
    }
}
