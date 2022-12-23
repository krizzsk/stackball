package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.h41;
import org.json.JSONException;

public class es0 implements i51<as0> {

    /* renamed from: a */
    private final hv0 f33065a = new hv0();

    /* renamed from: b */
    private final ft0 f33066b;

    public es0(Context context) {
        this.f33066b = new ft0(context);
    }

    /* renamed from: a */
    public Object mo66870a(fv0 fv0) {
        String a = this.f33065a.mo67641a(fv0);
        as0 as0 = null;
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            as0 = this.f33066b.mo67081a(a);
            as0.mo65852a("status", h41.C13277c.SUCCESS);
            return as0;
        } catch (xr0 | JSONException unused) {
            return as0;
        }
    }

    /* renamed from: a */
    public as0 mo66869a(String str) {
        as0 as0 = null;
        try {
            as0 = this.f33066b.mo67081a(str);
            as0.mo65852a("status", h41.C13277c.SUCCESS);
            return as0;
        } catch (xr0 | JSONException unused) {
            return as0;
        }
    }
}
