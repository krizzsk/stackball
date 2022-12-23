package com.mbridge.msdk.foundation.tools;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;

/* renamed from: com.mbridge.msdk.foundation.tools.y */
/* compiled from: UriUtil */
public final class C6370y {
    /* renamed from: a */
    public static String m16237a(String str) {
        try {
            return !TextUtils.isEmpty(str) ? new URL(str).getPath() : str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public static String m16238a(String str, String str2) {
        try {
            return !TextUtils.isEmpty(str) ? Uri.parse(str).getQueryParameter(str2) : str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
