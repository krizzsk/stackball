package com.yandex.mobile.ads.impl;

import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.bn */
final class C12598bn extends Lambda implements Function2<View, MotionEvent, Unit> {

    /* renamed from: b */
    final /* synthetic */ Animation f31373b;

    /* renamed from: c */
    final /* synthetic */ Animation f31374c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C12598bn(Animation animation, Animation animation2) {
        super(2);
        this.f31373b = animation;
        this.f31374c = animation2;
    }

    public Object invoke(Object obj, Object obj2) {
        Animation animation;
        View view = (View) obj;
        MotionEvent motionEvent = (MotionEvent) obj2;
        Intrinsics.checkNotNullParameter(view, "v");
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        if (view.isEnabled() && view.isClickable() && view.hasOnClickListeners()) {
            int action = motionEvent.getAction();
            if (action == 0) {
                Animation animation2 = this.f31373b;
                if (animation2 != null) {
                    view.startAnimation(animation2);
                }
            } else if ((action == 1 || action == 3) && (animation = this.f31374c) != null) {
                view.startAnimation(animation);
            }
        }
        return Unit.INSTANCE;
    }
}
