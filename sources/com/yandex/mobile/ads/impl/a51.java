package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import java.util.Locale;

public class a51 {
    /* renamed from: a */
    public int mo65681a(Context context, int i) {
        return Math.round(context.getResources().getDimension(i));
    }

    /* renamed from: a */
    public String mo65682a(Context context, Locale locale, int i) {
        Resources resources = context.getResources();
        if (Build.VERSION.SDK_INT >= 17) {
            Configuration configuration = new Configuration(resources.getConfiguration());
            configuration.setLocale(locale);
            resources = context.createConfigurationContext(configuration).getResources();
        }
        return resources.getString(i);
    }
}
