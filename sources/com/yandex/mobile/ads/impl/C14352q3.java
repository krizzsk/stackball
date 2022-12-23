package com.yandex.mobile.ads.impl;

import android.content.Context;

/* renamed from: com.yandex.mobile.ads.impl.q3 */
public class C14352q3 {

    /* renamed from: a */
    private final Context f38973a;

    /* renamed from: b */
    private final l71 f38974b = l71.m38631c();

    /* renamed from: c */
    private final C13955m5 f38975c;

    /* renamed from: d */
    private final C13834l5 f38976d;

    public C14352q3(Context context, C13955m5 m5Var, C13834l5 l5Var) {
        this.f38973a = context;
        this.f38975c = m5Var;
        this.f38976d = l5Var;
    }

    /* renamed from: a */
    public boolean mo69473a() {
        boolean z;
        d71 a = this.f38974b.mo68362a(this.f38973a);
        if (a != null && !a.mo66474v()) {
            z = this.f38975c.mo64375a(1);
        } else {
            z = this.f38975c.mo64374a();
        }
        if (!z || !this.f38976d.mo68356a()) {
            return false;
        }
        return true;
    }
}
