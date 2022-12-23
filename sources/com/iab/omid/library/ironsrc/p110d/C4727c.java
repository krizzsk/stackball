package com.iab.omid.library.ironsrc.p110d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.ironsrc.C4702a;

/* renamed from: com.iab.omid.library.ironsrc.d.c */
public final class C4727c {
    /* renamed from: a */
    public static void m10262a(String str) {
        if (C4702a.f10587a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m10263a(String str, Exception exc) {
        if ((C4702a.f10587a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
