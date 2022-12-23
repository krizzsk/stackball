package com.flurry.sdk;

import android.content.Context;

/* renamed from: com.flurry.sdk.s */
public final class C2664s {
    /* renamed from: a */
    public static C2662r m5804a(Context context, String str) {
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return new C2659o(str);
        }
        return new C2660p(context, str);
    }
}
