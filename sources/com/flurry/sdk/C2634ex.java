package com.flurry.sdk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.browser.customtabs.CustomTabsIntent;

/* renamed from: com.flurry.sdk.ex */
public final class C2634ex {

    /* renamed from: a */
    private static final String f6192a = C2634ex.class.getSimpleName();

    /* renamed from: b */
    private static Boolean f6193b = null;

    /* renamed from: com.flurry.sdk.ex$a */
    public interface C2635a {
        /* renamed from: a */
        void mo17836a(Context context);
    }

    private C2634ex() {
    }

    /* renamed from: a */
    public static void m5734a(Context context, CustomTabsIntent customTabsIntent, Uri uri, C2635a aVar) {
        if (!m5735a(context)) {
            aVar.mo17836a(context);
            return;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            Intent intent = customTabsIntent.intent;
            intent.putExtra("android.intent.extra.REFERRER", Uri.parse("2//" + context.getPackageName()));
        }
        customTabsIntent.intent.setPackage(C2636ey.m5737a(context));
        customTabsIntent.launchUrl(context, uri);
    }

    /* renamed from: a */
    public static boolean m5735a(Context context) {
        Boolean bool = f6193b;
        if (bool != null) {
            return bool.booleanValue();
        }
        f6193b = Boolean.TRUE;
        try {
            Class.forName("androidx.browser.customtabs.CustomTabsClient");
        } catch (ClassNotFoundException unused) {
            C2530db.m5490e(f6192a, "Couldn't find Chrome Custom Tab dependency. For better user experience include Chrome Custom Tab dependency in gradle");
            f6193b = Boolean.FALSE;
        }
        Boolean valueOf = Boolean.valueOf(f6193b.booleanValue() && C2636ey.m5737a(context) != null);
        f6193b = valueOf;
        return valueOf.booleanValue();
    }
}
