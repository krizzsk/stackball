package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.mediation.base.C15434a;
import com.yandex.mobile.ads.mediation.base.C15435b;
import java.util.HashMap;

class in0 {

    /* renamed from: a */
    private final wm0 f34954a;

    /* renamed from: b */
    private final C15435b f34955b = new C15435b();

    public in0(wm0 wm0) {
        this.f34954a = wm0;
    }

    /* renamed from: a */
    public void mo67837a(Context context, hn0 hn0, C15434a aVar, String str, Long l) {
        HashMap hashMap = new HashMap();
        hashMap.put("failure_reason", str);
        hashMap.put("status", "error");
        if (l != null) {
            hashMap.put("response_time", l);
        }
        if (aVar != null) {
            hashMap.putAll(this.f34955b.mo71388a(aVar));
        }
        this.f34954a.mo70729h(context, hn0, hashMap);
    }

    /* renamed from: a */
    public void mo67836a(Context context, hn0 hn0, C15434a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("status", "success");
        if (aVar != null) {
            hashMap.putAll(this.f34955b.mo71388a(aVar));
        }
        this.f34954a.mo70729h(context, hn0, hashMap);
    }
}
