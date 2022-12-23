package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: com.mbridge.msdk.foundation.tools.g */
/* compiled from: DomainSameTool */
public class C6336g {

    /* renamed from: a */
    private static String f15717a = "DomainSameTool";

    /* renamed from: a */
    public static boolean m16061a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            Resources resources = context.getResources();
            if (resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C6361q.m16155a(f15717a, th.getMessage(), th);
            return false;
        }
    }
}
