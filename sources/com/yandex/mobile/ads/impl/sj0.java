package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

public class sj0 {

    /* renamed from: a */
    private final qj0 f40009a = new qj0();

    /* renamed from: a */
    public String mo70001a(Context context) {
        Locale locale = context.getResources().getConfiguration().locale;
        this.f40009a.getClass();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(language);
        if (Build.VERSION.SDK_INT >= 21) {
            String script = locale.getScript();
            if (!TextUtils.isEmpty(script)) {
                sb.append('-');
                sb.append(script);
            }
        }
        if (!TextUtils.isEmpty(country)) {
            sb.append('_');
            sb.append(country);
        }
        return sb.toString();
    }
}
