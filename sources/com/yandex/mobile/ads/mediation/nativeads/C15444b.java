package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.mobile.ads.impl.lo1;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.b */
class C15444b {

    /* renamed from: a */
    private final Context f43647a;

    C15444b(Context context) {
        this.f43647a = context.getApplicationContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo71456a(int i, int i2) {
        int a = lo1.m38865a(this.f43647a, i);
        int a2 = lo1.m38865a(this.f43647a, i2);
        if (a >= 320 || a2 >= 240) {
            return "large";
        }
        return (a >= 160 || a2 >= 160) ? FirebaseAnalytics.Param.MEDIUM : "small";
    }
}
