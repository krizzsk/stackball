package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.transition.ChangeBounds;
import androidx.transition.TransitionManager;
import com.yandex.mobile.ads.impl.C15177xl;
import com.yandex.mobile.ads.impl.C15340zq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.fu */
public final class C13139fu implements C14855uy {

    /* renamed from: a */
    private final C13513jm f33743a;

    /* renamed from: b */
    private final C14773uo f33744b;

    /* renamed from: c */
    private final C15219xy f33745c;

    /* renamed from: d */
    private final C14327py f33746d;

    @Inject
    public C13139fu(C13513jm jmVar, C14773uo uoVar, C15219xy xyVar, C14327py pyVar) {
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        Intrinsics.checkNotNullParameter(uoVar, "divBinder");
        Intrinsics.checkNotNullParameter(xyVar, "transitionHolder");
        Intrinsics.checkNotNullParameter(pyVar, "stateChangeListener");
        this.f33743a = jmVar;
        this.f33744b = uoVar;
        this.f33745c = xyVar;
        this.f33746d = pyVar;
    }

    /* renamed from: a */
    public void mo67083a(C15340zq.C15344d dVar, List<C14729ty> list, boolean z) {
        T t;
        T tyVar;
        C15340zq.C15344d dVar2 = dVar;
        Intrinsics.checkNotNullParameter(dVar2, "state");
        Intrinsics.checkNotNullParameter(list, "paths");
        View childAt = this.f33743a.getChildAt(0);
        C15177xl xlVar = dVar2.f43296a;
        T tyVar2 = new C14729ty(dVar2.f43297b, new ArrayList());
        int size = list.size();
        C15177xl.C15190m mVar = null;
        if (size == 0) {
            t = tyVar2;
        } else if (size != 1) {
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                T next = it.next();
                while (it.hasNext()) {
                    C14729ty tyVar3 = (C14729ty) it.next();
                    C14729ty tyVar4 = (C14729ty) next;
                    Intrinsics.checkNotNullParameter(tyVar4, "somePath");
                    Intrinsics.checkNotNullParameter(tyVar3, "otherPath");
                    if (tyVar4.mo70249d() != tyVar3.mo70249d()) {
                        next = null;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = tyVar4.f40524b.iterator();
                        int i = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                tyVar = new C14729ty(tyVar4.mo70249d(), arrayList);
                                break;
                            }
                            Object next2 = it2.next();
                            int i2 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            Pair pair = (Pair) next2;
                            Pair pair2 = (Pair) CollectionsKt.getOrNull(tyVar3.f40524b, i);
                            if (pair2 == null || !Intrinsics.areEqual((Object) pair, (Object) pair2)) {
                                tyVar = new C14729ty(tyVar4.mo70249d(), arrayList);
                            } else {
                                arrayList.add(pair);
                                i = i2;
                            }
                        }
                        tyVar = new C14729ty(tyVar4.mo70249d(), arrayList);
                        next = tyVar;
                    }
                    if (next == null) {
                        next = tyVar2;
                    }
                }
                t = (C14729ty) next;
            } else {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
        } else {
            t = (C14729ty) CollectionsKt.first(list);
        }
        if (!t.mo70250e()) {
            C13451iw iwVar = C13451iw.f35055a;
            Intrinsics.checkNotNullExpressionValue(childAt, "rootView");
            C14429qy a = iwVar.mo67896a(childAt, (C14729ty) t);
            C15177xl a2 = iwVar.mo67897a(xlVar, (C14729ty) t);
            if (a2 instanceof C15177xl.C15190m) {
                mVar = (C15177xl.C15190m) a2;
            }
            if (!(a == null || mVar == null)) {
                tyVar2 = t;
                childAt = a;
                xlVar = mVar;
            }
        }
        C14773uo uoVar = this.f33744b;
        Intrinsics.checkNotNullExpressionValue(childAt, "view");
        uoVar.mo70383a(childAt, xlVar, this.f33743a, tyVar2.mo70252f());
        if (z) {
            List<Integer> b = this.f33745c.mo70950b();
            ChangeBounds changeBounds = new ChangeBounds();
            Iterator it3 = ((ArrayList) b).iterator();
            while (it3.hasNext()) {
                changeBounds.excludeTarget(((Number) it3.next()).intValue(), true);
            }
            TransitionManager.endTransitions(this.f33743a);
            TransitionManager.beginDelayedTransition(this.f33743a, changeBounds);
            m36316a(true);
        }
        this.f33745c.mo70948a();
        this.f33744b.mo70382a();
    }

    /* renamed from: a */
    private final void m36316a(boolean z) {
        try {
            this.f33746d.mo69453a(this.f33743a);
        } catch (IllegalStateException unused) {
            if (z) {
                this.f33743a.post(new Runnable() {
                    public final void run() {
                        C13139fu.m36315a(C13139fu.this);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m36315a(C13139fu fuVar) {
        Intrinsics.checkNotNullParameter(fuVar, "this$0");
        fuVar.m36316a(false);
    }
}
