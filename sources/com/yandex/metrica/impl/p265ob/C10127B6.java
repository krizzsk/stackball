package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.os.Bundle;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* renamed from: com.yandex.metrica.impl.ob.B6 */
class C10127B6 {

    /* renamed from: a */
    private String f24390a;

    /* renamed from: b */
    private C10364I9 f24391b;

    /* renamed from: c */
    private C10099A6 f24392c;

    public C10127B6(Context context) {
        this(context.getPackageName(), C10619P0.m27164i().mo61893u(), new C10099A6());
    }

    /* renamed from: a */
    public Bundle mo61098a() {
        Bundle bundle = new Bundle();
        C10099A6 a6 = this.f24392c;
        String str = this.f24390a;
        boolean f = this.f24391b.mo61521f();
        a6.getClass();
        bundle.putString(CampaignEx.JSON_KEY_PACKAGE_NAME, str);
        bundle.putBoolean("clte", f);
        return bundle;
    }

    C10127B6(String str, C10364I9 i9, C10099A6 a6) {
        this.f24390a = str;
        this.f24391b = i9;
        this.f24392c = a6;
    }
}
