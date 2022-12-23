package com.yandex.mobile.ads.impl;

import android.view.View;

public class vo1 {
    /* renamed from: a */
    public static <T extends View> T m43177a(View view, int i) {
        T findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalStateException("View with id [" + view.getResources().getResourceName(i) + "] doesn't exist");
    }
}
