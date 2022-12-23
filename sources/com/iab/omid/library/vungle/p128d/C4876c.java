package com.iab.omid.library.vungle.p128d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.vungle.C4851a;

/* renamed from: com.iab.omid.library.vungle.d.c */
public final class C4876c {
    /* renamed from: a */
    public static void m10919a(String str) {
        if (C4851a.f10921a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m10920a(String str, Exception exc) {
        if ((C4851a.f10921a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
