package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.nativeads.C15474b;
import com.yandex.mobile.ads.nativeads.C15550v;

/* renamed from: com.yandex.mobile.ads.impl.k5 */
public class C13680k5 implements yn1 {

    /* renamed from: a */
    private final C15550v f35956a;

    /* renamed from: b */
    private final C15474b f35957b;

    /* renamed from: c */
    private final ej0 f35958c;

    /* renamed from: d */
    private final ko1 f35959d = new ko1();

    public C13680k5(C15550v vVar, C15474b bVar, ej0 ej0) {
        this.f35956a = vVar;
        this.f35957b = bVar;
        this.f35958c = ej0;
    }

    /* renamed from: a */
    public void mo66921a(C13690k9 k9Var, View view) {
        if (view.getTag() == null) {
            view.setTag(this.f35959d.mo68257a(k9Var.mo68167b()));
        }
    }

    /* renamed from: a */
    public void mo66922a(C13690k9 k9Var, C12971ef efVar) {
        ej0 a = k9Var.mo68166a();
        if (a == null) {
            a = this.f35958c;
        }
        this.f35957b.mo71653a(k9Var, a, this.f35956a, efVar);
    }
}
