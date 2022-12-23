package com.yandex.mobile.ads.impl;

import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.lm */
public final class C13864lm extends TransitionListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ Transition f36746a;

    /* renamed from: b */
    final /* synthetic */ C12414ar f36747b;

    /* renamed from: c */
    final /* synthetic */ C13513jm f36748c;

    /* renamed from: d */
    final /* synthetic */ C15340zq f36749d;

    public C13864lm(Transition transition, C12414ar arVar, C13513jm jmVar, C15340zq zqVar) {
        this.f36746a = transition;
        this.f36747b = arVar;
        this.f36748c = jmVar;
        this.f36749d = zqVar;
    }

    public void onTransitionEnd(Transition transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.f36747b.mo65846a(this.f36748c, this.f36749d);
        this.f36746a.removeListener(this);
    }
}
