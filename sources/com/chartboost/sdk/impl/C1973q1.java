package com.chartboost.sdk.impl;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: com.chartboost.sdk.impl.q1 */
public final class C1973q1 extends Animation {

    /* renamed from: a */
    private final float f5074a;

    /* renamed from: b */
    private final float f5075b;

    /* renamed from: c */
    private final float f5076c;

    /* renamed from: d */
    private final float f5077d;

    /* renamed from: e */
    private boolean f5078e = true;

    /* renamed from: f */
    private Camera f5079f;

    public C1973q1(float f, float f2, float f3, float f4, boolean z) {
        this.f5074a = f;
        this.f5075b = f2;
        this.f5076c = f3;
        this.f5077d = f4;
        this.f5078e = z;
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        float f2 = this.f5074a;
        float f3 = f2 + ((this.f5075b - f2) * f);
        Camera camera = this.f5079f;
        Matrix matrix = transformation.getMatrix();
        camera.save();
        if (this.f5078e) {
            camera.rotateY(f3);
        } else {
            camera.rotateX(f3);
        }
        camera.getMatrix(matrix);
        camera.restore();
        matrix.preTranslate(-this.f5076c, -this.f5077d);
        matrix.postTranslate(this.f5076c, this.f5077d);
    }

    public void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.f5079f = new Camera();
    }
}
