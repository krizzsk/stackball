package com.mbridge.msdk.video.dynview.p225f;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* renamed from: com.mbridge.msdk.video.dynview.f.a */
/* compiled from: BackgroundDrawable */
public final class C6956a extends ShapeDrawable {

    /* renamed from: a */
    private int f17145a;

    /* renamed from: b */
    private float f17146b;

    /* renamed from: c */
    private float f17147c;

    /* renamed from: d */
    private int f17148d;

    /* renamed from: e */
    private int f17149e;

    /* renamed from: f */
    private Bitmap f17150f;

    /* renamed from: g */
    private Bitmap f17151g;

    /* renamed from: h */
    private Paint f17152h;

    /* renamed from: com.mbridge.msdk.video.dynview.f.a$b */
    /* compiled from: BackgroundDrawable */
    public interface C6959b {
        /* renamed from: a */
        C6959b mo48463a(float f);

        /* renamed from: a */
        C6959b mo48465a(Bitmap bitmap);

        /* renamed from: a */
        C6956a mo48466a();

        /* renamed from: b */
        C6959b mo48467b(float f);

        /* renamed from: b */
        C6959b mo48468b(Bitmap bitmap);
    }

    public final int getOpacity() {
        return -3;
    }

    private C6956a(C6958a aVar) {
        super(aVar.f17153a);
        this.f17150f = aVar.f17154b;
        this.f17151g = aVar.f17155c;
        this.f17145a = aVar.f17156d;
        this.f17148d = aVar.f17157e;
        this.f17149e = aVar.f17158f;
        this.f17146b = aVar.f17159g;
        this.f17147c = aVar.f17160h;
        Paint paint = new Paint();
        this.f17152h = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f17152h.setAntiAlias(true);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f17145a == 1) {
            float f = this.f17147c / 2.0f;
            Path path = new Path();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, (((float) this.f17148d) + f) - ((float) this.f17149e));
            path.lineTo(this.f17146b, (f - ((float) this.f17148d)) - ((float) this.f17149e));
            path.lineTo(this.f17146b, 0.0f);
            Bitmap bitmap = this.f17150f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    m17541a(canvas, path, this.f17150f);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Path path2 = new Path();
            path2.moveTo(0.0f, ((float) this.f17148d) + f + ((float) this.f17149e));
            path2.lineTo(0.0f, this.f17147c);
            path2.lineTo(this.f17146b, this.f17147c);
            path2.lineTo(this.f17146b, (f - ((float) this.f17148d)) + ((float) this.f17149e));
            Bitmap bitmap2 = this.f17151g;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                try {
                    m17541a(canvas, path2, this.f17151g);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } else {
            float f2 = this.f17146b / 2.0f;
            Path path3 = new Path();
            path3.moveTo(0.0f, 0.0f);
            path3.lineTo(0.0f, this.f17147c);
            path3.lineTo((f2 - ((float) this.f17148d)) - ((float) this.f17149e), this.f17147c);
            path3.lineTo((((float) this.f17148d) + f2) - ((float) this.f17149e), 0.0f);
            Bitmap bitmap3 = this.f17150f;
            if (bitmap3 != null && !bitmap3.isRecycled()) {
                try {
                    m17541a(canvas, path3, this.f17150f);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            Path path4 = new Path();
            path4.moveTo(((float) this.f17148d) + f2 + ((float) this.f17149e), 0.0f);
            path4.lineTo(this.f17146b, 0.0f);
            path4.lineTo(this.f17146b, this.f17147c);
            path4.lineTo((f2 - ((float) this.f17148d)) + ((float) this.f17149e), this.f17147c);
            Bitmap bitmap4 = this.f17151g;
            if (bitmap4 != null && !bitmap4.isRecycled()) {
                try {
                    m17541a(canvas, path4, this.f17151g);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    private void m17541a(Canvas canvas, Path path, Bitmap bitmap) {
        this.f17152h.setShader(new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas.drawPath(path, this.f17152h);
    }

    /* renamed from: a */
    public static C6958a m17540a() {
        return new C6958a();
    }

    /* renamed from: com.mbridge.msdk.video.dynview.f.a$a */
    /* compiled from: BackgroundDrawable */
    public static class C6958a implements C6959b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public RectShape f17153a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Bitmap f17154b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Bitmap f17155c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f17156d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f17157e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f17158f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public float f17159g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public float f17160h;

        private C6958a() {
            this.f17157e = 100;
            this.f17158f = 10;
            this.f17153a = new RectShape();
        }

        /* renamed from: a */
        public final C6959b mo48465a(Bitmap bitmap) {
            this.f17154b = bitmap;
            return this;
        }

        /* renamed from: b */
        public final C6959b mo48468b(Bitmap bitmap) {
            this.f17155c = bitmap;
            return this;
        }

        /* renamed from: a */
        public final C6959b mo48464a(int i) {
            this.f17156d = i;
            return this;
        }

        /* renamed from: a */
        public final C6959b mo48463a(float f) {
            this.f17159g = f;
            return this;
        }

        /* renamed from: b */
        public final C6959b mo48467b(float f) {
            this.f17160h = f;
            return this;
        }

        /* renamed from: a */
        public final C6956a mo48466a() {
            return new C6956a(this);
        }
    }
}
