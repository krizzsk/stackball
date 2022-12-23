package com.iab.omid.library.oguryco.p116d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.oguryco.C4752a;

/* renamed from: com.iab.omid.library.oguryco.d.c */
public final class C4778c {
    /* renamed from: a */
    public static void m10491a(String str) {
        if (C4752a.f10701a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m10492a(String str, Exception exc) {
        if ((C4752a.f10701a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
