package com.yandex.mobile.ads.impl;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import com.yandex.mobile.ads.impl.C12667bz;
import com.yandex.mobile.ads.impl.C14065nb;
import com.yandex.mobile.ads.impl.C15177xl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.cz */
public final class C12843cz extends C14065nb<C13357hx, ViewGroup, C14687tm> {

    /* renamed from: o */
    private final boolean f32300o;

    /* renamed from: p */
    private final C13513jm f32301p;

    /* renamed from: q */
    private final a10 f32302q;

    /* renamed from: r */
    private final C14773uo f32303r;

    /* renamed from: s */
    private final C13461iz f32304s;

    /* renamed from: t */
    private C14729ty f32305t;

    /* renamed from: u */
    private final C12660bw f32306u;

    /* renamed from: v */
    private final Map<ViewGroup, qc1> f32307v = new LinkedHashMap();

    /* renamed from: w */
    private final xx0 f32308w;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12843cz(com.yandex.mobile.ads.impl.eo1 r16, android.view.View r17, com.yandex.mobile.ads.impl.C14065nb.C14076i r18, com.yandex.mobile.ads.impl.s90 r19, boolean r20, com.yandex.mobile.ads.impl.C13513jm r21, com.yandex.mobile.ads.impl.rc1 r22, com.yandex.mobile.ads.impl.a10 r23, com.yandex.mobile.ads.impl.C14773uo r24, com.yandex.mobile.ads.impl.C13461iz r25, com.yandex.mobile.ads.impl.C14729ty r26, com.yandex.mobile.ads.impl.C12660bw r27) {
        /*
            r15 = this;
            r8 = r15
            r9 = r21
            r10 = r23
            r11 = r24
            r12 = r25
            r13 = r26
            r14 = r27
            java.lang.String r0 = "viewPool"
            r1 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "view"
            r2 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "tabbedCardConfig"
            r3 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "heightCalculatorFactory"
            r4 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "div2View"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "textStyleProvider"
            r5 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "viewCreator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "divBinder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "divTabsEventManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "divPatchCache"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = r15
            r6 = r25
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = r20
            r8.f32300o = r0
            r8.f32301p = r9
            r8.f32302q = r10
            r8.f32303r = r11
            r8.f32304s = r12
            r8.f32305t = r13
            r8.f32306u = r14
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r8.f32307v = r0
            com.yandex.mobile.ads.impl.xx0 r0 = new com.yandex.mobile.ads.impl.xx0
            com.yandex.mobile.ads.impl.c71 r1 = r8.f37692c
            java.lang.String r2 = "mPager"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.<init>(r1)
            r8.f32308w = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C12843cz.<init>(com.yandex.mobile.ads.impl.eo1, android.view.View, com.yandex.mobile.ads.impl.nb$i, com.yandex.mobile.ads.impl.s90, boolean, com.yandex.mobile.ads.impl.jm, com.yandex.mobile.ads.impl.rc1, com.yandex.mobile.ads.impl.a10, com.yandex.mobile.ads.impl.uo, com.yandex.mobile.ads.impl.iz, com.yandex.mobile.ads.impl.ty, com.yandex.mobile.ads.impl.bw):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final List m34938a(List list) {
        Intrinsics.checkNotNullParameter(list, "$list");
        return list;
    }

    /* renamed from: a */
    public Object mo66369a(ViewGroup viewGroup, C14065nb.C14073g.C14074a aVar, int i) {
        C13357hx hxVar = (C13357hx) aVar;
        Intrinsics.checkNotNullParameter(viewGroup, "tabView");
        Intrinsics.checkNotNullParameter(hxVar, "tab");
        C13513jm jmVar = this.f32301p;
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        for (View a : ViewGroupKt.getChildren(viewGroup)) {
            i10.m37254a(jmVar.mo68042m(), a);
        }
        viewGroup.removeAllViews();
        C15177xl xlVar = hxVar.mo67701d().f31703a;
        View b = this.f32302q.mo65649b(xlVar, this.f32301p.mo66388b());
        b.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f32303r.mo70383a(b, xlVar, this.f32301p, this.f32305t);
        this.f32307v.put(viewGroup, new qc1(i, xlVar, b));
        viewGroup.addView(b);
        return viewGroup;
    }

    /* renamed from: c */
    public final C13461iz mo66373c() {
        return this.f32304s;
    }

    /* renamed from: d */
    public final xx0 mo66374d() {
        return this.f32308w;
    }

    /* renamed from: e */
    public final boolean mo66375e() {
        return this.f32300o;
    }

    /* renamed from: f */
    public final void mo66376f() {
        for (Map.Entry next : this.f32307v.entrySet()) {
            qc1 qc1 = (qc1) next.getValue();
            this.f32303r.mo70383a(qc1.mo69582b(), qc1.mo69581a(), this.f32301p, this.f32305t);
            ((ViewGroup) next.getKey()).requestLayout();
        }
    }

    /* renamed from: a */
    public void mo66372a(Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        Intrinsics.checkNotNullParameter(viewGroup, "tabView");
        this.f32307v.remove(viewGroup);
        C13513jm jmVar = this.f32301p;
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        for (View a : ViewGroupKt.getChildren(viewGroup)) {
            i10.m37254a(jmVar.mo68042m(), a);
        }
        viewGroup.removeAllViews();
    }

    /* renamed from: a */
    public final void mo66371a(C14729ty tyVar) {
        Intrinsics.checkNotNullParameter(tyVar, "<set-?>");
        this.f32305t = tyVar;
    }

    /* renamed from: a */
    public final void mo66370a(C14065nb.C14073g<C13357hx> gVar, int i) {
        Intrinsics.checkNotNullParameter(gVar, "data");
        mo68948a(gVar, this.f32301p.mo66388b(), j31.m37658a(this.f32301p));
        this.f32307v.clear();
        this.f37692c.setCurrentItem(i, true);
    }

    /* renamed from: a */
    public final C12667bz mo66368a(j50 j50, C12667bz bzVar) {
        Intrinsics.checkNotNullParameter(j50, "resolver");
        Intrinsics.checkNotNullParameter(bzVar, "div");
        C13253gw a = this.f32306u.mo66130a(this.f32301p.mo68037g());
        if (a == null) {
            return null;
        }
        C12667bz bzVar2 = (C12667bz) new C12457aw(a).mo65900b(new C15177xl.C15191n(bzVar), j50).get(0).mo70911b();
        DisplayMetrics displayMetrics = this.f32301p.getResources().getDisplayMetrics();
        List<C12667bz.C12674g> list = bzVar2.f31682n;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (C12667bz.C12674g hxVar : list) {
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "displayMetrics");
            arrayList.add(new C13357hx(hxVar, displayMetrics, j50));
        }
        mo66370a((C14065nb.C14073g<C13357hx>) new C14065nb.C14073g(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            /* renamed from: a */
            public final List mo65499a() {
                return C12843cz.m34938a(this.f$0);
            }
        }, this.f37692c.getCurrentItem());
        return bzVar2;
    }
}
