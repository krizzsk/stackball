package com.yandex.mobile.ads.impl;

import java.util.Map;

class b80 implements xe1, ch1 {

    /* renamed from: a */
    private final C15050wh f31264a;

    /* renamed from: b */
    private Map<String, String> f31265b;

    /* renamed from: c */
    private boolean f31266c;

    b80(C15050wh whVar) {
        this.f31264a = whVar;
    }

    /* renamed from: a */
    public void mo66019a(boolean z) {
        this.f31266c = z;
        this.f31264a.mo66217a(z);
    }

    /* renamed from: a */
    public void mo66018a(Map<String, String> map) {
        this.f31265b = map;
    }

    /* renamed from: a */
    public a80 mo66017a() {
        return new a80(this.f31266c, this.f31265b);
    }
}
