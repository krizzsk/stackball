package com.mbridge.msdk.interactiveads.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.mbridge.msdk.foundation.tools.C6347k;

public class MBCircleView extends View {

    /* renamed from: a */
    private Paint f15980a;

    /* renamed from: b */
    private float f15981b = 20.0f;

    /* renamed from: c */
    private float f15982c = 0.0f;

    /* renamed from: d */
    private float f15983d = 0.0f;

    /* renamed from: e */
    private float f15984e = 0.0f;

    /* renamed from: f */
    private float f15985f = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Animation f15986g;

    /* renamed from: h */
    private Runnable f15987h;

    public MBCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f15980a = paint;
        paint.setColor(-1);
        this.f15980a.setAntiAlias(true);
        this.f15980a.setDither(true);
        this.f15986g = AnimationUtils.loadAnimation(context, C6347k.m16084a(context, "mbridge_anim_scale", "anim"));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f15984e == 0.0f && this.f15985f == 0.0f) {
            this.f15984e = (float) getMeasuredWidth();
            this.f15985f = (float) getMeasuredHeight();
            this.f15982c = ((float) getLeft()) + (this.f15984e / 2.0f);
            this.f15983d = ((float) getTop()) + (this.f15985f / 2.0f);
            this.f15981b = this.f15984e / 2.0f;
        }
    }

    public void startAnimationDelay(long j) {
        if (this.f15986g != null) {
            if (this.f15987h == null) {
                this.f15987h = new Runnable() {
                    public final void run() {
                        MBCircleView.this.f15986g.startNow();
                    }
                };
            }
            this.f15986g.reset();
            this.f15986g.setStartOffset(200);
            setAnimation(this.f15986g);
            postDelayed(this.f15987h, j);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f15980a;
        if (paint != null) {
            canvas.drawCircle(this.f15982c, this.f15983d, this.f15981b, paint);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f15987h;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f15987h = null;
        }
        if (this.f15980a != null) {
            this.f15980a = null;
        }
        if (this.f15986g != null) {
            this.f15986g = null;
        }
    }
}
