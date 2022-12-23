package com.mbridge.msdk.foundation.tools;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: com.mbridge.msdk.foundation.tools.aa */
/* compiled from: ViewUtil */
public final class C6330aa {
    /* renamed from: a */
    public static void m16057a(View view) {
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
    }
}
