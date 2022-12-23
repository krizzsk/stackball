package com.tapjoy.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.ho */
abstract class C9378ho implements C9324gl {

    /* renamed from: a */
    private static final String[] f23247a;

    C9378ho() {
    }

    static {
        String[] strArr = {"reward", FirebaseAnalytics.Event.PURCHASE, "custom_action"};
        f23247a = strArr;
        Arrays.sort(strArr);
    }

    /* renamed from: a */
    public final void mo58215a(C9325gm gmVar) {
        if (this instanceof C9328gp) {
            C9328gp gpVar = (C9328gp) this;
            gmVar.mo57316a(gpVar.mo58216a(), gpVar.mo58217b());
        } else if (this instanceof C9329gq) {
            C9329gq gqVar = (C9329gq) this;
            gmVar.mo57317a(gqVar.mo58218a(), gqVar.mo58219b(), gqVar.mo58220c(), gqVar.mo58221d());
        }
    }

    /* renamed from: a */
    public static boolean m25200a(String str) {
        return Arrays.binarySearch(f23247a, str) >= 0;
    }

    @Nullable
    /* renamed from: a */
    public static C9378ho m25199a(String str, C9101bn bnVar) {
        if ("reward".equals(str)) {
            return (C9378ho) bnVar.mo57853a(C9398hy.f23300a);
        }
        if (FirebaseAnalytics.Event.PURCHASE.equals(str)) {
            return (C9378ho) bnVar.mo57853a(C9394hw.f23291a);
        }
        return null;
    }
}
