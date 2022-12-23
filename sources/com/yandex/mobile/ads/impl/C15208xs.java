package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.C13452ix;
import com.yandex.mobile.ads.impl.h90;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.xs */
public final class C15208xs {
    @Deprecated

    /* renamed from: e */
    private static final f50<Double> f42682e = f50.f33229a.mo66929a(Double.valueOf(0.0d));

    /* renamed from: a */
    private final C14624so f42683a;

    /* renamed from: b */
    private final C13012ew f42684b;

    /* renamed from: c */
    private final C12660bw f42685c;

    /* renamed from: d */
    private final Provider<C14773uo> f42686d;

    /* renamed from: com.yandex.mobile.ads.impl.xs$a */
    static final class C15209a extends Lambda implements Function1<Integer, Unit> {

        /* renamed from: b */
        final /* synthetic */ C12417at f42687b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15209a(C12417at atVar) {
            super(1);
            this.f42687b = atVar;
        }

        public Object invoke(Object obj) {
            this.f42687b.setColumnCount(((Number) obj).intValue());
            return Unit.INSTANCE;
        }
    }

    @Inject
    public C15208xs(C14624so soVar, C13012ew ewVar, C12660bw bwVar, Provider<C14773uo> provider) {
        Intrinsics.checkNotNullParameter(soVar, "baseBinder");
        Intrinsics.checkNotNullParameter(ewVar, "divPatchManager");
        Intrinsics.checkNotNullParameter(bwVar, "divPatchCache");
        Intrinsics.checkNotNullParameter(provider, "divBinder");
        this.f42683a = soVar;
        this.f42684b = ewVar;
        this.f42685c = bwVar;
        this.f42686d = provider;
    }

    /* renamed from: a */
    public void mo70937a(C12417at atVar, C14924vs vsVar, C13513jm jmVar, C14729ty tyVar) {
        int size;
        int lastIndex;
        C12417at atVar2 = atVar;
        C14924vs vsVar2 = vsVar;
        C13513jm jmVar2 = jmVar;
        C14729ty tyVar2 = tyVar;
        Intrinsics.checkNotNullParameter(atVar2, "view");
        Intrinsics.checkNotNullParameter(vsVar2, "div");
        Intrinsics.checkNotNullParameter(jmVar2, "divView");
        Intrinsics.checkNotNullParameter(tyVar2, "path");
        C14924vs g = atVar.mo65875g();
        Intrinsics.areEqual((Object) vsVar2, (Object) g);
        j50 b = jmVar.mo66388b();
        atVar.mo65871b();
        atVar.setDiv$div_release(vsVar);
        atVar2.setReleaseViewVisitor$div_release(jmVar.mo68042m());
        if (g != null) {
            this.f42683a.mo70038a((View) atVar2, (C14697tn) g, jmVar2);
        }
        this.f42683a.mo70039a((View) atVar2, (C14697tn) vsVar2, (C14697tn) g, jmVar2);
        C14175ob.m40337a(atVar, jmVar, vsVar2.f41494b, vsVar2.f41496d, vsVar2.f41512t, vsVar2.f41506n, vsVar2.f41495c);
        atVar2.mo65870a(vsVar2.f41502j.mo66925b(b, new C15209a(atVar2)));
        f50<C13215gn> f50 = vsVar2.f41504l;
        f50<C13332hn> f502 = vsVar2.f41505m;
        atVar2.setGravity(C14175ob.m40325a(f50.mo66924a(b), f502.mo66924a(b)));
        C15270ys ysVar = new C15270ys(atVar2, f50, b, f502);
        atVar2.mo65870a(f50.mo66923a(b, ysVar));
        atVar2.mo65870a(f502.mo66923a(b, ysVar));
        if (g != null && (size = vsVar2.f41511s.size()) <= (lastIndex = CollectionsKt.getLastIndex(g.f41511s))) {
            while (true) {
                int i = size + 1;
                View childAt = atVar2.getChildAt(size);
                Intrinsics.checkNotNullExpressionValue(childAt, "view.getChildAt(i)");
                jmVar2.mo68026a(childAt);
                if (size == lastIndex) {
                    break;
                }
                size = i;
            }
        }
        int size2 = vsVar2.f41511s.size();
        int i2 = 0;
        while (i2 < size2) {
            int i3 = i2 + 1;
            C14697tn b2 = vsVar2.f41511s.get(i2).mo70911b();
            View childAt2 = atVar2.getChildAt(i2 + 0);
            String c = b2.mo66144c();
            if (c != null) {
                this.f42684b.mo66878a(jmVar2, c);
                this.f42685c.mo66131a(jmVar.mo68037g(), c);
            }
            childAt2.setLayoutParams(new h90.C13292d());
            Intrinsics.checkNotNullExpressionValue(childAt2, "childView");
            this.f42686d.get().mo70383a(childAt2, vsVar2.f41511s.get(i2), jmVar2, tyVar2);
            this.f42683a.mo70037a(childAt2, b2, b);
            m44117a(childAt2, b, b2);
            if (childAt2 instanceof l50) {
                C15105ws wsVar = new C15105ws(this, childAt2, b, b2);
                l50 l50 = (l50) childAt2;
                l50.mo65870a(m44116a(b2.mo66147f()).mo66923a(b, wsVar));
                l50.mo65870a(m44116a(b2.mo66148g()).mo66923a(b, wsVar));
                f50<Integer> a = b2.mo66142a();
                C15055wl a2 = a == null ? null : a.mo66923a(b, wsVar);
                if (a2 == null) {
                    a2 = C15055wl.f42027a;
                }
                Intrinsics.checkNotNullExpressionValue(a2, "childDiv.columnSpan?.obs…lback) ?: Disposable.NULL");
                l50.mo65870a(a2);
                f50<Integer> o = b2.mo66157o();
                C15055wl a3 = o == null ? null : o.mo66923a(b, wsVar);
                if (a3 == null) {
                    a3 = C15055wl.f42027a;
                }
                Intrinsics.checkNotNullExpressionValue(a3, "childDiv.rowSpan?.observ…lback) ?: Disposable.NULL");
                l50.mo65870a(a3);
            }
            if (C14175ob.m40348b(b2)) {
                jmVar2.mo68027a(childAt2, vsVar2.f41511s.get(i2));
            } else {
                jmVar2.mo68026a(childAt2);
            }
            i2 = i3;
        }
        C14175ob.m40341a(atVar2, vsVar2.f41511s, g == null ? null : g.f41511s, jmVar2);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [android.view.ViewGroup$LayoutParams] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m44117a(android.view.View r8, com.yandex.mobile.ads.impl.j50 r9, com.yandex.mobile.ads.impl.C14697tn r10) {
        /*
            r7 = this;
            com.yandex.mobile.ads.impl.ix r0 = r10.mo66147f()
            com.yandex.mobile.ads.impl.f50 r0 = r7.m44116a(r0)
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            boolean r2 = r1 instanceof com.yandex.mobile.ads.impl.h90.C13292d
            r3 = 0
            if (r2 == 0) goto L_0x0014
            com.yandex.mobile.ads.impl.h90$d r1 = (com.yandex.mobile.ads.impl.h90.C13292d) r1
            goto L_0x0015
        L_0x0014:
            r1 = r3
        L_0x0015:
            r2 = 0
            r4 = 1
            if (r1 != 0) goto L_0x001a
            goto L_0x0038
        L_0x001a:
            java.lang.Object r0 = r0.mo66924a((com.yandex.mobile.ads.impl.j50) r9)
            java.lang.Number r0 = (java.lang.Number) r0
            double r5 = r0.doubleValue()
            float r0 = (float) r5
            float r5 = r1.mo67478b()
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            r5 = 1
            goto L_0x0030
        L_0x002f:
            r5 = 0
        L_0x0030:
            if (r5 != 0) goto L_0x0038
            r1.mo67476a((float) r0)
            r8.requestLayout()
        L_0x0038:
            com.yandex.mobile.ads.impl.ix r0 = r10.mo66148g()
            com.yandex.mobile.ads.impl.f50 r0 = r7.m44116a(r0)
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            boolean r5 = r1 instanceof com.yandex.mobile.ads.impl.h90.C13292d
            if (r5 == 0) goto L_0x004b
            com.yandex.mobile.ads.impl.h90$d r1 = (com.yandex.mobile.ads.impl.h90.C13292d) r1
            goto L_0x004c
        L_0x004b:
            r1 = r3
        L_0x004c:
            if (r1 != 0) goto L_0x004f
            goto L_0x006b
        L_0x004f:
            java.lang.Object r0 = r0.mo66924a((com.yandex.mobile.ads.impl.j50) r9)
            java.lang.Number r0 = (java.lang.Number) r0
            double r5 = r0.doubleValue()
            float r0 = (float) r5
            float r5 = r1.mo67484e()
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0063
            r2 = 1
        L_0x0063:
            if (r2 != 0) goto L_0x006b
            r1.mo67479b((float) r0)
            r8.requestLayout()
        L_0x006b:
            com.yandex.mobile.ads.impl.f50 r0 = r10.mo66142a()
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            boolean r2 = r1 instanceof com.yandex.mobile.ads.impl.h90.C13292d
            if (r2 == 0) goto L_0x007a
            com.yandex.mobile.ads.impl.h90$d r1 = (com.yandex.mobile.ads.impl.h90.C13292d) r1
            goto L_0x007b
        L_0x007a:
            r1 = r3
        L_0x007b:
            if (r1 != 0) goto L_0x007e
            goto L_0x009b
        L_0x007e:
            if (r0 != 0) goto L_0x0081
            goto L_0x0089
        L_0x0081:
            java.lang.Object r0 = r0.mo66924a((com.yandex.mobile.ads.impl.j50) r9)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L_0x008b
        L_0x0089:
            r0 = 1
            goto L_0x008f
        L_0x008b:
            int r0 = r0.intValue()
        L_0x008f:
            int r2 = r1.mo67475a()
            if (r2 == r0) goto L_0x009b
            r1.mo67477a((int) r0)
            r8.requestLayout()
        L_0x009b:
            com.yandex.mobile.ads.impl.f50 r10 = r10.mo66157o()
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            boolean r1 = r0 instanceof com.yandex.mobile.ads.impl.h90.C13292d
            if (r1 == 0) goto L_0x00aa
            r3 = r0
            com.yandex.mobile.ads.impl.h90$d r3 = (com.yandex.mobile.ads.impl.h90.C13292d) r3
        L_0x00aa:
            if (r3 != 0) goto L_0x00ad
            goto L_0x00c9
        L_0x00ad:
            if (r10 != 0) goto L_0x00b0
            goto L_0x00bd
        L_0x00b0:
            java.lang.Object r9 = r10.mo66924a((com.yandex.mobile.ads.impl.j50) r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 != 0) goto L_0x00b9
            goto L_0x00bd
        L_0x00b9:
            int r4 = r9.intValue()
        L_0x00bd:
            int r9 = r3.mo67483d()
            if (r9 == r4) goto L_0x00c9
            r3.mo67482c(r4)
            r8.requestLayout()
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C15208xs.m44117a(android.view.View, com.yandex.mobile.ads.impl.j50, com.yandex.mobile.ads.impl.tn):void");
    }

    /* renamed from: a */
    private final f50<Double> m44116a(C13452ix ixVar) {
        if (!(ixVar instanceof C13452ix.C13456d)) {
            return f42682e;
        }
        f50<Double> f50 = ((C13452ix.C13456d) ixVar).mo67901c().f34157a;
        if (f50 == null) {
            return f42682e;
        }
        return f50;
    }
}
