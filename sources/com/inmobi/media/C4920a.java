package com.inmobi.media;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: com.inmobi.media.a */
/* compiled from: AnimationController */
final class C4920a {

    /* renamed from: com.inmobi.media.a$a */
    /* compiled from: AnimationController */
    static class C4921a extends Animation {

        /* renamed from: a */
        private final float f11116a = 0.0f;

        /* renamed from: b */
        private final float f11117b = 90.0f;

        /* renamed from: c */
        private final float f11118c;

        /* renamed from: d */
        private final float f11119d;

        /* renamed from: e */
        private final float f11120e;

        /* renamed from: f */
        private final boolean f11121f;

        /* renamed from: g */
        private Camera f11122g;

        C4921a(float f, float f2) {
            this.f11118c = f;
            this.f11119d = f2;
            this.f11120e = 0.0f;
            this.f11121f = true;
        }

        public final void initialize(int i, int i2, int i3, int i4) {
            super.initialize(i, i2, i3, i4);
            this.f11122g = new Camera();
        }

        /* access modifiers changed from: protected */
        public final void applyTransformation(float f, Transformation transformation) {
            float f2 = this.f11116a;
            float f3 = f2 + ((this.f11117b - f2) * f);
            float f4 = this.f11118c;
            float f5 = this.f11119d;
            Camera camera = this.f11122g;
            Matrix matrix = transformation.getMatrix();
            camera.save();
            if (this.f11121f) {
                camera.translate(0.0f, 0.0f, this.f11120e * f);
            } else {
                camera.translate(0.0f, 0.0f, this.f11120e * (1.0f - f));
            }
            camera.rotateX(f3);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f4, -f5);
            matrix.postTranslate(f4, f5);
        }
    }

    /* renamed from: com.inmobi.media.a$b */
    /* compiled from: AnimationController */
    static class C4922b extends Animation {

        /* renamed from: a */
        private final float f11123a = 0.0f;

        /* renamed from: b */
        private final float f11124b = 90.0f;

        /* renamed from: c */
        private final float f11125c;

        /* renamed from: d */
        private final float f11126d;

        /* renamed from: e */
        private final float f11127e;

        /* renamed from: f */
        private final boolean f11128f;

        /* renamed from: g */
        private Camera f11129g;

        C4922b(float f, float f2) {
            this.f11125c = f;
            this.f11126d = f2;
            this.f11127e = 0.0f;
            this.f11128f = true;
        }

        public final void initialize(int i, int i2, int i3, int i4) {
            super.initialize(i, i2, i3, i4);
            this.f11129g = new Camera();
        }

        /* access modifiers changed from: protected */
        public final void applyTransformation(float f, Transformation transformation) {
            float f2 = this.f11123a;
            float f3 = f2 + ((this.f11124b - f2) * f);
            float f4 = this.f11125c;
            float f5 = this.f11126d;
            Camera camera = this.f11129g;
            Matrix matrix = transformation.getMatrix();
            camera.save();
            if (this.f11128f) {
                camera.translate(0.0f, 0.0f, this.f11127e * f);
            } else {
                camera.translate(0.0f, 0.0f, this.f11127e * (1.0f - f));
            }
            camera.rotateY(f3);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f4, -f5);
            matrix.postTranslate(f4, f5);
        }
    }
}
