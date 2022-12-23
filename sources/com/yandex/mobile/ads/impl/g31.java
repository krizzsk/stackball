package com.yandex.mobile.ads.impl;

import android.content.Context;

class g31 {

    /* renamed from: a */
    private final Context f33873a;

    /* renamed from: b */
    private final C14191ol f33874b = new C14191ol();

    g31(Context context) {
        this.f33873a = context.getApplicationContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ul0 mo67180a() {
        if (C14104nl.TV.equals(this.f33874b.mo69198a(this.f33873a))) {
            return new ul0(1920, 1080, 6800);
        }
        return new ul0(854, 480, 1000);
    }
}
