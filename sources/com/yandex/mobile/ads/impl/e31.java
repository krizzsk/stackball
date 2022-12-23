package com.yandex.mobile.ads.impl;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;

public class e31 implements C15236y7<View> {

    /* renamed from: a */
    private final int f32892a;

    /* renamed from: b */
    private final C14393ql f32893b = new C14393ql();

    /* renamed from: c */
    private final AnimatorSet f32894c = new AnimatorSet();

    public e31(int i, long j) {
        this.f32892a = i;
    }

    /* renamed from: a */
    public void mo66393a(View view) {
        Context context = view.getContext();
        long j = (long) (((float) 400) * 0.3f);
        view.setTranslationY((float) this.f32893b.mo69618a(context, (float) this.f32892a));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{-((float) this.f32893b.mo69618a(context, 5.0f))});
        ofFloat.setDuration(400 - j);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{0.0f});
        ofFloat2.setDuration(j);
        this.f32894c.play(ofFloat).before(ofFloat2);
        this.f32894c.play(ofFloat2);
        this.f32894c.start();
    }

    /* renamed from: a */
    public void mo66392a() {
        this.f32894c.cancel();
    }
}
