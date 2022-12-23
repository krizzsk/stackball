package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.MutableContextWrapper;

/* renamed from: com.ironsource.sdk.controller.c */
public final class C5860c {

    /* renamed from: a */
    private MutableContextWrapper f14295a;

    /* renamed from: a */
    public final Activity mo42245a() {
        return (Activity) this.f14295a.getBaseContext();
    }

    /* renamed from: a */
    public final synchronized void mo42246a(Activity activity) {
        if (this.f14295a == null) {
            this.f14295a = new MutableContextWrapper(activity);
        }
        this.f14295a.setBaseContext(activity);
    }

    /* renamed from: b */
    public final synchronized void mo42247b() {
        this.f14295a = null;
    }
}
