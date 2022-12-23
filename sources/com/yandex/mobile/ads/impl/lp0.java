package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.el0;

public class lp0 extends cy0 {

    /* renamed from: k */
    private final pp0 f36773k;

    /* renamed from: l */
    private el0 f36774l = new r81();

    public lp0(Context context, sd0 sd0, yu0 yu0) {
        super(context);
        this.f36773k = new pp0(this, sd0, yu0);
    }

    /* renamed from: c */
    public void mo68495c(String str) {
        this.f36773k.mo69392b(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo64387h() {
        this.f36773k.mo69390a();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        el0.C12983a a = this.f36774l.mo65798a(i, i2);
        super.onMeasure(a.f33000a, a.f33001b);
    }

    public void setAspectRatio(float f) {
        this.f36774l = new u11(f);
    }

    public void setClickListener(C12877df dfVar) {
        this.f36773k.mo69391a(dfVar);
    }
}
