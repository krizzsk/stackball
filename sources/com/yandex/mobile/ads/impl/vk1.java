package com.yandex.mobile.ads.impl;

public class vk1 {

    /* renamed from: a */
    private final ln1 f41310a;

    /* renamed from: b */
    private boolean f41311b;

    vk1(wk1 wk1, ln1 ln1) {
        this.f41310a = ln1;
        this.f41311b = wk1.getVolume() == 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70501a(float f) {
        if (f == 0.0f) {
            if (!this.f41311b) {
                this.f41311b = true;
                this.f41310a.mo65768j();
            }
        } else if (this.f41311b) {
            this.f41311b = false;
            this.f41310a.mo65761c();
        }
    }
}
