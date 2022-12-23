package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: com.yandex.mobile.ads.impl.t */
public class C14643t {
    /* renamed from: a */
    public Context mo70078a(Context context) {
        int i = 0;
        while (context instanceof ContextWrapper) {
            int i2 = i + 1;
            if (i >= 10) {
                return null;
            }
            if (context instanceof Activity) {
                return context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            i = i2;
        }
        return null;
    }
}
