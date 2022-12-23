package com.yandex.mobile.ads.impl;

import androidx.core.view.OneShotPreDrawListener;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.xy */
public class C15219xy {

    /* renamed from: a */
    private final C13513jm f42710a;

    /* renamed from: b */
    private final List<Transition> f42711b = new ArrayList();

    /* renamed from: c */
    private boolean f42712c;

    @Inject
    public C15219xy(C13513jm jmVar) {
        Intrinsics.checkNotNullParameter(jmVar, "div2View");
        this.f42710a = jmVar;
    }

    /* renamed from: a */
    public void mo70949a(Transition transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.f42711b.add(transition);
        if (!this.f42712c) {
            C13513jm jmVar = this.f42710a;
            Intrinsics.checkNotNullExpressionValue(OneShotPreDrawListener.add(jmVar, new C15121wy(jmVar, this)), "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
            this.f42712c = true;
        }
    }

    /* renamed from: b */
    public List<Integer> mo70950b() {
        List<Transition> list = this.f42711b;
        ArrayList arrayList = new ArrayList();
        for (Transition transition : list) {
            Intrinsics.checkNotNullParameter(transition, "<this>");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.addLast(transition);
            while (!arrayDeque.isEmpty()) {
                Transition transition2 = (Transition) arrayDeque.removeFirst();
                if (transition2 instanceof TransitionSet) {
                    TransitionSet transitionSet = (TransitionSet) transition2;
                    int transitionCount = transitionSet.getTransitionCount();
                    int i = 0;
                    while (i < transitionCount) {
                        int i2 = i + 1;
                        Transition transitionAt = transitionSet.getTransitionAt(i);
                        if (transitionAt != null) {
                            arrayDeque.addLast(transitionAt);
                        }
                        i = i2;
                    }
                }
                List<Integer> targetIds = transition2.getTargetIds();
                Intrinsics.checkNotNullExpressionValue(targetIds, "transition.targetIds");
                linkedHashSet.addAll(targetIds);
            }
            CollectionsKt.addAll(arrayList, CollectionsKt.toList(linkedHashSet));
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo70948a() {
        this.f42711b.clear();
    }
}
