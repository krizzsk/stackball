package com.yandex.metrica.impl.p265ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.Am */
public abstract class C10116Am extends C12040zo {

    /* renamed from: c */
    private static String f24345c = "";

    /* renamed from: b */
    private final String f24346b;

    public C10116Am(String str) {
        super(false);
        this.f24346b = "[" + C10796U2.m27878a(str) + "] ";
    }

    /* renamed from: a */
    public String mo61071a() {
        String str = f24345c;
        int i = C10585O2.f25307a;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = this.f24346b;
        if (str3 != null) {
            str2 = str3;
        }
        return str + str2;
    }

    /* renamed from: a */
    public static void m25999a(Context context) {
        f24345c = "[" + context.getPackageName() + "] : ";
    }
}
