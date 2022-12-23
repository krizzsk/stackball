package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

/* renamed from: com.yandex.mobile.ads.impl.il */
public class C13418il implements C13058fl {

    /* renamed from: a */
    private final AdResponse f34912a;

    /* renamed from: b */
    private final String f34913b;

    public C13418il(AdResponse adResponse, String str) {
        this.f34912a = adResponse;
        this.f34913b = str;
    }

    /* renamed from: a */
    public boolean mo67026a(Context context) {
        return this.f34913b.equals(this.f34912a.mo64440t());
    }
}
