package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

public class fi1 {

    /* renamed from: a */
    private final hv0 f33373a = new hv0();

    /* renamed from: b */
    private final ti1 f33374b;

    public fi1(Context context) {
        this.f33374b = new ti1(context);
    }

    /* renamed from: a */
    public ci1 mo67021a(fv0 fv0) {
        String a = this.f33373a.mo67641a(fv0);
        if (!TextUtils.isEmpty(a)) {
            try {
                xh1 a2 = this.f33374b.mo70188a(a);
                if (a2 != null) {
                    Map<String, String> map = fv0.f33757c;
                    boolean z = false;
                    if (map != null) {
                        z = p90.m40709a(map, wb0.YMAD_RAW_VAST_ENABLED, false);
                    }
                    if (!z) {
                        a = null;
                    }
                    return new ci1(a2, a);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
