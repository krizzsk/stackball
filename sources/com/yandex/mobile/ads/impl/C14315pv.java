package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.mobile.ads.impl.C14215ov;
import com.yandex.mobile.ads.impl.C14713tv;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;

/* renamed from: com.yandex.mobile.ads.impl.pv */
public final class C14315pv {

    /* renamed from: a */
    private final C14624so f38835a;

    /* renamed from: b */
    private final a10 f38836b;

    /* renamed from: c */
    private final Provider<C14773uo> f38837c;

    /* renamed from: d */
    private final C12660bw f38838d;

    /* renamed from: e */
    private final C15056wm f38839e;

    /* renamed from: f */
    private ViewPager2.OnPageChangeCallback f38840f;

    /* renamed from: g */
    private ViewPager2.OnPageChangeCallback f38841g;

    /* renamed from: h */
    private zx0 f38842h;

    /* renamed from: com.yandex.mobile.ads.impl.pv$a */
    public static final class C14316a extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a */
        private final C14215ov f38843a;

        /* renamed from: b */
        private final C13513jm f38844b;

        /* renamed from: c */
        private final RecyclerView f38845c;

        /* renamed from: d */
        private int f38846d = -1;

        /* renamed from: e */
        private final int f38847e;

        /* renamed from: f */
        private int f38848f;

        /* renamed from: com.yandex.mobile.ads.impl.pv$a$a */
        public static final class C14317a implements View.OnLayoutChangeListener {

            /* renamed from: b */
            final /* synthetic */ C14316a f38849b;

            public C14317a(C14316a aVar) {
                this.f38849b = aVar;
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                this.f38849b.m40976a();
            }
        }

        public C14316a(C14215ov ovVar, C13513jm jmVar, RecyclerView recyclerView) {
            Intrinsics.checkNotNullParameter(ovVar, "divPager");
            Intrinsics.checkNotNullParameter(jmVar, "divView");
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            this.f38843a = ovVar;
            this.f38844b = jmVar;
            this.f38845c = recyclerView;
            this.f38847e = jmVar.mo68035e().mo65617b();
        }

        /* renamed from: b */
        private final void m40978b() {
            if (SequencesKt.count(ViewGroupKt.getChildren(this.f38845c)) > 0) {
                m40976a();
                return;
            }
            RecyclerView recyclerView = this.f38845c;
            if (!ViewCompat.isLaidOut(recyclerView) || recyclerView.isLayoutRequested()) {
                recyclerView.addOnLayoutChangeListener(new C14317a(this));
            } else {
                m40976a();
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            super.onPageScrolled(i, f, i2);
            int i3 = this.f38847e;
            if (i3 <= 0) {
                RecyclerView.LayoutManager layoutManager = this.f38845c.getLayoutManager();
                i3 = (layoutManager == null ? 0 : layoutManager.getWidth()) / 20;
            }
            int i4 = this.f38848f + i2;
            this.f38848f = i4;
            if (i4 > i3) {
                this.f38848f = 0;
                m40978b();
            }
        }

        public void onPageSelected(int i) {
            super.onPageSelected(i);
            m40978b();
            int i2 = this.f38846d;
            if (i != i2) {
                if (i2 != -1) {
                    this.f38844b.mo68026a((View) this.f38845c);
                    this.f38844b.mo68038h().mo65815m().mo66632a(this.f38844b, this.f38843a, i, i > this.f38846d ? "next" : "back");
                }
                C15177xl xlVar = this.f38843a.f38363n.get(i);
                if (C14175ob.m40348b(xlVar.mo70911b())) {
                    this.f38844b.mo68027a((View) this.f38845c, xlVar);
                }
                this.f38846d = i;
            }
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
            r4 = r0.next();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void m40976a() {
            /*
                r9 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r9.f38845c
                kotlin.sequences.Sequence r0 = androidx.core.view.ViewGroupKt.getChildren(r0)
                java.util.Iterator r0 = r0.iterator()
            L_0x000a:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0045
                java.lang.Object r1 = r0.next()
                r4 = r1
                android.view.View r4 = (android.view.View) r4
                androidx.recyclerview.widget.RecyclerView r1 = r9.f38845c
                int r1 = r1.getChildAdapterPosition(r4)
                r2 = -1
                if (r1 != r2) goto L_0x0021
                return
            L_0x0021:
                com.yandex.mobile.ads.impl.ov r2 = r9.f38843a
                java.util.List<com.yandex.mobile.ads.impl.xl> r2 = r2.f38363n
                java.lang.Object r1 = r2.get(r1)
                r5 = r1
                com.yandex.mobile.ads.impl.xl r5 = (com.yandex.mobile.ads.impl.C15177xl) r5
                com.yandex.mobile.ads.impl.jm r1 = r9.f38844b
                com.yandex.mobile.ads.impl.am r1 = r1.mo68038h()
                com.yandex.mobile.ads.impl.s10 r2 = r1.mo65806d()
                java.lang.String r1 = "divView.div2Component.visibilityActionTracker"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
                com.yandex.mobile.ads.impl.jm r3 = r9.f38844b
                r6 = 0
                r7 = 8
                r8 = 0
                com.yandex.mobile.ads.impl.s10.m41777a(r2, r3, r4, r5, r6, r7, r8)
                goto L_0x000a
            L_0x0045:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14315pv.C14316a.m40976a():void");
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pv$b */
    private static final class C14318b extends FrameLayout {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14318b(Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            if (getChildCount() == 0 || getChildAt(0).getLayoutParams().height != -1) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            } else {
                super.onMeasure(i, i2);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pv$c */
    private static final class C14319c extends C13354hw<C14320d> {

        /* renamed from: c */
        private final C13513jm f38850c;

        /* renamed from: d */
        private final C14773uo f38851d;

        /* renamed from: e */
        private final Function2<C14320d, Integer, Unit> f38852e;

        /* renamed from: f */
        private final a10 f38853f;

        /* renamed from: g */
        private final C14729ty f38854g;

        /* renamed from: h */
        private final k31 f38855h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14319c(List<? extends C15177xl> list, C13513jm jmVar, C14773uo uoVar, Function2<? super C14320d, ? super Integer, Unit> function2, a10 a10, C14729ty tyVar, k31 k31) {
            super(list, jmVar);
            Intrinsics.checkNotNullParameter(list, "divs");
            Intrinsics.checkNotNullParameter(jmVar, "div2View");
            Intrinsics.checkNotNullParameter(uoVar, "divBinder");
            Intrinsics.checkNotNullParameter(function2, "translationBinder");
            Intrinsics.checkNotNullParameter(a10, "viewCreator");
            Intrinsics.checkNotNullParameter(tyVar, "path");
            Intrinsics.checkNotNullParameter(k31, "visitor");
            this.f38850c = jmVar;
            this.f38851d = uoVar;
            this.f38852e = function2;
            this.f38853f = a10;
            this.f38854g = tyVar;
            this.f38855h = k31;
        }

        /* renamed from: a */
        public boolean onFailedToRecycleView(C14320d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "holder");
            boolean onFailedToRecycleView = super.onFailedToRecycleView(dVar);
            if (!onFailedToRecycleView) {
                FrameLayout a = dVar.mo69445a();
                C13513jm jmVar = this.f38850c;
                Intrinsics.checkNotNullParameter(a, "<this>");
                Intrinsics.checkNotNullParameter(jmVar, "divView");
                for (View a2 : ViewGroupKt.getChildren(a)) {
                    i10.m37254a(jmVar.mo68042m(), a2);
                }
                a.removeAllViews();
            }
            return onFailedToRecycleView;
        }

        public int getItemCount() {
            return mo67642a().size();
        }

        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            C14320d dVar = (C14320d) viewHolder;
            Intrinsics.checkNotNullParameter(dVar, "holder");
            dVar.mo69446a(this.f38850c, mo67642a().get(i), this.f38854g);
            this.f38852e.invoke(dVar, Integer.valueOf(i));
        }

        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
            Context context = this.f38850c.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "div2View.context");
            C14318b bVar = new C14318b(context);
            bVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return new C14320d(bVar, this.f38851d, this.f38853f, this.f38855h);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pv$d */
    private static final class C14320d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final FrameLayout f38856a;

        /* renamed from: b */
        private final C14773uo f38857b;

        /* renamed from: c */
        private final a10 f38858c;

        /* renamed from: d */
        private C15177xl f38859d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14320d(FrameLayout frameLayout, C14773uo uoVar, a10 a10, k31 k31) {
            super(frameLayout);
            Intrinsics.checkNotNullParameter(frameLayout, "frameLayout");
            Intrinsics.checkNotNullParameter(uoVar, "divBinder");
            Intrinsics.checkNotNullParameter(a10, "viewCreator");
            Intrinsics.checkNotNullParameter(k31, "visitor");
            this.f38856a = frameLayout;
            this.f38857b = uoVar;
            this.f38858c = a10;
        }

        /* renamed from: a */
        public final FrameLayout mo69445a() {
            return this.f38856a;
        }

        /* renamed from: a */
        public final void mo69446a(C13513jm jmVar, C15177xl xlVar, C14729ty tyVar) {
            View view;
            Intrinsics.checkNotNullParameter(jmVar, "div2View");
            Intrinsics.checkNotNullParameter(xlVar, "div");
            Intrinsics.checkNotNullParameter(tyVar, "path");
            j50 b = jmVar.mo66388b();
            C15177xl xlVar2 = this.f38859d;
            if (xlVar2 == null || !C13338hp.f34501a.mo67586a(xlVar2, xlVar, b)) {
                view = this.f38858c.mo65649b(xlVar, b);
                FrameLayout frameLayout = this.f38856a;
                Intrinsics.checkNotNullParameter(frameLayout, "<this>");
                Intrinsics.checkNotNullParameter(jmVar, "divView");
                for (View a : ViewGroupKt.getChildren(frameLayout)) {
                    i10.m37254a(jmVar.mo68042m(), a);
                }
                frameLayout.removeAllViews();
                this.f38856a.addView(view);
            } else {
                view = ViewGroupKt.get(this.f38856a, 0);
            }
            this.f38859d = xlVar;
            this.f38857b.mo70383a(view, xlVar, jmVar, tyVar);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pv$e */
    static final class C14321e extends Lambda implements Function2<C14320d, Integer, Unit> {

        /* renamed from: b */
        final /* synthetic */ SparseArray<Float> f38860b;

        /* renamed from: c */
        final /* synthetic */ C14215ov f38861c;

        /* renamed from: d */
        final /* synthetic */ j50 f38862d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14321e(SparseArray<Float> sparseArray, C14215ov ovVar, j50 j50) {
            super(2);
            this.f38860b = sparseArray;
            this.f38861c = ovVar;
            this.f38862d = j50;
        }

        public Object invoke(Object obj, Object obj2) {
            C14320d dVar = (C14320d) obj;
            int intValue = ((Number) obj2).intValue();
            Intrinsics.checkNotNullParameter(dVar, "holder");
            Float f = this.f38860b.get(intValue);
            if (f != null) {
                C14215ov ovVar = this.f38861c;
                j50 j50 = this.f38862d;
                float floatValue = f.floatValue();
                if (ovVar.f38366q.mo66924a(j50) == C14215ov.C14222g.HORIZONTAL) {
                    dVar.itemView.setTranslationX(floatValue);
                } else {
                    dVar.itemView.setTranslationY(floatValue);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pv$f */
    static final class C14322f extends Lambda implements Function1<C14215ov.C14222g, Unit> {

        /* renamed from: b */
        final /* synthetic */ C15118wv f38863b;

        /* renamed from: c */
        final /* synthetic */ C14315pv f38864c;

        /* renamed from: d */
        final /* synthetic */ C14215ov f38865d;

        /* renamed from: e */
        final /* synthetic */ j50 f38866e;

        /* renamed from: f */
        final /* synthetic */ SparseArray<Float> f38867f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14322f(C15118wv wvVar, C14315pv pvVar, C14215ov ovVar, j50 j50, SparseArray<Float> sparseArray) {
            super(1);
            this.f38863b = wvVar;
            this.f38864c = pvVar;
            this.f38865d = ovVar;
            this.f38866e = j50;
            this.f38867f = sparseArray;
        }

        public Object invoke(Object obj) {
            C14215ov.C14222g gVar = (C14215ov.C14222g) obj;
            Intrinsics.checkNotNullParameter(gVar, "it");
            this.f38863b.setOrientation(gVar == C14215ov.C14222g.HORIZONTAL ? 0 : 1);
            this.f38864c.m40974a(this.f38863b, this.f38865d, this.f38866e, this.f38867f);
            C14315pv.m40972a(this.f38864c, this.f38863b, this.f38865d, this.f38866e);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pv$g */
    static final class C14323g extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: b */
        final /* synthetic */ C15118wv f38868b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14323g(C15118wv wvVar) {
            super(1);
            this.f38868b = wvVar;
        }

        public Object invoke(Object obj) {
            this.f38868b.setOnInterceptTouchEventListener(((Boolean) obj).booleanValue() ? new dy0(1) : null);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pv$h */
    static final class C14324h extends Lambda implements Function1<Object, Unit> {

        /* renamed from: b */
        final /* synthetic */ C14315pv f38869b;

        /* renamed from: c */
        final /* synthetic */ C15118wv f38870c;

        /* renamed from: d */
        final /* synthetic */ C14215ov f38871d;

        /* renamed from: e */
        final /* synthetic */ j50 f38872e;

        /* renamed from: f */
        final /* synthetic */ SparseArray<Float> f38873f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14324h(C14315pv pvVar, C15118wv wvVar, C14215ov ovVar, j50 j50, SparseArray<Float> sparseArray) {
            super(1);
            this.f38869b = pvVar;
            this.f38870c = wvVar;
            this.f38871d = ovVar;
            this.f38872e = j50;
            this.f38873f = sparseArray;
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "$noName_0");
            C14315pv.m40972a(this.f38869b, this.f38870c, this.f38871d, this.f38872e);
            this.f38869b.m40974a(this.f38870c, this.f38871d, this.f38872e, this.f38873f);
            return Unit.INSTANCE;
        }
    }

    @Inject
    public C14315pv(C14624so soVar, a10 a10, Provider<C14773uo> provider, C12660bw bwVar, C15056wm wmVar) {
        Intrinsics.checkNotNullParameter(soVar, "baseBinder");
        Intrinsics.checkNotNullParameter(a10, "viewCreator");
        Intrinsics.checkNotNullParameter(provider, "divBinder");
        Intrinsics.checkNotNullParameter(bwVar, "divPatchCache");
        Intrinsics.checkNotNullParameter(wmVar, "divActionBinder");
        this.f38835a = soVar;
        this.f38836b = a10;
        this.f38837c = provider;
        this.f38838d = bwVar;
        this.f38839e = wmVar;
    }

    /* renamed from: a */
    public static final void m40972a(C14315pv pvVar, C15118wv wvVar, C14215ov ovVar, j50 j50) {
        C14315pv pvVar2 = pvVar;
        C14215ov ovVar2 = ovVar;
        j50 j502 = j50;
        pvVar.getClass();
        DisplayMetrics displayMetrics = wvVar.getResources().getDisplayMetrics();
        C15266yr yrVar = ovVar2.f38362m;
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "metrics");
        float b = C14175ob.m40343b(yrVar, displayMetrics, j502);
        float a = pvVar2.m40969a(ovVar2, wvVar, j502);
        ViewPager2 d = wvVar.mo66339d();
        wx0 wx0 = r6;
        wx0 wx02 = new wx0(C14175ob.m40344b(ovVar.mo66158p().f36398b.mo66924a(j502), displayMetrics), C14175ob.m40344b(ovVar.mo66158p().f36399c.mo66924a(j502), displayMetrics), C14175ob.m40344b(ovVar.mo66158p().f36400d.mo66924a(j502), displayMetrics), C14175ob.m40344b(ovVar.mo66158p().f36397a.mo66924a(j502), displayMetrics), a, b, ovVar2.f38366q.mo66924a(j502) == C14215ov.C14222g.HORIZONTAL ? 0 : 1);
        int itemDecorationCount = d.getItemDecorationCount();
        for (int i = 0; i < itemDecorationCount; i++) {
            d.removeItemDecorationAt(i);
        }
        d.addItemDecoration(wx0);
        Integer a2 = pvVar2.m40970a(ovVar2, j502);
        if ((!(a == 0.0f) || (a2 != null && a2.intValue() < 100)) && wvVar.mo66339d().getOffscreenPageLimit() != 1) {
            wvVar.mo66339d().setOffscreenPageLimit(1);
        }
    }

    /* renamed from: a */
    public void mo69441a(C15118wv wvVar, C14215ov ovVar, C13513jm jmVar, C14729ty tyVar) {
        Integer num;
        C15118wv wvVar2 = wvVar;
        C14215ov ovVar2 = ovVar;
        C13513jm jmVar2 = jmVar;
        Intrinsics.checkNotNullParameter(wvVar2, "view");
        Intrinsics.checkNotNullParameter(ovVar2, "div");
        Intrinsics.checkNotNullParameter(jmVar2, "divView");
        Intrinsics.checkNotNullParameter(tyVar, "path");
        j50 b = jmVar.mo66388b();
        C14215ov e = wvVar.mo70763e();
        if (Intrinsics.areEqual((Object) ovVar2, (Object) e)) {
            RecyclerView.Adapter adapter = wvVar.mo66339d().getAdapter();
            if (adapter != null) {
                C14319c cVar = (C14319c) adapter;
                if (!cVar.mo67643a(this.f38838d)) {
                    cVar.notifyItemRangeChanged(0, cVar.mo67642a().size());
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.core.view2.divs.DivPagerBinder.PagerAdapter");
        }
        l50 a = j31.m37658a(wvVar);
        a.mo65871b();
        wvVar.setDiv$div_release(ovVar);
        if (e != null) {
            this.f38835a.mo70038a((View) wvVar2, (C14697tn) e, jmVar2);
        }
        this.f38835a.mo70039a((View) wvVar2, (C14697tn) ovVar2, (C14697tn) e, jmVar2);
        SparseArray sparseArray = new SparseArray();
        wvVar2.setRecycledViewPool(new m31(jmVar.mo68042m()));
        ViewPager2 d = wvVar.mo66339d();
        List<C15177xl> list = ovVar2.f38363n;
        C14773uo uoVar = this.f38837c.get();
        Intrinsics.checkNotNullExpressionValue(uoVar, "divBinder.get()");
        C14321e eVar = new C14321e(sparseArray, ovVar2, b);
        C14319c cVar2 = r9;
        a10 a10 = this.f38836b;
        SparseArray sparseArray2 = sparseArray;
        C14319c cVar3 = new C14319c(list, jmVar, uoVar, eVar, a10, tyVar, jmVar.mo68042m());
        d.setAdapter(cVar2);
        SparseArray sparseArray3 = sparseArray2;
        l50 l50 = a;
        j50 j50 = b;
        C13513jm jmVar3 = jmVar2;
        C14324h hVar = new C14324h(this, wvVar, ovVar, b, sparseArray3);
        l50.mo65870a(ovVar.mo66158p().f36398b.mo66923a(j50, hVar));
        l50.mo65870a(ovVar.mo66158p().f36399c.mo66923a(j50, hVar));
        l50.mo65870a(ovVar.mo66158p().f36400d.mo66923a(j50, hVar));
        l50.mo65870a(ovVar.mo66158p().f36397a.mo66923a(j50, hVar));
        l50.mo65870a(ovVar2.f38362m.f42920b.mo66923a(j50, hVar));
        l50.mo65870a(ovVar2.f38362m.f42919a.mo66923a(j50, hVar));
        C14713tv tvVar = ovVar2.f38364o;
        if (tvVar instanceof C14713tv.C14716c) {
            C14713tv.C14716c cVar4 = (C14713tv.C14716c) tvVar;
            l50.mo65870a(cVar4.mo70237b().f36426a.f42920b.mo66923a(j50, hVar));
            l50.mo65870a(cVar4.mo70237b().f36426a.f42919a.mo66923a(j50, hVar));
        } else if (tvVar instanceof C14713tv.C14717d) {
            l50.mo65870a(((C14713tv.C14717d) tvVar).mo70238b().f37525a.f35654a.mo66923a(j50, hVar));
            l50.mo65870a(new C14423qv(wvVar.mo66339d(), hVar));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Unit unit = Unit.INSTANCE;
        l50.mo65870a(ovVar2.f38366q.mo66925b(j50, new C14322f(wvVar, this, ovVar, j50, sparseArray3)));
        zx0 zx0 = this.f38842h;
        if (zx0 != null) {
            zx0.mo71283b(wvVar.mo66339d());
        }
        zx0 zx02 = new zx0(jmVar3, ovVar2, this.f38839e);
        zx02.mo71282a(wvVar.mo66339d());
        this.f38842h = zx02;
        if (this.f38841g != null) {
            ViewPager2 d2 = wvVar.mo66339d();
            ViewPager2.OnPageChangeCallback onPageChangeCallback = this.f38841g;
            Intrinsics.checkNotNull(onPageChangeCallback);
            d2.unregisterOnPageChangeCallback(onPageChangeCallback);
        }
        View childAt = wvVar.mo66339d().getChildAt(0);
        if (childAt != null) {
            this.f38841g = new C14316a(ovVar2, jmVar3, (RecyclerView) childAt);
            ViewPager2 d3 = wvVar.mo66339d();
            ViewPager2.OnPageChangeCallback onPageChangeCallback2 = this.f38841g;
            Intrinsics.checkNotNull(onPageChangeCallback2);
            d3.registerOnPageChangeCallback(onPageChangeCallback2);
            g10 f = jmVar.mo68036f();
            if (f != null) {
                String c = ovVar.mo66144c();
                if (c == null) {
                    c = String.valueOf(ovVar.hashCode());
                }
                by0 by0 = (by0) f.mo67144a(c);
                if (this.f38840f != null) {
                    ViewPager2 d4 = wvVar.mo66339d();
                    ViewPager2.OnPageChangeCallback onPageChangeCallback3 = this.f38840f;
                    Intrinsics.checkNotNull(onPageChangeCallback3);
                    d4.unregisterOnPageChangeCallback(onPageChangeCallback3);
                }
                this.f38840f = new qg1(c, f);
                ViewPager2 d5 = wvVar.mo66339d();
                ViewPager2.OnPageChangeCallback onPageChangeCallback4 = this.f38840f;
                Intrinsics.checkNotNull(onPageChangeCallback4);
                d5.registerOnPageChangeCallback(onPageChangeCallback4);
                if (by0 == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(by0.mo66138a());
                }
                wvVar2.setCurrentItem$div_release(num == null ? ovVar2.f38357h.mo66924a(j50).intValue() : num.intValue());
            }
            l50.mo65870a(ovVar2.f38368s.mo66925b(j50, new C14323g(wvVar2)));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m40974a(C15118wv wvVar, C14215ov ovVar, j50 j50, SparseArray<Float> sparseArray) {
        float f;
        float f2;
        C14215ov ovVar2 = ovVar;
        j50 j502 = j50;
        DisplayMetrics displayMetrics = wvVar.getResources().getDisplayMetrics();
        C14215ov.C14222g a = ovVar2.f38366q.mo66924a(j502);
        Integer a2 = m40970a(ovVar2, j502);
        C15266yr yrVar = ovVar2.f38362m;
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "metrics");
        float b = C14175ob.m40343b(yrVar, displayMetrics, j502);
        C14215ov.C14222g gVar = C14215ov.C14222g.HORIZONTAL;
        if (a == gVar) {
            f = C14175ob.m40344b(ovVar.mo66158p().f36398b.mo66924a(j502), displayMetrics);
        } else {
            f = C14175ob.m40344b(ovVar.mo66158p().f36400d.mo66924a(j502), displayMetrics);
        }
        float f3 = f;
        if (a == gVar) {
            f2 = C14175ob.m40344b(ovVar.mo66158p().f36399c.mo66924a(j502), displayMetrics);
        } else {
            f2 = C14175ob.m40344b(ovVar.mo66158p().f36397a.mo66924a(j502), displayMetrics);
        }
        wvVar.mo66339d().setPageTransformer(new ViewPager2.PageTransformer(ovVar, wvVar, j50, a2, a, b, f3, f2, sparseArray) {
            public final /* synthetic */ C14215ov f$1;
            public final /* synthetic */ C15118wv f$2;
            public final /* synthetic */ j50 f$3;
            public final /* synthetic */ Integer f$4;
            public final /* synthetic */ C14215ov.C14222g f$5;
            public final /* synthetic */ float f$6;
            public final /* synthetic */ float f$7;
            public final /* synthetic */ float f$8;
            public final /* synthetic */ SparseArray f$9;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
                this.f$7 = r8;
                this.f$8 = r9;
                this.f$9 = r10;
            }

            public final void transformPage(View view, float f) {
                C14315pv.m40971a(C14315pv.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, view, f);
            }
        });
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0129, code lost:
        if (r3 <= 1.0f) goto L_0x012b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m40971a(com.yandex.mobile.ads.impl.C14315pv r18, com.yandex.mobile.ads.impl.C14215ov r19, com.yandex.mobile.ads.impl.C15118wv r20, com.yandex.mobile.ads.impl.j50 r21, java.lang.Integer r22, com.yandex.mobile.ads.impl.C14215ov.C14222g r23, float r24, float r25, float r26, android.util.SparseArray r27, android.view.View r28, float r29) {
        /*
            r0 = r23
            r1 = r27
            r2 = r28
            r3 = r29
            java.lang.String r4 = "this$0"
            r5 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r4)
            java.lang.String r4 = "$div"
            r6 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r4)
            java.lang.String r4 = "$view"
            r7 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r4)
            java.lang.String r4 = "$resolver"
            r8 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r4)
            java.lang.String r4 = "$orientation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "$pageTranslations"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "page"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            android.view.ViewParent r4 = r28.getParent()
            android.view.ViewParent r4 = r4.getParent()
            if (r4 == 0) goto L_0x015b
            androidx.viewpager2.widget.ViewPager2 r4 = (androidx.viewpager2.widget.ViewPager2) r4
            r9 = 0
            android.view.View r4 = r4.getChildAt(r9)
            if (r4 == 0) goto L_0x0153
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            androidx.recyclerview.widget.RecyclerView$Adapter r10 = r4.getAdapter()
            r11 = 2
            r12 = 1
            if (r10 != 0) goto L_0x0051
            goto L_0x0059
        L_0x0051:
            int r10 = r10.getItemCount()
            if (r10 != r11) goto L_0x0059
            r10 = 1
            goto L_0x005a
        L_0x0059:
            r10 = 0
        L_0x005a:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r13 = r4.getLayoutManager()
            if (r13 != 0) goto L_0x0062
            r13 = 0
            goto L_0x006a
        L_0x0062:
            int r13 = r13.getPosition(r2)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
        L_0x006a:
            if (r13 != 0) goto L_0x006d
            goto L_0x0075
        L_0x006d:
            int r14 = r13.intValue()
            if (r14 != 0) goto L_0x0075
            r14 = 1
            goto L_0x0076
        L_0x0075:
            r14 = 0
        L_0x0076:
            if (r13 != 0) goto L_0x0079
            goto L_0x0081
        L_0x0079:
            int r15 = r13.intValue()
            if (r15 != r12) goto L_0x0081
            r15 = 1
            goto L_0x0082
        L_0x0081:
            r15 = 0
        L_0x0082:
            androidx.recyclerview.widget.RecyclerView$Adapter r16 = r4.getAdapter()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r16)
            int r16 = r16.getItemCount()
            int r9 = r16 + -2
            if (r13 != 0) goto L_0x0092
            goto L_0x009a
        L_0x0092:
            int r11 = r13.intValue()
            if (r11 != r9) goto L_0x009a
            r9 = 1
            goto L_0x009b
        L_0x009a:
            r9 = 0
        L_0x009b:
            androidx.recyclerview.widget.RecyclerView$Adapter r4 = r4.getAdapter()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r4 = r4.getItemCount()
            int r4 = r4 - r12
            if (r13 != 0) goto L_0x00aa
            goto L_0x00b3
        L_0x00aa:
            int r11 = r13.intValue()
            if (r11 != r4) goto L_0x00b3
            r17 = 1
            goto L_0x00b5
        L_0x00b3:
            r17 = 0
        L_0x00b5:
            float r4 = r18.m40969a(r19, r20, r21)
            if (r22 == 0) goto L_0x00e3
            com.yandex.mobile.ads.impl.ov$g r4 = com.yandex.mobile.ads.impl.C14215ov.C14222g.HORIZONTAL
            if (r0 != r4) goto L_0x00c8
            androidx.viewpager2.widget.ViewPager2 r4 = r20.mo66339d()
            int r4 = r4.getWidth()
            goto L_0x00d0
        L_0x00c8:
            androidx.viewpager2.widget.ViewPager2 r4 = r20.mo66339d()
            int r4 = r4.getHeight()
        L_0x00d0:
            float r4 = (float) r4
            float r5 = (float) r12
            int r6 = r22.intValue()
            float r6 = (float) r6
            r7 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 / r7
            float r5 = r5 - r6
            float r4 = r4 * r5
            r5 = 2
            float r6 = (float) r5
            float r5 = r24 * r6
            float r4 = r4 - r5
            float r4 = r4 / r6
        L_0x00e3:
            r5 = 0
            if (r10 == 0) goto L_0x00e7
            goto L_0x012f
        L_0x00e7:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r14 == 0) goto L_0x00f4
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x00f4
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 < 0) goto L_0x00f4
            goto L_0x0107
        L_0x00f4:
            if (r14 == 0) goto L_0x0101
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0101
            float r5 = r4 + r24
            float r5 = r5 - r25
            float r6 = -r3
            float r5 = r5 / r6
            goto L_0x012f
        L_0x0101:
            if (r15 == 0) goto L_0x010c
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x010c
        L_0x0107:
            float r5 = r4 + r24
            float r5 = r5 - r25
            goto L_0x012f
        L_0x010c:
            if (r9 == 0) goto L_0x0113
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x0113
            goto L_0x012b
        L_0x0113:
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r17 == 0) goto L_0x0121
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x0121
            float r5 = r4 + r24
            float r5 = r5 - r26
            float r5 = r5 / r3
            goto L_0x012f
        L_0x0121:
            if (r17 == 0) goto L_0x012f
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x012f
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x012f
        L_0x012b:
            float r5 = r4 + r24
            float r5 = r5 - r26
        L_0x012f:
            float r3 = -r3
            r6 = 2
            float r6 = (float) r6
            float r4 = r4 * r6
            float r4 = r4 + r24
            float r4 = r4 + r5
            float r3 = r3 * r4
            if (r13 != 0) goto L_0x013c
            goto L_0x0147
        L_0x013c:
            int r4 = r13.intValue()
            java.lang.Float r5 = java.lang.Float.valueOf(r3)
            r1.put(r4, r5)
        L_0x0147:
            com.yandex.mobile.ads.impl.ov$g r1 = com.yandex.mobile.ads.impl.C14215ov.C14222g.HORIZONTAL
            if (r0 != r1) goto L_0x014f
            r2.setTranslationX(r3)
            goto L_0x0152
        L_0x014f:
            r2.setTranslationY(r3)
        L_0x0152:
            return
        L_0x0153:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView"
            r0.<init>(r1)
            throw r0
        L_0x015b:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14315pv.m40971a(com.yandex.mobile.ads.impl.pv, com.yandex.mobile.ads.impl.ov, com.yandex.mobile.ads.impl.wv, com.yandex.mobile.ads.impl.j50, java.lang.Integer, com.yandex.mobile.ads.impl.ov$g, float, float, float, android.util.SparseArray, android.view.View, float):void");
    }

    /* renamed from: a */
    private final Integer m40970a(C14215ov ovVar, j50 j50) {
        C14018mv b;
        C13590jw jwVar;
        f50<Double> f50;
        Double a;
        C14713tv tvVar = ovVar.f38364o;
        C14713tv.C14717d dVar = tvVar instanceof C14713tv.C14717d ? (C14713tv.C14717d) tvVar : null;
        if (dVar == null || (b = dVar.mo70238b()) == null || (jwVar = b.f37525a) == null || (f50 = jwVar.f35654a) == null || (a = f50.mo66924a(j50)) == null) {
            return null;
        }
        return Integer.valueOf((int) a.doubleValue());
    }

    /* renamed from: a */
    private final float m40969a(C14215ov ovVar, C15118wv wvVar, j50 j50) {
        int i;
        DisplayMetrics displayMetrics = wvVar.getResources().getDisplayMetrics();
        C14713tv tvVar = ovVar.f38364o;
        if (tvVar instanceof C14713tv.C14717d) {
            if (ovVar.f38366q.mo66924a(j50) == C14215ov.C14222g.HORIZONTAL) {
                i = wvVar.mo66339d().getWidth();
            } else {
                i = wvVar.mo66339d().getHeight();
            }
            C15266yr yrVar = ovVar.f38362m;
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "metrics");
            float b = C14175ob.m40343b(yrVar, displayMetrics, j50);
            float doubleValue = ((float) i) * (((float) 1) - (((float) ((int) ((C14713tv.C14717d) tvVar).mo70238b().f37525a.f35654a.mo66924a(j50).doubleValue())) / 100.0f));
            float f = (float) 2;
            return (doubleValue - (b * f)) / f;
        } else if (tvVar instanceof C14713tv.C14716c) {
            C15266yr yrVar2 = ((C14713tv.C14716c) tvVar).mo70237b().f36426a;
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "metrics");
            return C14175ob.m40343b(yrVar2, displayMetrics, j50);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
