package com.yandex.mobile.ads.impl;

import android.app.Application;
import android.content.Context;

public class jt1 {

    /* renamed from: a */
    private boolean f35639a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo68095a(Context context) {
        wt1.m43867a((Object) context, "Application Context cannot be null");
        if (!this.f35639a) {
            this.f35639a = true;
            bu1.m34401a().mo66123a(context);
            dt1 a = dt1.m35446a();
            if (context instanceof Application) {
                ((Application) context).registerActivityLifecycleCallbacks(a);
            }
            ft1.m36310a(context);
            qt1.m41436a().mo69649a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo68096a() {
        return this.f35639a;
    }
}
