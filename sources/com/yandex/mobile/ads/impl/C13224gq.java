package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.C13091fq;
import com.yandex.mobile.ads.impl.C13452ix;
import com.yandex.mobile.ads.impl.p70;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.gq */
public final class C13224gq {

    /* renamed from: a */
    private final C14624so f34067a;

    /* renamed from: b */
    private final Provider<a10> f34068b;

    /* renamed from: c */
    private final C13012ew f34069c;

    /* renamed from: d */
    private final C12660bw f34070d;

    /* renamed from: e */
    private final Provider<C14773uo> f34071e;

    /* renamed from: com.yandex.mobile.ads.impl.gq$a */
    static final class C13225a extends Lambda implements Function1<C13091fq.C13100i, Unit> {

        /* renamed from: b */
        final /* synthetic */ ViewGroup f34072b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13225a(ViewGroup viewGroup) {
            super(1);
            this.f34072b = viewGroup;
        }

        public Object invoke(Object obj) {
            C13091fq.C13100i iVar = (C13091fq.C13100i) obj;
            Intrinsics.checkNotNullParameter(iVar, "it");
            if (iVar == C13091fq.C13100i.VERTICAL) {
                ((C13140fv) this.f34072b).setOrientation(1);
            } else {
                ((C13140fv) this.f34072b).setOrientation(0);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gq$b */
    static final class C13226b extends Lambda implements Function1<C13215gn, Unit> {

        /* renamed from: b */
        final /* synthetic */ ViewGroup f34073b;

        /* renamed from: c */
        final /* synthetic */ C13091fq f34074c;

        /* renamed from: d */
        final /* synthetic */ j50 f34075d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13226b(ViewGroup viewGroup, C13091fq fqVar, j50 j50) {
            super(1);
            this.f34073b = viewGroup;
            this.f34074c = fqVar;
            this.f34075d = j50;
        }

        public Object invoke(Object obj) {
            C13215gn gnVar = (C13215gn) obj;
            Intrinsics.checkNotNullParameter(gnVar, "it");
            ((C13140fv) this.f34073b).setGravity(C14175ob.m40325a(gnVar, this.f34074c.f33541m.mo66924a(this.f34075d)));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gq$c */
    static final class C13227c extends Lambda implements Function1<C13332hn, Unit> {

        /* renamed from: b */
        final /* synthetic */ ViewGroup f34076b;

        /* renamed from: c */
        final /* synthetic */ C13091fq f34077c;

        /* renamed from: d */
        final /* synthetic */ j50 f34078d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13227c(ViewGroup viewGroup, C13091fq fqVar, j50 j50) {
            super(1);
            this.f34076b = viewGroup;
            this.f34077c = fqVar;
            this.f34078d = j50;
        }

        public Object invoke(Object obj) {
            C13332hn hnVar = (C13332hn) obj;
            Intrinsics.checkNotNullParameter(hnVar, "it");
            ((C13140fv) this.f34076b).setGravity(C14175ob.m40325a(this.f34077c.f33540l.mo66924a(this.f34078d), hnVar));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gq$d */
    static final class C13228d extends Lambda implements Function1<Object, Unit> {

        /* renamed from: b */
        final /* synthetic */ C14697tn f34079b;

        /* renamed from: c */
        final /* synthetic */ C13091fq f34080c;

        /* renamed from: d */
        final /* synthetic */ View f34081d;

        /* renamed from: e */
        final /* synthetic */ j50 f34082e;

        /* renamed from: f */
        final /* synthetic */ C13224gq f34083f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13228d(C14697tn tnVar, C13091fq fqVar, View view, j50 j50, C13224gq gqVar) {
            super(1);
            this.f34079b = tnVar;
            this.f34080c = fqVar;
            this.f34081d = view;
            this.f34082e = j50;
            this.f34083f = gqVar;
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "$noName_0");
            f50<C13215gn> i = this.f34079b.mo66151i();
            if (i == null) {
                i = this.f34080c.f33540l;
            }
            f50<C13332hn> b = this.f34079b.mo66143b();
            if (b == null) {
                b = this.f34080c.f33541m;
            }
            C14175ob.m40335a(this.f34081d, i.mo66924a(this.f34082e), b.mo66924a(this.f34082e));
            if (this.f34080c.f33550v.mo66924a(this.f34082e) == C13091fq.C13100i.VERTICAL && (this.f34079b.mo66148g() instanceof C13452ix.C13456d)) {
                C13224gq.m36672a(this.f34083f, this.f34081d, (C13250gv) this.f34079b.mo66148g().mo67899b(), this.f34082e);
                p70.C14260a.m40688b(p70.f38534f, this.f34081d, (Integer) null, 0, 2);
            } else if (this.f34080c.f33550v.mo66924a(this.f34082e) == C13091fq.C13100i.HORIZONTAL && (this.f34079b.mo66147f() instanceof C13452ix.C13456d)) {
                C13224gq.m36672a(this.f34083f, this.f34081d, (C13250gv) this.f34079b.mo66147f().mo67899b(), this.f34082e);
                p70.C14260a.m40688b(p70.f38534f, this.f34081d, 0, (Integer) null, 4);
            }
            return Unit.INSTANCE;
        }
    }

    @Inject
    public C13224gq(C14624so soVar, Provider<a10> provider, C13012ew ewVar, C12660bw bwVar, Provider<C14773uo> provider2) {
        Intrinsics.checkNotNullParameter(soVar, "baseBinder");
        Intrinsics.checkNotNullParameter(provider, "divViewCreator");
        Intrinsics.checkNotNullParameter(ewVar, "divPatchManager");
        Intrinsics.checkNotNullParameter(bwVar, "divPatchCache");
        Intrinsics.checkNotNullParameter(provider2, "divBinder");
        this.f34067a = soVar;
        this.f34068b = provider;
        this.f34069c = ewVar;
        this.f34070d = bwVar;
        this.f34071e = provider2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r1 = r1.mo66924a(r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m36672a(com.yandex.mobile.ads.impl.C13224gq r0, android.view.View r1, com.yandex.mobile.ads.impl.C13250gv r2, com.yandex.mobile.ads.impl.j50 r3) {
        /*
            r0.getClass()
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            boolean r1 = r0 instanceof android.widget.LinearLayout.LayoutParams
            if (r1 == 0) goto L_0x0024
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            com.yandex.mobile.ads.impl.f50<java.lang.Double> r1 = r2.f34157a
            if (r1 != 0) goto L_0x0012
            goto L_0x001a
        L_0x0012:
            java.lang.Object r1 = r1.mo66924a((com.yandex.mobile.ads.impl.j50) r3)
            java.lang.Double r1 = (java.lang.Double) r1
            if (r1 != 0) goto L_0x001d
        L_0x001a:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0022
        L_0x001d:
            double r1 = r1.doubleValue()
            float r1 = (float) r1
        L_0x0022:
            r0.weight = r1
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13224gq.m36672a(com.yandex.mobile.ads.impl.gq, android.view.View, com.yandex.mobile.ads.impl.gv, com.yandex.mobile.ads.impl.j50):void");
    }

    /* renamed from: a */
    public static final boolean m36673a(C13224gq gqVar, View view, C15177xl xlVar) {
        gqVar.getClass();
        C14697tn b = xlVar.mo70911b();
        if (!(view instanceof C14429qy) || !(b instanceof C13358hy)) {
            return false;
        }
        C13358hy d = ((C14429qy) view).mo69659d();
        return Intrinsics.areEqual((Object) d == null ? null : d.f34676i, (Object) ((C13358hy) b).f34676i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:86:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02c7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo67342a(android.view.ViewGroup r19, com.yandex.mobile.ads.impl.C13091fq r20, com.yandex.mobile.ads.impl.C13513jm r21, com.yandex.mobile.ads.impl.C14729ty r22) {
        /*
            r18 = this;
            r6 = r18
            r14 = r19
            r15 = r20
            r5 = r21
            r4 = r22
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "div"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "divView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r1 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            boolean r1 = r14 instanceof com.yandex.mobile.ads.impl.C13140fv
            r16 = 0
            if (r1 == 0) goto L_0x0028
            r2 = r14
            com.yandex.mobile.ads.impl.fv r2 = (com.yandex.mobile.ads.impl.C13140fv) r2
            goto L_0x002a
        L_0x0028:
            r2 = r16
        L_0x002a:
            if (r2 != 0) goto L_0x002f
            r2 = r16
            goto L_0x0033
        L_0x002f:
            com.yandex.mobile.ads.impl.fq r2 = r2.mo67087d()
        L_0x0033:
            if (r2 != 0) goto L_0x0048
            boolean r2 = r14 instanceof com.yandex.mobile.ads.impl.C12996es
            if (r2 == 0) goto L_0x003d
            r2 = r14
            com.yandex.mobile.ads.impl.es r2 = (com.yandex.mobile.ads.impl.C12996es) r2
            goto L_0x003f
        L_0x003d:
            r2 = r16
        L_0x003f:
            if (r2 != 0) goto L_0x0044
            r2 = r16
            goto L_0x0048
        L_0x0044:
            com.yandex.mobile.ads.impl.fq r2 = r2.mo66864d()
        L_0x0048:
            kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r2)
            com.yandex.mobile.ads.impl.j50 r3 = r21.mo66388b()
            if (r2 == 0) goto L_0x0056
            com.yandex.mobile.ads.impl.so r7 = r6.f34067a
            r7.mo70038a((android.view.View) r14, (com.yandex.mobile.ads.impl.C14697tn) r2, (com.yandex.mobile.ads.impl.C13513jm) r5)
        L_0x0056:
            com.yandex.mobile.ads.impl.l50 r13 = com.yandex.mobile.ads.impl.j31.m37658a(r19)
            r13.mo65871b()
            com.yandex.mobile.ads.impl.so r7 = r6.f34067a
            r7.mo70039a((android.view.View) r14, (com.yandex.mobile.ads.impl.C14697tn) r15, (com.yandex.mobile.ads.impl.C14697tn) r2, (com.yandex.mobile.ads.impl.C13513jm) r5)
            com.yandex.mobile.ads.impl.tm r9 = r15.f33530b
            java.util.List<com.yandex.mobile.ads.impl.tm> r10 = r15.f33532d
            java.util.List<com.yandex.mobile.ads.impl.tm> r11 = r15.f33548t
            java.util.List<com.yandex.mobile.ads.impl.tm> r12 = r15.f33542n
            com.yandex.mobile.ads.impl.in r8 = r15.f33531c
            r7 = r19
            r17 = r8
            r8 = r21
            r4 = r13
            r13 = r17
            com.yandex.mobile.ads.impl.C14175ob.m40337a(r7, r8, r9, r10, r11, r12, r13)
            com.yandex.mobile.ads.impl.hp r7 = com.yandex.mobile.ads.impl.C13338hp.f34501a
            boolean r7 = r7.mo67585a((com.yandex.mobile.ads.impl.C14697tn) r2, (com.yandex.mobile.ads.impl.C14697tn) r15, (com.yandex.mobile.ads.impl.j50) r3)
            r8 = 1
            r9 = 0
            if (r1 == 0) goto L_0x00d2
            com.yandex.mobile.ads.impl.f50<com.yandex.mobile.ads.impl.fq$i> r1 = r15.f33550v
            com.yandex.mobile.ads.impl.gq$a r10 = new com.yandex.mobile.ads.impl.gq$a
            r10.<init>(r14)
            com.yandex.mobile.ads.impl.wl r1 = r1.mo66925b(r3, r10)
            r4.mo65870a(r1)
            com.yandex.mobile.ads.impl.f50<com.yandex.mobile.ads.impl.gn> r1 = r15.f33540l
            com.yandex.mobile.ads.impl.gq$b r10 = new com.yandex.mobile.ads.impl.gq$b
            r10.<init>(r14, r15, r3)
            com.yandex.mobile.ads.impl.wl r1 = r1.mo66925b(r3, r10)
            r4.mo65870a(r1)
            com.yandex.mobile.ads.impl.f50<com.yandex.mobile.ads.impl.hn> r1 = r15.f33541m
            com.yandex.mobile.ads.impl.gq$c r10 = new com.yandex.mobile.ads.impl.gq$c
            r10.<init>(r14, r15, r3)
            com.yandex.mobile.ads.impl.wl r1 = r1.mo66925b(r3, r10)
            r4.mo65870a(r1)
            if (r2 == 0) goto L_0x00b7
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r15)
            if (r1 == 0) goto L_0x00b5
            goto L_0x00b7
        L_0x00b5:
            r1 = 0
            goto L_0x00b8
        L_0x00b7:
            r1 = 1
        L_0x00b8:
            com.yandex.mobile.ads.impl.f50<java.lang.Boolean> r10 = r15.f33536h
            java.lang.Object r10 = r10.mo66924a((com.yandex.mobile.ads.impl.j50) r3)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00ca
            if (r1 != 0) goto L_0x00ca
            r1 = 1
            goto L_0x00cb
        L_0x00ca:
            r1 = 0
        L_0x00cb:
            r10 = r14
            com.yandex.mobile.ads.impl.fv r10 = (com.yandex.mobile.ads.impl.C13140fv) r10
            r10.setDiv$div_release(r15)
            goto L_0x00dd
        L_0x00d2:
            boolean r1 = r14 instanceof com.yandex.mobile.ads.impl.C12996es
            if (r1 == 0) goto L_0x00dc
            r1 = r14
            com.yandex.mobile.ads.impl.es r1 = (com.yandex.mobile.ads.impl.C12996es) r1
            r1.setDiv$div_release(r15)
        L_0x00dc:
            r1 = 0
        L_0x00dd:
            kotlin.sequences.Sequence r10 = androidx.core.view.ViewGroupKt.getChildren(r19)
            java.util.Iterator r10 = r10.iterator()
        L_0x00e5:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00f5
            java.lang.Object r11 = r10.next()
            android.view.View r11 = (android.view.View) r11
            r5.mo68026a((android.view.View) r11)
            goto L_0x00e5
        L_0x00f5:
            int r10 = r19.getChildCount()
            if (r10 <= 0) goto L_0x01db
            if (r1 == 0) goto L_0x01db
            com.yandex.mobile.ads.impl.f50<com.yandex.mobile.ads.impl.fq$i> r0 = r15.f33550v
            r0.mo66924a((com.yandex.mobile.ads.impl.j50) r3)
            com.yandex.mobile.ads.impl.fq$i r0 = com.yandex.mobile.ads.impl.C13091fq.C13100i.VERTICAL
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List<com.yandex.mobile.ads.impl.xl> r7 = r15.f33547s
            int r7 = r7.size()
            r1.<init>(r7)
            kotlin.sequences.Sequence r7 = androidx.core.view.ViewGroupKt.getChildren(r19)
            kotlin.collections.CollectionsKt.addAll(r0, r7)
            java.util.List<com.yandex.mobile.ads.impl.xl> r7 = r15.f33547s
            java.util.Iterator r7 = r7.iterator()
        L_0x0121:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x016c
            java.lang.Object r10 = r7.next()
            com.yandex.mobile.ads.impl.xl r10 = (com.yandex.mobile.ads.impl.C15177xl) r10
            javax.inject.Provider<com.yandex.mobile.ads.impl.a10> r11 = r6.f34068b
            java.lang.Object r11 = r11.get()
            com.yandex.mobile.ads.impl.a10 r11 = (com.yandex.mobile.ads.impl.a10) r11
            com.yandex.mobile.ads.impl.j50 r12 = r21.mo66388b()
            android.view.View r11 = r11.mo65649b(r10, r12)
            com.yandex.mobile.ads.impl.hq r12 = new com.yandex.mobile.ads.impl.hq
            r12.<init>(r11, r6, r10)
            java.util.Iterator r10 = r0.iterator()
        L_0x0146:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x0160
            java.lang.Object r13 = r10.next()
            java.lang.Object r17 = r12.invoke(r13)
            java.lang.Boolean r17 = (java.lang.Boolean) r17
            boolean r17 = r17.booleanValue()
            if (r17 == 0) goto L_0x0146
            r10.remove()
            goto L_0x0162
        L_0x0160:
            r13 = r16
        L_0x0162:
            android.view.View r13 = (android.view.View) r13
            if (r13 != 0) goto L_0x0167
            goto L_0x0168
        L_0x0167:
            r11 = r13
        L_0x0168:
            r1.add(r11)
            goto L_0x0121
        L_0x016c:
            com.yandex.mobile.ads.impl.jj1 r7 = new com.yandex.mobile.ads.impl.jj1
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11 = 0
            r7.<init>(r10, r11)
            com.yandex.mobile.ads.impl.za1 r10 = new com.yandex.mobile.ads.impl.za1
            r10.<init>()
            androidx.transition.Transition r7 = r7.setInterpolator(r10)
            java.lang.String r10 = "VerticalTranslation().se…tor(SpringInterpolator())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r10)
            java.util.Iterator r10 = r1.iterator()
        L_0x0186:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0196
            java.lang.Object r11 = r10.next()
            android.view.View r11 = (android.view.View) r11
            r7.addTarget((android.view.View) r11)
            goto L_0x0186
        L_0x0196:
            java.util.Iterator r10 = r0.iterator()
        L_0x019a:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01aa
            java.lang.Object r11 = r10.next()
            android.view.View r11 = (android.view.View) r11
            r7.addTarget((android.view.View) r11)
            goto L_0x019a
        L_0x01aa:
            boolean r10 = r0.isEmpty()
            r8 = r8 ^ r10
            if (r8 == 0) goto L_0x01be
            com.yandex.mobile.ads.impl.df1 r8 = new com.yandex.mobile.ads.impl.df1
            com.yandex.mobile.ads.impl.iq r10 = new com.yandex.mobile.ads.impl.iq
            r10.<init>(r0, r5)
            r8.<init>(r10)
            r7.addListener(r8)
        L_0x01be:
            androidx.transition.TransitionManager.endTransitions(r19)
            androidx.transition.TransitionManager.beginDelayedTransition(r14, r7)
            r19.removeAllViews()
            java.util.Iterator r0 = r1.iterator()
        L_0x01cb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x022f
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            r14.addView(r1)
            goto L_0x01cb
        L_0x01db:
            if (r7 != 0) goto L_0x022f
            if (r2 == 0) goto L_0x022f
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.sequences.Sequence r0 = androidx.core.view.ViewGroupKt.getChildren(r19)
            java.util.Iterator r0 = r0.iterator()
        L_0x01ef:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0203
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            com.yandex.mobile.ads.impl.k31 r2 = r21.mo68042m()
            com.yandex.mobile.ads.impl.i10.m37254a(r2, r1)
            goto L_0x01ef
        L_0x0203:
            r19.removeAllViews()
            java.util.List<com.yandex.mobile.ads.impl.xl> r0 = r15.f33547s
            java.util.Iterator r0 = r0.iterator()
        L_0x020c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x022c
            java.lang.Object r1 = r0.next()
            com.yandex.mobile.ads.impl.xl r1 = (com.yandex.mobile.ads.impl.C15177xl) r1
            javax.inject.Provider<com.yandex.mobile.ads.impl.a10> r2 = r6.f34068b
            java.lang.Object r2 = r2.get()
            com.yandex.mobile.ads.impl.a10 r2 = (com.yandex.mobile.ads.impl.a10) r2
            com.yandex.mobile.ads.impl.j50 r7 = r21.mo66388b()
            android.view.View r1 = r2.mo65649b(r1, r7)
            r14.addView(r1)
            goto L_0x020c
        L_0x022c:
            r7 = r16
            goto L_0x0230
        L_0x022f:
            r7 = r2
        L_0x0230:
            java.util.List<com.yandex.mobile.ads.impl.xl> r0 = r15.f33547s
            int r0 = r0.size()
            r1 = 0
        L_0x0237:
            if (r1 >= r0) goto L_0x0263
            int r2 = r1 + 1
            java.util.List<com.yandex.mobile.ads.impl.xl> r8 = r15.f33547s
            java.lang.Object r8 = r8.get(r1)
            com.yandex.mobile.ads.impl.xl r8 = (com.yandex.mobile.ads.impl.C15177xl) r8
            com.yandex.mobile.ads.impl.tn r8 = r8.mo70911b()
            boolean r8 = com.yandex.mobile.ads.impl.C14175ob.m40348b(r8)
            if (r8 == 0) goto L_0x0261
            android.view.View r8 = r14.getChildAt(r1)
            java.lang.String r10 = "view.getChildAt(i)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r10)
            java.util.List<com.yandex.mobile.ads.impl.xl> r10 = r15.f33547s
            java.lang.Object r1 = r10.get(r1)
            com.yandex.mobile.ads.impl.xl r1 = (com.yandex.mobile.ads.impl.C15177xl) r1
            r5.mo68027a((android.view.View) r8, (com.yandex.mobile.ads.impl.C15177xl) r1)
        L_0x0261:
            r1 = r2
            goto L_0x0237
        L_0x0263:
            java.util.List<com.yandex.mobile.ads.impl.xl> r0 = r15.f33547s
            int r8 = r0.size()
        L_0x0269:
            if (r9 >= r8) goto L_0x02bf
            int r10 = r9 + 1
            java.util.List<com.yandex.mobile.ads.impl.xl> r0 = r15.f33547s
            java.lang.Object r0 = r0.get(r9)
            com.yandex.mobile.ads.impl.xl r0 = (com.yandex.mobile.ads.impl.C15177xl) r0
            com.yandex.mobile.ads.impl.tn r2 = r0.mo70911b()
            int r0 = r9 + 0
            android.view.View r11 = r14.getChildAt(r0)
            java.lang.String r0 = r2.mo66144c()
            if (r0 == 0) goto L_0x0293
            com.yandex.mobile.ads.impl.ew r1 = r6.f34069c
            r1.mo66878a(r5, r0)
            com.yandex.mobile.ads.impl.bw r1 = r6.f34070d
            com.yandex.mobile.ads.impl.cr r12 = r21.mo68037g()
            r1.mo66131a(r12, r0)
        L_0x0293:
            javax.inject.Provider<com.yandex.mobile.ads.impl.uo> r0 = r6.f34071e
            java.lang.Object r0 = r0.get()
            com.yandex.mobile.ads.impl.uo r0 = (com.yandex.mobile.ads.impl.C14773uo) r0
            java.lang.String r1 = "childView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
            java.util.List<com.yandex.mobile.ads.impl.xl> r1 = r15.f33547s
            java.lang.Object r1 = r1.get(r9)
            com.yandex.mobile.ads.impl.xl r1 = (com.yandex.mobile.ads.impl.C15177xl) r1
            r9 = r4
            r4 = r22
            r0.mo70383a(r11, r1, r5, r4)
            r0 = r18
            r1 = r20
            r12 = r3
            r3 = r11
            r4 = r12
            r11 = r5
            r5 = r9
            r0.m36671a(r1, r2, r3, r4, r5)
            r4 = r9
            r9 = r10
            r5 = r11
            r3 = r12
            goto L_0x0269
        L_0x02bf:
            r11 = r5
            java.util.List<com.yandex.mobile.ads.impl.xl> r0 = r15.f33547s
            if (r7 != 0) goto L_0x02c7
            r1 = r16
            goto L_0x02c9
        L_0x02c7:
            java.util.List<com.yandex.mobile.ads.impl.xl> r1 = r7.f33547s
        L_0x02c9:
            com.yandex.mobile.ads.impl.C14175ob.m40341a(r14, r0, r1, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13224gq.mo67342a(android.view.ViewGroup, com.yandex.mobile.ads.impl.fq, com.yandex.mobile.ads.impl.jm, com.yandex.mobile.ads.impl.ty):void");
    }

    /* renamed from: a */
    private final void m36671a(C13091fq fqVar, C14697tn tnVar, View view, j50 j50, l50 l50) {
        f50<Double> f50;
        C13228d dVar = new C13228d(tnVar, fqVar, view, j50, this);
        l50.mo65870a(fqVar.f33540l.mo66923a(j50, dVar));
        l50.mo65870a(fqVar.f33541m.mo66923a(j50, dVar));
        l50.mo65870a(fqVar.f33550v.mo66923a(j50, dVar));
        if (fqVar.f33550v.mo66924a(j50) == C13091fq.C13100i.VERTICAL && (tnVar.mo66148g() instanceof C13452ix.C13456d)) {
            f50<Double> f502 = ((C13250gv) tnVar.mo66148g().mo67899b()).f34157a;
            if (f502 != null) {
                l50.mo65870a(f502.mo66923a(j50, dVar));
            }
        } else if (fqVar.f33550v.mo66924a(j50) == C13091fq.C13100i.HORIZONTAL && (tnVar.mo66147f() instanceof C13452ix.C13456d) && (f50 = ((C13250gv) tnVar.mo66147f().mo67899b()).f34157a) != null) {
            l50.mo65870a(f50.mo66923a(j50, dVar));
        }
        dVar.invoke(view);
    }
}
