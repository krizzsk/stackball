package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.fyber.inneractive.sdk.util.n */
public final class C3665n {
    /* renamed from: a */
    public static boolean m9139a(Context context, Uri uri) {
        if (context == null || uri == null) {
            return false;
        }
        try {
            return !context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0).isEmpty();
        } catch (Exception unused) {
            IAlog.m9034b("%sFyberDeepLink: Invalid url ", uri);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m9140a(Context context, String str) {
        return !TextUtils.isEmpty(str) && m9139a(context, Uri.parse(str));
    }
}
