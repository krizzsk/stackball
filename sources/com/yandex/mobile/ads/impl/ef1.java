package com.yandex.mobile.ads.impl;

import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import kotlin.jvm.internal.Intrinsics;

public final class ef1 {
    /* renamed from: a */
    public static final void m35649a(TransitionSet transitionSet, Iterable<? extends Transition> iterable) {
        Intrinsics.checkNotNullParameter(transitionSet, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "transitions");
        for (Transition addTransition : iterable) {
            transitionSet.addTransition(addTransition);
        }
    }
}
