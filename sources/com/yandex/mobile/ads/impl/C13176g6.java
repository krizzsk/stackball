package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import com.yandex.mobile.ads.nativeads.C15501j;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.g6 */
public class C13176g6 {

    /* renamed from: a */
    private final C15501j f33887a;

    /* renamed from: b */
    private final ex0 f33888b;

    /* renamed from: c */
    private final C14732u f33889c = new C14732u();

    public C13176g6(C15501j jVar, ex0 ex0) {
        this.f33887a = jVar;
        this.f33888b = ex0;
    }

    /* renamed from: a */
    public void mo67202a(View view, C15234y5 y5Var) {
        this.f33889c.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = null;
        while (true) {
            if (view == null) {
                break;
            }
            Context context2 = view.getContext();
            if (context2 instanceof Activity) {
                context = context2;
                break;
            } else {
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
        }
        if (context != null && C13278h5.m36801a(context)) {
            C13476j6 j6Var = new C13476j6(context);
            new C12701c6(new C12957e6(context, j6Var).mo66769a(), j6Var, this.f33887a, this.f33888b).mo66205a(y5Var.mo70996b());
        }
    }
}
