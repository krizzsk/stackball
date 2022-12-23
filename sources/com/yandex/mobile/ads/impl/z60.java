package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.SizeInfo;

class z60 {

    /* renamed from: a */
    private final Context f43027a;

    /* renamed from: b */
    private final SizeInfo f43028b;

    /* renamed from: c */
    private final C13371i0 f43029c;

    z60(Context context, SizeInfo sizeInfo, C13371i0 i0Var) {
        this.f43027a = context.getApplicationContext();
        this.f43028b = sizeInfo;
        this.f43029c = i0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71159a() {
        int i = this.f43027a.getResources().getConfiguration().orientation;
        Context context = this.f43027a;
        SizeInfo sizeInfo = this.f43028b;
        boolean b = C13474j5.m37669b(context, sizeInfo);
        boolean a = C13474j5.m37666a(context, sizeInfo);
        int i2 = 1;
        if (b == a) {
            i2 = -1;
        } else if (!a ? 1 != i : 1 == i) {
            i2 = 0;
        }
        if (-1 != i2) {
            ((C14049n0) this.f43029c).mo68876a(i2);
        }
    }
}
