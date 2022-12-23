package com.iab.omid.library.smaato.p122d;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* renamed from: com.iab.omid.library.smaato.d.f */
public final class C4830f {
    /* renamed from: a */
    public static float m10722a(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: b */
    public static View m10723b(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m10724c(View view) {
        if ((Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = m10723b(view);
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m10725d(View view) {
        return (Build.VERSION.SDK_INT < 19 || view.isAttachedToWindow()) && view.getVisibility() == 0 && view.getAlpha() != 0.0f;
    }
}
