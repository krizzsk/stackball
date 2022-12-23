package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.impl.C14841uw;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.xw */
public final class C15217xw {

    /* renamed from: a */
    private final C14624so f42703a;

    @Inject
    public C15217xw(C14624so soVar) {
        Intrinsics.checkNotNullParameter(soVar, "baseBinder");
        this.f42703a = soVar;
    }

    /* renamed from: a */
    public void mo70944a(C12458ax axVar, C14841uw uwVar, C13513jm jmVar) {
        f50<Integer> f50;
        Intrinsics.checkNotNullParameter(axVar, "view");
        Intrinsics.checkNotNullParameter(uwVar, "div");
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        C14841uw d = axVar.mo65915d();
        if (!Intrinsics.areEqual((Object) uwVar, (Object) d)) {
            j50 b = jmVar.mo66388b();
            axVar.mo65871b();
            axVar.setDiv$div_release(uwVar);
            if (d != null) {
                this.f42703a.mo70038a((View) axVar, (C14697tn) d, jmVar);
            }
            this.f42703a.mo70039a((View) axVar, (C14697tn) uwVar, (C14697tn) d, jmVar);
            C14175ob.m40337a(axVar, jmVar, uwVar.f41100b, uwVar.f41102d, uwVar.f41115q, uwVar.f41110l, uwVar.f41101c);
            C14841uw.C14847f fVar = uwVar.f41109k;
            f50<C14841uw.C14847f.C14851d> f502 = null;
            if (fVar == null) {
                f50 = null;
            } else {
                f50 = fVar.f41134a;
            }
            if (f50 == null) {
                axVar.setDividerColor(0);
            } else {
                axVar.mo65870a(f50.mo66925b(b, new C14971vw(axVar)));
            }
            if (fVar != null) {
                f502 = fVar.f41135b;
            }
            if (f502 == null) {
                axVar.setHorizontal(false);
            } else {
                axVar.mo65870a(f502.mo66925b(b, new C15119ww(axVar)));
            }
            axVar.setDividerHeightResource(C12066R.dimen.div_separator_delimiter_height);
            axVar.setDividerGravity(17);
        }
    }
}
