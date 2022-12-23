package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.nativeads.C15550v;

public final class lr0 implements View.OnClickListener {

    /* renamed from: a */
    private final C13690k9 f36825a;

    /* renamed from: b */
    private final C14435r1 f36826b;

    /* renamed from: c */
    private final C15550v f36827c;

    /* renamed from: d */
    private final o70 f36828d;

    /* renamed from: e */
    private final ej0 f36829e;

    public lr0(C13690k9 k9Var, C14435r1 r1Var, C15550v vVar, ej0 ej0, o70 o70) {
        this.f36825a = k9Var;
        this.f36826b = r1Var;
        this.f36827c = vVar;
        this.f36829e = ej0;
        this.f36828d = o70;
    }

    public void onClick(View view) {
        if (this.f36829e != null && this.f36825a.mo68170e()) {
            this.f36828d.mo68930b();
            ((C14241p1) this.f36826b).mo69292a(view, this.f36825a, this.f36829e, this.f36827c);
        }
    }
}
