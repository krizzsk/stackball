package com.inmobi.media;

import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.inmobi.media.C5149eb;
import java.io.File;
import java.io.IOException;

/* renamed from: com.inmobi.media.dz */
/* compiled from: AnimatedDrawable */
public final class C5142dz implements C5149eb {

    /* renamed from: a */
    AnimatedImageDrawable f11806a;

    /* renamed from: b */
    private C5149eb.C5150a f11807b;

    /* renamed from: a */
    public final void mo40421a(boolean z) {
    }

    /* renamed from: e */
    public final void mo40425e() {
    }

    public C5142dz(String str) throws IOException {
        this.f11806a = (AnimatedImageDrawable) ImageDecoder.decodeDrawable(ImageDecoder.createSource(new File(str)));
    }

    /* renamed from: a */
    public final void mo40418a() {
        this.f11806a.registerAnimationCallback(new Animatable2.AnimationCallback() {
            public final void onAnimationStart(Drawable drawable) {
                super.onAnimationStart(drawable);
            }

            public final void onAnimationEnd(Drawable drawable) {
                super.onAnimationEnd(drawable);
                C5142dz.this.f11806a.start();
            }
        });
        this.f11806a.start();
    }

    /* renamed from: b */
    public final int mo40422b() {
        return this.f11806a.getIntrinsicWidth();
    }

    /* renamed from: c */
    public final int mo40423c() {
        return this.f11806a.getIntrinsicHeight();
    }

    /* renamed from: a */
    public final void mo40419a(Canvas canvas, float f, float f2) {
        canvas.translate(f, f2);
        this.f11806a.draw(canvas);
    }

    /* renamed from: d */
    public final boolean mo40424d() {
        return this.f11806a.isRunning();
    }

    /* renamed from: a */
    public final void mo40420a(C5149eb.C5150a aVar) {
        this.f11807b = aVar;
    }
}
