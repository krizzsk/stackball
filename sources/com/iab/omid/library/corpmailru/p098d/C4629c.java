package com.iab.omid.library.corpmailru.p098d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.corpmailru.C4604a;

/* renamed from: com.iab.omid.library.corpmailru.d.c */
public final class C4629c {
    /* renamed from: a */
    public static void m9831a(String str) {
        if (C4604a.f10372a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m9832a(String str, Exception exc) {
        if ((C4604a.f10372a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
