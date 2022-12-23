package com.yandex.mobile.ads.impl;

import android.content.Context;

class ak0 {

    /* renamed from: a */
    private final yj0 f30590a;

    /* renamed from: b */
    private final az0 f30591b;

    /* renamed from: c */
    private zj0 f30592c;

    ak0(Context context, String str) {
        this.f30590a = new yj0(context, str);
        this.f30591b = new az0(context);
    }

    /* renamed from: a */
    private zj0 m33774a() {
        y80 a = this.f30590a.mo71090a();
        if (a != null) {
            boolean a2 = this.f30591b.mo65923a();
            boolean b = this.f30591b.mo65924b();
            if (a2 || b) {
                return a.mo71006a();
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public zj0 mo65794b() {
        zj0 zj0 = this.f30592c;
        return zj0 != null ? zj0 : m33774a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo65795c() {
        this.f30592c = m33774a();
        this.f30592c = m33774a();
    }
}
