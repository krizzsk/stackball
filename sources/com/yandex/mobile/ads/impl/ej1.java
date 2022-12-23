package com.yandex.mobile.ads.impl;

public class ej1 implements C12971ef {

    /* renamed from: a */
    private final pu0 f32991a;

    /* renamed from: b */
    private final o70 f32992b;

    /* renamed from: c */
    private final C13413ii f32993c;

    public ej1(pu0 pu0, C13413ii iiVar, o70 o70) {
        this.f32991a = pu0;
        this.f32993c = iiVar;
        this.f32992b = o70;
    }

    /* renamed from: a */
    public void mo66822a(ej0 ej0, C13048ff ffVar) {
        C12381af afVar = new C12381af(this.f32991a.getContext(), new wl1(ej0, ffVar, this.f32993c, this.f32992b));
        this.f32991a.setOnTouchListener(afVar);
        this.f32991a.setOnClickListener(afVar);
    }
}
