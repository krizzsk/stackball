package com.tapjoy.internal;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* renamed from: com.tapjoy.internal.dp */
public final class C9167dp {
    /* renamed from: a */
    public static float m24546a(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static String m24548c(View view) {
        if (Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility != 0) {
            return visibility != 4 ? visibility != 8 ? "viewNotVisible" : "viewGone" : "viewInvisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m24547b(View view) {
        if ((Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return true;
    }
}
