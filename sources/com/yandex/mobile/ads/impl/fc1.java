package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;

public final class fc1 {

    /* renamed from: c */
    private static final Object f33315c = new Object();

    /* renamed from: d */
    private static volatile fc1 f33316d;

    /* renamed from: a */
    private final tx0 f33317a;

    /* renamed from: b */
    private String[] f33318b;

    private fc1(Context context) {
        this.f33317a = new tx0(context);
    }

    /* renamed from: a */
    public static fc1 m35987a(Context context) {
        if (f33316d == null) {
            synchronized (f33315c) {
                if (f33316d == null) {
                    f33316d = new fc1(context.getApplicationContext());
                }
            }
        }
        return f33316d;
    }

    /* renamed from: a */
    public String[] mo66988a() {
        if (this.f33318b == null) {
            ArrayList arrayList = new ArrayList();
            if (this.f33317a.mo70243a("com.android.launcher.permission.INSTALL_SHORTCUT") && this.f33317a.mo70243a("com.android.launcher.permission.UNINSTALL_SHORTCUT")) {
                arrayList.add("shortcut");
            }
            this.f33318b = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return this.f33318b;
    }
}
