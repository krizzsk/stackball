package com.iab.omid.library.adcolony.p092d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.adcolony.C4554a;

/* renamed from: com.iab.omid.library.adcolony.d.c */
public final class C4579c {
    /* renamed from: a */
    public static void m9607a(String str) {
        if (C4554a.f10221a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m9608a(String str, Exception exc) {
        if ((C4554a.f10221a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
