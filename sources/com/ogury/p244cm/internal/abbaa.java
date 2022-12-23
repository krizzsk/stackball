package com.ogury.p244cm.internal;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ogury.cm.internal.abbaa */
public final class abbaa implements abacc {

    /* renamed from: a */
    private final Handler f20406a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final void mo52670a(bbaaa<babcc> bbaaa) {
        bbabc.m22051b(bbaaa, "action");
        this.f20406a.post(new abbab(bbaaa));
    }
}
