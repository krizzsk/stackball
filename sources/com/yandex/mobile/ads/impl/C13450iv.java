package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.transition.ChangeBounds;
import androidx.transition.TransitionManager;
import com.yandex.mobile.ads.impl.C15177xl;
import com.yandex.mobile.ads.impl.C15340zq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.iv */
public final class C13450iv implements C14855uy {

    /* renamed from: a */
    private final C13513jm f35041a;

    /* renamed from: b */
    private final C14773uo f35042b;

    /* renamed from: c */
    private final C15219xy f35043c;

    /* renamed from: d */
    private final C14327py f35044d;

    @Inject
    public C13450iv(C13513jm jmVar, C14773uo uoVar, C15219xy xyVar, C14327py pyVar) {
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        Intrinsics.checkNotNullParameter(uoVar, "divBinder");
        Intrinsics.checkNotNullParameter(xyVar, "transitionHolder");
        Intrinsics.checkNotNullParameter(pyVar, "stateChangeListener");
        this.f35041a = jmVar;
        this.f35042b = uoVar;
        this.f35043c = xyVar;
        this.f35044d = pyVar;
    }

    /* renamed from: a */
    public void mo67083a(C15340zq.C15344d dVar, List<C14729ty> list, boolean z) {
        List list2;
        Intrinsics.checkNotNullParameter(dVar, "state");
        Intrinsics.checkNotNullParameter(list, "paths");
        View childAt = this.f35041a.getChildAt(0);
        C15177xl xlVar = dVar.f43296a;
        if (!list.isEmpty()) {
            List<C14729ty> sortedWith = CollectionsKt.sortedWith(list, C14729ty.f40522c.mo70255a());
            Object first = CollectionsKt.first(sortedWith);
            int collectionSizeOrDefault = CollectionsKt.collectionSizeOrDefault(sortedWith, 9);
            if (collectionSizeOrDefault == 0) {
                list2 = CollectionsKt.listOf(first);
            } else {
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault + 1);
                arrayList.add(first);
                C14729ty tyVar = first;
                for (C14729ty tyVar2 : sortedWith) {
                    C14729ty tyVar3 = (C14729ty) tyVar;
                    C14729ty tyVar4 = tyVar3.mo70247b(tyVar2) ? tyVar3 : tyVar2;
                    arrayList.add(tyVar4);
                    tyVar = tyVar4;
                }
                list2 = arrayList;
            }
            list = CollectionsKt.distinct(list2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (T next : list) {
            if (!((C14729ty) next).mo70250e()) {
                arrayList2.add(next);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C14729ty tyVar5 = (C14729ty) it.next();
            C13451iw iwVar = C13451iw.f35055a;
            Intrinsics.checkNotNullExpressionValue(childAt, "rootView");
            C14429qy a = iwVar.mo67896a(childAt, tyVar5);
            C15177xl a2 = iwVar.mo67897a(xlVar, tyVar5);
            C15177xl.C15190m mVar = a2 instanceof C15177xl.C15190m ? (C15177xl.C15190m) a2 : null;
            if (!(a == null || mVar == null || linkedHashSet.contains(a))) {
                this.f35042b.mo70383a(a, mVar, this.f35041a, tyVar5.mo70252f());
                linkedHashSet.add(a);
            }
        }
        if (linkedHashSet.isEmpty()) {
            C14773uo uoVar = this.f35042b;
            Intrinsics.checkNotNullExpressionValue(childAt, "rootView");
            uoVar.mo70383a(childAt, xlVar, this.f35041a, new C14729ty(dVar.f43297b, new ArrayList()));
        }
        if (z) {
            List<Integer> b = this.f35043c.mo70950b();
            ChangeBounds changeBounds = new ChangeBounds();
            Iterator it2 = ((ArrayList) b).iterator();
            while (it2.hasNext()) {
                changeBounds.excludeTarget(((Number) it2.next()).intValue(), true);
            }
            TransitionManager.endTransitions(this.f35041a);
            TransitionManager.beginDelayedTransition(this.f35041a, changeBounds);
            m37588a(true);
        }
        this.f35043c.mo70948a();
        this.f35042b.mo70382a();
    }

    /* renamed from: a */
    private final void m37588a(boolean z) {
        try {
            this.f35044d.mo69453a(this.f35041a);
        } catch (IllegalStateException unused) {
            if (z) {
                this.f35041a.post(new Runnable() {
                    public final void run() {
                        C13450iv.m37587a(C13450iv.this);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m37587a(C13450iv ivVar) {
        Intrinsics.checkNotNullParameter(ivVar, "this$0");
        ivVar.m37588a(false);
    }
}
