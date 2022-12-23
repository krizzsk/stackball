package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.Log;

public class oh1 {

    /* renamed from: a */
    private final Context f38226a;

    /* renamed from: b */
    private final ph1 f38227b = new ph1();

    /* renamed from: c */
    private final ij1 f38228c = new ij1();

    /* renamed from: d */
    private final nh1 f38229d = new nh1();

    public oh1(Context context) {
        this.f38226a = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo69163a() {
        ij1 ij1 = this.f38228c;
        Context context = this.f38226a;
        ij1.getClass();
        if (C13378i5.m37284b(context) && this.f38229d.mo69031a(this.f38226a)) {
            this.f38227b.getClass();
            Log.e("Yandex Mobile Ads", "Yandex Mobile Ads version validation\n***************************************************************************************\n* The integrated version of the Yandex Mobile Ads SDK is outdated.                    *\n* Please update com.yandex.android:mobileads to the latest version.                   *\n* Learn more about the latest version of the SDK here:                                *\n* https://yandex.ru/dev/mobile-ads/doc/android/quick-start/android-ads-component.html *\n* Changelog: https://yandex.ru/dev/mobile-ads/doc/intro/changelog-android.html        *\n***************************************************************************************\n");
        }
    }
}
