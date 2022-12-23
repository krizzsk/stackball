package com.mbridge.msdk.mbsignalcommon.base;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.click.C6103b;
import com.mbridge.msdk.foundation.controller.C6122a;

/* renamed from: com.mbridge.msdk.mbsignalcommon.base.c */
/* compiled from: IntentFilter */
public final class C6536c implements C6534a {
    /* renamed from: a */
    public final boolean mo44425a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String scheme = Uri.parse(str).getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.equals(SDKConstants.PARAM_INTENT)) {
            return false;
        }
        return C6103b.m15229d(C6122a.m15302b().mo42895d(), str);
    }
}
