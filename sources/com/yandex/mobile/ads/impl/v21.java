package com.yandex.mobile.ads.impl;

class v21 {

    /* renamed from: a */
    private final y61 f41178a;

    /* renamed from: b */
    private final C13372i1 f41179b;

    v21(y61 y61, C13372i1 i1Var) {
        this.f41178a = y61;
        this.f41179b = i1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public og0 mo70442a(long j) {
        for (g01 next : this.f41178a.mo71004a()) {
            og0 a = next.mo67142a();
            boolean z = Math.abs(next.mo67143b() - j) < 200;
            C13270h1 a2 = this.f41179b.mo67707a(a);
            if (z && C13270h1.PREPARED.equals(a2)) {
                return a;
            }
        }
        return null;
    }
}
