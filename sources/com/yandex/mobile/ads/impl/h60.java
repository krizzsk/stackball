package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;

class h60 {

    /* renamed from: a */
    private final C12356a5 f34275a;

    /* renamed from: b */
    private final FalseClick f34276b;

    h60(Context context, C14645t1 t1Var, FalseClick falseClick) {
        this.f34275a = new C12356a5(context, t1Var);
        this.f34276b = falseClick;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo67420a(long j) {
        if (j <= this.f34276b.mo64661c()) {
            this.f34275a.mo65674a(this.f34276b.mo64662d());
        }
    }
}
