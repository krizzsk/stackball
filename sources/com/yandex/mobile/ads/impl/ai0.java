package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class ai0 {
    /* renamed from: a */
    public static final <T> T m33743a(JSONObject jSONObject, String str, rh1<T> rh1, ny0 ny0, ly0 ly0) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        Intrinsics.checkNotNullParameter(rh1, "validator");
        Intrinsics.checkNotNullParameter(ny0, "logger");
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        T opt = jSONObject.opt(str);
        if (Intrinsics.areEqual((Object) opt, JSONObject.NULL)) {
            opt = null;
        }
        if (opt == null) {
            throw py0.m41002a(jSONObject, str);
        } else if (rh1.mo65491a(opt)) {
            return opt;
        } else {
            throw py0.m41004a(jSONObject, str, opt);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m33745a(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "it");
        return true;
    }

    /* renamed from: a */
    public static /* synthetic */ Object m33744a(JSONObject jSONObject, String str, rh1 rh1, ny0 ny0, ly0 ly0, int i) {
        return m33743a(jSONObject, str, (i & 2) != 0 ? $$Lambda$ai0$__dl0wm_kEbWUJRid1Dr2k7d4rg.INSTANCE : null, ny0, ly0);
    }
}
