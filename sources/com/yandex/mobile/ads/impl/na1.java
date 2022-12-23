package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.PopupMenu;
import com.yandex.mobile.ads.nativeads.C15501j;
import com.yandex.mobile.ads.nativeads.C15550v;
import java.util.List;

public class na1 {

    /* renamed from: a */
    private final C14645t1 f37684a;

    /* renamed from: b */
    private final yq0 f37685b;

    /* renamed from: c */
    private final ed0 f37686c;

    /* renamed from: d */
    private final C15501j f37687d;

    /* renamed from: e */
    private final fx0 f37688e;

    /* renamed from: f */
    private final sa1 f37689f = new sa1();

    public na1(C14645t1 t1Var, yq0 yq0, C15501j jVar, C15550v vVar, fx0 fx0) {
        this.f37684a = t1Var;
        this.f37685b = yq0;
        this.f37687d = jVar;
        this.f37688e = fx0;
        this.f37686c = vVar.mo71925d();
    }

    /* renamed from: a */
    public void mo68947a(View view, ea1 ea1) {
        List<ha1> b = ea1.mo66792b();
        if (!b.isEmpty()) {
            PopupMenu a = this.f37689f.mo69925a(view, this.f37686c, b);
            a.setOnMenuItemClickListener(new ma1(new ze1(new C12356a5(view.getContext(), this.f37684a)), this.f37685b, b, this.f37687d, this.f37688e));
            a.show();
        }
    }
}
