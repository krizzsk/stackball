package com.yandex.metrica.impl.p265ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.fe */
public class C11241fe {

    /* renamed from: a */
    private C11150de f26908a;

    public C11241fe(C11150de deVar) {
        this.f26908a = deVar;
    }

    /* renamed from: a */
    public void mo62897a(C11150de deVar) {
        this.f26908a = deVar;
    }

    /* renamed from: b */
    public boolean mo62899b(Context context) {
        if (!this.f26908a.mo62695a("android.permission.READ_PHONE_STATE")) {
            return false;
        }
        return C11111ce.m28639a(context, "android.permission.READ_PHONE_STATE");
    }

    /* renamed from: c */
    public boolean mo62900c(Context context) {
        if (!this.f26908a.mo62695a("android.permission.ACCESS_WIFI_STATE")) {
            return false;
        }
        return C11111ce.m28639a(context, "android.permission.ACCESS_WIFI_STATE");
    }

    /* renamed from: a */
    public boolean mo62898a(Context context) {
        if (!this.f26908a.mo62695a("android.permission.ACCESS_COARSE_LOCATION")) {
            return false;
        }
        return C11111ce.m28639a(context, "android.permission.ACCESS_COARSE_LOCATION");
    }
}
