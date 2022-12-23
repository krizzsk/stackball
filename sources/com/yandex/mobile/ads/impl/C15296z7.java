package com.yandex.mobile.ads.impl;

import android.content.Context;

/* renamed from: com.yandex.mobile.ads.impl.z7 */
class C15296z7 {

    /* renamed from: a */
    private final Context f43030a;

    /* renamed from: b */
    private final l71 f43031b = l71.m38631c();

    /* renamed from: c */
    private final C15017w0 f43032c;

    /* renamed from: d */
    private final e71 f43033d = new e71();

    C15296z7(Context context) {
        this.f43030a = context.getApplicationContext();
        this.f43032c = new C15017w0(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo71161a() {
        if (this.f43032c.mo70612a().mo70260b()) {
            d71 a = this.f43031b.mo68362a(this.f43030a);
            if (!(a != null && a.mo66463k() && !this.f43033d.mo66772a(a))) {
                return true;
            }
        }
        return false;
    }
}
