package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.impl.C12667bz;
import com.yandex.mobile.ads.impl.C13452ix;
import com.yandex.mobile.ads.impl.C14065nb;
import com.yandex.mobile.ads.impl.sc1;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

/* renamed from: com.yandex.mobile.ads.impl.dz */
public final class C12932dz {

    /* renamed from: a */
    private final C14624so f32808a;

    /* renamed from: b */
    private final a10 f32809b;

    /* renamed from: c */
    private final eo1 f32810c;

    /* renamed from: d */
    private final rc1 f32811d;

    /* renamed from: e */
    private final C15056wm f32812e;

    /* renamed from: f */
    private final C12903dm f32813f;

    /* renamed from: g */
    private final s10 f32814g;

    /* renamed from: h */
    private final C12660bw f32815h;

    /* renamed from: i */
    private final Context f32816i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Integer f32817j;

    /* renamed from: com.yandex.mobile.ads.impl.dz$a */
    static final class C12933a extends Lambda implements Function1<Object, Unit> {

        /* renamed from: b */
        final /* synthetic */ uc1 f32818b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12933a(uc1 uc1) {
            super(1);
            this.f32818b = uc1;
        }

        public Object invoke(Object obj) {
            C12843cz f = this.f32818b.mo70324f();
            if (f != null) {
                f.mo66376f();
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dz$b */
    static final class C12934b extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: b */
        final /* synthetic */ uc1 f32819b;

        /* renamed from: c */
        final /* synthetic */ C12667bz f32820c;

        /* renamed from: d */
        final /* synthetic */ j50 f32821d;

        /* renamed from: e */
        final /* synthetic */ C12932dz f32822e;

        /* renamed from: f */
        final /* synthetic */ C13513jm f32823f;

        /* renamed from: g */
        final /* synthetic */ C14773uo f32824g;

        /* renamed from: h */
        final /* synthetic */ C14729ty f32825h;

        /* renamed from: i */
        final /* synthetic */ List<C13357hx> f32826i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12934b(uc1 uc1, C12667bz bzVar, j50 j50, C12932dz dzVar, C13513jm jmVar, C14773uo uoVar, C14729ty tyVar, List<C13357hx> list) {
            super(1);
            this.f32819b = uc1;
            this.f32820c = bzVar;
            this.f32821d = j50;
            this.f32822e = dzVar;
            this.f32823f = jmVar;
            this.f32824g = uoVar;
            this.f32825h = tyVar;
            this.f32826i = list;
        }

        public Object invoke(Object obj) {
            int i;
            xx0 d;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C12843cz f = this.f32819b.mo70324f();
            if (!(f != null && f.mo66375e() == booleanValue)) {
                C12932dz dzVar = this.f32822e;
                C13513jm jmVar = this.f32823f;
                C12667bz bzVar = this.f32820c;
                j50 j50 = this.f32821d;
                uc1 uc1 = this.f32819b;
                C14773uo uoVar = this.f32824g;
                C14729ty tyVar = this.f32825h;
                List<C13357hx> list = this.f32826i;
                C12843cz f2 = uc1.mo70324f();
                Integer valueOf = (f2 == null || (d = f2.mo66374d()) == null) ? null : Integer.valueOf(d.mo70946a());
                if (valueOf == null) {
                    i = this.f32820c.f31688t.mo66924a(this.f32821d).intValue();
                } else {
                    i = valueOf.intValue();
                }
                C12932dz.m35507b(dzVar, jmVar, bzVar, j50, uc1, uoVar, tyVar, list, i);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dz$c */
    static final class C12935c extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: b */
        final /* synthetic */ uc1 f32827b;

        /* renamed from: c */
        final /* synthetic */ C12932dz f32828c;

        /* renamed from: d */
        final /* synthetic */ C12667bz f32829d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12935c(uc1 uc1, C12932dz dzVar, C12667bz bzVar) {
            super(1);
            this.f32827b = uc1;
            this.f32828c = dzVar;
            this.f32829d = bzVar;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C12843cz f = this.f32827b.mo70324f();
            if (f != null) {
                C12932dz dzVar = this.f32828c;
                int size = this.f32829d.f31682n.size() - 1;
                dzVar.getClass();
                f.mo68949a((Set<Integer>) booleanValue ? new LinkedHashSet() : CollectionsKt.toMutableSet(new IntRange(0, size)));
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dz$d */
    static final class C12936d extends Lambda implements Function1<Integer, Unit> {

        /* renamed from: b */
        final /* synthetic */ C12932dz f32830b;

        /* renamed from: c */
        final /* synthetic */ uc1 f32831c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12936d(C12932dz dzVar, uc1 uc1) {
            super(1);
            this.f32830b = dzVar;
            this.f32831c = uc1;
        }

        public Object invoke(Object obj) {
            xx0 d;
            int intValue = ((Number) obj).intValue();
            this.f32830b.f32817j = Integer.valueOf(intValue);
            C12843cz f = this.f32831c.mo70324f();
            if (!(f == null || (d = f.mo66374d()) == null || d.mo70946a() == intValue)) {
                d.mo70947a(intValue);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dz$e */
    static final class C12937e extends Lambda implements Function1<Object, Unit> {

        /* renamed from: b */
        final /* synthetic */ uc1 f32832b;

        /* renamed from: c */
        final /* synthetic */ C12667bz f32833c;

        /* renamed from: d */
        final /* synthetic */ j50 f32834d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12937e(uc1 uc1, C12667bz bzVar, j50 j50) {
            super(1);
            this.f32832b = uc1;
            this.f32833c = bzVar;
            this.f32834d = j50;
        }

        public Object invoke(Object obj) {
            C14175ob.m40338a(this.f32832b.mo70325g(), this.f32833c.f31690v, this.f32834d);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dz$f */
    static final class C12938f extends Lambda implements Function1<Integer, Unit> {

        /* renamed from: b */
        final /* synthetic */ uc1 f32835b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12938f(uc1 uc1) {
            super(1);
            this.f32835b = uc1;
        }

        public Object invoke(Object obj) {
            this.f32835b.mo70325g().setBackgroundColor(((Number) obj).intValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dz$g */
    static final class C12939g extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: b */
        final /* synthetic */ uc1 f32836b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12939g(uc1 uc1) {
            super(1);
            this.f32836b = uc1;
        }

        public Object invoke(Object obj) {
            this.f32836b.mo70325g().setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dz$h */
    static final class C12940h extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: b */
        final /* synthetic */ uc1 f32837b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12940h(uc1 uc1) {
            super(1);
            this.f32837b = uc1;
        }

        public Object invoke(Object obj) {
            this.f32837b.mo70328j().setOnInterceptTouchEventListener(((Boolean) obj).booleanValue() ? new dy0(1) : null);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dz$i */
    static final class C12941i extends Lambda implements Function1<Object, Unit> {

        /* renamed from: b */
        final /* synthetic */ uc1 f32838b;

        /* renamed from: c */
        final /* synthetic */ C12667bz f32839c;

        /* renamed from: d */
        final /* synthetic */ j50 f32840d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12941i(uc1 uc1, C12667bz bzVar, j50 j50) {
            super(1);
            this.f32838b = uc1;
            this.f32839c = bzVar;
            this.f32840d = j50;
        }

        public Object invoke(Object obj) {
            C14175ob.m40346b((View) this.f32838b.mo70327i(), this.f32839c.f31694z, this.f32840d);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dz$j */
    static final class C12942j extends Lambda implements Function0<Unit> {

        /* renamed from: b */
        final /* synthetic */ C13461iz f32841b;

        /* renamed from: c */
        final /* synthetic */ int f32842c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12942j(C13461iz izVar, int i) {
            super(0);
            this.f32841b = izVar;
            this.f32842c = i;
        }

        public Object invoke() {
            this.f32841b.mo67905a(this.f32842c);
            return Unit.INSTANCE;
        }
    }

    @Inject
    public C12932dz(C14624so soVar, a10 a10, eo1 eo1, rc1 rc1, C15056wm wmVar, C12903dm dmVar, s10 s10, C12660bw bwVar, @Named("themed_context") Context context) {
        Intrinsics.checkNotNullParameter(soVar, "baseBinder");
        Intrinsics.checkNotNullParameter(a10, "viewCreator");
        Intrinsics.checkNotNullParameter(eo1, "viewPool");
        Intrinsics.checkNotNullParameter(rc1, "textStyleProvider");
        Intrinsics.checkNotNullParameter(wmVar, "actionBinder");
        Intrinsics.checkNotNullParameter(dmVar, "div2Logger");
        Intrinsics.checkNotNullParameter(s10, "visibilityActionTracker");
        Intrinsics.checkNotNullParameter(bwVar, "divPatchCache");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f32808a = soVar;
        this.f32809b = a10;
        this.f32810c = eo1;
        this.f32811d = rc1;
        this.f32812e = wmVar;
        this.f32813f = dmVar;
        this.f32814g = s10;
        this.f32815h = bwVar;
        this.f32816i = context;
        eo1.mo65947a("DIV2.TAB_HEADER_VIEW", new sc1.C14585c(context), 12);
        eo1.mo65947a("DIV2.TAB_ITEM_VIEW", new ao1() {
            /* renamed from: a */
            public final View mo65489a() {
                return C12932dz.m35498a(C12932dz.this);
            }
        }, 2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final List m35499a(List list) {
        Intrinsics.checkNotNullParameter(list, "$list");
        return list;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final List m35506b(List list) {
        Intrinsics.checkNotNullParameter(list, "$list");
        return list;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m35507b(C12932dz dzVar, C13513jm jmVar, C12667bz bzVar, j50 j50, uc1 uc1, C14773uo uoVar, C14729ty tyVar, List<C13357hx> list, int i) {
        C12843cz a = dzVar.m35497a(jmVar, bzVar, j50, uc1, uoVar, tyVar);
        a.mo66370a((C14065nb.C14073g<C13357hx>) new C14065nb.C14073g(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            /* renamed from: a */
            public final List mo65499a() {
                return C12932dz.m35506b(this.f$0);
            }
        }, i);
        uc1.setDivTabsAdapter(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final oc1 m35498a(C12932dz dzVar) {
        Intrinsics.checkNotNullParameter(dzVar, "this$0");
        return new oc1(dzVar.f32816i, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo66717a(uc1 uc1, C12667bz bzVar, C13513jm jmVar, C14773uo uoVar, C14729ty tyVar) {
        C12843cz f;
        C12667bz a;
        uc1 uc12 = uc1;
        C12667bz bzVar2 = bzVar;
        C13513jm jmVar2 = jmVar;
        Intrinsics.checkNotNullParameter(uc1, "view");
        Intrinsics.checkNotNullParameter(bzVar2, "div");
        Intrinsics.checkNotNullParameter(jmVar2, "divView");
        Intrinsics.checkNotNullParameter(uoVar, "divBinder");
        Intrinsics.checkNotNullParameter(tyVar, "path");
        C12667bz e = uc1.mo70323e();
        j50 b = jmVar.mo66388b();
        uc1.setDiv(bzVar);
        if (e != null) {
            this.f32808a.mo70038a((View) uc1, (C14697tn) e, jmVar2);
            if (!(!Intrinsics.areEqual((Object) e, (Object) bzVar2) || (f = uc1.mo70324f()) == null || (a = f.mo66368a(b, bzVar2)) == null)) {
                uc1.setDiv(a);
                return;
            }
        }
        uc1.mo65871b();
        l50 a2 = j31.m37658a(uc1);
        this.f32808a.mo70039a((View) uc1, (C14697tn) bzVar2, (C14697tn) e, jmVar2);
        C12941i iVar = new C12941i(uc1, bzVar2, b);
        iVar.invoke((Object) null);
        bzVar2.f31694z.f36398b.mo66923a(b, iVar);
        bzVar2.f31694z.f36399c.mo66923a(b, iVar);
        bzVar2.f31694z.f36400d.mo66923a(b, iVar);
        bzVar2.f31694z.f36397a.mo66923a(b, iVar);
        sc1<?> i = uc1.mo70327i();
        C13017ez ezVar = new C13017ez(bzVar2, b, i);
        ezVar.invoke((Object) null);
        l50 a3 = j31.m37658a(i);
        f50<Integer> f50 = bzVar2.f31692x.f31730i;
        if (f50 != null) {
            a3.mo65870a(f50.mo66923a(b, ezVar));
        }
        a3.mo65870a(bzVar2.f31692x.f31724c.mo66923a(b, ezVar));
        a3.mo65870a(bzVar2.f31692x.f31731j.f36400d.mo66923a(b, ezVar));
        a3.mo65870a(bzVar2.f31692x.f31731j.f36397a.mo66923a(b, ezVar));
        a3.mo65870a(bzVar2.f31694z.f36400d.mo66923a(b, ezVar));
        a3.mo65870a(bzVar2.f31694z.f36397a.mo66923a(b, ezVar));
        C12667bz.C12677h hVar = bzVar2.f31692x;
        m35504a(uc1.mo70327i(), b, hVar);
        l50 a4 = j31.m37658a(uc1);
        C13151fz fzVar = new C13151fz(this, uc1, b, hVar);
        a4.mo65870a(hVar.f31723b.mo66923a(b, fzVar));
        a4.mo65870a(hVar.f31722a.mo66923a(b, fzVar));
        a4.mo65870a(hVar.f31728g.mo66923a(b, fzVar));
        a4.mo65870a(hVar.f31727f.mo66923a(b, fzVar));
        uc1.mo70326h().setClipToPadding(false);
        C13776kr krVar = bzVar2.f31690v;
        C12937e eVar = new C12937e(uc1, bzVar2, b);
        a2.mo65870a(krVar.f36398b.mo66923a(b, eVar));
        a2.mo65870a(krVar.f36399c.mo66923a(b, eVar));
        a2.mo65870a(krVar.f36400d.mo66923a(b, eVar));
        a2.mo65870a(krVar.f36397a.mo66923a(b, eVar));
        eVar.invoke((Object) null);
        a2.mo65870a(bzVar2.f31689u.mo66925b(b, new C12938f(uc1)));
        a2.mo65870a(bzVar2.f31679k.mo66925b(b, new C12939g(uc1)));
        uc1.mo70327i().setOnScrollChangedListener(new sc1.C14584b(jmVar2) {
            public final /* synthetic */ C13513jm f$1;

            {
                this.f$1 = r2;
            }

            /* renamed from: a */
            public final void mo65501a() {
                C12932dz.m35500a(C12932dz.this, this.f$1);
            }
        });
        m35505a(tyVar, jmVar, uc1, e, bzVar, uoVar, b, a2);
        a2.mo65870a(bzVar2.f31685q.mo66925b(b, new C12940h(uc1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m35500a(C12932dz dzVar, C13513jm jmVar) {
        Intrinsics.checkNotNullParameter(dzVar, "this$0");
        Intrinsics.checkNotNullParameter(jmVar, "$divView");
        dzVar.f32813f.mo66623a(jmVar);
    }

    /* renamed from: a */
    private final void m35505a(C14729ty tyVar, C13513jm jmVar, uc1 uc1, C12667bz bzVar, C12667bz bzVar2, C14773uo uoVar, j50 j50, l50 l50) {
        C12936d dVar;
        C12932dz dzVar;
        uc1 uc12 = uc1;
        C12667bz bzVar3 = bzVar2;
        j50 j502 = j50;
        l50 l502 = l50;
        List<C12667bz.C12674g> list = bzVar3.f31682n;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (C12667bz.C12674g hxVar : list) {
            DisplayMetrics displayMetrics = uc1.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "view.resources.displayMetrics");
            arrayList.add(new C13357hx(hxVar, displayMetrics, j502));
        }
        C12843cz f = uc1.mo70324f();
        if (f == null || f.mo66375e() != bzVar3.f31676h.mo66924a(j502).booleanValue()) {
            f = null;
        }
        if (f != null) {
            f.mo66371a(tyVar);
            f.mo66373c().mo67906a(bzVar3);
            if (Intrinsics.areEqual((Object) bzVar, (Object) bzVar2)) {
                f.mo66376f();
            } else {
                f.mo68948a(new C14065nb.C14073g(arrayList) {
                    public final /* synthetic */ List f$0;

                    {
                        this.f$0 = r1;
                    }

                    /* renamed from: a */
                    public final List mo65499a() {
                        return C12932dz.m35499a(this.f$0);
                    }
                }, j502, l502);
            }
        } else {
            C14729ty tyVar2 = tyVar;
            m35507b(this, jmVar, bzVar2, j50, uc1, uoVar, tyVar, arrayList, bzVar3.f31688t.mo66924a(j502).intValue());
        }
        List<C12667bz.C12674g> list2 = bzVar3.f31682n;
        C12933a aVar = new C12933a(uc12);
        for (C12667bz.C12674g gVar : list2) {
            C13452ix g = gVar.f31703a.mo70911b().mo66148g();
            if (g instanceof C13452ix.C13455c) {
                C13452ix.C13455c cVar = (C13452ix.C13455c) g;
                l502.mo65870a(cVar.mo67900c().f42919a.mo66923a(j502, aVar));
                l502.mo65870a(cVar.mo67900c().f42920b.mo66923a(j502, aVar));
            }
        }
        C12936d dVar2 = new C12936d(this, uc12);
        C12934b bVar = r0;
        f50<Boolean> f50 = bzVar3.f31676h;
        C12936d dVar3 = dVar2;
        C12934b bVar2 = new C12934b(uc1, bzVar2, j50, this, jmVar, uoVar, tyVar, arrayList);
        l502.mo65870a(f50.mo66923a(j502, bVar));
        l502.mo65870a(bzVar3.f31688t.mo66923a(j502, dVar3));
        boolean z = false;
        boolean z2 = Intrinsics.areEqual((Object) jmVar.mo68041l(), (Object) C12758cr.f32024b) || Intrinsics.areEqual((Object) jmVar.mo68037g(), (Object) jmVar.mo68041l());
        int intValue = bzVar3.f31688t.mo66924a(j502).intValue();
        if (z2) {
            dzVar = this;
            dVar = dVar3;
            Integer num = dzVar.f32817j;
            if (num != null && num.intValue() == intValue) {
                z = true;
            }
        } else {
            dzVar = this;
            dVar = dVar3;
        }
        if (!z) {
            dVar.invoke(Integer.valueOf(intValue));
        }
        l502.mo65870a(bzVar3.f31691w.mo66925b(j502, new C12935c(uc1, dzVar, bzVar3)));
    }

    /* renamed from: a */
    private final C12843cz m35497a(C13513jm jmVar, C12667bz bzVar, j50 j50, uc1 uc1, C14773uo uoVar, C14729ty tyVar) {
        C13461iz izVar = new C13461iz(jmVar, this.f32812e, this.f32813f, this.f32814g, uc1, bzVar);
        boolean booleanValue = bzVar.f31676h.mo66924a(j50).booleanValue();
        s90 s90 = booleanValue ? $$Lambda$DZk3cVteI5fGgetwtMZZzso5l1g.INSTANCE : $$Lambda$rO3NFuy4k5ug9N5mBpBzp3omwk4.INSTANCE;
        int currentItem = uc1.mo70328j().getCurrentItem();
        int currentItem2 = uc1.mo70328j().getCurrentItem();
        if (currentItem2 == currentItem) {
            mg1.f37373a.mo68688a(new C12942j(izVar, currentItem2));
        }
        return new C12843cz(this.f32810c, uc1, new C14065nb.C14076i(C12066R.C12068id.base_tabbed_title_container_scroller, C12066R.C12068id.div_tabs_pager_container, C12066R.C12068id.div_tabs_container_helper, true, false, "DIV2.TAB_HEADER_VIEW", "DIV2.TAB_ITEM_VIEW"), s90, booleanValue, jmVar, this.f32811d, this.f32809b, uoVar, izVar, tyVar, this.f32815h);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m35504a(sc1<?> sc1, j50 j50, C12667bz.C12677h hVar) {
        sc1.setTabColors(hVar.f31723b.mo66924a(j50).intValue(), hVar.f31722a.mo66924a(j50).intValue(), hVar.f31728g.mo66924a(j50).intValue());
        sc1.setTabTitleStyle(hVar);
    }
}
