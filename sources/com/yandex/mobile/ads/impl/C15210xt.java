package com.yandex.mobile.ads.impl;

import android.util.DisplayMetrics;
import android.view.View;
import com.yandex.mobile.ads.impl.C12927dx;
import com.yandex.mobile.ads.impl.C13452ix;
import com.yandex.mobile.ads.impl.C15107wt;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.xt */
public final class C15210xt {

    /* renamed from: a */
    private final C14624so f42689a;

    /* renamed from: b */
    private final List<Function0<Unit>> f42690b = new ArrayList();

    /* renamed from: com.yandex.mobile.ads.impl.xt$a */
    static final class C15211a extends Lambda implements Function0<Unit> {

        /* renamed from: b */
        final /* synthetic */ C15107wt f42691b;

        /* renamed from: c */
        final /* synthetic */ C13513jm f42692c;

        /* renamed from: d */
        final /* synthetic */ C14633sv f42693d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15211a(C15107wt wtVar, C13513jm jmVar, C14633sv svVar) {
            super(0);
            this.f42691b = wtVar;
            this.f42692c = jmVar;
            this.f42693d = svVar;
        }

        public Object invoke() {
            C15118wv wvVar = (C15118wv) this.f42692c.findViewWithTag(this.f42691b.f42271s);
            if (wvVar != null) {
                this.f42693d.mo71133a(wvVar.mo66339d());
            }
            return Unit.INSTANCE;
        }
    }

    @Inject
    public C15210xt(C14624so soVar) {
        Intrinsics.checkNotNullParameter(soVar, "baseBinder");
        this.f42689a = soVar;
    }

    /* renamed from: a */
    public void mo70940a(C14633sv svVar, C15107wt wtVar, C13513jm jmVar) {
        Intrinsics.checkNotNullParameter(svVar, "view");
        Intrinsics.checkNotNullParameter(wtVar, "div");
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        C15107wt d = svVar.mo70057d();
        if (!Intrinsics.areEqual((Object) wtVar, (Object) d)) {
            j50 b = jmVar.mo66388b();
            svVar.mo65871b();
            svVar.setDiv$div_release(wtVar);
            if (d != null) {
                this.f42689a.mo70038a((View) svVar, (C14697tn) d, jmVar);
            }
            this.f42689a.mo70039a((View) svVar, (C14697tn) wtVar, (C14697tn) d, jmVar);
            m44121a(svVar, b, wtVar);
            C15274yt ytVar = new C15274yt(this, svVar, b, wtVar);
            svVar.mo65870a(wtVar.f42254b.mo66923a(b, ytVar));
            svVar.mo65870a(wtVar.f42255c.mo66923a(b, ytVar));
            svVar.mo65870a(wtVar.f42267o.mo66923a(b, ytVar));
            svVar.mo65870a(wtVar.f42269q.mo66923a(b, ytVar));
            svVar.mo65870a(wtVar.f42275w.f42920b.mo66923a(b, ytVar));
            svVar.mo65870a(wtVar.f42275w.f42919a.mo66923a(b, ytVar));
            svVar.mo65870a(wtVar.f42259g.mo66923a(b, ytVar));
            C12927dx dxVar = wtVar.f42274v;
            if (dxVar instanceof C12927dx.C12930c) {
                C12927dx.C12930c cVar = (C12927dx.C12930c) dxVar;
                svVar.mo65870a(cVar.mo66711b().f39311c.f42920b.mo66923a(b, ytVar));
                svVar.mo65870a(cVar.mo66711b().f39311c.f42919a.mo66923a(b, ytVar));
                svVar.mo65870a(cVar.mo66711b().f39310b.f42920b.mo66923a(b, ytVar));
                svVar.mo65870a(cVar.mo66711b().f39310b.f42919a.mo66923a(b, ytVar));
                svVar.mo65870a(cVar.mo66711b().f39309a.f42920b.mo66923a(b, ytVar));
                svVar.mo65870a(cVar.mo66711b().f39309a.f42919a.mo66923a(b, ytVar));
            }
            this.f42689a.getClass();
            Intrinsics.checkNotNullParameter(b, "resolver");
            Intrinsics.checkNotNullParameter(svVar, "subscriber");
            Intrinsics.checkNotNullParameter(wtVar, "div");
            Intrinsics.checkNotNullParameter(ytVar, "callback");
            if (wtVar.mo66147f() instanceof C13452ix.C13455c) {
                svVar.mo65870a(((C15266yr) wtVar.mo66147f().mo67899b()).f42920b.mo66923a(b, ytVar));
            }
            if (wtVar.mo66148g() instanceof C13452ix.C13455c) {
                svVar.mo65870a(((C15266yr) wtVar.mo66148g().mo67899b()).f42920b.mo66923a(b, ytVar));
            }
            this.f42690b.add(new C15211a(wtVar, jmVar, svVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m44121a(C14633sv svVar, j50 j50, C15107wt wtVar) {
        ee0 ee0;
        j50 j502 = j50;
        C15107wt wtVar2 = wtVar;
        DisplayMetrics displayMetrics = svVar.getResources().getDisplayMetrics();
        C12927dx dxVar = wtVar2.f42274v;
        if (dxVar instanceof C12927dx.C12930c) {
            int intValue = wtVar2.f42267o.mo66924a(j502).intValue();
            int intValue2 = wtVar2.f42254b.mo66924a(j502).intValue();
            C12927dx.C12930c cVar = (C12927dx.C12930c) dxVar;
            C15266yr yrVar = cVar.mo66711b().f39311c;
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "metrics");
            float a = (float) C14175ob.m40328a(yrVar, displayMetrics, j502);
            float a2 = (float) C14175ob.m40328a(cVar.mo66711b().f39310b, displayMetrics, j502);
            float a3 = ((float) C14175ob.m40328a(cVar.mo66711b().f39311c, displayMetrics, j502)) * ((float) wtVar2.f42255c.mo66924a(j502).doubleValue());
            float a4 = ((float) C14175ob.m40328a(cVar.mo66711b().f39310b, displayMetrics, j502)) * ((float) wtVar2.f42255c.mo66924a(j502).doubleValue());
            float a5 = ((float) C14175ob.m40328a(cVar.mo66711b().f39311c, displayMetrics, j502)) * ((float) wtVar2.f42269q.mo66924a(j502).doubleValue());
            float a6 = ((float) C14175ob.m40328a(cVar.mo66711b().f39310b, displayMetrics, j502)) * ((float) wtVar2.f42269q.mo66924a(j502).doubleValue());
            float a7 = (float) C14175ob.m40328a(cVar.mo66711b().f39309a, displayMetrics, j502);
            float a8 = ((float) C14175ob.m40328a(cVar.mo66711b().f39309a, displayMetrics, j502)) * ((float) wtVar2.f42255c.mo66924a(j502).doubleValue());
            float a9 = ((float) C14175ob.m40328a(cVar.mo66711b().f39309a, displayMetrics, j502)) * ((float) wtVar2.f42269q.mo66924a(j502).doubleValue());
            float a10 = (float) C14175ob.m40328a(wtVar2.f42275w, displayMetrics, j502);
            C15107wt.C15108a a11 = wtVar2.f42259g.mo66924a(j502);
            Intrinsics.checkNotNullParameter(a11, "<this>");
            if (a11 == C15107wt.C15108a.WORM) {
                ee0 = ee0.WORM;
            } else if (a11 == C15107wt.C15108a.SLIDER) {
                ee0 = ee0.SLIDER;
            } else {
                ee0 = ee0.SCALE;
            }
            C14633sv svVar2 = svVar;
            svVar2.setStyle(new ge0(intValue, intValue2, a, a3, a5, a2, a4, a6, a7, a8, a9, a10, ee0, fe0.ROUND_RECT));
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public final void mo70939a() {
        for (Function0 invoke : this.f42690b) {
            invoke.invoke();
        }
        this.f42690b.clear();
    }
}
