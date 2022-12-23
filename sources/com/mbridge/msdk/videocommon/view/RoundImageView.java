package com.mbridge.msdk.videocommon.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.widget.MBImageView;

public class RoundImageView extends MBImageView {

    /* renamed from: a */
    private int f18055a;

    /* renamed from: b */
    private int f18056b;

    /* renamed from: c */
    private Paint f18057c;

    /* renamed from: d */
    private int f18058d;

    /* renamed from: e */
    private Matrix f18059e = new Matrix();

    /* renamed from: f */
    private BitmapShader f18060f;

    /* renamed from: g */
    private int f18061g;

    /* renamed from: h */
    private RectF f18062h;

    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.f18057c = paint;
        paint.setAntiAlias(true);
        this.f18056b = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f18055a = 1;
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f18057c = paint;
        paint.setAntiAlias(true);
        this.f18056b = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f18055a = 1;
    }

    public RoundImageView(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f18057c = paint;
        paint.setAntiAlias(true);
        this.f18056b = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f18055a = 1;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f18055a == 0) {
            int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.f18061g = min;
            this.f18058d = min / 2;
            setMeasuredDimension(min, min);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        if (getDrawable() != null) {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                drawable.draw(canvas2);
                this.f18060f = new BitmapShader(createBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                int i = this.f18055a;
                float f2 = 1.0f;
                if (i == 0) {
                    int min = Math.min(createBitmap.getWidth(), createBitmap.getHeight());
                    int i2 = this.f18061g;
                    float f3 = (float) min;
                    float f4 = (((float) i2) * 1.0f) / f3;
                    f = (((float) i2) * 1.0f) / f3;
                    f2 = f4;
                } else if (i == 1) {
                    float min2 = Math.min((((float) getWidth()) * 1.0f) / ((float) createBitmap.getWidth()), 1.0f);
                    f2 = min2;
                    f = Math.min((((float) getHeight()) * 1.0f) / ((float) createBitmap.getHeight()), 1.0f);
                } else {
                    f = 1.0f;
                }
                this.f18059e.setScale(f2, f);
                this.f18060f.setLocalMatrix(this.f18059e);
                this.f18057c.setShader(this.f18060f);
            }
            if (this.f18055a == 1) {
                RectF rectF = this.f18062h;
                int i3 = this.f18056b;
                canvas.drawRoundRect(rectF, (float) i3, (float) i3, this.f18057c);
                return;
            }
            int i4 = this.f18058d;
            canvas.drawCircle((float) i4, (float) i4, (float) i4, this.f18057c);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f18055a == 1) {
            this.f18062h = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_instance", super.onSaveInstanceState());
        bundle.putInt("state_type", this.f18055a);
        bundle.putInt("state_border_radius", this.f18056b);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("state_instance"));
            this.f18055a = bundle.getInt("state_type");
            this.f18056b = bundle.getInt("state_border_radius");
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void setBorderRadius(int i) {
        int b = C6366u.m16203b(getContext(), (float) i);
        if (this.f18056b != b) {
            this.f18056b = b;
            invalidate();
        }
    }

    public void setType(int i) {
        if (this.f18055a != i) {
            this.f18055a = i;
            if (!(i == 1 || i == 0)) {
                this.f18055a = 0;
            }
            requestLayout();
        }
    }
}
