package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import androidx.transition.Scene;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.impl.C15177xl;
import com.yandex.mobile.ads.impl.C15340zq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;

/* renamed from: com.yandex.mobile.ads.impl.jm */
public class C13513jm extends FrameLayout implements d10 {

    /* renamed from: a */
    private final long f35360a;

    /* renamed from: b */
    private final C12397am f35361b;

    /* renamed from: c */
    private final C13992mm f35362c;

    /* renamed from: d */
    private final C15257yl f35363d;

    /* renamed from: e */
    private final List<WeakReference<ij0>> f35364e;

    /* renamed from: f */
    private final List<mx0> f35365f;

    /* renamed from: g */
    private final List<Object> f35366g;

    /* renamed from: h */
    private final WeakHashMap<View, C15177xl> f35367h;

    /* renamed from: i */
    private final C13514a f35368i;

    /* renamed from: j */
    private o50 f35369j;

    /* renamed from: k */
    private int f35370k;

    /* renamed from: l */
    private y00 f35371l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C15340zq f35372m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final Function0<o31> f35373n;

    /* renamed from: o */
    private final Lazy f35374o;

    /* renamed from: p */
    private C12758cr f35375p;

    /* renamed from: q */
    private C12758cr f35376q;

    /* renamed from: r */
    private C15340zq f35377r;

    /* renamed from: s */
    private C12985en f35378s;

    /* renamed from: t */
    private long f35379t;

    /* renamed from: com.yandex.mobile.ads.impl.jm$b */
    static final class C13516b extends Lambda implements Function1<C15177xl, Boolean> {

        /* renamed from: b */
        final /* synthetic */ ArrayDeque<o00> f35385b;

        /* renamed from: c */
        final /* synthetic */ j50 f35386c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13516b(ArrayDeque<o00> arrayDeque, j50 j50) {
            super(1);
            this.f35385b = arrayDeque;
            this.f35386c = j50;
        }

        public Object invoke(Object obj) {
            C15177xl xlVar = (C15177xl) obj;
            Intrinsics.checkNotNullParameter(xlVar, "div");
            if (xlVar instanceof C15177xl.C15190m) {
                this.f35385b.addLast(((C15177xl.C15190m) xlVar).mo70922c().f34687t.mo66924a(this.f35386c));
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jm$c */
    static final class C13517c extends Lambda implements Function1<C15177xl, Unit> {

        /* renamed from: b */
        final /* synthetic */ ArrayDeque<o00> f35387b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13517c(ArrayDeque<o00> arrayDeque) {
            super(1);
            this.f35387b = arrayDeque;
        }

        public Object invoke(Object obj) {
            C15177xl xlVar = (C15177xl) obj;
            Intrinsics.checkNotNullParameter(xlVar, "div");
            if (xlVar instanceof C15177xl.C15190m) {
                this.f35387b.removeLast();
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jm$d */
    static final class C13518d extends Lambda implements Function1<C15177xl, Boolean> {

        /* renamed from: b */
        final /* synthetic */ ArrayDeque<o00> f35388b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13518d(ArrayDeque<o00> arrayDeque) {
            super(1);
            this.f35388b = arrayDeque;
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter((C15177xl) obj, "it");
            o00 lastOrNull = this.f35388b.lastOrNull();
            return Boolean.valueOf(lastOrNull == null ? false : p00.m40629a(lastOrNull));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jm$e */
    static final class C13519e extends Lambda implements Function0<C14107nm> {

        /* renamed from: b */
        final /* synthetic */ C13513jm f35389b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13519e(C13513jm jmVar) {
            super(0);
            this.f35389b = jmVar;
        }

        public Object invoke() {
            return new C14107nm(new C13716km(this.f35389b), this.f35389b.f35373n);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jm$f */
    static final class C13520f extends Lambda implements Function0<o31> {

        /* renamed from: b */
        final /* synthetic */ C12596bm f35390b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13520f(C12596bm bmVar) {
            super(0);
            this.f35390b = bmVar;
        }

        public Object invoke() {
            return ((C12893dj) C13345hu.f34556b.mo67633a(this.f35390b).mo67632c()).mo66592c().mo65706f().get();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jm$g */
    public static final class C13521g implements View.OnLayoutChangeListener {

        /* renamed from: b */
        final /* synthetic */ C13513jm f35391b;

        /* renamed from: c */
        final /* synthetic */ C15340zq f35392c;

        public C13521g(C13513jm jmVar, C15340zq zqVar) {
            this.f35391b = jmVar;
            this.f35392c = zqVar;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.removeOnLayoutChangeListener(this);
            C13513jm jmVar = this.f35391b;
            jmVar.post(new C13522h(this.f35392c, jmVar));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jm$h */
    static final class C13522h implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C15340zq f35393b;

        /* renamed from: c */
        final /* synthetic */ C13513jm f35394c;

        C13522h(C15340zq zqVar, C13513jm jmVar) {
            this.f35393b = zqVar;
            this.f35394c = jmVar;
        }

        public final void run() {
            if (Intrinsics.areEqual((Object) this.f35393b, (Object) this.f35394c.f35372m)) {
                this.f35394c.m37882a(this.f35393b, true);
            }
        }
    }

    private C13513jm(C12596bm bmVar, AttributeSet attributeSet, int i, long j) {
        super(bmVar, attributeSet, i);
        this.f35360a = j;
        this.f35361b = bmVar.mo66094b();
        this.f35362c = mo68038h().mo65804b().mo66596a(this).mo66597a();
        C15257yl h = bmVar.mo66094b().mo65810h();
        Intrinsics.checkNotNullExpressionValue(h, "context.div2Component.div2Builder");
        this.f35363d = h;
        this.f35364e = new ArrayList();
        this.f35365f = new ArrayList();
        this.f35366g = new ArrayList();
        this.f35367h = new WeakHashMap<>();
        this.f35368i = new C13514a(this);
        this.f35370k = -1;
        this.f35371l = y00.f42735a;
        this.f35373n = new C13520f(bmVar);
        this.f35374o = LazyKt.lazy(LazyThreadSafetyMode.NONE, new C13519e(this));
        C12758cr crVar = C12758cr.f32024b;
        Intrinsics.checkNotNullExpressionValue(crVar, "INVALID");
        this.f35375p = crVar;
        Intrinsics.checkNotNullExpressionValue(crVar, "INVALID");
        this.f35376q = crVar;
        this.f35379t = -1;
        this.f35379t = mo68038h().mo65805c().mo69398d();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m37887c(C13513jm jmVar) {
        Intrinsics.checkNotNullParameter(jmVar, "this$0");
        Intrinsics.checkNotNullParameter(jmVar, "<this>");
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        for (View a : ViewGroupKt.getChildren(jmVar)) {
            i10.m37254a(jmVar.mo68042m(), a);
        }
        jmVar.removeAllViews();
    }

    /* renamed from: j */
    private C14107nm m37888j() {
        return (C14107nm) this.f35374o.getValue();
    }

    /* renamed from: n */
    private g00 m37889n() {
        g00 j = this.f35361b.mo65812j();
        Intrinsics.checkNotNullExpressionValue(j, "div2Component.tooltipController");
        return j;
    }

    /* renamed from: a */
    public View mo66384a() {
        return this;
    }

    /* renamed from: a */
    public void mo68028a(ij0 ij0, View view) {
        Intrinsics.checkNotNullParameter(ij0, "loadReference");
        Intrinsics.checkNotNullParameter(view, "targetView");
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(ij0, "reference");
        Object tag = view.getTag(C12066R.C12068id.load_references_tag);
        if (tag == null) {
            view.setTag(C12066R.C12068id.load_references_tag, SetsKt.mutableSetOf(ij0));
        } else {
            TypeIntrinsics.asMutableSet(tag).add(ij0);
        }
        this.f35364e.add(new WeakReference(ij0));
    }

    /* renamed from: d */
    public C12985en mo68034d() {
        return this.f35378s;
    }

    /* renamed from: e */
    public y00 mo68035e() {
        y00 y00 = this.f35371l;
        Intrinsics.checkNotNullExpressionValue(y00, "config");
        return y00;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.mobile.ads.impl.g10 mo68036f() {
        /*
            r7 = this;
            com.yandex.mobile.ads.impl.zq r0 = r7.f35377r
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.yandex.mobile.ads.impl.am r2 = r7.f35361b
            com.yandex.mobile.ads.impl.ry r2 = r2.mo65807e()
            com.yandex.mobile.ads.impl.cr r3 = r7.f35375p
            com.yandex.mobile.ads.impl.g10 r2 = r2.mo69833a(r3)
            java.util.List<com.yandex.mobile.ads.impl.zq$d> r0 = r0.f43288c
            boolean r3 = r0 instanceof java.util.Collection
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0021
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0021
            goto L_0x0042
        L_0x0021:
            java.util.Iterator r0 = r0.iterator()
        L_0x0025:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0042
            java.lang.Object r3 = r0.next()
            com.yandex.mobile.ads.impl.zq$d r3 = (com.yandex.mobile.ads.impl.C15340zq.C15344d) r3
            int r3 = r3.f43297b
            if (r2 != 0) goto L_0x0036
            goto L_0x003e
        L_0x0036:
            int r6 = r2.mo67147b()
            if (r3 != r6) goto L_0x003e
            r3 = 1
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            if (r3 == 0) goto L_0x0025
            goto L_0x0043
        L_0x0042:
            r4 = 0
        L_0x0043:
            if (r4 == 0) goto L_0x0046
            r1 = r2
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13513jm.mo68036f():com.yandex.mobile.ads.impl.g10");
    }

    /* renamed from: g */
    public C12758cr mo68037g() {
        return this.f35375p;
    }

    /* renamed from: h */
    public C12397am mo68038h() {
        return this.f35361b;
    }

    /* renamed from: i */
    public C12758cr mo68039i() {
        return this.f35375p;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.f43287b;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo68040k() {
        /*
            r1 = this;
            com.yandex.mobile.ads.impl.zq r0 = r1.f35377r
            if (r0 != 0) goto L_0x0005
            goto L_0x0009
        L_0x0005:
            java.lang.String r0 = r0.f43287b
            if (r0 != 0) goto L_0x000b
        L_0x0009:
            java.lang.String r0 = ""
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13513jm.mo68040k():java.lang.String");
    }

    /* renamed from: l */
    public C12758cr mo68041l() {
        return this.f35376q;
    }

    /* renamed from: m */
    public k31 mo68042m() {
        return this.f35362c.mo66600c();
    }

    /* renamed from: o */
    public C13992mm mo68043o() {
        return this.f35362c;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo68048q();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m37888j().mo69053g();
        super.onLayout(z, i, i2, i3, i4);
        mo68048q();
        m37888j().mo69052f();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m37888j().mo69055i();
        super.onMeasure(i, i2);
        m37888j().mo69054h();
    }

    /* renamed from: p */
    public void mo68047p() {
        s10 d = this.f35361b.mo65806d();
        Intrinsics.checkNotNullExpressionValue(d, "div2Component.visibilityActionTracker");
        for (Map.Entry next : this.f35367h.entrySet()) {
            View view = (View) next.getKey();
            C15177xl xlVar = (C15177xl) next.getValue();
            if (ViewCompat.isAttachedToWindow(view)) {
                Intrinsics.checkNotNullExpressionValue(xlVar, "div");
                s10.m41777a(d, this, view, xlVar, (List) null, 8, (Object) null);
            }
        }
    }

    /* renamed from: q */
    public void mo68048q() {
        List<C15340zq.C15344d> list;
        boolean z;
        C15340zq zqVar = this.f35377r;
        T t = null;
        if (!(zqVar == null || (list = zqVar.f43288c) == null)) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (((C15340zq.C15344d) next).f43297b == this.f35370k) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    t = next;
                    break;
                }
            }
            t = (C15340zq.C15344d) t;
        }
        if (t != null) {
            m37885b((C15340zq.C15344d) t);
        }
        mo68047p();
    }

    public void setActionHandler(C12985en enVar) {
        this.f35378s = enVar;
    }

    public void setComponentName(String str) {
        m37888j().mo69047a(str);
    }

    public void setConfig(y00 y00) {
        Intrinsics.checkNotNullParameter(y00, "viewConfig");
        this.f35371l = y00;
    }

    public void setDataTag$div_release(C12758cr crVar) {
        Intrinsics.checkNotNullParameter(crVar, "value");
        setPrevDataTag$div_release(this.f35375p);
        this.f35375p = crVar;
        this.f35362c.mo66601d().mo70993a(this.f35375p);
    }

    public void setDivData$div_release(C15340zq zqVar) {
        this.f35377r = zqVar;
        if (zqVar != null) {
            o50 o50 = this.f35369j;
            o50 a = this.f35361b.mo65817o().mo69318a(this.f35375p, zqVar);
            this.f35369j = a;
            if (!Intrinsics.areEqual((Object) o50, (Object) a) && o50 != null) {
                o50.mo69117a((d10) null);
            }
            a.mo69117a(this);
        }
    }

    public void setPrevDataTag$div_release(C12758cr crVar) {
        Intrinsics.checkNotNullParameter(crVar, "<set-?>");
        this.f35376q = crVar;
    }

    public void setStateId$div_release(int i) {
        this.f35370k = i;
    }

    public void setVariable(String str, String str2) throws vh1 {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "value");
        o50 o50 = this.f35369j;
        sh1 sh1 = null;
        th1 b = o50 == null ? null : o50.mo69118b();
        if (b != null) {
            sh1 = b.mo70185a(str);
        }
        if (sh1 != null) {
            try {
                sh1.mo69978b(str2);
            } catch (vh1 unused) {
            }
        }
    }

    /* renamed from: b */
    private void m37885b(C15340zq.C15344d dVar) {
        s10 d = this.f35361b.mo65806d();
        Intrinsics.checkNotNullExpressionValue(d, "div2Component.visibilityActionTracker");
        s10.m41777a(d, this, this, dVar.f43296a, (List) null, 8, (Object) null);
    }

    /* renamed from: b */
    private boolean m37886b(C15340zq zqVar, C12758cr crVar) {
        C14107nm j = m37888j();
        if (j != null) {
            j.mo69049c();
        }
        C15340zq zqVar2 = this.f35377r;
        setDivData$div_release((C15340zq) null);
        this.f35372m = null;
        C12758cr crVar2 = C12758cr.f32024b;
        Intrinsics.checkNotNullExpressionValue(crVar2, "INVALID");
        setDataTag$div_release(crVar2);
        for (WeakReference weakReference : this.f35364e) {
            ij0 ij0 = (ij0) weakReference.get();
            if (ij0 != null) {
                ij0.mo65575a();
            }
        }
        this.f35364e.clear();
        this.f35367h.clear();
        m37889n().mo67137a(this);
        this.f35365f.clear();
        this.f35366g.clear();
        setDataTag$div_release(crVar);
        setDivData$div_release(zqVar);
        boolean a = m37883a(zqVar2, zqVar);
        C14107nm j2 = m37888j();
        if (j2 != null) {
            j2.mo69048b();
        }
        return a;
    }

    /* renamed from: com.yandex.mobile.ads.impl.jm$a */
    private final class C13514a {

        /* renamed from: a */
        private boolean f35380a;

        /* renamed from: b */
        private C15340zq.C15344d f35381b;

        /* renamed from: c */
        private final List<C14729ty> f35382c = new ArrayList();

        /* renamed from: d */
        final /* synthetic */ C13513jm f35383d;

        /* renamed from: com.yandex.mobile.ads.impl.jm$a$a */
        public static final class C13515a implements View.OnLayoutChangeListener {

            /* renamed from: b */
            final /* synthetic */ C13514a f35384b;

            public C13515a(C13514a aVar) {
                this.f35384b = aVar;
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                this.f35384b.mo68057a((Function0<Unit>) C13419im.f34921b);
            }
        }

        public C13514a(C13513jm jmVar) {
            Intrinsics.checkNotNullParameter(jmVar, "this$0");
            this.f35383d = jmVar;
        }

        /* renamed from: a */
        public final void mo68057a(Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "function");
            if (!this.f35380a) {
                this.f35380a = true;
                function0.invoke();
                mo68058a(true);
                this.f35380a = false;
            }
        }

        /* renamed from: a */
        public final boolean mo68059a(C15340zq.C15344d dVar, C14729ty tyVar, boolean z) {
            Intrinsics.checkNotNullParameter(tyVar, "path");
            List<C14729ty> listOf = CollectionsKt.listOf(tyVar);
            Intrinsics.checkNotNullParameter(listOf, "paths");
            C15340zq.C15344d dVar2 = this.f35381b;
            if (dVar2 == null || Intrinsics.areEqual((Object) dVar, (Object) dVar2)) {
                this.f35381b = dVar;
                CollectionsKt.addAll(this.f35382c, listOf);
                C13513jm jmVar = this.f35383d;
                for (C14729ty a : listOf) {
                    C14546ry e = jmVar.mo68038h().mo65807e();
                    String a2 = jmVar.mo68039i().mo66346a();
                    Intrinsics.checkNotNullExpressionValue(a2, "divTag.id");
                    e.mo69835a(a2, a, z);
                }
                if (this.f35380a) {
                    return true;
                }
                mo68058a(true);
                return true;
            }
            this.f35381b = null;
            return false;
        }

        /* renamed from: a */
        public final void mo68058a(boolean z) {
            if (this.f35383d.getChildCount() == 0) {
                C13513jm jmVar = this.f35383d;
                if (!ViewCompat.isLaidOut(jmVar) || jmVar.isLayoutRequested()) {
                    jmVar.addOnLayoutChangeListener(new C13515a(this));
                } else {
                    mo68057a((Function0<Unit>) C13419im.f34921b);
                }
            } else {
                C15340zq.C15344d dVar = this.f35381b;
                if (dVar != null) {
                    C14855uy g = this.f35383d.mo68043o().mo66604g();
                    List<C14729ty> list = this.f35382c;
                    Intrinsics.checkNotNullParameter(list, "<this>");
                    if (TypeIntrinsics.isMutableList(list)) {
                        list = Collections.unmodifiableList(new ArrayList(list));
                        Intrinsics.checkNotNullExpressionValue(list, "{\n        Collections.un…st(ArrayList(this))\n    }");
                    }
                    g.mo67083a(dVar, list, z);
                    this.f35381b = null;
                    this.f35382c.clear();
                }
            }
        }
    }

    /* renamed from: c */
    public void mo68033c() {
        this.f35365f.clear();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13513jm(C12596bm bmVar, AttributeSet attributeSet, int i, int i2) {
        this(bmVar, (AttributeSet) null, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C13513jm(C12596bm bmVar, AttributeSet attributeSet, int i) {
        this(bmVar, attributeSet, i, SystemClock.uptimeMillis());
        Intrinsics.checkNotNullParameter(bmVar, "context");
    }

    /* renamed from: a */
    private View m37877a(C15340zq.C15344d dVar, int i, boolean z) {
        this.f35361b.mo65807e().mo69834a(this.f35375p, i, z);
        return this.f35363d.mo71098a(dVar.f43296a, this, new C14729ty(dVar.f43297b, new ArrayList()));
    }

    /* renamed from: a */
    private void m37881a(C15340zq.C15344d dVar) {
        s10 d = this.f35361b.mo65806d();
        Intrinsics.checkNotNullExpressionValue(d, "div2Component.visibilityActionTracker");
        s10.m41777a(d, this, (View) null, dVar.f43296a, (List) null, 8, (Object) null);
    }

    /* renamed from: a */
    public void mo66386a(C14729ty tyVar, boolean z) {
        List<C15340zq.C15344d> list;
        boolean z2;
        Intrinsics.checkNotNullParameter(tyVar, "path");
        if (this.f35370k == tyVar.mo70249d()) {
            C15340zq zqVar = this.f35377r;
            T t = null;
            if (!(zqVar == null || (list = zqVar.f43288c) == null)) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (((C15340zq.C15344d) next).f43297b == tyVar.mo70249d()) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        t = next;
                        break;
                    }
                }
                t = (C15340zq.C15344d) t;
            }
            if (this.f35368i.mo68059a(t, tyVar, z)) {
                return;
            }
        }
        mo66385a(tyVar.mo70249d(), z);
    }

    /* renamed from: b */
    public j50 mo66388b() {
        o50 o50 = this.f35369j;
        j50 a = o50 == null ? null : o50.mo69116a();
        return a == null ? j50.f35129a : a;
    }

    /* renamed from: b */
    public void mo66389b(String str) {
        Intrinsics.checkNotNullParameter(str, "tooltipId");
        m37889n().mo67138a(str, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0099 A[LOOP:2: B:36:0x0093->B:38:0x0099, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo68032a(com.yandex.mobile.ads.impl.C15340zq r11, com.yandex.mobile.ads.impl.C15340zq r12, com.yandex.mobile.ads.impl.C12758cr r13) {
        /*
            r10 = this;
            java.lang.String r0 = "tag"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = 0
            if (r11 == 0) goto L_0x0149
            com.yandex.mobile.ads.impl.zq r1 = r10.f35377r
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r11)
            if (r1 == 0) goto L_0x0012
            goto L_0x0149
        L_0x0012:
            com.yandex.mobile.ads.impl.nm r1 = r10.m37888j()
            r1.mo69046a((android.view.View) r10)
            com.yandex.mobile.ads.impl.zq r1 = r10.f35377r
            if (r1 != 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r12 = r1
        L_0x001f:
            com.yandex.mobile.ads.impl.hp r1 = com.yandex.mobile.ads.impl.C13338hp.f34501a
            int r2 = r10.f35370k
            com.yandex.mobile.ads.impl.j50 r3 = r10.mo66388b()
            java.lang.String r4 = "new"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r4)
            java.lang.String r4 = "resolver"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            r4 = 0
            if (r12 != 0) goto L_0x0035
            goto L_0x007b
        L_0x0035:
            java.util.List<com.yandex.mobile.ads.impl.zq$d> r5 = r12.f43288c
            java.util.Iterator r5 = r5.iterator()
        L_0x003b:
            boolean r6 = r5.hasNext()
            r7 = 1
            if (r6 == 0) goto L_0x0053
            java.lang.Object r6 = r5.next()
            r8 = r6
            com.yandex.mobile.ads.impl.zq$d r8 = (com.yandex.mobile.ads.impl.C15340zq.C15344d) r8
            int r8 = r8.f43297b
            if (r8 != r2) goto L_0x004f
            r8 = 1
            goto L_0x0050
        L_0x004f:
            r8 = 0
        L_0x0050:
            if (r8 == 0) goto L_0x003b
            goto L_0x0054
        L_0x0053:
            r6 = r4
        L_0x0054:
            com.yandex.mobile.ads.impl.zq$d r6 = (com.yandex.mobile.ads.impl.C15340zq.C15344d) r6
            if (r6 != 0) goto L_0x0059
            goto L_0x007b
        L_0x0059:
            java.util.List<com.yandex.mobile.ads.impl.zq$d> r5 = r11.f43288c
            java.util.Iterator r5 = r5.iterator()
        L_0x005f:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0076
            java.lang.Object r8 = r5.next()
            r9 = r8
            com.yandex.mobile.ads.impl.zq$d r9 = (com.yandex.mobile.ads.impl.C15340zq.C15344d) r9
            int r9 = r9.f43297b
            if (r9 != r2) goto L_0x0072
            r9 = 1
            goto L_0x0073
        L_0x0072:
            r9 = 0
        L_0x0073:
            if (r9 == 0) goto L_0x005f
            goto L_0x0077
        L_0x0076:
            r8 = r4
        L_0x0077:
            com.yandex.mobile.ads.impl.zq$d r8 = (com.yandex.mobile.ads.impl.C15340zq.C15344d) r8
            if (r8 != 0) goto L_0x007d
        L_0x007b:
            r1 = 0
            goto L_0x0085
        L_0x007d:
            com.yandex.mobile.ads.impl.xl r2 = r6.f43296a
            com.yandex.mobile.ads.impl.xl r5 = r8.f43296a
            boolean r1 = r1.mo67586a((com.yandex.mobile.ads.impl.C15177xl) r2, (com.yandex.mobile.ads.impl.C15177xl) r5, (com.yandex.mobile.ads.impl.j50) r3)
        L_0x0085:
            if (r1 != 0) goto L_0x0088
            r12 = r4
        L_0x0088:
            r10.f35372m = r4
            r10.setDataTag$div_release(r13)
            java.util.List<com.yandex.mobile.ads.impl.zq$d> r1 = r11.f43288c
            java.util.Iterator r1 = r1.iterator()
        L_0x0093:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00c3
            java.lang.Object r2 = r1.next()
            com.yandex.mobile.ads.impl.zq$d r2 = (com.yandex.mobile.ads.impl.C15340zq.C15344d) r2
            com.yandex.mobile.ads.impl.am r3 = r10.f35361b
            com.yandex.mobile.ads.impl.qt r3 = r3.mo65809g()
            java.lang.String r4 = "div2Component.imagePreLoader"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            com.yandex.mobile.ads.impl.xl r4 = r2.f43296a
            com.yandex.mobile.ads.impl.j50 r5 = r10.mo66388b()
            com.yandex.mobile.ads.impl.qt$a r6 = com.yandex.mobile.ads.impl.C14534rt.f39714a
            r3.mo69640a(r4, r5, r6)
            com.yandex.mobile.ads.impl.mm r3 = r10.f35362c
            com.yandex.mobile.ads.impl.qr r3 = r3.mo66603f()
            com.yandex.mobile.ads.impl.xl r2 = r2.f43296a
            r3.mo69636a(r2)
            goto L_0x0093
        L_0x00c3:
            if (r12 == 0) goto L_0x0117
            com.yandex.mobile.ads.impl.f50<java.lang.Boolean> r1 = r11.f43286a
            com.yandex.mobile.ads.impl.j50 r2 = r10.mo66388b()
            java.lang.Object r1 = r1.mo66924a((com.yandex.mobile.ads.impl.j50) r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0105
            com.yandex.mobile.ads.impl.zq r1 = r10.f35377r
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r1)
            if (r1 != 0) goto L_0x00e2
            r10.m37886b(r12, r13)
        L_0x00e2:
            r10.f35372m = r11
            com.yandex.mobile.ads.impl.t00.m42197a((android.view.View) r10)
            boolean r12 = androidx.core.view.ViewCompat.isLaidOut(r10)
            if (r12 == 0) goto L_0x00fc
            boolean r12 = r10.isLayoutRequested()
            if (r12 != 0) goto L_0x00fc
            com.yandex.mobile.ads.impl.jm$h r12 = new com.yandex.mobile.ads.impl.jm$h
            r12.<init>(r11, r10)
            r10.post(r12)
            goto L_0x011b
        L_0x00fc:
            com.yandex.mobile.ads.impl.jm$g r12 = new com.yandex.mobile.ads.impl.jm$g
            r12.<init>(r10, r11)
            r10.addOnLayoutChangeListener(r12)
            goto L_0x011b
        L_0x0105:
            com.yandex.mobile.ads.impl.j50 r12 = r10.mo66388b()
            boolean r12 = com.yandex.mobile.ads.impl.p00.m40630a((com.yandex.mobile.ads.impl.C15340zq) r11, (com.yandex.mobile.ads.impl.j50) r12)
            if (r12 == 0) goto L_0x0113
            r10.m37886b(r11, r13)
            goto L_0x011b
        L_0x0113:
            r10.m37882a((com.yandex.mobile.ads.impl.C15340zq) r11, (boolean) r0)
            goto L_0x011b
        L_0x0117:
            boolean r0 = r10.m37886b(r11, r13)
        L_0x011b:
            com.yandex.mobile.ads.impl.am r11 = r10.f35361b
            com.yandex.mobile.ads.impl.uo r11 = r11.mo65814l()
            r11.mo70382a()
            long r11 = r10.f35379t
            r1 = 0
            int r13 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r13 >= 0) goto L_0x012d
            goto L_0x0149
        L_0x012d:
            com.yandex.mobile.ads.impl.am r11 = r10.f35361b
            com.yandex.mobile.ads.impl.pq r1 = r11.mo65805c()
            long r2 = r10.f35360a
            long r4 = r10.f35379t
            com.yandex.mobile.ads.impl.am r11 = r10.f35361b
            com.yandex.mobile.ads.impl.ea0 r6 = r11.mo65803a()
            java.lang.String r11 = "div2Component.histogramReporter"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r11)
            r1.mo69396a(r2, r4, r6)
            r11 = -1
            r10.f35379t = r11
        L_0x0149:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13513jm.mo68032a(com.yandex.mobile.ads.impl.zq, com.yandex.mobile.ads.impl.zq, com.yandex.mobile.ads.impl.cr):boolean");
    }

    /* renamed from: a */
    public boolean mo68031a(C15340zq zqVar, C12758cr crVar) {
        Intrinsics.checkNotNullParameter(crVar, ViewHierarchyConstants.TAG_KEY);
        return mo68032a(zqVar, this.f35377r, crVar);
    }

    /* renamed from: a */
    private boolean m37883a(C15340zq zqVar, C15340zq zqVar2) {
        C15340zq.C15344d dVar;
        T t;
        C15177xl xlVar;
        Sequence<C15177xl> sequence;
        Sequence<C15177xl> sequence2;
        boolean z;
        T t2;
        boolean z2;
        boolean z3 = false;
        TransitionSet transitionSet = null;
        if (zqVar == null) {
            dVar = null;
        } else {
            g10 f = mo68036f();
            Integer valueOf = f == null ? null : Integer.valueOf(f.mo67147b());
            int a = valueOf == null ? C12914dr.m35420a(zqVar) : valueOf.intValue();
            Iterator<T> it = zqVar.f43288c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                if (((C15340zq.C15344d) t2).f43297b == a) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            dVar = (C15340zq.C15344d) t2;
        }
        g10 f2 = mo68036f();
        Integer valueOf2 = f2 == null ? null : Integer.valueOf(f2.mo67147b());
        int a2 = valueOf2 == null ? C12914dr.m35420a(zqVar2) : valueOf2.intValue();
        Iterator<T> it2 = zqVar2.f43288c.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t = null;
                break;
            }
            t = it2.next();
            if (((C15340zq.C15344d) t).f43297b == a2) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C15340zq.C15344d dVar2 = (C15340zq.C15344d) t;
        setStateId$div_release(a2);
        if (dVar2 == null) {
            return false;
        }
        View a3 = m37877a(dVar2, a2, true);
        if (dVar != null) {
            m37881a(dVar);
        }
        m37885b(dVar2);
        if (zqVar != null && p00.m40630a(zqVar, mo66388b())) {
            z3 = true;
        }
        if (z3 || p00.m40630a(zqVar2, mo66388b())) {
            if (dVar == null) {
                xlVar = null;
            } else {
                xlVar = dVar.f43296a;
            }
            C15177xl xlVar2 = dVar2.f43296a;
            if (!Intrinsics.areEqual((Object) xlVar, (Object) xlVar2)) {
                m00 e = this.f35362c.mo66602e();
                if (xlVar == null) {
                    sequence = null;
                } else {
                    sequence = m37879a(zqVar, xlVar);
                }
                if (xlVar2 == null) {
                    sequence2 = null;
                } else {
                    sequence2 = m37879a(zqVar2, xlVar2);
                }
                TransitionSet a4 = e.mo68550a((Sequence<? extends C15177xl>) sequence, (Sequence<? extends C15177xl>) sequence2, mo66388b());
                if (a4.getTransitionCount() != 0) {
                    C12414ar f3 = this.f35361b.mo65808f();
                    Intrinsics.checkNotNullExpressionValue(f3, "div2Component.divDataChangeListener");
                    f3.mo65847b(this, zqVar2);
                    a4.addListener(new C13864lm(a4, f3, this, zqVar2));
                    transitionSet = a4;
                }
            }
            if (transitionSet != null) {
                Scene currentScene = Scene.getCurrentScene(this);
                if (currentScene != null) {
                    currentScene.setExitAction(new Runnable() {
                        public final void run() {
                            C13513jm.m37887c(C13513jm.this);
                        }
                    });
                }
                Scene scene = new Scene(this, a3);
                TransitionManager.endTransitions(this);
                TransitionManager.m28go(scene, transitionSet);
            } else {
                Intrinsics.checkNotNullParameter(this, "<this>");
                Intrinsics.checkNotNullParameter(this, "divView");
                for (View a5 : ViewGroupKt.getChildren(this)) {
                    i10.m37254a(mo68042m(), a5);
                }
                removeAllViews();
                addView(a3);
                this.f35362c.mo66601d().mo70992a(this, this.f35375p);
            }
        } else {
            Intrinsics.checkNotNullParameter(this, "<this>");
            Intrinsics.checkNotNullParameter(this, "divView");
            for (View a6 : ViewGroupKt.getChildren(this)) {
                i10.m37254a(mo68042m(), a6);
            }
            removeAllViews();
            addView(a3);
            this.f35362c.mo66601d().mo70992a(this, this.f35375p);
        }
        return true;
    }

    /* renamed from: a */
    public void mo66385a(int i, boolean z) {
        C15340zq.C15344d dVar;
        C15340zq.C15344d dVar2;
        List<C15340zq.C15344d> list;
        T t;
        boolean z2;
        List<C15340zq.C15344d> list2;
        T t2;
        boolean z3;
        if (i != -1) {
            setStateId$div_release(i);
            g10 f = mo68036f();
            C15177xl xlVar = null;
            Integer valueOf = f == null ? null : Integer.valueOf(f.mo67147b());
            C15340zq zqVar = this.f35377r;
            if (zqVar == null || (list2 = zqVar.f43288c) == null) {
                dVar = null;
            } else {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t2 = null;
                        break;
                    }
                    t2 = it.next();
                    int i2 = ((C15340zq.C15344d) t2).f43297b;
                    if (valueOf != null && i2 == valueOf.intValue()) {
                        z3 = true;
                        continue;
                    } else {
                        z3 = false;
                        continue;
                    }
                    if (z3) {
                        break;
                    }
                }
                dVar = (C15340zq.C15344d) t2;
            }
            C15340zq zqVar2 = this.f35377r;
            if (zqVar2 == null || (list = zqVar2.f43288c) == null) {
                dVar2 = null;
            } else {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it2.next();
                    if (((C15340zq.C15344d) t).f43297b == i) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        break;
                    }
                }
                dVar2 = (C15340zq.C15344d) t;
            }
            if (dVar2 != null) {
                if (dVar != null) {
                    m37881a(dVar);
                }
                m37885b(dVar2);
                C13338hp hpVar = C13338hp.f34501a;
                if (dVar != null) {
                    xlVar = dVar.f43296a;
                }
                if (hpVar.mo67586a(xlVar, dVar2.f43296a, mo66388b())) {
                    View childAt = getChildAt(0);
                    C14773uo l = this.f35361b.mo65814l();
                    Intrinsics.checkNotNullExpressionValue(childAt, "rootView");
                    l.mo70383a(childAt, dVar2.f43296a, this, new C14729ty(i, new ArrayList()));
                    this.f35361b.mo65807e().mo69834a(this.f35375p, i, z);
                } else {
                    Intrinsics.checkNotNullParameter(this, "<this>");
                    Intrinsics.checkNotNullParameter(this, "divView");
                    for (View a : ViewGroupKt.getChildren(this)) {
                        i10.m37254a(mo68042m(), a);
                    }
                    removeAllViews();
                    addView(m37877a(dVar2, i, z));
                }
                this.f35361b.mo65814l().mo70382a();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r3 = r3.f43289d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private kotlin.sequences.Sequence<com.yandex.mobile.ads.impl.C15177xl> m37879a(com.yandex.mobile.ads.impl.C15340zq r3, com.yandex.mobile.ads.impl.C15177xl r4) {
        /*
            r2 = this;
            com.yandex.mobile.ads.impl.j50 r0 = r2.mo66388b()
            kotlin.collections.ArrayDeque r1 = new kotlin.collections.ArrayDeque
            r1.<init>()
            if (r3 != 0) goto L_0x000c
            goto L_0x0010
        L_0x000c:
            com.yandex.mobile.ads.impl.f50<com.yandex.mobile.ads.impl.o00> r3 = r3.f43289d
            if (r3 != 0) goto L_0x0012
        L_0x0010:
            r3 = 0
            goto L_0x0018
        L_0x0012:
            java.lang.Object r3 = r3.mo66924a((com.yandex.mobile.ads.impl.j50) r0)
            com.yandex.mobile.ads.impl.o00 r3 = (com.yandex.mobile.ads.impl.o00) r3
        L_0x0018:
            if (r3 != 0) goto L_0x001c
            com.yandex.mobile.ads.impl.o00 r3 = com.yandex.mobile.ads.impl.o00.NONE
        L_0x001c:
            r1.addLast(r3)
            com.yandex.mobile.ads.impl.q00 r3 = com.yandex.mobile.ads.impl.r00.m41463d(r4)
            com.yandex.mobile.ads.impl.jm$b r4 = new com.yandex.mobile.ads.impl.jm$b
            r4.<init>(r1, r0)
            com.yandex.mobile.ads.impl.q00 r3 = r3.mo69464a((kotlin.jvm.functions.Function1<? super com.yandex.mobile.ads.impl.C15177xl, java.lang.Boolean>) r4)
            com.yandex.mobile.ads.impl.jm$c r4 = new com.yandex.mobile.ads.impl.jm$c
            r4.<init>(r1)
            com.yandex.mobile.ads.impl.q00 r3 = r3.mo69465b((kotlin.jvm.functions.Function1<? super com.yandex.mobile.ads.impl.C15177xl, kotlin.Unit>) r4)
            com.yandex.mobile.ads.impl.jm$d r4 = new com.yandex.mobile.ads.impl.jm$d
            r4.<init>(r1)
            kotlin.sequences.Sequence r3 = kotlin.sequences.SequencesKt.filter(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13513jm.m37879a(com.yandex.mobile.ads.impl.zq, com.yandex.mobile.ads.impl.xl):kotlin.sequences.Sequence");
    }

    /* renamed from: a */
    public void mo68029a(mx0 mx0) {
        Intrinsics.checkNotNullParameter(mx0, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f35365f.add(mx0);
    }

    /* renamed from: a */
    public void mo66387a(String str) {
        Intrinsics.checkNotNullParameter(str, "tooltipId");
        m37889n().mo67139b(str, this);
    }

    /* renamed from: a */
    public void mo68027a(View view, C15177xl xlVar) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(xlVar, "div");
        this.f35367h.put(view, xlVar);
    }

    /* renamed from: a */
    public C15177xl mo68026a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return this.f35367h.remove(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m37882a(C15340zq zqVar, boolean z) {
        boolean z2;
        try {
            if (getChildCount() == 0) {
                m37886b(zqVar, this.f35375p);
                return;
            }
            C14107nm j = m37888j();
            if (j != null) {
                j.mo69057k();
            }
            T t = null;
            this.f35372m = null;
            Iterator<T> it = zqVar.f43288c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (((C15340zq.C15344d) next).f43297b == this.f35370k) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    t = next;
                    break;
                }
            }
            C15340zq.C15344d dVar = (C15340zq.C15344d) t;
            if (dVar == null) {
                dVar = zqVar.f43288c.get(0);
            }
            View childAt = getChildAt(0);
            Intrinsics.checkNotNullExpressionValue(childAt, "");
            C14175ob.m40339a(childAt, dVar.f43296a.mo70911b(), mo66388b());
            setDivData$div_release(zqVar);
            C14773uo l = this.f35361b.mo65814l();
            Intrinsics.checkNotNullExpressionValue(childAt, "rootDivView");
            l.mo70383a(childAt, dVar.f43296a, this, new C14729ty(this.f35370k, new ArrayList()));
            requestLayout();
            if (z) {
                this.f35361b.mo65813k().mo69453a(this);
            }
            C14107nm j2 = m37888j();
            if (j2 != null) {
                j2.mo69056j();
            }
        } catch (Exception unused) {
            m37886b(zqVar, this.f35375p);
        }
    }

    /* renamed from: a */
    public void mo68030a(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "function");
        this.f35368i.mo68057a(function0);
    }
}
