package com.yandex.mobile.ads.impl;

import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.transition.Transition;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.impl.C14416qt;
import com.yandex.mobile.ads.impl.j00;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

public class g00 {

    /* renamed from: a */
    private final Provider<C15257yl> f33805a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final j00 f33806b;

    /* renamed from: c */
    private final s10 f33807c;

    /* renamed from: d */
    private final C14416qt f33808d;

    /* renamed from: e */
    private final Function3<View, Integer, Integer, PopupWindow> f33809e;

    /* renamed from: f */
    private final Map<String, ge1> f33810f = new LinkedHashMap();

    /* renamed from: g */
    private final Handler f33811g = new Handler(Looper.getMainLooper());

    /* renamed from: com.yandex.mobile.ads.impl.g00$a */
    public static final class C13154a implements View.OnLayoutChangeListener {

        /* renamed from: b */
        final /* synthetic */ View f33812b;

        /* renamed from: c */
        final /* synthetic */ View f33813c;

        /* renamed from: d */
        final /* synthetic */ c00 f33814d;

        /* renamed from: e */
        final /* synthetic */ C13513jm f33815e;

        /* renamed from: f */
        final /* synthetic */ PopupWindow f33816f;

        /* renamed from: g */
        final /* synthetic */ g00 f33817g;

        /* renamed from: h */
        final /* synthetic */ C15177xl f33818h;

        public C13154a(View view, View view2, c00 c00, C13513jm jmVar, PopupWindow popupWindow, g00 g00, C15177xl xlVar) {
            this.f33812b = view;
            this.f33813c = view2;
            this.f33814d = c00;
            this.f33815e = jmVar;
            this.f33816f = popupWindow;
            this.f33817g = g00;
            this.f33818h = xlVar;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.removeOnLayoutChangeListener(this);
            Point a = h00.m36740a(this.f33812b, this.f33813c, this.f33814d, this.f33815e.mo66388b());
            if (h00.m36744a(this.f33815e, this.f33812b, a)) {
                this.f33816f.update(a.x, a.y, this.f33812b.getWidth(), this.f33812b.getHeight());
                g00.m36386a(this.f33817g, this.f33815e, this.f33818h, this.f33812b);
                j00.C13464a a2 = this.f33817g.f33806b.mo65534a();
                if (a2 != null) {
                    a2.mo67909a(this.f33813c, this.f33814d);
                    return;
                }
                return;
            }
            this.f33817g.mo67138a(this.f33814d.f31764e, this.f33815e);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.g00$b */
    public static final class C13155b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ g00 f33819b;

        /* renamed from: c */
        final /* synthetic */ c00 f33820c;

        /* renamed from: d */
        final /* synthetic */ C13513jm f33821d;

        public C13155b(g00 g00, c00 c00, C13513jm jmVar) {
            this.f33819b = g00;
            this.f33820c = c00;
            this.f33821d = jmVar;
        }

        public final void run() {
            this.f33819b.mo67138a(this.f33820c.f31764e, this.f33821d);
        }
    }

    public g00(Provider<C15257yl> provider, j00 j00, s10 s10, C14416qt qtVar, Function3<? super View, ? super Integer, ? super Integer, ? extends PopupWindow> function3) {
        Intrinsics.checkNotNullParameter(provider, "div2Builder");
        Intrinsics.checkNotNullParameter(j00, "tooltipRestrictor");
        Intrinsics.checkNotNullParameter(s10, "divVisibilityActionTracker");
        Intrinsics.checkNotNullParameter(qtVar, "divImagePreloader");
        Intrinsics.checkNotNullParameter(function3, "createPopup");
        this.f33805a = provider;
        this.f33806b = j00;
        this.f33807c = s10;
        this.f33808d = qtVar;
        this.f33809e = function3;
    }

    /* renamed from: b */
    public void mo67139b(String str, C13513jm jmVar) {
        Intrinsics.checkNotNullParameter(str, "tooltipId");
        Intrinsics.checkNotNullParameter(jmVar, "div2View");
        Pair a = h00.m36745b(str, jmVar);
        if (a != null) {
            c00 c00 = (c00) a.component1();
            View view = (View) a.component2();
            if (!this.f33810f.containsKey(c00.f31764e)) {
                if (!ViewCompat.isLaidOut(view) || view.isLayoutRequested()) {
                    view.addOnLayoutChangeListener(new f00(this, view, c00, jmVar));
                } else {
                    m36383a(view, c00, jmVar);
                }
                if (!ViewCompat.isLaidOut(view) && !view.isLayoutRequested()) {
                    view.requestLayout();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo67138a(String str, C13513jm jmVar) {
        PopupWindow b;
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(jmVar, "div2View");
        ge1 ge1 = this.f33810f.get(str);
        if (ge1 != null && (b = ge1.mo67274b()) != null) {
            b.dismiss();
        }
    }

    /* renamed from: a */
    public void mo67137a(C13513jm jmVar) {
        Intrinsics.checkNotNullParameter(jmVar, "div2View");
        m36388a(jmVar, (View) jmVar);
    }

    /* renamed from: a */
    private void m36388a(C13513jm jmVar, View view) {
        Object tag = view.getTag(C12066R.C12068id.div_tooltips_tag);
        List<c00> list = tag instanceof List ? (List) tag : null;
        if (list != null) {
            for (c00 c00 : list) {
                ArrayList<String> arrayList = new ArrayList<>();
                ge1 ge1 = this.f33810f.get(c00.f31764e);
                if (ge1 != null) {
                    ge1.mo67272a(true);
                    if (ge1.mo67274b().isShowing()) {
                        PopupWindow b = ge1.mo67274b();
                        Intrinsics.checkNotNullParameter(b, "<this>");
                        if (Build.VERSION.SDK_INT >= 23) {
                            b.setEnterTransition((Transition) null);
                            b.setExitTransition((Transition) null);
                        } else {
                            b.setAnimationStyle(0);
                        }
                        ge1.mo67274b().dismiss();
                    } else {
                        arrayList.add(c00.f31764e);
                        s10.m41777a(this.f33807c, jmVar, (View) null, c00.f31762c, (List) null, 8, (Object) null);
                    }
                    C14416qt.C14420d c = ge1.mo67275c();
                    if (c != null) {
                        c.mo69645a();
                    }
                }
                for (String remove : arrayList) {
                    this.f33810f.remove(remove);
                }
            }
        }
        if (view instanceof ViewGroup) {
            for (View a : ViewGroupKt.getChildren((ViewGroup) view)) {
                m36388a(jmVar, a);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m36383a(View view, c00 c00, C13513jm jmVar) {
        View view2 = view;
        c00 c002 = c00;
        C13513jm jmVar2 = jmVar;
        if (this.f33806b.mo65536c(view2, c002)) {
            C15177xl xlVar = c002.f31762c;
            C14697tn b = xlVar.mo70911b();
            View a = this.f33805a.get().mo71098a(xlVar, jmVar2, new C14729ty(0, new ArrayList()));
            DisplayMetrics displayMetrics = jmVar.getResources().getDisplayMetrics();
            j50 b2 = jmVar.mo66388b();
            Function3<View, Integer, Integer, PopupWindow> function3 = this.f33809e;
            C13452ix f = b.mo66147f();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "displayMetrics");
            PopupWindow invoke = function3.invoke(a, Integer.valueOf(C14175ob.m40326a(f, displayMetrics, b2)), Integer.valueOf(C14175ob.m40326a(b.mo66148g(), displayMetrics, b2)));
            invoke.setOnDismissListener(new PopupWindow.OnDismissListener(c002, jmVar2, view2) {
                public final /* synthetic */ c00 f$1;
                public final /* synthetic */ C13513jm f$2;
                public final /* synthetic */ View f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void onDismiss() {
                    g00.m36385a(g00.this, this.f$1, this.f$2, this.f$3);
                }
            });
            h00.m36746b(invoke);
            d00.m34963a(invoke, c002, jmVar.mo66388b());
            ge1 ge1 = new ge1(invoke, xlVar, (C14416qt.C14420d) null, false);
            this.f33810f.put(c002.f31764e, ge1);
            C14416qt.C14420d a2 = this.f33808d.mo69640a(xlVar, jmVar.mo66388b(), new C14416qt.C14417a(view, this, jmVar, c00, a, invoke, b2, xlVar) {
                public final /* synthetic */ View f$1;
                public final /* synthetic */ g00 f$2;
                public final /* synthetic */ C13513jm f$3;
                public final /* synthetic */ c00 f$4;
                public final /* synthetic */ View f$5;
                public final /* synthetic */ PopupWindow f$6;
                public final /* synthetic */ j50 f$7;
                public final /* synthetic */ C15177xl f$8;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                    this.f$6 = r7;
                    this.f$7 = r8;
                    this.f$8 = r9;
                }

                /* renamed from: a */
                public final void mo65506a(boolean z) {
                    g00.m36387a(ge1.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, z);
                }
            });
            ge1 ge12 = this.f33810f.get(c002.f31764e);
            if (ge12 != null) {
                ge12.mo67271a(a2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m36385a(g00 g00, c00 c00, C13513jm jmVar, View view) {
        Intrinsics.checkNotNullParameter(g00, "this$0");
        Intrinsics.checkNotNullParameter(c00, "$divTooltip");
        Intrinsics.checkNotNullParameter(jmVar, "$div2View");
        Intrinsics.checkNotNullParameter(view, "$anchor");
        g00.f33810f.remove(c00.f31764e);
        s10.m41777a(g00.f33807c, jmVar, (View) null, c00.f31762c, (List) null, 8, (Object) null);
        j00.C13464a a = g00.f33806b.mo65534a();
        if (a != null) {
            a.mo67911b(view, c00);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m36387a(ge1 ge1, View view, g00 g00, C13513jm jmVar, c00 c00, View view2, PopupWindow popupWindow, j50 j50, C15177xl xlVar, boolean z) {
        View view3 = view;
        g00 g002 = g00;
        C13513jm jmVar2 = jmVar;
        c00 c002 = c00;
        View view4 = view2;
        PopupWindow popupWindow2 = popupWindow;
        j50 j502 = j50;
        C15177xl xlVar2 = xlVar;
        Intrinsics.checkNotNullParameter(ge1, "$tooltipData");
        Intrinsics.checkNotNullParameter(view3, "$anchor");
        Intrinsics.checkNotNullParameter(g002, "this$0");
        Intrinsics.checkNotNullParameter(jmVar2, "$div2View");
        Intrinsics.checkNotNullParameter(c002, "$divTooltip");
        Intrinsics.checkNotNullParameter(view4, "$tooltipView");
        Intrinsics.checkNotNullParameter(popupWindow2, "$popup");
        Intrinsics.checkNotNullParameter(j502, "$resolver");
        Intrinsics.checkNotNullParameter(xlVar2, "$div");
        if (!z && !ge1.mo67273a() && view.isAttachedToWindow() && g002.f33806b.mo65536c(view3, c002)) {
            if (!ViewCompat.isLaidOut(view2) || view2.isLayoutRequested()) {
                view4.addOnLayoutChangeListener(new C13154a(view2, view, c00, jmVar, popupWindow, g00, xlVar));
            } else {
                Point a = h00.m36740a(view4, view3, c002, jmVar.mo66388b());
                if (h00.m36744a(jmVar2, view4, a)) {
                    popupWindow2.update(a.x, a.y, view2.getWidth(), view2.getHeight());
                    m36386a(g002, jmVar2, xlVar2, view4);
                    j00.C13464a a2 = g002.f33806b.mo65534a();
                    if (a2 != null) {
                        a2.mo67909a(view3, c002);
                    }
                } else {
                    g002.mo67138a(c002.f31764e, jmVar2);
                }
            }
            popupWindow2.showAtLocation(view3, 0, 0, 0);
            if (c002.f31763d.mo66924a(j502).intValue() != 0) {
                g002.f33811g.postDelayed(new C13155b(g002, c002, jmVar2), (long) c002.f31763d.mo66924a(j502).intValue());
            }
        }
    }

    /* renamed from: a */
    public static final void m36386a(g00 g00, C13513jm jmVar, C15177xl xlVar, View view) {
        g00 g002 = g00;
        s10.m41777a(g002.f33807c, jmVar, (View) null, xlVar, (List) null, 8, (Object) null);
        s10.m41777a(g002.f33807c, jmVar, view, xlVar, (List) null, 8, (Object) null);
    }
}
