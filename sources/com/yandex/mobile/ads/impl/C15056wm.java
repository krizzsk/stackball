package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import androidx.appcompat.widget.PopupMenu;
import androidx.core.view.GestureDetectorCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.impl.C14687tm;
import com.yandex.mobile.ads.impl.C15056wm;
import com.yandex.mobile.ads.impl.nx0;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

/* renamed from: com.yandex.mobile.ads.impl.wm */
public class C15056wm {

    /* renamed from: g */
    private static final C15057a f42034g = new C15057a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C12985en f42035a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C12903dm f42036b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C14769um f42037c;

    /* renamed from: d */
    private final boolean f42038d;

    /* renamed from: e */
    private final boolean f42039e;

    /* renamed from: f */
    private final Function1<View, Boolean> f42040f = C15061d.f42055b;

    /* renamed from: com.yandex.mobile.ads.impl.wm$a */
    private static final class C15057a {
        private C15057a() {
        }

        public /* synthetic */ C15057a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static final Float m43699a(C15057a aVar, Double d) {
            if (d == null) {
                return null;
            }
            return Float.valueOf(RangesKt.coerceIn((float) d.doubleValue(), 0.0f, 1.0f));
        }

        /* renamed from: b */
        public static final Float m43700b(C15057a aVar, Double d) {
            if (d == null) {
                return null;
            }
            return Float.valueOf(RangesKt.coerceAtLeast((float) d.doubleValue(), 0.0f));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.wm$b */
    private final class C15058b extends nx0.C14152a.C14153a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C13513jm f42041a;

        /* renamed from: b */
        private final List<C14687tm.C14691d> f42042b;

        /* renamed from: c */
        final /* synthetic */ C15056wm f42043c;

        /* renamed from: com.yandex.mobile.ads.impl.wm$b$a */
        static final class C15059a extends Lambda implements Function0<Unit> {

            /* renamed from: b */
            final /* synthetic */ C14687tm.C14691d f42044b;

            /* renamed from: c */
            final /* synthetic */ Ref.BooleanRef f42045c;

            /* renamed from: d */
            final /* synthetic */ C15056wm f42046d;

            /* renamed from: e */
            final /* synthetic */ C15058b f42047e;

            /* renamed from: f */
            final /* synthetic */ int f42048f;

            /* renamed from: g */
            final /* synthetic */ j50 f42049g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15059a(C14687tm.C14691d dVar, Ref.BooleanRef booleanRef, C15056wm wmVar, C15058b bVar, int i, j50 j50) {
                super(0);
                this.f42044b = dVar;
                this.f42045c = booleanRef;
                this.f42046d = wmVar;
                this.f42047e = bVar;
                this.f42048f = i;
                this.f42049g = j50;
            }

            public Object invoke() {
                List<C14687tm> list = this.f42044b.f40372b;
                boolean z = false;
                if (list == null || list.isEmpty()) {
                    list = null;
                }
                if (list == null) {
                    C14687tm tmVar = this.f42044b.f40371a;
                    list = tmVar == null ? null : CollectionsKt.listOf(tmVar);
                }
                if (list == null || list.isEmpty()) {
                    z = true;
                }
                if (!z) {
                    C15056wm wmVar = this.f42046d;
                    C15058b bVar = this.f42047e;
                    int i = this.f42048f;
                    C14687tm.C14691d dVar = this.f42044b;
                    j50 j50 = this.f42049g;
                    for (C14687tm tmVar2 : list) {
                        C12903dm b = wmVar.f42036b;
                        C13513jm a = bVar.f42041a;
                        String a2 = dVar.f40373c.mo66924a(j50);
                        f50<Uri> f50 = tmVar2.f40364h;
                        b.mo66626a(a, i, a2, f50 == null ? null : f50.mo66924a(j50));
                        wmVar.f42037c.mo70373a(tmVar2, bVar.f42041a.mo66388b());
                        wmVar.mo70718a(bVar.f42041a, tmVar2);
                    }
                    this.f42045c.element = true;
                }
                return Unit.INSTANCE;
            }
        }

        public C15058b(C15056wm wmVar, C13513jm jmVar, List<? extends C14687tm.C14691d> list) {
            Intrinsics.checkNotNullParameter(wmVar, "this$0");
            Intrinsics.checkNotNullParameter(jmVar, "divView");
            Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
            this.f42043c = wmVar;
            this.f42041a = jmVar;
            this.f42042b = list;
        }

        /* renamed from: a */
        public void mo69088a(PopupMenu popupMenu) {
            Intrinsics.checkNotNullParameter(popupMenu, "popupMenu");
            j50 b = this.f42041a.mo66388b();
            Menu menu = popupMenu.getMenu();
            Intrinsics.checkNotNullExpressionValue(menu, "popupMenu.menu");
            for (C14687tm.C14691d next : this.f42042b) {
                menu.add(next.f40373c.mo66924a(b)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(next, this.f42043c, menu.size(), b) {
                    public final /* synthetic */ C14687tm.C14691d f$1;
                    public final /* synthetic */ C15056wm f$2;
                    public final /* synthetic */ int f$3;
                    public final /* synthetic */ j50 f$4;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                    }

                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        return C15056wm.C15058b.m43702a(C15056wm.C15058b.this, this.f$1, this.f$2, this.f$3, this.f$4, menuItem);
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static final boolean m43702a(C15058b bVar, C14687tm.C14691d dVar, C15056wm wmVar, int i, j50 j50, MenuItem menuItem) {
            Intrinsics.checkNotNullParameter(bVar, "this$0");
            Intrinsics.checkNotNullParameter(dVar, "$itemData");
            Intrinsics.checkNotNullParameter(wmVar, "this$1");
            Intrinsics.checkNotNullParameter(j50, "$expressionResolver");
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            bVar.f42041a.mo68030a((Function0<Unit>) new C15059a(dVar, booleanRef, wmVar, bVar, i, j50));
            return booleanRef.element;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.wm$c */
    static final class C15060c extends Lambda implements Function0<Unit> {

        /* renamed from: b */
        final /* synthetic */ List<C14687tm> f42050b;

        /* renamed from: c */
        final /* synthetic */ String f42051c;

        /* renamed from: d */
        final /* synthetic */ C15056wm f42052d;

        /* renamed from: e */
        final /* synthetic */ C13513jm f42053e;

        /* renamed from: f */
        final /* synthetic */ View f42054f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15060c(List<? extends C14687tm> list, String str, C15056wm wmVar, C13513jm jmVar, View view) {
            super(0);
            this.f42050b = list;
            this.f42051c = str;
            this.f42052d = wmVar;
            this.f42053e = jmVar;
            this.f42054f = view;
        }

        public Object invoke() {
            List<C14687tm> list = this.f42050b;
            String str = this.f42051c;
            C15056wm wmVar = this.f42052d;
            C13513jm jmVar = this.f42053e;
            View view = this.f42054f;
            for (C14687tm tmVar : list) {
                switch (str.hashCode()) {
                    case -338877947:
                        if (str.equals("long_click")) {
                            wmVar.f42036b.mo66635c(jmVar, view, tmVar);
                            break;
                        } else {
                            break;
                        }
                    case 3027047:
                        if (str.equals("blur")) {
                            wmVar.f42036b.mo66629a(jmVar, view, tmVar, Boolean.FALSE);
                            break;
                        } else {
                            break;
                        }
                    case 3091764:
                        if (str.equals("drag")) {
                            Float f = null;
                            q91 q91 = view instanceof q91 ? (q91) view : null;
                            if (q91 != null) {
                                f = Float.valueOf(q91.mo69527g());
                            }
                            wmVar.f42036b.mo66630a(jmVar, view, tmVar, f);
                            break;
                        } else {
                            break;
                        }
                    case 94750088:
                        if (str.equals("click")) {
                            wmVar.f42036b.mo66636d(jmVar, view, tmVar);
                            break;
                        } else {
                            break;
                        }
                    case 97604824:
                        if (str.equals("focus")) {
                            wmVar.f42036b.mo66629a(jmVar, view, tmVar, Boolean.TRUE);
                            break;
                        } else {
                            break;
                        }
                }
                wmVar.f42037c.mo70373a(tmVar, jmVar.mo66388b());
                wmVar.mo70718a(jmVar, tmVar);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.wm$d */
    static final class C15061d extends Lambda implements Function1<View, Boolean> {

        /* renamed from: b */
        public static final C15061d f42055b = new C15061d();

        C15061d() {
            super(1);
        }

        /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
        /* JADX WARNING: Removed duplicated region for block: B:4:0x0013  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r3) {
            /*
                r2 = this;
                android.view.View r3 = (android.view.View) r3
                java.lang.String r0 = "view"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 0
            L_0x0008:
                android.view.ViewParent r3 = r3.getParent()
                boolean r1 = r3 instanceof android.view.ViewGroup
                if (r1 == 0) goto L_0x0013
                android.view.ViewGroup r3 = (android.view.ViewGroup) r3
                goto L_0x0014
            L_0x0013:
                r3 = 0
            L_0x0014:
                if (r3 != 0) goto L_0x0017
                goto L_0x001d
            L_0x0017:
                boolean r0 = r3.performLongClick()
                if (r0 == 0) goto L_0x0008
            L_0x001d:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C15056wm.C15061d.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public C15056wm(C12985en enVar, C12903dm dmVar, C14769um umVar, @Named("longtap_actions_pass_to_child") boolean z, @Named("override_context_menu_handler") boolean z2) {
        Intrinsics.checkNotNullParameter(enVar, "actionHandler");
        Intrinsics.checkNotNullParameter(dmVar, "logger");
        Intrinsics.checkNotNullParameter(umVar, "divActionBeaconSender");
        this.f42035a = enVar;
        this.f42036b = dmVar;
        this.f42037c = umVar;
        this.f42038d = z;
        this.f42039e = z2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m43693b(C15056wm wmVar, C13513jm jmVar, View view, List list, View view2) {
        Intrinsics.checkNotNullParameter(wmVar, "this$0");
        Intrinsics.checkNotNullParameter(jmVar, "$divView");
        Intrinsics.checkNotNullParameter(view, "$target");
        m43685a(wmVar, jmVar, view, list, (String) null, 8, (Object) null);
    }

    /* renamed from: a */
    public void mo70717a(C13513jm jmVar, View view, List<? extends C14687tm> list, List<? extends C14687tm> list2, List<? extends C14687tm> list3, C13420in inVar) {
        Animation animation;
        Animation animation2;
        C12598bn bnVar;
        boolean z;
        C13513jm jmVar2 = jmVar;
        View view2 = view;
        List<? extends C14687tm> list4 = list2;
        List<? extends C14687tm> list5 = list3;
        C13420in inVar2 = inVar;
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        Intrinsics.checkNotNullParameter(view2, "target");
        Intrinsics.checkNotNullParameter(inVar2, "actionAnimation");
        C13780ks ksVar = new C13780ks();
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(view.getContext(), ksVar);
        j50 b = jmVar.mo66388b();
        T t = null;
        if (inVar2 == null) {
            animation = null;
        } else {
            animation = m43679a(inVar2, b, false);
        }
        if (inVar2 == null) {
            animation2 = null;
        } else {
            animation2 = m43679a(inVar2, b, true);
        }
        if (C13050fg.m36015a(list, list4, list5)) {
            bnVar = null;
        } else {
            bnVar = new C12598bn(animation, animation2);
        }
        view2.setOnTouchListener(new View.OnTouchListener(gestureDetectorCompat) {
            public final /* synthetic */ GestureDetectorCompat f$1;

            {
                this.f$1 = r2;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C15056wm.m43690a(Function2.this, this.f$1, view, motionEvent);
            }
        });
        m43683a(jmVar, view2, list4, list == null || list.isEmpty());
        if (list5 == null || list3.isEmpty()) {
            ksVar.mo68262a((Function0<Unit>) null);
        } else {
            Iterator<T> it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                List<C14687tm.C14691d> list6 = ((C14687tm) next).f40360d;
                if ((list6 == null || list6.isEmpty()) || this.f42039e) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    t = next;
                    break;
                }
            }
            C14687tm tmVar = (C14687tm) t;
            if (tmVar != null) {
                List<C14687tm.C14691d> list7 = tmVar.f40360d;
                if (list7 != null) {
                    nx0 a = new nx0(view.getContext(), view2, jmVar).mo69086a((nx0.C14152a) new C15058b(this, jmVar, list7));
                    Intrinsics.checkNotNullExpressionValue(a, "OverflowMenuWrapper(\n   …ity.RIGHT or Gravity.TOP)");
                    jmVar.mo68033c();
                    jmVar.mo68029a((mx0) new C12399an(a));
                    ksVar.mo68262a(new C15193xm(this, jmVar, view, tmVar, a));
                }
            } else {
                ksVar.mo68262a(new C15258ym(this, jmVar, view2, list5));
            }
        }
        m43682a(jmVar, view, ksVar, list, this.f42039e);
    }

    /* renamed from: b */
    private void m43692b(C13513jm jmVar, View view, List<? extends C14687tm> list, List<? extends C14687tm> list2) {
        view.setOnFocusChangeListener(new View.OnFocusChangeListener(list, this, jmVar, view, list2) {
            public final /* synthetic */ List f$0;
            public final /* synthetic */ C15056wm f$1;
            public final /* synthetic */ C13513jm f$2;
            public final /* synthetic */ View f$3;
            public final /* synthetic */ List f$4;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void onFocusChange(View view, boolean z) {
                C15056wm.m43686a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, view, z);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m43690a(Function2 function2, GestureDetectorCompat gestureDetectorCompat, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(gestureDetectorCompat, "$gestureDetector");
        if (function2 != null) {
            Intrinsics.checkNotNullExpressionValue(view, "v");
            Intrinsics.checkNotNullExpressionValue(motionEvent, "event");
            function2.invoke(view, motionEvent);
        }
        return gestureDetectorCompat.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private void m43682a(C13513jm jmVar, View view, C13780ks ksVar, List<? extends C14687tm> list, boolean z) {
        boolean z2;
        T t = null;
        if (list == null || list.isEmpty()) {
            ksVar.mo68263b((Function0<Unit>) null);
            view.setOnClickListener((View.OnClickListener) null);
            view.setClickable(false);
            return;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            List<C14687tm.C14691d> list2 = ((C14687tm) next).f40360d;
            if ((list2 == null || list2.isEmpty()) || z) {
                z2 = false;
                continue;
            } else {
                z2 = true;
                continue;
            }
            if (z2) {
                t = next;
                break;
            }
        }
        C14687tm tmVar = (C14687tm) t;
        if (tmVar != null) {
            List<C14687tm.C14691d> list3 = tmVar.f40360d;
            if (list3 != null) {
                nx0 a = new nx0(view.getContext(), view, jmVar).mo69086a((nx0.C14152a) new C15058b(this, jmVar, list3));
                Intrinsics.checkNotNullExpressionValue(a, "OverflowMenuWrapper(\n   …ity.RIGHT or Gravity.TOP)");
                jmVar.mo68033c();
                jmVar.mo68029a((mx0) new C12399an(a));
                $$Lambda$wm$Ul6eS15EeFkPqrxi0CyG7w0DM r4 = new View.OnClickListener(jmVar, view, tmVar, a) {
                    public final /* synthetic */ C13513jm f$1;
                    public final /* synthetic */ View f$2;
                    public final /* synthetic */ C14687tm f$3;
                    public final /* synthetic */ nx0 f$4;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                    }

                    public final void onClick(View view) {
                        C15056wm.m43684a(C15056wm.this, this.f$1, this.f$2, this.f$3, this.f$4, view);
                    }
                };
                if (ksVar.mo68261a() != null) {
                    ksVar.mo68263b(new C15330zm(r4, view));
                } else {
                    view.setOnClickListener(r4);
                }
            }
        } else {
            $$Lambda$wm$bxQWJCsNXpw_SRQi0H_I3EwRyjc r15 = new View.OnClickListener(jmVar, view, list) {
                public final /* synthetic */ C13513jm f$1;
                public final /* synthetic */ View f$2;
                public final /* synthetic */ List f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void onClick(View view) {
                    C15056wm.m43693b(C15056wm.this, this.f$1, this.f$2, this.f$3, view);
                }
            };
            if (ksVar.mo68261a() != null) {
                ksVar.mo68263b(new C15330zm(r15, view));
            } else {
                view.setOnClickListener(r15);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m43684a(C15056wm wmVar, C13513jm jmVar, View view, C14687tm tmVar, nx0 nx0, View view2) {
        Intrinsics.checkNotNullParameter(wmVar, "this$0");
        Intrinsics.checkNotNullParameter(jmVar, "$divView");
        Intrinsics.checkNotNullParameter(view, "$target");
        Intrinsics.checkNotNullParameter(nx0, "$overflowMenuWrapper");
        wmVar.f42036b.mo66636d(jmVar, view, tmVar);
        wmVar.f42037c.mo70373a(tmVar, jmVar.mo66388b());
        nx0.mo69085a().onClick(view);
    }

    /* renamed from: a */
    private void m43683a(C13513jm jmVar, View view, List<? extends C14687tm> list, boolean z) {
        T t;
        boolean z2;
        if (list == null || list.isEmpty()) {
            m43681a(view, this.f42038d, z);
            return;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            List<C14687tm.C14691d> list2 = ((C14687tm) t).f40360d;
            if ((list2 == null || list2.isEmpty()) || this.f42039e) {
                z2 = false;
                continue;
            } else {
                z2 = true;
                continue;
            }
            if (z2) {
                break;
            }
        }
        C14687tm tmVar = (C14687tm) t;
        if (tmVar != null) {
            List<C14687tm.C14691d> list3 = tmVar.f40360d;
            if (list3 != null) {
                nx0 a = new nx0(view.getContext(), view, jmVar).mo69086a((nx0.C14152a) new C15058b(this, jmVar, list3));
                Intrinsics.checkNotNullExpressionValue(a, "OverflowMenuWrapper(\n   …ity.RIGHT or Gravity.TOP)");
                jmVar.mo68033c();
                jmVar.mo68029a((mx0) new C12399an(a));
                view.setOnLongClickListener(new View.OnLongClickListener(tmVar, jmVar, a, view) {
                    public final /* synthetic */ C14687tm f$1;
                    public final /* synthetic */ C13513jm f$2;
                    public final /* synthetic */ nx0 f$3;
                    public final /* synthetic */ View f$4;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                    }

                    public final boolean onLongClick(View view) {
                        return C15056wm.m43688a(C15056wm.this, this.f$1, this.f$2, this.f$3, this.f$4, view);
                    }
                });
            }
        } else {
            view.setOnLongClickListener(new View.OnLongClickListener(jmVar, view, list) {
                public final /* synthetic */ C13513jm f$1;
                public final /* synthetic */ View f$2;
                public final /* synthetic */ List f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final boolean onLongClick(View view) {
                    return C15056wm.m43687a(C15056wm.this, this.f$1, this.f$2, this.f$3, view);
                }
            });
        }
        if (this.f42038d) {
            view.setTag(C12066R.C12068id.div_penetrating_longtap_tag, Boolean.TRUE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m43688a(C15056wm wmVar, C14687tm tmVar, C13513jm jmVar, nx0 nx0, View view, View view2) {
        Intrinsics.checkNotNullParameter(wmVar, "this$0");
        Intrinsics.checkNotNullParameter(jmVar, "$divView");
        Intrinsics.checkNotNullParameter(nx0, "$overflowMenuWrapper");
        Intrinsics.checkNotNullParameter(view, "$target");
        wmVar.f42037c.mo70373a(tmVar, jmVar.mo66388b());
        nx0.mo69085a().onClick(view);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m43687a(C15056wm wmVar, C13513jm jmVar, View view, List list, View view2) {
        Intrinsics.checkNotNullParameter(wmVar, "this$0");
        Intrinsics.checkNotNullParameter(jmVar, "$divView");
        Intrinsics.checkNotNullParameter(view, "$target");
        wmVar.mo70715a(jmVar, view, (List<? extends C14687tm>) list, "long_click");
        return true;
    }

    /* renamed from: a */
    private void m43681a(View view, boolean z, boolean z2) {
        if (!z || z2) {
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
        } else if (C12745cn.m34777b(view)) {
            view.setOnLongClickListener(new View.OnLongClickListener() {
                public final boolean onLongClick(View view) {
                    return C15056wm.m43689a(Function1.this, view);
                }
            });
            view.setTag(C12066R.C12068id.div_penetrating_longtap_tag, Boolean.TRUE);
        } else {
            view.setOnLongClickListener((View.OnLongClickListener) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m43689a(Function1 function1, View view) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        return ((Boolean) function1.invoke(view)).booleanValue();
    }

    /* renamed from: a */
    public void mo70716a(C13513jm jmVar, View view, List<? extends C14687tm> list, List<? extends C14687tm> list2) {
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        Intrinsics.checkNotNullParameter(view, "target");
        if (C13050fg.m36015a(list, list2)) {
            view.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        } else {
            m43692b(jmVar, view, list, list2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m43686a(List list, C15056wm wmVar, C13513jm jmVar, View view, List list2, View view2, boolean z) {
        Intrinsics.checkNotNullParameter(wmVar, "this$0");
        Intrinsics.checkNotNullParameter(jmVar, "$divView");
        Intrinsics.checkNotNullParameter(view, "$target");
        if (z) {
            if (list != null) {
                wmVar.mo70715a(jmVar, view, (List<? extends C14687tm>) list, "focus");
            }
        } else if (list2 != null) {
            wmVar.mo70715a(jmVar, view, (List<? extends C14687tm>) list2, "blur");
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m43685a(C15056wm wmVar, C13513jm jmVar, View view, List list, String str, int i, Object obj) {
        wmVar.mo70715a(jmVar, view, (List<? extends C14687tm>) list, (i & 8) != 0 ? "click" : null);
    }

    /* renamed from: a */
    public void mo70715a(C13513jm jmVar, View view, List<? extends C14687tm> list, String str) {
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        Intrinsics.checkNotNullParameter(view, "target");
        Intrinsics.checkNotNullParameter(list, "actions");
        Intrinsics.checkNotNullParameter(str, "actionLogType");
        jmVar.mo68030a((Function0<Unit>) new C15060c(list, str, this, jmVar, view));
    }

    /* renamed from: a */
    public void mo70718a(C13513jm jmVar, C14687tm tmVar) {
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        Intrinsics.checkNotNullParameter(tmVar, "action");
        C12985en d = jmVar.mo68034d();
        if (d == null || !d.mo66849a(tmVar, (d10) jmVar)) {
            this.f42035a.mo66849a(tmVar, (d10) jmVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: android.view.animation.ScaleAnimation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: android.view.animation.AnimationSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v28, resolved type: android.view.animation.ScaleAnimation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v29, resolved type: android.view.animation.ScaleAnimation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: android.view.animation.ScaleAnimation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: java.lang.Double} */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v7, types: [android.view.animation.AlphaAnimation] */
    /* JADX WARNING: type inference failed for: r7v8, types: [android.view.animation.AlphaAnimation] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.animation.Animation m43679a(com.yandex.mobile.ads.impl.C13420in r19, com.yandex.mobile.ads.impl.j50 r20, boolean r21) {
        /*
            r18 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            com.yandex.mobile.ads.impl.f50<com.yandex.mobile.ads.impl.in$e> r3 = r0.f34937e
            java.lang.Object r3 = r3.mo66924a((com.yandex.mobile.ads.impl.j50) r1)
            com.yandex.mobile.ads.impl.in$e r3 = (com.yandex.mobile.ads.impl.C13420in.C13425e) r3
            int r4 = r3.ordinal()
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r7 = 3
            if (r4 == r7) goto L_0x00b6
            r7 = 4
            if (r4 == r7) goto L_0x0091
            r7 = 5
            if (r4 == r7) goto L_0x008d
            r4 = 1058642330(0x3f19999a, float:0.6)
            if (r2 == 0) goto L_0x0058
            android.view.animation.AlphaAnimation r7 = new android.view.animation.AlphaAnimation
            com.yandex.mobile.ads.impl.wm$a r8 = f42034g
            com.yandex.mobile.ads.impl.f50<java.lang.Double> r9 = r0.f34934b
            if (r9 != 0) goto L_0x002d
            r9 = r6
            goto L_0x0033
        L_0x002d:
            java.lang.Object r9 = r9.mo66924a((com.yandex.mobile.ads.impl.j50) r1)
            java.lang.Double r9 = (java.lang.Double) r9
        L_0x0033:
            java.lang.Float r9 = com.yandex.mobile.ads.impl.C15056wm.C15057a.m43699a(r8, r9)
            if (r9 != 0) goto L_0x003a
            goto L_0x003e
        L_0x003a:
            float r4 = r9.floatValue()
        L_0x003e:
            com.yandex.mobile.ads.impl.f50<java.lang.Double> r9 = r0.f34939g
            if (r9 != 0) goto L_0x0043
            goto L_0x0049
        L_0x0043:
            java.lang.Object r6 = r9.mo66924a((com.yandex.mobile.ads.impl.j50) r1)
            java.lang.Double r6 = (java.lang.Double) r6
        L_0x0049:
            java.lang.Float r6 = com.yandex.mobile.ads.impl.C15056wm.C15057a.m43699a(r8, r6)
            if (r6 != 0) goto L_0x0050
            goto L_0x0054
        L_0x0050:
            float r5 = r6.floatValue()
        L_0x0054:
            r7.<init>(r4, r5)
            goto L_0x008c
        L_0x0058:
            android.view.animation.AlphaAnimation r7 = new android.view.animation.AlphaAnimation
            com.yandex.mobile.ads.impl.wm$a r8 = f42034g
            com.yandex.mobile.ads.impl.f50<java.lang.Double> r9 = r0.f34939g
            if (r9 != 0) goto L_0x0062
            r9 = r6
            goto L_0x0068
        L_0x0062:
            java.lang.Object r9 = r9.mo66924a((com.yandex.mobile.ads.impl.j50) r1)
            java.lang.Double r9 = (java.lang.Double) r9
        L_0x0068:
            java.lang.Float r9 = com.yandex.mobile.ads.impl.C15056wm.C15057a.m43699a(r8, r9)
            if (r9 != 0) goto L_0x006f
            goto L_0x0073
        L_0x006f:
            float r5 = r9.floatValue()
        L_0x0073:
            com.yandex.mobile.ads.impl.f50<java.lang.Double> r9 = r0.f34934b
            if (r9 != 0) goto L_0x0078
            goto L_0x007e
        L_0x0078:
            java.lang.Object r6 = r9.mo66924a((com.yandex.mobile.ads.impl.j50) r1)
            java.lang.Double r6 = (java.lang.Double) r6
        L_0x007e:
            java.lang.Float r6 = com.yandex.mobile.ads.impl.C15056wm.C15057a.m43699a(r8, r6)
            if (r6 != 0) goto L_0x0085
            goto L_0x0089
        L_0x0085:
            float r4 = r6.floatValue()
        L_0x0089:
            r7.<init>(r5, r4)
        L_0x008c:
            r6 = r7
        L_0x008d:
            r7 = r18
            goto L_0x014a
        L_0x0091:
            android.view.animation.AnimationSet r6 = new android.view.animation.AnimationSet
            r4 = 0
            r6.<init>(r4)
            java.util.List<com.yandex.mobile.ads.impl.in> r4 = r0.f34936d
            if (r4 != 0) goto L_0x009c
            goto L_0x008d
        L_0x009c:
            java.util.Iterator r4 = r4.iterator()
        L_0x00a0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x008d
            java.lang.Object r5 = r4.next()
            com.yandex.mobile.ads.impl.in r5 = (com.yandex.mobile.ads.impl.C13420in) r5
            r7 = r18
            android.view.animation.Animation r5 = r7.m43679a((com.yandex.mobile.ads.impl.C13420in) r5, (com.yandex.mobile.ads.impl.j50) r1, (boolean) r2)
            r6.addAnimation(r5)
            goto L_0x00a0
        L_0x00b6:
            r7 = r18
            r4 = 1064514355(0x3f733333, float:0.95)
            if (r2 == 0) goto L_0x0104
            com.yandex.mobile.ads.impl.wm$a r8 = f42034g
            com.yandex.mobile.ads.impl.f50<java.lang.Double> r9 = r0.f34934b
            if (r9 != 0) goto L_0x00c5
            r9 = r6
            goto L_0x00cb
        L_0x00c5:
            java.lang.Object r9 = r9.mo66924a((com.yandex.mobile.ads.impl.j50) r1)
            java.lang.Double r9 = (java.lang.Double) r9
        L_0x00cb:
            java.lang.Float r9 = com.yandex.mobile.ads.impl.C15056wm.C15057a.m43700b(r8, r9)
            if (r9 != 0) goto L_0x00d5
            r12 = 1064514355(0x3f733333, float:0.95)
            goto L_0x00da
        L_0x00d5:
            float r4 = r9.floatValue()
            r12 = r4
        L_0x00da:
            com.yandex.mobile.ads.impl.f50<java.lang.Double> r4 = r0.f34939g
            if (r4 != 0) goto L_0x00df
            goto L_0x00e6
        L_0x00df:
            java.lang.Object r4 = r4.mo66924a((com.yandex.mobile.ads.impl.j50) r1)
            r6 = r4
            java.lang.Double r6 = (java.lang.Double) r6
        L_0x00e6:
            java.lang.Float r4 = com.yandex.mobile.ads.impl.C15056wm.C15057a.m43700b(r8, r6)
            if (r4 != 0) goto L_0x00ef
            r13 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00f4
        L_0x00ef:
            float r5 = r4.floatValue()
            r13 = r5
        L_0x00f4:
            android.view.animation.ScaleAnimation r6 = new android.view.animation.ScaleAnimation
            r14 = 1
            r15 = 1056964608(0x3f000000, float:0.5)
            r16 = 1
            r17 = 1056964608(0x3f000000, float:0.5)
            r9 = r6
            r10 = r12
            r11 = r13
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x014a
        L_0x0104:
            com.yandex.mobile.ads.impl.wm$a r8 = f42034g
            com.yandex.mobile.ads.impl.f50<java.lang.Double> r9 = r0.f34939g
            if (r9 != 0) goto L_0x010c
            r9 = r6
            goto L_0x0112
        L_0x010c:
            java.lang.Object r9 = r9.mo66924a((com.yandex.mobile.ads.impl.j50) r1)
            java.lang.Double r9 = (java.lang.Double) r9
        L_0x0112:
            java.lang.Float r9 = com.yandex.mobile.ads.impl.C15056wm.C15057a.m43700b(r8, r9)
            if (r9 != 0) goto L_0x011b
            r12 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0120
        L_0x011b:
            float r5 = r9.floatValue()
            r12 = r5
        L_0x0120:
            com.yandex.mobile.ads.impl.f50<java.lang.Double> r5 = r0.f34934b
            if (r5 != 0) goto L_0x0125
            goto L_0x012c
        L_0x0125:
            java.lang.Object r5 = r5.mo66924a((com.yandex.mobile.ads.impl.j50) r1)
            r6 = r5
            java.lang.Double r6 = (java.lang.Double) r6
        L_0x012c:
            java.lang.Float r5 = com.yandex.mobile.ads.impl.C15056wm.C15057a.m43700b(r8, r6)
            if (r5 != 0) goto L_0x0136
            r13 = 1064514355(0x3f733333, float:0.95)
            goto L_0x013b
        L_0x0136:
            float r4 = r5.floatValue()
            r13 = r4
        L_0x013b:
            android.view.animation.ScaleAnimation r6 = new android.view.animation.ScaleAnimation
            r14 = 1
            r15 = 1056964608(0x3f000000, float:0.5)
            r16 = 1
            r17 = 1056964608(0x3f000000, float:0.5)
            r9 = r6
            r10 = r12
            r11 = r13
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x014a:
            com.yandex.mobile.ads.impl.in$e r4 = com.yandex.mobile.ads.impl.C13420in.C13425e.SET
            if (r3 == r4) goto L_0x018c
            if (r6 != 0) goto L_0x0151
            goto L_0x0179
        L_0x0151:
            if (r2 == 0) goto L_0x016a
            com.yandex.mobile.ads.impl.f50<com.yandex.mobile.ads.impl.jn> r2 = r0.f34935c
            java.lang.Object r2 = r2.mo66924a((com.yandex.mobile.ads.impl.j50) r1)
            com.yandex.mobile.ads.impl.jn r2 = (com.yandex.mobile.ads.impl.C13525jn) r2
            android.view.animation.Interpolator r2 = com.yandex.mobile.ads.impl.t00.m42195a((com.yandex.mobile.ads.impl.C13525jn) r2)
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            com.yandex.mobile.ads.impl.n51 r3 = new com.yandex.mobile.ads.impl.n51
            r3.<init>(r2)
            goto L_0x0176
        L_0x016a:
            com.yandex.mobile.ads.impl.f50<com.yandex.mobile.ads.impl.jn> r2 = r0.f34935c
            java.lang.Object r2 = r2.mo66924a((com.yandex.mobile.ads.impl.j50) r1)
            com.yandex.mobile.ads.impl.jn r2 = (com.yandex.mobile.ads.impl.C13525jn) r2
            android.view.animation.Interpolator r3 = com.yandex.mobile.ads.impl.t00.m42195a((com.yandex.mobile.ads.impl.C13525jn) r2)
        L_0x0176:
            r6.setInterpolator(r3)
        L_0x0179:
            if (r6 != 0) goto L_0x017c
            goto L_0x018c
        L_0x017c:
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r2 = r0.f34933a
            java.lang.Object r2 = r2.mo66924a((com.yandex.mobile.ads.impl.j50) r1)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            long r2 = (long) r2
            r6.setDuration(r2)
        L_0x018c:
            if (r6 != 0) goto L_0x018f
            goto L_0x019f
        L_0x018f:
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r0 = r0.f34938f
            java.lang.Object r0 = r0.mo66924a((com.yandex.mobile.ads.impl.j50) r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            r6.setStartOffset(r0)
        L_0x019f:
            if (r6 != 0) goto L_0x01a2
            goto L_0x01a6
        L_0x01a2:
            r0 = 1
            r6.setFillAfter(r0)
        L_0x01a6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C15056wm.m43679a(com.yandex.mobile.ads.impl.in, com.yandex.mobile.ads.impl.j50, boolean):android.view.animation.Animation");
    }

    /* renamed from: a */
    public void mo70714a(C13513jm jmVar, View view, List<? extends C14687tm> list) {
        T t;
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        Intrinsics.checkNotNullParameter(view, "target");
        Intrinsics.checkNotNullParameter(list, "actions");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            List<C14687tm.C14691d> list2 = ((C14687tm) t).f40360d;
            if (!(list2 == null || list2.isEmpty())) {
                break;
            }
        }
        C14687tm tmVar = (C14687tm) t;
        if (tmVar != null) {
            List<C14687tm.C14691d> list3 = tmVar.f40360d;
            if (list3 != null) {
                nx0 a = new nx0(view.getContext(), view, jmVar).mo69086a((nx0.C14152a) new C15058b(this, jmVar, list3));
                Intrinsics.checkNotNullExpressionValue(a, "OverflowMenuWrapper(\n   …ity.RIGHT or Gravity.TOP)");
                jmVar.mo68033c();
                jmVar.mo68029a((mx0) new C12399an(a));
                this.f42036b.mo66636d(jmVar, view, tmVar);
                this.f42037c.mo70373a(tmVar, jmVar.mo66388b());
                a.mo69085a().onClick(view);
                return;
            }
            return;
        }
        m43685a(this, jmVar, view, (List) list, (String) null, 8, (Object) null);
    }
}
