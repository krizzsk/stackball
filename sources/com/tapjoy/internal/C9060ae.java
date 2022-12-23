package com.tapjoy.internal;

import android.view.animation.Animation;
import android.view.animation.AnimationSet;

/* renamed from: com.tapjoy.internal.ae */
public final class C9060ae extends C9057ad {

    /* renamed from: b */
    private final AnimationSet f22326b = ((AnimationSet) this.f22319a);

    public C9060ae() {
        super(new AnimationSet(true));
    }

    /* renamed from: a */
    public final C9060ae mo57753a(Animation animation) {
        this.f22326b.addAnimation(animation);
        return this;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Animation mo57751a() {
        return this.f22326b;
    }
}
