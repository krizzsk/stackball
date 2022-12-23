package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.AdResultReceiver;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.nativeads.C15501j;
import com.yandex.mobile.ads.nativeads.C15523r0;
import com.yandex.mobile.ads.nativeads.C15550v;

/* renamed from: com.yandex.mobile.ads.impl.p1 */
public class C14241p1 implements C14435r1 {

    /* renamed from: a */
    private final AdResponse f38429a;

    /* renamed from: b */
    private final C14645t1 f38430b;

    /* renamed from: c */
    private final C15501j f38431c;

    /* renamed from: d */
    private final yq0 f38432d;

    /* renamed from: e */
    private final ze1 f38433e;

    /* renamed from: f */
    private final C14862v2 f38434f;

    /* renamed from: g */
    private final C15523r0 f38435g;

    /* renamed from: h */
    private h41.C13275a f38436h;

    public C14241p1(Context context, AdResponse adResponse, C14645t1 t1Var, C15501j jVar, C15523r0 r0Var) {
        this.f38429a = adResponse;
        this.f38430b = t1Var;
        this.f38431c = jVar;
        this.f38435g = r0Var;
        this.f38433e = new ze1(new C12356a5(context, t1Var));
        this.f38434f = new C14862v2(jVar);
        this.f38432d = new yq0(context, t1Var, adResponse);
    }

    /* renamed from: a */
    public void mo69293a(h41.C13275a aVar) {
        this.f38436h = aVar;
        this.f38432d.mo71107a(aVar);
    }

    /* renamed from: a */
    public void mo69292a(View view, C13690k9 k9Var, ej0 ej0, C15550v vVar) {
        this.f38431c.mo71680a(ej0);
        Context context = view.getContext();
        C12356a5 a5Var = new C12356a5(context, this.f38430b);
        AdResultReceiver a = this.f38434f.mo70441a();
        C13198gf a2 = this.f38432d.mo71106a(k9Var.mo68167b(), "url");
        fx0 fx0 = new fx0(a5Var, this.f38435g.mo71741a(context, this.f38430b, a));
        ex0 a3 = fx0.mo67096a(a2);
        C14239p pVar = new C14239p(this.f38430b, this.f38429a, a2, fx0, vVar, this.f38431c, this.f38436h);
        this.f38433e.mo71215a(ej0.mo66836c());
        pVar.mo69289a(view, ej0.mo66834a());
        a3.mo66882a(ej0.mo66837d());
    }
}
