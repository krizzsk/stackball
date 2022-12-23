package com.yandex.metrica.impl.p265ob;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/* renamed from: com.yandex.metrica.impl.ob.tl */
class C11796tl {

    /* renamed from: l */
    private static final List<Class> f28329l;

    /* renamed from: m */
    private static final List<Class> f28330m;

    /* renamed from: a */
    private final TreeSet<Float> f28331a = new TreeSet<>();

    /* renamed from: b */
    private final List<C10229El> f28332b = new ArrayList();

    /* renamed from: c */
    private final C11090bl f28333c;

    /* renamed from: d */
    private final List<C10263Fl> f28334d;

    /* renamed from: e */
    private final List<C10730Rk> f28335e;

    /* renamed from: f */
    private final C11472km f28336f;

    /* renamed from: g */
    private final C10789Tk f28337g;

    /* renamed from: h */
    private final C11091bm f28338h;

    /* renamed from: i */
    private final C11165dm f28339i;

    /* renamed from: j */
    private final C10938Xl f28340j;

    /* renamed from: k */
    private final C11537mm f28341k;

    static {
        ArrayList arrayList = new ArrayList();
        f28329l = arrayList;
        ArrayList arrayList2 = new ArrayList();
        f28330m = arrayList2;
        arrayList.add(ListView.class);
        arrayList.add(GridView.class);
        m30462a((List<Class>) arrayList, "androidx.recyclerview.widget.RecyclerView");
        m30462a((List<Class>) arrayList, "androidx.viewpager.widget.ViewPager");
        m30462a((List<Class>) arrayList, "androidx.viewpager2.widget.ViewPager2");
        m30462a((List<Class>) arrayList2, "androidx.coordinatorlayout.widget.CoordinatorLayout");
        m30462a((List<Class>) arrayList2, "androidx.drawerlayout.widget.DrawerLayout");
        m30462a((List<Class>) arrayList2, "androidx.slidingpanelayout.widget.SlidingPaneLayout");
        m30462a((List<Class>) arrayList2, "androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        m30462a((List<Class>) arrayList2, "androidx.core.widget.NestedScrollView");
        m30462a((List<Class>) arrayList2, "androidx.constraintlayout.widget.ConstraintLayout");
        m30462a((List<Class>) arrayList2, "androidx.appcompat.widget.ContentFrameLayout");
        arrayList2.add(AbsoluteLayout.class);
        arrayList2.add(FrameLayout.class);
        arrayList2.add(LinearLayout.class);
        arrayList2.add(RelativeLayout.class);
        arrayList2.add(TableLayout.class);
        arrayList2.add(ScrollView.class);
        arrayList2.add(GridLayout.class);
    }

    C11796tl(C11091bm bmVar, C11472km kmVar, C10789Tk tk, C11090bl blVar, List<C10263Fl> list, List<C10730Rk> list2, C11165dm dmVar, C10938Xl xl, C11537mm mmVar) {
        this.f28338h = bmVar;
        this.f28336f = kmVar;
        this.f28337g = tk;
        this.f28333c = blVar;
        this.f28334d = list;
        this.f28335e = list2;
        this.f28339i = dmVar;
        this.f28340j = xl;
        this.f28341k = mmVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:87:0x0133  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.yandex.metrica.impl.p265ob.C11722rl m30461a(com.yandex.metrica.impl.p265ob.C10893Wl r22, android.view.View r23, int r24) {
        /*
            r21 = this;
            r8 = r21
            r0 = r22
            r1 = r23
            java.lang.Class r2 = r23.getClass()
            java.lang.String r15 = r2.getName()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x001f
            boolean r4 = r0.f26182e
            if (r4 != 0) goto L_0x001c
            com.yandex.metrica.impl.ob.Wl$a r0 = r0.f26184g
            com.yandex.metrica.impl.ob.Wl$a r4 = com.yandex.metrica.impl.p265ob.C10893Wl.C10894a.LIST
            if (r0 != r4) goto L_0x001f
        L_0x001c:
            r16 = 1
            goto L_0x0021
        L_0x001f:
            r16 = 0
        L_0x0021:
            int r0 = r23.getId()
            java.lang.String r17 = java.lang.Integer.toHexString(r0)
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0030
            com.yandex.metrica.impl.ob.Wl$c r0 = com.yandex.metrica.impl.p265ob.C10893Wl.C10896c.VIEW_CONTAINER
            goto L_0x0032
        L_0x0030:
            com.yandex.metrica.impl.ob.Wl$c r0 = com.yandex.metrica.impl.p265ob.C10893Wl.C10896c.VIEW
        L_0x0032:
            r18 = r0
            java.util.List<java.lang.Class> r0 = f28329l
            boolean r0 = r8.m30463a((java.util.List<java.lang.Class>) r0, (android.view.View) r1)
            if (r0 == 0) goto L_0x0041
            com.yandex.metrica.impl.ob.Wl$a r0 = com.yandex.metrica.impl.p265ob.C10893Wl.C10894a.LIST
        L_0x003e:
            r19 = r0
            goto L_0x0096
        L_0x0041:
            boolean r0 = r1 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x0048
            com.yandex.metrica.impl.ob.Wl$a r0 = com.yandex.metrica.impl.p265ob.C10893Wl.C10894a.f26191h
            goto L_0x003e
        L_0x0048:
            boolean r0 = r1 instanceof android.webkit.WebView
            if (r0 == 0) goto L_0x004f
            com.yandex.metrica.impl.ob.Wl$a r0 = com.yandex.metrica.impl.p265ob.C10893Wl.C10894a.WEBVIEW
            goto L_0x003e
        L_0x004f:
            java.util.List<java.lang.Class> r0 = f28330m
            boolean r0 = r8.m30463a((java.util.List<java.lang.Class>) r0, (android.view.View) r1)
            if (r0 == 0) goto L_0x005a
            com.yandex.metrica.impl.ob.Wl$a r0 = com.yandex.metrica.impl.p265ob.C10893Wl.C10894a.CONTAINER
            goto L_0x003e
        L_0x005a:
            boolean r0 = r1 instanceof android.widget.Button
            if (r0 == 0) goto L_0x0061
            com.yandex.metrica.impl.ob.Wl$a r0 = com.yandex.metrica.impl.p265ob.C10893Wl.C10894a.BUTTON
            goto L_0x003e
        L_0x0061:
            boolean r0 = r1 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x0070
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            int r4 = r4.getInputType()
            if (r4 == 0) goto L_0x0070
            r4 = 1
            goto L_0x0071
        L_0x0070:
            r4 = 0
        L_0x0071:
            if (r4 == 0) goto L_0x0076
            com.yandex.metrica.impl.ob.Wl$a r0 = com.yandex.metrica.impl.p265ob.C10893Wl.C10894a.INPUT
            goto L_0x003e
        L_0x0076:
            r4 = 21
            boolean r4 = com.yandex.metrica.impl.p265ob.C10796U2.m27890a((int) r4)
            if (r4 == 0) goto L_0x0080
            boolean r3 = r1 instanceof android.widget.Toolbar
        L_0x0080:
            if (r3 == 0) goto L_0x0085
            com.yandex.metrica.impl.ob.Wl$a r0 = com.yandex.metrica.impl.p265ob.C10893Wl.C10894a.TOOLBAR
            goto L_0x003e
        L_0x0085:
            if (r0 == 0) goto L_0x0093
            r0 = r1
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r0 = r0.getInputType()
            if (r0 != 0) goto L_0x0093
            com.yandex.metrica.impl.ob.Wl$a r0 = com.yandex.metrica.impl.p265ob.C10893Wl.C10894a.LABEL
            goto L_0x003e
        L_0x0093:
            com.yandex.metrica.impl.ob.Wl$a r0 = com.yandex.metrica.impl.p265ob.C10893Wl.C10894a.OTHER
            goto L_0x003e
        L_0x0096:
            boolean r0 = r1 instanceof android.widget.TextView
            r20 = 0
            if (r0 == 0) goto L_0x00fc
            r2 = r1
            android.widget.TextView r2 = (android.widget.TextView) r2     // Catch:{ all -> 0x00f0 }
            java.util.List<com.yandex.metrica.impl.ob.Fl> r0 = r8.f28334d     // Catch:{ all -> 0x00f0 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f0 }
        L_0x00a5:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00f0 }
            if (r1 == 0) goto L_0x00bd
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00f0 }
            com.yandex.metrica.impl.ob.Fl r1 = (com.yandex.metrica.impl.p265ob.C10263Fl) r1     // Catch:{ all -> 0x00f0 }
            boolean r3 = r1.mo61157a(r2)     // Catch:{ all -> 0x00f0 }
            if (r3 == 0) goto L_0x00a5
            com.yandex.metrica.impl.ob.Wl$b r0 = r1.mo61156a()     // Catch:{ all -> 0x00f0 }
            r1 = r0
            goto L_0x00bf
        L_0x00bd:
            r1 = r20
        L_0x00bf:
            if (r1 != 0) goto L_0x00d8
            java.lang.CharSequence r0 = r2.getText()     // Catch:{ all -> 0x00d6 }
            com.yandex.metrica.impl.ob.bl r3 = r8.f28333c     // Catch:{ all -> 0x00d6 }
            if (r0 != 0) goto L_0x00cc
            r0 = r20
            goto L_0x00d0
        L_0x00cc:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00d6 }
        L_0x00d0:
            com.yandex.metrica.impl.ob.Wl$b r0 = r3.mo62704a(r0)     // Catch:{ all -> 0x00d6 }
            r9 = r0
            goto L_0x00d9
        L_0x00d6:
            r0 = move-exception
            goto L_0x00f3
        L_0x00d8:
            r9 = r1
        L_0x00d9:
            if (r9 != 0) goto L_0x00ee
            r1 = r21
            r3 = r15
            r4 = r17
            r5 = r24
            r6 = r16
            r7 = r19
            com.yandex.metrica.impl.ob.Wl r20 = r1.m30460a(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00eb }
            goto L_0x00ee
        L_0x00eb:
            r0 = move-exception
            r1 = r9
            goto L_0x00f3
        L_0x00ee:
            r12 = r9
            goto L_0x0131
        L_0x00f0:
            r0 = move-exception
            r1 = r20
        L_0x00f3:
            com.yandex.metrica.impl.ob.dm r2 = r8.f28339i
            java.lang.String r3 = "ui_parsing_text_view"
            r2.mo62798a(r3, r0)
            r12 = r1
            goto L_0x0131
        L_0x00fc:
            boolean r0 = r1 instanceof android.webkit.WebView
            if (r0 == 0) goto L_0x012f
            r0 = r1
            android.webkit.WebView r0 = (android.webkit.WebView) r0
            com.yandex.metrica.impl.ob.nm r1 = new com.yandex.metrica.impl.ob.nm
            r12 = 0
            r9 = r1
            r10 = r15
            r11 = r17
            r13 = r24
            r14 = r16
            r9.<init>(r10, r11, r12, r13, r14)
            com.yandex.metrica.impl.ob.mm r3 = r8.f28341k
            r3.getClass()
            java.util.concurrent.CountDownLatch r4 = new java.util.concurrent.CountDownLatch
            r4.<init>(r2)
            com.yandex.metrica.impl.ob.lm r2 = new com.yandex.metrica.impl.ob.lm     // Catch:{ all -> 0x012a }
            r2.<init>(r3, r1, r0, r4)     // Catch:{ all -> 0x012a }
            r0.post(r2)     // Catch:{ all -> 0x012a }
            r2 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x012a }
            r4.await(r2, r0)     // Catch:{ all -> 0x012a }
        L_0x012a:
            r12 = r20
            r20 = r1
            goto L_0x0131
        L_0x012f:
            r12 = r20
        L_0x0131:
            if (r20 != 0) goto L_0x0145
            com.yandex.metrica.impl.ob.Wl r20 = new com.yandex.metrica.impl.ob.Wl
            r9 = r20
            r10 = r15
            r11 = r17
            r13 = r24
            r14 = r16
            r15 = r18
            r16 = r19
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
        L_0x0145:
            r0 = r20
            com.yandex.metrica.impl.ob.Tk r1 = r8.f28337g
            r1.mo62092a((com.yandex.metrica.impl.p265ob.C10893Wl) r0)
            com.yandex.metrica.impl.ob.rl r1 = new com.yandex.metrica.impl.ob.rl
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11796tl.m30461a(com.yandex.metrica.impl.ob.Wl, android.view.View, int):com.yandex.metrica.impl.ob.rl");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C11722rl mo63752b(C10893Wl wl, View view, int i) {
        try {
            if (!this.f28340j.mo62492a(view)) {
                return m30461a(wl, view, i);
            }
            return null;
        } catch (Throwable th) {
            this.f28339i.mo62798a("ui_parsing_view", th);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final List<C10229El> mo63753b() {
        return this.f28332b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e3 A[LOOP:0: B:53:0x00dd->B:55:0x00e3, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.yandex.metrica.impl.p265ob.C10893Wl m30460a(android.widget.TextView r20, java.lang.String r21, java.lang.String r22, int r23, boolean r24, com.yandex.metrica.impl.p265ob.C10893Wl.C10894a r25) throws java.lang.Throwable {
        /*
            r19 = this;
            r0 = r19
            java.lang.CharSequence r1 = r20.getText()
            if (r1 != 0) goto L_0x000b
            java.lang.String r1 = ""
            goto L_0x000f
        L_0x000b:
            java.lang.String r1 = r1.toString()
        L_0x000f:
            r9 = r1
            int r1 = r20.getVisibility()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x001b
            r16 = 1
            goto L_0x001d
        L_0x001b:
            r16 = 0
        L_0x001d:
            r1 = 0
            android.content.Context r4 = r20.getContext()     // Catch:{ all -> 0x004c }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x004c }
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()     // Catch:{ all -> 0x004c }
            float r5 = r20.getTextSize()     // Catch:{ all -> 0x004c }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ all -> 0x004c }
            float r6 = r5.floatValue()     // Catch:{ all -> 0x004a }
            float r7 = r4.density     // Catch:{ all -> 0x004a }
            float r6 = r6 / r7
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ all -> 0x004a }
            float r7 = r5.floatValue()     // Catch:{ all -> 0x004e }
            float r4 = r4.scaledDensity     // Catch:{ all -> 0x004e }
            float r7 = r7 / r4
            java.lang.Float r4 = java.lang.Float.valueOf(r7)     // Catch:{ all -> 0x004e }
            r12 = r4
            goto L_0x004f
        L_0x004a:
            r6 = r1
            goto L_0x004e
        L_0x004c:
            r5 = r1
            r6 = r5
        L_0x004e:
            r12 = r1
        L_0x004f:
            r10 = r5
            r11 = r6
            if (r10 == 0) goto L_0x005e
            com.yandex.metrica.impl.ob.bm r4 = r0.f28338h
            boolean r4 = r4.f26623e
            if (r4 == 0) goto L_0x005e
            java.util.TreeSet<java.lang.Float> r4 = r0.f28331a
            r4.add(r10)
        L_0x005e:
            com.yandex.metrica.impl.ob.km r4 = r0.f28336f
            r5 = r20
            int r17 = r4.mo63248a(r5)
            android.text.TextUtils$TruncateAt r4 = r20.getEllipsize()
            if (r4 != 0) goto L_0x0071
            com.yandex.metrica.impl.ob.El$b r2 = com.yandex.metrica.impl.p265ob.C10229El.C10231b.NONE
        L_0x006e:
            r18 = r2
            goto L_0x0093
        L_0x0071:
            int[] r6 = com.yandex.metrica.impl.p265ob.C10229El.C10230a.f24619a
            int r4 = r4.ordinal()
            r4 = r6[r4]
            if (r4 == r2) goto L_0x0090
            r2 = 2
            if (r4 == r2) goto L_0x008d
            r2 = 3
            if (r4 == r2) goto L_0x008a
            r2 = 4
            if (r4 == r2) goto L_0x0087
            com.yandex.metrica.impl.ob.El$b r2 = com.yandex.metrica.impl.p265ob.C10229El.C10231b.UNKNOWN
            goto L_0x006e
        L_0x0087:
            com.yandex.metrica.impl.ob.El$b r2 = com.yandex.metrica.impl.p265ob.C10229El.C10231b.MARQUEE
            goto L_0x006e
        L_0x008a:
            com.yandex.metrica.impl.ob.El$b r2 = com.yandex.metrica.impl.p265ob.C10229El.C10231b.MIDDLE
            goto L_0x006e
        L_0x008d:
            com.yandex.metrica.impl.ob.El$b r2 = com.yandex.metrica.impl.p265ob.C10229El.C10231b.END
            goto L_0x006e
        L_0x0090:
            com.yandex.metrica.impl.ob.El$b r2 = com.yandex.metrica.impl.p265ob.C10229El.C10231b.START
            goto L_0x006e
        L_0x0093:
            android.graphics.Typeface r2 = r20.getTypeface()
            if (r2 != 0) goto L_0x00a7
            r4 = 20
            boolean r4 = com.yandex.metrica.impl.p265ob.C10796U2.m27890a((int) r4)
            if (r4 != 0) goto L_0x00a7
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r2, r3)
        L_0x00a7:
            if (r2 == 0) goto L_0x00bc
            boolean r1 = r2.isBold()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r2 = r2.isItalic()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r14 = r1
            r15 = r2
            goto L_0x00be
        L_0x00bc:
            r14 = r1
            r15 = r14
        L_0x00be:
            int r1 = r20.getCurrentTextColor()
            java.lang.String r13 = java.lang.Integer.toHexString(r1)
            com.yandex.metrica.impl.ob.El r1 = new com.yandex.metrica.impl.ob.El
            r2 = r1
            r5 = 0
            r3 = r21
            r4 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.util.List<com.yandex.metrica.impl.ob.Rk> r2 = r0.f28335e
            java.util.Iterator r2 = r2.iterator()
        L_0x00dd:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00ed
            java.lang.Object r3 = r2.next()
            com.yandex.metrica.impl.ob.Rk r3 = (com.yandex.metrica.impl.p265ob.C10730Rk) r3
            r3.mo61203a(r1)
            goto L_0x00dd
        L_0x00ed:
            java.util.List<com.yandex.metrica.impl.ob.El> r2 = r0.f28332b
            r2.add(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11796tl.m30460a(android.widget.TextView, java.lang.String, java.lang.String, int, boolean, com.yandex.metrica.impl.ob.Wl$a):com.yandex.metrica.impl.ob.Wl");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public TreeSet<Float> mo63751a() {
        return this.f28331a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<View> mo63750a(View view, int i) {
        ArrayList arrayList = new ArrayList();
        try {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int min = Math.min(this.f28337g.mo62309a(i), viewGroup.getChildCount());
                for (int i2 = 0; i2 < min; i2++) {
                    arrayList.add(viewGroup.getChildAt(i2));
                }
            }
        } catch (Throwable th) {
            this.f28339i.mo62798a("ui_parsing_children", th);
        }
        return arrayList;
    }

    /* renamed from: a */
    private boolean m30463a(List<Class> list, View view) {
        for (Class isInstance : list) {
            if (isInstance.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m30462a(List<Class> list, String str) {
        Class b = C10122B2.m26038b(str);
        if (b != null) {
            list.add(b);
        }
    }
}
