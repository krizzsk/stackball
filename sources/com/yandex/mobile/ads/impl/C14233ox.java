package com.yandex.mobile.ads.impl;

import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import com.yandex.mobile.ads.impl.C12927dx;
import com.yandex.mobile.ads.impl.C13436ir;
import com.yandex.mobile.ads.impl.C14141nx;
import com.yandex.mobile.ads.impl.q91;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.ox */
public final class C14233ox {

    /* renamed from: a */
    private final C14624so f38405a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C15056wm f38406b;

    /* renamed from: c */
    private final eg1 f38407c;

    /* renamed from: com.yandex.mobile.ads.impl.ox$a */
    static final class C14234a extends Lambda implements Function1<Integer, Unit> {

        /* renamed from: b */
        final /* synthetic */ C12931dy f38408b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14234a(C12931dy dyVar) {
            super(1);
            this.f38408b = dyVar;
        }

        public Object invoke(Object obj) {
            this.f38408b.setMinValue((float) ((Number) obj).intValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ox$b */
    static final class C14235b extends Lambda implements Function1<Integer, Unit> {

        /* renamed from: b */
        final /* synthetic */ C12931dy f38409b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14235b(C12931dy dyVar) {
            super(1);
            this.f38409b = dyVar;
        }

        public Object invoke(Object obj) {
            this.f38409b.setMaxValue((float) ((Number) obj).intValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ox$c */
    static final class C14236c extends Lambda implements Function1<Object, Unit> {

        /* renamed from: b */
        final /* synthetic */ Function1<C13436ir, Unit> f38410b;

        /* renamed from: c */
        final /* synthetic */ C13436ir f38411c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14236c(Function1<? super C13436ir, Unit> function1, C13436ir irVar) {
            super(1);
            this.f38410b = function1;
            this.f38411c = irVar;
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "$noName_0");
            this.f38410b.invoke(this.f38411c);
            return Unit.INSTANCE;
        }
    }

    @Inject
    public C14233ox(C14624so soVar, C15056wm wmVar, eg1 eg1) {
        Intrinsics.checkNotNullParameter(soVar, "baseBinder");
        Intrinsics.checkNotNullParameter(wmVar, "actionBinder");
        Intrinsics.checkNotNullParameter(eg1, "typefaceProvider");
        this.f38405a = soVar;
        this.f38406b = wmVar;
        this.f38407c = eg1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m40611b(q91 q91, j50 j50, C14141nx.C14147f fVar) {
        md1 md1;
        if (fVar == null) {
            md1 = null;
        } else {
            DisplayMetrics displayMetrics = q91.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
            md1 = new md1(C12459ay.m33963a(fVar, displayMetrics, this.f38407c, j50));
        }
        q91.setThumbTextDrawable(md1);
    }

    /* renamed from: a */
    public void mo69281a(C12931dy dyVar, C14141nx nxVar, C13513jm jmVar) {
        Intrinsics.checkNotNullParameter(dyVar, "view");
        Intrinsics.checkNotNullParameter(nxVar, "div");
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        C14141nx k = dyVar.mo66714k();
        if (!Intrinsics.areEqual((Object) nxVar, (Object) k)) {
            j50 b = jmVar.mo66388b();
            dyVar.mo65871b();
            dyVar.setDiv$div_release(nxVar);
            if (k != null) {
                this.f38405a.mo70038a((View) dyVar, (C14697tn) k, jmVar);
            }
            this.f38405a.mo70039a((View) dyVar, (C14697tn) nxVar, (C14697tn) k, jmVar);
            dyVar.mo65870a(nxVar.f37980n.mo66925b(b, new C14234a(dyVar)));
            dyVar.mo65870a(nxVar.f37979m.mo66925b(b, new C14235b(dyVar)));
            dyVar.mo65870a(nxVar.f37989w.mo66925b(b, new C15403zx(dyVar)));
            m40607a(dyVar, b, nxVar.f37987u, (Function1<? super C13436ir, Unit>) new C14545rx(this, dyVar, b));
            C14141nx.C14147f fVar = nxVar.f37988v;
            m40611b(dyVar, b, fVar);
            if (fVar != null) {
                dyVar.mo65870a(fVar.f38009e.mo66923a(b, new C14639sx(this, dyVar, b, fVar)));
            }
            f50<Integer> f50 = nxVar.f37986t;
            Unit unit = null;
            if (f50 == null) {
                dyVar.setThumbSecondaryDrawable((Drawable) null);
                dyVar.setThumbSecondaryValue((Float) null, false);
            } else {
                dyVar.mo65870a(f50.mo66925b(b, new C15282yx(dyVar)));
                C13436ir irVar = nxVar.f37984r;
                if (irVar != null) {
                    m40607a(dyVar, b, irVar, (Function1<? super C13436ir, Unit>) new C14326px(this, dyVar, b));
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    m40607a(dyVar, b, nxVar.f37987u, (Function1<? super C13436ir, Unit>) new C14326px(this, dyVar, b));
                }
                C14141nx.C14147f fVar2 = nxVar.f37985s;
                m40609a((q91) dyVar, b, fVar2);
                if (fVar2 != null) {
                    dyVar.mo65870a(fVar2.f38009e.mo66923a(b, new C14428qx(this, dyVar, b, fVar2)));
                }
            }
            m40607a(dyVar, b, nxVar.f37958C, (Function1<? super C13436ir, Unit>) new C14972vx(this, dyVar, b));
            m40607a(dyVar, b, nxVar.f37959D, (Function1<? super C13436ir, Unit>) new C15120wx(this, dyVar, b));
            C13436ir irVar2 = nxVar.f37992z;
            if (irVar2 != null) {
                m40607a(dyVar, b, irVar2, (Function1<? super C13436ir, Unit>) new C14728tx(this, dyVar, b));
            }
            C13436ir irVar3 = nxVar.f37956A;
            if (irVar3 != null) {
                m40607a(dyVar, b, irVar3, (Function1<? super C13436ir, Unit>) new C14854ux(this, dyVar, b));
            }
            dyVar.mo69525d();
            dyVar.mo69524a((q91.C14369b) new C15218xx(nxVar, dyVar, this, jmVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m40609a(q91 q91, j50 j50, C14141nx.C14147f fVar) {
        md1 md1;
        if (fVar == null) {
            md1 = null;
        } else {
            DisplayMetrics displayMetrics = q91.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
            md1 = new md1(C12459ay.m33963a(fVar, displayMetrics, this.f38407c, j50));
        }
        q91.setThumbSecondTextDrawable(md1);
    }

    /* renamed from: a */
    private final void m40607a(C12931dy dyVar, j50 j50, C13436ir irVar, Function1<? super C13436ir, Unit> function1) {
        C14425qw b;
        C15266yr yrVar;
        f50<C13794kx> f50;
        C14425qw b2;
        C15266yr yrVar2;
        f50<Integer> f502;
        C14425qw b3;
        C15266yr yrVar3;
        f50<C13794kx> f503;
        C14425qw b4;
        C15266yr yrVar4;
        f50<Integer> f504;
        C14425qw b5;
        C15266yr yrVar5;
        f50<C13794kx> f505;
        C14425qw b6;
        C15266yr yrVar6;
        f50<Integer> f506;
        f50<Integer> f507;
        f50<Integer> f508;
        function1.invoke(irVar);
        C14236c cVar = new C14236c(function1, irVar);
        if (irVar instanceof C13436ir.C13439c) {
            C13013ex b7 = ((C13436ir.C13439c) irVar).mo67884b();
            C12927dx dxVar = b7.f33175b;
            C15055wl wlVar = null;
            C12927dx.C12930c cVar2 = dxVar instanceof C12927dx.C12930c ? (C12927dx.C12930c) dxVar : null;
            dyVar.mo65870a(b7.f33174a.mo66923a(j50, cVar));
            C15405zy zyVar = b7.f33176c;
            C15055wl a = (zyVar == null || (f508 = zyVar.f43503a) == null) ? null : f508.mo66923a(j50, cVar);
            if (a == null) {
                a = C15055wl.f42027a;
            }
            Intrinsics.checkNotNullExpressionValue(a, "shapeDrawable.stroke?.co…lback) ?: Disposable.NULL");
            dyVar.mo65870a(a);
            C15405zy zyVar2 = b7.f33176c;
            C15055wl a2 = (zyVar2 == null || (f507 = zyVar2.f43505c) == null) ? null : f507.mo66923a(j50, cVar);
            if (a2 == null) {
                a2 = C15055wl.f42027a;
            }
            Intrinsics.checkNotNullExpressionValue(a2, "shapeDrawable.stroke?.wi…lback) ?: Disposable.NULL");
            dyVar.mo65870a(a2);
            C15055wl a3 = (cVar2 == null || (b6 = cVar2.mo66711b()) == null || (yrVar6 = b6.f39311c) == null || (f506 = yrVar6.f42920b) == null) ? null : f506.mo66923a(j50, cVar);
            if (a3 == null) {
                a3 = C15055wl.f42027a;
            }
            Intrinsics.checkNotNullExpressionValue(a3, "roundedRect?.value?.item…lback) ?: Disposable.NULL");
            dyVar.mo65870a(a3);
            C15055wl a4 = (cVar2 == null || (b5 = cVar2.mo66711b()) == null || (yrVar5 = b5.f39311c) == null || (f505 = yrVar5.f42919a) == null) ? null : f505.mo66923a(j50, cVar);
            if (a4 == null) {
                a4 = C15055wl.f42027a;
            }
            Intrinsics.checkNotNullExpressionValue(a4, "roundedRect?.value?.item…lback) ?: Disposable.NULL");
            dyVar.mo65870a(a4);
            C15055wl a5 = (cVar2 == null || (b4 = cVar2.mo66711b()) == null || (yrVar4 = b4.f39310b) == null || (f504 = yrVar4.f42920b) == null) ? null : f504.mo66923a(j50, cVar);
            if (a5 == null) {
                a5 = C15055wl.f42027a;
            }
            Intrinsics.checkNotNullExpressionValue(a5, "roundedRect?.value?.item…lback) ?: Disposable.NULL");
            dyVar.mo65870a(a5);
            C15055wl a6 = (cVar2 == null || (b3 = cVar2.mo66711b()) == null || (yrVar3 = b3.f39310b) == null || (f503 = yrVar3.f42919a) == null) ? null : f503.mo66923a(j50, cVar);
            if (a6 == null) {
                a6 = C15055wl.f42027a;
            }
            Intrinsics.checkNotNullExpressionValue(a6, "roundedRect?.value?.item…lback) ?: Disposable.NULL");
            dyVar.mo65870a(a6);
            C15055wl a7 = (cVar2 == null || (b2 = cVar2.mo66711b()) == null || (yrVar2 = b2.f39309a) == null || (f502 = yrVar2.f42920b) == null) ? null : f502.mo66923a(j50, cVar);
            if (a7 == null) {
                a7 = C15055wl.f42027a;
            }
            Intrinsics.checkNotNullExpressionValue(a7, "roundedRect?.value?.corn…lback) ?: Disposable.NULL");
            dyVar.mo65870a(a7);
            if (!(cVar2 == null || (b = cVar2.mo66711b()) == null || (yrVar = b.f39309a) == null || (f50 = yrVar.f42919a) == null)) {
                wlVar = f50.mo66923a(j50, cVar);
            }
            if (wlVar == null) {
                wlVar = C15055wl.f42027a;
            }
            Intrinsics.checkNotNullExpressionValue(wlVar, "roundedRect?.value?.corn…lback) ?: Disposable.NULL");
            dyVar.mo65870a(wlVar);
        }
    }
}
