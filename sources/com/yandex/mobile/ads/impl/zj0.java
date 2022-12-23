package com.yandex.mobile.ads.impl;

import android.location.Location;

class zj0 {

    /* renamed from: a */
    private final Object f43215a;

    zj0(Object obj) {
        this.f43215a = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Location mo71248a() {
        Object a = h31.m36786a(this.f43215a, "getResult", new Object[0]);
        if (a instanceof Location) {
            return (Location) a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo71249b() {
        Object a = h31.m36786a(this.f43215a, "isComplete", new Object[0]);
        if (a instanceof Boolean) {
            return ((Boolean) a).booleanValue();
        }
        return false;
    }
}
