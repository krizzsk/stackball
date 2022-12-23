package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.iy */
public final class C13458iy {

    /* renamed from: a */
    private final C14624so f35066a;

    /* renamed from: b */
    private final a10 f35067b;

    /* renamed from: c */
    private final Provider<C14773uo> f35068c;

    /* renamed from: d */
    private final C14237oy f35069d;

    /* renamed from: e */
    private final hd1 f35070e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C15056wm f35071f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C12903dm f35072g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final s10 f35073h;

    /* renamed from: com.yandex.mobile.ads.impl.iy$a */
    public static final class C13459a implements View.OnLayoutChangeListener {

        /* renamed from: b */
        final /* synthetic */ C13458iy f35074b;

        /* renamed from: c */
        final /* synthetic */ C13513jm f35075c;

        /* renamed from: d */
        final /* synthetic */ View f35076d;

        /* renamed from: e */
        final /* synthetic */ C15177xl f35077e;

        public C13459a(C13458iy iyVar, C13513jm jmVar, View view, C15177xl xlVar) {
            this.f35074b = iyVar;
            this.f35075c = jmVar;
            this.f35076d = view;
            this.f35077e = xlVar;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.removeOnLayoutChangeListener(this);
            s10.m41777a(this.f35074b.f35073h, this.f35075c, this.f35076d, this.f35077e, (List) null, 8, (Object) null);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.iy$b */
    static final class C13460b extends Lambda implements Function0<Unit> {

        /* renamed from: b */
        final /* synthetic */ C13513jm f35078b;

        /* renamed from: c */
        final /* synthetic */ List<C14687tm> f35079c;

        /* renamed from: d */
        final /* synthetic */ C13458iy f35080d;

        /* renamed from: e */
        final /* synthetic */ C14429qy f35081e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13460b(C13513jm jmVar, List<? extends C14687tm> list, C13458iy iyVar, C14429qy qyVar) {
            super(0);
            this.f35078b = jmVar;
            this.f35079c = list;
            this.f35080d = iyVar;
            this.f35081e = qyVar;
        }

        public Object invoke() {
            C13513jm jmVar = this.f35078b;
            jmVar.mo68030a((Function0<Unit>) new C13599jy(this.f35079c, this.f35080d, jmVar, this.f35081e));
            return Unit.INSTANCE;
        }
    }

    @Inject
    public C13458iy(C14624so soVar, a10 a10, Provider<C14773uo> provider, C14237oy oyVar, hd1 hd1, C15056wm wmVar, C12903dm dmVar, s10 s10) {
        Intrinsics.checkNotNullParameter(soVar, "baseBinder");
        Intrinsics.checkNotNullParameter(a10, "viewCreator");
        Intrinsics.checkNotNullParameter(provider, "viewBinder");
        Intrinsics.checkNotNullParameter(oyVar, "divStateCache");
        Intrinsics.checkNotNullParameter(hd1, "temporaryStateCache");
        Intrinsics.checkNotNullParameter(wmVar, "divActionBinder");
        Intrinsics.checkNotNullParameter(dmVar, "div2Logger");
        Intrinsics.checkNotNullParameter(s10, "divVisibilityActionTracker");
        this.f35066a = soVar;
        this.f35067b = a10;
        this.f35068c = provider;
        this.f35069d = oyVar;
        this.f35070e = hd1;
        this.f35071f = wmVar;
        this.f35072g = dmVar;
        this.f35073h = s10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013c, code lost:
        if (((r6 == null || (r5 = r6.mo70911b()) == null || com.yandex.mobile.ads.impl.t00.m42198a(r5) != r2) ? false : true) != false) goto L_0x013e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02c3 A[LOOP:4: B:114:0x02bd->B:116:0x02c3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02db A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x015e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo67903a(com.yandex.mobile.ads.impl.C14429qy r25, com.yandex.mobile.ads.impl.C13358hy r26, com.yandex.mobile.ads.impl.C13513jm r27, com.yandex.mobile.ads.impl.C14729ty r28) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r9 = r27
            r3 = r28
            java.lang.String r4 = "layout"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "div"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.String r4 = "divView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r4)
            java.lang.String r5 = "divStatePath"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r5)
            com.yandex.mobile.ads.impl.hy r5 = r25.mo69659d()
            com.yandex.mobile.ads.impl.xl r6 = r25.mo69657c()
            r25.setDivState$div_release(r26)
            if (r5 == 0) goto L_0x0030
            com.yandex.mobile.ads.impl.so r7 = r0.f35066a
            r7.mo70038a((android.view.View) r1, (com.yandex.mobile.ads.impl.C14697tn) r5, (com.yandex.mobile.ads.impl.C13513jm) r9)
        L_0x0030:
            com.yandex.mobile.ads.impl.so r7 = r0.f35066a
            r7.mo70039a((android.view.View) r1, (com.yandex.mobile.ads.impl.C14697tn) r2, (com.yandex.mobile.ads.impl.C14697tn) r5, (com.yandex.mobile.ads.impl.C13513jm) r9)
            com.yandex.mobile.ads.impl.j50 r7 = r27.mo66388b()
            com.yandex.mobile.ads.impl.cr r8 = r27.mo68039i()
            java.lang.String r8 = r8.mo66346a()
            java.lang.String r10 = "divView.divTag.id"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r3)
            r11 = 47
            r10.append(r11)
            java.lang.String r11 = r2.f34676i
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.yandex.mobile.ads.impl.hd1 r11 = r0.f35070e
            java.lang.String r11 = r11.mo67528a(r8, r10)
            if (r11 != 0) goto L_0x006a
            com.yandex.mobile.ads.impl.oy r11 = r0.f35069d
            java.lang.String r11 = r11.mo65740b(r8, r10)
        L_0x006a:
            java.util.List<com.yandex.mobile.ads.impl.hy$g> r8 = r2.f34685r
            java.util.Iterator r8 = r8.iterator()
        L_0x0070:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x008a
            java.lang.Object r10 = r8.next()
            r13 = r10
            com.yandex.mobile.ads.impl.hy$g r13 = (com.yandex.mobile.ads.impl.C13358hy.C13365g) r13
            java.lang.String r13 = r13.f34705d
            java.lang.String r14 = r25.mo69663f()
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r14)
            if (r13 == 0) goto L_0x0070
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            com.yandex.mobile.ads.impl.hy$g r10 = (com.yandex.mobile.ads.impl.C13358hy.C13365g) r10
            if (r10 != 0) goto L_0x0093
            com.yandex.mobile.ads.impl.hy$g r10 = com.yandex.mobile.ads.impl.t00.m42196a(r2, r7)
        L_0x0093:
            java.util.List<com.yandex.mobile.ads.impl.hy$g> r8 = r2.f34685r
            java.util.Iterator r8 = r8.iterator()
        L_0x0099:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x00af
            java.lang.Object r13 = r8.next()
            r14 = r13
            com.yandex.mobile.ads.impl.hy$g r14 = (com.yandex.mobile.ads.impl.C13358hy.C13365g) r14
            java.lang.String r14 = r14.f34705d
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r11)
            if (r14 == 0) goto L_0x0099
            goto L_0x00b0
        L_0x00af:
            r13 = 0
        L_0x00b0:
            com.yandex.mobile.ads.impl.hy$g r13 = (com.yandex.mobile.ads.impl.C13358hy.C13365g) r13
            if (r13 != 0) goto L_0x00b8
            com.yandex.mobile.ads.impl.hy$g r13 = com.yandex.mobile.ads.impl.t00.m42196a(r2, r7)
        L_0x00b8:
            java.lang.String r8 = r2.f34676i
            java.lang.String r11 = r13.f34705d
            com.yandex.mobile.ads.impl.ty r11 = r3.mo70244a(r8, r11)
            com.yandex.mobile.ads.impl.xl r14 = r13.f34704c
            if (r14 != 0) goto L_0x00c6
            r15 = 0
            goto L_0x00cb
        L_0x00c6:
            com.yandex.mobile.ads.impl.tn r3 = r14.mo70911b()
            r15 = r3
        L_0x00cb:
            int r3 = r25.getChildCount()
            r8 = 0
            if (r3 <= 0) goto L_0x00d7
            android.view.View r3 = r1.getChildAt(r8)
            goto L_0x00d8
        L_0x00d7:
            r3 = 0
        L_0x00d8:
            java.lang.String r12 = r25.mo69663f()
            java.lang.String r8 = r13.f34705d
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r8)
            java.lang.String r12 = "<this>"
            r17 = r5
            if (r8 != 0) goto L_0x02f6
            if (r14 == 0) goto L_0x00fd
            com.yandex.mobile.ads.impl.a10 r8 = r0.f35067b
            android.view.View r7 = r8.mo65649b(r14, r7)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r19 = r6
            r5 = -2
            r6 = -1
            r8.<init>(r6, r5)
            r7.setLayoutParams(r8)
            goto L_0x0100
        L_0x00fd:
            r19 = r6
            r7 = 0
        L_0x0100:
            if (r10 != 0) goto L_0x0104
            r5 = 0
            goto L_0x0106
        L_0x0104:
            com.yandex.mobile.ads.impl.xl r5 = r10.f34704c
        L_0x0106:
            com.yandex.mobile.ads.impl.xl r6 = r13.f34704c
            com.yandex.mobile.ads.impl.j50 r8 = r27.mo66388b()
            boolean r16 = com.yandex.mobile.ads.impl.p00.m40628a((com.yandex.mobile.ads.impl.C13358hy) r2, (com.yandex.mobile.ads.impl.j50) r8)
            if (r16 == 0) goto L_0x0197
            if (r5 != 0) goto L_0x0116
        L_0x0114:
            r2 = 1
            goto L_0x0126
        L_0x0116:
            com.yandex.mobile.ads.impl.tn r5 = r5.mo70911b()
            if (r5 != 0) goto L_0x011d
            goto L_0x0114
        L_0x011d:
            boolean r5 = com.yandex.mobile.ads.impl.t00.m42198a((com.yandex.mobile.ads.impl.C14697tn) r5)
            r2 = 1
            if (r5 != r2) goto L_0x0126
            r5 = 1
            goto L_0x0127
        L_0x0126:
            r5 = 0
        L_0x0127:
            if (r5 != 0) goto L_0x013e
            if (r6 != 0) goto L_0x012c
            goto L_0x013b
        L_0x012c:
            com.yandex.mobile.ads.impl.tn r5 = r6.mo70911b()
            if (r5 != 0) goto L_0x0133
            goto L_0x013b
        L_0x0133:
            boolean r5 = com.yandex.mobile.ads.impl.t00.m42198a((com.yandex.mobile.ads.impl.C14697tn) r5)
            if (r5 != r2) goto L_0x013b
            r2 = 1
            goto L_0x013c
        L_0x013b:
            r2 = 0
        L_0x013c:
            if (r2 == 0) goto L_0x0197
        L_0x013e:
            com.yandex.mobile.ads.impl.mm r2 = r27.mo68043o()
            com.yandex.mobile.ads.impl.m00 r2 = r2.mo66602e()
            com.yandex.mobile.ads.impl.mm r5 = r27.mo68043o()
            com.yandex.mobile.ads.impl.xy r5 = r5.mo66599b()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r10)
            if (r6 == 0) goto L_0x015e
            r21 = r11
            r22 = r13
            r23 = r14
            r20 = r15
            goto L_0x02af
        L_0x015e:
            if (r10 != 0) goto L_0x0161
            goto L_0x0165
        L_0x0161:
            com.yandex.mobile.ads.impl.xl r6 = r10.f34704c
            if (r6 != 0) goto L_0x0169
        L_0x0165:
            r20 = r15
            r6 = 0
            goto L_0x0175
        L_0x0169:
            com.yandex.mobile.ads.impl.q00 r6 = com.yandex.mobile.ads.impl.r00.m41463d(r6)
            r20 = r15
            com.yandex.mobile.ads.impl.ky r15 = com.yandex.mobile.ads.impl.C13797ky.f36448b
            com.yandex.mobile.ads.impl.q00 r6 = r6.mo69464a((kotlin.jvm.functions.Function1<? super com.yandex.mobile.ads.impl.C15177xl, java.lang.Boolean>) r15)
        L_0x0175:
            com.yandex.mobile.ads.impl.xl r15 = r13.f34704c
            if (r15 != 0) goto L_0x017d
            r21 = r11
            r11 = 0
            goto L_0x0189
        L_0x017d:
            com.yandex.mobile.ads.impl.q00 r15 = com.yandex.mobile.ads.impl.r00.m41463d(r15)
            r21 = r11
            com.yandex.mobile.ads.impl.ly r11 = com.yandex.mobile.ads.impl.C13914ly.f36968b
            com.yandex.mobile.ads.impl.q00 r11 = r15.mo69464a((kotlin.jvm.functions.Function1<? super com.yandex.mobile.ads.impl.C15177xl, java.lang.Boolean>) r11)
        L_0x0189:
            androidx.transition.TransitionSet r2 = r2.mo68550a((kotlin.sequences.Sequence<? extends com.yandex.mobile.ads.impl.C15177xl>) r6, (kotlin.sequences.Sequence<? extends com.yandex.mobile.ads.impl.C15177xl>) r11, (com.yandex.mobile.ads.impl.j50) r8)
            r5.mo70949a(r2)
            androidx.transition.TransitionManager.endTransitions(r25)
            androidx.transition.TransitionManager.beginDelayedTransition(r1, r2)
            goto L_0x01ac
        L_0x0197:
            r21 = r11
            r20 = r15
            com.yandex.mobile.ads.impl.j50 r2 = r27.mo66388b()
            com.yandex.mobile.ads.impl.in r5 = r13.f34702a
            if (r10 != 0) goto L_0x01a5
            r6 = 0
            goto L_0x01a7
        L_0x01a5:
            com.yandex.mobile.ads.impl.in r6 = r10.f34703b
        L_0x01a7:
            if (r5 != 0) goto L_0x01b2
            if (r6 == 0) goto L_0x01ac
            goto L_0x01b2
        L_0x01ac:
            r22 = r13
            r23 = r14
            goto L_0x02af
        L_0x01b2:
            androidx.transition.TransitionSet r8 = new androidx.transition.TransitionSet
            r8.<init>()
            if (r5 == 0) goto L_0x0232
            if (r7 == 0) goto L_0x0232
            com.yandex.mobile.ads.impl.f50<com.yandex.mobile.ads.impl.in$e> r11 = r5.f34937e
            java.lang.Object r11 = r11.mo66924a((com.yandex.mobile.ads.impl.j50) r2)
            com.yandex.mobile.ads.impl.in$e r15 = com.yandex.mobile.ads.impl.C13420in.C13425e.SET
            if (r11 == r15) goto L_0x01ca
            java.util.List r5 = kotlin.collections.CollectionsKt.listOf(r5)
            goto L_0x01d2
        L_0x01ca:
            java.util.List<com.yandex.mobile.ads.impl.in> r5 = r5.f34936d
            if (r5 != 0) goto L_0x01d2
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
        L_0x01d2:
            java.util.Iterator r5 = r5.iterator()
        L_0x01d6:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L_0x0232
            java.lang.Object r11 = r5.next()
            com.yandex.mobile.ads.impl.in r11 = (com.yandex.mobile.ads.impl.C13420in) r11
            r16 = r5
            r15 = 1
            androidx.transition.Transition r5 = com.yandex.mobile.ads.impl.C14035my.m39761a(r11, r15, r2)
            if (r5 != 0) goto L_0x01ee
            r5 = r16
            goto L_0x01d6
        L_0x01ee:
            androidx.transition.Transition r5 = r5.addTarget((android.view.View) r7)
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r15 = r11.f34933a
            java.lang.Object r15 = r15.mo66924a((com.yandex.mobile.ads.impl.j50) r2)
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            r22 = r13
            r23 = r14
            long r13 = (long) r15
            androidx.transition.Transition r5 = r5.setDuration(r13)
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r13 = r11.f34938f
            java.lang.Object r13 = r13.mo66924a((com.yandex.mobile.ads.impl.j50) r2)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            long r13 = (long) r13
            androidx.transition.Transition r5 = r5.setStartDelay(r13)
            com.yandex.mobile.ads.impl.f50<com.yandex.mobile.ads.impl.jn> r11 = r11.f34935c
            java.lang.Object r11 = r11.mo66924a((com.yandex.mobile.ads.impl.j50) r2)
            com.yandex.mobile.ads.impl.jn r11 = (com.yandex.mobile.ads.impl.C13525jn) r11
            android.view.animation.Interpolator r11 = com.yandex.mobile.ads.impl.t00.m42195a((com.yandex.mobile.ads.impl.C13525jn) r11)
            androidx.transition.Transition r5 = r5.setInterpolator(r11)
            r8.addTransition(r5)
            r5 = r16
            r13 = r22
            r14 = r23
            goto L_0x01d6
        L_0x0232:
            r22 = r13
            r23 = r14
            if (r6 == 0) goto L_0x02a3
            if (r3 == 0) goto L_0x02a3
            com.yandex.mobile.ads.impl.f50<com.yandex.mobile.ads.impl.in$e> r5 = r6.f34937e
            java.lang.Object r5 = r5.mo66924a((com.yandex.mobile.ads.impl.j50) r2)
            com.yandex.mobile.ads.impl.in$e r11 = com.yandex.mobile.ads.impl.C13420in.C13425e.SET
            if (r5 == r11) goto L_0x0249
            java.util.List r5 = kotlin.collections.CollectionsKt.listOf(r6)
            goto L_0x0251
        L_0x0249:
            java.util.List<com.yandex.mobile.ads.impl.in> r5 = r6.f34936d
            if (r5 != 0) goto L_0x0251
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0251:
            java.util.Iterator r5 = r5.iterator()
        L_0x0255:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x02a3
            java.lang.Object r6 = r5.next()
            com.yandex.mobile.ads.impl.in r6 = (com.yandex.mobile.ads.impl.C13420in) r6
            r11 = 0
            androidx.transition.Transition r13 = com.yandex.mobile.ads.impl.C14035my.m39761a(r6, r11, r2)
            if (r13 != 0) goto L_0x0269
            goto L_0x0255
        L_0x0269:
            androidx.transition.Transition r11 = r13.addTarget((android.view.View) r3)
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r13 = r6.f34933a
            java.lang.Object r13 = r13.mo66924a((com.yandex.mobile.ads.impl.j50) r2)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            long r13 = (long) r13
            androidx.transition.Transition r11 = r11.setDuration(r13)
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r13 = r6.f34938f
            java.lang.Object r13 = r13.mo66924a((com.yandex.mobile.ads.impl.j50) r2)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            long r13 = (long) r13
            androidx.transition.Transition r11 = r11.setStartDelay(r13)
            com.yandex.mobile.ads.impl.f50<com.yandex.mobile.ads.impl.jn> r6 = r6.f34935c
            java.lang.Object r6 = r6.mo66924a((com.yandex.mobile.ads.impl.j50) r2)
            com.yandex.mobile.ads.impl.jn r6 = (com.yandex.mobile.ads.impl.C13525jn) r6
            android.view.animation.Interpolator r6 = com.yandex.mobile.ads.impl.t00.m42195a((com.yandex.mobile.ads.impl.C13525jn) r6)
            androidx.transition.Transition r6 = r11.setInterpolator(r6)
            r8.addTransition(r6)
            goto L_0x0255
        L_0x02a3:
            if (r3 != 0) goto L_0x02a6
            goto L_0x02a9
        L_0x02a6:
            r3.clearAnimation()
        L_0x02a9:
            androidx.transition.TransitionManager.endTransitions(r25)
            androidx.transition.TransitionManager.beginDelayedTransition(r1, r8)
        L_0x02af:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r12)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r4)
            kotlin.sequences.Sequence r2 = androidx.core.view.ViewGroupKt.getChildren(r25)
            java.util.Iterator r2 = r2.iterator()
        L_0x02bd:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x02d1
            java.lang.Object r4 = r2.next()
            android.view.View r4 = (android.view.View) r4
            com.yandex.mobile.ads.impl.k31 r5 = r27.mo68042m()
            com.yandex.mobile.ads.impl.i10.m37254a(r5, r4)
            goto L_0x02bd
        L_0x02d1:
            r25.removeAllViews()
            if (r7 == 0) goto L_0x02d9
            r1.addView(r7)
        L_0x02d9:
            if (r7 == 0) goto L_0x02ed
            if (r23 == 0) goto L_0x02ed
            javax.inject.Provider<com.yandex.mobile.ads.impl.uo> r2 = r0.f35068c
            java.lang.Object r2 = r2.get()
            com.yandex.mobile.ads.impl.uo r2 = (com.yandex.mobile.ads.impl.C14773uo) r2
            r11 = r21
            r13 = r23
            r2.mo70383a(r7, r13, r9, r11)
            goto L_0x02f1
        L_0x02ed:
            r11 = r21
            r13 = r23
        L_0x02f1:
            r12 = r7
            r5 = r19
            goto L_0x0388
        L_0x02f6:
            r19 = r6
            r22 = r13
            r13 = r14
            r20 = r15
            if (r20 == 0) goto L_0x0360
            if (r3 == 0) goto L_0x030e
            com.yandex.mobile.ads.impl.hp r2 = com.yandex.mobile.ads.impl.C13338hp.f34501a
            r5 = r19
            boolean r2 = r2.mo67586a((com.yandex.mobile.ads.impl.C15177xl) r5, (com.yandex.mobile.ads.impl.C15177xl) r13, (com.yandex.mobile.ads.impl.j50) r7)
            if (r2 == 0) goto L_0x0310
            r18 = 1
            goto L_0x0312
        L_0x030e:
            r5 = r19
        L_0x0310:
            r18 = 0
        L_0x0312:
            if (r18 == 0) goto L_0x0316
            r7 = r3
            goto L_0x0327
        L_0x0316:
            com.yandex.mobile.ads.impl.a10 r2 = r0.f35067b
            android.view.View r2 = r2.mo65649b(r13, r7)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r7 = -2
            r8 = -1
            r6.<init>(r8, r7)
            r2.setLayoutParams(r6)
            r7 = r2
        L_0x0327:
            if (r18 != 0) goto L_0x0351
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r12)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r4)
            kotlin.sequences.Sequence r2 = androidx.core.view.ViewGroupKt.getChildren(r25)
            java.util.Iterator r2 = r2.iterator()
        L_0x0337:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x034b
            java.lang.Object r4 = r2.next()
            android.view.View r4 = (android.view.View) r4
            com.yandex.mobile.ads.impl.k31 r6 = r27.mo68042m()
            com.yandex.mobile.ads.impl.i10.m37254a(r6, r4)
            goto L_0x0337
        L_0x034b:
            r25.removeAllViews()
            r1.addView(r7)
        L_0x0351:
            if (r7 == 0) goto L_0x035e
            javax.inject.Provider<com.yandex.mobile.ads.impl.uo> r2 = r0.f35068c
            java.lang.Object r2 = r2.get()
            com.yandex.mobile.ads.impl.uo r2 = (com.yandex.mobile.ads.impl.C14773uo) r2
            r2.mo70383a(r7, r13, r9, r11)
        L_0x035e:
            r12 = r7
            goto L_0x0388
        L_0x0360:
            r5 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r12)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r4)
            kotlin.sequences.Sequence r2 = androidx.core.view.ViewGroupKt.getChildren(r25)
            java.util.Iterator r2 = r2.iterator()
        L_0x0370:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0384
            java.lang.Object r4 = r2.next()
            android.view.View r4 = (android.view.View) r4
            com.yandex.mobile.ads.impl.k31 r6 = r27.mo68042m()
            com.yandex.mobile.ads.impl.i10.m37254a(r6, r4)
            goto L_0x0370
        L_0x0384:
            r25.removeAllViews()
            r12 = 0
        L_0x0388:
            if (r3 == 0) goto L_0x03bb
            android.view.animation.AnimationSet r2 = new android.view.animation.AnimationSet
            r4 = 0
            r2.<init>(r4)
            r3.startAnimation(r2)
            r2 = r26
            r4 = r17
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r2)
            r14 = r22
            if (r2 == 0) goto L_0x03a5
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r10)
            if (r2 != 0) goto L_0x03bd
        L_0x03a5:
            r9.mo68026a((android.view.View) r3)
            if (r5 == 0) goto L_0x03bd
            com.yandex.mobile.ads.impl.s10 r2 = r0.f35073h
            r4 = 0
            r6 = 0
            r7 = 8
            r8 = 0
            r10 = r3
            r3 = r27
            com.yandex.mobile.ads.impl.s10.m41777a(r2, r3, r4, r5, r6, r7, r8)
            r0.m37604a(r10, r9)
            goto L_0x03bd
        L_0x03bb:
            r14 = r22
        L_0x03bd:
            if (r12 == 0) goto L_0x03d8
            if (r20 == 0) goto L_0x03d8
            com.yandex.mobile.ads.impl.m10 r2 = r20.mo66160r()
            if (r2 != 0) goto L_0x03cd
            java.util.List r2 = r20.mo66162t()
            if (r2 == 0) goto L_0x03d8
        L_0x03cd:
            r9.mo68027a((android.view.View) r12, (com.yandex.mobile.ads.impl.C15177xl) r13)
            com.yandex.mobile.ads.impl.iy$a r2 = new com.yandex.mobile.ads.impl.iy$a
            r2.<init>(r0, r9, r12, r13)
            r12.addOnLayoutChangeListener(r2)
        L_0x03d8:
            java.util.List<com.yandex.mobile.ads.impl.tm> r2 = r14.f34706e
            if (r2 == 0) goto L_0x03e5
            com.yandex.mobile.ads.impl.iy$b r3 = new com.yandex.mobile.ads.impl.iy$b
            r3.<init>(r9, r2, r0, r1)
            r1.setSwipeOutCallback(r3)
            goto L_0x03e9
        L_0x03e5:
            r2 = 0
            r1.setSwipeOutCallback(r2)
        L_0x03e9:
            r1.setActiveStateDiv$div_release(r13)
            r1.setPath(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13458iy.mo67903a(com.yandex.mobile.ads.impl.qy, com.yandex.mobile.ads.impl.hy, com.yandex.mobile.ads.impl.jm, com.yandex.mobile.ads.impl.ty):void");
    }

    /* renamed from: a */
    private final void m37604a(View view, C13513jm jmVar) {
        if (view instanceof ViewGroup) {
            for (View next : ViewGroupKt.getChildren((ViewGroup) view)) {
                C15177xl a = jmVar.mo68026a(next);
                if (a != null) {
                    s10.m41777a(this.f35073h, jmVar, (View) null, a, (List) null, 8, (Object) null);
                }
                m37604a(next, jmVar);
            }
        }
    }
}
