package com.tapjoy.internal;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: com.tapjoy.internal.af */
public final class C9061af extends Animation {

    /* renamed from: a */
    private final boolean f22327a;

    /* renamed from: b */
    private final float f22328b;

    /* renamed from: c */
    private final float f22329c;

    /* renamed from: d */
    private final int f22330d;

    /* renamed from: e */
    private final float f22331e;

    /* renamed from: f */
    private final int f22332f;

    /* renamed from: g */
    private final float f22333g;

    /* renamed from: h */
    private float f22334h;

    /* renamed from: i */
    private float f22335i;

    /* renamed from: j */
    private Camera f22336j;

    public C9061af(boolean z, float f, float f2, int i, float f3, int i2, float f4) {
        this.f22327a = z;
        this.f22328b = f;
        this.f22329c = f2;
        this.f22330d = i;
        this.f22331e = f3;
        this.f22332f = i2;
        this.f22333g = f4;
    }

    public final void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.f22334h = resolveSize(this.f22330d, this.f22331e, i, i3);
        this.f22335i = resolveSize(this.f22332f, this.f22333g, i2, i4);
        this.f22336j = new Camera();
    }

    /* access modifiers changed from: protected */
    public final void applyTransformation(float f, Transformation transformation) {
        float f2 = this.f22328b;
        float f3 = f2 + ((this.f22329c - f2) * f);
        Matrix matrix = transformation.getMatrix();
        Camera camera = this.f22336j;
        camera.save();
        if (this.f22327a) {
            camera.rotateX(f3);
        } else {
            camera.rotateY(f3);
        }
        camera.getMatrix(matrix);
        camera.restore();
        float f4 = this.f22334h;
        float f5 = this.f22335i;
        matrix.preTranslate(-f4, -f5);
        matrix.postTranslate(f4, f5);
    }
}
