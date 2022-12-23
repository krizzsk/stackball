package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.text.TextUtils;

public class q41 {
    /* renamed from: a */
    public void mo69487a(Uri.Builder builder, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }
}
