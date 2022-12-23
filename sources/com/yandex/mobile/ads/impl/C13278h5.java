package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.webkit.WebViewDatabase;
import com.yandex.mobile.ads.base.C12116o;

/* renamed from: com.yandex.mobile.ads.impl.h5 */
public final class C13278h5 {

    /* renamed from: a */
    public static final long f34273a = ((long) (Math.floor(Math.random() * 4.294967295E9d) + 1.0d));

    /* renamed from: b */
    public static final /* synthetic */ int f34274b = 0;

    /* renamed from: a */
    public static boolean m36802a(C15243ye yeVar) {
        return yeVar == null || ((C12116o) yeVar).mo64599k();
    }

    /* renamed from: a */
    public static ResultReceiver m36798a(ResultReceiver resultReceiver) {
        if (resultReceiver == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return resultReceiver2;
    }

    /* renamed from: a */
    public static boolean m36801a(Context context) {
        try {
            return WebViewDatabase.getInstance(context) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static Long m36799a(String str, Long l) {
        if (str == null) {
            return l;
        }
        try {
            return Long.valueOf(str);
        } catch (NumberFormatException unused) {
            return l;
        }
    }

    /* renamed from: a */
    public static <T> String m36800a(T t) {
        return t.toString();
    }
}
