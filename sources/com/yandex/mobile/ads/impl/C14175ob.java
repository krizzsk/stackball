package com.yandex.mobile.ads.impl;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.yandex.mobile.ads.impl.C13283h9;
import com.yandex.mobile.ads.impl.C13452ix;
import com.yandex.mobile.ads.impl.h90;
import com.yandex.mobile.ads.impl.p70;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.sequences.SequencesKt;

/* renamed from: com.yandex.mobile.ads.impl.ob */
public final class C14175ob {

    /* renamed from: com.yandex.mobile.ads.impl.ob$a */
    public /* synthetic */ class C14176a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38134a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f38135b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f38136c;

        static {
            int[] iArr = new int[C13794kx.values().length];
            C13794kx kxVar = C13794kx.DP;
            iArr[0] = 1;
            C13794kx kxVar2 = C13794kx.SP;
            iArr[1] = 2;
            f38134a = iArr;
            int[] iArr2 = new int[C13215gn.values().length];
            C13215gn gnVar = C13215gn.LEFT;
            iArr2[0] = 1;
            C13215gn gnVar2 = C13215gn.CENTER;
            iArr2[1] = 2;
            C13215gn gnVar3 = C13215gn.RIGHT;
            iArr2[2] = 3;
            f38135b = iArr2;
            int[] iArr3 = new int[C13332hn.values().length];
            C13332hn hnVar = C13332hn.TOP;
            iArr3[0] = 1;
            C13332hn hnVar2 = C13332hn.CENTER;
            iArr3[1] = 2;
            C13332hn hnVar3 = C13332hn.BOTTOM;
            iArr3[2] = 3;
            f38136c = iArr3;
            int[] iArr4 = new int[C14709tt.values().length];
            C14709tt ttVar = C14709tt.FILL;
            iArr4[0] = 1;
            C14709tt ttVar2 = C14709tt.FIT;
            iArr4[2] = 2;
            C14709tt ttVar3 = C14709tt.NO_SCALE;
            iArr4[1] = 3;
            int[] iArr5 = new int[C12915ds.values().length];
            C12915ds dsVar = C12915ds.LIGHT;
            iArr5[0] = 1;
            C12915ds dsVar2 = C12915ds.REGULAR;
            iArr5[2] = 2;
            C12915ds dsVar3 = C12915ds.MEDIUM;
            iArr5[1] = 3;
            C12915ds dsVar4 = C12915ds.BOLD;
            iArr5[3] = 4;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ob$b */
    public static final class C14177b implements View.OnLayoutChangeListener {

        /* renamed from: b */
        final /* synthetic */ ViewGroup f38137b;

        /* renamed from: c */
        final /* synthetic */ List f38138c;

        /* renamed from: d */
        final /* synthetic */ s10 f38139d;

        /* renamed from: e */
        final /* synthetic */ C13513jm f38140e;

        public C14177b(ViewGroup viewGroup, List list, s10 s10, C13513jm jmVar) {
            this.f38137b = viewGroup;
            this.f38138c = list;
            this.f38139d = s10;
            this.f38140e = jmVar;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            View view2 = view;
            Intrinsics.checkNotNullParameter(view, "view");
            view.removeOnLayoutChangeListener(this);
            for (Pair next : SequencesKt.zip(ViewGroupKt.getChildren(this.f38137b), CollectionsKt.asSequence(this.f38138c))) {
                s10.m41777a(this.f38139d, this.f38140e, (View) next.component1(), (C15177xl) next.component2(), (List) null, 8, (Object) null);
            }
        }
    }

    /* renamed from: a */
    public static final void m40338a(View view, C13776kr krVar, j50 j50) {
        int i;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i4 = 0;
            if (krVar != null) {
                C13794kx a = krVar.f36401e.mo66924a(j50);
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "metrics");
                int a2 = m40331a(krVar.f36398b.mo66924a(j50), displayMetrics, a);
                i3 = m40331a(krVar.f36400d.mo66924a(j50), displayMetrics, a);
                i2 = m40331a(krVar.f36399c.mo66924a(j50), displayMetrics, a);
                i = m40331a(krVar.f36397a.mo66924a(j50), displayMetrics, a);
                i4 = a2;
            } else {
                i = 0;
                i3 = 0;
                i2 = 0;
            }
            if (marginLayoutParams.leftMargin != i4 || marginLayoutParams.topMargin != i3 || marginLayoutParams.rightMargin != i2 || marginLayoutParams.bottomMargin != i) {
                marginLayoutParams.leftMargin = i4;
                marginLayoutParams.topMargin = i3;
                marginLayoutParams.rightMargin = i2;
                marginLayoutParams.bottomMargin = i;
                view.requestLayout();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0015, code lost:
        r1 = r5.f36401e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m40346b(android.view.View r4, com.yandex.mobile.ads.impl.C13776kr r5, com.yandex.mobile.ads.impl.j50 r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "resolver"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            if (r5 != 0) goto L_0x0015
            goto L_0x0019
        L_0x0015:
            com.yandex.mobile.ads.impl.f50<com.yandex.mobile.ads.impl.kx> r1 = r5.f36401e
            if (r1 != 0) goto L_0x001b
        L_0x0019:
            r1 = 0
            goto L_0x0021
        L_0x001b:
            java.lang.Object r1 = r1.mo66924a((com.yandex.mobile.ads.impl.j50) r6)
            com.yandex.mobile.ads.impl.kx r1 = (com.yandex.mobile.ads.impl.C13794kx) r1
        L_0x0021:
            if (r1 != 0) goto L_0x0025
            r1 = -1
            goto L_0x002d
        L_0x0025:
            int[] r2 = com.yandex.mobile.ads.impl.C14175ob.C14176a.f38134a
            int r1 = r1.ordinal()
            r1 = r2[r1]
        L_0x002d:
            r2 = 1
            java.lang.String r3 = "metrics"
            if (r1 == r2) goto L_0x006d
            r2 = 2
            if (r1 == r2) goto L_0x0036
            goto L_0x00a3
        L_0x0036:
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r1 = r5.f36398b
            java.lang.Object r1 = r1.mo66924a((com.yandex.mobile.ads.impl.j50) r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            int r1 = m40349c(r1, r0)
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r2 = r5.f36400d
            java.lang.Object r2 = r2.mo66924a((com.yandex.mobile.ads.impl.j50) r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = m40349c(r2, r0)
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r3 = r5.f36399c
            java.lang.Object r3 = r3.mo66924a((com.yandex.mobile.ads.impl.j50) r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = m40349c(r3, r0)
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r5 = r5.f36397a
            java.lang.Object r5 = r5.mo66924a((com.yandex.mobile.ads.impl.j50) r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = m40349c(r5, r0)
            r4.setPadding(r1, r2, r3, r5)
            goto L_0x00a3
        L_0x006d:
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r1 = r5.f36398b
            java.lang.Object r1 = r1.mo66924a((com.yandex.mobile.ads.impl.j50) r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            int r1 = m40330a((java.lang.Integer) r1, (android.util.DisplayMetrics) r0)
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r2 = r5.f36400d
            java.lang.Object r2 = r2.mo66924a((com.yandex.mobile.ads.impl.j50) r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = m40330a((java.lang.Integer) r2, (android.util.DisplayMetrics) r0)
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r3 = r5.f36399c
            java.lang.Object r3 = r3.mo66924a((com.yandex.mobile.ads.impl.j50) r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = m40330a((java.lang.Integer) r3, (android.util.DisplayMetrics) r0)
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r5 = r5.f36397a
            java.lang.Object r5 = r5.mo66924a((com.yandex.mobile.ads.impl.j50) r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = m40330a((java.lang.Integer) r5, (android.util.DisplayMetrics) r0)
            r4.setPadding(r1, r2, r3, r5)
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14175ob.m40346b(android.view.View, com.yandex.mobile.ads.impl.kr, com.yandex.mobile.ads.impl.j50):void");
    }

    /* renamed from: c */
    public static final int m40349c(Integer num, DisplayMetrics displayMetrics) {
        Intrinsics.checkNotNullParameter(displayMetrics, "metrics");
        return MathKt.roundToInt(TypedValue.applyDimension(2, num == null ? 0.0f : (float) num.intValue(), displayMetrics));
    }

    /* renamed from: b */
    public static final float m40343b(C15266yr yrVar, DisplayMetrics displayMetrics, j50 j50) {
        Intrinsics.checkNotNullParameter(yrVar, "<this>");
        Intrinsics.checkNotNullParameter(displayMetrics, "metrics");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        int ordinal = yrVar.f42919a.mo66924a(j50).ordinal();
        if (ordinal == 0) {
            return m40344b(yrVar.f42920b.mo66924a(j50), displayMetrics);
        }
        if (ordinal == 1) {
            Integer a = yrVar.f42920b.mo66924a(j50);
            Intrinsics.checkNotNullParameter(displayMetrics, "metrics");
            return TypedValue.applyDimension(2, a == null ? 0.0f : (float) a.intValue(), displayMetrics);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public static final int m40326a(C13452ix ixVar, DisplayMetrics displayMetrics, j50 j50) {
        Intrinsics.checkNotNullParameter(displayMetrics, "metrics");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        if (ixVar == null) {
            return -2;
        }
        if (ixVar instanceof C13452ix.C13456d) {
            return -1;
        }
        if (ixVar instanceof C13452ix.C13457e) {
            return -2;
        }
        if (ixVar instanceof C13452ix.C13455c) {
            return m40328a(((C13452ix.C13455c) ixVar).mo67900c(), displayMetrics, j50);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public static final int m40328a(C15266yr yrVar, DisplayMetrics displayMetrics, j50 j50) {
        Intrinsics.checkNotNullParameter(yrVar, "<this>");
        Intrinsics.checkNotNullParameter(displayMetrics, "metrics");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        int ordinal = yrVar.f42919a.mo66924a(j50).ordinal();
        if (ordinal == 0) {
            return m40330a(yrVar.f42920b.mo66924a(j50), displayMetrics);
        }
        if (ordinal == 1) {
            return m40349c(yrVar.f42920b.mo66924a(j50), displayMetrics);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public static final int m40324a(C12992er erVar, DisplayMetrics displayMetrics, j50 j50) {
        Intrinsics.checkNotNullParameter(erVar, "<this>");
        Intrinsics.checkNotNullParameter(displayMetrics, "metrics");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        int ordinal = erVar.f33050a.mo66924a(j50).ordinal();
        if (ordinal == 0) {
            return m40329a(erVar.f33051b.mo66924a(j50), displayMetrics);
        }
        if (ordinal == 1) {
            Double a = erVar.f33051b.mo66924a(j50);
            Intrinsics.checkNotNullParameter(displayMetrics, "metrics");
            return MathKt.roundToInt(TypedValue.applyDimension(1, a == null ? 0.0f : (float) a.doubleValue(), displayMetrics));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public static final void m40345b(View view, C13452ix ixVar, j50 j50) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
        int a = m40326a(ixVar, displayMetrics, j50);
        if (view.getLayoutParams().width != a) {
            p70.C14260a.m40687a(p70.f38534f, view, Integer.valueOf(a), (Integer) null, 4);
            view.requestLayout();
        }
    }

    /* renamed from: b */
    public static final float m40344b(Integer num, DisplayMetrics displayMetrics) {
        Intrinsics.checkNotNullParameter(displayMetrics, "metrics");
        return TypedValue.applyDimension(1, num == null ? 0.0f : (float) num.intValue(), displayMetrics);
    }

    /* renamed from: b */
    public static final void m40347b(View view, String str) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setContentDescription(str);
    }

    /* renamed from: b */
    public static final boolean m40348b(C14697tn tnVar) {
        Intrinsics.checkNotNullParameter(tnVar, "<this>");
        if (tnVar.mo66160r() == null) {
            List<m10> t = tnVar.mo66162t();
            return !(t == null || t.isEmpty());
        }
    }

    /* renamed from: a */
    public static final void m40336a(View view, C13452ix ixVar, j50 j50) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
        int a = m40326a(ixVar, displayMetrics, j50);
        if (view.getLayoutParams().height != a) {
            p70.C14260a.m40687a(p70.f38534f, view, (Integer) null, Integer.valueOf(a), 2);
            view.requestLayout();
        }
    }

    /* renamed from: a */
    public static final void m40335a(View view, C13215gn gnVar, C13332hn hnVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = m40325a(gnVar, hnVar);
        } else if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = m40325a(gnVar, hnVar);
        } else if (layoutParams instanceof h90.C13292d) {
            ((h90.C13292d) layoutParams).mo67480b(m40325a(gnVar, hnVar));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m40325a(com.yandex.mobile.ads.impl.C13215gn r4, com.yandex.mobile.ads.impl.C13332hn r5) {
        /*
            r0 = -1
            if (r4 != 0) goto L_0x0005
            r4 = -1
            goto L_0x000d
        L_0x0005:
            int[] r1 = com.yandex.mobile.ads.impl.C14175ob.C14176a.f38135b
            int r4 = r4.ordinal()
            r4 = r1[r4]
        L_0x000d:
            r1 = 2
            r2 = 3
            r3 = 1
            if (r4 == r3) goto L_0x001b
            if (r4 == r1) goto L_0x0019
            if (r4 == r2) goto L_0x0017
            goto L_0x001b
        L_0x0017:
            r4 = 5
            goto L_0x001c
        L_0x0019:
            r4 = 1
            goto L_0x001c
        L_0x001b:
            r4 = 3
        L_0x001c:
            if (r5 != 0) goto L_0x001f
            goto L_0x0027
        L_0x001f:
            int[] r0 = com.yandex.mobile.ads.impl.C14175ob.C14176a.f38136c
            int r5 = r5.ordinal()
            r0 = r0[r5]
        L_0x0027:
            if (r0 == r3) goto L_0x0034
            if (r0 == r1) goto L_0x0031
            if (r0 == r2) goto L_0x002e
            goto L_0x0034
        L_0x002e:
            r5 = 80
            goto L_0x0036
        L_0x0031:
            r5 = 16
            goto L_0x0036
        L_0x0034:
            r5 = 48
        L_0x0036:
            r4 = r4 | r5
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14175ob.m40325a(com.yandex.mobile.ads.impl.gn, com.yandex.mobile.ads.impl.hn):int");
    }

    /* renamed from: a */
    public static final int m40330a(Integer num, DisplayMetrics displayMetrics) {
        Intrinsics.checkNotNullParameter(displayMetrics, "metrics");
        return MathKt.roundToInt(TypedValue.applyDimension(1, num == null ? 0.0f : (float) num.intValue(), displayMetrics));
    }

    /* renamed from: a */
    public static final int m40329a(Double d, DisplayMetrics displayMetrics) {
        Intrinsics.checkNotNullParameter(displayMetrics, "metrics");
        return MathKt.roundToInt(TypedValue.applyDimension(1, d == null ? 0.0f : (float) d.doubleValue(), displayMetrics));
    }

    /* renamed from: a */
    public static final int m40331a(Integer num, DisplayMetrics displayMetrics, C13794kx kxVar) {
        Intrinsics.checkNotNullParameter(displayMetrics, "metrics");
        Intrinsics.checkNotNullParameter(kxVar, "unit");
        return MathKt.roundToInt(TypedValue.applyDimension(m40327a(kxVar), num == null ? 0.0f : (float) num.intValue(), displayMetrics));
    }

    /* renamed from: a */
    public static final void m40337a(View view, C13513jm jmVar, C14687tm tmVar, List<? extends C14687tm> list, List<? extends C14687tm> list2, List<? extends C14687tm> list3, C13420in inVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        Intrinsics.checkNotNullParameter(inVar, "actionAnimation");
        C15056wm i = jmVar.mo68038h().mo65811i();
        Intrinsics.checkNotNullExpressionValue(i, "divView.div2Component.actionBinder");
        if (list == null || list.isEmpty()) {
            if (tmVar == null) {
                list = null;
            } else {
                list = CollectionsKt.listOf(tmVar);
            }
        }
        i.mo70717a(jmVar, view, list, list2, list3, inVar);
    }

    /* renamed from: a */
    public static final int m40327a(C13794kx kxVar) {
        Intrinsics.checkNotNullParameter(kxVar, "<this>");
        int ordinal = kxVar.ordinal();
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal == 1) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public static final void m40342a(TextView textView, Integer num, C13794kx kxVar) {
        int i;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(kxVar, "unit");
        if (num == null) {
            i = 0;
        } else {
            Integer valueOf = Integer.valueOf(num.intValue());
            DisplayMetrics displayMetrics = textView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
            int a = m40331a(valueOf, displayMetrics, kxVar);
            Intrinsics.checkNotNullParameter(textView, "<this>");
            i = a - textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        }
        textView.setLineSpacing((float) i, 1.0f);
    }

    /* renamed from: a */
    public static final void m40340a(View view, String str) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewCompat.setStateDescription(view, str);
    }

    /* renamed from: a */
    public static final List<m10> m40334a(C14697tn tnVar) {
        Intrinsics.checkNotNullParameter(tnVar, "<this>");
        List<m10> t = tnVar.mo66162t();
        if (t != null) {
            return t;
        }
        m10 r = tnVar.mo66160r();
        List<m10> listOf = r == null ? null : CollectionsKt.listOf(r);
        return listOf == null ? CollectionsKt.emptyList() : listOf;
    }

    /* renamed from: a */
    public static final void m40339a(View view, C14697tn tnVar, j50 j50) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(tnVar, "div");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        try {
            m40345b(view, tnVar.mo66147f(), j50);
            m40336a(view, tnVar.mo66148g(), j50);
            f50<C13215gn> i = tnVar.mo66151i();
            C13332hn hnVar = null;
            C13215gn a = i == null ? null : i.mo66924a(j50);
            f50<C13332hn> b = tnVar.mo66143b();
            if (b != null) {
                hnVar = b.mo66924a(j50);
            }
            m40335a(view, a, hnVar);
        } catch (oy0 e) {
            if (!g50.m36483a(e)) {
                throw e;
            }
        }
    }

    /* renamed from: a */
    public static final C13283h9.C13284a m40333a(C14709tt ttVar) {
        Intrinsics.checkNotNullParameter(ttVar, "<this>");
        int ordinal = ttVar.ordinal();
        if (ordinal == 0) {
            return C13283h9.C13284a.FILL;
        }
        if (ordinal == 1) {
            return C13283h9.C13284a.NO_SCALE;
        }
        if (ordinal == 2) {
            return C13283h9.C13284a.FIT;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public static final void m40341a(ViewGroup viewGroup, List<? extends C15177xl> list, List<? extends C15177xl> list2, C13513jm jmVar) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(list, "newDivs");
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        s10 d = jmVar.mo68038h().mo65806d();
        Intrinsics.checkNotNullExpressionValue(d, "divView.div2Component.visibilityActionTracker");
        if (!(list2 == null || list2.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (C15177xl b : list) {
                CollectionsKt.addAll(arrayList, m40334a(b.mo70911b()));
            }
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(((m10) it.next()).f37153b);
            }
            for (C15177xl xlVar : list2) {
                List<m10> a = m40334a(xlVar.mo70911b());
                ArrayList arrayList2 = new ArrayList();
                for (T next : a) {
                    if (!hashSet.contains(((m10) next).f37153b)) {
                        arrayList2.add(next);
                    }
                }
                d.mo69850a(jmVar, (View) null, xlVar, arrayList2);
            }
        }
        if (!list.isEmpty()) {
            viewGroup.addOnLayoutChangeListener(new C14177b(viewGroup, list, d, jmVar));
        }
    }

    /* renamed from: a */
    public static final Typeface m40332a(C12915ds dsVar, eg1 eg1) {
        Intrinsics.checkNotNullParameter(dsVar, "fontWeight");
        Intrinsics.checkNotNullParameter(eg1, "typefaceProvider");
        int ordinal = dsVar.ordinal();
        if (ordinal == 0) {
            Typeface a = eg1.mo66827a();
            if (a != null) {
                return a;
            }
            Typeface typeface = Typeface.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(typeface, MessengerShareContentUtility.PREVIEW_DEFAULT);
            return typeface;
        } else if (ordinal == 1) {
            Typeface c = eg1.mo66829c();
            if (c != null) {
                return c;
            }
            Typeface typeface2 = Typeface.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(typeface2, MessengerShareContentUtility.PREVIEW_DEFAULT);
            return typeface2;
        } else if (ordinal == 2) {
            Typeface d = eg1.mo66830d();
            if (d != null) {
                return d;
            }
            Typeface typeface3 = Typeface.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(typeface3, MessengerShareContentUtility.PREVIEW_DEFAULT);
            return typeface3;
        } else if (ordinal != 3) {
            Typeface d2 = eg1.mo66830d();
            if (d2 != null) {
                return d2;
            }
            Typeface typeface4 = Typeface.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(typeface4, MessengerShareContentUtility.PREVIEW_DEFAULT);
            return typeface4;
        } else {
            Typeface b = eg1.mo66828b();
            if (b != null) {
                return b;
            }
            Typeface typeface5 = Typeface.DEFAULT_BOLD;
            Intrinsics.checkNotNullExpressionValue(typeface5, "DEFAULT_BOLD");
            return typeface5;
        }
    }
}
