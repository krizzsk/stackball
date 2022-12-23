package com.inmobi.media;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import androidx.core.view.ViewCompat;

/* renamed from: com.inmobi.media.ca */
/* compiled from: CustomView */
public class C5041ca extends View {

    /* renamed from: a */
    private static final String f11508a = C5041ca.class.getSimpleName();

    /* renamed from: b */
    private float f11509b;

    /* renamed from: c */
    private float f11510c;

    /* renamed from: d */
    private float f11511d;

    /* renamed from: e */
    private float f11512e;

    /* renamed from: f */
    private float f11513f;

    /* renamed from: g */
    private byte f11514g;

    /* renamed from: h */
    private int f11515h;

    /* renamed from: i */
    private Paint f11516i;

    /* renamed from: j */
    private Path f11517j;

    /* renamed from: k */
    private RectF f11518k;

    private C5041ca(Context context) {
        super(context);
    }

    public C5041ca(Context context, float f, byte b) {
        this(context);
        this.f11514g = b;
        this.f11509b = f;
        this.f11515h = 15;
        this.f11516i = new Paint(1);
        this.f11518k = new RectF();
        this.f11517j = new Path();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        this.f11516i.reset();
        switch (this.f11514g) {
            case 0:
                float f = this.f11509b;
                float f2 = (50.0f * f) / 2.0f;
                float f3 = (f * 30.0f) / 2.0f;
                float f4 = f3 / 3.0f;
                float f5 = f2 - f4;
                float f6 = f2 + f4;
                this.f11516i.setAntiAlias(true);
                this.f11516i.setColor(ViewCompat.MEASURED_STATE_MASK);
                this.f11516i.setStrokeWidth(3.0f);
                this.f11516i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas2.drawCircle(f2, f2, f3, this.f11516i);
                this.f11516i.setColor(-1);
                this.f11516i.setStyle(Paint.Style.STROKE);
                Canvas canvas3 = canvas;
                float f7 = f5;
                float f8 = f6;
                canvas3.drawLine(f7, f5, f8, f6, this.f11516i);
                canvas3.drawLine(f7, f6, f8, f5, this.f11516i);
                canvas2.drawCircle(f2, f2, f3, this.f11516i);
                return;
            case 1:
                float f9 = (this.f11509b * 50.0f) / 2.0f;
                this.f11516i.setAntiAlias(true);
                this.f11516i.setColor(0);
                this.f11516i.setStrokeWidth(3.0f);
                this.f11516i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas2.drawCircle(f9, f9, f9, this.f11516i);
                return;
            case 2:
                this.f11516i.setAntiAlias(true);
                this.f11516i.setColor(-1);
                this.f11516i.setStrokeWidth(5.0f);
                this.f11516i.setStyle(Paint.Style.STROKE);
                Canvas canvas4 = canvas;
                canvas4.drawLine(((float) (getWidth() / 2)) - ((((float) this.f11515h) * this.f11509b) / 2.0f), ((float) (getHeight() / 2)) - ((((float) this.f11515h) * this.f11509b) / 2.0f), ((((float) this.f11515h) * this.f11509b) / 2.0f) + ((float) (getWidth() / 2)), ((((float) this.f11515h) * this.f11509b) / 2.0f) + ((float) (getHeight() / 2)), this.f11516i);
                Canvas canvas5 = canvas;
                canvas5.drawLine(((float) (getWidth() / 2)) - ((((float) this.f11515h) * this.f11509b) / 2.0f), ((((float) this.f11515h) * this.f11509b) / 2.0f) + ((float) (getHeight() / 2)), ((((float) this.f11515h) * this.f11509b) / 2.0f) + ((float) (getWidth() / 2)), ((float) (getHeight() / 2)) - ((((float) this.f11515h) * this.f11509b) / 2.0f), this.f11516i);
                return;
            case 3:
                float f10 = this.f11509b;
                float f11 = (50.0f * f10) / 2.0f;
                float f12 = (f10 * 30.0f) / 2.0f;
                this.f11517j.reset();
                this.f11516i.setAntiAlias(true);
                this.f11516i.setColor(ViewCompat.MEASURED_STATE_MASK);
                this.f11516i.setStrokeWidth(3.0f);
                this.f11516i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas2.drawCircle(f11, f11, f12, this.f11516i);
                this.f11516i.setColor(-1);
                this.f11516i.setStyle(Paint.Style.STROKE);
                canvas2.drawCircle(f11, f11, f12, this.f11516i);
                this.f11518k.set(((float) (getWidth() / 2)) - ((((float) this.f11515h) * this.f11509b) / 2.0f), ((float) (getHeight() / 2)) - ((((float) this.f11515h) * this.f11509b) / 2.0f), ((float) (getWidth() / 2)) + ((((float) this.f11515h) * this.f11509b) / 2.0f), ((float) (getHeight() / 2)) + ((((float) this.f11515h) * this.f11509b) / 2.0f));
                canvas.drawArc(this.f11518k, 0.0f, 270.0f, false, this.f11516i);
                this.f11517j.setFillType(Path.FillType.EVEN_ODD);
                this.f11517j.moveTo(((float) (getWidth() / 2)) + ((((float) this.f11515h) * this.f11509b) / 2.0f), ((float) (getHeight() / 2)) - (this.f11509b * 2.0f));
                Path path = this.f11517j;
                float f13 = this.f11509b;
                path.lineTo((((float) (getWidth() / 2)) + ((((float) this.f11515h) * f13) / 2.0f)) - (f13 * 2.0f), (float) (getHeight() / 2));
                Path path2 = this.f11517j;
                float f14 = this.f11509b;
                path2.lineTo(((float) (getWidth() / 2)) + ((((float) this.f11515h) * f14) / 2.0f) + (f14 * 2.0f), (float) (getHeight() / 2));
                this.f11517j.lineTo(((float) (getWidth() / 2)) + ((((float) this.f11515h) * this.f11509b) / 2.0f), ((float) (getHeight() / 2)) - (this.f11509b * 2.0f));
                this.f11517j.close();
                this.f11516i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas2.drawPath(this.f11517j, this.f11516i);
                return;
            case 4:
                this.f11517j.reset();
                this.f11517j.setFillType(Path.FillType.EVEN_ODD);
                this.f11517j.moveTo(((float) (getWidth() / 2)) - ((((float) this.f11515h) * this.f11509b) / 2.0f), (float) (getHeight() / 2));
                this.f11517j.lineTo(((float) (getWidth() / 2)) + ((((float) this.f11515h) * this.f11509b) / 2.0f), ((float) (getHeight() / 2)) - ((((float) this.f11515h) * this.f11509b) / 2.0f));
                this.f11517j.lineTo(((float) (getWidth() / 2)) + ((((float) this.f11515h) * this.f11509b) / 2.0f), ((float) (getHeight() / 2)) + ((((float) this.f11515h) * this.f11509b) / 2.0f));
                this.f11517j.lineTo(((float) (getWidth() / 2)) - ((((float) this.f11515h) * this.f11509b) / 2.0f), (float) (getHeight() / 2));
                this.f11517j.close();
                this.f11516i.setAntiAlias(true);
                this.f11516i.setColor(ViewCompat.MEASURED_STATE_MASK);
                this.f11516i.setStrokeWidth(3.0f);
                this.f11516i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas2.drawPath(this.f11517j, this.f11516i);
                return;
            case 5:
                this.f11517j.reset();
                this.f11517j.setFillType(Path.FillType.EVEN_ODD);
                this.f11517j.moveTo(((float) (getWidth() / 2)) - ((((float) this.f11515h) * this.f11509b) / 2.0f), ((float) (getHeight() / 2)) - ((((float) this.f11515h) * this.f11509b) / 2.0f));
                this.f11517j.lineTo(((float) (getWidth() / 2)) + ((((float) this.f11515h) * this.f11509b) / 2.0f), (float) (getHeight() / 2));
                this.f11517j.lineTo(((float) (getWidth() / 2)) - ((((float) this.f11515h) * this.f11509b) / 2.0f), ((float) (getHeight() / 2)) + ((((float) this.f11515h) * this.f11509b) / 2.0f));
                this.f11517j.lineTo(((float) (getWidth() / 2)) - ((((float) this.f11515h) * this.f11509b) / 2.0f), ((float) (getHeight() / 2)) - ((((float) this.f11515h) * this.f11509b) / 2.0f));
                this.f11517j.close();
                this.f11516i.setAntiAlias(true);
                this.f11516i.setColor(ViewCompat.MEASURED_STATE_MASK);
                this.f11516i.setStrokeWidth(3.0f);
                this.f11516i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas2.drawPath(this.f11517j, this.f11516i);
                return;
            case 6:
                this.f11517j.reset();
                this.f11517j.setFillType(Path.FillType.EVEN_ODD);
                this.f11517j.moveTo(((float) (getWidth() / 2)) - ((((float) this.f11515h) * this.f11509b) / 2.0f), ((float) (getHeight() / 2)) - ((((float) this.f11515h) * this.f11509b) / 2.0f));
                this.f11517j.lineTo(((float) (getWidth() / 2)) + ((((float) this.f11515h) * this.f11509b) / 2.0f), (float) (getHeight() / 2));
                this.f11517j.lineTo(((float) (getWidth() / 2)) - ((((float) this.f11515h) * this.f11509b) / 2.0f), ((float) (getHeight() / 2)) + ((((float) this.f11515h) * this.f11509b) / 2.0f));
                this.f11517j.lineTo(((float) (getWidth() / 2)) - ((((float) this.f11515h) * this.f11509b) / 2.0f), ((float) (getHeight() / 2)) - ((((float) this.f11515h) * this.f11509b) / 2.0f));
                this.f11517j.close();
                this.f11516i.setAntiAlias(true);
                this.f11516i.setColor(-12303292);
                this.f11516i.setStrokeWidth(3.0f);
                this.f11516i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas2.drawPath(this.f11517j, this.f11516i);
                return;
            case 7:
                m11468b(canvas);
                float f15 = this.f11513f;
                this.f11510c = f15 / 3.0f;
                this.f11511d = f15 / 3.0f;
                this.f11516i.setStyle(Paint.Style.FILL);
                Path path3 = this.f11517j;
                float f16 = this.f11512e;
                path3.moveTo(this.f11510c + f16, f16);
                Path path4 = this.f11517j;
                float f17 = this.f11512e;
                path4.lineTo(f17 - this.f11510c, f17 - this.f11511d);
                Path path5 = this.f11517j;
                float f18 = this.f11512e;
                path5.lineTo(f18 - this.f11510c, f18 + this.f11511d);
                Path path6 = this.f11517j;
                float f19 = this.f11512e;
                path6.lineTo(this.f11510c + f19, f19);
                canvas2.drawPath(this.f11517j, this.f11516i);
                return;
            case 8:
                m11468b(canvas);
                float f20 = this.f11513f;
                float f21 = f20 / 4.0f;
                this.f11510c = f21;
                float f22 = f20 / 3.0f;
                this.f11511d = f22;
                float f23 = this.f11512e;
                canvas.drawLine(f23 - f21, f23 - f22, f23 - f21, f23 + f22, this.f11516i);
                float f24 = this.f11512e;
                float f25 = this.f11510c;
                float f26 = this.f11511d;
                canvas.drawLine(f24 + f25, f24 - f26, f24 + f25, f24 + f26, this.f11516i);
                return;
            case 9:
                m11467a(canvas);
                float f27 = this.f11512e;
                float f28 = this.f11509b;
                float f29 = this.f11511d;
                RectF rectF = new RectF(f27 - (f28 * 10.0f), (f27 - f29) - (f28 * 2.0f), (14.0f * f28) + f27, f27 + f29 + (f28 * 2.0f));
                float f30 = this.f11512e;
                float f31 = this.f11509b;
                float f32 = this.f11511d;
                RectF rectF2 = new RectF(f30 - (10.0f * f31), (f30 - f32) - (f31 * 4.0f), (18.0f * f31) + f30, f30 + f32 + (f31 * 4.0f));
                this.f11516i.setColor(-1);
                this.f11516i.setStrokeWidth(4.0f);
                this.f11516i.setStyle(Paint.Style.STROKE);
                Canvas canvas6 = canvas;
                canvas6.drawArc(rectF, -45.0f, 90.0f, false, this.f11516i);
                canvas6.drawArc(rectF2, -45.0f, 90.0f, false, this.f11516i);
                canvas2.drawPath(this.f11517j, this.f11516i);
                canvas2.drawPath(this.f11517j, this.f11516i);
                return;
            case 11:
                m11467a(canvas);
                this.f11516i.setColor(-1);
                this.f11516i.setStrokeWidth(4.0f);
                this.f11516i.setStyle(Paint.Style.STROKE);
                Path path7 = this.f11517j;
                float f33 = this.f11512e;
                path7.moveTo((this.f11509b * 10.0f) + f33, f33 - this.f11511d);
                Path path8 = this.f11517j;
                float f34 = this.f11512e;
                path8.lineTo((this.f11509b * 18.0f) + f34, f34 + this.f11511d);
                Path path9 = this.f11517j;
                float f35 = this.f11512e;
                path9.moveTo((this.f11509b * 18.0f) + f35, f35 - this.f11511d);
                Path path10 = this.f11517j;
                float f36 = this.f11512e;
                path10.lineTo((this.f11509b * 10.0f) + f36, f36 + this.f11511d);
                canvas2.drawPath(this.f11517j, this.f11516i);
                return;
            case 12:
                float f37 = this.f11509b;
                this.f11512e = (50.0f * f37) / 2.0f;
                this.f11510c = f37 * 3.0f;
                this.f11511d = f37 * 3.0f;
                this.f11516i.setStyle(Paint.Style.STROKE);
                this.f11516i.setStrokeWidth(4.0f);
                this.f11516i.setColor(-1);
                Path path11 = this.f11517j;
                float f38 = this.f11512e;
                path11.moveTo(f38 - this.f11510c, (f38 - this.f11511d) - (this.f11509b * 5.0f));
                Path path12 = this.f11517j;
                float f39 = this.f11512e;
                path12.lineTo(f39 - this.f11510c, f39 - this.f11511d);
                Path path13 = this.f11517j;
                float f40 = this.f11512e;
                path13.lineTo((f40 - this.f11510c) - (this.f11509b * 5.0f), f40 - this.f11511d);
                Path path14 = this.f11517j;
                float f41 = this.f11512e;
                path14.moveTo(this.f11510c + f41, (f41 - this.f11511d) - (this.f11509b * 5.0f));
                Path path15 = this.f11517j;
                float f42 = this.f11512e;
                path15.lineTo(this.f11510c + f42, f42 - this.f11511d);
                Path path16 = this.f11517j;
                float f43 = this.f11512e;
                path16.lineTo(this.f11510c + f43 + (this.f11509b * 5.0f), f43 - this.f11511d);
                Path path17 = this.f11517j;
                float f44 = this.f11512e;
                path17.moveTo(f44 - this.f11510c, f44 + this.f11511d + (this.f11509b * 5.0f));
                Path path18 = this.f11517j;
                float f45 = this.f11512e;
                path18.lineTo(f45 - this.f11510c, f45 + this.f11511d);
                Path path19 = this.f11517j;
                float f46 = this.f11512e;
                path19.lineTo((f46 - this.f11510c) - (this.f11509b * 5.0f), f46 + this.f11511d);
                Path path20 = this.f11517j;
                float f47 = this.f11512e;
                path20.moveTo(this.f11510c + f47, f47 + this.f11511d + (this.f11509b * 5.0f));
                Path path21 = this.f11517j;
                float f48 = this.f11512e;
                path21.lineTo(this.f11510c + f48, f48 + this.f11511d);
                Path path22 = this.f11517j;
                float f49 = this.f11512e;
                path22.lineTo(this.f11510c + f49 + (this.f11509b * 5.0f), f49 + this.f11511d);
                canvas2.drawPath(this.f11517j, this.f11516i);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private void m11467a(Canvas canvas) {
        float f = this.f11509b;
        this.f11512e = ((30.0f * f) / 2.0f) - (f * 5.0f);
        this.f11510c = f * 5.0f;
        this.f11511d = f * 5.0f;
        this.f11516i.setStyle(Paint.Style.FILL);
        this.f11516i.setColor(-1);
        this.f11516i.setStrokeWidth(4.0f);
        this.f11516i.setAntiAlias(true);
        Path path = this.f11517j;
        float f2 = this.f11512e;
        path.moveTo(f2 - this.f11510c, f2 - this.f11511d);
        Path path2 = this.f11517j;
        float f3 = this.f11512e;
        path2.lineTo(f3, f3 - this.f11511d);
        Path path3 = this.f11517j;
        float f4 = this.f11512e;
        float f5 = this.f11509b;
        path3.lineTo((f5 * 6.0f) + f4, (f4 - this.f11511d) - (f5 * 4.0f));
        Path path4 = this.f11517j;
        float f6 = this.f11512e;
        float f7 = this.f11509b;
        path4.lineTo((6.0f * f7) + f6, f6 + this.f11511d + (f7 * 4.0f));
        Path path5 = this.f11517j;
        float f8 = this.f11512e;
        path5.lineTo(f8, this.f11511d + f8);
        Path path6 = this.f11517j;
        float f9 = this.f11512e;
        path6.lineTo(f9 - this.f11510c, f9 + this.f11511d);
        Path path7 = this.f11517j;
        float f10 = this.f11512e;
        path7.lineTo(f10 - this.f11510c, f10 - this.f11511d);
        canvas.drawPath(this.f11517j, this.f11516i);
    }

    /* renamed from: b */
    private void m11468b(Canvas canvas) {
        float f = this.f11509b;
        this.f11513f = 25.0f * f;
        this.f11512e = f * 30.0f;
        this.f11516i.setAntiAlias(true);
        this.f11516i.setColor(-1);
        this.f11516i.setStrokeWidth(7.0f);
        this.f11516i.setStyle(Paint.Style.STROKE);
        float f2 = this.f11512e;
        canvas.drawCircle(f2, f2, this.f11513f, this.f11516i);
    }
}
