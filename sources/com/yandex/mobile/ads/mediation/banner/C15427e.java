package com.yandex.mobile.ads.mediation.banner;

import android.content.Context;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.impl.C14645t1;
import com.yandex.mobile.ads.impl.ym0;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.mediation.banner.e */
class C15427e extends ym0 {
    C15427e(C14645t1 t1Var) {
        super(t1Var);
    }

    /* renamed from: a */
    public Map<String, Object> mo71101a(Context context) {
        Map<String, Object> a = super.mo71101a(context);
        SizeInfo n = this.f42896a.mo70108n();
        if (n != null) {
            HashMap hashMap = (HashMap) a;
            hashMap.put("width", Integer.valueOf(n.mo64491c(context)));
            hashMap.put("height", Integer.valueOf(n.mo64488a(context)));
        }
        return a;
    }
}
