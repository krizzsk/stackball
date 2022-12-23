package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.C12066R;
import java.util.List;
import java.util.WeakHashMap;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.gs */
public final class C13232gs {

    /* renamed from: a */
    private final C14624so f34089a;

    /* renamed from: b */
    private final a10 f34090b;

    /* renamed from: c */
    private final Provider<C14773uo> f34091c;

    /* renamed from: d */
    private final C12660bw f34092d;

    /* renamed from: com.yandex.mobile.ads.impl.gs$a */
    public static final class C13233a extends C13354hw<C13234b> {

        /* renamed from: c */
        private final C13513jm f34093c;

        /* renamed from: d */
        private final C14773uo f34094d;

        /* renamed from: e */
        private final a10 f34095e;

        /* renamed from: f */
        private final C14729ty f34096f;

        /* renamed from: g */
        private final WeakHashMap<C15177xl, Long> f34097g = new WeakHashMap<>();

        /* renamed from: h */
        private long f34098h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13233a(List<? extends C15177xl> list, C13513jm jmVar, C14773uo uoVar, a10 a10, C14729ty tyVar) {
            super(list, jmVar);
            Intrinsics.checkNotNullParameter(list, "divs");
            Intrinsics.checkNotNullParameter(jmVar, "div2View");
            Intrinsics.checkNotNullParameter(uoVar, "divBinder");
            Intrinsics.checkNotNullParameter(a10, "viewCreator");
            Intrinsics.checkNotNullParameter(tyVar, "path");
            this.f34093c = jmVar;
            this.f34094d = uoVar;
            this.f34095e = a10;
            this.f34096f = tyVar;
            setHasStableIds(true);
        }

        /* renamed from: a */
        public boolean onFailedToRecycleView(C13234b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "holder");
            boolean onFailedToRecycleView = super.onFailedToRecycleView(bVar);
            if (!onFailedToRecycleView) {
                oo1 a = bVar.mo67347a();
                C13513jm jmVar = this.f34093c;
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

        public long getItemId(int i) {
            C15177xl xlVar = mo67642a().get(i);
            Long l = this.f34097g.get(xlVar);
            if (l != null) {
                return l.longValue();
            }
            long j = this.f34098h;
            this.f34098h = 1 + j;
            this.f34097g.put(xlVar, Long.valueOf(j));
            return j;
        }

        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            C13234b bVar = (C13234b) viewHolder;
            Intrinsics.checkNotNullParameter(bVar, "holder");
            bVar.mo67347a().setTag(C12066R.C12068id.div_gallery_item_index, Integer.valueOf(i));
            bVar.mo67348a(this.f34093c, mo67642a().get(i), this.f34096f);
        }

        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
            Context context = this.f34093c.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "div2View.context");
            return new C13234b(new oo1(context, (AttributeSet) null, 0, 6), this.f34094d, this.f34095e);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gs$b */
    public static final class C13234b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final oo1 f34099a;

        /* renamed from: b */
        private final C14773uo f34100b;

        /* renamed from: c */
        private final a10 f34101c;

        /* renamed from: d */
        private C15177xl f34102d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13234b(oo1 oo1, C14773uo uoVar, a10 a10) {
            super(oo1);
            Intrinsics.checkNotNullParameter(oo1, "rootView");
            Intrinsics.checkNotNullParameter(uoVar, "divBinder");
            Intrinsics.checkNotNullParameter(a10, "viewCreator");
            this.f34099a = oo1;
            this.f34100b = uoVar;
            this.f34101c = a10;
        }

        /* renamed from: a */
        public final oo1 mo67347a() {
            return this.f34099a;
        }

        /* renamed from: a */
        public final void mo67348a(C13513jm jmVar, C15177xl xlVar, C14729ty tyVar) {
            View view;
            Intrinsics.checkNotNullParameter(jmVar, "div2View");
            Intrinsics.checkNotNullParameter(xlVar, "div");
            Intrinsics.checkNotNullParameter(tyVar, "path");
            j50 b = jmVar.mo66388b();
            C15177xl xlVar2 = this.f34102d;
            if (xlVar2 == null || !C13338hp.f34501a.mo67586a(xlVar2, xlVar, b)) {
                view = this.f34101c.mo65649b(xlVar, b);
                oo1 oo1 = this.f34099a;
                Intrinsics.checkNotNullParameter(oo1, "<this>");
                Intrinsics.checkNotNullParameter(jmVar, "divView");
                for (View a : ViewGroupKt.getChildren(oo1)) {
                    i10.m37254a(jmVar.mo68042m(), a);
                }
                oo1.removeAllViews();
                this.f34099a.addView(view);
            } else {
                view = this.f34099a.mo69242a();
                Intrinsics.checkNotNull(view);
            }
            this.f34102d = xlVar;
            this.f34100b.mo70383a(view, xlVar, jmVar, tyVar);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gs$c */
    private static final class C13235c extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        private final C13513jm f34103a;

        /* renamed from: b */
        private final RecyclerView f34104b;

        /* renamed from: c */
        private final C13440is f34105c;

        /* renamed from: d */
        private final C13111fs f34106d;

        /* renamed from: e */
        private final int f34107e;

        /* renamed from: f */
        private int f34108f;

        /* renamed from: g */
        private boolean f34109g;

        /* renamed from: h */
        private String f34110h = "next";

        public C13235c(C13513jm jmVar, RecyclerView recyclerView, C13440is isVar, C13111fs fsVar) {
            Intrinsics.checkNotNullParameter(jmVar, "divView");
            Intrinsics.checkNotNullParameter(recyclerView, "recycler");
            Intrinsics.checkNotNullParameter(isVar, "galleryItemHelper");
            Intrinsics.checkNotNullParameter(fsVar, "galleryDiv");
            this.f34103a = jmVar;
            this.f34104b = recyclerView;
            this.f34105c = isVar;
            this.f34106d = fsVar;
            this.f34107e = jmVar.mo68035e().mo65617b();
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 1) {
                this.f34109g = false;
            }
            if (i == 0) {
                this.f34103a.mo68038h().mo65815m().mo66631a(this.f34103a, this.f34106d, this.f34105c.mo60780f(), this.f34105c.mo60782h(), this.f34110h);
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            int i3 = this.f34107e;
            if (!(i3 > 0)) {
                i3 = this.f34105c.mo60778d() / 20;
            }
            int abs = this.f34108f + Math.abs(i) + Math.abs(i2);
            this.f34108f = abs;
            if (abs > i3) {
                this.f34108f = 0;
                if (!this.f34109g) {
                    this.f34109g = true;
                    this.f34103a.mo68038h().mo65815m().mo66633b(this.f34103a);
                    this.f34110h = (i > 0 || i2 > 0) ? "next" : "back";
                }
                for (View next : ViewGroupKt.getChildren(this.f34104b)) {
                    int childAdapterPosition = this.f34104b.getChildAdapterPosition(next);
                    RecyclerView.Adapter adapter = this.f34104b.getAdapter();
                    if (adapter != null) {
                        s10 d = this.f34103a.mo68038h().mo65806d();
                        Intrinsics.checkNotNullExpressionValue(d, "divView.div2Component.visibilityActionTracker");
                        s10.m41777a(d, this.f34103a, next, ((C13233a) adapter).mo67642a().get(childAdapterPosition), (List) null, 8, (Object) null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.core.view2.divs.gallery.DivGalleryBinder.GalleryAdapter");
                    }
                }
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gs$d */
    static final class C13236d extends Lambda implements Function1<Object, Unit> {

        /* renamed from: b */
        final /* synthetic */ C13232gs f34111b;

        /* renamed from: c */
        final /* synthetic */ RecyclerView f34112c;

        /* renamed from: d */
        final /* synthetic */ C13111fs f34113d;

        /* renamed from: e */
        final /* synthetic */ C13513jm f34114e;

        /* renamed from: f */
        final /* synthetic */ j50 f34115f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13236d(C13232gs gsVar, RecyclerView recyclerView, C13111fs fsVar, C13513jm jmVar, j50 j50) {
            super(1);
            this.f34111b = gsVar;
            this.f34112c = recyclerView;
            this.f34113d = fsVar;
            this.f34114e = jmVar;
            this.f34115f = j50;
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "$noName_0");
            this.f34111b.m36683a(this.f34112c, this.f34113d, this.f34114e, this.f34115f);
            return Unit.INSTANCE;
        }
    }

    @Inject
    public C13232gs(C14624so soVar, a10 a10, Provider<C14773uo> provider, C12660bw bwVar) {
        Intrinsics.checkNotNullParameter(soVar, "baseBinder");
        Intrinsics.checkNotNullParameter(a10, "viewCreator");
        Intrinsics.checkNotNullParameter(provider, "divBinder");
        Intrinsics.checkNotNullParameter(bwVar, "divPatchCache");
        this.f34089a = soVar;
        this.f34090b = a10;
        this.f34091c = provider;
        this.f34092d = bwVar;
    }

    /* renamed from: a */
    public void mo67345a(RecyclerView recyclerView, C13111fs fsVar, C13513jm jmVar, C14729ty tyVar) {
        RecyclerView.Adapter adapter;
        Intrinsics.checkNotNullParameter(recyclerView, "view");
        Intrinsics.checkNotNullParameter(fsVar, "div");
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        Intrinsics.checkNotNullParameter(tyVar, "path");
        boolean z = recyclerView instanceof C14325pw;
        C13111fs fsVar2 = null;
        C14325pw pwVar = z ? (C14325pw) recyclerView : null;
        C13111fs d = pwVar == null ? null : pwVar.mo69447d();
        if (d == null) {
            C13016ey eyVar = recyclerView instanceof C13016ey ? (C13016ey) recyclerView : null;
            if (eyVar != null) {
                fsVar2 = eyVar.mo66883d();
            }
        } else {
            fsVar2 = d;
        }
        if (Intrinsics.areEqual((Object) fsVar, (Object) fsVar2)) {
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            if (adapter2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.core.view2.divs.gallery.DivGalleryBinder.GalleryAdapter");
            } else if (!((C13233a) adapter2).mo67643a(this.f34092d) && (adapter = recyclerView.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
        } else {
            if (fsVar2 != null) {
                this.f34089a.mo70038a((View) recyclerView, (C14697tn) fsVar2, jmVar);
            }
            this.f34089a.mo70039a((View) recyclerView, (C14697tn) fsVar, (C14697tn) fsVar2, jmVar);
            j50 b = jmVar.mo66388b();
            l50 a = j31.m37658a(recyclerView);
            a.mo65871b();
            C13236d dVar = new C13236d(this, recyclerView, fsVar, jmVar, b);
            a.mo65870a(fsVar.f33662s.mo66923a(b, dVar));
            a.mo65870a(fsVar.f33659p.mo66923a(b, dVar));
            a.mo65870a(fsVar.f33665v.mo66923a(b, dVar));
            f50<Integer> f50 = fsVar.f33651h;
            if (f50 != null) {
                a.mo65870a(f50.mo66923a(b, dVar));
            }
            recyclerView.setRecycledViewPool(new m31(jmVar.mo68042m()));
            recyclerView.setScrollingTouchSlop(1);
            recyclerView.setClipToPadding(false);
            recyclerView.setOverScrollMode(2);
            List<C15177xl> list = fsVar.f33660q;
            C14773uo uoVar = this.f34091c.get();
            Intrinsics.checkNotNullExpressionValue(uoVar, "divBinder.get()");
            recyclerView.setAdapter(new C13233a(list, jmVar, uoVar, this.f34090b, tyVar));
            if (z) {
                ((C14325pw) recyclerView).setDiv(fsVar);
            } else if (recyclerView instanceof C13016ey) {
                ((C13016ey) recyclerView).setDiv(fsVar);
            }
            m36683a(recyclerView, fsVar, jmVar, b);
        }
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [com.yandex.div.core.view2.divs.gallery.DivLinearLayoutManager] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m36683a(androidx.recyclerview.widget.RecyclerView r17, com.yandex.mobile.ads.impl.C13111fs r18, com.yandex.mobile.ads.impl.C13513jm r19, com.yandex.mobile.ads.impl.j50 r20) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            android.content.res.Resources r4 = r17.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            com.yandex.mobile.ads.impl.f50<com.yandex.mobile.ads.impl.fs$l> r5 = r1.f33662s
            java.lang.Object r5 = r5.mo66924a((com.yandex.mobile.ads.impl.j50) r3)
            com.yandex.mobile.ads.impl.fs$l r5 = (com.yandex.mobile.ads.impl.C13111fs.C13127l) r5
            com.yandex.mobile.ads.impl.fs$l r6 = com.yandex.mobile.ads.impl.C13111fs.C13127l.HORIZONTAL
            r7 = 0
            r8 = 1
            if (r5 != r6) goto L_0x0020
            r6 = 0
            goto L_0x0021
        L_0x0020:
            r6 = 1
        L_0x0021:
            boolean r9 = r0 instanceof com.yandex.mobile.ads.impl.C13016ey
            if (r9 == 0) goto L_0x002b
            r9 = r0
            com.yandex.mobile.ads.impl.ey r9 = (com.yandex.mobile.ads.impl.C13016ey) r9
            r9.setOrientation(r6)
        L_0x002b:
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r9 = r1.f33651h
            if (r9 != 0) goto L_0x0030
            goto L_0x0038
        L_0x0030:
            java.lang.Object r9 = r9.mo66924a((com.yandex.mobile.ads.impl.j50) r3)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 != 0) goto L_0x003a
        L_0x0038:
            r9 = 1
            goto L_0x003e
        L_0x003a:
            int r9 = r9.intValue()
        L_0x003e:
            if (r9 != r8) goto L_0x006b
            r0.setClipChildren(r7)
            com.yandex.mobile.ads.impl.ux0 r7 = new com.yandex.mobile.ads.impl.ux0
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r9 = r1.f33659p
            java.lang.Object r9 = r9.mo66924a((com.yandex.mobile.ads.impl.j50) r3)
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.String r10 = "metrics"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r10)
            int r11 = com.yandex.mobile.ads.impl.C14175ob.m40330a((java.lang.Integer) r9, (android.util.DisplayMetrics) r4)
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r9 = r7
            r15 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r16.m36682a(r17)
            r0.addItemDecoration(r7)
            com.yandex.div.core.view2.divs.gallery.DivLinearLayoutManager r4 = new com.yandex.div.core.view2.divs.gallery.DivLinearLayoutManager
            r4.<init>(r2, r0, r1, r6)
            goto L_0x0076
        L_0x006b:
            r0.setClipChildren(r8)
            r16.m36682a(r17)
            com.yandex.div.core.view2.divs.gallery.DivGridLayoutManager r4 = new com.yandex.div.core.view2.divs.gallery.DivGridLayoutManager
            r4.<init>(r2, r0, r1, r6)
        L_0x0076:
            r0.setLayoutManager(r4)
            r17.clearOnScrollListeners()
            com.yandex.mobile.ads.impl.g10 r6 = r19.mo68036f()
            r7 = 0
            if (r6 != 0) goto L_0x0085
            goto L_0x00f3
        L_0x0085:
            java.lang.String r9 = r18.mo66144c()
            if (r9 != 0) goto L_0x0093
            int r9 = r18.hashCode()
            java.lang.String r9 = java.lang.String.valueOf(r9)
        L_0x0093:
            com.yandex.mobile.ads.impl.g10$a r10 = r6.mo67144a(r9)
            com.yandex.mobile.ads.impl.z80 r10 = (com.yandex.mobile.ads.impl.z80) r10
            if (r10 != 0) goto L_0x009d
            r11 = r7
            goto L_0x00a5
        L_0x009d:
            int r11 = r10.mo71181b()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
        L_0x00a5:
            if (r11 != 0) goto L_0x00b4
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r11 = r1.f33654k
            java.lang.Object r11 = r11.mo66924a((com.yandex.mobile.ads.impl.j50) r3)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            goto L_0x00b8
        L_0x00b4:
            int r11 = r11.intValue()
        L_0x00b8:
            if (r10 != 0) goto L_0x00bc
            r10 = r7
            goto L_0x00c4
        L_0x00bc:
            int r10 = r10.mo71180a()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
        L_0x00c4:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r12 = r17.getLayoutManager()
            boolean r13 = r12 instanceof com.yandex.mobile.ads.impl.C13440is
            if (r13 == 0) goto L_0x00cf
            com.yandex.mobile.ads.impl.is r12 = (com.yandex.mobile.ads.impl.C13440is) r12
            goto L_0x00d0
        L_0x00cf:
            r12 = r7
        L_0x00d0:
            if (r10 != 0) goto L_0x00db
            if (r11 != 0) goto L_0x00db
            if (r12 != 0) goto L_0x00d7
            goto L_0x00eb
        L_0x00d7:
            r12.mo60767a((int) r11)
            goto L_0x00eb
        L_0x00db:
            if (r10 == 0) goto L_0x00e8
            if (r12 != 0) goto L_0x00e0
            goto L_0x00eb
        L_0x00e0:
            int r10 = r10.intValue()
            r12.mo60768a((int) r11, (int) r10)
            goto L_0x00eb
        L_0x00e8:
            r0.scrollToPosition(r11)
        L_0x00eb:
            com.yandex.mobile.ads.impl.rg1 r10 = new com.yandex.mobile.ads.impl.rg1
            r10.<init>(r9, r6, r4)
            r0.addOnScrollListener(r10)
        L_0x00f3:
            com.yandex.mobile.ads.impl.gs$c r6 = new com.yandex.mobile.ads.impl.gs$c
            r6.<init>(r2, r0, r4, r1)
            r0.addOnScrollListener(r6)
            boolean r2 = r0 instanceof com.yandex.mobile.ads.impl.dx0
            if (r2 == 0) goto L_0x0127
            com.yandex.mobile.ads.impl.dx0 r0 = (com.yandex.mobile.ads.impl.dx0) r0
            com.yandex.mobile.ads.impl.f50<java.lang.Boolean> r1 = r1.f33665v
            java.lang.Object r1 = r1.mo66924a((com.yandex.mobile.ads.impl.j50) r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0124
            com.yandex.mobile.ads.impl.dy0 r7 = new com.yandex.mobile.ads.impl.dy0
            int r1 = r5.ordinal()
            if (r1 == 0) goto L_0x0121
            if (r1 != r8) goto L_0x011b
            r8 = 2
            goto L_0x0121
        L_0x011b:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0121:
            r7.<init>(r8)
        L_0x0124:
            r0.setOnInterceptTouchEventListener(r7)
        L_0x0127:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13232gs.m36683a(androidx.recyclerview.widget.RecyclerView, com.yandex.mobile.ads.impl.fs, com.yandex.mobile.ads.impl.jm, com.yandex.mobile.ads.impl.j50):void");
    }

    /* renamed from: a */
    private final void m36682a(RecyclerView recyclerView) {
        int itemDecorationCount = recyclerView.getItemDecorationCount() - 1;
        if (itemDecorationCount >= 0) {
            while (true) {
                int i = itemDecorationCount - 1;
                recyclerView.removeItemDecorationAt(itemDecorationCount);
                if (i >= 0) {
                    itemDecorationCount = i;
                } else {
                    return;
                }
            }
        }
    }
}
