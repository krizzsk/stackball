package com.yandex.mobile.ads.impl;

import androidx.transition.Transition;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

final class df1 implements Transition.TransitionListener {

    /* renamed from: a */
    private final Function0<Unit> f32562a;

    public df1(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "func");
        this.f32562a = function0;
    }

    public void onTransitionCancel(Transition transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
    }

    public void onTransitionEnd(Transition transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.f32562a.invoke();
    }

    public void onTransitionPause(Transition transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
    }

    public void onTransitionResume(Transition transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
    }

    public void onTransitionStart(Transition transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
    }
}
